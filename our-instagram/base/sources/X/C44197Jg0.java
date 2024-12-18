package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.Jg0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44197Jg0 extends C5RN {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final Paint A08;
    public final Path A09;
    public final UserSession A0A;
    public final AbstractC44205Jg9 A0B;
    public final Integer A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final InterfaceC16820sZ A0G;
    public final boolean A0H;
    public final float[] A0I;
    public final int[] A0J;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A0H) {
            canvas.save();
            AbstractC167017dG.A12(canvas, this);
            canvas.drawPath(this.A09, this.A08);
            canvas.restore();
        }
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            A00(canvas, (C44202Jg5) it.next());
        }
        Iterator it2 = this.A0F.iterator();
        while (it2.hasNext()) {
            A00(canvas, (C44202Jg5) it2.next());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        A01(this.A0F, true);
        A01(this.A0E, false);
        float A00 = AbstractC13690mv.A00(this.A07, 5.0f);
        Path path = this.A09;
        path.reset();
        path.setFillType(Path.FillType.WINDING);
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        float f = this.A00;
        path.addCircle(exactCenterX, exactCenterY, f, Path.Direction.CW);
        Paint paint = this.A08;
        int[] iArr = this.A0J;
        paint.setShader(new LinearGradient(getBounds().right + A00, getBounds().top + A00, getBounds().left - A00, AbstractC166987dD.A0D(this) - A00, iArr, this.A0I, Shader.TileMode.CLAMP));
        paint.setAlpha(7);
        paint.setShadowLayer(f - 4.0f, 0.0f, 0.0f, AbstractC009903n.A00(iArr));
        float f2 = f - 2.0f;
        C14360o3.A0B(iArr, 0);
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        paint.setShadowLayer(f2, 0.0f, 0.0f, iArr[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    public /* synthetic */ C44197Jg0(Context context, UserSession userSession, AbstractC44205Jg9 abstractC44205Jg9, Integer num, List list, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        float f;
        float f2;
        List list2;
        ArrayList arrayList;
        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
        boolean z2 = z;
        int i3 = i;
        num = (i2 & 16) != 0 ? C05F.A01 : num;
        i3 = (i2 & 32) != 0 ? 5 : i3;
        z2 = (i2 & 64) != 0 ? false : z2;
        if ((i2 & 128) != 0) {
            f = AbstractC44198Jg1.A00(context);
        } else {
            f = 0.0f;
        }
        if ((i2 & 256) != 0) {
            f2 = AbstractC44198Jg1.A00(context);
        } else {
            f2 = 0.0f;
        }
        float f3 = (i2 & 512) != 0 ? 20.0f : 0.0f;
        interfaceC16820sZ2 = (i2 & 1024) != 0 ? C44203Jg6.A00 : interfaceC16820sZ2;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC16820sZ2, 11);
        this.A07 = context;
        this.A0A = userSession;
        this.A0B = abstractC44205Jg9;
        this.A0C = num;
        this.A04 = i3;
        this.A0H = z2;
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A0G = interfaceC16820sZ2;
        HashSet A1H = AbstractC166987dD.A1H();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (A1H.add(((C44200Jg3) obj).A01)) {
                A1E.add(obj);
            }
        }
        this.A0D = A1E;
        this.A0E = AbstractC166987dD.A1E();
        this.A0F = AbstractC166987dD.A1E();
        this.A06 = AbstractC44198Jg1.A03(this.A07, R.dimen.account_discovery_bottom_gap);
        int A03 = AbstractC44198Jg1.A03(this.A07, this.A0B.A04);
        this.A05 = A03;
        this.A0I = new float[]{0.4f, 0.6f, 1.0f};
        this.A00 = A03 * 1.4f * (1.0f - ((5 - A1E.size()) / 10.0f));
        this.A09 = AbstractC166987dD.A0T();
        Context context2 = this.A07;
        C14360o3.A0B(context2, 1);
        int A09 = AbstractC167007dF.A09(context2, R.attr.igds_color_gradient_pink);
        Context context3 = this.A07;
        C14360o3.A0B(context3, 1);
        int A092 = AbstractC167007dF.A09(context3, R.attr.igds_color_gradient_red);
        Context context4 = this.A07;
        C14360o3.A0B(context4, 1);
        this.A0J = new int[]{A09, A092, AbstractC167007dF.A09(context4, R.attr.igds_color_gradient_yellow)};
        this.A08 = AbstractC166987dD.A0S(3);
        List A0W = AbstractC001800i.A0W(this.A0D);
        ArrayList A0q = AbstractC167017dG.A0q(A0W);
        Iterator it = A0W.iterator();
        while (it.hasNext()) {
            A0q.add(new C44202Jg5(new C44201Jg4(this.A07, this.A0A, (C44200Jg3) it.next(), this.A0B, new C50158MDl(this, 39)), this));
        }
        if (this.A0C == C05F.A00) {
            list2 = this.A0E;
            arrayList = AbstractC001800i.A0d(A0q, this.A04);
        } else {
            int size = A0q.size();
            list2 = this.A0E;
            arrayList = A0q;
            if (size >= 4) {
                list2.addAll(AbstractC001800i.A0d(A0q, 2));
                list2 = this.A0F;
                arrayList = AbstractC001800i.A0h(A0q, Math.min(A0q.size(), this.A04) - 2);
            }
        }
        list2.addAll(arrayList);
        setBounds(new Rect(0, 0, getIntrinsicWidth(), getIntrinsicHeight()));
    }

    private final void A01(List list, boolean z) {
        Object obj;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Number valueOf;
        if (!list.isEmpty()) {
            boolean A1N = AbstractC167007dF.A1N(list.size() % 2);
            float exactCenterX = getBounds().exactCenterX();
            int intrinsicWidth = ((C44202Jg5) AbstractC001800i.A0I(list)).A02.getIntrinsicWidth();
            int intrinsicHeight = ((C44202Jg5) AbstractC001800i.A0I(list)).A02.getIntrinsicHeight();
            int i = getBounds().top;
            if (z) {
                obj = Float.valueOf(intrinsicHeight * (1.0f - this.A03));
            } else {
                obj = 0;
            }
            int A0H = i + AbstractC166987dD.A0H(obj);
            if (A1N) {
                f = intrinsicWidth * (1.0f - this.A01);
            } else {
                f = intrinsicWidth / 2;
            }
            int i2 = (int) (exactCenterX - f);
            int size = list.size();
            C44202Jg5 c44202Jg5 = (C44202Jg5) AbstractC001800i.A0I(list);
            int i3 = i2 + intrinsicWidth;
            c44202Jg5.A02.setBounds(i2, A0H, i3, A0H + intrinsicHeight);
            if (A1N) {
                f2 = -this.A02;
            } else {
                f2 = 0.0f;
            }
            c44202Jg5.A00 = f2;
            int i4 = size - 1;
            c44202Jg5.A01 = size;
            int size2 = list.size();
            int i5 = 1;
            boolean z2 = true;
            while (i5 < size2) {
                if (z2) {
                    f3 = i3;
                    f4 = intrinsicWidth;
                    f5 = this.A01;
                } else {
                    f3 = i2;
                    f4 = intrinsicWidth;
                    f5 = 1.0f - this.A01;
                }
                int i6 = (int) (f3 - (f4 * f5));
                int i7 = 2;
                if (A1N) {
                    i7 = 1;
                }
                if (i5 > i7 && this.A0F.isEmpty()) {
                    valueOf = Integer.valueOf(this.A06);
                } else {
                    valueOf = Float.valueOf(0.0f);
                }
                int intValue = A0H - valueOf.intValue();
                if (z2) {
                    i3 = i6 + intrinsicWidth;
                } else {
                    i2 = i6;
                }
                C44202Jg5 c44202Jg52 = (C44202Jg5) list.get(i5);
                c44202Jg52.A02.setBounds(i6, intValue, i6 + intrinsicWidth, intValue + intrinsicHeight);
                float f6 = this.A02;
                int i8 = -1;
                if (z2) {
                    i8 = 1;
                }
                c44202Jg52.A00 = f6 * i8;
                c44202Jg52.A01 = i4;
                z2 = !z2;
                i5++;
                i4--;
            }
            if (list.size() > 1) {
                JUD.A01(43, list);
            }
        }
    }

    @Override // X.C5RN
    public final List A07() {
        ArrayList A0S = AbstractC001800i.A0S(this.A0F, this.A0E);
        ArrayList A0q = AbstractC167017dG.A0q(A0S);
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            A0q.add(((C44202Jg5) it.next()).A02);
        }
        return AbstractC001800i.A0U(A0q);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A05;
        int i2 = 0;
        if (!this.A0F.isEmpty()) {
            i2 = AbstractC166987dD.A0B(i, 1.0f - this.A03);
        } else {
            List list = this.A0E;
            int size = list.size() % 2;
            int size2 = list.size();
            if (size != 0 ? size2 > 2 : size2 > 1) {
                i2 = this.A06;
            }
        }
        return i + i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f;
        int i = this.A05;
        List list = this.A0F;
        if (list.isEmpty()) {
            list = this.A0E;
        }
        int A09 = AbstractC25229BEm.A09(list);
        if (list.size() % 2 == 0) {
            f = 0.0f;
        } else {
            f = this.A01;
        }
        return i + (A09 * C1H4.A01(1.0f - f) * i);
    }

    @Override // X.C5RN, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            ((C44202Jg5) it.next()).A02.setAlpha(i);
        }
        Iterator it2 = this.A0F.iterator();
        while (it2.hasNext()) {
            ((C44202Jg5) it2.next()).A02.setAlpha(i);
        }
        invalidateSelf();
    }

    public static final void A00(Canvas canvas, C44202Jg5 c44202Jg5) {
        canvas.save();
        float f = c44202Jg5.A00;
        Drawable drawable = c44202Jg5.A02;
        canvas.rotate(f, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }
}
