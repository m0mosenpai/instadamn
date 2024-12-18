package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.Wif, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70874Wif implements XCW {
    public float A00;
    public int A01;
    public int A02;
    public C6S5 A03;
    public List A04;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A0A;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0P("duplication_offset", this.A00);
            A0S.A0Q("text_color", this.A02);
            A0S.A0Q("background_color", this.A01);
            C6S5 c6s5 = this.A03;
            if (c6s5 != null) {
                A0S.A0S("text_emphasis_mode", c6s5.A00);
            }
            if (this.A04 != null) {
                C16V.A03(A0S, "line_coordinates");
                for (VgJ vgJ : this.A04) {
                    if (vgJ != null) {
                        A0S.A0d();
                        A0S.A0P("point_x", vgJ.A00);
                        A0S.A0P("point_y", vgJ.A01);
                        A0S.A0a();
                    }
                }
                A0S.A0Z();
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
