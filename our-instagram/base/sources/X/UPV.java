package X;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes11.dex */
public final class UPV extends C0T6 {
    public int A05;
    public final Rect A09;
    public final C69296Vl4 A0A;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public float A02 = 1.0f;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public RectF A08 = null;
    public RectF A06 = null;
    public RectF A07 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPV) {
                UPV upv = (UPV) obj;
                if (!C14360o3.A0K(this.A09, upv.A09) || !C14360o3.A0K(this.A0A, upv.A0A) || this.A05 != upv.A05 || Float.compare(this.A03, upv.A03) != 0 || Float.compare(this.A04, upv.A04) != 0 || Float.compare(this.A02, upv.A02) != 0 || Float.compare(this.A01, upv.A01) != 0 || Float.compare(this.A00, upv.A00) != 0 || !C14360o3.A0K(this.A08, upv.A08) || !C14360o3.A0K(this.A06, upv.A06) || !C14360o3.A0K(this.A07, upv.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ UPV(Rect rect, C69296Vl4 c69296Vl4, int i) {
        this.A09 = rect;
        this.A0A = c69296Vl4;
        this.A05 = i;
    }

    public final int hashCode() {
        int i = 0;
        int A00 = (((AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00((AbstractC166997dE.A0J(this.A0A, this.A09.hashCode() * 31) + this.A05) * 31, this.A03), this.A04), this.A02), this.A01), this.A00) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31;
        RectF rectF = this.A07;
        if (rectF != null) {
            i = rectF.hashCode();
        }
        return A00 + i;
    }
}
