package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;

/* renamed from: X.LUf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48181LUf implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        if (this.A00 != 0) {
            StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj;
            String A0u = AbstractC43592JPx.A0u(K3U.A00, 11);
            NotificationScope A00 = C43725JVk.A00(standaloneDatabaseHandle.getSessionedNotificationCenterCallbackManager(), this, A0u, 48);
            AbstractC43592JPx.A1P(A00, this.A04, A0u);
            MailboxSecureConsentFrameworkStandaloneJNI.dispatchVIIOOZ(10, this.A01, this.A02, standaloneDatabaseHandle, A00, this.A05);
            return;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, (MailboxFutureImpl) this.A04, false, 0, 1, "MCAMailboxSecureConsentFramework", "SecureConsentFrameworkUpsertBoolValue", JRF.A00(this, 42));
    }

    public C48181LUf(int i, int i2, int i3, Object obj, Object obj2, boolean z) {
        this.A00 = i3;
        this.A03 = obj2;
        this.A04 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = z;
    }
}
