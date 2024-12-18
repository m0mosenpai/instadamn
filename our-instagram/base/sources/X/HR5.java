package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MetaGalleryAlbumType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HR5 extends C17T implements InterfaceC38281qI {
    @Override // X.InterfaceC38281qI
    public final List BR4() {
        return A08(222732020, HR6.class);
    }

    @Override // X.InterfaceC38281qI
    public final MetaGalleryAlbumType BTH() {
        return (MetaGalleryAlbumType) A0N(858099345, JAF.A00);
    }

    @Override // X.InterfaceC38281qI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40074Hq0.A00(this));
    }

    @Override // X.InterfaceC38281qI
    public final String Ah2() {
        return A0i(1253013930);
    }

    @Override // X.InterfaceC38281qI
    public final Integer Azn() {
        return getOptionalIntValueByHashCode(-478065615);
    }

    @Override // X.InterfaceC38281qI
    public final String BDG() {
        return A0i(1184148383);
    }

    @Override // X.InterfaceC38281qI
    public final List BRl() {
        return getOptionalStringListByHashCode(-1597522414);
    }

    @Override // X.InterfaceC38281qI
    public final String C93() {
        return A0i(-1773366604);
    }

    @Override // X.InterfaceC38281qI
    public final String C9N() {
        return A0i(224770025);
    }

    @Override // X.InterfaceC38281qI
    public final String CAR() {
        return AbstractC37304Gc5.A0f(this);
    }

    @Override // X.InterfaceC38281qI
    public final C38271qH Ewe() {
        ArrayList arrayList;
        String A0i = A0i(1253013930);
        String A0h = AbstractC37304Gc5.A0h(this);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-478065615);
        String A0i2 = A0i(1184148383);
        String A0e = A0e();
        List BR4 = BR4();
        if (BR4 != null) {
            arrayList = AbstractC167017dG.A0q(BR4);
            Iterator it = BR4.iterator();
            while (it.hasNext()) {
                arrayList.add(((JKP) it.next()).Ewf());
            }
        } else {
            arrayList = null;
        }
        return new C38271qH(BTH(), optionalIntValueByHashCode, A0i, A0h, A0i2, A0e, A0i(-1773366604), A0i(224770025), AbstractC37304Gc5.A0f(this), arrayList, getOptionalStringListByHashCode(-1597522414));
    }

    @Override // X.InterfaceC38281qI
    public final String getCtaText() {
        return AbstractC37304Gc5.A0h(this);
    }

    @Override // X.InterfaceC38281qI
    public final String getId() {
        return A0e();
    }
}
