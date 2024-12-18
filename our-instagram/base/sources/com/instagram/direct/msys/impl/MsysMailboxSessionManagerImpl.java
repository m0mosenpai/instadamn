package com.instagram.direct.msys.impl;

import X.AbstractC001800i;
import X.AbstractC28481Zj;
import X.AbstractC41851wZ;
import X.AbstractC453326q;
import X.AbstractC47001KqK;
import X.AbstractC47132Ef;
import X.AbstractC75493aG;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C0w9;
import X.C120005by;
import X.C1334460n;
import X.C137756Lx;
import X.C14360o3;
import X.C17060sy;
import X.C18U;
import X.C2FO;
import X.C2FQ;
import X.C41761wQ;
import X.C41871wb;
import X.C47142Eg;
import X.C47272Eu;
import X.C48523LdL;
import X.C60B;
import X.C61A;
import X.C6AG;
import X.C6Eh;
import X.C6Ek;
import X.C75503aH;
import X.C99Q;
import X.C99Y;
import X.C9AJ;
import X.C9AK;
import X.C9AL;
import X.C9AN;
import X.C9AQ;
import X.C9AS;
import X.C9AT;
import X.C9AU;
import X.C9AV;
import X.C9AW;
import X.C9E3;
import X.CU6;
import X.DSA;
import X.InterfaceC1352169w;
import X.LAB;
import X.LG5;
import X.ME4;
import X.MHJ;
import X.RunnableC24451AsW;
import X.RunnableC24870AzV;
import X.RunnableC29575D1c;
import X.RunnableC29576D1d;
import X.RunnableC29577D1e;
import X.RunnableC50019M6i;
import android.content.Context;
import android.os.ConditionVariable;
import com.facebook.instagram.msys.InstagramDatabaseRedactor;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnection;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.mci.TaskTracker;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.armadillo.IGSecureMessageCryptoProvider;
import com.instagram.direct.msys.armadillo.IGSecureMessageMasterKeyProvider;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes4.dex */
public final class MsysMailboxSessionManagerImpl {
    public static final C9AJ Companion = new Object();
    public static final String MEM_OFFLINE_HANDLING_COMPLETION_NOTIFICATION_MESSAGE_COUNT_KEY = "MEMOfflineHandlingCompletionNotificationMessageCountKey";
    public static final String TAG = "MsysMailboxSessionManagerImpl";
    public C41761wQ accountSwitchMailboxSubscriber;
    public final ConcurrentHashMap activationSteps;
    public final AtomicBoolean didInitializeMsysMailboxAfterDelay;
    public final AtomicBoolean initializedACTUser;
    public final AtomicBoolean initializedUser;
    public final UserSession userSession;

    public MsysMailboxSessionManagerImpl(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.userSession = userSession;
        this.initializedUser = new AtomicBoolean(false);
        this.initializedACTUser = new AtomicBoolean(false);
        this.didInitializeMsysMailboxAfterDelay = new AtomicBoolean(false);
        this.activationSteps = new ConcurrentHashMap();
        C9AK c9ak = C9AK.A00;
        C41761wQ c41761wQ = C9AL.A01;
        c41761wQ.A02(C1334460n.A06.A0F(), new C9AN(c9ak));
        this.accountSwitchMailboxSubscriber = c41761wQ;
    }

