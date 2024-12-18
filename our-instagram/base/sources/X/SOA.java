package X;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class SOA {
    public final long A00 = SystemClock.elapsedRealtime();
    public final InterfaceC93784Jk A01;
    public final C4N8 A02;
    public final C62945SYn A03;
    public final C63006SaU A04;
    public final String A05;
    public final RealtimeSinceBootClock A06;
    public final S1D A07;

    public final void A00(Integer num, String str) {
        String str2;
        if (num.intValue() != 0) {
            str2 = "UNEXPECTED_TOPIC";
        } else {
            str2 = "JSON_PARSE_ERROR";
        }
        HashMap A01 = AbstractC62801SRv.A01("event_type", str2);
        if (!TextUtils.isEmpty(str)) {
            A01.put("event_extra_info", str);
        }
        C63302Sh6 c63302Sh6 = new C63302Sh6("fbns_service_event", this.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        c63302Sh6.A03(A01);
        this.A01.reportEvent(c63302Sh6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.R6g, X.Sh6, java.lang.Object] */
    public final void A01(String str, String str2, String str3, Map map, long j, long j2, boolean z, boolean z2) {
        Map map2 = map;
        FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0E;
        C4N8 c4n8 = this.A02;
        EnumC74133Ur[] enumC74133UrArr = EnumC74133Ur.A02;
        boolean z3 = ((C4N7) c4n8).getBoolean("is_employee", false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.A00;
        long j4 = elapsedRealtime - j;
        AtomicLong atomicLong = this.A04.A06;
        long j5 = elapsedRealtime - atomicLong.get();
        long j6 = elapsedRealtime - j2;
        if (j2 < 0) {
            j6 = 0;
        }
        if (map == null) {
            map2 = AbstractC166987dD.A1G();
        }
        map2.put("prev_running", String.valueOf(z));
        map2.put("nsid", Long.toString(atomicLong.get()));
        ?? c63302Sh6 = new C63302Sh6("fbns_push_service_lifecycle", this.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        c63302Sh6.A07 = str;
        c63302Sh6.A06 = str2;
        c63302Sh6.A05 = str3;
        c63302Sh6.A00 = elapsedRealtime;
        c63302Sh6.A04 = j3;
        c63302Sh6.A01 = j4;
        c63302Sh6.A02 = j5;
        c63302Sh6.A03 = j6;
        c63302Sh6.A09 = z2;
        c63302Sh6.A08 = z3;
        c63302Sh6.A03(map2);
        c63302Sh6.toString();
        this.A01.reportEvent(c63302Sh6);
    }

    public SOA(Context context, InterfaceC93784Jk interfaceC93784Jk, C4N8 c4n8, RealtimeSinceBootClock realtimeSinceBootClock, C62945SYn c62945SYn, C63006SaU c63006SaU, S1D s1d) {
        this.A05 = context.getPackageName();
        this.A04 = c63006SaU;
        this.A06 = realtimeSinceBootClock;
        this.A01 = interfaceC93784Jk;
        this.A02 = c4n8;
        this.A03 = c62945SYn;
        this.A07 = s1d;
    }
}
