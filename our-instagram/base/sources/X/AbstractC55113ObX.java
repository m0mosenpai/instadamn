package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.ObX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55113ObX {
    public static final C19260xA A00(OKO oko, C1CM c1cm) {
        C14360o3.A0B(c1cm, 0);
        C19260xA c19260xA = new C19260xA();
        c1cm.A04();
        C1CM.A00(c1cm);
        C19260xA.A00(c19260xA, Integer.valueOf(c1cm.A00), "battery_level");
        C1CM.A00(c1cm);
        C19260xA.A00(c19260xA, c1cm.A01, AbstractC111324zv.A00(4004));
        C19260xA.A00(c19260xA, Integer.valueOf(c1cm.A01()), "screen_brightness");
        OKO A01 = OZK.A01(OZK.A02("/proc/self/stat"));
        if (A01 != null && oko != null) {
            C19260xA.A00(c19260xA, Double.valueOf(A01.A00 - oko.A00), "cpu_kernel_time");
            C19260xA.A00(c19260xA, Double.valueOf(A01.A01 - oko.A01), "cpu_user_time");
        }
        return c19260xA;
    }

    public static final void A03(C25531Mh c25531Mh, String str, String str2, String str3, String str4, int i) {
        String A0R = AnonymousClass001.A0R("Reason: ", str2);
        if (str3 != null) {
            A0R = AnonymousClass001.A0g(A0R, ", Description: ", str3);
        }
        if (str4 != null) {
            A0R = AnonymousClass001.A0g(A0R, ", Full Description: ", str4);
        }
        C0K8.A0C("IgLiveBroadcastWaterfall", A0R);
        c25531Mh.A0Q(TraceFieldType.ErrorCode, AbstractC31171DnF.A0V(i));
        c25531Mh.A0R(AbstractC58317Pt9.A00(23), str);
        c25531Mh.A0R("error_info", A0R);
    }

    public static final void A01(Context context, C25531Mh c25531Mh) {
        long j;
        if (C04100Kb.A00(context) >= 2011) {
            j = 1;
        } else {
            j = 0;
        }
        c25531Mh.A0Q("supports_face_filters", Long.valueOf(j));
        c25531Mh.A0Q("has_face_effect", AbstractC167007dF.A0d());
    }

    public static final void A02(Context context, C25531Mh c25531Mh) {
        long j;
        if (C04100Kb.A00(context) >= 2011) {
            j = 1;
        } else {
            j = 0;
        }
        c25531Mh.A0Q("supports_face_filters", Long.valueOf(j));
        c25531Mh.A0Q("has_face_effect", AbstractC167007dF.A0d());
    }
}
