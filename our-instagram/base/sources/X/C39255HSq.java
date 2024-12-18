package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;

/* renamed from: X.HSq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39255HSq extends C17T implements InterfaceC38601qq {
    public InterfaceC43555JLp A00;
    public C38321qM A01;

    @Override // X.InterfaceC38601qq
    public final InterfaceC43555JLp Api() {
        InterfaceC43555JLp interfaceC43555JLp = this.A00;
        if (interfaceC43555JLp == null) {
            return (InterfaceC43555JLp) A05(-943461556, HO8.class);
        }
        return interfaceC43555JLp;
    }

    @Override // X.InterfaceC38601qq
    public final C38321qM BQN() {
        return this.A01;
    }

    @Override // X.InterfaceC38601qq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40235Hsy.A00(this));
    }

    @Override // X.InterfaceC38601qq
    public final Long BF7() {
        return AbstractC37303Gc4.A0P(this);
    }

    @Override // X.InterfaceC38601qq
    public final String BWb() {
        return A0i(-1594628439);
    }

    @Override // X.InterfaceC38601qq
    public final String CAR() {
        return AbstractC37304Gc5.A0f(this);
    }

    @Override // X.InterfaceC38601qq
    public final InterfaceC38601qq E9p(C1DY c1dy) {
        InterfaceC43555JLp Api = Api();
        if (Api != null) {
            Api.E8t(c1dy);
        } else {
            Api = null;
        }
        this.A00 = Api;
        this.A01 = AbstractC37304Gc5.A0D(c1dy, this, 103772132);
        return this;
    }

    @Override // X.InterfaceC38601qq
    public final C38591qp EzQ(C1DY c1dy) {
        C38708H2u c38708H2u;
        InterfaceC43555JLp Api = Api();
        C38321qM c38321qM = null;
        if (Api != null) {
            c38708H2u = Api.EsT(c1dy);
        } else {
            c38708H2u = null;
        }
        String A0h = AbstractC37304Gc5.A0h(this);
        Long A0P = AbstractC37303Gc4.A0P(this);
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(103772132, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            C38801rC c38801rC = C38321qM.A0h;
            C38321qM A00 = C38801rC.A00(c1dy, immutablePandoMediaDict);
            if (A00 != null) {
                c38321qM = (C38321qM) c1dy.A00(A00);
            }
        }
        return new C38591qp(c38708H2u, c38321qM, A0P, A0h, A0i(-1594628439), A0U(), A0Y(), AbstractC37304Gc5.A0f(this));
    }

    @Override // X.InterfaceC38601qq
    public final String getCtaText() {
        return AbstractC37304Gc5.A0h(this);
    }

    @Override // X.InterfaceC38601qq
    public final String getSubtitle() {
        return A0U();
    }

    @Override // X.InterfaceC38601qq
    public final String getTitle() {
        return A0Y();
    }
}
