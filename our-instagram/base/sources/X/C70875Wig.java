package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.Wig, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70875Wig implements XCW {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public C6S5 A05;
    public C69250VkJ A06;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.VkJ, java.lang.Object] */
    public C70875Wig() {
        C6S5 c6s5 = C6S5.A05;
        ?? obj = new Object();
        C14360o3.A0B(c6s5, 3);
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = c6s5;
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A06 = obj;
    }

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A0B;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("primary_color", this.A03);
            A0S.A0Q(AbstractC111324zv.A00(1252), this.A04);
            C6S5 c6s5 = this.A05;
            if (c6s5 != null) {
                A0S.A0S("text_emphasis_mode", c6s5.A00);
            }
            A0S.A0P("top_padding_ratio", this.A02);
            A0S.A0P("bottom_padding_ratio", this.A00);
            A0S.A0P("horizontal_padding_ratio", this.A01);
            if (this.A06 != null) {
                A0S.A0r("emphasis_rect");
                AbstractC69986Vz5.A00(A0S, this.A06);
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
