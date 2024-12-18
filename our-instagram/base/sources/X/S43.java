package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class S43 {
    public static final HashMap A00(C6FW c6fw) {
        Bitmap decodeFile;
        String path = AbstractC08820cl.A03(AbstractC31177DnL.A0d(c6fw)).getPath();
        if (path == null || (decodeFile = BitmapFactory.decodeFile(path)) == null) {
            return null;
        }
        int height = decodeFile.getHeight();
        int width = decodeFile.getWidth();
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(StatusBarModule.HEIGHT_KEY, Integer.valueOf(height));
        A1G.put("WIDTH", Integer.valueOf(width));
        return A1G;
    }
}
