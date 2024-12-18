package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import java.util.Map;

/* renamed from: X.Mxz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51963Mxz extends C1AF implements InterfaceC10260gi {
    public final long[][] A00;

    @Override // X.C1AF, X.C0U1
    public final Map B1E() {
        return null;
    }

    @Override // X.C1AF, X.C1A1
    public final double A01(double d, long j, boolean z) {
        long A01 = C0UM.A01(this.A00, j);
        if (A01 == 0) {
            return d;
        }
        return super.A01(d, A01, z);
    }

    @Override // X.C1AF, X.C1A1
    public final long A02(long j, long j2, boolean z) {
        long A01 = C0UM.A01(this.A00, j);
        if (A01 == 0) {
            return j2;
        }
        return super.A02(A01, j2, z);
    }

    @Override // X.C1AF, X.C1A1
    public final C0U5 A03(long j) {
        long A01 = C0UM.A01(this.A00, j);
        if (A01 == 0) {
            return new C0U5(MobileConfigValueSource.DEFAULT__INVALID_CONFIG_PARAM_NAME);
        }
        return super.A03(A01);
    }

    @Override // X.C1AF, X.C1A1
    public final String A04(String str, long j, boolean z) {
        long A01 = C0UM.A01(this.A00, j);
        if (A01 == 0) {
            return str;
        }
        return super.A04(str, A01, z);
    }

    @Override // X.C1AF, X.C1A1
    public final boolean A05(long j, boolean z, boolean z2) {
        long A01 = C0UM.A01(this.A00, j);
        if (A01 == 0) {
            return z;
        }
        return super.A05(A01, z, z2);
    }

    @Override // X.C1AF, X.C1A2
    public final String BOq(long j) {
        long A01 = C0UM.A01(this.A00, j);
        if (A01 == 0) {
            return null;
        }
        return super.BOq(A01);
    }

    @Override // X.C1AF, X.C1A2
    public final int BOv(long j) {
        long A01 = C0UM.A01(this.A00, j);
        if (A01 == 0) {
            return 0;
        }
        return super.BOv(A01);
    }

    public C51963Mxz(AbstractC226118l abstractC226118l, AbstractC225918h abstractC225918h, C0U0 c0u0, InterfaceC228919r interfaceC228919r, long[][] jArr) {
        super(abstractC226118l, abstractC225918h, c0u0, interfaceC228919r);
        this.A00 = jArr;
    }
}
