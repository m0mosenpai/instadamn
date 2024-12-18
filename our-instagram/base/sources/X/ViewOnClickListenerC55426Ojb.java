package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Ojb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55426Ojb implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public ViewOnClickListenerC55426Ojb(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        if (this.A00 != 0) {
            A05 = C0f9.A05(-2064396560);
            String str2 = this.A04;
            if (str2 != null) {
                String str3 = this.A05;
                UserSession userSession = (UserSession) this.A03;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                String str4 = this.A06;
                if (str3 != null) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(1022));
                    A0f.AAP("netego_id", str2);
                    A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
                    A0f.AAP("tracking_token", str4);
                    A0f.A9K(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC25231BEo.A0j(0, userSession.userId));
                    A0f.Cht();
                }
            }
            C37524Gfg c37524Gfg = (C37524Gfg) this.A02;
            if (c37524Gfg != null) {
                c37524Gfg.A00();
            }
            i = -2021625590;
        } else {
            A05 = C0f9.A05(-1034843814);
            C3DN A01 = C3DN.A00.A01(((View) this.A01).getContext());
            if (A01 != null) {
                A01.A0B();
            }
            C52121N4u c52121N4u = (C52121N4u) this.A03;
            C147716kw c147716kw = c52121N4u.A00;
            if (c147716kw == null) {
                str = "delegate";
            } else {
                String str5 = c52121N4u.A01;
                if (str5 == null) {
                    str = "broadcastID";
                } else {
                    C109724wz c109724wz = (C109724wz) this.A02;
                    String str6 = this.A06;
                    String str7 = this.A04;
                    String str8 = this.A05;
                    AbstractC37302Gc3.A1U(str7, str8);
                    OUD oud = c147716kw.A07;
                    if (oud != null) {
                        FragmentActivity fragmentActivity = c147716kw.A0J;
                        C41761wQ c41761wQ = oud.A01;
                        UserSession userSession2 = oud.A02;
                        C62949SYr A00 = AbstractC54072NvW.A00(userSession2);
                        String str9 = oud.A03;
                        C14360o3.A0B(str9, 0);
                        c41761wQ.A02(C62949SYr.A00(A00, str9).A0F(), new C49798Lz5(15, c147716kw, oud, c109724wz));
                        HashMap A12 = AbstractC31174DnI.A12("price", str6);
                        String str10 = c109724wz.A02;
                        ((C56138Ovy) oud.A04.getValue()).A02(fragmentActivity, new QIo(null, EnumC53199Nfv.A03, str10, AnonymousClass001.A15("{\"product_id\":\"", str7, "\", \"payee_id\":\"", str8, "\", \"payer_id\":\"", userSession2.userId, "\"}"), str7, str5, ImmutableMap.copyOf((Map) A12)), null, null);
                    }
                    i = 1742003448;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A0C(i, A05);
    }
}
