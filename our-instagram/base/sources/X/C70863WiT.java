package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.WiT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70863WiT implements XCW {
    public float A00;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A0F;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0P("text_size_px", this.A00);
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
