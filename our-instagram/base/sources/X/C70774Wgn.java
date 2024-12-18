package X;

import java.io.IOException;

/* renamed from: X.Wgn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70774Wgn implements C1EH {
    public static final C70774Wgn A00 = new C70774Wgn();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        UQE uqe = new UQE(14);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for StoryPromptFailureTooltip should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                if (A0s.equals("error_message_body")) {
                    uqe.A00 = AbstractC65702TsY.A0b(c16l);
                } else if (A0s.equals(AbstractC58317Pt9.A00(5))) {
                    uqe.A01 = AbstractC65702TsY.A0b(c16l);
                } else {
                    C0K8.A0C("StoryPromptFailureTooltipJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                }
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return uqe;
    }
}
