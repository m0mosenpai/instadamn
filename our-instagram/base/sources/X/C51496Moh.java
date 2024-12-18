package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.Moh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51496Moh extends OMs implements InterfaceC57896Pm0 {
    public C51653Mrk A00;
    public MUW A01;
    public WeakReference A02;
    public boolean A03;
    public final C55555Olp A04;
    public final Context A05;
    public final C19L A06;

    @Override // X.InterfaceC57896Pm0
    public final void Cyd(AbstractC53420Nk9 abstractC53420Nk9) {
        AbstractC53425NkE c51486MoX;
        if (!(abstractC53420Nk9 instanceof C51402MnA) && !(abstractC53420Nk9 instanceof C51405MnD)) {
            if (abstractC53420Nk9 instanceof C51399Mn7) {
                if (C14360o3.A0K(((C51399Mn7) abstractC53420Nk9).A00, super.A03)) {
                    String str = super.A03;
                    if (str != null) {
                        c51486MoX = new C51489Moa(str, true);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    return;
                }
            } else if (abstractC53420Nk9 instanceof C51406MnE) {
                C51406MnE c51406MnE = (C51406MnE) abstractC53420Nk9;
                Integer num = c51406MnE.A00;
                String A00 = AbstractC72879XqD.A00(num);
                String str2 = super.A03;
                String str3 = c51406MnE.A01;
                if (!C14360o3.A0K(str2, str3)) {
                    return;
                }
                if (num == C05F.A00) {
                    if (!this.A03) {
                        this.A03 = true;
                    }
                    A05(new C51490Mob(str3, c51406MnE.A02));
                    super.A01 |= 1;
                    A03();
                    return;
                }
                C14360o3.A0B(num, 0);
                if (num != C05F.A0C && num != C05F.A01 && num != C05F.A15) {
                    return;
                }
                A04();
                String str4 = super.A03;
                if (str4 != null) {
                    c51486MoX = new C51488MoZ(str4, A00);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                if ((abstractC53420Nk9 instanceof C51400Mn8) || (abstractC53420Nk9 instanceof C51403MnB)) {
                    return;
                }
                if (abstractC53420Nk9 instanceof C51401Mn9) {
                    AbstractC25231BEo.A1I(this, this.A06, 27);
                    String str5 = super.A03;
                    String str6 = ((C51401Mn9) abstractC53420Nk9).A00;
                    if (!C14360o3.A0K(str5, str6)) {
                        return;
                    } else {
                        c51486MoX = new C51487MoY(str6);
                    }
                } else if (abstractC53420Nk9 instanceof C51404MnC) {
                    String str7 = super.A03;
                    String str8 = ((C51404MnC) abstractC53420Nk9).A01;
                    if (!C14360o3.A0K(str7, str8)) {
                        return;
                    } else {
                        c51486MoX = new C51486MoX(str8);
                    }
                } else {
                    throw B4Z.A00();
                }
            }
            A05(c51486MoX);
        }
    }

    public C51496Moh(Context context, C54806OKa c54806OKa, C55555Olp c55555Olp, C19L c19l) {
        super(c55555Olp);
        this.A05 = context;
        this.A04 = c55555Olp;
        this.A06 = c19l;
        this.A02 = AbstractC25225BEi.A16(c54806OKa);
    }

    @Override // X.OMs
    public final void A02() {
        super.A02();
        C54806OKa A0I = MSW.A0I(this.A02);
        if (A0I != null) {
            A0I.A01(this);
        }
    }
}
