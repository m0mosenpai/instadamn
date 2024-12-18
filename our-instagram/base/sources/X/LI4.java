package X;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.util.List;

/* loaded from: classes8.dex */
public final class LI4 {
    public final android.net.Uri A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public static C1F3 A00(Context context) {
        return new L76(context, A01(2)).A00("ig_backup_code.jpg", "image/jpeg");
    }

    public LI4(int i, List list) {
        android.net.Uri uri;
        android.net.Uri uri2;
        String str = "image/*";
        if (i != 2) {
            str = "video/*";
            if (i != 3) {
                this.A02 = Environment.DIRECTORY_DOWNLOADS;
                if (Build.VERSION.SDK_INT >= 29) {
                    uri2 = MediaStore.Downloads.getContentUri("external_primary");
                } else {
                    uri2 = android.net.Uri.EMPTY;
                }
                this.A00 = uri2;
                this.A03 = list;
            }
            this.A02 = Environment.DIRECTORY_MOVIES;
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            this.A02 = Environment.DIRECTORY_PICTURES;
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        this.A00 = uri;
        this.A01 = str;
        this.A04 = true;
        this.A03 = list;
    }

    public static LI4 A01(int i) {
        return new LI4(i, AbstractC166987dD.A1E());
    }
}
