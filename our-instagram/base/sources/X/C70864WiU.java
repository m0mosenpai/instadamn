package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.WiU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70864WiU implements XCW {
    public Integer A00;
    public List A01;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A01;
    }

    @Override // X.XCW
    public final String toJson() {
        String str;
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            if (this.A01 != null) {
                C16V.A03(A0S, "gradient_colors");
                List<Number> list = this.A01;
                if (list != null) {
                    for (Number number : list) {
                        if (number != null) {
                            A0S.A0h(number.intValue());
                        }
                    }
                    A0S.A0Z();
                    Integer num = this.A00;
                    if (num != null) {
                        A0S.A0S("text_alignment", AbstractC23070AFc.A00(num));
                        return AbstractC167017dG.A0l(A0S, stringWriter);
                    }
                    str = "textAlignment";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "gradientColorsList";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        } catch (IOException unused) {
            return null;
        }
    }
}
