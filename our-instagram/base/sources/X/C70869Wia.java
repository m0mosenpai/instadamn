package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.Wia, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70869Wia implements XCW {
    public int A00;
    public C6S5 A01;
    public List A02;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A02;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("background_color", this.A00);
            if (this.A02 != null) {
                C16V.A03(A0S, "serializable_paths");
                for (C139136Ru c139136Ru : this.A02) {
                    if (c139136Ru != null) {
                        AbstractC69984Vz3.A00(A0S, c139136Ru);
                    }
                }
                A0S.A0Z();
            }
            C6S5 c6s5 = this.A01;
            if (c6s5 != null) {
                A0S.A0S("text_emphasis_mode", c6s5.A00);
            }
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused) {
            return null;
        }
    }
}
