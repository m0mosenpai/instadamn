package X;

import java.io.IOException;

/* renamed from: X.Wgc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70763Wgc implements C1EH {
    public static final C70763Wgc A00 = new C70763Wgc();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        MUW muw = new MUW(null, null, null, null, null, 15, 18);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for MediaQuizTally should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case 3556653:
                        if (A0s.equals("text")) {
                            muw.A03 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 94851343:
                        if (A0s.equals("count")) {
                            muw.A00 = AbstractC166997dE.A0h(c16l);
                            break;
                        }
                        break;
                    case 1568218085:
                        if (A0s.equals("hint_text")) {
                            muw.A02 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 2086502295:
                        if (A0s.equals("is_hint_row")) {
                            muw.A01 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("MediaQuizTallyJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return muw;
    }
}
