package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class G8C implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public G8C(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        switch (this.A00) {
            case 0:
                KDL kdl = (KDL) this.A04;
                C7TG A00 = AbstractC165967bO.A00(AbstractC166987dD.A0r(kdl.A05));
                InterfaceC09390do interfaceC09390do = kdl.A06;
                DirectThreadKey directThreadKey = (DirectThreadKey) interfaceC09390do.getValue();
                DirectThreadKey directThreadKey2 = (DirectThreadKey) interfaceC09390do.getValue();
                C83403nh c83403nh = (C83403nh) this.A01;
                AbstractRunnableC133325zz.A02(new C44289Jhf(new C50363MLp(14, this.A02, this.A03), 4), A00.F9r(new KWh(c83403nh, directThreadKey2), directThreadKey, null), C1M8.A01);
                ((C7G0) kdl.A04.getValue()).A00(c83403nh, (DirectThreadKey) interfaceC09390do.getValue(), "delete");
                return;
            case 1:
                Context context = (Context) this.A01;
                Context context2 = (Context) this.A02;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                User user = (User) this.A03;
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("target_user_id", user.getId());
                A1G.put("referer_type", "ProfileMore");
                C66277U6x A01 = C66277U6x.A01(MSV.A00(20), A1G);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(abstractC12990ll);
                A0C.A0U = context2.getResources().getString(2131951995);
                A0C.A0R = "account_transparency_bloks";
                A01.A04(context, A0C);
                return;
            default:
                AbstractC166987dD.A1Y(this.A03);
                Context context3 = (Context) this.A01;
                User user2 = (User) this.A04;
                Object obj = this.A02;
                C193328hC A0I = AbstractC31171DnF.A0I(context3);
                A0I.A0A(2131972218);
                A0I.A0r(AbstractC166997dE.A0r(context3.getResources(), user2.getUsername(), 2131972217));
                A0I.A0Z(new DialogInterfaceOnClickListenerC35319Fhu(obj, 11), EnumC193348hE.A06, AbstractC166997dE.A0p(context3, 2131972171), true);
                A0I.A0H(DialogInterfaceOnClickListenerC35439Fjw.A00, 2131954754);
                AbstractC166987dD.A1W(A0I);
                return;
        }
    }
}
