package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Execution;

/* renamed from: X.6A0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6A0 implements InterfaceC1352169w {
    public Boolean A00;

    @Override // X.InterfaceC1352169w
    public final /* bridge */ /* synthetic */ void EgM(Object obj) {
        final C1351969u c1351969u = (C1351969u) obj;
        C14360o3.A0B(c1351969u, 0);
        C42201xA c42201xA = C1334460n.A06;
        this.A00 = false;
        C14270nr.A00().A01(new AbstractRunnableC14200nk() { // from class: X.6AC
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1912568424, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C14360o3.A0K(this.A00, false)) {
                    final Mailbox mailbox = c1351969u.A01;
                    Execution.executeAsync(new AbstractRunnableC94874Os() { // from class: X.5mv
                        {
                            super("startAllSyncDelayedSyncGroups");
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Mailbox.this.startAllDelayedSyncGroupsNative();
                        }
                    }, mailbox.getAccountSession(), 1);
                }
            }
        }, C18U.A01(C06090Tz.A05, c1351969u.A02, 36601230260834440L));
    }

    @Override // X.InterfaceC1352169w
    public final void Epz() {
        C42201xA c42201xA = C1334460n.A06;
        this.A00 = true;
    }
}
