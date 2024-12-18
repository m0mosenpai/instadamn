package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CornerStyle;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HSr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39256HSr extends C17T implements InterfaceC102674k2 {
    public ProductDetailsProductItemDictIntf A00;

    @Override // X.InterfaceC102674k2
    public final List Abm() {
        return A08(-683992599, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC102674k2
    public final CornerStyle Aru() {
        return (CornerStyle) A0N(972889927, C43273JAs.A00);
    }

    @Override // X.InterfaceC102674k2
    public final List BJY() {
        return A08(1180716295, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC102674k2
    public final List BNi() {
        return A08(102977465, ImmutablePandoAndroidLink.class);
    }

    @Override // X.InterfaceC102674k2
    public final ProductDetailsProductItemDictIntf Bgl() {
        return AbstractC37303Gc4.A0I(this, this.A00);
    }

    @Override // X.InterfaceC102674k2
    public final InterfaceC102674k2 E9q(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0Q(c1dy, AbstractC37303Gc4.A0I(this, this.A00));
        return this;
    }

    @Override // X.InterfaceC102674k2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Ht0.A00(this));
    }

    @Override // X.InterfaceC102674k2
    public final String BhE() {
        return A0i(1014375387);
    }

    @Override // X.InterfaceC102674k2
    public final C102664k1 EzS(C1DY c1dy) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List Abm = Abm();
        ProductDetailsProductItemDict productDetailsProductItemDict = null;
        if (Abm != null) {
            arrayList = AbstractC167007dF.A0i(Abm);
            Iterator it = Abm.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        CornerStyle Aru = Aru();
        List BJY = BJY();
        if (BJY != null) {
            arrayList2 = AbstractC167007dF.A0i(BJY);
            Iterator it2 = BJY.iterator();
            while (it2.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList2, it2);
            }
        } else {
            arrayList2 = null;
        }
        List BNi = BNi();
        if (BNi != null) {
            arrayList3 = AbstractC167007dF.A0i(BNi);
            Iterator it3 = BNi.iterator();
            while (it3.hasNext()) {
                AbstractC37303Gc4.A1V(arrayList3, it3);
            }
        } else {
            arrayList3 = null;
        }
        ProductDetailsProductItemDictIntf A0I = AbstractC37303Gc4.A0I(this, this.A00);
        if (A0I != null) {
            productDetailsProductItemDict = A0I.F7S(c1dy);
        }
        return new C102664k1(Aru, productDetailsProductItemDict, A0i(1014375387), arrayList, arrayList2, arrayList3);
    }

    @Override // X.InterfaceC102674k2
    public final C102664k1 EzT(C1DV c1dv) {
        return EzS(AbstractC25235BEs.A0b(c1dv));
    }
}
