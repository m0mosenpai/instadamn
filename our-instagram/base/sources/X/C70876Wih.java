package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.Wih, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70876Wih implements XCW {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public C6S5 A07;
    public List A08;
    public boolean A09;

    public C70876Wih() {
        C16930sl c16930sl = C16930sl.A00;
        C6S5 c6s5 = C6S5.A05;
        AbstractC25229BEm.A1J(c16930sl, 4, c6s5);
        this.A06 = 0;
        this.A05 = 0;
        this.A01 = 0.0f;
        this.A08 = c16930sl;
        this.A09 = false;
        this.A04 = 0.0f;
        this.A00 = 0.0f;
        this.A02 = 0.0f;
        this.A03 = 1.0f;
        this.A07 = c6s5;
    }

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A09;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("primary_color", this.A06);
            A0S.A0Q("contrast_color", this.A05);
            A0S.A0P("corner_radius", this.A01);
            if (this.A08 != null) {
                C16V.A03(A0S, "serializable_paths");
                for (C139136Ru c139136Ru : this.A08) {
                    if (c139136Ru != null) {
                        AbstractC69984Vz3.A00(A0S, c139136Ru);
                    }
                }
                A0S.A0Z();
            }
            A0S.A0T("is_frosted", this.A09);
            A0S.A0P("top_padding_ratio", this.A04);
            A0S.A0P("bottom_padding_ratio", this.A00);
            A0S.A0P("horizontal_padding_ratio", this.A02);
            A0S.A0P("line_spacing_multiplier", this.A03);
            C6S5 c6s5 = this.A07;
            if (c6s5 != null) {
                A0S.A0S("text_emphasis_mode", c6s5.A00);
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
