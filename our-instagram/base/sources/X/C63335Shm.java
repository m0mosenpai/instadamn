package X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Shm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63335Shm {
    public static volatile C63335Shm A0F;
    public final Context A00;
    public final Context A01;
    public final RFi A02;
    public final SX6 A03;
    public final InterfaceC65253Tgj A04;
    public final C60690RMi A05;
    public final C60683RMb A06;
    public final C60684RMc A07;
    public final C60685RMd A08;
    public final SMJ A09;
    public final RMZ A0A;
    public final C60686RMe A0B;
    public final C60687RMf A0C;
    public final C60688RMg A0D;
    public final C60682RMa A0E;

    public static SX6 A00(AbstractC63371Sic abstractC63371Sic) {
        SX6 sx6 = abstractC63371Sic.A00.A03;
        C3U5.A02(sx6);
        return sx6;
    }

    public static void A02(AbstractC60694RMm abstractC60694RMm) {
        C3U5.A03(abstractC60694RMm, "Analytics service not created/initialized");
        C3U5.A08(AbstractC167007dF.A1M(abstractC60694RMm.A00 ? 1 : 0), "Analytics service not initialized");
    }

    public static void A03(C60692RMk c60692RMk) {
        Context context = c60692RMk.A06.A02.A00;
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra("com.google.android.gms.internal.gtm.zzcj", true);
        context.sendOrderedBroadcast(intent, null);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.RMm, X.Sic, X.RMa] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.RFi, X.RFw] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.RMm, X.Sic, X.RMf] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.RMm, X.RMZ, X.Sic] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.RMm, X.Sic, X.RMd] */
    public C63335Shm(Context context, Context context2) {
        C3U5.A03(context, "Application context can't be null");
        C3U5.A02(context2);
        this.A00 = context;
        this.A01 = context2;
        this.A04 = C64233T5i.A00;
        this.A09 = new SMJ(this);
        ?? abstractC63371Sic = new AbstractC63371Sic(this);
        abstractC63371Sic.A0H();
        abstractC63371Sic.A00 = true;
        this.A0C = abstractC63371Sic;
        A02(abstractC63371Sic);
        String str = AbstractC62369S8t.A00;
        StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(str) + 134);
        A0q.append("Google Analytics ");
        A0q.append(str);
        AbstractC63371Sic.A09(abstractC63371Sic, AbstractC166997dE.A0x(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4", A0q), 4);
        C60688RMg c60688RMg = new C60688RMg(this);
        c60688RMg.A0H();
        ((AbstractC60694RMm) c60688RMg).A00 = true;
        this.A0D = c60688RMg;
        ?? abstractC63371Sic2 = new AbstractC63371Sic(this);
        abstractC63371Sic2.A0H();
        abstractC63371Sic2.A00 = true;
        this.A0E = abstractC63371Sic2;
        C60683RMb c60683RMb = new C60683RMb(this);
        ?? abstractC63371Sic3 = new AbstractC63371Sic(this);
        C60690RMi c60690RMi = new C60690RMi(this);
        C60684RMc c60684RMc = new C60684RMc(this);
        ?? abstractC63371Sic4 = new AbstractC63371Sic(this);
        C3U5.A02(context);
        if (SX6.A06 == null) {
            synchronized (SX6.class) {
                if (SX6.A06 == null) {
                    SX6.A06 = new SX6(context);
                }
            }
        }
        SX6 sx6 = SX6.A06;
        sx6.A00 = new TRq(this);
        this.A03 = sx6;
        ?? c60646RFw = new C60646RFw(this);
        c60646RFw.A00 = AbstractC166987dD.A1H();
        abstractC63371Sic3.A0H();
        abstractC63371Sic3.A00 = true;
        this.A08 = abstractC63371Sic3;
        c60690RMi.A0H();
        ((AbstractC60694RMm) c60690RMi).A00 = true;
        this.A05 = c60690RMi;
        c60684RMc.A0H();
        ((AbstractC60694RMm) c60684RMc).A00 = true;
        this.A07 = c60684RMc;
        abstractC63371Sic4.A0H();
        abstractC63371Sic4.A00 = true;
        this.A0A = abstractC63371Sic4;
        C60686RMe c60686RMe = new C60686RMe(this);
        c60686RMe.A0H();
        ((AbstractC60694RMm) c60686RMe).A00 = true;
        this.A0B = c60686RMe;
        c60683RMb.A0H();
        ((AbstractC60694RMm) c60683RMb).A00 = true;
        this.A06 = c60683RMb;
        C60682RMa c60682RMa = c60646RFw.A01.A0E;
        A02(c60682RMa);
        c60682RMa.A0I();
        c60682RMa.A0I();
        if (c60682RMa.A04) {
            c60682RMa.A0I();
            c60646RFw.A02 = c60682RMa.A05;
        }
        c60682RMa.A0I();
        c60646RFw.A01 = true;
        this.A02 = c60646RFw;
        C60692RMk c60692RMk = c60683RMb.A00;
        c60692RMk.A0I();
        C3U5.A09(!c60692RMk.A01, "Analytics backend already started");
        c60692RMk.A01 = true;
        A00(c60692RMk).A02.submit(new TLP(c60692RMk));
    }

    public static C63335Shm A01(Context context) {
        C3U5.A02(context);
        if (A0F == null) {
            synchronized (C63335Shm.class) {
                if (A0F == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C3U5.A02(context);
                    Context applicationContext = context.getApplicationContext();
                    C3U5.A03(applicationContext, "Application context can't be null");
                    C63335Shm c63335Shm = new C63335Shm(applicationContext, applicationContext);
                    A0F = c63335Shm;
                    synchronized (RFi.class) {
                        List list = RFi.A03;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                AbstractC58319PtB.A1N(it);
                            }
                            RFi.A03 = null;
                        }
                    }
                    long A0B = AbstractC58318PtA.A0B(elapsedRealtime);
                    Long l = (Long) SVM.A0A.A00;
                    if (A0B > l.longValue()) {
                        C60687RMf c60687RMf = c63335Shm.A0C;
                        A02(c60687RMf);
                        c60687RMf.A0C(Long.valueOf(A0B), l, "Slow initialization (ms)");
                    }
                }
            }
        }
        return A0F;
    }
}
