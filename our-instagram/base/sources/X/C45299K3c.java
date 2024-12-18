package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.instagramportabledb.mca.MailboxInstagramPortableDBJNI;
import com.facebook.memcontext.mca.MailboxMEMContextJNI;
import com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI;
import com.facebook.messengerencryptedbackupsmemris.mca.MailboxMessengerEncryptedBackupsMemrisJNI;
import com.facebook.notificationengineinstagramintegrator.mca.MailboxNotificationEngineInstagramIntegratorJNI;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;
import com.facebook.shim.mca.MailboxShimJNI;
import com.facebook.tam.mca.MailboxTamJNI;
import com.facebook.threadtheme.mca.MailboxThreadThemeJNI;
import java.util.List;

/* renamed from: X.K3c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45299K3c extends AbstractC1345065z {
    public final int A00;

    public C45299K3c(int i) {
        this.A00 = i;
    }

    @Override // X.AbstractC1345065z
    public final List A01() {
        switch (this.A00) {
            case 0:
                return MailboxEncryptedBackupsJNI.getHeaderFields();
            case 1:
                return MailboxInstagramMemJNI.getHeaderFields();
            case 2:
                return MailboxInstagramPortableDBJNI.getHeaderFields();
            case 3:
                return MailboxMEMContextJNI.getHeaderFields();
            case 4:
                return MailboxMessengerEncryptedBackupsDirectJNI.getHeaderFields();
            case 5:
                return MailboxMessengerEncryptedBackupsMemrisJNI.getHeaderFields();
            case 6:
                return MailboxNotificationEngineInstagramIntegratorJNI.getHeaderFields();
            case 7:
                return MailboxSecureAuthPlatformPakeJNI.getHeaderFields();
            case 8:
                return MailboxSecureConsentFrameworkStandaloneJNI.getHeaderFields();
            case 9:
                return MailboxShimJNI.getHeaderFields();
            case 10:
                return MailboxTamJNI.getHeaderFields();
            default:
                return MailboxThreadThemeJNI.getHeaderFields();
        }
    }
}
