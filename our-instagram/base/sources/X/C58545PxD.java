package X;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.PxD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58545PxD {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final AbstractC61611Rqa A03;

    public final void A05(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A00 = A00(abstractC61611Rqa);
                do {
                    target.add(Boolean.valueOf(abstractC61611Rqa.A0R()));
                } while (abstractC61611Rqa.A08() < A00);
                A01(A00);
                return;
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            target.add(Boolean.valueOf(abstractC61611Rqa2.A0R()));
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A06(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 1) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A0F = abstractC61611Rqa.A0F();
                if ((A0F & 7) == 0) {
                    int A08 = abstractC61611Rqa.A08() + A0F;
                    do {
                        target.add(Double.valueOf(abstractC61611Rqa.A06()));
                    } while (abstractC61611Rqa.A08() < A08);
                    return;
                }
                throw C61032Re1.A01("Failed to parse the message.");
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            target.add(Double.valueOf(abstractC61611Rqa2.A06()));
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A07(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A00 = A00(abstractC61611Rqa);
                do {
                    MSX.A0u(abstractC61611Rqa.A09(), target);
                } while (abstractC61611Rqa.A08() < A00);
                A01(A00);
                return;
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            MSX.A0u(abstractC61611Rqa2.A09(), target);
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A08(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 2) {
            if (i != 5) {
                throw C61032Re1.A00();
            }
            do {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                MSX.A0u(abstractC61611Rqa.A0A(), target);
                if (!abstractC61611Rqa.A0Q()) {
                    A0E = abstractC61611Rqa.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
            return;
        }
        AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
        int A0F = abstractC61611Rqa2.A0F();
        if ((A0F & 3) == 0) {
            int A08 = abstractC61611Rqa2.A08() + A0F;
            do {
                MSX.A0u(abstractC61611Rqa2.A0A(), target);
            } while (abstractC61611Rqa2.A08() < A08);
            return;
        }
        throw C61032Re1.A01("Failed to parse the message.");
    }

    public final void A09(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 1) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A0F = abstractC61611Rqa.A0F();
                if ((A0F & 7) == 0) {
                    int A08 = abstractC61611Rqa.A08() + A0F;
                    do {
                        AbstractC58318PtA.A1A(abstractC61611Rqa.A0H(), target);
                    } while (abstractC61611Rqa.A08() < A08);
                    return;
                }
                throw C61032Re1.A01("Failed to parse the message.");
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            AbstractC58318PtA.A1A(abstractC61611Rqa2.A0H(), target);
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A0A(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 2) {
            if (i != 5) {
                throw C61032Re1.A00();
            }
            do {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                target.add(Float.valueOf(abstractC61611Rqa.A07()));
                if (!abstractC61611Rqa.A0Q()) {
                    A0E = abstractC61611Rqa.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
            return;
        }
        AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
        int A0F = abstractC61611Rqa2.A0F();
        if ((A0F & 3) == 0) {
            int A08 = abstractC61611Rqa2.A08() + A0F;
            do {
                target.add(Float.valueOf(abstractC61611Rqa2.A07()));
            } while (abstractC61611Rqa2.A08() < A08);
            return;
        }
        throw C61032Re1.A01("Failed to parse the message.");
    }

    public final void A0B(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A00 = A00(abstractC61611Rqa);
                do {
                    MSX.A0u(abstractC61611Rqa.A0B(), target);
                } while (abstractC61611Rqa.A08() < A00);
                A01(A00);
                return;
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            MSX.A0u(abstractC61611Rqa2.A0B(), target);
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A0C(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A00 = A00(abstractC61611Rqa);
                do {
                    AbstractC58318PtA.A1A(abstractC61611Rqa.A0I(), target);
                } while (abstractC61611Rqa.A08() < A00);
                A01(A00);
                return;
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            AbstractC58318PtA.A1A(abstractC61611Rqa2.A0I(), target);
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A0D(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 2) {
            if (i != 5) {
                throw C61032Re1.A00();
            }
            do {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                MSX.A0u(abstractC61611Rqa.A0C(), target);
                if (!abstractC61611Rqa.A0Q()) {
                    A0E = abstractC61611Rqa.A0E();
                } else {
                    return;
                }
            } while (A0E == this.A02);
            this.A01 = A0E;
            return;
        }
        AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
        int A0F = abstractC61611Rqa2.A0F();
        if ((A0F & 3) == 0) {
            int A08 = abstractC61611Rqa2.A08() + A0F;
            do {
                MSX.A0u(abstractC61611Rqa2.A0C(), target);
            } while (abstractC61611Rqa2.A08() < A08);
            return;
        }
        throw C61032Re1.A01("Failed to parse the message.");
    }

    public final void A0E(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 1) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A0F = abstractC61611Rqa.A0F();
                if ((A0F & 7) == 0) {
                    int A08 = abstractC61611Rqa.A08() + A0F;
                    do {
                        AbstractC58318PtA.A1A(abstractC61611Rqa.A0J(), target);
                    } while (abstractC61611Rqa.A08() < A08);
                    return;
                }
                throw C61032Re1.A01("Failed to parse the message.");
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            AbstractC58318PtA.A1A(abstractC61611Rqa2.A0J(), target);
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A0F(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A00 = A00(abstractC61611Rqa);
                do {
                    MSX.A0u(abstractC61611Rqa.A0D(), target);
                } while (abstractC61611Rqa.A08() < A00);
                A01(A00);
                return;
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            MSX.A0u(abstractC61611Rqa2.A0D(), target);
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A0G(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A00 = A00(abstractC61611Rqa);
                do {
                    AbstractC58318PtA.A1A(abstractC61611Rqa.A0K(), target);
                } while (abstractC61611Rqa.A08() < A00);
                A01(A00);
                return;
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            AbstractC58318PtA.A1A(abstractC61611Rqa2.A0K(), target);
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A0H(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A00 = A00(abstractC61611Rqa);
                do {
                    MSX.A0u(abstractC61611Rqa.A0F(), target);
                } while (abstractC61611Rqa.A08() < A00);
                A01(A00);
                return;
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            MSX.A0u(abstractC61611Rqa2.A0F(), target);
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    public final void A0I(List target) {
        int A0E;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC61611Rqa abstractC61611Rqa = this.A03;
                int A00 = A00(abstractC61611Rqa);
                do {
                    AbstractC58318PtA.A1A(abstractC61611Rqa.A0L(), target);
                } while (abstractC61611Rqa.A08() < A00);
                A01(A00);
                return;
            }
            throw C61032Re1.A00();
        }
        do {
            AbstractC61611Rqa abstractC61611Rqa2 = this.A03;
            AbstractC58318PtA.A1A(abstractC61611Rqa2.A0L(), target);
            if (abstractC61611Rqa2.A0Q()) {
                return;
            } else {
                A0E = abstractC61611Rqa2.A0E();
            }
        } while (A0E == this.A02);
        this.A01 = A0E;
    }

    private void A01(int expectedPosition) {
        if (this.A03.A08() == expectedPosition) {
        } else {
            throw C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void A02(C58545PxD c58545PxD, int i) {
        if ((c58545PxD.A02 & 7) == i) {
        } else {
            throw C61032Re1.A00();
        }
    }

    public static void A03(C58545PxD c58545PxD, C58534Px2 c58534Px2, InterfaceC65595Tne interfaceC65595Tne, Object obj) {
        int i = c58545PxD.A00;
        c58545PxD.A00 = ((c58545PxD.A02 >>> 3) << 3) | 4;
        try {
            interfaceC65595Tne.CpN(c58545PxD, c58534Px2, obj);
            if (c58545PxD.A02 == c58545PxD.A00) {
            } else {
                throw C61032Re1.A01("Failed to parse the message.");
            }
        } finally {
            c58545PxD.A00 = i;
        }
    }

    public static void A04(C58545PxD c58545PxD, C58534Px2 c58534Px2, InterfaceC65595Tne interfaceC65595Tne, Object obj) {
        AbstractC61611Rqa abstractC61611Rqa = c58545PxD.A03;
        int A0F = abstractC61611Rqa.A0F();
        int i = abstractC61611Rqa.A00;
        if (i < 100) {
            int A0G = abstractC61611Rqa.A0G(A0F);
            abstractC61611Rqa.A00 = i + 1;
            interfaceC65595Tne.CpN(c58545PxD, c58534Px2, obj);
            abstractC61611Rqa.A0P();
            abstractC61611Rqa.A00--;
            if (abstractC61611Rqa instanceof C58557PxZ) {
                C58557PxZ c58557PxZ = (C58557PxZ) abstractC61611Rqa;
                c58557PxZ.A01 = A0G;
                C58557PxZ.A01(c58557PxZ);
                return;
            } else {
                C58539Px7 c58539Px7 = (C58539Px7) abstractC61611Rqa;
                c58539Px7.A00 = A0G;
                C58539Px7.A00(c58539Px7);
                return;
            }
        }
        throw C61032Re1.A01("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public C58545PxD(AbstractC61611Rqa input) {
        Charset charset = AbstractC62398S9x.A04;
        this.A03 = input;
        input.A01 = this;
    }

    public static int A00(AbstractC61611Rqa abstractC61611Rqa) {
        return abstractC61611Rqa.A08() + abstractC61611Rqa.A0F();
    }
}
