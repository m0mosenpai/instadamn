package X;

import com.instagram.direct.fragment.prompts.dailyprompt.model.DailyPromptsShareInfo;

/* renamed from: X.EbK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32754EbK extends FKR {
    public final DailyPromptsShareInfo A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32754EbK(DailyPromptsShareInfo dailyPromptsShareInfo, String str) {
        super(C2EY.A0f, str);
        C14360o3.A0B(dailyPromptsShareInfo, 2);
        this.A01 = str;
        this.A00 = dailyPromptsShareInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32754EbK) {
                C32754EbK c32754EbK = (C32754EbK) obj;
                if (!C14360o3.A0K(this.A01, c32754EbK.A01) || !C14360o3.A0K(this.A00, c32754EbK.A00)) {
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
