package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import java.io.File;

/* loaded from: classes8.dex */
public abstract class LJR {
    public static Intent A00(File file) {
        Intent intent = new Intent(AbstractC58317Pt9.A00(673), (android.net.Uri) null);
        intent.setType("image/*");
        if (file != null) {
            intent.putExtra("output", android.net.Uri.fromFile(file));
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.name());
        }
        return intent;
    }

    public static android.net.Uri A01(Intent intent, File file) {
        android.net.Uri data = intent.getData();
        if (data == null || data.toString().length() == 0) {
            return android.net.Uri.fromFile(file);
        }
        return data;
    }

    public static void A02(Activity activity, File file, int i) {
        C12260kU.A09(activity, Intent.createChooser(A00(file), activity.getResources().getString(2131954829)), i);
    }

    public static void A03(Fragment fragment, File file, int i) {
        C12260kU.A07(fragment, Intent.createChooser(A00(file), AbstractC166997dE.A0N(fragment).getString(2131954829)), i);
    }
}
