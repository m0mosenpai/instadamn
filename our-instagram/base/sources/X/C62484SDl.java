package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.SDl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62484SDl {
    public final C62952SYu A00;
    public final File A01;

    public C62484SDl(Context context, C62952SYu c62952SYu, String str) {
        File A00 = C0eS.A00(context, 343672752);
        A00.mkdirs();
        File A0w = MSW.A0w(A00, str);
        AbstractC58322PtE.A0f("mqtt_analytics.", str, context.getFilesDir()).renameTo(A0w);
        this.A01 = A0w;
        this.A00 = c62952SYu;
    }
}
