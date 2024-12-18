package X;

import com.facebook.endtoend.EndToEnd;
import com.facebook.mobileconfig.MobileConfigFetcher;
import com.facebook.mobileconfig.MobileConfigFetcherHandler;
import com.instagram.debug.quickexperiment.MobileConfigBisection;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1A4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A4 implements MobileConfigFetcher {
    public static final Map A02;
    public final boolean A00;
    public final AbstractC12990ll A01;

    @Override // com.facebook.mobileconfig.MobileConfigFetcher
    public final void fetch(String str, String str2, Map map, final MobileConfigFetcherHandler mobileConfigFetcherHandler, String str3) {
        Integer num;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(map, 2);
        C14360o3.A0B(mobileConfigFetcherHandler, 3);
        final String str4 = (String) A02.get(str2);
        if (str4 == null) {
            mobileConfigFetcherHandler.onComplete(false, AnonymousClass001.A0R("Unknown endpoint:", str2));
            return;
        }
        C25621Ms c25621Ms = new C25621Ms(this.A01, -2);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        if ("get".equals(lowerCase)) {
            num = C05F.A0N;
        } else {
            num = C05F.A01;
        }
        c25621Ms.A09(num);
        c25621Ms.A0E = str4;
        c25621Ms.A9s(str2, "");
        c25621Ms.A0Q(C5LG.A00);
        for (Map.Entry entry : map.entrySet()) {
            c25621Ms.A9s((String) entry.getKey(), (String) entry.getValue());
        }
        c25621Ms.A0R = true;
        final C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C1P1() { // from class: X.5LH
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int i;
                int A03 = C0f9.A03(1782874819);
                C14360o3.A0B(abstractC115105If, 0);
                C5LJ c5lj = (C5LJ) abstractC115105If.A00();
                if (c5lj == null) {
                    C0K8.A0P("IgMobileConfigFetcher", "%s request failed, err: null raw response", str4);
                    mobileConfigFetcherHandler.onComplete(false, "");
                    i = 1230203236;
                } else {
                    C0K8.A0P("IgMobileConfigFetcher", "%s request failed, err: %d", str4, Integer.valueOf(c5lj.A00.A02));
                    mobileConfigFetcherHandler.onComplete(false, c5lj.A00());
                    i = -1450407683;
                }
                C0f9.A0A(i, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                int A03 = C0f9.A03(1474635599);
                C5LJ c5lj = (C5LJ) obj;
                int A032 = C0f9.A03(1491729227);
                C14360o3.A0B(c5lj, 0);
                mobileConfigFetcherHandler.onComplete(true, c5lj.A00());
                C0f9.A0A(-479829471, A032);
                C0f9.A0A(-1203517537, A03);
            }
        };
        A0N.onStart();
        final String str5 = A0N.A05;
        AbstractC18280vF abstractC18280vF = new AbstractC18280vF(str5) { // from class: X.5LI
            @Override // X.AbstractC18280vF
            public final void loggedRun() {
                C1ON c1on = C1ON.this;
                c1on.run();
                c1on.onFinish();
            }

            public final String toString() {
                return C1ON.this.A05;
            }
        };
        if (this.A00 && !EndToEnd.isRunningEndToEndTest() && !str2.equals("mobileconfig_emergency_push")) {
            AbstractC24641Ih.A02.Ep8(abstractC18280vF);
        } else {
            C14120nc.A00().ATO(abstractC18280vF);
        }
    }

    static {
        C06860Yd c06860Yd = new C06860Yd();
        c06860Yd.put(MobileConfigBisection.BISECT_DIR, "launcher/mobileconfig/");
        c06860Yd.put("mobileconfigsessionless", "launcher/mobileconfig/");
        c06860Yd.put("mobileconfiglogging", "launcher/mobileconfiglogging/");
        c06860Yd.put("mobileconfig_qe_info", "launcher/mobileconfigqeinfo/");
        c06860Yd.put("mobileconfig_troubleshooting", "launcher/troubleshooting/");
        c06860Yd.put("mobileconfig_task_import", "launcher/mobileconfigtaskimport/");
        c06860Yd.put("mobileconfig_emergency_push", "launcher/sync_ep_config/");
        c06860Yd.put("mobileconfig_consistency", "launcher/check_consistency/");
        A02 = AbstractC16850sd.A0N(c06860Yd);
    }

    public C1A4(AbstractC12990ll abstractC12990ll, boolean z) {
        this.A01 = abstractC12990ll;
        this.A00 = z;
    }
}
