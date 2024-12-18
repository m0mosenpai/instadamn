package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.urlblackholestandalone.mca.MailboxUrlBlackholeStandaloneJNI;
import java.util.List;

/* renamed from: X.91S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C91S extends MailboxFeature {
    public static AbstractC1345065z A00 = new AbstractC1345065z() { // from class: X.9ap
        @Override // X.AbstractC1345065z
        public final List A01() {
            return MailboxUrlBlackholeStandaloneJNI.getHeaderFields();
        }
    };
}
