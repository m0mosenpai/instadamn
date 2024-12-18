package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Wib, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70870Wib implements XCW {
    public int A00;
    public C6S5 A01;
    public ArrayList A02;

    @Override // X.XCW
    public final Integer CBt() {
        return C05F.A05;
    }

    @Override // X.XCW
    public final String toJson() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0Q("background_color", this.A00);
            if (this.A02 != null) {
                C16V.A03(A0S, "emphasis_rects");
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    C69250VkJ c69250VkJ = (C69250VkJ) it.next();
                    if (c69250VkJ != null) {
                        AbstractC69986Vz5.A00(A0S, c69250VkJ);
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
