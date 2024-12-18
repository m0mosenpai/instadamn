package X;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public final class Ai0 implements XCW {
    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A15;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            return AbstractC167017dG.A0l(AbstractC167007dF.A0S(stringWriter), stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
