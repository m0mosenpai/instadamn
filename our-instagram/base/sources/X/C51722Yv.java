package X;

/* renamed from: X.2Yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C51722Yv {
    public static final C75933ay A02 = new C51722Yv() { // from class: X.3ay
    };
    public final C51722Yv A00;
    public final InterfaceC51732Yw A01;

    public final void A01(C50932Vp c50932Vp, C2XE c2xe) {
        C14360o3.A0B(c2xe, 0);
        A02(new C9F3(24, c2xe, c50932Vp));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C51722Yv c51722Yv = (C51722Yv) obj;
            if (!C14360o3.A0K(this.A00, c51722Yv.A00) || !C14360o3.A0K(this.A01, c51722Yv.A01)) {
                return false;
            }
        }
        return true;
    }

    public final C51722Yv A00(final C51722Yv c51722Yv) {
        if (c51722Yv == null) {
            return this;
        }
        final C51722Yv c51722Yv2 = this;
        if (this == A02) {
            c51722Yv2 = null;
        }
        return new C51722Yv(c51722Yv2, c51722Yv) { // from class: X.3dt
            public final C51722Yv A00;
            public final C51722Yv A01;

            {
                super(c51722Yv2, null);
                this.A00 = c51722Yv2;
                this.A01 = c51722Yv;
            }

            @Override // X.C51722Yv
            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C77693dt) {
                        C77693dt c77693dt = (C77693dt) obj;
                        if (!C14360o3.A0K(this.A00, c77693dt.A00) || !C14360o3.A0K(this.A01, c77693dt.A01)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // X.C51722Yv
            public final int hashCode() {
                C51722Yv c51722Yv3 = this.A00;
                return ((c51722Yv3 == null ? 0 : c51722Yv3.hashCode()) * 31) + this.A01.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CombinedStyle(first=");
                sb.append(this.A00);
                sb.append(AbstractC43591JPw.A00(102));
                sb.append(this.A01);
                sb.append(')');
                return sb.toString();
            }

            @Override // X.C51722Yv
            public final void A02(InterfaceC16660sJ interfaceC16660sJ) {
                C51722Yv c51722Yv3 = this.A00;
                if (c51722Yv3 != null) {
                    c51722Yv3.A02(interfaceC16660sJ);
                }
                this.A01.A02(interfaceC16660sJ);
            }
        };
    }

    public void A02(InterfaceC16660sJ interfaceC16660sJ) {
        C51722Yv c51722Yv = this.A00;
        if (c51722Yv != null) {
            c51722Yv.A02(interfaceC16660sJ);
        }
        InterfaceC51732Yw interfaceC51732Yw = this.A01;
        if (interfaceC51732Yw != null) {
            interfaceC16660sJ.invoke(interfaceC51732Yw);
        }
    }

    public int hashCode() {
        int i;
        C51722Yv c51722Yv = this.A00;
        int i2 = 0;
        if (c51722Yv != null) {
            i = c51722Yv.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        InterfaceC51732Yw interfaceC51732Yw = this.A01;
        if (interfaceC51732Yw != null) {
            i2 = interfaceC51732Yw.hashCode();
        }
        return i3 + i2;
    }

    public C51722Yv(C51722Yv c51722Yv, InterfaceC51732Yw interfaceC51732Yw) {
        this.A00 = c51722Yv;
        this.A01 = interfaceC51732Yw;
    }
}
