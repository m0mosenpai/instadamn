package X;

import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.G1y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36346G1y implements C7EL {
    public final /* synthetic */ C32256EIq A00;

    @Override // X.C7EL
    public final void D1L() {
    }

    @Override // X.C7EL
    public final void DOL(int i) {
    }

    @Override // X.C7EL
    public final boolean DkX(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        C32256EIq c32256EIq = this.A00;
        String str3 = c32256EIq.A0E;
        if (str3 == null) {
            return false;
        }
        C7TG c7tg = c32256EIq.A0B;
        if (c7tg == null) {
            str2 = "sendMessageManager";
        } else {
            DirectThreadKey directThreadKey = c32256EIq.A0C;
            if (directThreadKey == null) {
                str2 = "threadKey";
            } else {
                c7tg.EO6(null, directThreadKey, "questions", null, str3, str, null);
                C7FQ c7fq = (C7FQ) c32256EIq.A0H.getValue();
                C2EC c2ec = c32256EIq.A0A;
                str2 = "thread";
                if (c2ec != null) {
                    String C7I = c2ec.C7I();
                    C2EC c2ec2 = c32256EIq.A0A;
                    if (c2ec2 != null) {
                        String C7q = c2ec2.C7q();
                        C2EC c2ec3 = c32256EIq.A0A;
                        if (c2ec3 != null) {
                            int C7g = c2ec3.C7g();
                            C2EC c2ec4 = c32256EIq.A0A;
                            if (c2ec4 != null) {
                                c7fq.A00(DirectPromptTypes.A07, C7I, C7q, C7g, c2ec4.AdZ());
                                return true;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public C36346G1y(C32256EIq c32256EIq) {
        this.A00 = c32256EIq;
    }
}
