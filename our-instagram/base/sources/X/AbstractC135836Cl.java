package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.6Cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC135836Cl implements InterfaceC135846Cm {
    public final InterfaceExecutorC135866Co A00 = new InterfaceExecutorC135866Co() { // from class: X.6Cn
        @Override // X.InterfaceExecutorC135866Co
        public final void AGa(NotificationScope notificationScope, String str) {
            AbstractC135836Cl.this.A06(new LU6(this, notificationScope, str));
        }

        @Override // X.InterfaceExecutorC135866Co
        public final boolean ELJ(MailboxCallback mailboxCallback) {
            return AbstractC135836Cl.this.A03(mailboxCallback);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            AbstractC135836Cl.this.A05(new MailboxCallback() { // from class: X.5yo
                @Override // com.facebook.msys.mca.MailboxCallback
                public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                    ((SlimMailbox) obj).mCallbackExecutor.execute(runnable);
                }
            });
        }
    };
    public final InterfaceExecutorC135866Co A02 = new InterfaceExecutorC135866Co() { // from class: X.6Cp
        @Override // X.InterfaceExecutorC135866Co
        public final void AGa(NotificationScope notificationScope, String str) {
            AbstractC135836Cl.this.A06(new LU7(this, notificationScope, str));
        }

        @Override // X.InterfaceExecutorC135866Co
        public final boolean ELJ(MailboxCallback mailboxCallback) {
            return AbstractC135836Cl.this.A05(mailboxCallback);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AbstractC135836Cl.this.A05(new C48174LTy(this, runnable));
        }
    };
    public final InterfaceExecutorC135866Co A01 = new InterfaceExecutorC135866Co() { // from class: X.6Cq
        @Override // X.InterfaceExecutorC135866Co
        public final void AGa(final NotificationScope notificationScope, final String str) {
            AbstractC135836Cl.this.A06(new MailboxCallback() { // from class: X.LTz
                @Override // com.facebook.msys.mca.MailboxCallback
                public final void onCompletion(Object obj) {
                    String str2 = str;
                    ((SlimMailbox) obj).mAccountSession.getNotificationCenterCallbackManager().F9V(notificationScope, str2);
                }
            });
        }

        @Override // X.InterfaceExecutorC135866Co
        public final boolean ELJ(final MailboxCallback mailboxCallback) {
            AbstractC135836Cl.this.A03(new MailboxCallback() { // from class: X.667
                @Override // com.facebook.msys.mca.MailboxCallback
                public final void onCompletion(Object obj) {
                    MailboxCallback.this.onCompletion(((Mailbox) obj).getAccountSession());
                }
            });
            return true;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            AbstractC135836Cl.this.A05(new MailboxCallback() { // from class: X.64J
                @Override // com.facebook.msys.mca.MailboxCallback
                public final void onCompletion(Object obj) {
                    ((SlimMailbox) obj).mCallbackExecutor.execute(runnable);
                }
            });
        }
    };

    public boolean A03(final MailboxCallback mailboxCallback) {
        if (this instanceof C137266Jf) {
            final C137266Jf c137266Jf = (C137266Jf) this;
            Execution.getExecutionContext();
            Execution.executePossiblySync(new AbstractRunnableC94874Os() { // from class: X.668
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("MailboxProvider");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    mailboxCallback.onCompletion(c137266Jf.A00);
                }
            }, c137266Jf.A00.getAccountSession(), 1);
            return true;
        }
        C135826Ck c135826Ck = (C135826Ck) this;
        Execution.getExecutionContext();
        c135826Ck.A05.A0M.getClass();
        if (C135826Ck.A00(c135826Ck, mailboxCallback) != null) {
            return true;
        }
        return false;
    }

    public boolean A04(MailboxCallback mailboxCallback) {
        if (this instanceof C137266Jf) {
            C137266Jf c137266Jf = (C137266Jf) this;
            Execution.executePossiblySync(new K4R(mailboxCallback, c137266Jf), c137266Jf.A00.getAccountSession(), 1);
            return true;
        }
        if (C135826Ck.A00((C135826Ck) this, mailboxCallback) != null) {
            return true;
        }
        return false;
    }

    public final boolean A05(final MailboxCallback mailboxCallback) {
        if (this instanceof AbstractC137276Jg) {
            final AbstractC137276Jg abstractC137276Jg = (AbstractC137276Jg) this;
            return abstractC137276Jg.A03(new MailboxCallback() { // from class: X.5yp
                @Override // com.facebook.msys.mca.MailboxCallback
                public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                    mailboxCallback.onCompletion(((Mailbox) obj).getSlimMailbox());
                }
            });
        }
        return A06(mailboxCallback);
    }

    public final boolean A06(MailboxCallback mailboxCallback) {
        if (this instanceof AbstractC137276Jg) {
            AbstractC137276Jg abstractC137276Jg = (AbstractC137276Jg) this;
            return abstractC137276Jg.A04(new C48173LTx(mailboxCallback, abstractC137276Jg));
        }
        SlimMailbox A00 = C135826Ck.A00((C135826Ck) this, null);
        if (A00 != null) {
            mailboxCallback.onCompletion(A00);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC135846Cm
    public final InterfaceExecutorC135866Co ASj(int i) {
        if (i == 0) {
            return this.A00;
        }
        if (i == 1) {
            return this.A02;
        }
        if (i == 2) {
            return this.A01;
        }
        throw new RuntimeException(AnonymousClass001.A0c("MailboxApiHandleProviderType with type ", " is not supported.", i));
    }
}
