package X;

/* renamed from: X.Nnk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53639Nnk {
    public final N1P A00(boolean z) {
        boolean z2;
        int i;
        C51738MtL c51738MtL;
        if (this instanceof N1S) {
            z2 = ((N1S) this).A00.A05;
            i = 15;
        } else {
            if (this instanceof N1P) {
                c51738MtL = ((N1P) this).A00;
                C14360o3.A0B(c51738MtL, 1);
                return new N1P(c51738MtL, z);
            }
            z2 = false;
            i = 31;
        }
        c51738MtL = new C51738MtL(i, z2);
        return new N1P(c51738MtL, z);
    }

    public final AbstractC53639Nnk A01(AbstractC54520O6x abstractC54520O6x, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (this instanceof N1S) {
            N1S n1s = (N1S) this;
            return new N1S(n1s.A00.A00(abstractC54520O6x, bool, bool2, bool3, bool4), n1s.A01);
        }
        if (this instanceof N1P) {
            N1P n1p = (N1P) this;
            return new N1P(n1p.A00.A00(abstractC54520O6x, bool, bool2, bool3, bool4), n1p.A01);
        }
        return null;
    }

    public final AbstractC54520O6x A02() {
        if (this instanceof N1P) {
            return (AbstractC54520O6x) ((N1P) this).A00.A01;
        }
        return null;
    }
}
