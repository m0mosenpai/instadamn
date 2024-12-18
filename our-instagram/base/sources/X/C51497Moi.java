package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.Moi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51497Moi extends OMs implements InterfaceC57896Pm0 {
    public C51653Mrk A00;
    public MUW A01;
    public WeakReference A02;
    public Map A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final C55555Olp A07;
    public final C19L A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51497Moi(Context context, C54806OKa c54806OKa, C55555Olp c55555Olp, C19L c19l) {
        super(c55555Olp);
        C14360o3.A0B(context, 1);
        this.A06 = context;
        this.A07 = c55555Olp;
        this.A08 = c19l;
        this.A02 = AbstractC25225BEi.A16(c54806OKa);
    }

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
                        throw AbstractC166997dE.A0g();
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
                Integer num2 = C05F.A00;
                if (num == num2) {
                    this.A04 = false;
                    AbstractC23641Du.A03(num2, AnonymousClass191.A00, new MW8(this, null, 28), this.A08);
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
                c51486MoX = new C51488MoZ(str3, A00);
            } else {
                if ((abstractC53420Nk9 instanceof C51400Mn8) || (abstractC53420Nk9 instanceof C51403MnB)) {
                    return;
                }
                if (abstractC53420Nk9 instanceof C51401Mn9) {
                    String str4 = super.A03;
                    String str5 = ((C51401Mn9) abstractC53420Nk9).A00;
                    if (!C14360o3.A0K(str4, str5)) {
                        return;
                    } else {
                        c51486MoX = new C51487MoY(str5);
                    }
                } else if (abstractC53420Nk9 instanceof C51404MnC) {
                    String str6 = super.A03;
                    String str7 = ((C51404MnC) abstractC53420Nk9).A01;
                    if (!C14360o3.A0K(str6, str7)) {
                        return;
                    } else {
                        c51486MoX = new C51486MoX(str7);
                    }
                } else {
                    throw B4Z.A00();
                }
            }
            A05(c51486MoX);
        }
    }

    @Override // X.OMs
    public final void A02() {
        super.A02();
        C54806OKa A0I = MSW.A0I(this.A02);
        if (A0I != null) {
            A0I.A01(this);
        }
        C54806OKa A0I2 = MSW.A0I(this.A02);
        if (A0I2 != null) {
            C54499O6b c54499O6b = A0I2.A00;
            if (c54499O6b == null) {
                MSW.A1J();
                throw C00O.createAndThrow();
            }
            c54499O6b.A00.clearAvatarCache();
        }
    }
}
