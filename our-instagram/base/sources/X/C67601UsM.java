package X;

import android.app.Activity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.UsM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67601UsM extends AbstractC53642Nnn {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C26086BgF A01;
    public final /* synthetic */ UserSession A02;

    public C67601UsM(Activity activity, C26086BgF c26086BgF, UserSession userSession) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = c26086BgF;
    }

    @Override // X.AbstractC53642Nnn
    public final void A00() {
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        C26086BgF c26086BgF = this.A01;
        AbstractC16960so.A1Q("EDIT_POST", "POST").contains(c26086BgF.A03);
        C70683Wf4 A00 = FA6.A00(userSession);
        String str = c26086BgF.A04;
        if (str == null) {
            str = AbstractC25231BEo.A0p();
        }
        try {
            A00.A01.A02(activity, (C4IB) c26086BgF.A00, new C70466WXw(activity, c26086BgF, A00, str));
        } catch (Throwable th) {
            C4I7 A01 = A00.A01(activity);
            Long A002 = C4I8.A00(A00.A00);
            EnumC53378NjT enumC53378NjT = EnumC53378NjT.A03;
            VHd vHd = VHd.APP_PERMISSION;
            List list = (List) c26086BgF.A02;
            String str2 = c26086BgF.A03;
            String A0q = AbstractC31173DnH.A0q(th);
            C14360o3.A07(A0q);
            String message = th.getMessage();
            if (message == null) {
                message = "null";
            }
            C45116Jxl c45116Jxl = new C45116Jxl(A0q, message, C2Ql.A00(th), 1);
            String obj = c26086BgF.A00.toString();
            AbstractC37302Gc3.A1U(list, str2);
            if (C18U.A06(C06090Tz.A05, A01.A01, 36318015821715220L)) {
                C18920wW c18920wW = A01.A00;
                C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "device_permissions"), 136);
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A06("access_level", obj);
                    c0Zx.A06("data_type", "LOCATION_FOREGROUND");
                    c0Zx.A06("auth_status", null);
                    c0Zx.A06("listener", null);
                    String str3 = c45116Jxl.A02;
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A06(TraceFieldType.ErrorCode, c45116Jxl.A00);
                    c0Zx2.A06("error_message", c45116Jxl.A01);
                    if (str3 != null) {
                        c0Zx2.A06("error_stack", str3);
                    }
                    c0Zx.A02(c0Zx2, "error");
                    c25531Mh.A0M(vHd, "event_target");
                    c25531Mh.A0M(enumC53378NjT, "event_type");
                    c25531Mh.A0S("permission_access_purposes", list);
                    c25531Mh.A0p("instagram_android");
                    c25531Mh.A0R("experience_id", str);
                    c25531Mh.A0Q("user_fbid", A002);
                    c25531Mh.A0o(str2);
                    c25531Mh.A0N(c0Zx, "event_data");
                    c25531Mh.Cht();
                }
            }
        }
    }
}
