package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;

/* renamed from: X.4kC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102754kC implements InterfaceC102764kD {
    public final C16L A00;
    public final C102774kE A01 = new Object();

    @Override // X.InterfaceC102764kD
    public final Object Awa() {
        return this.A00;
    }

    @Override // X.InterfaceC102764kD
    public final Integer Csy() {
        this.A00.A1J();
        return E3x();
    }

    @Override // X.InterfaceC102764kD
    public final String E3u() {
        String A0q = this.A00.A0q();
        if (A0q != null) {
            return A0q;
        }
        throw new IOException("Parsed field has unexpected null name");
    }

    @Override // X.InterfaceC102764kD
    public final Integer E3x() {
        C16R A11 = this.A00.A11();
        if (A11 != null) {
            switch (A11.ordinal()) {
                case 0:
                    return C05F.A02;
                case 1:
                    return C05F.A0C;
                case 2:
                    return C05F.A0N;
                case 3:
                    return C05F.A00;
                case 4:
                    return C05F.A01;
                case 5:
                    return C05F.A0Y;
                case 6:
                    throw new IllegalStateException("embedded object is not supported");
                case 7:
                    return C05F.A0j;
                case 8:
                case 9:
                    return C05F.A15;
                case 10:
                case 11:
                    return C05F.A1F;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    return C05F.A1I;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown token");
        sb.append(A11);
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.InterfaceC102764kD
    public final InterfaceC1120053p E3y() {
        C102774kE c102774kE = this.A01;
        c102774kE.A00 = this.A00;
        return c102774kE;
    }

    @Override // X.InterfaceC102764kD
    public final void EmB() {
        this.A00.A0z();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4kE, java.lang.Object] */
    public C102754kC(C16L c16l) {
        this.A00 = c16l;
    }
}
