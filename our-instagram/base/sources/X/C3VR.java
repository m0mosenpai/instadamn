package X;

import android.content.Context;
import android.os.Build;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;

/* renamed from: X.3VR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VR implements InterfaceC12870lZ, InterfaceC13000lm {
    public static final Integer A0A = C05F.A01;
    public long A00;
    public C140286Wg A01;
    public UserSession A02;
    public boolean A03;
    public final Context A04;
    public final C0JO A05;
    public final EvictingQueue A06;
    public final C3VK A07;
    public final String A08;
    public final String A09;

    public static synchronized void A01(C3VR c3vr) {
        synchronized (c3vr) {
            try {
                C140286Wg c140286Wg = c3vr.A01;
                if (c140286Wg != null && !c140286Wg.isDone()) {
                    c140286Wg.cancel(true);
                    c3vr.A01 = null;
                }
            } catch (Exception e) {
                C0w9.A06("ForegroundLocation", "location-stop", e);
            }
        }
    }

    public static void A00(C3VR c3vr) {
        if (!c3vr.A03 && c3vr.A02 != null) {
            try {
                C0JO c0jo = c3vr.A05;
                if (c0jo.now() - c3vr.A00 >= 21600000 && !C218914p.A08()) {
                    Context context = c3vr.A04;
                    if (C1VW.isLocationEnabled(context) && C1VW.isLocationPermitted(context, c3vr.A02, "FOREGROUND_LOCATION_TRACKER")) {
                        synchronized (c3vr) {
                            int i = Build.VERSION.SDK_INT;
                            if ((i < 29 || !C218914p.A09()) && !C218914p.A08()) {
                                C3VK c3vk = c3vr.A07;
                                if (C103724lq.A00(c3vk.A02(), C05F.A0C, null, null, false) == C05F.A0N) {
                                    A01(c3vr);
                                    C140286Wg A06 = c3vk.A06();
                                    c3vr.A01 = A06;
                                    SJE sje = new SJE(null, A0A, 1800000L, 10000.0f, 0.6666667f, 120000L, 120000L, 500L, 7000L);
                                    C62675SLn c62675SLn = new C62675SLn(7000L, 1800000L);
                                    boolean z = true;
                                    if (i >= 29) {
                                        z = false;
                                    }
                                    A06.A04(new SX8(null, sje, null, c62675SLn, null, z, true), "LocationIntegrity");
                                    c3vr.A00 = c0jo.now();
                                    C2OD.A03(new C23547Ac1(c3vr), A06, c3vk.A09());
                                }
                            }
                        }
                        c3vr.A03 = true;
                    }
                }
            } catch (Exception e) {
                C0w9.A06("ForegroundLocation", "location-start", e);
                if (c3vr.A03) {
                    A01(c3vr);
                    c3vr.A03 = false;
                }
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A06.clear();
        AbstractC24641Ih.A02.Ep8(new C217419ja(this));
        C218914p.A06(this);
        this.A02 = null;
    }

    public C3VR(Context context, UserSession userSession) {
        String str;
        this.A04 = context;
        this.A02 = userSession;
        this.A07 = C3VK.A00(context, userSession);
        this.A08 = C16030qx.A02.A05(context);
        C19U A01 = C11830jh.A04.A01(userSession).A01(C19T.A1g);
        if (A01 == null) {
            str = "Not initiated";
        } else {
            str = A01.A01;
        }
        this.A09 = str;
        this.A06 = new EvictingQueue(10);
        this.A05 = RealtimeSinceBootClock.A00;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1244204663);
        AbstractC24641Ih.A02.Ep8(new C217419ja(this));
        C0f9.A0A(-1938926280, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(983655291);
        AbstractC24641Ih.A02.Ep8(new C3VS(this));
        C0f9.A0A(772878599, A03);
    }
}
