package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IjO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41993IjO implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public ViewOnClickListenerC41993IjO(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A04 = obj4;
        this.A01 = i;
        this.A02 = obj;
        this.A05 = obj3;
        this.A03 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        C38321qM c38321qM;
        Long A0k;
        CreatorViewerSignalModel creatorViewerSignalModel;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-226492394);
                InterfaceC16590sC interfaceC16590sC = ((C38114Gph) this.A05).A03;
                Object obj = this.A03;
                Object obj2 = this.A02;
                Object obj3 = this.A04;
                Integer valueOf = Integer.valueOf(this.A01);
                C14360o3.A0A(view);
                interfaceC16590sC.invoke(obj, obj2, obj3, valueOf, view);
                i = -1250648240;
                break;
            case 1:
                A05 = C0f9.A05(149450835);
                ((C60662pp) this.A04).A0M((C38321qM) this.A02, (ICO) this.A03, this.A01);
                i = -1848605357;
                break;
            case 2:
            case 3:
            default:
                ((InterfaceC58311Pt3) this.A03).Ddu(AbstractC13880nE.A0G((View) this.A02), new C51693MsO((OAY) this.A05), (C5HW) this.A04, this.A01);
                return;
            case 4:
                A05 = C0f9.A05(1459107918);
                WFV.A02((C38321qM) this.A04, (C189478aR) this.A02, (WFV) this.A05, (XB2) this.A03, this.A01, true);
                i = -75578423;
                break;
            case 5:
                A05 = C0f9.A05(-1671382171);
                IHM ihm = ((C42308IoW) this.A05).A01;
                ihm.A02.invoke(this.A04, this.A03, Integer.valueOf(this.A01));
                ihm.A00.invoke(AbstractC31171DnF.A06((C3OO) this.A02));
                i = 152550511;
                break;
            case 6:
                A05 = C0f9.A05(-1277455540);
                IHZ ihz = C37548Gg4.A04;
                if (ihz != null) {
                    String id = ((User) this.A04).getId();
                    int i2 = this.A01;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ihz.A01, "suggested_creator_card_tapped");
                    A0f.AAP("target_id", id);
                    A0f.A8p("position", Integer.valueOf(i2));
                    A0f.Cht();
                }
                Activity activity = (Activity) this.A02;
                if (activity instanceof FragmentActivity) {
                    C37548Gg4.A08 = true;
                    UserSession userSession = (UserSession) this.A05;
                    C140966Yy A0P = AbstractC31173DnH.A0P((FragmentActivity) activity, userSession);
                    C28431Ze A02 = AbstractC31364DqT.A02();
                    C31368DqX A01 = AbstractC31402Dr6.A01(userSession, ((User) this.A04).getId(), "suggested_creators_in_reels", AbstractC37300Gc1.A0W(this.A03));
                    A01.A0O = "profile_clips";
                    C31368DqX.A02(A0P, userSession, A02, A01);
                }
                i = -1621678859;
                break;
            case 7:
                A05 = C0f9.A05(-1852283783);
                C39488HcG c39488HcG = (C39488HcG) this.A05;
                C15370ps c15370ps = (C15370ps) this.A02;
                String str = (String) c15370ps.A00;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                UserSession userSession2 = c39488HcG.A03;
                C52678NSa A00 = CK4.A00(userSession2);
                if ((str == null || !AbstractC37304Gc5.A1a(A00, str, false)) && (c38321qM = c39488HcG.A09) != null) {
                    InterfaceC11380iw interfaceC11380iw = c39488HcG.A02;
                    List list = (List) this.A04;
                    int i4 = this.A01;
                    C14360o3.A0B(interfaceC11380iw, 0);
                    AbstractC167017dG.A1Q(userSession2, list);
                    InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession2), "ig_lumen_recipe_sheet_overflow_tip_button_tap");
                    String A2u = c38321qM.A2u();
                    if (A2u != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null && (creatorViewerSignalModel = (CreatorViewerSignalModel) AbstractC001800i.A0O(list, i4)) != null && A0f2.isSampled()) {
                        ArrayList A0i = AbstractC167007dF.A0i(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC37303Gc4.A0x(new C0Zx(), (CreatorViewerSignalModel) it.next(), A0i);
                        }
                        AbstractC37305Gc6.A05(A0f2, creatorViewerSignalModel, A0k);
                        AbstractC37303Gc4.A0h(A0f2, c38321qM, interfaceC11380iw.getModuleName(), A0i);
                        AbstractC25232BEp.A1L(A0f2, "button_text_enum", MSV.A00(259));
                    }
                }
                boolean z = true;
                view.setSelected(!view.isSelected());
                HC2 hc2 = c39488HcG.A0A;
                String str2 = (String) c15370ps.A00;
                if (((TrackOrOriginalSoundSchemaIntf) this.A03).BZv() == null) {
                    z = false;
                }
                C14360o3.A0B(str2, 0);
                C52678NSa A002 = CK4.A00(AbstractC166987dD.A0r(hc2.A03));
                AbstractC166987dD.A1Z(new PXm(A002, new C42814Iwq(), str2, null, 1, AbstractC37304Gc5.A1a(A002, str2, false), z), AnonymousClass194.A02(C12L.A00.A04));
                i = 1732226617;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
