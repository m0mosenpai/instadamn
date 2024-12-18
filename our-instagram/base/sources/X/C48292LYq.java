package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LYq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48292LYq implements InterfaceC23471Cj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    public C48292LYq(Object obj, Object obj2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A04 = z;
        this.A03 = z2;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        int i;
        String str;
        int i2;
        if (this.A00 != 0) {
            ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) this.A01;
            boolean z = this.A03;
            Activity activity = (Activity) this.A02;
            boolean z2 = this.A04;
            Object obj = map.get("android.permission.CAMERA");
            Object obj2 = map.get("android.permission.RECORD_AUDIO");
            EnumC172127lh enumC172127lh = EnumC172127lh.A05;
            if (obj == enumC172127lh && obj2 == enumC172127lh) {
                viewOnClickListenerC44269JhH.A0A();
                return;
            }
            EnumC172127lh enumC172127lh2 = EnumC172127lh.A04;
            if (obj == enumC172127lh2 && !z) {
                i2 = 2131954587;
            } else if (obj2 != enumC172127lh2 || z2) {
                return;
            } else {
                i2 = 2131966672;
            }
            WGH.A02(activity, i2);
            return;
        }
        C14360o3.A0B(map, 0);
        Object obj3 = map.get("android.permission.CAMERA");
        Object obj4 = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
        EnumC172127lh enumC172127lh3 = EnumC172127lh.A05;
        if (obj3 == enumC172127lh3 && obj4 == enumC172127lh3) {
            C36325G0u.A01((C36325G0u) this.A02);
        } else {
            Activity activity2 = (Activity) this.A01;
            boolean z3 = !AbstractC23451Ch.A05(activity2, "android.permission.CAMERA");
            boolean z4 = !AbstractC23451Ch.A05(activity2, "android.permission.WRITE_EXTERNAL_STORAGE");
            if (z3 && !this.A04) {
                i = 2131954587;
            } else if (z4 && !this.A03) {
                i = 2131974429;
            }
            WGH.A03(activity2, i);
        }
        C36325G0u c36325G0u = (C36325G0u) this.A02;
        Object obj5 = map.get("android.permission.CAMERA");
        if (obj5 == null) {
            return;
        }
        if (obj5 == enumC172127lh3) {
            str = "app_permission_grant";
        } else {
            str = "app_permission_deny";
        }
        UserSession userSession = c36325G0u.A07;
        new C4I7(new LXK(), userSession).A00(new C9CH(C4IA.A05, C4IB.A0C), C4I8.A00(userSession), str, "ADD_AVATAR_HELPER", null, AbstractC166987dD.A1J(C4I9.UNKNOWN));
    }
}
