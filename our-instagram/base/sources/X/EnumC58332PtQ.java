package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.PtQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC58332PtQ {
    ROOT_PATH(0, 157877869, false),
    FILES_PATH(1, 1672668047, true),
    CACHE_PATH(2, 1377433890, true),
    EXTERNAL_PATH(3, 0, false),
    EXTERNAL_FILES_PATH(4, 0, false),
    EXTERNAL_CACHE_PATH(5, 0, false);

    public final int A00;
    public final String A01;
    public final boolean A02;
    public static final File A04 = AbstractC166987dD.A11("/");
    public static final HashMap A03 = AbstractC166987dD.A1G();

    static {
        for (EnumC58332PtQ enumC58332PtQ : values()) {
            A03.put(enumC58332PtQ.A01, enumC58332PtQ);
        }
    }

    public final File A00(Context context) {
        S1H s1h = S1H.$redex_init_class;
        switch (this) {
            case ROOT_PATH:
                return A04;
            case FILES_PATH:
                return context.getFilesDir();
            case CACHE_PATH:
                return context.getCacheDir();
            case EXTERNAL_PATH:
                return Environment.getExternalStorageDirectory();
            case EXTERNAL_FILES_PATH:
                return context.getExternalFilesDir(null);
            case EXTERNAL_CACHE_PATH:
                return context.getExternalCacheDir();
            default:
                return null;
        }
    }

    EnumC58332PtQ(int i, int i2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = i2;
    }
}
