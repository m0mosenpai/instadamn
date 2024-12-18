package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.Pum, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58408Pum implements InterfaceC65598Tnk {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final AbstractC61610RqZ A03;

    public static AbstractC61610RqZ A01(C58408Pum c58408Pum) {
        A06(c58408Pum, 0);
        return c58408Pum.A03;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E7u(List list) {
        int A09;
        C58383PuN c58383PuN;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A00 = A00(abstractC61610RqZ);
                do {
                    list.add(Boolean.valueOf(abstractC61610RqZ.A0K()));
                    c58383PuN = (C58383PuN) abstractC61610RqZ;
                } while (c58383PuN.A04 + c58383PuN.A03 < A00);
                A05(A00);
                return;
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            list.add(Boolean.valueOf(abstractC61610RqZ2.A0K()));
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E80(List list) {
        int A09;
        int i = this.A02 & 7;
        if (i != 1) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A0A = abstractC61610RqZ.A0A();
                if ((A0A & 7) == 0) {
                    C58383PuN c58383PuN = (C58383PuN) abstractC61610RqZ;
                    int i2 = c58383PuN.A04 + c58383PuN.A03 + A0A;
                    do {
                        list.add(Double.valueOf(Double.longBitsToDouble(c58383PuN.A0O())));
                    } while (c58383PuN.A04 + c58383PuN.A03 < i2);
                    return;
                }
                throw AbstractC58318PtA.A0H("Failed to parse the message.");
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            list.add(Double.valueOf(Double.longBitsToDouble(((C58383PuN) abstractC61610RqZ2).A0O())));
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E81(List list) {
        int A09;
        C58383PuN c58383PuN;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A00 = A00(abstractC61610RqZ);
                do {
                    MSX.A0u(abstractC61610RqZ.A06(), list);
                    c58383PuN = (C58383PuN) abstractC61610RqZ;
                } while (c58383PuN.A04 + c58383PuN.A03 < A00);
                A05(A00);
                return;
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            MSX.A0u(abstractC61610RqZ2.A06(), list);
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E84(List list) {
        int A09;
        int i = this.A02 & 7;
        if (i != 2) {
            if (i != 5) {
                throw Q7Q.A00();
            }
            do {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                MSX.A0u(((C58383PuN) abstractC61610RqZ).A0M(), list);
                if (!abstractC61610RqZ.A0J()) {
                    A09 = abstractC61610RqZ.A09();
                } else {
                    return;
                }
            } while (A09 == this.A02);
            this.A01 = A09;
            return;
        }
        AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
        int A0A = abstractC61610RqZ2.A0A();
        if ((A0A & 3) == 0) {
            C58383PuN c58383PuN = (C58383PuN) abstractC61610RqZ2;
            int i2 = c58383PuN.A04 + c58383PuN.A03 + A0A;
            do {
                MSX.A0u(c58383PuN.A0M(), list);
            } while (c58383PuN.A04 + c58383PuN.A03 < i2);
            return;
        }
        throw AbstractC58318PtA.A0H("Failed to parse the message.");
    }

    @Override // X.InterfaceC65598Tnk
    public final void E85(List list) {
        int A09;
        int i = this.A02 & 7;
        if (i != 1) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A0A = abstractC61610RqZ.A0A();
                if ((A0A & 7) == 0) {
                    C58383PuN c58383PuN = (C58383PuN) abstractC61610RqZ;
                    int i2 = c58383PuN.A04 + c58383PuN.A03 + A0A;
                    do {
                        AbstractC58318PtA.A1A(c58383PuN.A0O(), list);
                    } while (c58383PuN.A04 + c58383PuN.A03 < i2);
                    return;
                }
                throw AbstractC58318PtA.A0H("Failed to parse the message.");
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            AbstractC58318PtA.A1A(((C58383PuN) abstractC61610RqZ2).A0O(), list);
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E86(List list) {
        int A09;
        int i = this.A02 & 7;
        if (i != 2) {
            if (i != 5) {
                throw Q7Q.A00();
            }
            do {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                list.add(Float.valueOf(Float.intBitsToFloat(((C58383PuN) abstractC61610RqZ).A0M())));
                if (!abstractC61610RqZ.A0J()) {
                    A09 = abstractC61610RqZ.A09();
                } else {
                    return;
                }
            } while (A09 == this.A02);
            this.A01 = A09;
            return;
        }
        AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
        int A0A = abstractC61610RqZ2.A0A();
        if ((A0A & 3) == 0) {
            C58383PuN c58383PuN = (C58383PuN) abstractC61610RqZ2;
            int i2 = c58383PuN.A04 + c58383PuN.A03 + A0A;
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(c58383PuN.A0M())));
            } while (c58383PuN.A04 + c58383PuN.A03 < i2);
            return;
        }
        throw AbstractC58318PtA.A0H("Failed to parse the message.");
    }

    @Override // X.InterfaceC65598Tnk
    public final void E8A(List list) {
        int A09;
        C58383PuN c58383PuN;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A00 = A00(abstractC61610RqZ);
                do {
                    MSX.A0u(abstractC61610RqZ.A07(), list);
                    c58383PuN = (C58383PuN) abstractC61610RqZ;
                } while (c58383PuN.A04 + c58383PuN.A03 < A00);
                A05(A00);
                return;
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            MSX.A0u(abstractC61610RqZ2.A07(), list);
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E8B(List list) {
        int A09;
        C58383PuN c58383PuN;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A00 = A00(abstractC61610RqZ);
                do {
                    AbstractC58318PtA.A1A(abstractC61610RqZ.A0C(), list);
                    c58383PuN = (C58383PuN) abstractC61610RqZ;
                } while (c58383PuN.A04 + c58383PuN.A03 < A00);
                A05(A00);
                return;
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            AbstractC58318PtA.A1A(abstractC61610RqZ2.A0C(), list);
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E8J(List list) {
        int A09;
        int i = this.A02 & 7;
        if (i != 2) {
            if (i != 5) {
                throw Q7Q.A00();
            }
            do {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                MSX.A0u(((C58383PuN) abstractC61610RqZ).A0M(), list);
                if (!abstractC61610RqZ.A0J()) {
                    A09 = abstractC61610RqZ.A09();
                } else {
                    return;
                }
            } while (A09 == this.A02);
            this.A01 = A09;
            return;
        }
        AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
        int A0A = abstractC61610RqZ2.A0A();
        if ((A0A & 3) == 0) {
            C58383PuN c58383PuN = (C58383PuN) abstractC61610RqZ2;
            int i2 = c58383PuN.A04 + c58383PuN.A03 + A0A;
            do {
                MSX.A0u(c58383PuN.A0M(), list);
            } while (c58383PuN.A04 + c58383PuN.A03 < i2);
            return;
        }
        throw AbstractC58318PtA.A0H("Failed to parse the message.");
    }

    @Override // X.InterfaceC65598Tnk
    public final void E8K(List list) {
        int A09;
        int i = this.A02 & 7;
        if (i != 1) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A0A = abstractC61610RqZ.A0A();
                if ((A0A & 7) == 0) {
                    C58383PuN c58383PuN = (C58383PuN) abstractC61610RqZ;
                    int i2 = c58383PuN.A04 + c58383PuN.A03 + A0A;
                    do {
                        AbstractC58318PtA.A1A(c58383PuN.A0O(), list);
                    } while (c58383PuN.A04 + c58383PuN.A03 < i2);
                    return;
                }
                throw AbstractC58318PtA.A0H("Failed to parse the message.");
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            AbstractC58318PtA.A1A(((C58383PuN) abstractC61610RqZ2).A0O(), list);
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E8L(List list) {
        int A09;
        C58383PuN c58383PuN;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A00 = A00(abstractC61610RqZ);
                do {
                    MSX.A0u(abstractC61610RqZ.A08(), list);
                    c58383PuN = (C58383PuN) abstractC61610RqZ;
                } while (c58383PuN.A04 + c58383PuN.A03 < A00);
                A05(A00);
                return;
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            MSX.A0u(abstractC61610RqZ2.A08(), list);
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E8M(List list) {
        int A09;
        C58383PuN c58383PuN;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A00 = A00(abstractC61610RqZ);
                do {
                    AbstractC58318PtA.A1A(abstractC61610RqZ.A0D(), list);
                    c58383PuN = (C58383PuN) abstractC61610RqZ;
                } while (c58383PuN.A04 + c58383PuN.A03 < A00);
                A05(A00);
                return;
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            AbstractC58318PtA.A1A(abstractC61610RqZ2.A0D(), list);
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E8S(List list) {
        int A09;
        C58383PuN c58383PuN;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A00 = A00(abstractC61610RqZ);
                do {
                    MSX.A0u(abstractC61610RqZ.A0A(), list);
                    c58383PuN = (C58383PuN) abstractC61610RqZ;
                } while (c58383PuN.A04 + c58383PuN.A03 < A00);
                A05(A00);
                return;
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            MSX.A0u(abstractC61610RqZ2.A0A(), list);
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    @Override // X.InterfaceC65598Tnk
    public final void E8T(List list) {
        int A09;
        C58383PuN c58383PuN;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61610RqZ abstractC61610RqZ = this.A03;
                int A00 = A00(abstractC61610RqZ);
                do {
                    AbstractC58318PtA.A1A(abstractC61610RqZ.A0E(), list);
                    c58383PuN = (C58383PuN) abstractC61610RqZ;
                } while (c58383PuN.A04 + c58383PuN.A03 < A00);
                A05(A00);
                return;
            }
            throw Q7Q.A00();
        }
        do {
            AbstractC61610RqZ abstractC61610RqZ2 = this.A03;
            AbstractC58318PtA.A1A(abstractC61610RqZ2.A0E(), list);
            if (abstractC61610RqZ2.A0J()) {
                return;
            } else {
                A09 = abstractC61610RqZ2.A09();
            }
        } while (A09 == this.A02);
        this.A01 = A09;
    }

    public static Object A02(C58408Pum c58408Pum, C58402Pug c58402Pug, InterfaceC65588TnS interfaceC65588TnS) {
        int i = c58408Pum.A00;
        c58408Pum.A00 = ((c58408Pum.A02 >>> 3) << 3) | 4;
        try {
            Object CsR = interfaceC65588TnS.CsR();
            interfaceC65588TnS.CpM(c58402Pug, c58408Pum, CsR);
            interfaceC65588TnS.Cmk(CsR);
            if (c58408Pum.A02 == c58408Pum.A00) {
                return CsR;
            }
            throw AbstractC58318PtA.A0H("Failed to parse the message.");
        } finally {
            c58408Pum.A00 = i;
        }
    }

    public static Object A03(C58408Pum c58408Pum, C58402Pug c58402Pug, InterfaceC65588TnS interfaceC65588TnS) {
        AbstractC61610RqZ abstractC61610RqZ = c58408Pum.A03;
        int A0A = abstractC61610RqZ.A0A();
        if (abstractC61610RqZ.A00 < 100) {
            int A0B = abstractC61610RqZ.A0B(A0A);
            Object CsR = interfaceC65588TnS.CsR();
            abstractC61610RqZ.A00++;
            interfaceC65588TnS.CpM(c58402Pug, c58408Pum, CsR);
            interfaceC65588TnS.Cmk(CsR);
            abstractC61610RqZ.A0I(0);
            abstractC61610RqZ.A00--;
            C58383PuN c58383PuN = (C58383PuN) abstractC61610RqZ;
            c58383PuN.A01 = A0B;
            C58383PuN.A01(c58383PuN);
            return CsR;
        }
        throw AbstractC58318PtA.A0H("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public static Object A04(C58408Pum c58408Pum, C58402Pug c58402Pug, EnumC58395PuZ enumC58395PuZ, Class cls) {
        int A06;
        long A0C;
        switch (AbstractC58318PtA.A06(enumC58395PuZ, AbstractC58409Pun.A00)) {
            case 1:
                return Boolean.valueOf(A01(c58408Pum).A0K());
            case 2:
                A06(c58408Pum, 2);
                return c58408Pum.A03.A0F();
            case 3:
                A06(c58408Pum, 1);
                return Double.valueOf(Double.longBitsToDouble(((C58383PuN) c58408Pum.A03).A0O()));
            case 4:
                A06 = A01(c58408Pum).A06();
                return Integer.valueOf(A06);
            case 5:
            case 11:
                A06(c58408Pum, 5);
                A06 = ((C58383PuN) c58408Pum.A03).A0M();
                return Integer.valueOf(A06);
            case 6:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A06(c58408Pum, 1);
                A0C = ((C58383PuN) c58408Pum.A03).A0O();
                return Long.valueOf(A0C);
            case 7:
                A06(c58408Pum, 5);
                return Float.valueOf(Float.intBitsToFloat(((C58383PuN) c58408Pum.A03).A0M()));
            case 8:
                A06 = A01(c58408Pum).A07();
                return Integer.valueOf(A06);
            case 9:
                A0C = A01(c58408Pum).A0C();
                return Long.valueOf(A0C);
            case 10:
                A06(c58408Pum, 2);
                return A03(c58408Pum, c58402Pug, C58378PuI.A02.A00(cls));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A06 = A01(c58408Pum).A08();
                return Integer.valueOf(A06);
            case 14:
                A0C = A01(c58408Pum).A0D();
                return Long.valueOf(A0C);
            case Process.SIGTERM /* 15 */:
                A06(c58408Pum, 2);
                return c58408Pum.A03.A0H();
            case 16:
                A06 = A01(c58408Pum).A0A();
                return Integer.valueOf(A06);
            case 17:
                A0C = A01(c58408Pum).A0E();
                return Long.valueOf(A0C);
            default:
                throw AbstractC166987dD.A18("unsupported field type.");
        }
    }

    private void A05(int i) {
        C58383PuN c58383PuN = (C58383PuN) this.A03;
        if (c58383PuN.A04 + c58383PuN.A03 == i) {
        } else {
            throw AbstractC58321PtD.A0P();
        }
    }

    public static void A06(C58408Pum c58408Pum, int i) {
        if ((c58408Pum.A02 & 7) == i) {
        } else {
            throw Q7Q.A00();
        }
    }

    @Override // X.InterfaceC65598Tnk
    public final int B68() {
        int i = this.A01;
        if (i != 0) {
            this.A02 = i;
            this.A01 = 0;
        } else {
            i = this.A03.A09();
            this.A02 = i;
            if (i == 0) {
                return Integer.MAX_VALUE;
            }
        }
        if (i != this.A00) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public C58408Pum(AbstractC61610RqZ abstractC61610RqZ) {
        Charset charset = AbstractC58376PuG.A03;
        this.A03 = abstractC61610RqZ;
        abstractC61610RqZ.A01 = this;
    }

    public static int A00(AbstractC61610RqZ abstractC61610RqZ) {
        int A0A = abstractC61610RqZ.A0A();
        C58383PuN c58383PuN = (C58383PuN) abstractC61610RqZ;
        return c58383PuN.A04 + c58383PuN.A03 + A0A;
    }
}
