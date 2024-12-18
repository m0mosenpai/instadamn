package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsRrFormatEnum;

/* loaded from: classes11.dex */
public final class V9B extends C17T implements InterfaceC105374p1 {
    @Override // X.InterfaceC105374p1
    public final InterfaceC72034XFw Arq() {
        return (InterfaceC72034XFw) A05(-753697424, C68050V8c.class);
    }

    @Override // X.InterfaceC105374p1
    public final XG1 BhZ() {
        return (XG1) A05(-1758768700, V9C.class);
    }

    @Override // X.InterfaceC105374p1
    public final IGAdsRrFormatEnum Bpl() {
        return (IGAdsRrFormatEnum) A0N(-1634771242, X60.A00);
    }

    @Override // X.InterfaceC105374p1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC68547VVa.A00(this), this);
    }

    @Override // X.InterfaceC105374p1
    public final C105364p0 F5i() {
        UQx uQx;
        InterfaceC72034XFw Arq = Arq();
        C66644URi c66644URi = null;
        if (Arq != null) {
            uQx = Arq.EuQ();
        } else {
            uQx = null;
        }
        XG1 BhZ = BhZ();
        if (BhZ != null) {
            c66644URi = BhZ.F5o();
        }
        return new C105364p0(uQx, Bpl(), c66644URi);
    }
}
