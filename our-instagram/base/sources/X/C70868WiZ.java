package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.WiZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70868WiZ implements XCW {
    public float A00;
    public int A01;
    public List A02 = C16930sl.A00;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A0C;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("color", this.A01);
            A0S.A0P("corner_radius", this.A00);
            if (this.A02 != null) {
                C16V.A03(A0S, "paths");
                for (C139136Ru c139136Ru : this.A02) {
                    if (c139136Ru != null) {
                        AbstractC69984Vz3.A00(A0S, c139136Ru);
                    }
                }
                A0S.A0Z();
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException e) {
            C0w9.A06("RoundedCornerTextBackgroundSpanMetadataModel", "Error jsonizing RoundedCornerTextBackgroundSpanMetadataModel", e);
            return "";
        }
    }
}
