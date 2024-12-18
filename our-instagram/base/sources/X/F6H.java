package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public abstract class F6H {
    /* JADX WARN: Type inference failed for: r3v1, types: [X.1ae, X.1cM] */
    public static C30061cM A00(SocialContextType socialContextType, DirectForwardingParams directForwardingParams, JTa jTa, C38321qM c38321qM, DirectThreadKey directThreadKey, Integer num, Long l, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        String str3;
        C9CL c9cl = new C9CL(c38321qM, num, str2, str, null);
        if (socialContextType != null) {
            str3 = socialContextType.A00;
        } else {
            str3 = null;
        }
        ?? abstractC29011ae = new AbstractC29011ae(jTa, directThreadKey, l, j);
        abstractC29011ae.A03 = false;
        abstractC29011ae.A04 = false;
        abstractC29011ae.A05 = false;
        abstractC29011ae.A00 = c9cl;
        abstractC29011ae.A01 = directForwardingParams;
        abstractC29011ae.A03 = z;
        abstractC29011ae.A04 = z2;
        abstractC29011ae.A02 = str3;
        abstractC29011ae.A05 = z3;
        return abstractC29011ae;
    }
}
