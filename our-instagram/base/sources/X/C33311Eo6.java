package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Eo6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33311Eo6 extends PJX {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C64842wi A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C33311Eo6(FragmentActivity fragmentActivity, UserSession userSession, C64842wi c64842wi, String str, String str2, String str3, boolean z, boolean z2) {
        this.A06 = z;
        this.A01 = userSession;
        this.A05 = str;
        this.A07 = z2;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = fragmentActivity;
        this.A02 = c64842wi;
    }

    @Override // X.PJX, X.MRA
    public final void DpY(String str, String str2, String str3) {
        String str4;
        if (this.A06) {
            C142846ck A00 = AbstractC147806l5.A00(this.A01);
            User user = new User(this.A05, null);
            boolean z = this.A07;
            String str5 = this.A03;
            String str6 = this.A04;
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                HashMap A1G = AbstractC166987dD.A1G();
                if (str2 == null) {
                    str2 = "";
                }
                A1G.put("error_message", str2);
                if (str3 == null) {
                    str3 = "";
                }
                AbstractC31171DnF.A1U(str3, A1G);
                if (z) {
                    str4 = "thread_details_people";
                } else {
                    str4 = "thread_details";
                }
                A0I.A0g(AbstractC25228BEl.A13(user.getId()));
                AbstractC31174DnI.A1J(A0I, "report_thread_error");
                A0I.A0o("report_button");
                A0I.A0p(str4);
                AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0Z(A0I, "broadcast", str5, str6), A1G);
            }
        }
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        String str2;
        String str3;
        if (this.A06) {
            C142846ck A00 = AbstractC147806l5.A00(this.A01);
            User user = new User(this.A05, null);
            boolean z = this.A07;
            String str4 = this.A03;
            String str5 = this.A04;
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                if (z) {
                    str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                } else {
                    str2 = "report_icon";
                }
                HashMap A1G = AbstractC166987dD.A1G();
                AbstractC31171DnF.A1T(str2, A1G);
                if (z) {
                    str3 = "thread_details_people";
                } else {
                    str3 = "thread_details";
                }
                A0I.A0g(AbstractC25228BEl.A13(user.getId()));
                AbstractC31174DnI.A1J(A0I, "report_thread_success");
                A0I.A0o("report_button");
                A0I.A0p(str3);
                AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0Z(A0I, "broadcast", str4, str5), A1G);
            }
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        String str6 = this.A03;
        if (C1VN.A00 != null) {
            AbstractC31282Dp4.A00().A00(fragmentActivity, userSession, "1033851281145597", AbstractC47112Ks7.A00(str6));
        }
        C64842wi c64842wi = this.A02;
        if (c64842wi != null) {
            java.util.Set singleton = Collections.singleton(Trigger.A17);
            C14360o3.A07(singleton);
            c64842wi.AVr(singleton);
        }
    }
}
