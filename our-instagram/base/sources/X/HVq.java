package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class HVq extends C17T implements C4GI {
    public User A00;

    @Override // X.C4GI
    public final User CDj() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'user' field.");
    }

    @Override // X.C4GI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37426Ge6.A00(this));
    }

    @Override // X.C4GI
    public final String getPk() {
        return A0k(3579);
    }

    @Override // X.C4GI
    public final String B8F() {
        return A0i(-811800516);
    }

    @Override // X.C4GI
    public final Boolean BPj() {
        return getOptionalBooleanValueByHashCode(-98602216);
    }

    @Override // X.C4GI
    public final Integer BXE() {
        return getOptionalIntValueByHashCode(546409413);
    }

    @Override // X.C4GI
    public final Integer Bgd() {
        return getOptionalIntValueByHashCode(1837239699);
    }

    @Override // X.C4GI
    public final List BxC() {
        return A0m(1501522776);
    }

    @Override // X.C4GI
    public final Boolean CXM() {
        return getOptionalBooleanValueByHashCode(-1428701633);
    }

    @Override // X.C4GI
    public final C4GI EBJ(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0P(c1dy, this, 3599307);
        return this;
    }

    @Override // X.C4GI
    public final C4GH F4Q(C1DY c1dy) {
        String A0i = A0i(-811800516);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1428701633);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-517184853);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-98602216);
        String A0a = A0a();
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(546409413);
        String A0k = A0k(3579);
        return new C4GH((User) AbstractC37303Gc4.A07(c1dy, this, 3599307), optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalIntValueByHashCode, getOptionalIntValueByHashCode(1837239699), A0i, A0a, A0k, A0i(1014577290), A0m(1501522776), booleanValueByHashCode);
    }

    @Override // X.C4GI
    public final String getMediaType() {
        return A0a();
    }

    @Override // X.C4GI
    public final String getProductType() {
        return A0i(1014577290);
    }

    @Override // X.C4GI
    public final boolean isPivotPageAvailable() {
        return getBooleanValueByHashCode(-517184853);
    }
}
