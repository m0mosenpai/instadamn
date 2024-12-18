package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.ImmutablePandoLocationDict;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.LocationDictIntf;

/* loaded from: classes7.dex */
public final class HSa extends C17T implements InterfaceC38481qc {
    @Override // X.InterfaceC38481qc
    public final LocationDictIntf BON() {
        return (LocationDictIntf) A05(-1797083648, ImmutablePandoLocationDict.class);
    }

    @Override // X.InterfaceC38481qc
    public final MultiAuthorStoryType CBY() {
        return (MultiAuthorStoryType) A0N(3575610, C43267JAm.A00);
    }

    @Override // X.InterfaceC38481qc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40207HsW.A00(this));
    }

    @Override // X.InterfaceC38481qc
    public final String getPk() {
        return A0h(3579);
    }

    @Override // X.InterfaceC38481qc
    public final String Amu() {
        return A0i(112359031);
    }

    @Override // X.InterfaceC38481qc
    public final Float BM8() {
        return A0K(106911);
    }

    @Override // X.InterfaceC38481qc
    public final Float BO9() {
        return A0K(107301);
    }

    @Override // X.InterfaceC38481qc
    public final ImageUrl Bhu() {
        return A0A(1782139044);
    }

    @Override // X.InterfaceC38481qc
    public final String Bhw() {
        return A0i(899464897);
    }

    @Override // X.InterfaceC38481qc
    public final C38471qb Ez2() {
        LocationDict locationDict;
        String A0i = A0i(112359031);
        Float A0K = A0K(106911);
        Float A0K2 = A0K(107301);
        LocationDictIntf BON = BON();
        if (BON != null) {
            locationDict = BON.F6g();
        } else {
            locationDict = null;
        }
        String A0W = A0W();
        String A0h = A0h(3579);
        return new C38471qb(CBY(), A0A(1782139044), locationDict, A0K, A0K2, A0i, A0W, A0h, A0i(899464897), A0i(1565793390));
    }

    @Override // X.InterfaceC38481qc
    public final String getName() {
        return A0W();
    }

    @Override // X.InterfaceC38481qc
    public final String getShortName() {
        return A0i(1565793390);
    }
}
