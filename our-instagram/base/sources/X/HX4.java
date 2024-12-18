package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DropsEventPageNavigationMetadata;
import com.instagram.api.schemas.DropsEventPageNavigationMetadataImpl;
import com.instagram.api.schemas.ImmutablePandoDropsEventPageNavigationMetadata;
import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import com.instagram.model.shopping.drops.DropsLaunchAnimationIntf;
import com.instagram.model.shopping.drops.ImmutablePandoDropsLaunchAnimation;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductCollectionImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HX4 extends C17T implements InterfaceC43575JMj {
    public ProductCollection A00;

    @Override // X.InterfaceC43575JMj
    public final ProductCollection Ap9() {
        return AbstractC37303Gc4.A0H(this, this.A00);
    }

    @Override // X.InterfaceC43575JMj
    public final DropsLaunchAnimationIntf Azc() {
        return (DropsLaunchAnimationIntf) A05(461462899, ImmutablePandoDropsLaunchAnimation.class);
    }

    @Override // X.InterfaceC43575JMj
    public final DropsEventPageNavigationMetadata B2m() {
        return (DropsEventPageNavigationMetadata) A05(935996751, ImmutablePandoDropsEventPageNavigationMetadata.class);
    }

    @Override // X.InterfaceC43575JMj
    public final List C0p() {
        return A08(1531715286, HUA.class);
    }

    @Override // X.InterfaceC43575JMj
    public final InterfaceC43575JMj EBr(C1DY c1dy) {
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        if (A0H != null) {
            A0H.ECD(c1dy);
        } else {
            A0H = null;
        }
        this.A00 = A0H;
        return this;
    }

    @Override // X.InterfaceC43575JMj
    public final C38820H7m F6J(C1DY c1dy) {
        ProductCollectionImpl productCollectionImpl;
        DropsLaunchAnimation dropsLaunchAnimation;
        DropsEventPageNavigationMetadataImpl dropsEventPageNavigationMetadataImpl;
        ProductCollection A0H = AbstractC37303Gc4.A0H(this, this.A00);
        ArrayList arrayList = null;
        if (A0H != null) {
            productCollectionImpl = A0H.F7Q(c1dy);
        } else {
            productCollectionImpl = null;
        }
        DropsLaunchAnimationIntf Azc = Azc();
        if (Azc != null) {
            dropsLaunchAnimation = Azc.F62();
        } else {
            dropsLaunchAnimation = null;
        }
        DropsEventPageNavigationMetadata B2m = B2m();
        if (B2m != null) {
            dropsEventPageNavigationMetadataImpl = B2m.Et9();
        } else {
            dropsEventPageNavigationMetadataImpl = null;
        }
        String A0e = A0e();
        String A0f = A0f();
        String A0j = A0j(574223090);
        List C0p = C0p();
        if (C0p != null) {
            arrayList = AbstractC167017dG.A0q(C0p);
            Iterator it = C0p.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43490JJc) it.next()).F1i());
            }
        }
        return new C38820H7m(dropsEventPageNavigationMetadataImpl, dropsLaunchAnimation, productCollectionImpl, A0e, A0f, A0j, A0X(), A0i(-1064897719), AbstractC37303Gc4.A0V(this), A0i(1595179052), arrayList);
    }

    @Override // X.InterfaceC43575JMj
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I46.A00(this));
    }

    @Override // X.InterfaceC43575JMj
    public final String BSZ() {
        return A0j(574223090);
    }

    @Override // X.InterfaceC43575JMj
    public final String C6J() {
        return A0i(-1064897719);
    }

    @Override // X.InterfaceC43575JMj
    public final String CEu() {
        return A0i(1595179052);
    }

    @Override // X.InterfaceC43575JMj
    public final C38820H7m F6K(C1DV c1dv) {
        return F6J(AbstractC25235BEs.A0b(AbstractC37301Gc2.A08()));
    }

    @Override // X.InterfaceC43575JMj
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC43575JMj
    public final String getMediaId() {
        return A0f();
    }

    @Override // X.InterfaceC43575JMj
    public final String getText() {
        return A0X();
    }

    @Override // X.InterfaceC43575JMj
    public final String getUserId() {
        return AbstractC37303Gc4.A0V(this);
    }
}
