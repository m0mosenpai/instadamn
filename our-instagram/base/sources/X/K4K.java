package X;

import com.facebook.msys.mca.Mailbox;

/* loaded from: classes8.dex */
public final class K4K extends AbstractRunnableC94874Os {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C135826Ck A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4K(C135826Ck c135826Ck, int i) {
        super("cleanUp-mailbox");
        this.A01 = c135826Ck;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass663 logoutAndDelete;
        Mailbox mailbox = this.A01.A02;
        if (mailbox != null) {
            int i = this.A00;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                logoutAndDelete = mailbox.shutdownAndEncrypt();
                            } else {
                                throw AbstractC166987dD.A1D("The requested Mailbox shutdown operation is not currently supported");
                            }
                        } else {
                            logoutAndDelete = mailbox.shutdownAndDelete();
                        }
                    } else {
                        logoutAndDelete = mailbox.shutdown();
                    }
                } else {
                    logoutAndDelete = mailbox.logoutAndEncrypt();
                }
            } else {
                logoutAndDelete = mailbox.logoutAndDelete();
            }
            logoutAndDelete.Ecq(JRS.A00(this, 24));
        }
    }
}
