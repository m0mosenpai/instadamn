package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.U9o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66336U9o extends MetricAffectingSpan implements C6S0, C6S2 {
    public static final C69511Vpo A07 = new Object();
    public int A00;
    public int A01;
    public ArrayList A04;
    public final Context A05;
    public final Drawable A06;
    public boolean A03 = true;
    public C6S5 A02 = C6S5.A05;

    public C66336U9o(Context context, ArrayList arrayList) {
        this.A05 = context;
        this.A04 = arrayList;
        this.A06 = context.getDrawable(R.drawable.meme_emphasis);
    }

    @Override // X.C6S0
    public final /* synthetic */ void AQP(Canvas canvas) {
    }

    @Override // X.C6S0
    public final void AQX(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(canvas, 1);
        if (this.A03) {
            this.A03 = false;
            Drawable drawable = this.A06;
            if (drawable != null) {
                AbstractC166997dE.A1F(drawable, this.A00);
            }
            Iterator A13 = AbstractC166997dE.A13(this.A04);
            while (A13.hasNext()) {
                Rect rect = (Rect) AbstractC166997dE.A0l(A13);
                canvas.save();
                canvas.rotate(1.0f, rect.exactCenterX(), rect.exactCenterY());
                if (drawable != null) {
                    drawable.setBounds(rect);
                    drawable.draw(canvas);
                }
                canvas.restore();
            }
        }
    }

    @Override // X.C6S0
    public final void EfY(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A02 = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
        C14360o3.A0B(layout, 0);
        this.A04 = A07.A00(layout, f);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final /* synthetic */ boolean onPreDraw() {
        this.A03 = true;
        return true;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.VkJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Wib, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int i = this.A00;
        ArrayList arrayList = this.A04;
        C6S5 c6s5 = this.A02;
        AbstractC167017dG.A1R(arrayList, c6s5);
        ?? obj = new Object();
        obj.A00 = i;
        obj.A02 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next();
            ArrayList arrayList2 = obj.A02;
            if (arrayList2 != null) {
                C14360o3.A0B(rect, 1);
                ?? obj2 = new Object();
                obj2.A01 = rect.left;
                obj2.A03 = rect.top;
                obj2.A02 = rect.right;
                obj2.A00 = rect.bottom;
                arrayList2.add(obj2);
            }
        }
        obj.A01 = c6s5;
        return obj;
    }

    @Override // X.C6S1
    public final /* synthetic */ Integer Bz4() {
        return C05F.A00;
    }

    @Override // X.C6S0
    public final C6S5 C6E() {
        return this.A02;
    }

    @Override // X.C6S0
    public final void ERf(int i, int i2) {
        this.A01 = i;
        if (this.A02 == C6S5.A06) {
            i2 = i;
        }
        this.A00 = i2;
    }
}
