package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.1Ro, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Ro {
    public final C26821Rs A00;
    public final C26801Rq A01;
    public final C26841Ru A02;
    public final C26851Rv A03;
    public final C26811Rr A04;

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0244, code lost:
    
        if (r11.A01 >= 63328846) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1TT A00() {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Ro.A00():X.1TT");
    }

    public final boolean A01(int i) {
        C1SI A00 = this.A00.A00();
        if (A00 != null && A00.A05 && A00.A00 >= i) {
            return true;
        }
        return false;
    }

    public C1Ro(Context context, PackageManager packageManager) {
        this.A01 = new C26801Rq(packageManager);
        this.A04 = new C26811Rr(packageManager);
        this.A00 = new C26821Rs(packageManager);
        this.A02 = new C26841Ru(context, packageManager);
        this.A03 = new C26851Rv(packageManager);
    }
}
