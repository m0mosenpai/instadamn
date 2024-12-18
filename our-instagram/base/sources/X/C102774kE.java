package X;

import java.io.IOException;

/* renamed from: X.4kE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102774kE implements InterfaceC1120053p {
    public C16L A00;

    @Override // X.InterfaceC1120053p
    public final boolean AE8() {
        C16R A11;
        C16L c16l = this.A00;
        if (c16l != null && (A11 = c16l.A11()) != null) {
            int ordinal = A11.ordinal();
            if (ordinal == 10) {
                return true;
            }
            if (ordinal == 11) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("illegal token for boolean type ");
            sb.append(A11);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IOException();
    }

    @Override // X.InterfaceC1120053p
    public final int COn() {
        C16L c16l = this.A00;
        if (c16l != null) {
            return c16l.A0i();
        }
        throw new IOException();
    }

    @Override // X.InterfaceC1120053p
    public final long Cmb() {
        C16L c16l = this.A00;
        if (c16l != null) {
            return c16l.A0j();
        }
        throw new IOException();
    }

    @Override // X.InterfaceC1120053p
    public final Number Ctf() {
        Number valueOf;
        C16L c16l = this.A00;
        if (c16l != null) {
            C16R A11 = c16l.A11();
            if (A11 != null) {
                int ordinal = A11.ordinal();
                if (ordinal != 9) {
                    if (ordinal == 8) {
                        valueOf = Long.valueOf(c16l.A0j());
                    }
                } else {
                    valueOf = Double.valueOf(c16l.A0g());
                }
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("illegal token for number type ");
            sb.append(A11);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IOException();
    }

    @Override // X.InterfaceC1120053p
    public final String Ep1() {
        String A1P;
        C16L c16l = this.A00;
        if (c16l != null && (A1P = c16l.A1P()) != null) {
            return A1P;
        }
        throw new IOException();
    }

    @Override // X.InterfaceC1120053p
    public final boolean isNull() {
        C16R c16r;
        C16L c16l = this.A00;
        if (c16l != null) {
            c16r = c16l.A11();
        } else {
            c16r = null;
        }
        if (c16r != C16R.A0G) {
            return false;
        }
        return true;
    }
}
