package X;

import android.app.Activity;
import java.util.List;

/* renamed from: X.WXw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70466WXw implements X9O {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C26086BgF A01;
    public final /* synthetic */ C70683Wf4 A02;
    public final /* synthetic */ String A03;

    public C70466WXw(Activity activity, C26086BgF c26086BgF, C70683Wf4 c70683Wf4, String str) {
        this.A02 = c70683Wf4;
        this.A00 = activity;
        this.A01 = c26086BgF;
        this.A03 = str;
    }

    @Override // X.X9O
    public final void DYF(C4IC c4ic, Integer num) {
        EnumC53378NjT enumC53378NjT;
        String str;
        C14360o3.A0B(num, 1);
        C70683Wf4 c70683Wf4 = this.A02;
        C4I7 A01 = c70683Wf4.A01(this.A00);
        Long A00 = C4I8.A00(c70683Wf4.A00);
        if (c4ic == C4IC.A06) {
            enumC53378NjT = EnumC53378NjT.A04;
        } else if (c4ic == C4IC.A07) {
            enumC53378NjT = EnumC53378NjT.A05;
        } else {
            enumC53378NjT = EnumC53378NjT.A02;
        }
        VHd vHd = VHd.APP_PERMISSION;
        C26086BgF c26086BgF = this.A01;
        List list = (List) c26086BgF.A02;
        String str2 = c26086BgF.A03;
        String str3 = this.A03;
        String obj = c26086BgF.A00.toString();
        if (c4ic == C4IC.A07) {
            str = "location_partial";
        } else {
            str = null;
        }
        AbstractC37302Gc3.A1U(list, str2);
        if (C18U.A06(C06090Tz.A05, A01.A01, 36318015821715220L)) {
            if (str3 == null) {
                str3 = AbstractC25231BEo.A0p();
            }
            C18920wW c18920wW = A01.A00;
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "device_permissions"), 136);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("access_level", obj);
                c0Zx.A06("data_type", "LOCATION_FOREGROUND");
                c0Zx.A06("auth_status", str);
                c0Zx.A06("listener", null);
                c25531Mh.A0M(vHd, "event_target");
                c25531Mh.A0M(enumC53378NjT, "event_type");
                c25531Mh.A0S("permission_access_purposes", list);
                c25531Mh.A0p("instagram_android");
                c25531Mh.A0R("experience_id", str3);
                c25531Mh.A0Q("user_fbid", A00);
                c25531Mh.A0o(str2);
                c25531Mh.A0N(c0Zx, "event_data");
                c25531Mh.Cht();
            }
        }
        ((X9O) c26086BgF.A01).DYF(c4ic, num);
    }
}
