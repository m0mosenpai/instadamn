package X;

import com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier;
import java.io.IOException;

/* renamed from: X.53l, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C53l {
    public static C1119853n parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("display_string".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("identifier".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    textPostAppSuggestionCardProfileContextIdentifier = (TextPostAppSuggestionCardProfileContextIdentifier) TextPostAppSuggestionCardProfileContextIdentifier.A01.get(A1P);
                    if (textPostAppSuggestionCardProfileContextIdentifier == null) {
                        textPostAppSuggestionCardProfileContextIdentifier = TextPostAppSuggestionCardProfileContextIdentifier.A09;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("display_string", "TextPostAppSuggestionCardProfileContextImpl");
            } else if (textPostAppSuggestionCardProfileContextIdentifier == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("identifier", "TextPostAppSuggestionCardProfileContextImpl");
            } else {
                return new C1119853n(textPostAppSuggestionCardProfileContextIdentifier, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
