package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.List;

/* renamed from: X.H2i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38697H2i extends C0T6 implements JKB {
    public final IntentAwareAdsInfo A00;
    public final List A01;

    @Override // X.JKB
    public final C38697H2i Es1(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38697H2i) {
                C38697H2i c38697H2i = (C38697H2i) obj;
                if (!C14360o3.A0K(this.A00, c38697H2i.A00) || !C14360o3.A0K(this.A01, c38697H2i.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKB
    public final /* bridge */ /* synthetic */ IntentAwareAdsInfoIntf BIo() {
        return this.A00;
    }

    @Override // X.JKB
    public final List BVF() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C38697H2i(IntentAwareAdsInfo intentAwareAdsInfo, List list) {
        AbstractC167017dG.A1P(intentAwareAdsInfo, list);
        this.A00 = intentAwareAdsInfo;
        this.A01 = list;
    }

    @Override // X.JKB
    public final JKB E8r(C1DY c1dy) {
        return this;
    }
}
