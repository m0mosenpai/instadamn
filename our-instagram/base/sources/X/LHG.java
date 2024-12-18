package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LHG {
    public static final boolean A02(C47712L4t c47712L4t) {
        if (c47712L4t.A00 > 0.0f && c47712L4t.A01 > 0.0f) {
            long j = c47712L4t.A02;
            if (1 <= j && j < 16000001) {
                long j2 = c47712L4t.A03;
                if (j2 == 0 || j2 <= 16000000) {
                    long j3 = c47712L4t.A04;
                    if (j3 == 0 || j3 <= 16000000) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.model.mediasize.GifUrlImpl, java.lang.Object] */
    public static GifUrlImpl A00(C47712L4t c47712L4t, Object obj) {
        C14360o3.A07(obj);
        String url = c47712L4t.A05.getUrl();
        String str = c47712L4t.A07;
        String str2 = c47712L4t.A06;
        float f = c47712L4t.A01;
        float f2 = c47712L4t.A00;
        Integer valueOf = Integer.valueOf((int) c47712L4t.A02);
        Integer valueOf2 = Integer.valueOf((int) c47712L4t.A04);
        Integer valueOf3 = Integer.valueOf((int) c47712L4t.A03);
        ?? obj2 = new Object();
        obj2.A09 = url;
        obj2.A0A = str;
        obj2.A08 = str2;
        obj2.A03 = Float.valueOf(f);
        obj2.A02 = Float.valueOf(f2);
        obj2.A05 = valueOf;
        obj2.A06 = valueOf2;
        obj2.A04 = valueOf3;
        return obj2;
    }

    public static final ArrayList A01(UserSession userSession, Boolean bool, List list, boolean z) {
        C47712L4t c47712L4t;
        String str;
        boolean A1T;
        DirectAnimatedMediaUser directAnimatedMediaUser;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AA7 aa7 = (AA7) it.next();
            AA8 aa8 = aa7.A00;
            C14360o3.A07(aa8);
            if (C18U.A06(C06090Tz.A05, userSession, 36318088836224903L)) {
                c47712L4t = aa8.A00;
            } else {
                c47712L4t = aa8.A01;
            }
            C14360o3.A0A(c47712L4t);
            C47712L4t c47712L4t2 = aa8.A00;
            if (c47712L4t2 != null && !AbstractC81033jX.A03(c47712L4t2.A05) && (str = c47712L4t2.A06) != null && str.length() != 0 && A02(c47712L4t2) && c47712L4t != null && !AbstractC81033jX.A03(c47712L4t.A05) && A02(c47712L4t)) {
                Boolean bool2 = aa7.A03;
                if (bool != null) {
                    A1T = bool.booleanValue();
                } else {
                    A1T = AbstractC167007dF.A1T(bool2);
                }
                String str2 = aa7.A05;
                GifUrlImpl A00 = A00(c47712L4t, str2);
                A7Q a7q = aa7.A02;
                if (a7q != null) {
                    String str3 = a7q.A00;
                    C14360o3.A07(str3);
                    directAnimatedMediaUser = new DirectAnimatedMediaUser(str3, a7q.A01);
                } else {
                    directAnimatedMediaUser = null;
                }
                DirectAnimatedMediaUser directAnimatedMediaUser2 = null;
                DirectAnimatedMedia directAnimatedMedia = new DirectAnimatedMedia(directAnimatedMediaUser, A00, false, false, str2, A1T);
                String str4 = aa7.A05;
                GifUrlImpl A002 = A00(c47712L4t2, str4);
                A7Q a7q2 = aa7.A02;
                if (a7q2 != null) {
                    String str5 = a7q2.A00;
                    C14360o3.A07(str5);
                    directAnimatedMediaUser2 = new DirectAnimatedMediaUser(str5, a7q2.A01);
                }
                A1E.add(new C45026JwH(directAnimatedMedia, new DirectAnimatedMedia(directAnimatedMediaUser2, A002, false, false, str4, A1T), z));
            }
        }
        return A1E;
    }
}
