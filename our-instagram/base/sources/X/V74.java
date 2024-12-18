package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes11.dex */
public final class V74 extends C5RU {
    public C66646URk A00;
    public C6S5 A01;
    public List A02;
    public int A03;
    public int A04;
    public List A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final Paint A09;
    public final TextPaint A0A;
    public final C69770Vv7 A0B = new C69770Vv7();
    public final C70076W1t A0C;
    public final C69555VrK A0D;

    public V74(Context context, C66646URk c66646URk, C70076W1t c70076W1t) {
        int A01;
        int intValue;
        this.A08 = context;
        this.A0C = c70076W1t;
        this.A01 = c66646URk.A03;
        this.A04 = c66646URk.A00;
        Integer num = c66646URk.A05;
        Integer num2 = c66646URk.A04;
        TextPaint textPaint = new TextPaint(1);
        if (num != null) {
            A01 = num.intValue();
        } else {
            A01 = WF8.A01(this.A01, this.A04);
        }
        textPaint.setColor(A01);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0z));
        this.A0A = textPaint;
        Paint paint = new Paint();
        if (num2 == null && (num2 = WF8.A03(this.A01, this.A04)) == null) {
            intValue = 16777215;
        } else {
            intValue = num2.intValue();
        }
        paint.setColor(intValue);
        this.A09 = paint;
        this.A0D = new C69555VrK(textPaint);
        this.A06 = (int) AbstractC13880nE.A04(context, 340);
        this.A07 = (int) AbstractC13880nE.A04(context, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        this.A02 = new ArrayList();
        this.A05 = C16930sl.A00;
        this.A03 = Color.alpha(textPaint.getColor());
        this.A00 = c66646URk;
        A00();
    }

    @Override // X.C5RU
    public final void A08(C66646URk c66646URk) {
        C14360o3.A0B(c66646URk, 0);
        if (!C14360o3.A0K(this.A00, c66646URk)) {
            this.A00 = c66646URk;
            A00();
        }
    }

    @Override // X.C5RU
    public final void A09(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A01 = c6s5;
        A02();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            r8 = r15
            X.AbstractC167007dF.A0r(r15)
            X.AbstractC167017dG.A12(r15, r14)
            X.Vv7 r0 = r14.A0B
            X.Vhu r3 = r0.A00()
            if (r3 == 0) goto L47
            int r2 = r3.A01
            java.util.List r4 = r14.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            int r0 = r4.size()
            int r5 = X.AbstractC16960so.A1K(r1, r4, r0)
            if (r5 >= 0) goto L26
            int r0 = -r5
            int r0 = r0 + (-1)
            int r5 = r0 + (-1)
        L26:
            java.util.List r0 = r14.A02
            int r4 = X.AbstractC31176DnK.A01(r0, r5)
            java.util.List r1 = r14.A02
            int r0 = r5 + 1
            java.lang.Object r0 = X.AbstractC001800i.A0O(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Lb5
            int r5 = r0.intValue()
        L3c:
            if (r4 >= r5) goto L47
            r9 = 0
            if (r4 != r2) goto L4b
            float r1 = r3.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L4f
        L47:
            r15.restore()
            return
        L4b:
            if (r4 > r2) goto L47
            r1 = 1065353216(0x3f800000, float:1.0)
        L4f:
            X.6S5 r6 = r14.A01
            X.6S5 r0 = X.C6S5.A05
            if (r6 == r0) goto L83
            java.util.List r0 = r14.A05
            java.lang.Object r7 = r0.get(r4)
            X.VsX r7 = (X.C69630VsX) r7
            android.graphics.Paint r13 = r14.A09
            int r0 = r14.A03
            float r0 = (float) r0
            float r0 = r0 * r1
            int r6 = (int) r0
            r0 = 1
            X.C14360o3.A0B(r13, r0)
            r13.setAlpha(r6)
            r15.save()
            float r6 = r7.A04
            float r0 = r7.A05
            r15.translate(r6, r0)
            float r0 = r7.A03
            float r10 = -r0
            float r11 = r7.A02
            float r12 = r7.A00
            float r12 = r12 + r0
            r8.drawRect(r9, r10, r11, r12, r13)
            r15.restore()
        L83:
            java.util.List r0 = r14.A05
            java.lang.Object r7 = r0.get(r4)
            X.VsX r7 = (X.C69630VsX) r7
            android.text.TextPaint r6 = r14.A0A
            int r0 = r14.A03
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            r6.setAlpha(r1)
            float r0 = r7.A01
            r6.setTextSize(r0)
            r15.save()
            float r1 = r7.A04
            float r0 = r7.A05
            r15.translate(r1, r0)
            java.lang.String r1 = r7.A06
            float r0 = r7.A00
            r15.drawText(r1, r9, r0, r6)
            r15.restore()
            int r4 = r4 + 1
            goto L3c
        Lb5:
            X.URk r0 = r14.A00
            java.util.List r0 = r0.A07
            int r5 = r0.size()
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V74.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        A01();
    }

    private final void A00() {
        this.A0B.A02(this.A00.A07);
        this.A02 = new C69590Vrt(this.A0C, this.A00.A07).A00();
        A01();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.0sl] */
    private final void A01() {
        int size;
        ?? arrayList;
        String str;
        float A0H = AbstractC166997dE.A0H(this);
        C17u A1S = AbstractC16960so.A1S(this.A02);
        ArrayList A0i = AbstractC167007dF.A0i(A1S);
        Iterator it = A1S.iterator();
        while (it.hasNext()) {
            int A00 = ((AbstractC16880sg) it).A00();
            int A01 = AbstractC31176DnK.A01(this.A02, A00);
            Number number = (Number) AbstractC001800i.A0O(this.A02, A00 + 1);
            if (number != null) {
                size = number.intValue();
            } else {
                size = this.A00.A07.size();
            }
            Context context = this.A08;
            C69555VrK c69555VrK = this.A0D;
            List subList = this.A00.A07.subList(A01, size);
            ArrayList A0i2 = AbstractC167007dF.A0i(subList);
            Iterator it2 = subList.iterator();
            while (it2.hasNext()) {
                String str2 = ((US9) it2.next()).A06;
                Locale locale = Locale.getDefault();
                C14360o3.A07(locale);
                String upperCase = str2.toUpperCase(locale);
                C14360o3.A07(upperCase);
                A0i2.add(upperCase);
            }
            AbstractC167007dF.A1D(context, 0, c69555VrK);
            float[] fArr = AbstractC68629VYf.A00;
            ArrayList arrayList2 = new ArrayList(5);
            int i = 0;
            do {
                float A03 = AbstractC13880nE.A03(context, fArr[i]);
                TextPaint textPaint = c69555VrK.A01;
                float textSize = textPaint.getTextSize();
                textPaint.setTextSize(A03);
                textPaint.getTextBounds("A", 0, 1, c69555VrK.A00);
                textPaint.setTextSize(textSize);
                arrayList2.add(new C68968Vf6(A03, r1.height()));
                i++;
            } while (i < 5);
            float A04 = AbstractC13880nE.A04(context, 20);
            Random random = new Random(A0i2.hashCode());
            if (A0i2.isEmpty()) {
                arrayList = C16930sl.A00;
            } else {
                arrayList = new ArrayList();
                for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                    arrayList.clear();
                    float f = A04 / 2.0f;
                    String str3 = (String) AbstractC001800i.A0I(A0i2);
                    int nextInt = 4 - random.nextInt(3);
                    while (true) {
                        if (nextInt > 0) {
                            if (c69555VrK.A00(str3, ((C68968Vf6) arrayList2.get(nextInt)).A01) <= A0H) {
                                break;
                            } else {
                                nextInt--;
                            }
                        } else {
                            nextInt = 0;
                            break;
                        }
                    }
                    Iterator it3 = A0i2.iterator();
                    int i2 = 0;
                    float f2 = 0.0f;
                    while (it3.hasNext()) {
                        i2++;
                        String str4 = (String) it3.next();
                        if (f2 == 0.0f && nextInt == 0) {
                            float A002 = c69555VrK.A00(str4, ((C68968Vf6) arrayList2.get(nextInt)).A01);
                            if (A002 > A0H) {
                                float f3 = A0H / A002;
                                arrayList.add(new C69630VsX(str4, f3 * ((C68968Vf6) arrayList2.get(0)).A01, f3 * ((C68968Vf6) arrayList2.get(0)).A00, A0H, f, 0.0f, f));
                                f2 = A0H;
                            }
                        }
                        if (f2 != 0.0f && f2 + c69555VrK.A00(str4, ((C68968Vf6) arrayList2.get(nextInt)).A01) > A0H) {
                            f += ((C68968Vf6) arrayList2.get(nextInt)).A00 + f;
                            int nextInt2 = random.nextInt(size2 + 1);
                            while (true) {
                                if (nextInt2 > 0) {
                                    if (nextInt2 != nextInt && c69555VrK.A00(str4, ((C68968Vf6) arrayList2.get(nextInt2)).A01) <= A0H) {
                                        break;
                                    } else {
                                        nextInt2--;
                                    }
                                } else {
                                    nextInt2 = 0;
                                    break;
                                }
                            }
                            nextInt = nextInt2;
                            f2 = 0.0f;
                        }
                        if (str4.length() == 1 && f2 == 0.0f && (str = (String) AbstractC001800i.A0O(A0i2, i2)) != null) {
                            String A0T = AnonymousClass001.A0T(str4, str, ' ');
                            int nextInt3 = random.nextInt(size2 + 1);
                            while (true) {
                                if (nextInt3 > 0) {
                                    if (nextInt3 != nextInt && c69555VrK.A00(A0T, ((C68968Vf6) arrayList2.get(nextInt3)).A01) <= A0H) {
                                        break;
                                    } else {
                                        nextInt3--;
                                    }
                                } else {
                                    nextInt3 = 0;
                                    break;
                                }
                            }
                            nextInt = nextInt3;
                        }
                        arrayList.add(new C69630VsX(str4, ((C68968Vf6) arrayList2.get(nextInt)).A01, ((C68968Vf6) arrayList2.get(nextInt)).A00, c69555VrK.A00(AnonymousClass001.A0C(str4, ' '), ((C68968Vf6) arrayList2.get(nextInt)).A01), f, f2, f));
                        f2 += c69555VrK.A00(AnonymousClass001.A0C(str4, ' '), ((C68968Vf6) arrayList2.get(nextInt)).A01);
                    }
                    float f4 = f + ((C68968Vf6) arrayList2.get(nextInt)).A00;
                    if (size2 != 0 && f4 > A0H) {
                    }
                }
            }
            A0i.add(arrayList);
        }
        this.A05 = AbstractC06950Ym.A1F(A0i);
        invalidateSelf();
    }

    private final void A02() {
        int i;
        TextPaint textPaint = this.A0A;
        textPaint.setColor(WF8.A01(this.A01, this.A04));
        Paint paint = this.A09;
        Integer A03 = WF8.A03(this.A01, this.A04);
        if (A03 != null) {
            i = A03.intValue();
        } else {
            i = 16777215;
        }
        paint.setColor(i);
        this.A03 = Color.alpha(textPaint.getColor());
        invalidateSelf();
    }

    @Override // X.C5RU
    public final int A04() {
        return this.A04;
    }

    @Override // X.C5RU
    public final C66646URk A05() {
        return this.A00;
    }

    @Override // X.C5RU
    public final C6S5 A06() {
        return this.A01;
    }

    @Override // X.C5RU
    public final void A07(int i) {
        this.A04 = i;
        A02();
    }

    @Override // X.C5RR
    public final /* bridge */ /* synthetic */ C5NL C0T() {
        return this.A00;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A0B.A01(i);
        invalidateSelf();
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
