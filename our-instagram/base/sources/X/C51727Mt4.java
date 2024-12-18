package X;

import android.graphics.Rect;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import java.util.List;

/* renamed from: X.Mt4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51727Mt4 extends C0T6 {
    public Rect A00;
    public List A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final GridSelfViewLocation A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final List A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51727Mt4) {
                C51727Mt4 c51727Mt4 = (C51727Mt4) obj;
                if (this.A03 != c51727Mt4.A03 || this.A02 != c51727Mt4.A02 || this.A04 != c51727Mt4.A04 || !C14360o3.A0K(this.A09, c51727Mt4.A09) || this.A06 != c51727Mt4.A06 || this.A0A != c51727Mt4.A0A || this.A07 != c51727Mt4.A07 || this.A05 != c51727Mt4.A05 || !C14360o3.A0K(this.A00, c51727Mt4.A00) || !C14360o3.A0K(this.A01, c51727Mt4.A01) || !C14360o3.A0K(this.A08, c51727Mt4.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public C51727Mt4(Rect rect, GridSelfViewLocation gridSelfViewLocation, Integer num, Integer num2, Integer num3, List list, List list2, int i, int i2, int i3, boolean z) {
        C14360o3.A0B(gridSelfViewLocation, 8);
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A09 = list;
        this.A06 = num;
        this.A0A = z;
        this.A07 = num2;
        this.A05 = gridSelfViewLocation;
        this.A00 = rect;
        this.A01 = list2;
        this.A08 = num3;
    }

    public final int hashCode() {
        String str;
        String str2;
        int A0J = AbstractC166997dE.A0J(this.A09, ((((this.A03 * 31) + this.A02) * 31) + this.A04) * 31);
        int intValue = this.A06.intValue();
        switch (intValue) {
            case 1:
                str = "ON_SCROLL";
                break;
            case 2:
                str = "ALWAYS";
                break;
            default:
                str = "NEVER";
                break;
        }
        int A0D = AbstractC167007dF.A0D(this.A0A, AbstractC25231BEo.A0H(str, intValue, A0J));
        int intValue2 = this.A07.intValue();
        if (1 != intValue2) {
            str2 = "ASPECT_FIT";
        } else {
            str2 = "SQUARE";
        }
        return (((((AbstractC166997dE.A0J(this.A05, AbstractC25231BEo.A0H(str2, intValue2, A0D)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31;
    }

    public static int A00(OmniGridLayoutManager omniGridLayoutManager) {
        return Math.max(-omniGridLayoutManager.Bau(), (omniGridLayoutManager.A07.A03 - ((AbstractC70663Fe) omniGridLayoutManager).A03) + omniGridLayoutManager.Baw());
    }

    public static int A01(OmniGridLayoutManager omniGridLayoutManager) {
        return Math.max(-omniGridLayoutManager.Bax(), (omniGridLayoutManager.A07.A02 - ((AbstractC70663Fe) omniGridLayoutManager).A00) + omniGridLayoutManager.Bat());
    }
}
