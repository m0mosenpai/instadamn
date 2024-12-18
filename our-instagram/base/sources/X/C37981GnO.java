package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;
import java.util.Map;

/* renamed from: X.GnO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37981GnO extends C17T implements InterfaceC124225jb {
    public List A00;
    public List A01;
    public List A02;

    @Override // X.InterfaceC124225jb
    public final Map BR0() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.XNd, X.XNa] */
    public final C72084XNd A0q() {
        TreeJNI reinterpret = reinterpret(C37960Gn2.class);
        C14360o3.A07(reinterpret);
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        C37960Gn2 c37960Gn2 = (C37960Gn2) AbstractC25234BEr.A0P(reinterpret, AbstractC167007dF.A0n(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "ok")).applyToTree(reinterpret);
        C14360o3.A0A(c37960Gn2);
        C14360o3.A0B(c37960Gn2, 1);
        ?? abstractC72082XNa = new AbstractC72082XNa(c37960Gn2);
        abstractC72082XNa.A01 = -1L;
        abstractC72082XNa.A00 = -1L;
        return abstractC72082XNa;
    }

    @Override // X.InterfaceC124225jb
    public final List AoL() {
        List list = this.A00;
        if (list == null) {
            return getOptionalTreeListByHashCode(1367927716, C37982GnP.class);
        }
        return list;
    }

    @Override // X.InterfaceC124225jb
    public final List BKG() {
        List list = this.A02;
        if (list == null) {
            return getOptionalTreeListByHashCode(-1339914410, C39194HNg.class);
        }
        return list;
    }

    @Override // X.InterfaceC124225jb
    public final InterfaceC111084zP Bb9() {
        InterfaceC111084zP interfaceC111084zP = (AnonymousClass685) getTreeValueByHashCode(1726143873, AnonymousClass685.class);
        if (interfaceC111084zP == null) {
            C125905mf A00 = InterfaceC111084zP.A00.A00(false);
            A00.A00 = null;
            interfaceC111084zP = A00.A00();
        }
        InterfaceC111084zP interfaceC111084zP2 = interfaceC111084zP;
        if (interfaceC111084zP2 != null) {
            return interfaceC111084zP2;
        }
        throw new IllegalStateException("Required field 'paging_info' was either missing or null for GetUserClipsResponse.");
    }

    @Override // X.InterfaceC124225jb
    public final List getItems() {
        List list = this.A01;
        if (list == null) {
            ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(100526016, C37982GnP.class);
            if (optionalTreeListByHashCode == null) {
                return C16930sl.A00;
            }
            return optionalTreeListByHashCode;
        }
        return list;
    }

    @Override // X.InterfaceC124225jb
    public final String Aqj() {
        return getStringValueByHashCode(1759802346);
    }

    @Override // X.InterfaceC124225jb
    public final String Bm2() {
        return getStringValueByHashCode(-1198642808);
    }

    @Override // X.InterfaceC124225jb
    public final Boolean CCI() {
        return A0B(2079275687);
    }
}
