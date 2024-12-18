package X;

import com.instagram.feed.media.ImmutablePandoMediaDict;

/* renamed from: X.GnP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37982GnP extends C17T implements InterfaceC111044zG {
    public C38321qM A00;

    @Override // X.InterfaceC111044zG
    public final C38321qM BQN() {
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            return c38321qM;
        }
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'media' field.");
    }

    @Override // X.InterfaceC111044zG
    public final InterfaceC111044zG E8p(C1DY c1dy) {
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A04(103772132, ImmutablePandoMediaDict.class);
        C38801rC c38801rC = C38321qM.A0h;
        this.A00 = C38801rC.A00(c1dy, immutablePandoMediaDict);
        return this;
    }

    @Override // X.InterfaceC111044zG
    public final Integer CBl() {
        return getOptionalIntValueByHashCode(3575610);
    }

    @Override // X.InterfaceC111044zG
    public final C111034zF Erx(C1DY c1dy) {
        return new C111034zF((C38321qM) c1dy.A00(AbstractC37304Gc5.A0E(c1dy, this, 103772132)), getOptionalIntValueByHashCode(3575610));
    }
}
