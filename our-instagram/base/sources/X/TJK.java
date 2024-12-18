package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class TJK implements Runnable {
    public final /* synthetic */ C63650SrG A00;

    public TJK(final C63650SrG this$0) {
        this.A00 = this$0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C63649SrF c63649SrF;
        Intent intent;
        String action;
        List<C1113750b> list;
        Executor executor;
        Runnable tjj;
        C63650SrG c63650SrG = this.A00;
        List list2 = c63650SrG.A0A;
        synchronized (list2) {
            z = false;
            c63650SrG.A00 = (Intent) list2.get(0);
        }
        Intent intent2 = c63650SrG.A00;
        if (intent2 != null) {
            String action2 = intent2.getAction();
            int intExtra = c63650SrG.A00.getIntExtra("KEY_START_ID", 0);
            C48442Kl.A00();
            String str = C63650SrG.A0B;
            PowerManager.WakeLock A00 = ST7.A00(c63650SrG.A03, AnonymousClass001.A06(intExtra, action2, " (", ")"));
            try {
                C48442Kl.A00();
                AbstractC09820fg.A00(A00);
                c63649SrF = c63650SrG.A07;
                intent = c63650SrG.A00;
                action = intent.getAction();
            } finally {
            }
            if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
                C48442Kl.A00();
                Context context = c63649SrF.A00;
                C2L1 c2l1 = c63650SrG.A06;
                C2N8 c2n8 = new C2N8(c2l1.A09);
                ArrayList BqY = c2l1.A04.A05().BqY();
                Iterator it = BqY.iterator();
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                while (it.hasNext()) {
                    C48562Ky c48562Ky = ((C48412Ki) it.next()).A0B;
                    z2 |= c48562Ky.A04;
                    z |= c48562Ky.A05;
                    z3 |= c48562Ky.A07;
                    z4 |= AbstractC25229BEm.A1a(c48562Ky.A02, C05F.A00);
                    if (z2 && z && z3 && z4) {
                        break;
                    }
                }
                Intent A0E = AbstractC58318PtA.A0E("androidx.work.impl.background.systemalarm.UpdateProxies");
                A0E.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
                A0E.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
                context.sendBroadcast(A0E);
                ArrayList A11 = AbstractC58319PtB.A11(BqY);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it2 = BqY.iterator();
                while (it2.hasNext()) {
                    C48412Ki c48412Ki = (C48412Ki) it2.next();
                    if (currentTimeMillis >= c48412Ki.A00() && (!(!C14360o3.A0K(C48562Ky.A08, c48412Ki.A0B)) || c2n8.A00(c48412Ki))) {
                        A11.add(c48412Ki);
                    }
                }
                Iterator it3 = A11.iterator();
                while (it3.hasNext()) {
                    C2WP A002 = C2WN.A00((C48412Ki) it3.next());
                    Intent A08 = MSW.A08(context, SystemAlarmService.class);
                    A08.setAction("ACTION_DELAY_MET");
                    C63649SrF.A00(A08, A002);
                    C48442Kl.A00();
                    RunnableC64725TRh.A00(A08, c63650SrG, ((C2LB) c63650SrG.A09).A02, intExtra);
                }
            } else if ("ACTION_RESCHEDULE".equals(action)) {
                C48442Kl.A00();
                c63650SrG.A06.A07();
            } else {
                Bundle extras = intent.getExtras();
                String[] strArr = {"KEY_WORKSPEC_ID"};
                if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                    if ("ACTION_SCHEDULE_WORK".equals(action)) {
                        C2WP c2wp = new C2WP(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                        C48442Kl.A00();
                        String str2 = C63649SrF.A05;
                        WorkDatabase workDatabase = c63650SrG.A06.A04;
                        workDatabase.beginTransaction();
                        try {
                            C48412Ki CHq = workDatabase.A05().CHq(c2wp.A01);
                            if (CHq == null) {
                                C48442Kl.A00();
                                StringBuilder A112 = AbstractC166997dE.A11("Skipping scheduling ");
                                A112.append(c2wp);
                                AbstractC58320PtC.A1O(" because it's no longer in the DB", str2, A112);
                            } else if (CHq.A0E.A00()) {
                                C48442Kl.A00();
                                StringBuilder A113 = AbstractC166997dE.A11("Skipping scheduling ");
                                A113.append(c2wp);
                                AbstractC58320PtC.A1O("because it is finished.", str2, A113);
                            } else {
                                long A003 = CHq.A00();
                                if (!(!C14360o3.A0K(C48562Ky.A08, CHq.A0B))) {
                                    C48442Kl.A00();
                                    AbstractC63042SbL.A00(c63649SrF.A00, workDatabase, c2wp, A003);
                                } else {
                                    C48442Kl.A00();
                                    Context context2 = c63649SrF.A00;
                                    AbstractC63042SbL.A00(context2, workDatabase, c2wp, A003);
                                    Intent A082 = MSW.A08(context2, SystemAlarmService.class);
                                    A082.setAction("ACTION_CONSTRAINTS_CHANGED");
                                    RunnableC64725TRh.A00(A082, c63650SrG, ((C2LB) c63650SrG.A09).A02, intExtra);
                                }
                                workDatabase.setTransactionSuccessful();
                            }
                            workDatabase.endTransaction();
                        } catch (Throwable th) {
                            workDatabase.endTransaction();
                            throw th;
                        }
                    } else if ("ACTION_DELAY_MET".equals(action)) {
                        synchronized (c63649SrF.A02) {
                            try {
                                C2WP c2wp2 = new C2WP(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                                C48442Kl.A00();
                                Map map = c63649SrF.A03;
                                if (!map.containsKey(c2wp2)) {
                                    C63651SrH c63651SrH = new C63651SrH(c63649SrF.A00, c63649SrF.A01.A01(c2wp2), c63650SrG, intExtra);
                                    map.put(c2wp2, c63651SrH);
                                    String str3 = c63651SrH.A08.A01;
                                    c63651SrH.A01 = ST7.A00(c63651SrH.A04, AnonymousClass001.A06(c63651SrH.A03, str3, " (", ")"));
                                    C48442Kl.A00();
                                    AbstractC09820fg.A00(c63651SrH.A01);
                                    C48412Ki CHq2 = c63651SrH.A06.A06.A04.A05().CHq(str3);
                                    if (CHq2 == null) {
                                        executor = c63651SrH.A0A;
                                        tjj = new TJI(c63651SrH);
                                    } else {
                                        boolean z5 = !C14360o3.A0K(C48562Ky.A08, CHq2.A0B);
                                        c63651SrH.A02 = z5;
                                        if (!z5) {
                                            C48442Kl.A00();
                                            executor = c63651SrH.A0A;
                                            tjj = new TJJ(c63651SrH);
                                        } else {
                                            c63651SrH.A0D = C50U.A00(c63651SrH, c63651SrH.A07, CHq2, c63651SrH.A0B);
                                        }
                                    }
                                    executor.execute(tjj);
                                } else {
                                    C48442Kl.A00();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else if ("ACTION_STOP_WORK".equals(action)) {
                        Bundle extras2 = intent.getExtras();
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                            int i = extras2.getInt("KEY_WORKSPEC_GENERATION");
                            ArrayList A17 = AbstractC25225BEi.A17(1);
                            C1113750b A004 = c63649SrF.A01.A00(new C2WP(string, i));
                            list = A17;
                            if (A004 != null) {
                                A17.add(A004);
                                list = A17;
                            }
                        } else {
                            list = c63649SrF.A01.A02(string);
                        }
                        for (C1113750b c1113750b : list) {
                            C48442Kl.A00();
                            InterfaceC49022Mv interfaceC49022Mv = c63650SrG.A05;
                            C14360o3.A0B(c1113750b, 1);
                            interfaceC49022Mv.Eor(c1113750b, -512);
                            Context context3 = c63649SrF.A00;
                            WorkDatabase workDatabase2 = c63650SrG.A06.A04;
                            C2WP c2wp3 = c1113750b.A00;
                            C2M6 A02 = workDatabase2.A02();
                            C2WT C4j = A02.C4j(c2wp3);
                            if (C4j != null) {
                                AbstractC63042SbL.A01(context3, c2wp3, C4j.A01);
                                C48442Kl.A00();
                                String str4 = c2wp3.A01;
                                int i2 = c2wp3.A00;
                                C2PR c2pr = (C2PR) A02;
                                C1YP c1yp = c2pr.A00;
                                c1yp.assertNotSuspendingTransaction();
                                AbstractC29601bb abstractC29601bb = c2pr.A01;
                                InterfaceC37561ot acquire = abstractC29601bb.acquire();
                                acquire.ADp(1, str4);
                                acquire.ADi(2, i2);
                                c1yp.beginTransaction();
                                try {
                                    acquire.ATb();
                                    c1yp.setTransactionSuccessful();
                                    c1yp.endTransaction();
                                    abstractC29601bb.release(acquire);
                                } catch (Throwable th3) {
                                    c1yp.endTransaction();
                                    abstractC29601bb.release(acquire);
                                    throw th3;
                                }
                            }
                            c63650SrG.DEk(c2wp3, false);
                        }
                    } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                        C2WP c2wp4 = new C2WP(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                        boolean z6 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                        C48442Kl.A00();
                        c63649SrF.DEk(c2wp4, z6);
                    } else {
                        C48442Kl.A00();
                        android.util.Log.w(C63649SrF.A05, AbstractC167017dG.A0n(intent, "Ignoring intent ", AbstractC166987dD.A1C()));
                    }
                    try {
                    } finally {
                    }
                } else {
                    C48442Kl.A00();
                    android.util.Log.e(C63649SrF.A05, AnonymousClass001.A11("Invalid request for ", action, " , requires ", "KEY_WORKSPEC_ID", " ."));
                }
            }
        }
    }
}
