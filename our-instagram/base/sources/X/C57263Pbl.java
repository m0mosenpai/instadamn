package X;

import android.graphics.drawable.GradientDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import com.instagram.user.model.UnavailableProduct;

/* renamed from: X.Pbl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57263Pbl extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57263Pbl(Object obj, int i, Object obj2, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A02 = i;
        this.A04 = obj;
        this.A01 = i2;
        this.A03 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C152816u9 c152816u9;
        AbstractC51365MmQ abstractC51365MmQ;
        float f;
        C76223bS c76223bS;
        GradientDrawable gradientDrawable;
        double d;
        switch (this.A00) {
            case 0:
                int i = this.A02;
                int i2 = this.A01;
                c152816u9 = (C152816u9) this.A04;
                C152816u9.A03(c152816u9, i, i2);
                C152816u9.A01(c152816u9);
                return C0eB.A00;
            case 1:
                int i3 = this.A02;
                int i4 = this.A01;
                c152816u9 = (C152816u9) this.A04;
                int i5 = i4 + i3;
                while (i3 < i5) {
                    C2UU c2uu = c152816u9.A00;
                    if (c2uu != null) {
                        C152816u9.A02(c152816u9, c2uu.getItemViewType(i3), i3);
                        i3++;
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                C152816u9.A01(c152816u9);
                return C0eB.A00;
            case 2:
                int i6 = this.A02;
                int i7 = this.A01;
                c152816u9 = (C152816u9) this.A04;
                c152816u9.A04.removeViews(i6, i7);
                C152816u9.A01(c152816u9);
                return C0eB.A00;
            case 3:
                int i8 = this.A02;
                NI5 ni5 = (NI5) this.A04;
                Integer[] numArr = ni5.A0C.A02;
                int A07 = (MSW.A07(numArr, 1) + i8) - MSW.A07(numArr, 0);
                C50868Mdz c50868Mdz = ni5.A0K;
                int i9 = this.A01;
                c50868Mdz.A0P(i9, i8, A07, AbstractC167007dF.A1X(this.A03, C05F.A00));
                C3OO A0V = ni5.A0A.A0V((i9 * 2) + 2);
                if ((A0V instanceof NIC) && (abstractC51365MmQ = (AbstractC51365MmQ) A0V) != null) {
                    C50809McW c50809McW = abstractC51365MmQ.A01;
                    c50809McW.A0H = i8;
                    c50809McW.A0G = A07;
                }
                return true;
            case 4:
                RecyclerView recyclerView = (RecyclerView) this.A04;
                int i10 = this.A01;
                FilmstripTimelineView A01 = AbstractC55200OeA.A01(recyclerView, i10);
                if (A01 != null) {
                    int i11 = this.A02;
                    C8Ba c8Ba = (C8Ba) this.A03;
                    if (i10 < i11) {
                        f = c8Ba.A02;
                    } else {
                        f = 0.0f;
                    }
                    A01.setPivotX(f);
                    A01.setActivated(false);
                    A01.setShowTrimmer(false);
                    A01.setShowSeekbar(false);
                    A01.A03(false, false, false);
                }
                return C0eB.A00;
            case 5:
                ((JHT) this.A03).Dw2((UnavailableProduct) this.A04, this.A02, this.A01);
                return C0eB.A00;
            case 6:
                C26572BoV c26572BoV = (C26572BoV) this.A04;
                c76223bS = (C76223bS) this.A03;
                int i12 = this.A01;
                int i13 = this.A02;
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(i12);
                gradientDrawable.setStroke(C2Z3.A00(c76223bS.BoZ(), c26572BoV.A00), i13);
                d = 18.0d;
                gradientDrawable.setCornerRadius(C2Z3.A00(c76223bS.BoZ(), Double.doubleToRawLongBits(d)));
                return gradientDrawable;
            default:
                c76223bS = (C76223bS) this.A03;
                int i14 = this.A01;
                int i15 = this.A02;
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(i14);
                d = i15;
                gradientDrawable.setCornerRadius(C2Z3.A00(c76223bS.BoZ(), Double.doubleToRawLongBits(d)));
                return gradientDrawable;
        }
    }
}
