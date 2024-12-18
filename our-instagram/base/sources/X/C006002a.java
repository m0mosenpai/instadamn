package X;

import android.content.ClipData;
import android.os.Build;

/* renamed from: X.02a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C006002a {
    public final InterfaceC006102b A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.0ul] */
    public C006002a(C006302d c006302d) {
        C18060un c18060un;
        if (Build.VERSION.SDK_INT >= 31) {
            c18060un = new C18060un(c006302d);
        } else {
            ?? obj = new Object();
            InterfaceC006202c interfaceC006202c = c006302d.A00;
            obj.A02 = interfaceC006202c.Ao3();
            obj.A01 = interfaceC006202c.Byc();
            obj.A00 = interfaceC006202c.B6x();
            obj.A03 = interfaceC006202c.BNZ();
            obj.A04 = interfaceC006202c.getExtras();
            c18060un = obj;
        }
        this.A00 = c18060un;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.0ul] */
    public C006002a(ClipData clipData, int i) {
        C18060un c18060un;
        if (Build.VERSION.SDK_INT >= 31) {
            c18060un = new C18060un(clipData, i);
        } else {
            ?? obj = new Object();
            obj.A02 = clipData;
            obj.A01 = i;
            c18060un = obj;
        }
        this.A00 = c18060un;
    }
}
