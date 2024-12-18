package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* loaded from: classes4.dex */
public final class Ai3 implements XCW {
    public float A00;
    public int A01;
    public int A02;
    public C6S5 A03;
    public String A04;
    public List A05;
    public List A06;

    public Ai3() {
        C6S5 c6s5 = C6S5.A05;
        C16930sl c16930sl = C16930sl.A00;
        AbstractC167017dG.A1T(c6s5, c16930sl);
        this.A01 = 0;
        this.A02 = 0;
        this.A04 = "";
        this.A00 = -1.0f;
        this.A03 = c6s5;
        this.A05 = c16930sl;
        this.A06 = c16930sl;
    }

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A03;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("primary_color", this.A01);
            A0S.A0Q("secondary_color", this.A02);
            String str = this.A04;
            if (str != null) {
                A0S.A0S("font_name", str);
            }
            A0S.A0P("letter_spacing_multiplier", this.A00);
            C6S5 c6s5 = this.A03;
            if (c6s5 != null) {
                A0S.A0S("text_emphasis_mode", c6s5.A00);
            }
            if (this.A05 != null) {
                C16V.A03(A0S, "line_coordinate_x");
                for (Number number : this.A05) {
                    if (number != null) {
                        A0S.A0g(number.floatValue());
                    }
                }
                A0S.A0Z();
            }
            if (this.A06 != null) {
                C16V.A03(A0S, "line_coordinate_y");
                for (Number number2 : this.A06) {
                    if (number2 != null) {
                        A0S.A0g(number2.floatValue());
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
