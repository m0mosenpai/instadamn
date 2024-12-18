package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class G7D implements InterfaceC37199GaA {
    public final /* synthetic */ ENT A00;

    public G7D(ENT ent) {
        this.A00 = ent;
    }

    @Override // X.InterfaceC37199GaA
    public final boolean AJn(String str) {
        EQL eql = this.A00.A01;
        if (eql == null) {
            C14360o3.A0F("oneCategoryAdapter");
            throw C00O.createAndThrow();
        }
        return eql.A01.contains(str);
    }

    @Override // X.InterfaceC37199GaA
    public final C1ON BEN() {
        String str;
        ENT ent = this.A00;
        String str2 = ent.A03;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(ent.A09);
        String str3 = ent.A02;
        String str4 = null;
        if (str3 == null) {
            str = "category";
        } else {
            EVZ evz = ent.A00;
            if (evz == null) {
                str = "accountDiscoveryController";
            } else {
                if (evz.A02) {
                    str4 = ent.A04;
                }
                C14360o3.A0B(A0o, 1);
                C25621Ms A0M = AbstractC31177DnL.A0M(A0o);
                A0M.A0B("discover/account_discovery/");
                A0M.A0R(C32171EBs.class, C34840FWx.class);
                A0M.A9s("category", str3);
                A0M.A0H(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                if (str4 != null && str4.length() != 0) {
                    A0M.A9s("forced_user_ids", str4);
                }
                return A0M.A0N();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37199GaA
    public final /* bridge */ /* synthetic */ void DGq(InterfaceC40801un interfaceC40801un) {
        String str;
        C32171EBs c32171EBs = (C32171EBs) interfaceC40801un;
        C14360o3.A0B(c32171EBs, 0);
        EQL eql = this.A00.A01;
        if (eql == null) {
            str = "oneCategoryAdapter";
        } else {
            FPs fPs = c32171EBs.A00;
            if (fPs != null) {
                ArrayList A00 = fPs.A00();
                if (AbstractC25226BEj.A1b(A00)) {
                    ArrayList arrayList = eql.A00;
                    arrayList.clear();
                    arrayList.addAll(A00);
                    EQL.A00(eql);
                    return;
                }
                return;
            }
            str = "category";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37199GaA
    public final void FAg() {
        EQL eql = this.A00.A01;
        if (eql == null) {
            C14360o3.A0F("oneCategoryAdapter");
            throw C00O.createAndThrow();
        }
        EQL.A00(eql);
    }
}
