package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class WMh implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public WMh(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A04 = obj3;
        this.A01 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        View A01;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(2113491185);
                ((InterfaceC71978XDn) this.A02).DM1((UR1) ((List) this.A04).get(this.A01), (C38657Gyy) this.A03);
                i = 577616332;
                break;
            case 1:
                A05 = C0f9.A05(995718032);
                UGf uGf = (UGf) this.A04;
                C63752uw c63752uw = uGf.A03;
                int i2 = this.A01;
                User user = (User) this.A03;
                BIM.A00(c63752uw.A01, c63752uw.A02, user.getId(), i2);
                AbstractC23641Du.A05(AnonymousClass191.A00, new MCG(user, c63752uw, (InterfaceC23621Ds) null, 24), C07Y.A00(c63752uw.A00));
                C66477UJb c66477UJb = (C66477UJb) this.A02;
                FollowButton followButton = c66477UJb.A08;
                followButton.A0J.A04(uGf.A01, uGf.A02, user);
                c66477UJb.A02.setVisibility(8);
                followButton.setVisibility(0);
                C42526Is5 c42526Is5 = uGf.A05;
                C63742uv c63742uv = c63752uw.A03;
                QIy qIy = c42526Is5.A01;
                String str = qIy.A05;
                if (str != null) {
                    AbstractC40751I4f.A00(c63742uv.A00, c63742uv.A01, c63742uv.A02, null, C1XV.A0N.toString(), str, AbstractC111324zv.A00(2220), qIy.A06);
                }
                i = -1903779034;
                break;
            case 2:
                A05 = C0f9.A05(-1522162127);
                UGf uGf2 = (UGf) this.A04;
                C63752uw c63752uw2 = uGf2.A03;
                int i3 = this.A01;
                User user2 = (User) this.A03;
                BIM.A01(c63752uw2.A01, c63752uw2.A02, user2.getId(), i3);
                AbstractC23641Du.A05(AnonymousClass191.A00, new MCG(user2, c63752uw2, (InterfaceC23621Ds) null, 25), C07Y.A00(c63752uw2.A00));
                int bindingAdapterPosition = ((C3OO) this.A02).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    uGf2.A06.remove(bindingAdapterPosition);
                    uGf2.notifyItemRemoved(bindingAdapterPosition);
                }
                if (uGf2.getItemCount() == 0) {
                    VTD.A00(uGf2.A04, 8, true);
                }
                C42526Is5 c42526Is52 = uGf2.A05;
                C63742uv c63742uv2 = c63752uw2.A03;
                QIy qIy2 = c42526Is52.A01;
                String str2 = qIy2.A05;
                if (str2 != null && c63742uv2.A03.add(str2)) {
                    C18920wW c18920wW = c63742uv2.A01;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2563));
                    if (A00.isSampled()) {
                        A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C1XV.A0N.toString());
                        A00.AAP("action", AbstractC111324zv.A00(2221));
                        AbstractC37301Gc2.A15(A00, c63742uv2.A00);
                        A00.A9K("ig_userid", AbstractC25228BEl.A13(c63742uv2.A02.userId));
                        A00.AAP(AbstractC111324zv.A00(2748), str2);
                        A00.AAP("tracking_token", qIy2.A06);
                        A00.Cht();
                    }
                }
                i = 1129852009;
                break;
            case 3:
                WlW wlW = (WlW) this.A02;
                InterfaceC58311Pt3 interfaceC58311Pt3 = (InterfaceC58311Pt3) this.A03;
                C5HW c5hw = (C5HW) this.A04;
                int i4 = this.A01;
                C57012jc c57012jc = wlW.A06;
                if (c57012jc.A01() == null) {
                    if (wlW.A08.A01() != null) {
                        c57012jc = wlW.A07;
                    } else {
                        A01 = wlW.A01;
                        interfaceC58311Pt3.Ddu(AbstractC13880nE.A0G(A01), new C51693MsO(null, EnumC33370Ep3.A02, null, i4), c5hw, i4);
                        return;
                    }
                }
                A01 = c57012jc.A01();
                interfaceC58311Pt3.Ddu(AbstractC13880nE.A0G(A01), new C51693MsO(null, EnumC33370Ep3.A02, null, i4), c5hw, i4);
                return;
            case 4:
                WlY wlY = (WlY) this.A02;
                C5HW c5hw2 = (C5HW) this.A03;
                InterfaceC58311Pt3 interfaceC58311Pt32 = (InterfaceC58311Pt3) this.A04;
                int i5 = this.A01;
                if (wlY.A00 == null) {
                    WlY.A00(wlY);
                }
                View view2 = wlY.A00;
                view2.getClass();
                view2.setSelected(!c5hw2.A0G());
                interfaceC58311Pt32.DOw(c5hw2, i5, c5hw2.A0G());
                c5hw2.A04.A04 = Boolean.valueOf(!c5hw2.A0G());
                return;
            case 5:
                A05 = C0f9.A05(-1859460831);
                ((XB2) this.A03).ALn(((C67902V1q) this.A04).A0A, this.A01);
                ((C189478aR) this.A02).A07();
                i = 509383926;
                break;
            default:
                C38262Gs5 c38262Gs5 = (C38262Gs5) this.A02;
                int i6 = this.A01;
                C41181vS c41181vS = (C41181vS) this.A03;
                C38264Gs7 c38264Gs7 = (C38264Gs7) this.A04;
                c38262Gs5.A0A.A00(false);
                c38262Gs5.A09(i6, false);
                C38274GsJ A002 = AbstractC38267GsC.A00(c38262Gs5.A07);
                A002.A02(c41181vS, "viewers_icon_from_dashboard");
                String str3 = c41181vS.A0j;
                A002.A03(str3);
                ArrayList A02 = C38262Gs5.A02(c38264Gs7, c38262Gs5);
                C14360o3.A0B(str3, 0);
                if (C38274GsJ.A00(A002, str3) != null) {
                    A002.A00 = A02;
                    A002.A01 = true;
                    return;
                }
                return;
        }
        C0f9.A0C(i, A05);
    }
}
