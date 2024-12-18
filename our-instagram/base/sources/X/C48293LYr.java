package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LYr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48293LYr implements InterfaceC23471Cj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C6FQ A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ String A04;

    public C48293LYr(Activity activity, C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, String str) {
        this.A04 = str;
        this.A02 = c6fq;
        this.A03 = interfaceC103384lE;
        this.A01 = c6fg;
        this.A00 = activity;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        Object obj;
        String str;
        String str2 = this.A04;
        Object obj2 = map.get(str2);
        EnumC172127lh enumC172127lh = EnumC172127lh.A05;
        boolean A1X = AbstractC167007dF.A1X(obj2, enumC172127lh);
        C6FQ c6fq = this.A02;
        C6BQ.A0E(c6fq, this.A03, this.A01, Boolean.valueOf(A1X));
        Activity activity = this.A00;
        boolean equals = str2.equals("android.permission.CAMERA");
        if (equals) {
            UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
            if (activity.getApplicationContext() != null && (obj = map.get("android.permission.CAMERA")) != null) {
                if (obj.equals(enumC172127lh)) {
                    str = "app_permission_grant";
                } else {
                    str = "app_permission_deny";
                }
                AbstractC43594JPz.A1N(new C4I7(new LXL(), userSession), C4I8.A00(userSession), str, "BLOKS_ACTION_REQUEST_PERMISSION_IMPL", AbstractC166987dD.A1J(C4I9.UNKNOWN));
            }
        }
        if (equals && EnumC172127lh.A04.equals(obj2)) {
            WGH.A02(activity, 2131954587);
        }
    }
}