    private final void onEnsureMsysInitialization(final UserSession userSession, String str) {
        final C9AU A00 = C9AT.A00(userSession);
        final C9AW A002 = C9AV.A00(userSession);
        final C2FQ A003 = C2FO.A00(userSession);
        final IGFOAMessagingReadyLogger A004 = C47272Eu.A00(userSession);
        final C1334460n A01 = C1334460n.A01(userSession, str);
        C14360o3.A07(A01);
        if (!C99Y.A00.A02(userSession, true)) {
            A00.A00(AnonymousClass001.A0R("Attempted msys mailbox init from callsite=", str));
            A002.A02(AnonymousClass001.A0R("Attempted msys mailbox init from callsite=", str));
            A01.A02(str);
            A01.A03(new Consumer() { // from class: X.6KH
                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    Iterator it = AbstractC136086Dq.A00(UserSession.this).A01.entrySet().iterator();
                    while (it.hasNext()) {
                        ((AbstractC25011Ke) ((Map.Entry) it.next()).getValue()).set(C0eB.A00);
                    }
                }
            });
        }
        A01.A03(new Consumer() { // from class: X.6KJ
            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                String str2;
                Mailbox mailbox = (Mailbox) obj;
                C2FQ c2fq = A003;
                c2fq.A04("mailbox_bootstrap_end");
                IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = A004;
                if (iGFOAMessagingReadyLogger != null) {
                    iGFOAMessagingReadyLogger.onLogMailboxBootstrapEnd();
                }
                A00.A00("Mailbox activated");
                A002.A02("Mailbox activated");
                c2fq.A04("mailbox_dep_callback_start");
                if (iGFOAMessagingReadyLogger != null) {
                    iGFOAMessagingReadyLogger.onLogMailboxDepCallbackStart();
                }
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                UserSession userSession2 = userSession;
                C14360o3.A0A(mailbox);
                C1351969u c1351969u = new C1351969u(context, mailbox, userSession2);
                ConcurrentHashMap concurrentHashMap = this.activationSteps;
                String str3 = userSession2.userId;
                C135816Cj c135816Cj = A01.A04;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Object());
                if (c135816Cj.A03) {
                    str2 = "ig_advanced_crypto_transport";
                } else {
                    str2 = "ig_django";
                }
                C0L6.A05(C0LK.A9w, str2);
                UserSession userSession3 = c1351969u.A02;
                C0L6.A05(C0LK.A0M, Boolean.valueOf(C18U.A06(C06090Tz.A06, userSession3, 36318861937089219L)).toString());
                arrayList.add(new InterfaceC1352169w(c1351969u.A01, C25O.A00(userSession3)) { // from class: X.69x
                    public final Mailbox A00;
                    public final C25S A01;

                    {
                        C14360o3.A0B(r3, 1);
                        this.A01 = r3;
                        this.A00 = r2;
                    }

                    @Override // X.InterfaceC1352169w
                    public final /* synthetic */ void Epz() {
                    }

                    @Override // X.InterfaceC1352169w
                    public final /* bridge */ /* synthetic */ void EgM(Object obj2) {
                        C1351969u c1351969u2 = (C1351969u) obj2;
                        C14360o3.A0B(c1351969u2, 0);
                        C42201xA c42201xA = C1334460n.A06;
                        UserSession userSession4 = c1351969u2.A02;
                        userSession4.A01(C6A5.class, new MHH(userSession4, 28));
                        C25S c25s = this.A01;
                        final Mailbox mailbox2 = this.A00;
                        c25s.A00(new C26H(mailbox2) { // from class: X.6A6
                            public final Mailbox A00;

                            @Override // X.C26H
                            public final Map B3s(UserSession userSession5, File file) {
                                Database database;
                                Runnable runnableC49922M2p;
                                C14360o3.A0B(userSession5, 0);
                                C14360o3.A0B(file, 1);
                                HashMap hashMap = new HashMap();
                                InstagramDatabaseRedactor instagramDatabaseRedactor = (InstagramDatabaseRedactor) IBE.A00.getValue();
                                ArrayList arrayList2 = new ArrayList();
                                Mailbox mailbox3 = this.A00;
                                synchronized (mailbox3) {
                                    database = mailbox3.mDatabase;
                                    if (database == null) {
                                        throw new NullPointerException("mDatabase is null when calling Mailbox#getDatabase");
                                    }
                                }
                                ConditionVariable conditionVariable = new ConditionVariable();
                                ArrayList arrayList3 = new ArrayList();
                                C64088Sz4 c64088Sz4 = new C64088Sz4(conditionVariable, instagramDatabaseRedactor, file, arrayList3);
                                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new TV3());
                                DatabaseConnection databaseConnection = database.mReadWriteConnection;
                                if (databaseConnection == null) {
                                    runnableC49922M2p = Xk9.A00;
                                } else {
                                    runnableC49922M2p = new RunnableC49922M2p(c64088Sz4, databaseConnection);
                                }
                                newSingleThreadExecutor.execute(runnableC49922M2p);
                                conditionVariable.block();
                                arrayList2.addAll(arrayList3);
                                File file2 = new File(file, "task_trackers.txt");
                                try {
                                    PrintWriter printWriter = new PrintWriter(file2);
                                    try {
                                        TaskTracker taskTracker = TaskTracker.TRACKER_UTILITY;
                                        synchronized (TaskTracker.class) {
                                            try {
                                                TaskTracker.printTaskTracker(printWriter, TaskTracker.TRACKER_DATABASE);
                                                TaskTracker.printTaskTracker(printWriter, TaskTracker.TRACKER_NETWORK);
                                                TaskTracker.printTaskTracker(printWriter, TaskTracker.TRACKER_UTILITY);
                                                TaskTracker.printTaskTracker(printWriter, TaskTracker.TRACKER_MAIN);
                                            } catch (IOException e) {
                                                C0K8.A0J("TaskTracker", "TaskTracker failed to dump state", e);
                                            }
                                        }
                                        printWriter.flush();
                                        printWriter.close();
                                        arrayList2.add(file2);
                                    } finally {
                                    }
                                } catch (FileNotFoundException e2) {
                                    android.util.Log.w("MsysBugReporter", "Unable to dump task trackers to file", e2);
                                }
                                File file3 = new File(file, "DirectMsysLogs.txt");
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        PrintWriter printWriter2 = new PrintWriter(fileOutputStream);
                                        String[] strArr = O18.A02;
                                        Process exec = Runtime.getRuntime().exec(O18.A01);
                                        C14360o3.A07(exec);
                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                                        while (true) {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                break;
                                            }
                                            printWriter2.println(readLine);
                                        }
                                        printWriter2.flush();
                                        fileOutputStream.close();
                                    } finally {
                                    }
                                } catch (IOException e3) {
                                    C0K8.A0F("IgMsysBugReportLogFileMapProvider", "could not collect logcat logs", e3);
                                }
                                arrayList2.add(file3);
                                C06090Tz c06090Tz = C06090Tz.A05;
                                if (!C18U.A06(c06090Tz, userSession5, 36322705927383473L) && C18U.A06(c06090Tz, userSession5, 36322705926793643L)) {
                                    A00(userSession5, file, C05F.A01, arrayList2);
                                    A00(userSession5, file, C05F.A0C, arrayList2);
                                    A00(userSession5, file, C05F.A0N, arrayList2);
                                    A00(userSession5, file, C05F.A0Y, arrayList2);
                                }
                                if (!C18U.A06(c06090Tz, userSession5, 36322705927317936L) && C18U.A06(c06090Tz, userSession5, 36322705926859180L)) {
                                    File[] A005 = ((C6A5) userSession5.A01(C6A5.class, new MHH(userSession5, 28))).A00(file);
                                    if (A005 == null) {
                                        C0K8.A0C("IgMsysBugReportLogFileMapProvider", "Failed to copy Msys logcat log files");
                                    } else {
                                        AnonymousClass016.A18(arrayList2, A005);
                                    }
                                }
                                arrayList2.size();
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    File file4 = (File) it.next();
                                    hashMap.put(file4.getName(), android.net.Uri.fromFile(file4));
                                    file4.getName();
                                }
                                return hashMap;
                            }

                            @Override // X.C26H
                            public final boolean CLD(UserSession userSession5, String str4) {
                                return true;
                            }

                            @Override // X.C26H
                            public final void Ega(long j) {
                            }

                            @Override // X.C26H
                            public final String getTag() {
                                return "IgMsysBugReportLogFileMapProvider";
                            }

                            private final void A00(UserSession userSession5, File file, Integer num, List list) {
                                String str4;
                                int i;
                                File file2 = new File(file, "msys_debug");
                                if (!file2.exists() && !file2.mkdirs()) {
                                    C0K8.A0C("IgMsysBugReportLogFileMapProvider", "Failed to create msys debug file directory: msys_debug");
                                    return;
                                }
                                int intValue = num.intValue();
                                switch (intValue) {
                                    case 1:
                                        str4 = "reverb_db";
                                        break;
                                    case 2:
                                        str4 = "crypto_db";
                                        break;
                                    case 3:
                                        str4 = "incoming_db";
                                        break;
                                    default:
                                        str4 = "encrypted_backups_db";
                                        break;
                                }
                                File file3 = new File(file2, AnonymousClass001.A0R(str4, ".bin"));
                                InterfaceC28941aX interfaceC28941aX = C28951aY.A00;
                                if (interfaceC28941aX == null) {
                                    C14360o3.A0F("plugin");
                                    throw C00O.createAndThrow();
                                }
                                String obj3 = android.net.Uri.fromFile(file3).toString();
                                C14360o3.A07(obj3);
                                switch (intValue) {
                                    case 1:
                                        i = 1;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    default:
                                        i = 4;
                                        break;
                                }
                                int ECk = interfaceC28941aX.ECk(userSession5, obj3, i);
                                if (ECk == 0) {
                                    list.add(file3);
                                } else {
                                    C0K8.A0O("IgMsysBugReportLogFileMapProvider", "copyAndRedactDatabase for DB %d failed with error code: %d", Integer.valueOf(i), Integer.valueOf(ECk));
                                }
                            }

                            {
                                this.A00 = mailbox2;
                            }
                        });
                        c25s.A00(new C26H(mailbox2) { // from class: X.6A7
                            public final Mailbox A00;

                            @Override // X.C26H
                            public final Map B3s(UserSession userSession5, File file) {
                                C14360o3.A0B(userSession5, 0);
                                C14360o3.A0B(file, 1);
                                HashMap hashMap = new HashMap();
                                ArrayList arrayList2 = new ArrayList();
                                C06090Tz c06090Tz = C06090Tz.A05;
                                if (C18U.A06(c06090Tz, userSession5, 36322705927317936L)) {
                                    if (C18U.A06(c06090Tz, userSession5, 36322705927317936L) && C18U.A06(c06090Tz, userSession5, 36322705926859180L)) {
                                        File[] A005 = ((C6A5) userSession5.A01(C6A5.class, new MHH(userSession5, 28))).A00(file);
                                        if (A005 == null) {
                                            C0K8.A0C("igMsysBugReportLogExtensiveLogFilesMapProvider", "Failed to copy Msys logcat log files");
                                        } else {
                                            AnonymousClass016.A18(arrayList2, A005);
                                        }
                                    }
                                    arrayList2.size();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        File file2 = (File) it.next();
                                        hashMap.put(file2.getName(), android.net.Uri.fromFile(file2));
                                        file2.getName();
                                    }
                                }
                                return hashMap;
                            }

                            @Override // X.C26H
                            public final boolean CLD(UserSession userSession5, String str4) {
                                return true;
                            }

                            @Override // X.C26H
                            public final void Ega(long j) {
                            }

                            @Override // X.C26H
                            public final String getTag() {
                                return "igMsysBugReportLogExtensiveLogFilesMapProvider";
                            }

                            {
                                this.A00 = mailbox2;
                            }
                        });
                        final Integer num = C05F.A01;
                        c25s.A00(new C26H(num) { // from class: X.6A8
                            public final Integer A00;

                            @Override // X.C26H
                            public final Map B3s(UserSession userSession5, File file) {
                                String str4;
                                int i;
                                C14360o3.A0B(userSession5, 0);
                                C14360o3.A0B(file, 1);
                                HashMap hashMap = new HashMap();
                                ArrayList arrayList2 = new ArrayList();
                                C06090Tz c06090Tz = C06090Tz.A05;
                                if (C18U.A06(c06090Tz, userSession5, 36322705927383473L)) {
                                    if (C18U.A06(c06090Tz, userSession5, 36322705926793643L)) {
                                        File file2 = new File(file, "msys_debug");
                                        if (!file2.exists() && !file2.mkdirs()) {
                                            C0K8.A0C("IgMsysBugReportLogAuxDBFileMapProvider", "Failed to create msys debug file directory: msys_debug");
                                        } else {
                                            int intValue = this.A00.intValue();
                                            switch (intValue) {
                                                case 1:
                                                    str4 = "reverb_db";
                                                    break;
                                                case 2:
                                                    str4 = "crypto_db";
                                                    break;
                                                case 3:
                                                    str4 = "incoming_db";
                                                    break;
                                                default:
                                                    str4 = "encrypted_backups_db";
                                                    break;
                                            }
                                            File file3 = new File(file2, AnonymousClass001.A0R(str4, ".bin"));
                                            InterfaceC28941aX interfaceC28941aX = C28951aY.A00;
                                            if (interfaceC28941aX == null) {
                                                C14360o3.A0F("plugin");
                                                throw C00O.createAndThrow();
                                            }
                                            String obj3 = android.net.Uri.fromFile(file3).toString();
                                            C14360o3.A07(obj3);
                                            switch (intValue) {
                                                case 1:
                                                    i = 1;
                                                    break;
                                                case 2:
                                                    i = 2;
                                                    break;
                                                case 3:
                                                    i = 3;
                                                    break;
                                                default:
                                                    i = 4;
                                                    break;
                                            }
                                            int ECk = interfaceC28941aX.ECk(userSession5, obj3, i);
                                            if (ECk == 0) {
                                                arrayList2.add(file3);
                                            } else {
                                                C0K8.A0O("IgMsysBugReportLogAuxDBFileMapProvider", "copyAndRedactDatabase for DB %d failed with error code: %d", Integer.valueOf(i), Integer.valueOf(ECk));
                                            }
                                        }
                                    }
                                    arrayList2.size();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        File file4 = (File) it.next();
                                        hashMap.put(file4.getName(), android.net.Uri.fromFile(file4));
                                        file4.getName();
                                    }
                                }
                                return hashMap;
                            }

                            @Override // X.C26H
                            public final boolean CLD(UserSession userSession5, String str4) {
                                return true;
                            }

                            @Override // X.C26H
                            public final void Ega(long j) {
                            }

                            @Override // X.C26H
                            public final String getTag() {
                                return "IgMsysBugReportLogAuxDBFileMapProvider";
                            }

                            {
                                this.A00 = num;
                            }
                        });
                        final Integer num2 = C05F.A0C;
                        c25s.A00(new C26H(num2) { // from class: X.6A8
                            public final Integer A00;

                            @Override // X.C26H
                            public final Map B3s(UserSession userSession5, File file) {
                                String str4;
                                int i;
                                C14360o3.A0B(userSession5, 0);
                                C14360o3.A0B(file, 1);
                                HashMap hashMap = new HashMap();
                                ArrayList arrayList2 = new ArrayList();
                                C06090Tz c06090Tz = C06090Tz.A05;
                                if (C18U.A06(c06090Tz, userSession5, 36322705927383473L)) {
                                    if (C18U.A06(c06090Tz, userSession5, 36322705926793643L)) {
                                        File file2 = new File(file, "msys_debug");
                                        if (!file2.exists() && !file2.mkdirs()) {
                                            C0K8.A0C("IgMsysBugReportLogAuxDBFileMapProvider", "Failed to create msys debug file directory: msys_debug");
                                        } else {
                                            int intValue = this.A00.intValue();
                                            switch (intValue) {
                                                case 1:
                                                    str4 = "reverb_db";
                                                    break;
                                                case 2:
                                                    str4 = "crypto_db";
                                                    break;
                                                case 3:
                                                    str4 = "incoming_db";
                                                    break;
                                                default:
                                                    str4 = "encrypted_backups_db";
                                                    break;
                                            }
                                            File file3 = new File(file2, AnonymousClass001.A0R(str4, ".bin"));
                                            InterfaceC28941aX interfaceC28941aX = C28951aY.A00;
                                            if (interfaceC28941aX == null) {
                                                C14360o3.A0F("plugin");
                                                throw C00O.createAndThrow();
                                            }
                                            String obj3 = android.net.Uri.fromFile(file3).toString();
                                            C14360o3.A07(obj3);
                                            switch (intValue) {
                                                case 1:
                                                    i = 1;
                                                    break;
                                                case 2:
                                                    i = 2;
                                                    break;
                                                case 3:
                                                    i = 3;
                                                    break;
                                                default:
                                                    i = 4;
                                                    break;
                                            }
                                            int ECk = interfaceC28941aX.ECk(userSession5, obj3, i);
                                            if (ECk == 0) {
                                                arrayList2.add(file3);
                                            } else {
                                                C0K8.A0O("IgMsysBugReportLogAuxDBFileMapProvider", "copyAndRedactDatabase for DB %d failed with error code: %d", Integer.valueOf(i), Integer.valueOf(ECk));
                                            }
                                        }
                                    }
                                    arrayList2.size();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        File file4 = (File) it.next();
                                        hashMap.put(file4.getName(), android.net.Uri.fromFile(file4));
                                        file4.getName();
                                    }
                                }
                                return hashMap;
                            }

                            @Override // X.C26H
                            public final boolean CLD(UserSession userSession5, String str4) {
                                return true;
                            }

                            @Override // X.C26H
                            public final void Ega(long j) {
                            }

                            @Override // X.C26H
                            public final String getTag() {
                                return "IgMsysBugReportLogAuxDBFileMapProvider";
                            }

                            {
                                this.A00 = num2;
                            }
                        });
                        final Integer num3 = C05F.A0N;
                        c25s.A00(new C26H(num3) { // from class: X.6A8
                            public final Integer A00;

                            @Override // X.C26H
                            public final Map B3s(UserSession userSession5, File file) {
                                String str4;
                                int i;
                                C14360o3.A0B(userSession5, 0);
                                C14360o3.A0B(file, 1);
                                HashMap hashMap = new HashMap();
                                ArrayList arrayList2 = new ArrayList();
                                C06090Tz c06090Tz = C06090Tz.A05;
                                if (C18U.A06(c06090Tz, userSession5, 36322705927383473L)) {
                                    if (C18U.A06(c06090Tz, userSession5, 36322705926793643L)) {
                                        File file2 = new File(file, "msys_debug");
                                        if (!file2.exists() && !file2.mkdirs()) {
                                            C0K8.A0C("IgMsysBugReportLogAuxDBFileMapProvider", "Failed to create msys debug file directory: msys_debug");
                                        } else {
                                            int intValue = this.A00.intValue();
                                            switch (intValue) {
                                                case 1:
                                                    str4 = "reverb_db";
                                                    break;
                                                case 2:
                                                    str4 = "crypto_db";
                                                    break;
                                                case 3:
                                                    str4 = "incoming_db";
                                                    break;
                                                default:
                                                    str4 = "encrypted_backups_db";
                                                    break;
                                            }
                                            File file3 = new File(file2, AnonymousClass001.A0R(str4, ".bin"));
                                            InterfaceC28941aX interfaceC28941aX = C28951aY.A00;
                                            if (interfaceC28941aX == null) {
                                                C14360o3.A0F("plugin");
                                                throw C00O.createAndThrow();
                                            }
                                            String obj3 = android.net.Uri.fromFile(file3).toString();
                                            C14360o3.A07(obj3);
                                            switch (intValue) {
                                                case 1:
                                                    i = 1;
                                                    break;
                                                case 2:
                                                    i = 2;
                                                    break;
                                                case 3:
                                                    i = 3;
                                                    break;
                                                default:
                                                    i = 4;
                                                    break;
                                            }
                                            int ECk = interfaceC28941aX.ECk(userSession5, obj3, i);
                                            if (ECk == 0) {
                                                arrayList2.add(file3);
                                            } else {
                                                C0K8.A0O("IgMsysBugReportLogAuxDBFileMapProvider", "copyAndRedactDatabase for DB %d failed with error code: %d", Integer.valueOf(i), Integer.valueOf(ECk));
                                            }
                                        }
                                    }
                                    arrayList2.size();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        File file4 = (File) it.next();
                                        hashMap.put(file4.getName(), android.net.Uri.fromFile(file4));
                                        file4.getName();
                                    }
                                }
                                return hashMap;
                            }

                            @Override // X.C26H
                            public final boolean CLD(UserSession userSession5, String str4) {
                                return true;
                            }

                            @Override // X.C26H
                            public final void Ega(long j) {
                            }

                            @Override // X.C26H
                            public final String getTag() {
                                return "IgMsysBugReportLogAuxDBFileMapProvider";
                            }

                            {
                                this.A00 = num3;
                            }
                        });
                        final Integer num4 = C05F.A0Y;
                        c25s.A00(new C26H(num4) { // from class: X.6A8
                            public final Integer A00;

                            @Override // X.C26H
                            public final Map B3s(UserSession userSession5, File file) {
                                String str4;
                                int i;
                                C14360o3.A0B(userSession5, 0);
                                C14360o3.A0B(file, 1);
                                HashMap hashMap = new HashMap();
                                ArrayList arrayList2 = new ArrayList();
                                C06090Tz c06090Tz = C06090Tz.A05;
                                if (C18U.A06(c06090Tz, userSession5, 36322705927383473L)) {
                                    if (C18U.A06(c06090Tz, userSession5, 36322705926793643L)) {
                                        File file2 = new File(file, "msys_debug");
                                        if (!file2.exists() && !file2.mkdirs()) {
                                            C0K8.A0C("IgMsysBugReportLogAuxDBFileMapProvider", "Failed to create msys debug file directory: msys_debug");
                                        } else {
                                            int intValue = this.A00.intValue();
                                            switch (intValue) {
                                                case 1:
                                                    str4 = "reverb_db";
                                                    break;
                                                case 2:
                                                    str4 = "crypto_db";
                                                    break;
                                                case 3:
                                                    str4 = "incoming_db";
                                                    break;
                                                default:
                                                    str4 = "encrypted_backups_db";
                                                    break;
                                            }
                                            File file3 = new File(file2, AnonymousClass001.A0R(str4, ".bin"));
                                            InterfaceC28941aX interfaceC28941aX = C28951aY.A00;
                                            if (interfaceC28941aX == null) {
                                                C14360o3.A0F("plugin");
                                                throw C00O.createAndThrow();
                                            }
                                            String obj3 = android.net.Uri.fromFile(file3).toString();
                                            C14360o3.A07(obj3);
                                            switch (intValue) {
                                                case 1:
                                                    i = 1;
                                                    break;
                                                case 2:
                                                    i = 2;
                                                    break;
                                                case 3:
                                                    i = 3;
                                                    break;
                                                default:
                                                    i = 4;
                                                    break;
                                            }
                                            int ECk = interfaceC28941aX.ECk(userSession5, obj3, i);
                                            if (ECk == 0) {
                                                arrayList2.add(file3);
                                            } else {
                                                C0K8.A0O("IgMsysBugReportLogAuxDBFileMapProvider", "copyAndRedactDatabase for DB %d failed with error code: %d", Integer.valueOf(i), Integer.valueOf(ECk));
                                            }
                                        }
                                    }
                                    arrayList2.size();
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        File file4 = (File) it.next();
                                        hashMap.put(file4.getName(), android.net.Uri.fromFile(file4));
                                        file4.getName();
                                    }
                                }
                                return hashMap;
                            }

                            @Override // X.C26H
                            public final boolean CLD(UserSession userSession5, String str4) {
                                return true;
                            }

                            @Override // X.C26H
                            public final void Ega(long j) {
                            }

                            @Override // X.C26H
                            public final String getTag() {
                                return "IgMsysBugReportLogAuxDBFileMapProvider";
                            }

                            {
                                this.A00 = num4;
                            }
                        });
                    }
                });
                arrayList.add(new Object());
                arrayList.add(new Object());
                if (c135816Cj.A04) {
                    arrayList.add(new Object());
                }
                C47142Eg A005 = AbstractC47132Ef.A00(userSession3);
                if (A005.A02() && ((Boolean) A005.A01.A00()).booleanValue()) {
                    arrayList.add(new C49201LpI());
                }
                C135806Ci c135806Ci = c135816Cj.A01;
                boolean z = !((Boolean) c135806Ci.A0L.get()).booleanValue();
                List list = (List) c135806Ci.A07.get();
                if (z && list != null && !list.isEmpty()) {
                    arrayList.add(new Object());
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1352169w) it.next()).EgM(c1351969u);
                }
                concurrentHashMap.put(str3, arrayList);
                c2fq.A04("mailbox_dep_callback_end");
                if (iGFOAMessagingReadyLogger != null) {
                    iGFOAMessagingReadyLogger.onLogMailboxDepCallbackEnd();
                }
            }
        });
    }

    private final void onMaybeInitializeACT(final UserSession userSession, final String str) {
        final C2FQ A00 = C2FO.A00(userSession);
        final IGFOAMessagingReadyLogger A002 = C47272Eu.A00(userSession);
        final C9AU A003 = C9AT.A00(userSession);
        final C9AW A004 = C9AV.A00(userSession);
        final C1334460n A01 = C1334460n.A01(userSession, str);
        C14360o3.A07(A01);
        if (AbstractC47132Ef.A00(userSession).A02()) {
            subscribeToOfflineSyncEventsAndLog(userSession);
            if (C99Y.A00.A02(userSession, true)) {
                A003.A00("[mem/msys dec.] Started decoupled MEM login");
                A004.A02("Started decoupled MEM login");
                C99Q.A01("MEMSessionManager.createAndLogin").execute(new RunnableC50019M6i(userSession, A004, A003, this, str));
            }
            A01.A03(new Consumer() { // from class: X.6Lr
                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    Mailbox mailbox = (Mailbox) obj;
                    final C9AU c9au = A003;
                    String str2 = str;
                    c9au.A00(AnonymousClass001.A0R("Attempted ACT init from callsite=", str2));
                    final C9AW c9aw = A004;
                    c9aw.A02(AnonymousClass001.A0R("Attempted ACT init from callsite=", str2));
                    C2FQ c2fq = A00;
                    c2fq.A04("rx_act_callback_start");
                    IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = A002;
                    if (iGFOAMessagingReadyLogger != null) {
                        iGFOAMessagingReadyLogger.onLogRxActCallbackStart();
                    }
                    C137266Jf c137266Jf = new C137266Jf(mailbox);
                    C6AG A005 = C6AE.A00(C42221xC.A09(c137266Jf), userSession, A01.A04, null, str2);
                    final C41761wQ c41761wQ = new C41761wQ(null);
                    c41761wQ.A02(A005.A00(), new InterfaceC42241xE() { // from class: X.9HG
                        @Override // X.InterfaceC42241xE
                        public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                            c9au.A00("ACT init completed");
                            c9aw.A02("ACT init completed");
                            c41761wQ.A01();
                        }
                    });
                    c2fq.A04("rx_act_callback_end");
                    if (iGFOAMessagingReadyLogger != null) {
                        iGFOAMessagingReadyLogger.onLogRxActCallbackEnd();
                    }
                }
            });
        }
        A01.A03(new Consumer() { // from class: X.6KK
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.instagram.direct.msys.armadillo.IGSecureMessageMasterKeyProvider] */
            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Mailbox mailbox = (Mailbox) obj;
                C2FQ c2fq = A00;
                c2fq.A04("secure_message_crypto_callback_start");
                IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = A002;
                if (iGFOAMessagingReadyLogger != null) {
                    iGFOAMessagingReadyLogger.onLogSecureMessageCryptoCallbackStart();
                }
                C135816Cj c135816Cj = A01.A04;
                if (c135816Cj.A03) {
                    UserSession userSession2 = userSession;
                    synchronized (C60B.class) {
                        synchronized (C60C.class) {
                            try {
                                if (!C60C.A00) {
                                    Long.parseLong(userSession2.userId);
                                    C60C.A00 = true;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        try {
                            if (!IGSecureMessageCryptoProvider.sInitialized) {
                                IGSecureMessageCryptoProvider.nativeRegisterCryptoProviderHandler();
                                IGSecureMessageCryptoProvider.sInitialized = true;
                            }
                            ?? obj2 = new Object();
                            C60B.A00 = obj2;
                            synchronized (obj2) {
                                if (!IGSecureMessageMasterKeyProvider.sInitialized) {
                                    IGSecureMessageMasterKeyProvider.nativeRegisterMasterKeyProviderHandler();
                                    IGSecureMessageMasterKeyProvider.sInitialized = true;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C60G c60g = C60G.$redex_init_class;
                    C14360o3.A0A(mailbox);
                    boolean A06 = C18U.A06(C06090Tz.A05, userSession2, 36330673090347995L);
                    C14360o3.A0B(userSession2, 0);
                    C14360o3.A0B(mailbox, 1);
                    Long BTC = C08730cb.A00(userSession2).A00().BTC();
                    if (BTC == null) {
                        if (A06) {
                            C0w9.A01.EmN("android_null_eimu", "Messaging user fbid is null while initiating rsys crypto context");
                            C18950wb.A01.AEp("android_null_eimu", 817900784).report();
                        } else {
                            AbstractC47102Krx.A00(new C57750Pjd(31, userSession2, mailbox), userSession2);
                        }
                    } else {
                        userSession2.A04(C60G.class, new C60G(mailbox, BTC.longValue()));
                    }
                }
                if (c135816Cj.A05) {
                    AbstractC28481Zj abstractC28481Zj = AbstractC28481Zj.A00;
                    UserSession userSession3 = userSession;
                    C14360o3.A0A(mailbox);
                    abstractC28481Zj.A01(mailbox, userSession3);
                }
                c2fq.A04("secure_message_crypto_callback_end");
                if (iGFOAMessagingReadyLogger != null) {
                    iGFOAMessagingReadyLogger.onLogSecureMessageCryptoCallbackEnd();
                }
            }
        });
    }

    public void deactivateUserInstanceSequence(boolean z, Runnable runnable) {
        List A0Y;
        C41871wb A01 = AbstractC41851wZ.A01(this.userSession);
        C47142Eg A00 = AbstractC47132Ef.A00(this.userSession);
        if (this.userSession.A05(C120005by.class) && this.userSession.A00(C120005by.class) != null) {
            TraceLogger.broadcastEvent(10000009, 0, null);
        }
        AbstractC28481Zj.A00.A00();
        C60B.A00();
        Iterable iterable = (Iterable) this.activationSteps.remove(this.userSession.userId);
        if (iterable != null && (A0Y = AbstractC001800i.A0Y(iterable)) != null) {
            Iterator it = A0Y.iterator();
            while (it.hasNext()) {
                ((InterfaceC1352169w) it.next()).Epz();
            }
        }
        teardownACT(this.userSession, z, ((Number) A00.A19.A00()).longValue(), new RunnableC24870AzV(A01, A00, this, new ME4(19, A01, this, runnable), z));
        this.initializedUser.set(false);
        this.initializedACTUser.set(false);
        this.didInitializeMsysMailboxAfterDelay.set(false);
    }

    public void initialize(final String str) {
        C14360o3.A0B(str, 0);
        C99Q.A01("MsysMailboxSessionManagerImpl.ensureMsysInitialization").execute(new Runnable() { // from class: X.9AP
            @Override // java.lang.Runnable
            public final void run() {
                MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl = MsysMailboxSessionManagerImpl.this;
                msysMailboxSessionManagerImpl.ensureMsysInitialization(msysMailboxSessionManagerImpl.userSession, str);
            }
        });
        C75503aH A00 = AbstractC75493aG.A00(this.userSession);
        A00.A01.add(new WeakReference(C99Y.A00));
    }

    public void maybeInitializeACT(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        C2FQ A00 = C2FO.A00(this.userSession);
        if (!AbstractC453326q.A04(this.userSession) && this.userSession.isStopped()) {
            C0w9.A03(TAG, "Trying to initialize ACT for a stopped user session in MsysPluginImpl.");
            str2 = "stopped_user_session_before_act_login";
        } else if (this.initializedACTUser.getAndSet(true)) {
            str2 = "act_initialized_before_act_login";
        } else {
            onMaybeInitializeACT(this.userSession, str);
            return;
        }
        A00.A05(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logMemLoginEvent(C9AU c9au, C9AW c9aw, String str) {
        c9au.A00(AnonymousClass001.A0R("[mem/msys dec.] ", str));
        c9aw.A02(str);
    }

    private final void setMailboxDeactivationOnSessionEnding() {
        C6Ek.A00(this.userSession).A00(new C9AS() { // from class: X.9AR
            @Override // X.C9AS
            public final void CuN(boolean z) {
                C91Y A00 = C91Y.A0A.A00();
                if (A00 != null) {
                    String str = MsysMailboxSessionManagerImpl.this.userSession.userId;
                    C14360o3.A0B(str, 0);
                    A00.A04.add(str);
                }
                JZK A002 = JZK.A0A.A00();
                if (A002 != null) {
                    String str2 = MsysMailboxSessionManagerImpl.this.userSession.userId;
                    C14360o3.A0B(str2, 0);
                    A002.A03.add(str2);
                }
                MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl = MsysMailboxSessionManagerImpl.this;
                if (((Boolean) AbstractC47132Ef.A00(msysMailboxSessionManagerImpl.userSession).A0A.get()).booleanValue()) {
                    msysMailboxSessionManagerImpl.deactivateUserInstanceSequence(z, new RunnableC24454AsZ(msysMailboxSessionManagerImpl));
                } else {
                    msysMailboxSessionManagerImpl.deactivateUserInstance(z, new RunnableC24455Asa(msysMailboxSessionManagerImpl));
                }
            }
        });
    }

    private final void subscribeToOfflineSyncEventsAndLog(final UserSession userSession) {
        if (C17060sy.A01.A01(userSession).BTC() != null) {
            SessionedNotificationCenter sessionedNotificationCenter = C61A.A02(userSession, true).getSessionedNotificationCenter();
            C14360o3.A07(sessionedNotificationCenter);
            sessionedNotificationCenter.addObserver(new C6Eh() { // from class: X.9AZ
                @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
                public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
                    Object obj;
                    UserSession userSession2 = UserSession.this;
                    C2FQ A00 = C2FO.A00(userSession2);
                    int i = 0;
                    if (map != null && (obj = map.get(MsysMailboxSessionManagerImpl.MEM_OFFLINE_HANDLING_COMPLETION_NOTIFICATION_MESSAGE_COUNT_KEY)) != null) {
                        A00.A06("message_count", obj.toString());
                        Integer A0i = AbstractC003100w.A0i(obj.toString());
                        if (A0i != null) {
                            i = A0i.intValue();
                        }
                    }
                    IGFOAMessagingReadyLogger A002 = C47272Eu.A00(userSession2);
                    if (A002 != null) {
                        A002.onOfflineCompletion(i);
                    }
                    A00.A03(i);
                    AbstractC47242Eq.A00(userSession2).A00("Armadillo");
                    C14360o3.A0B(userSession2, 0);
                    C99H c99h = (C99H) userSession2.A01(C99H.class, new MHJ(userSession2, 36));
                    C006802i c006802i = c99h.A02;
                    int i2 = c99h.A01;
                    c006802i.markerPoint(20127518, i2, "xplat_offline_sync_end");
                    c006802i.markerEnd(20127518, i2, (short) 2);
                    C129115sX.A00.A00(userSession2);
                    C61A.A02(userSession2, true).getSessionedNotificationCenter().removeObserver(this, "MEMOfflineHandlingCompletionNotification", null);
                }
            }, "MEMOfflineHandlingCompletionNotification", 1, null);
            sessionedNotificationCenter.addObserver(new C6Eh() { // from class: X.9Aa
                @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
                public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
                    C6AI A00 = C6AH.A00(UserSession.this);
                    A00.A08 = true;
                    A00.A0E.accept(false);
                }
            }, "MEMOfflineHandlingPreviewNotification", 1, null);
            sessionedNotificationCenter.addObserver(new C6Eh() { // from class: X.9Ab
                @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
                public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
                    Object obj;
                    int i;
                    C6AI A00 = C6AH.A00(UserSession.this);
                    if (map != null && (obj = map.get(MsysMailboxSessionManagerImpl.MEM_OFFLINE_HANDLING_COMPLETION_NOTIFICATION_MESSAGE_COUNT_KEY)) != null) {
                        Integer A0i = AbstractC003100w.A0i(obj.toString());
                        if (A0i != null) {
                            i = A0i.intValue();
                        } else {
                            i = 0;
                        }
                        A00.A07 = true;
                        A00.A02 = i;
                        A00.A0E.accept(true);
                    }
                }
            }, "MEMOfflineHandlingCompletionNotification", 1, null);
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36318861939514079L)) {
                SessionedNotificationCenter sessionedNotificationCenter2 = C61A.A02(userSession, true).getSessionedNotificationCenter();
                C14360o3.A07(sessionedNotificationCenter2);
                userSession.A01(C48523LdL.class, new MHJ(sessionedNotificationCenter2, 18));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void teardownMessageProcessor(UserSession userSession, long j, Runnable runnable) {
        if (!userSession.A05(LAB.class)) {
            runnable.run();
            return;
        }
        CU6 cu6 = new CU6(runnable, j);
        CompletableFuture A00 = AbstractC47001KqK.A00(userSession).A00();
        cu6.A00();
        final DSA dsa = new DSA(18, runnable, cu6);
        A00.whenComplete(new BiConsumer() { // from class: X.B1n
            @Override // java.util.function.BiConsumer
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                InterfaceC16620sF.this.invoke(obj, obj2);
            }
        });
    }

    public void deactivateUserInstance(boolean z, Runnable runnable) {
        C1334460n c1334460n;
        LG5 lg5;
        C137756Lx c137756Lx;
        C6AG c6ag;
        List A0Y;
        C41871wb A01 = AbstractC41851wZ.A01(this.userSession);
        if (this.userSession.A05(C120005by.class) && this.userSession.A00(C120005by.class) != null) {
            TraceLogger.broadcastEvent(10000009, 0, null);
        }
        AbstractC28481Zj.A00.A00();
        C60B.A00();
        Iterable iterable = (Iterable) this.activationSteps.remove(this.userSession.userId);
        if (iterable != null && (A0Y = AbstractC001800i.A0Y(iterable)) != null) {
            Iterator it = A0Y.iterator();
            while (it.hasNext()) {
                ((InterfaceC1352169w) it.next()).Epz();
            }
        }
        if (A01.A05(C6AG.class) && (c6ag = (C6AG) A01.A00(C6AG.class)) != null) {
            c6ag.A01(z, new Runnable() { // from class: X.8w2
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        if (A01.A05(C137756Lx.class) && (c137756Lx = (C137756Lx) A01.A00(C137756Lx.class)) != null) {
            c137756Lx.onUserSessionWillEnd(z);
        }
        final C9E3 c9e3 = new C9E3(runnable, 18);
        if (!A01.A05(LG5.class) && !A01.A05(C1334460n.class)) {
            c9e3.invoke();
        }
        if (A01.A05(LG5.class) && (lg5 = (LG5) A01.A00(LG5.class)) != null) {
            lg5.A00(z, new Runnable() { // from class: X.8w8
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC16820sZ.this.invoke();
                }
            });
        }
        if (A01.A05(C1334460n.class) && (c1334460n = (C1334460n) A01.A00(C1334460n.class)) != null) {
            c1334460n.A04(z, new RunnableC24451AsW(c9e3));
        }
        this.initializedUser.set(false);
        this.initializedACTUser.set(false);
        this.didInitializeMsysMailboxAfterDelay.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureMsysInitialization(UserSession userSession, String str) {
        String str2;
        C2FQ A00 = C2FO.A00(userSession);
        A00.A04("mailbox_bootstrap_start");
        IGFOAMessagingReadyLogger A002 = C47272Eu.A00(userSession);
        if (A002 != null) {
            A002.onLogMailboxBootstrapStart();
        }
        if (!AbstractC453326q.A04(userSession) && userSession.isStopped()) {
            C0w9.A03(TAG, "Trying to initialize msys for a stopped user session in MsysPluginImpl.");
            str2 = "stopped_user_session_before_mailbox_bootstrap";
        } else if (this.initializedUser.getAndSet(true)) {
            str2 = "act_initialized_before_mailbox_bootstrap";
        } else {
            C99Y.A00.A01(userSession);
            C9AQ.A00.A00(userSession);
            setMailboxDeactivationOnSessionEnding();
            onEnsureMsysInitialization(userSession, str);
            return;
        }
        A00.A05(str2);
    }

    private final void teardownACT(UserSession userSession, boolean z, long j, Runnable runnable) {
        C41871wb A01 = AbstractC41851wZ.A01(userSession);
        if (!A01.A05(C6AG.class)) {
            runnable.run();
            return;
        }
        CU6 cu6 = new CU6(runnable, j);
        cu6.A00();
        C6AG c6ag = (C6AG) A01.A00(C6AG.class);
        if (c6ag == null) {
            return;
        }
        c6ag.A01(z, new RunnableC29575D1c(cu6, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void teardownMailbox(UserSession userSession, boolean z, long j, Runnable runnable) {
        C137756Lx c137756Lx;
        C41871wb A01 = AbstractC41851wZ.A01(userSession);
        if (!A01.A05(C1334460n.class)) {
            runnable.run();
            return;
        }
        if (A01.A05(C137756Lx.class) && (c137756Lx = (C137756Lx) A01.A00(C137756Lx.class)) != null) {
            c137756Lx.onUserSessionWillEnd(z);
        }
        CU6 cu6 = new CU6(runnable, j);
        cu6.A00();
        C1334460n c1334460n = (C1334460n) A01.A00(C1334460n.class);
        if (c1334460n == null) {
            return;
        }
        c1334460n.A04(z, new RunnableC29576D1d(cu6, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void teardownMessageSyncService(UserSession userSession, boolean z, long j, Runnable runnable) {
        C41871wb A01 = AbstractC41851wZ.A01(userSession);
        if (!A01.A05(LG5.class)) {
            runnable.run();
            return;
        }
        CU6 cu6 = new CU6(runnable, j);
        cu6.A00();
        LG5 lg5 = (LG5) A01.A00(LG5.class);
        if (lg5 == null) {
            return;
        }
        lg5.A00(z, new RunnableC29577D1e(cu6, runnable));
    }
}
