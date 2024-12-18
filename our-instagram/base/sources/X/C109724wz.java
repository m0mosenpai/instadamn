package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.LiveUserPaySupportTier;

/* renamed from: X.4wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109724wz extends C0T6 implements InterfaceC109734x0 {
    public final long A00;
    public final LiveUserPaySupportTier A01;
    public final String A02;

    public C109724wz(LiveUserPaySupportTier liveUserPaySupportTier, String str, long j) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(liveUserPaySupportTier, 3);
        this.A00 = j;
        this.A02 = str;
        this.A01 = liveUserPaySupportTier;
    }

    @Override // X.InterfaceC109734x0
    public final C109724wz Ew3() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109724wz) {
                C109724wz c109724wz = (C109724wz) obj;
                if (this.A00 != c109724wz.A00 || !C14360o3.A0K(this.A02, c109724wz.A02) || this.A01 != c109724wz.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC109734x0
    public final long AxQ() {
        return this.A00;
    }

    @Override // X.InterfaceC109734x0
    public final String Bxk() {
        return this.A02;
    }

    @Override // X.InterfaceC109734x0
    public final LiveUserPaySupportTier C4A() {
        return this.A01;
    }

    @Override // X.InterfaceC109734x0
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayTierInfo", AbstractC53782NqY.A00(this));
    }

    public final int hashCode() {
        long j = this.A00;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }
}
