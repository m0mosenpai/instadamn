package X;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public final class Ai2 implements XCW {
    public String A00;
    public boolean A01;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A0D;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            String str = this.A00;
            if (str != null) {
                A0S.A0S("text_format_name", str);
            }
            A0S.A0T("is_emphasized", this.A01);
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
