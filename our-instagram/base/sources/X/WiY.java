package X;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes11.dex */
public final class WiY implements XCW {
    public int A00;
    public int A01;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A08;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("primary_color", this.A01);
            A0S.A0Q("contrast_color", this.A00);
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
