package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Wf4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70683Wf4 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "InstagramDevicePermissionLocationPublicAPI";
    public final UserSession A00;
    public final C70119W4r A01 = new Object();

    public final C4IC A00(Context context, C4IB c4ib, String str, List list) {
        EnumC53378NjT enumC53378NjT;
        AbstractC167007dF.A1E(context, 0, str);
        C4IC A00 = C70119W4r.A00(context, c4ib, AbstractC25229BEm.A1Y(c4ib));
        C4I7 A01 = A01(context);
        Long A002 = C4I8.A00(this.A00);
        if (A00.A01) {
            enumC53378NjT = EnumC53378NjT.A04;
        } else {
            enumC53378NjT = EnumC53378NjT.A02;
        }
        VHd vHd = VHd.APP_STATUS;
        String A0p = AbstractC25231BEo.A0p();
        String str2 = c4ib.A00;
        if (C18U.A06(C06090Tz.A05, A01.A01, 36318015821715220L)) {
            C18920wW c18920wW = A01.A00;
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "device_permissions"), 136);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("access_level", str2);
                c0Zx.A06("data_type", "LOCATION_FOREGROUND");
                c0Zx.A06("auth_status", null);
                c0Zx.A06("listener", null);
                c25531Mh.A0M(vHd, "event_target");
                c25531Mh.A0M(enumC53378NjT, "event_type");
                c25531Mh.A0S("permission_access_purposes", list);
                c25531Mh.A0p("instagram_android");
                c25531Mh.A0R("experience_id", A0p);
                c25531Mh.A0Q("user_fbid", A002);
                c25531Mh.A0o(str);
                c25531Mh.A0N(c0Zx, "event_data");
                c25531Mh.Cht();
            }
        }
        return A00;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.W4r, java.lang.Object] */
    public C70683Wf4(UserSession userSession) {
        this.A00 = userSession;
    }

    public final C4I7 A01(Context context) {
        Object A01 = AbstractC68641VYw.A00.A01(context);
        UserSession userSession = this.A00;
        if (A01 == null || !(A01 instanceof InterfaceC11380iw)) {
            A01 = this;
        }
        return new C4I7((InterfaceC11380iw) A01, userSession);
    }
}
