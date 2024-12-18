package X;

import android.os.StatFs;
import com.instagram.common.session.UserSession;

/* renamed from: X.L9w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47814L9w {
    public final C3LC A00;
    public final C44101JeQ A01;
    public final KPO A02;
    public final InterfaceC09390do A03;
    public final InterfaceC16820sZ A04;
    public final UserSession A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;

    public final double A00() {
        Object invoke = this.A06.invoke();
        if (!C14360o3.A0K(invoke, "mounted") && !C14360o3.A0K(invoke, "mounted_ro")) {
            return 0.0d;
        }
        C14360o3.A0B((StatFs) this.A07.invoke(), 0);
        return (r1.getAvailableBlocksLong() * r1.getBlockSizeLong()) / 1.073741824E9d;
    }

    public final double A01() {
        StatFs statFs = (StatFs) this.A07.invoke();
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1.073741824E9d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        if (90.0d > X.C18U.A00(r5, r8, 37170807348658710L)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47814L9w.A02():boolean");
    }

    public C47814L9w(UserSession userSession, C3LC c3lc, KPO kpo, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        AbstractC43594JPz.A1P(interfaceC16820sZ, c3lc);
        C14360o3.A0B(interfaceC16820sZ3, 7);
        this.A05 = userSession;
        this.A04 = interfaceC16820sZ;
        this.A00 = c3lc;
        this.A02 = kpo;
        this.A07 = interfaceC16820sZ2;
        this.A06 = interfaceC16820sZ3;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50252MHh(this, 14));
        this.A01 = AbstractC46792Kmn.A00(userSession);
    }
}
