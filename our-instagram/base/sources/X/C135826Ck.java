package X;

import com.facebook.distribgw.client.msys.DgwNetworkSessionPluginImpl;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.ohai.OhaiPlugin;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.6Ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135826Ck extends AbstractC135836Cl {
    public C66T A00;
    public C66X A01;
    public Mailbox A02;
    public SlimMailbox A03;
    public final C135806Ci A05;
    public final C6Cr A04 = new C6Cr();
    public final ConcurrentLinkedQueue A07 = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.msys.mca.SlimMailbox A00(final X.C135826Ck r19, com.facebook.msys.mca.MailboxCallback r20) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135826Ck.A00(X.6Ck, com.facebook.msys.mca.MailboxCallback):com.facebook.msys.mca.SlimMailbox");
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.Xk8, java.lang.Object] */
    public static void A01(C135826Ck c135826Ck) {
        int i;
        CQ2[] cq2Arr;
        boolean z;
        synchronized (c135826Ck) {
            boolean z2 = false;
            if (c135826Ck.A04.A00(C05F.A0Y) == EnumC135896Cs.A02) {
                z2 = true;
            }
            AbstractC05810Sj.A03(z2, "clean_up_ready can only result in destroyed phase");
            c135826Ck.A03 = null;
            c135826Ck.A02 = null;
            ConcurrentLinkedQueue concurrentLinkedQueue = c135826Ck.A06;
            cq2Arr = (CQ2[]) concurrentLinkedQueue.toArray(new CQ2[0]);
            concurrentLinkedQueue.clear();
        }
        synchronized (c135826Ck) {
            if (c135826Ck.A00 != null) {
                C66U.A00.getAndIncrement();
                c135826Ck.A00 = null;
            }
        }
        C135806Ci c135806Ci = c135826Ck.A05;
        C6CN c6cn = c135806Ci.A00;
        QuickPerformanceLogger quickPerformanceLogger = c6cn.A01.A08;
        AbstractC136036Di.A00(quickPerformanceLogger).A03();
        NetworkSession A00 = MsysInfraNoSqliteObjectHolder.A00();
        AuthData authData = c6cn.A03;
        if (A00 != null) {
            C135746Cc c135746Cc = (C135746Cc) c135806Ci.A0H.get();
            if (c135746Cc != null) {
                C47142Eg c47142Eg = c135746Cc.A01;
                if (C47142Eg.A00()) {
                    ((OhaiPlugin) c135746Cc.A00.A01(OhaiPlugin.class, C1344565t.A00)).unregister(A00, authData);
                }
                if (((Boolean) c47142Eg.A0N.get()).booleanValue()) {
                    UserSession userSession = c135746Cc.A00;
                    ((DgwNetworkSessionPluginImpl) userSession.A01(DgwNetworkSessionPluginImpl.class, new C9E3(userSession, 12))).unregister(A00, authData);
                }
            }
            AnonymousClass610 anonymousClass610 = c135806Ci.A0G;
            if (anonymousClass610 != null && anonymousClass610.get() != null) {
                MqttNetworkSessionPlugin.get().unregister(A00, authData);
            }
        }
        String str = AbstractC137296Ji.A01;
        if (str != null) {
            synchronized (MsysInfraNoSqliteObjectHolder.class) {
                MsysInfraNoSqliteObjectHolder msysInfraNoSqliteObjectHolder = MsysInfraNoSqliteObjectHolder.A03;
                HashSet hashSet = msysInfraNoSqliteObjectHolder.A00;
                if (hashSet.contains(str) && hashSet.size() > 1) {
                    hashSet.remove(str);
                } else if (hashSet.contains(str)) {
                    if (msysInfraNoSqliteObjectHolder.A02 != null) {
                        msysInfraNoSqliteObjectHolder.A02.dispose();
                    }
                    hashSet.clear();
                    msysInfraNoSqliteObjectHolder.A02 = null;
                    msysInfraNoSqliteObjectHolder.A01 = null;
                }
            }
        }
        AbstractC136036Di.A00(quickPerformanceLogger).A02();
        synchronized (Xk8.class) {
            if (Xk8.A00 == null) {
                Xk8.A00 = new Object();
            }
        }
        String str2 = c6cn.A09;
        if (quickPerformanceLogger != null) {
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(53086316);
            if (str2 != null) {
                z = new File(str2).exists();
            } else {
                z = false;
            }
            withMarker.annotate("db_file_exist_at_end", z);
            withMarker.markerEditingCompleted();
            quickPerformanceLogger.markerEnd(53086316, (short) 2);
        }
        for (CQ2 cq2 : cq2Arr) {
            cq2.A00.onCompletion(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.Xk8, java.lang.Object] */
    public static void A02(C135826Ck c135826Ck) {
        Mailbox mailbox;
        CQ2 cq2;
        boolean z;
        synchronized (c135826Ck) {
            mailbox = c135826Ck.A02;
            cq2 = (CQ2) c135826Ck.A06.peek();
        }
        if (mailbox == null) {
            C0K8.A0N("LazyMailbox", "Mailbox is null, no shutdown has occurred for %s", new RuntimeException("Shutdown skipped"), c135826Ck.A05.A00.A04);
            A01(c135826Ck);
            return;
        }
        AbstractC05810Sj.A00(cq2);
        int intValue = cq2.A01.intValue();
        synchronized (Xk8.class) {
            if (Xk8.A00 == null) {
                Xk8.A00 = new Object();
            }
        }
        C6CN c6cn = c135826Ck.A05.A00;
        QuickPerformanceLogger quickPerformanceLogger = c6cn.A01.A08;
        String str = c6cn.A09;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(53086316);
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(53086316);
            withMarker.annotate("bootstrapper_ver", 3);
            withMarker.annotate("mailbox_ver", 3);
            withMarker.annotate("cleanup_type", intValue);
            if (str != null) {
                z = new File(str).exists();
            } else {
                z = false;
            }
            withMarker.annotate("db_file_exist_at_start", z);
            withMarker.markerEditingCompleted();
        }
        Execution.executeAsync(new K4K(c135826Ck, intValue), null, 1);
    }

    public C135826Ck(C135806Ci c135806Ci) {
        c135806Ci.getClass();
        this.A05 = c135806Ci;
    }
}
