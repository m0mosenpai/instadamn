package X;

import com.instagram.ui.text.TextColors;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public final class Ai1 implements XCW {
    public int A00;
    public TextColors A01;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A0u;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            if (this.A01 != null) {
                A0S.A0r("text_colors");
                TextColors textColors = this.A01;
                if (textColors != null) {
                    AEY.A00(A0S, textColors);
                    A0S.A0Q("primary_color", this.A00);
                    return AbstractC167017dG.A0l(A0S, stringWriter);
                }
            }
            C14360o3.A0F("textColors");
            throw C00O.createAndThrow();
        } catch (IOException unused) {
            return null;
        }
    }
}
