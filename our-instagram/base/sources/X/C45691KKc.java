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

/* renamed from: X.KKc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45691KKc extends C5RN {
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
    public final AbstractC47564Kza A0B;
    public final Integer A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final InterfaceC16820sZ A0G;
    public final float[] A0H;
    public final int[] A0I;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    public /* synthetic */ C45691KKc(Context context, UserSession userSession, AbstractC47564Kza abstractC47564Kza, Integer num, List list) {
        List list2;
        ArrayList arrayList;
        float A00 = AbstractC46779Kma.A00(context);
        float A002 = AbstractC46779Kma.A00(context);
        C50210MFr c50210MFr = C50210MFr.A00;
        C14360o3.A0B(c50210MFr, 11);
        this.A07 = context;
        this.A0A = userSession;
        this.A0B = abstractC47564Kza;
        this.A0C = num;
        this.A04 = 3;
        this.A01 = A00;
        this.A03 = A002;
        this.A02 = 20.0f;
        this.A0G = c50210MFr;
        HashSet A1H = AbstractC166987dD.A1H();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            AbstractC25231BEo.A1F(((C47563KzZ) obj).A00, obj, A1H, A1E);
        }
        this.A0D = A1E;
        this.A0E = AbstractC166987dD.A1E();
        this.A0F = AbstractC166987dD.A1E();
        Context context2 = this.A07;
        C14360o3.A0B(context2, 0);
        this.A06 = AbstractC166997dE.A04(context2, R.dimen.account_discovery_bottom_gap);
        Context context3 = this.A07;
        C14360o3.A0B(context3, 0);
        int A04 = AbstractC166997dE.A04(context3, R.dimen.album_preview_add_item_margin);
        this.A05 = A04;
        this.A0H = new float[]{0.4f, 0.6f, 1.0f};
        this.A00 = A04 * 1.4f * (1.0f - ((5 - A1E.size()) / 10.0f));
        this.A09 = AbstractC166987dD.A0T();
        Context context4 = this.A07;
        C14360o3.A0B(context4, 1);
        int A09 = AbstractC167007dF.A09(context4, R.attr.igds_color_gradient_pink);
        Context context5 = this.A07;
        C14360o3.A0B(context5, 1);
        int A092 = AbstractC167007dF.A09(context5, R.attr.igds_color_gradient_red);
        Context context6 = this.A07;
        C14360o3.A0B(context6, 1);
        this.A0I = new int[]{A09, A092, AbstractC167007dF.A09(context6, R.attr.igds_color_gradient_yellow)};
        this.A08 = AbstractC166987dD.A0S(3);
        List A0W = AbstractC001800i.A0W(this.A0D);
        ArrayList A0q = AbstractC167017dG.A0q(A0W);
        Iterator it = A0W.iterator();
        while (it.hasNext()) {
            A0q.add(new C47648L2h(new C44375JjE(this.A07, this.A0A, (C47563KzZ) it.next(), this.A0B, new MHM(this, 35)), this));
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

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            A00(canvas, (C47648L2h) it.next());
        }
        Iterator it2 = this.A0F.iterator();
        while (it2.hasNext()) {
            A00(canvas, (C47648L2h) it2.next());
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
        int[] iArr = this.A0I;
        paint.setShader(new LinearGradient(getBounds().right + A00, getBounds().top + A00, getBounds().left - A00, AbstractC166987dD.A0D(this) - A00, iArr, this.A0H, Shader.TileMode.CLAMP));
        paint.setAlpha(7);
        paint.setShadowLayer(f - 4.0f, 0.0f, 0.0f, AbstractC009903n.A00(iArr));
        float f2 = f - 2.0f;
        C14360o3.A0B(iArr, 0);
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        paint.setShadowLayer(f2, 0.0f, 0.0f, iArr[0]);
    }

    private final void A01(List list, boolean z) {
        Object obj;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Object valueOf;
        if (!list.isEmpty()) {
            boolean A1N = AbstractC167007dF.A1N(list.size() % 2);
            float exactCenterX = getBounds().exactCenterX();
            int intrinsicWidth = ((C47648L2h) AbstractC001800i.A0I(list)).A02.getIntrinsicWidth();
            int intrinsicHeight = ((C47648L2h) AbstractC001800i.A0I(list)).A02.getIntrinsicHeight();
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
            C47648L2h c47648L2h = (C47648L2h) AbstractC001800i.A0I(list);
            int i3 = i2 + intrinsicWidth;
            c47648L2h.A02.setBounds(i2, A0H, i3, A0H + intrinsicHeight);
            if (A1N) {
                f2 = -this.A02;
            } else {
                f2 = 0.0f;
            }
            c47648L2h.A00 = f2;
            int i4 = size - 1;
            c47648L2h.A01 = size;
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
                int A0H2 = A0H - AbstractC166987dD.A0H(valueOf);
                if (z2) {
                    i3 = i6 + intrinsicWidth;
                } else {
                    i2 = i6;
                }
                C47648L2h c47648L2h2 = (C47648L2h) list.get(i5);
                c47648L2h2.A02.setBounds(i6, A0H2, i6 + intrinsicWidth, A0H2 + intrinsicHeight);
                float f6 = this.A02;
                int i8 = -1;
                if (z2) {
                    i8 = 1;
                }
                c47648L2h2.A00 = f6 * i8;
                c47648L2h2.A01 = i4;
                z2 = !z2;
                i5++;
                i4--;
            }
            if (list.size() > 1) {
                JUD.A01(29, list);
            }
        }
    }

    @Override // X.C5RN
    public final List A07() {
        ArrayList A0S = AbstractC001800i.A0S(this.A0F, this.A0E);
        ArrayList A0q = AbstractC167017dG.A0q(A0S);
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            A0q.add(((C47648L2h) it.next()).A02);
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
            ((C47648L2h) it.next()).A02.setAlpha(i);
        }
        Iterator it2 = this.A0F.iterator();
        while (it2.hasNext()) {
            ((C47648L2h) it2.next()).A02.setAlpha(i);
        }
        invalidateSelf();
    }

    public static final void A00(Canvas canvas, C47648L2h c47648L2h) {
        canvas.save();
        float f = c47648L2h.A00;
        Drawable drawable = c47648L2h.A02;
        canvas.rotate(f, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }
}
