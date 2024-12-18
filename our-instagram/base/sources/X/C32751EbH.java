package X;

import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;

/* renamed from: X.EbH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32751EbH extends FKR {
    public final ChannelChallengeShareInfo A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32751EbH(ChannelChallengeShareInfo channelChallengeShareInfo, String str) {
        super(C2EY.A0R, str);
        C14360o3.A0B(channelChallengeShareInfo, 2);
        this.A01 = str;
        this.A00 = channelChallengeShareInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32751EbH) {
                C32751EbH c32751EbH = (C32751EbH) obj;
                if (!C14360o3.A0K(this.A01, c32751EbH.A01) || !C14360o3.A0K(this.A00, c32751EbH.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }
}
