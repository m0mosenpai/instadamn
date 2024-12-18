package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Jff, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44176Jff implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C44176Jff(K3W k3w, MailboxFutureImpl mailboxFutureImpl, int i) {
        this.A00 = i;
        this.A01 = k3w;
        this.A02 = mailboxFutureImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0147, code lost:
    
        if (r4.equals(com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion.NOT_SUPPORTED) == false) goto L63;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05c9  */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 2282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44176Jff.onCompletion(java.lang.Object):void");
    }

    public C44176Jff(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public C44176Jff(C47967LIb c47967LIb, LK0 lk0, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                this.A02 = c47967LIb;
                this.A01 = lk0;
                break;
            case 4:
            default:
                this.A01 = lk0;
                this.A02 = c47967LIb;
                break;
        }
    }
}
