package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9H3, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9H3 {
    public static final List A00;
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final List A05;

    public static final boolean A00(UserSession userSession, String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (userSession != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317397346423929L)) {
                return AbstractC001900j.A0a(C18U.A04(c06090Tz, userSession, 36880347299905857L), str, false);
            }
        }
        return A04.contains(str) || A03.contains(str) || A01.contains(str) || A00.contains(str) || A05.contains(str);
    }

    public static final boolean A01(UserSession userSession, String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (userSession != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317397346423929L)) {
                return AbstractC001900j.A0a(C18U.A04(c06090Tz, userSession, 36880347299971394L), str, false);
            }
        }
        return A04.contains(str);
    }

    static {
        ArrayList A1E = AbstractC166987dD.A1E();
        A04 = A1E;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        A03 = A1E2;
        ArrayList A1E3 = AbstractC166987dD.A1E();
        A01 = A1E3;
        ArrayList A1E4 = AbstractC166987dD.A1E();
        A00 = A1E4;
        ArrayList A1E5 = AbstractC166987dD.A1E();
        A05 = A1E5;
        ArrayList A1E6 = AbstractC166987dD.A1E();
        A02 = A1E6;
        A1E.add("com.spotify.music");
        A1E.add("com.spotify.music.canary");
        A1E.add("com.spotify.s4a");
        A1E.add("174829003346");
        A1E2.add("com.soundcloud.android.alpha");
        A1E2.add("com.soundcloud.android");
        A1E2.add("19507961798");
        A1E3.add("com.apple.android.music");
        A1E3.add("602231459918900");
        A1E4.add("com.amazon.mp3");
        A1E4.add("164159468181390");
        A1E5.add("com.google.android.apps.youtube.music");
        A1E5.add("364181942380876");
        A1E6.addAll(A1E);
        A1E6.addAll(A1E3);
        A1E6.addAll(A1E4);
        A1E6.addAll(A1E5);
    }
}
