package X;

import android.content.Context;
import android.net.ConnectivityManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.IllegalFormatException;
import java.util.concurrent.Executor;

/* renamed from: X.2MT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2MT implements C1TZ {
    public final Context A00;
    public final ConnectivityManager A01;
    public final C2MY A02;
    public final C2MR A03;
    public final C2MB A04;
    public final C10050gI A05;
    public final C2MF A06;
    public final Collection A07;
    public final java.util.Set A08;
    public final Executor A09;

    @Override // X.C1TZ
    public final C58422Pv0 CsF(Integer num) {
        return new C58422Pv0(this.A02, this, this.A03, num, this.A07);
    }

    @Deprecated
    public C2MT(Context context, final C1UI c1ui, C2MR c2mr, final C2MP c2mp, C1RW c1rw, C10050gI c10050gI, C2MF c2mf, Collection collection, Executor executor) {
        C2MI c2mi = new C2MI(c1rw);
        this.A08 = new HashSet();
        this.A06 = c2mf;
        this.A05 = c10050gI;
        this.A04 = c2mi;
        this.A09 = executor;
        this.A00 = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.A01 = connectivityManager;
        this.A03 = c2mr;
        if (connectivityManager == null) {
            C0K8.A0E("AppModuleManager", "Failed to get ConnectivityManager");
        }
        this.A07 = collection;
        collection.add(new C2MN(c1ui, c2mp) { // from class: X.2MU
            public final C1UI A00;
            public final C2MP A01;
            public final String A02 = "353.2.0.49.90";

            @Override // X.C2MN
            public final void A08(C58424Pv2 c58424Pv2, C124725kd c124725kd, Exception exc) {
                boolean z;
                String str;
                boolean z2 = false;
                if (exc == null && c124725kd != null && c124725kd.A03) {
                    z = true;
                    str = "success";
                } else {
                    z = false;
                    str = RealtimeConstants.SEND_FAIL;
                }
                long currentTimeMillis = System.currentTimeMillis();
                C1UI c1ui2 = this.A00;
                C1UM A00 = c1ui2.A00("AppModules::InitialInstallRequestTs-1");
                C1UM A002 = c1ui2.A00("AppModules::InstallLatency-1");
                C1UP c1up = (C1UP) A002;
                C1UP.A03(c1up);
                C1ZT c1zt = new C1ZT(c1up);
                for (String str2 : c58424Pv2.A06) {
                    if (c58424Pv2.A02 == C05F.A00) {
                        this.A01.A05(str2, "last_fg_result", str);
                    }
                    if (z && A00.contains(str2) && !A002.contains(str2)) {
                        c1zt.A08(str2, currentTimeMillis - A00.getLong(str2, 0L));
                        z2 = true;
                    }
                }
                if (c58424Pv2.A02 == C05F.A00) {
                    C2MP c2mp2 = this.A01;
                    c2mp2.A03.execute(new RunnableC58426Pv5(c2mp2));
                }
                if (z2) {
                    c1zt.A03();
                }
            }

            @Override // X.C2MN
            public final void A04(C58424Pv2 c58424Pv2, boolean z, boolean z2) {
                C1UI c1ui2 = this.A00;
                C1UM A00 = c1ui2.A00("AppModules::UninstallInitialRequestTime");
                C1UP c1up = (C1UP) A00;
                C1UP.A03(c1up);
                C1ZT c1zt = new C1ZT(c1up);
                C1UP c1up2 = (C1UP) c1ui2.A00("AppModules::Uninstall");
                C1UP.A03(c1up2);
                C1ZT c1zt2 = new C1ZT(c1up2);
                C1UP c1up3 = (C1UP) c1ui2.A00("AppModules::PrevDownload");
                C1UP.A03(c1up3);
                C1ZT c1zt3 = new C1ZT(c1up3);
                long currentTimeMillis = System.currentTimeMillis();
                for (String str : c58424Pv2.A05) {
                    if (!A00.contains(str)) {
                        c1zt.A08(str, currentTimeMillis);
                    }
                    c1zt2.A0A(str, true);
                    c1zt3.A06(str);
                }
                c1zt.A03();
                c1zt2.A03();
                c1zt3.A03();
            }

            {
                this.A01 = c2mp;
                this.A00 = c1ui;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
            
                if (r6 == X.C05F.A0u) goto L6;
             */
            @Override // X.C2MN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A07(X.C58424Pv2 r27) {
                /*
                    Method dump skipped, instructions count: 402
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2MU.A07(X.Pv2):void");
            }
        });
        final boolean z = true;
        collection.add(new C2MN(z) { // from class: X.2MW
            public final C1HT A00 = new C1HT(30);
            public final Boolean A01;

            @Override // X.C2MN
            public final void A05(C58424Pv2 c58424Pv2) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append(c58424Pv2.A01);
                sb.append(" ");
                sb.append("onDownloadBatchStart");
                sb.append(" ");
                Integer num = c58424Pv2.A02;
                if (num != null) {
                    str = Pv4.A00(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(" ");
                A00(c58424Pv2, sb);
                A01(sb);
            }

            @Override // X.C2MN
            public final void A06(C58424Pv2 c58424Pv2) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append(c58424Pv2.A01);
                sb.append(" ");
                sb.append("onLoadBatchStart");
                sb.append(" ");
                Integer num = c58424Pv2.A02;
                if (num != null) {
                    str = Pv4.A00(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(" ");
                A00(c58424Pv2, sb);
                A01(sb);
            }

            @Override // X.C2MN
            public final void A07(C58424Pv2 c58424Pv2) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append(c58424Pv2.A01);
                sb.append(" ");
                sb.append("onTaskStart");
                sb.append(" ");
                Integer num = c58424Pv2.A02;
                if (num != null) {
                    str = Pv4.A00(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(" ");
                A00(c58424Pv2, sb);
                A01(sb);
            }

            @Override // X.C2MN
            public final void A08(C58424Pv2 c58424Pv2, C124725kd c124725kd, Exception exc) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append(c58424Pv2.A01);
                sb.append(" ");
                sb.append("onTaskComplete");
                sb.append(" ");
                sb.append("[");
                if (c124725kd != null) {
                    sb.append(c124725kd.A03);
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    sb.append(c124725kd.A02);
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    Object obj = c124725kd.A01;
                    if (obj == null) {
                        obj = "";
                    }
                    sb.append(obj);
                }
                sb.append("]");
                sb.append(" ");
                Integer num = c58424Pv2.A02;
                if (num != null) {
                    str = Pv4.A00(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(" ");
                A00(c58424Pv2, sb);
                A01(sb);
            }

            @Override // X.C2MN
            public final void A09(C58424Pv2 c58424Pv2, C62674SLm c62674SLm) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append(c58424Pv2.A01);
                sb.append(" ");
                sb.append("onDownloadBatchComplete");
                sb.append(" ");
                sb.append("result:");
                sb.append(c62674SLm);
                sb.append(" ");
                Integer num = c58424Pv2.A02;
                if (num != null) {
                    str = Pv4.A00(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(" ");
                A00(c58424Pv2, sb);
                A01(sb);
            }

            @Override // X.C2MN
            public final void A0A(C58424Pv2 c58424Pv2, IOException iOException) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append(c58424Pv2.A01);
                sb.append(" ");
                sb.append("onLoadBatchComplete");
                sb.append(" ");
                sb.append("exception: ");
                Object obj = iOException;
                if (iOException == null) {
                    obj = "null";
                }
                sb.append(obj);
                sb.append(" ");
                Integer num = c58424Pv2.A02;
                if (num != null) {
                    str = Pv4.A00(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(" ");
                A00(c58424Pv2, sb);
                A01(sb);
            }

            {
                this.A01 = z;
            }

            public static void A00(C58424Pv2 c58424Pv2, StringBuilder sb) {
                sb.append("modules: [");
                String str = "";
                for (String str2 : c58424Pv2.A06) {
                    sb.append(str);
                    sb.append(str2);
                    if (!c58424Pv2.A05.contains(str2)) {
                        sb.append("(*)");
                    }
                    str = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
                }
                sb.append("]");
            }

            private void A01(StringBuilder sb) {
                try {
                    String obj = sb.toString();
                    if (this.A01.booleanValue()) {
                        C0K8.A0C("ActionQueryTaskListener", obj);
                    }
                    this.A00.A03(String.format("%d: %s", Long.valueOf(System.currentTimeMillis()), obj));
                } catch (IllegalFormatException unused) {
                    this.A00.A03("caught exception when enqueueing");
                }
            }
        });
        this.A02 = new C2MY(context, (ConnectivityManager) context.getSystemService("connectivity"), c10050gI, c2mf);
        final C0g3 A00 = C0g3.A00();
        A00.A04(new C0g4() { // from class: X.2Ma
            @Override // X.C0g4
            public final void DBl(String str, Integer num) {
                if (num == C05F.A0C) {
                    C1UM A002 = c1ui.A00("AppModules::InitialDownloadTime");
                    if (!A002.contains(str)) {
                        C1UP c1up = (C1UP) A002;
                        C1UP.A03(c1up);
                        C1ZT c1zt = new C1ZT(c1up);
                        c1zt.A08(str, System.currentTimeMillis());
                        c1zt.A03();
                    }
                }
            }

            @Override // X.C0g4
            public final void DQ2(String str) {
                boolean A08;
                InterfaceC124715kc[] interfaceC124715kcArr;
                C0g3 c0g3 = A00;
                C2MT c2mt = this;
                Context context2 = c2mt.A00;
                synchronized (c0g3) {
                    c0g3.A06(context2);
                    A08 = c0g3.A08(str);
                }
                if (A08) {
                    C0K8.A0Q("AppModuleManager", "Loaded disabled module: %s", str);
                    return;
                }
                java.util.Set set = c2mt.A08;
                synchronized (set) {
                    interfaceC124715kcArr = (InterfaceC124715kc[]) set.toArray(new InterfaceC124715kc[set.size()]);
                }
                if (0 >= interfaceC124715kcArr.length) {
                } else {
                    throw new NullPointerException("notifyModuleLoaded");
                }
            }
        }, this.A09);
    }
}
