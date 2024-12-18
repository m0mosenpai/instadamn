package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.1So, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26931So extends C0R8 {
    public static final boolean A03;
    public final Context A00;
    public final AbstractC04410Lh A01;
    public final boolean A02;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "ContentProviderFixer";
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        }
        A03 = z;
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A02) {
            C0HU.A03(this.A01);
            C0HU.A02(this.A00, "activity");
            A08();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(2342157112320199067L)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26931So(X.C0Rw r3) {
        /*
            r2 = this;
            r2.<init>(r3)
            X.1Sp r0 = new X.1Sp
            r0.<init>()
            r2.A01 = r0
            X.0RK r3 = (X.C0RK) r3
            android.content.Context r0 = r3.A01
            r2.A00 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r0 = r2.A05(r0)
            if (r0 == 0) goto L37
            r0 = 36314103106636188(0x81037c0002099c, double:3.0285232575685326E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L37
            r0 = 2342157112320199067(0x2081037c0000099b, double:4.060585814773157E-152)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L38
        L37:
            r0 = 0
        L38:
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26931So.<init>(X.0Rw):void");
    }
}
