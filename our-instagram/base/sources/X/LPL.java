package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LPL implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public LPL(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A04 = z;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        Integer num;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(555801211);
                KCC kcc = (KCC) this.A03;
                L3B l3b = kcc.A02;
                if (l3b == null) {
                    C14360o3.A0F("logger");
                    throw C00O.createAndThrow();
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) l3b.A00, "barcelona_golden_ticket_tap");
                A0f.AAP(AbstractC111324zv.A00(2580), l3b.A03);
                AbstractC25233BEq.A17(A0f, "module", l3b.A01.getModuleName());
                A0f.A9K("target_user_id", AbstractC25231BEo.A0j(0, l3b.A02.userId));
                A0f.A7v("is_barcelona_installed", Boolean.valueOf(l3b.A04));
                A0f.Cht();
                if (this.A04) {
                    View view2 = (View) this.A01;
                    Context requireContext = kcc.requireContext();
                    boolean z = !kcc.A09;
                    view2.setEnabled(false);
                    AbstractC166987dD.A1Z(new C50533MSm(view2, requireContext, kcc, null, 3, z), AbstractC25229BEm.A0a(kcc));
                } else {
                    UserSession A0r = AbstractC166987dD.A0r(kcc.A0A);
                    FragmentActivity requireActivity = kcc.requireActivity();
                    User user = (User) this.A02;
                    C35265Fh0.A01(requireActivity, A0r, null, user.getId(), user.getUsername(), "golden_ticket");
                }
                i = 1063008346;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-770741955);
                C38927HBz c38927HBz = (C38927HBz) this.A03;
                if (c38927HBz.A00) {
                    AbstractC23121AKf.A01(c38927HBz.requireActivity(), (HE0) this.A01, AbstractC166987dD.A0r(c38927HBz.A02), (C38321qM) this.A02, null);
                    C8EV c8ev = (C8EV) c38927HBz.A01.getValue();
                    if (this.A04) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A0N;
                    }
                    Integer num2 = C05F.A00;
                    C14360o3.A0B(num, 0);
                    C8EV.A00(c8ev, num, null, num2, null, "cutout_save_button_clicked");
                } else {
                    KC9 A00 = AbstractC46679Kkw.A00(C05F.A00, false);
                    C140966Yy A0c = AbstractC25231BEo.A0c(c38927HBz.requireActivity(), c38927HBz.A02);
                    A0c.A09();
                    A0c.A0D(A00);
                    A0c.A0A = "cutout_gallery_creation_flow";
                    A0c.A04();
                    C8EV.A01((C8EV) c38927HBz.A01.getValue(), "attribution_upsell_create_button_clicked");
                }
                AbstractC25233BEq.A14(c38927HBz);
                i = -1163821531;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-819399601);
                if (this.A04) {
                    i = 2123958495;
                } else {
                    ((CompoundButton) this.A01).toggle();
                    ((InterfaceC50464MPs) this.A02).DtU((C31228DoB) this.A03);
                    i = -638764065;
                }
                C0f9.A0C(i, A05);
                return;
        }
    }
}
