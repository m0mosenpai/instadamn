package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class P91 implements InterfaceC64002vL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C52167N6w A01;

    @Override // X.InterfaceC64002vL
    public final void CMu(String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void D1e(Reel reel) {
    }

    @Override // X.InterfaceC64002vL
    public final void DJt() {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void DSa() {
    }

    @Override // X.InterfaceC64002vL
    public final void DVW() {
    }

    @Override // X.InterfaceC64002vL
    public final void DXO() {
    }

    @Override // X.InterfaceC64002vL
    public final void De5(EnumC53202Nfy enumC53202Nfy, String str) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De6(Reel reel, C70873Fz c70873Fz, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void De7(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, List list, int i, boolean z) {
        ArrayList arrayList;
        C38E c38e;
        EnumC1571773w A00;
        String str3;
        String id;
        C14360o3.A0B(str, 0);
        C52167N6w c52167N6w = this.A01;
        C38E c38e2 = c52167N6w.A04;
        if (c38e2 != null) {
            c38e2.A03();
        }
        P2Y p2y = c52167N6w.A02;
        if (p2y != null) {
            List list2 = p2y.A0E;
            arrayList = AbstractC167017dG.A0q(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C56113OvY) it.next()).A01);
            }
        } else {
            arrayList = null;
        }
        InterfaceC09390do interfaceC09390do = c52167N6w.A0C;
        Reel A0R = MSY.A0R(AbstractC166987dD.A0r(interfaceC09390do), str);
        InterfaceC09390do interfaceC09390do2 = c52167N6w.A0D;
        C50862Mdt c50862Mdt = (C50862Mdt) interfaceC09390do2.getValue();
        if (C14360o3.A0K(c50862Mdt.A02.userId, c50862Mdt.A03) && A0R != null && (id = A0R.getId()) != null && AbstractC002300n.A0h(id, "myWeek", false)) {
            AbstractC31175DnJ.A0s(null, AbstractC55178Odj.A04(AbstractC166987dD.A0r(interfaceC09390do).token), AbstractC25225BEi.A0r(c52167N6w.requireActivity(), AbstractC166987dD.A0r(interfaceC09390do)));
        } else if (arrayList != null && A0R != null && (c38e = c52167N6w.A04) != null) {
            c38e.A06(A0R, C3G2.A16, null, arrayList, arrayList, arrayList);
        }
        C50862Mdt c50862Mdt2 = (C50862Mdt) interfaceC09390do2.getValue();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r, 0);
        String str4 = c50862Mdt2.A02.userId;
        String str5 = c50862Mdt2.A03;
        if (C14360o3.A0K(str4, str5)) {
            A00 = EnumC1571773w.A05;
        } else {
            User A0k = AbstractC31174DnI.A0k(A0r, str5);
            if (A0k == null) {
                return;
            } else {
                A00 = AbstractC50626MWn.A00(A0r, A0k.B7L(), A0k.A0M(), str5);
            }
        }
        if (A00 == EnumC1571773w.A05) {
            str3 = "self_highlights_profile";
        } else {
            str3 = "highlights_profile";
        }
        C1571673v.A00.A0E(A0r, A00, str3, "tap_reel_highlights", str5, "highlights_tab");
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De8(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeA(Reel reel, C70873Fz c70873Fz, Integer num, int i) {
        String str;
        C14360o3.A0B(reel, 0);
        C52167N6w c52167N6w = this.A01;
        C50862Mdt c50862Mdt = (C50862Mdt) c52167N6w.A0D.getValue();
        if (C14360o3.A0K(c50862Mdt.A02.userId, c50862Mdt.A03)) {
            str = "self_highlights_profile";
        } else {
            str = "highlights_profile";
        }
        String str2 = null;
        C60962qK A01 = AbstractC60952qJ.A01(str, false, false);
        List list = c52167N6w.A0B;
        if (!list.contains(reel.getId())) {
            C82713mZ c82713mZ = new C82713mZ(A01, "reel_tray_impression");
            c82713mZ.A6j = reel.getId();
            User A0D = reel.A0D();
            if (A0D != null) {
                str2 = A0D.getId();
            }
            c82713mZ.A4c = str2;
            c82713mZ.A6o = "highlight";
            c82713mZ.A4M = AbstractC31171DnF.A0V(i);
            C32U.A0I(AbstractC166987dD.A0r(c52167N6w.A0C), c82713mZ, A01, C05F.A00);
            list.add(AbstractC37301Gc2.A0i(reel));
        }
    }

    @Override // X.InterfaceC64002vL
    public final void DeC(List list, int i, String str) {
        C14360o3.A0B(str, 0);
        C52167N6w c52167N6w = this.A01;
        InterfaceC09390do interfaceC09390do = c52167N6w.A0C;
        Reel A0R = MSY.A0R(AbstractC166987dD.A0r(interfaceC09390do), str);
        if (A0R != null && A0R.A0W != null) {
            new C55173Odc(c52167N6w.requireActivity(), c52167N6w, c52167N6w, AbstractC166987dD.A0r(interfaceC09390do), A0R).A04(new C55851Or1(this.A00, A0R, c52167N6w, str), C05F.A01);
        }
    }

    @Override // X.InterfaceC64002vL
    public final void DeF(String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void Dvg(int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void E1q(C3OO c3oo, Reel reel, Integer num, String str, String str2, List list) {
    }

    public P91(Context context, C52167N6w c52167N6w) {
        this.A01 = c52167N6w;
        this.A00 = context;
    }

    @Override // X.InterfaceC64002vL
    public final int C9u() {
        P2Y p2y = this.A01.A02;
        if (p2y != null) {
            List list = p2y.A0E;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((C56113OvY) it.next()).A01);
            }
            return A0q.size();
        }
        return 0;
    }
}
