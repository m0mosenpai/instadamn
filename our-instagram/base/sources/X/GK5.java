package X;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class GK5 implements InterfaceC42241xE {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C6FG A02;
    public final /* synthetic */ C6FQ A03;
    public final /* synthetic */ C41761wQ A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C2EC A06;
    public final /* synthetic */ C2DS A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;

    public GK5(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C6FG c6fg, C6FQ c6fq, C41761wQ c41761wQ, UserSession userSession, C2EC c2ec, C2DS c2ds, String str, String str2, String str3, List list) {
        this.A02 = c6fg;
        this.A00 = fragmentActivity;
        this.A05 = userSession;
        this.A03 = c6fq;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A04 = c41761wQ;
        this.A07 = c2ds;
        this.A06 = c2ec;
        this.A0B = list;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Long l;
        IBinder iBinder;
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        C6FG c6fg = this.A02;
        Context context = c6fg.A00;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        Long l2 = null;
        if (inputMethodManager != null) {
            View currentFocus = this.A00.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
        UserSession userSession = this.A05;
        P4X p4x = new P4X(C6BQ.A08(this.A03), userSession);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        String str = this.A09;
        String id = A0Y.getId();
        String fbidV2 = A0Y.A03.getFbidV2();
        if (fbidV2 != null) {
            l2 = AbstractC166997dE.A0j(fbidV2);
        }
        String str2 = this.A0A;
        String str3 = this.A08;
        Long l3 = null;
        UserSession userSession2 = p4x.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(p4x.A00, userSession2), "ig_lead_generation");
        A0f.AAP("flow_name", "lead_gen_business_messaging");
        A0f.AAP("flow_step", "initial_message_sent_to_lead");
        A0f.AAP("event_name", "success");
        A0f.AAP("event_type", DexOptimization.OPT_KEY_CLIENT);
        A0f.A9K("ig_user_fbidv2", null);
        A0f.A7v(MSV.A00(1342), true);
        AbstractC31171DnF.A1G(A0f, "lead_management");
        A0f.A7v("is_employee", Boolean.valueOf(C1C0.A00(userSession2)));
        if (str != null) {
            l = AbstractC166997dE.A0j(str);
        } else {
            l = null;
        }
        A0f.A9K("ig_user_id", l);
        A0f.A9K("consumer_ig_user_id", AbstractC003100w.A0k(10, id));
        A0f.A9K(MSV.A00(1079), l2);
        A0f.AAP("ig_thread_id", str2);
        if (str3 != null) {
            l3 = AbstractC003100w.A0k(10, str3);
        }
        A0f.A9K("form_id", l3);
        A0f.Cht();
        if (interfaceC132965zL instanceof C48496Lcn) {
            C0w9.A07("IgBloksCustomNavigationExtensions_sendLeadMessage", (Throwable) AbstractC132975zM.A00(interfaceC132965zL));
        }
        if (str2 == null) {
            C41761wQ c41761wQ = this.A04;
            C2DU c2du = (C2DU) this.A07;
            c41761wQ.A02(c2du.A09.A0O((C5Fn) c2du.A0L.getValue()), new C36800GJz(this.A01, c6fg, c41761wQ, userSession, this.A06, str, this.A0B));
            return;
        }
        FT0.A01(context, this.A01, userSession, this.A06, str, this.A0B);
        this.A04.A01();
    }
}
