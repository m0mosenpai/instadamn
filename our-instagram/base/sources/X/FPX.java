package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class FPX {
    public final /* synthetic */ FOL A00;
    public final /* synthetic */ EMW A01;

    public FPX(FOL fol, EMW emw) {
        this.A01 = emw;
        this.A00 = fol;
    }

    public final void A00(String str) {
        User user;
        String A00 = AbstractC111324zv.A00(5052);
        FOL fol = this.A00;
        List list = fol.A08;
        if (list != null && (user = (User) AbstractC001800i.A0O(list, 0)) != null) {
            FPD fpd = fol.A05;
            String obj = fol.A07.toString();
            String id = user.getId();
            C14360o3.A0B(obj, 0);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(fpd.A00, "direct_persistent_menu"), "direct_thread_persistent_menu_click");
            if (A0f.isSampled()) {
                AbstractC31171DnF.A1F(A0f, obj);
                A0f.AAP("business_id", id);
                A0f.AAP("click_surface", A00);
                A0f.AAP(AbstractC111324zv.A00(799), str);
                A0f.Cht();
            }
        }
    }
}
