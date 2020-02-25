package langswap.fergal.com.langswap.tile;

import android.content.Intent;
import android.provider.Settings;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

public class LangSwapTileService extends TileService
{
    @Override
    public void onStartListening() {
        final Tile tile = getQsTile();
        tile.setLabel("Hot swap");
        tile.updateTile();
    }

    @Override
    public void onClick() {
        final Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
