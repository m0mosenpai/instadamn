package X;

import android.os.FileObserver;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;

/* renamed from: X.60n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1334460n {
    public static final C42201xA A06 = AbstractC42021ws.A01(EnumC41921wi.UNKNOWN);
    public C135826Ck A00;
    public final UserSession A03;
    public final C135816Cj A04;
    public final C42201xA A02 = AbstractC42021ws.A00();
    public final SettableFuture A01 = new Object();
    public final C41761wQ A05 = new C41761wQ(null);

    public static synchronized C1334460n A00(UserSession userSession, EnumC132075xi enumC132075xi) {
        C1334460n c1334460n;
        synchronized (C1334460n.class) {
            c1334460n = (C1334460n) AbstractC41851wZ.A00(userSession).A01(C1334460n.class, new C1334560o(userSession, enumC132075xi.A00));
        }
        return c1334460n;
    }

    @Deprecated
    public static synchronized C1334460n A01(UserSession userSession, String str) {
        C1334460n c1334460n;
        synchronized (C1334460n.class) {
            c1334460n = (C1334460n) AbstractC41851wZ.A00(userSession).A01(C1334460n.class, new C1334560o(userSession, str));
        }
        return c1334460n;
    }

    public final void A02(String str) {
        String str2;
        UserSession userSession = this.A03;
        boolean z = false;
        if (userSession.isStopped() && !AbstractC453326q.A04(userSession)) {
            C0K8.A0Q("IgMsysMailboxProvider", "Trying to initialize msys for a stopped user session. callsite = %s", str);
            return;
        }
        C135816Cj c135816Cj = this.A04;
        C135806Ci c135806Ci = c135816Cj.A01;
        AccountSession accountSession = c135806Ci.A00.A02;
        if (!accountSession.isValid()) {
            C0K8.A0C("IgMsysMailboxProvider", "invalided account session");
            return;
        }
        PlatformStorageProvider.initialize(AbstractC12290kX.A00);
        FileObserver fileObserver = c135816Cj.A00;
        if (fileObserver != null) {
            fileObserver.startWatching();
        }
        AnonymousClass610 anonymousClass610 = c135806Ci.A0G;
        if (anonymousClass610 != null && anonymousClass610.get() != null) {
            ((C94084Ku) AbstractC41851wZ.A00(userSession).A01(C94084Ku.class, C94074Kt.A00)).A00 = C50325MKd.A00;
            C1335160w.A01.A00 = new InterfaceC16820sZ() { // from class: X.B2x
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return Boolean.valueOf(RealtimeClientManager.getInstance(C1334460n.this.A03).isMqttConnected());
                }
            };
        }
        synchronized (accountSession) {
            str2 = accountSession.mInjectedMailboxType;
        }
        String A0R = AnonymousClass001.A0R(", injected mailbox type ", str2);
        if (!AbstractC453326q.A04(userSession)) {
            if (accountSession.getState() == 0) {
                z = true;
            }
            C18C.A0H(z, AnonymousClass001.A0c("IgMsysMailboxProvider: invalid account session state ", A0R, accountSession.getState()));
            accountSession.setInjectedMailboxType_DO_NOT_USE("full_mailbox");
        }
        C41881wd A00 = AbstractC41841wY.A00(userSession);
        EnumC41921wi enumC41921wi = EnumC41921wi.BOOTSTRAP_IN_PROGRESS;
        A00.A00.accept(enumC41921wi);
        A06.accept(enumC41921wi);
        C135826Ck c135826Ck = this.A00;
        if (c135826Ck == null) {
            return;
        }
        c135826Ck.A03(new MailboxCallback() { // from class: X.6Je
            @Override // com.facebook.msys.mca.MailboxCallback
            public final void onCompletion(Object obj) {
                C1334460n c1334460n = C1334460n.this;
                UserSession userSession2 = c1334460n.A03;
                C2FO.A00(userSession2).A04("db_setup_complete_callback_start");
                FileObserver fileObserver2 = c1334460n.A04.A00;
                if (fileObserver2 != null) {
                    fileObserver2.stopWatching();
                }
                C42201xA c42201xA = C1334460n.A06;
                EnumC41921wi enumC41921wi2 = EnumC41921wi.BOOTSTRAP_END;
                c42201xA.accept(enumC41921wi2);
                AbstractC41841wY.A00(userSession2).A00.accept(enumC41921wi2);
                c1334460n.A02.accept(obj);
                if (C18U.A06(C06090Tz.A05, userSession2, 36328517016763989L)) {
                    c1334460n.A01.set(obj);
                }
                C2FO.A00(userSession2).A04("db_setup_complete_callback_end");
            }
        });
    }

    public final void A03(final Consumer consumer) {
        if (!C18U.A06(C06090Tz.A05, this.A03, 36328517016763989L)) {
            this.A05.A02(this.A02, new InterfaceC42241xE() { // from class: X.Czn
                @Override // X.InterfaceC42241xE
                public final void accept(Object obj) {
                    consumer.accept(obj);
                }
            });
        } else {
            C2OD.A03(new C2JL() { // from class: X.6KI
                @Override // X.C2JL
                public final void onFailure(Throwable th) {
                }

                @Override // X.C2JL
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    if (obj != null) {
                        consumer.accept(obj);
                    }
                }
            }, this.A01, C1M8.A01);
        }
    }

    public final void A04(boolean z, final Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        CQ2 cq2;
        A06.accept(EnumC41921wi.TEAR_DOWN_START);
        this.A05.A00.dispose();
        if (C18U.A06(C06090Tz.A05, this.A03, 36328517016763989L)) {
            this.A01.setException(new IllegalStateException("Mailbox is already torn down"));
        }
        C135826Ck c135826Ck = this.A00;
        if (c135826Ck == null) {
            runnable.run();
            return;
        }
        this.A00 = null;
        int i = 2;
        if (z) {
            i = 3;
        }
        MailboxCallback mailboxCallback = new MailboxCallback() { // from class: X.LTu
            @Override // com.facebook.msys.mca.MailboxCallback
            public final void onCompletion(Object obj) {
                Runnable runnable2 = runnable;
                C1334460n.A06.accept(EnumC41921wi.TEAR_DOWN_END);
                runnable2.run();
            }
        };
        synchronized (c135826Ck) {
            EnumC135896Cs A00 = c135826Ck.A04.A00(C05F.A0N);
            int[] iArr = AbstractC137286Jh.A00;
            int ordinal = A00.ordinal();
            int i2 = iArr[ordinal];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("calling CLEAN_UP must not return ");
                            sb.append(A00);
                            throw new IllegalStateException(sb.toString());
                        }
                        ConcurrentLinkedQueue concurrentLinkedQueue2 = c135826Ck.A06;
                        AbstractC05810Sj.A03(concurrentLinkedQueue2.isEmpty(), "The queue must be empty because the only way to get here is from the READY phase");
                        concurrentLinkedQueue2.add(new CQ2(mailboxCallback, Integer.valueOf(i)));
                    } else {
                        concurrentLinkedQueue = c135826Ck.A06;
                        cq2 = new CQ2(mailboxCallback, Integer.valueOf(i));
                    }
                } else {
                    concurrentLinkedQueue = c135826Ck.A06;
                    cq2 = new CQ2(mailboxCallback, Integer.valueOf(i));
                }
                concurrentLinkedQueue.add(cq2);
                return;
            }
            int i3 = iArr[ordinal];
            if (i3 != 1) {
                if (i3 == 4) {
                    C135826Ck.A02(c135826Ck);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsynchronized CLEAN_UP code does not exist for ");
                sb2.append(A00);
                throw new IllegalStateException(sb2.toString());
            }
            mailboxCallback.onCompletion(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public C1334460n(C135826Ck c135826Ck, UserSession userSession, C135816Cj c135816Cj) {
        this.A03 = userSession;
        this.A00 = c135826Ck;
        this.A04 = c135816Cj;
    }
}
