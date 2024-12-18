package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.2CG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CG {
    public static final String A00(String str) {
        C14360o3.A0B(str, 0);
        int A04 = AbstractC001900j.A04(str, '_', 0);
        if (A04 > -1) {
            String substring = str.substring(0, A04);
            C14360o3.A07(substring);
            return substring;
        }
        return str;
    }

    public static final void A01(C72854XpA c72854XpA, Map map, long j) {
        boolean z;
        String str;
        long j2;
        int i;
        boolean z2;
        C72500XfE c72500XfE;
        C72500XfE c72500XfE2;
        synchronized (c72854XpA) {
            z = c72854XpA.A04;
        }
        if (z) {
            str = "";
        } else {
            str = "before_started_playing_";
        }
        String A0R = AnonymousClass001.A0R(str, "stall_time");
        synchronized (c72854XpA) {
            j2 = c72854XpA.A01;
        }
        map.put(A0R, String.valueOf(j2));
        String A0R2 = AnonymousClass001.A0R(str, "stall_count");
        synchronized (c72854XpA) {
            i = c72854XpA.A00;
        }
        map.put(A0R2, String.valueOf(i));
        String A0R3 = AnonymousClass001.A0R(str, "is_stalling");
        synchronized (c72854XpA) {
            z2 = c72854XpA.A06;
        }
        map.put(A0R3, String.valueOf(z2));
        synchronized (c72854XpA) {
            c72500XfE = c72854XpA.A02;
        }
        if (c72500XfE != null) {
            String A0R4 = AnonymousClass001.A0R(str, "first_stall");
            Locale locale = Locale.US;
            Long valueOf = Long.valueOf(c72500XfE.A01);
            Long valueOf2 = Long.valueOf(c72500XfE.A02);
            long j3 = c72500XfE.A00;
            if (j3 <= 0) {
                j3 = j;
            }
            String format = String.format(locale, "position=%d;start_time=%d;end_time=%d", Arrays.copyOf(new Object[]{valueOf, valueOf2, Long.valueOf(j3)}, 3));
            C14360o3.A07(format);
            map.put(A0R4, format);
        }
        synchronized (c72854XpA) {
            c72500XfE2 = c72854XpA.A03;
        }
        if (c72500XfE2 != null) {
            String A0R5 = AnonymousClass001.A0R(str, "last_stall");
            Locale locale2 = Locale.US;
            Long valueOf3 = Long.valueOf(c72500XfE2.A01);
            Long valueOf4 = Long.valueOf(c72500XfE2.A02);
            long j4 = c72500XfE2.A00;
            if (j4 <= 0) {
                j4 = j;
            }
            String format2 = String.format(locale2, "position=%d;start_time=%d;end_time=%d", Arrays.copyOf(new Object[]{valueOf3, valueOf4, Long.valueOf(j4)}, 3));
            C14360o3.A07(format2);
            map.put(A0R5, format2);
        }
    }

    public final C2CF A02(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C2CF c2cf = C2CF.A0F;
        if (c2cf == null) {
            synchronized (this) {
                c2cf = C2CF.A0F;
                if (c2cf == null) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    C2CH c2ch = new C2CH(C18U.A06(c06090Tz, userSession, 36312440954160244L), C18U.A06(c06090Tz, userSession, 36312440954225781L));
                    Handler handler = new Handler(Looper.getMainLooper());
                    C006802i c006802i = C006802i.A0p;
                    C14360o3.A07(c006802i);
                    C2CI c2ci = new C2CI(handler, c006802i);
                    c2cf = new C2CF(context, userSession, c2ch, c2ci, new C2CJ(userSession, c2ch, c2ci));
                    C2CF.A0F = c2cf;
                }
            }
        }
        return c2cf;
    }

    public final void A04(Map map, int i, long j) {
        Map map2 = C2CF.A0E;
        Integer valueOf = Integer.valueOf(i);
        C72854XpA c72854XpA = (C72854XpA) map2.get(valueOf);
        if (c72854XpA != null) {
            A01(c72854XpA, map, j);
        }
        map2.remove(valueOf);
    }

    public final void A03(int i, int i2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            c006802i.markerAnnotate(i, i2, str, str2);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            String str3 = (String) entry2.getKey();
            String str4 = (String) entry2.getValue();
            C006802i c006802i2 = C006802i.A0p;
            C14360o3.A07(c006802i2);
            c006802i2.markerAnnotate(i, i2, str3, str4);
        }
    }
}
