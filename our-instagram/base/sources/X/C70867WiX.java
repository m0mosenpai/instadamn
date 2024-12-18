package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WiX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70867WiX implements XCW {
    public int A00;
    public C6S5 A01;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A07;
    }

    @Override // X.XCW
    public final String toJson() {
        String str;
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("primary_color", this.A00);
            C6S5 c6s5 = this.A01;
            if (c6s5 != null) {
                A0S.A0S("text_emphasis_mode", c6s5.A00);
            }
            str = AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException e) {
            C0w9.A06("TextEmphasisNeonSpanMetadataModel", "Error jsonizing TextEmphasisNeonSpanMetadataModel", e);
            str = "";
        }
        C14360o3.A0A(str);
        return str;
    }
}
