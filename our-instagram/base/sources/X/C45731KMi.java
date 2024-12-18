package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Execution;

/* renamed from: X.KMi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45731KMi extends AbstractC18280vF {
    public final /* synthetic */ Mailbox A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45731KMi(Mailbox mailbox) {
        super("ResumeTaskProcessingInCriticalPath", 1912568424, 5, false, false);
        this.A00 = mailbox;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        Mailbox mailbox = this.A00;
        Execution.executeAsync(new K4G(mailbox), mailbox.getAccountSession(), 1);
    }
}
