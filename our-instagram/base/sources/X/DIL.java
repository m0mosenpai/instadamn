package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes5.dex */
public final class DIL extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIL(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super(1);
        this.A00 = i;
        this.A08 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = obj5;
        this.A06 = obj6;
        this.A05 = obj7;
        this.A07 = obj8;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C65 c65;
        if (this.A00 != 0) {
            View view = (View) obj;
            if (view != null) {
                BNJ bnj = (BNJ) this.A08;
                UserSession userSession = bnj.A01;
                C120985dq c120985dq = (C120985dq) this.A04;
                boolean CdW = c120985dq.CdW();
                C15080pO c15080pO = (C15080pO) this.A02;
                float f = c15080pO.A00;
                C15080pO c15080pO2 = (C15080pO) this.A03;
                if (BPB.A00(view, userSession, f, c15080pO2.A00, CdW)) {
                    InterfaceC31016DkF interfaceC31016DkF = bnj.A07;
                    User user = (User) this.A01;
                    interfaceC31016DkF.EI3(c120985dq, user);
                    BL6 bl6 = bnj.A08;
                    if (bl6.A0G) {
                        c65 = C65.INFLUENCER;
                    } else {
                        c65 = C65.BRAND;
                    }
                    C09530e4 A03 = BNJ.A03(view, ((C76223bS) this.A06).A05, c120985dq, bnj, c15080pO.A00, c15080pO2.A00);
                    InterfaceC31137Dmc interfaceC31137Dmc = bnj.A03;
                    C37644Ghd c37644Ghd = (C37644Ghd) this.A05;
                    View view2 = null;
                    if (C14360o3.A0K(view.getTag(), "clips_author_info_profile_pic_component")) {
                        view2 = view;
                    }
                    interfaceC31137Dmc.Dbc(view2, c120985dq, c37644Ghd, c65, user, Boolean.valueOf(bnj.A0C), Boolean.valueOf(bl6.A0E), null, null, (Float) A03.A00, (Float) A03.A01, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, null, null, (InterfaceC16820sZ) this.A07, false, bnj.A0B);
                }
            }
        } else {
            C6Nu A0T = AbstractC25228BEl.A0T(obj);
            List list = (List) this.A02;
            DOZ doz = DOZ.A00;
            C30092DOa c30092DOa = C30092DOa.A00;
            Object obj2 = this.A01;
            Object obj3 = this.A05;
            Object obj4 = this.A08;
            Object obj5 = this.A04;
            Object obj6 = this.A06;
            Object obj7 = this.A03;
            Object obj8 = this.A07;
            AbstractC25227BEk.A15(A0T, new C44253Jgx(1, obj4, list, obj7, obj3, obj5, obj8, obj6, obj2), new C50362MLo(38, list, (InterfaceC16660sJ) doz), new C50362MLo(39, list, (InterfaceC16660sJ) c30092DOa), list.size());
        }
        return C0eB.A00;
    }
}
