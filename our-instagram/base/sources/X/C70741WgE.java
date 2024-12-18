package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.WgE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70741WgE implements C1EH {
    public static final C70741WgE A00 = new C70741WgE();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        MVC mvc = new MVC();
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for LyricsPhrase should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -988963143:
                        if (A0s.equals("phrase")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                mvc.A03 = A1P;
                                break;
                            }
                        }
                        break;
                    case -673702133:
                        if (A0s.equals("start_time_in_ms")) {
                            mvc.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case 108130827:
                        if (A0s.equals("word_offsets")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    arrayList.add(C16V.A01(c16l, C70778Wgr.A00));
                                }
                            }
                            mvc.A02 = arrayList;
                            break;
                        }
                        break;
                    case 506856690:
                        if (A0s.equals("end_time_in_ms")) {
                            mvc.A00 = c16l.A1D();
                            break;
                        }
                        break;
                }
                C0K8.A0C("LyricsPhraseJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return mvc;
    }
}
