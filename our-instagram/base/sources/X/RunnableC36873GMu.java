package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.GMu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36873GMu implements Runnable {
    public final /* synthetic */ C31374Dqe A00;

    public RunnableC36873GMu(C31374Dqe c31374Dqe) {
        this.A00 = c31374Dqe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C31374Dqe c31374Dqe = this.A00;
        c31374Dqe.A02(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        c31374Dqe.A01 = null;
    }
}
