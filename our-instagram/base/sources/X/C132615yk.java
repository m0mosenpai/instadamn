package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.5yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132615yk {
    public final C132465yV A00;
    public final Mailbox A01;
    public final C218914p A02;
    public final InterfaceC12870lZ A03;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.5yV, com.facebook.msys.mca.MailboxFeature] */
    public C132615yk(Mailbox mailbox) {
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        ?? mailboxFeature2 = new MailboxFeature(new C137266Jf(mailbox));
        C218914p c218914p = C218914p.A08;
        C14360o3.A0B(c218914p, 3);
        this.A01 = mailbox;
        this.A00 = mailboxFeature2;
        this.A02 = c218914p;
        this.A03 = new InterfaceC12870lZ() { // from class: X.5yl
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(80277411);
                C132615yk c132615yk = C132615yk.this;
                if (c132615yk.A01.isValid()) {
                    C132465yV c132465yV = c132615yk.A00;
                    C28949Cpx c28949Cpx = new C28949Cpx();
                    InterfaceExecutorC135866Co ASj = c132465yV.mMailboxApiHandleMetaProvider.ASj(0);
                    MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                    mailboxFutureImpl.Ecq(c28949Cpx);
                    if (!ASj.ELJ(new YBM(c132465yV, mailboxFutureImpl))) {
                        mailboxFutureImpl.cancel(false);
                    }
                }
                C0f9.A0A(-1907157192, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                C0f9.A0A(1297296280, C0f9.A03(-1483927025));
            }
        };
    }
}
