package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;

/* loaded from: classes11.dex */
public final class V96 extends C17T implements InterfaceC99384d8 {
    public C38321qM A00;

    @Override // X.InterfaceC99384d8
    public final C66642URg F4l(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return F4k(new C1DY(c1dv, 6, false));
    }

    @Override // X.InterfaceC99384d8
    public final C38321qM BPJ() {
        return this.A00;
    }

    @Override // X.InterfaceC99384d8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(VTF.A00(this), this);
    }

    @Override // X.InterfaceC99384d8
    public final String Apu() {
        return A0i(-527056974);
    }

    @Override // X.InterfaceC99384d8
    public final String Apv() {
        return A0i(841452833);
    }

    @Override // X.InterfaceC99384d8
    public final Integer BXl() {
        return getOptionalIntValueByHashCode(-386286130);
    }

    @Override // X.InterfaceC99384d8
    public final Boolean CXq() {
        return getOptionalBooleanValueByHashCode(-428695142);
    }

    @Override // X.InterfaceC99384d8
    public final Boolean CXr() {
        return getOptionalBooleanValueByHashCode(-1140034706);
    }

    @Override // X.InterfaceC99384d8
    public final Boolean Cfv() {
        return getOptionalBooleanValueByHashCode(986368786);
    }

    @Override // X.InterfaceC99384d8
    public final InterfaceC99384d8 EBT(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0D(c1dy, this, 407421635);
        return this;
    }

    @Override // X.InterfaceC99384d8
    public final C66642URg F4k(C1DY c1dy) {
        C38321qM c38321qM;
        String A0i = A0i(-527056974);
        String A0i2 = A0i(841452833);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-428695142);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1140034706);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(986368786);
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(407421635, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            C38801rC c38801rC = C38321qM.A0h;
            C38321qM A00 = C38801rC.A00(c1dy, immutablePandoMediaDict);
            if (A00 != null) {
                c38321qM = (C38321qM) c1dy.A00(A00);
                return new C66642URg(c38321qM, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, getOptionalIntValueByHashCode(-386286130), A0i, A0i2);
            }
        }
        c38321qM = null;
        return new C66642URg(c38321qM, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, getOptionalIntValueByHashCode(-386286130), A0i, A0i2);
    }
}
