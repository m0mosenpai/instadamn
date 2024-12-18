package X;

import android.content.DialogInterface;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DWn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30312DWn extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30312DWn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        super(2);
        this.A00 = i;
        this.A06 = obj;
        this.A01 = obj2;
        this.A0A = obj3;
        this.A08 = obj4;
        this.A04 = obj5;
        this.A03 = obj6;
        this.A05 = obj7;
        this.A07 = obj8;
        this.A02 = obj9;
        this.A09 = obj10;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C65 c65;
        Object obj3;
        String str;
        View findViewWithTag;
        float f;
        String str2;
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        if (this.A00 != 0) {
            if (AbstractC166987dD.A1a(obj)) {
                Fragment fragment = (Fragment) this.A06;
                UserSession userSession = (UserSession) this.A0A;
                C38321qM c38321qM = (C38321qM) this.A08;
                C1P1 c1p1 = (C1P1) this.A04;
                DialogInterface.OnClickListener onClickListener3 = (DialogInterface.OnClickListener) this.A03;
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.A05;
                onClickListener = new DialogInterfaceOnClickListenerC28566Ciy(onClickListener3, onDismissListener, fragment, c1p1, userSession, c38321qM);
                onClickListener2 = new DialogInterfaceOnClickListenerC28566Ciy((DialogInterface.OnClickListener) this.A07, onDismissListener, fragment, c1p1, userSession, c38321qM);
            } else {
                onClickListener = (DialogInterface.OnClickListener) this.A03;
                onClickListener2 = (DialogInterface.OnClickListener) this.A07;
            }
            FragmentActivity activity = ((Fragment) this.A06).getActivity();
            UserSession userSession2 = (UserSession) this.A0A;
            C38321qM c38321qM2 = (C38321qM) this.A08;
            String A03 = C55217Oeg.A03(activity, userSession2, c38321qM2, true);
            EnumC193348hE enumC193348hE = EnumC193348hE.A06;
            DialogInterface.OnClickListener onClickListener4 = (DialogInterface.OnClickListener) this.A02;
            C18920wW c18920wW = (C18920wW) this.A09;
            C28482Cha.A02(onClickListener, new DialogInterfaceOnClickListenerC28565Cix(onClickListener4, c18920wW, userSession2, c38321qM2, 1), onClickListener2, (DialogInterface.OnDismissListener) this.A05, new DialogInterfaceOnShowListenerC63431SkA(1, c18920wW, c38321qM2, userSession2), activity, enumC193348hE, enumC193348hE, 2131957608, A03, 2131957606, 2131957607, 2131954754);
        } else {
            User user = (User) obj;
            View view = (View) obj2;
            C14360o3.A0B(user, 0);
            BNJ bnj = (BNJ) this.A0A;
            InterfaceC31016DkF interfaceC31016DkF = bnj.A07;
            C120985dq c120985dq = (C120985dq) this.A04;
            interfaceC31016DkF.EI3(c120985dq, (User) this.A01);
            if (bnj.A08.A0G && AbstractC002300n.A0g(AbstractC25228BEl.A18(AbstractC25226BEj.A14((C38321qM) this.A06)), user.getId(), false)) {
                c65 = C65.INFLUENCER;
            } else {
                c65 = C65.BRAND;
            }
            C2XE c2xe = ((C76223bS) this.A08).A05;
            C15080pO c15080pO = (C15080pO) this.A02;
            float f2 = c15080pO.A00;
            C15080pO c15080pO2 = (C15080pO) this.A03;
            C09530e4 A032 = BNJ.A03(view, c2xe, c120985dq, bnj, f2, c15080pO2.A00);
            float f3 = c15080pO.A00;
            float f4 = c15080pO2.A00;
            JWd jWd = (JWd) this.A07;
            if (jWd.A02 && view != null && (findViewWithTag = view.findViewWithTag("clips_author_info_username_component")) != null) {
                int height = findViewWithTag.getHeight();
                if (f3 != -1.0f && f4 != -1.0f && height != 0 && findViewWithTag.getWidth() != 0) {
                    Number number = (Number) jWd.A00;
                    if (number != null) {
                        f = number.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    StringBuilder sb = new StringBuilder(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    if (f4 >= 0.0f && f4 < f) {
                        str2 = "_top_expanded_area";
                    } else {
                        float f5 = height;
                        if (f4 <= f5 && f4 > f5 - f) {
                            str2 = "_bottom_expanded_area";
                        }
                        String obj4 = sb.toString();
                        C14360o3.A0B(obj4, 0);
                        jWd.A01 = obj4;
                    }
                    sb.append(str2);
                    String obj42 = sb.toString();
                    C14360o3.A0B(obj42, 0);
                    jWd.A01 = obj42;
                }
            }
            InterfaceC31137Dmc interfaceC31137Dmc = bnj.A03;
            C37644Ghd c37644Ghd = (C37644Ghd) this.A05;
            if (view != null) {
                obj3 = view.getTag();
            } else {
                obj3 = null;
            }
            if (!C14360o3.A0K(obj3, "clips_author_info_profile_pic_component")) {
                view = null;
            }
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A09;
            if (jWd.A02) {
                str = jWd.A01;
            } else {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
            }
            interfaceC31137Dmc.Dbc(view, c120985dq, c37644Ghd, c65, user, Boolean.valueOf(bnj.A0C), false, null, null, (Float) A032.A00, (Float) A032.A01, str, null, null, interfaceC16820sZ, false, bnj.A0B);
        }
        return C0eB.A00;
    }
}
