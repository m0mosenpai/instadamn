package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.litho.BaseMountingView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2YA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YA {
    public static final C28216CcF A08 = new Object();
    public static final Map A09 = new HashMap();
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C2W3 A06;
    public final C2W1 A07;

    public final Rect A00() {
        if (this.A01 == 0 && this.A00) {
            C2W3 c2w3 = this.A06;
            return new Rect(0, 0, c2w3.getWidth(), c2w3.getHeight());
        }
        int i = this.A02 + this.A03;
        int i2 = this.A04 + this.A05;
        C2W3 c2w32 = this.A06;
        return new Rect(i, i2, c2w32.getWidth() + i, c2w32.getHeight() + i2);
    }

    public final BaseMountingView A01() {
        View BV3;
        C75793ak c75793ak = this.A06.A00.A03;
        if (c75793ak == null) {
            BV3 = null;
        } else {
            BV3 = c75793ak.A02.BV3();
        }
        return (BaseMountingView) BV3;
    }

    public final List A02() {
        C2YA A02;
        C2W3 c2w3 = this.A06;
        if (!(c2w3 instanceof C78853fr)) {
            int i = this.A01;
            if (i != 0) {
                int i2 = i - 1;
                if (i2 >= 0) {
                    A02 = A08.A02(c2w3, i2, this.A02, this.A04, this.A03, this.A05);
                    return AbstractC16960so.A1O(A02);
                }
            } else if (c2w3 instanceof C78653fX) {
                C2W3 c2w32 = c2w3.A02.A04;
                if (c2w32 != null) {
                    if (c2w32.A04().A0u.size() == 1) {
                        if (c2w32.A03.size() != 0) {
                            return C28216CcF.A00(c2w32, this.A02 + this.A03, this.A04 + this.A05);
                        }
                    } else {
                        int size = c2w32.A04().A0u.size() - 2;
                        if (size < 0) {
                            size = 0;
                        }
                        A02 = A08.A02(c2w32, size, c2w3.CI4(0), c2w3.CIb(0), this.A02 + this.A03, this.A04 + this.A05);
                        return AbstractC16960so.A1O(A02);
                    }
                }
            } else {
                return C28216CcF.A00(c2w3, this.A02 + this.A03, this.A04 + this.A05);
            }
        }
        return C16930sl.A00;
    }

    public C2YA(C2W3 c2w3, C2W1 c2w1, int i, int i2, int i3, int i4, int i5) {
        this.A06 = c2w3;
        this.A07 = c2w1;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A05 = i5;
    }
}
