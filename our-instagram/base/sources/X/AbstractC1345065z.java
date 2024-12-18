package X;

import com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.instagramuser.mca.MailboxInstagramUserJNI;
import com.facebook.standalonedatabase.mca.MailboxStandaloneDatabaseJNI;
import java.util.List;

/* renamed from: X.65z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1345065z {
    public List A00 = null;

    public final Object A00(int i) {
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = A01();
            }
        }
        boolean z = false;
        if (i < this.A00.size()) {
            z = true;
        }
        Integer valueOf = Integer.valueOf(i);
        List list = this.A00;
        Object[] objArr = {valueOf, list};
        if (z) {
            Object obj = list.get(i);
            obj.getClass();
            return obj;
        }
        throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("Failed to find index %d in headerFields (%s)", objArr));
    }

    public List A01() {
        if (this instanceof AnonymousClass669) {
            return MailboxStandaloneDatabaseJNI.getHeaderFields();
        }
        if (this instanceof C66A) {
            return MailboxInstagramUserJNI.getHeaderFields();
        }
        if (this instanceof C66C) {
            return MailboxInstagramReverbJNI.getHeaderFields();
        }
        if (this instanceof C1344965y) {
            return MailboxCoreJNI.getHeaderFields();
        }
        if (this instanceof C125825mX) {
            return MailboxAdvancedCryptoTransportJNI.getHeaderFields();
        }
        return MailboxInstagramSecureMessageJNI.getHeaderFields();
    }
}
