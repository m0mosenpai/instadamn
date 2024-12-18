package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.24j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C447924j extends C22F {
    public static final C25531Mh A00(C25531Mh c25531Mh, C447924j c447924j, String str) {
        c25531Mh.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        c25531Mh.A0N(c447924j.A0M(), "creation_session_state");
        C22M c22m = c447924j.A04;
        String str2 = c22m.A0L;
        if (str2 == null) {
            str2 = "";
        }
        c25531Mh.A0R("camera_session_id", str2);
        c25531Mh.A0a(c447924j.A0J());
        c25531Mh.A0b(c22m.A09);
        c25531Mh.A0M(c22m.A0C, "surface");
        c25531Mh.A0c(c22m.A0A);
        c25531Mh.A0m(C22F.A08.getModuleName());
        c25531Mh.A0t(C1QM.A00.A02.A00);
        return c25531Mh;
    }
}
