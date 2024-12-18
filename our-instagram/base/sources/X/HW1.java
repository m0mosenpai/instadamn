package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HW1 extends C17T implements InterfaceC1124155t {
    public JLE A00;
    public User A01;

    @Override // X.InterfaceC1124155t
    public final long BF4() {
        return A03(3355);
    }

    @Override // X.InterfaceC1124155t
    public final JLE BUE() {
        JLE jle = this.A00;
        if (jle == null) {
            return (JLE) A05(689572632, HW0.class);
        }
        return jle;
    }

    @Override // X.InterfaceC1124155t
    public final User Bah() {
        User user = this.A01;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'owner' field.");
    }

    @Override // X.InterfaceC1124155t
    public final GuideTypeStr CBT() {
        return (GuideTypeStr) A0M(3575610, JCR.A00);
    }

    @Override // X.InterfaceC1124155t
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I0E.A00(this));
    }

    @Override // X.InterfaceC1124155t
    public final boolean B63() {
        return getBooleanValueByHashCode(-1784166265);
    }

    @Override // X.InterfaceC1124155t
    public final int BXg() {
        return getIntValueByHashCode(1567799751);
    }

    @Override // X.InterfaceC1124155t
    public final long CDE() {
        return A03(747083410);
    }

    @Override // X.InterfaceC1124155t
    public final boolean CSj() {
        return getBooleanValueByHashCode(110813772);
    }

    @Override // X.InterfaceC1124155t
    public final InterfaceC1124155t EBS(C1DY c1dy) {
        JLE BUE = BUE();
        if (BUE != null) {
            BUE.EBR(c1dy);
        } else {
            BUE = null;
        }
        this.A00 = BUE;
        this.A01 = AbstractC37302Gc3.A0P(c1dy, this, 106164915);
        return this;
    }

    @Override // X.InterfaceC1124155t
    public final C1124055s F4j(C1DY c1dy) {
        H7P h7p;
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1051141294);
        String A0T = A0T();
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(-1784166265);
        long A03 = A03(3355);
        boolean booleanValueByHashCode3 = getBooleanValueByHashCode(110813772);
        JLE BUE = BUE();
        if (BUE != null) {
            h7p = BUE.F4h(c1dy);
        } else {
            h7p = null;
        }
        int intValueByHashCode = getIntValueByHashCode(1567799751);
        return new C1124055s(CBT(), h7p, (User) AbstractC37303Gc4.A07(c1dy, this, 106164915), A0T, A0Y(), intValueByHashCode, A03, A03(747083410), booleanValueByHashCode, booleanValueByHashCode2, booleanValueByHashCode3);
    }

    @Override // X.InterfaceC1124155t
    public final boolean getCanViewerReshare() {
        return getBooleanValueByHashCode(1051141294);
    }

    @Override // X.InterfaceC1124155t
    public final String getDescription() {
        return A0T();
    }

    @Override // X.InterfaceC1124155t
    public final String getTitle() {
        return A0Y();
    }
}
