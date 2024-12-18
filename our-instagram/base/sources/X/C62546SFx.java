package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.SFx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62546SFx {
    public final C62669SLg A00;
    public final C62952SYu A01;
    public final File A02;

    public C62546SFx(Context context, C62952SYu c62952SYu, InterfaceC65366Tiy interfaceC65366Tiy, String str, String str2) {
        this.A00 = new C62669SLg(new SBT(interfaceC65366Tiy), AnonymousClass001.A0g("725056107548211", "|", "0e20c3123a90c76c02c901b7415ff67f"), str2);
        File A00 = C0eS.A00(context, 343672752);
        A00.mkdirs();
        File A0w = MSW.A0w(A00, str);
        AbstractC58322PtE.A0f("mqtt_analytics.", str, context.getFilesDir()).renameTo(A0w);
        this.A02 = A0w;
        this.A01 = c62952SYu;
    }
}
