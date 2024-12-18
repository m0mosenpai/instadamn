package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.Layout;
import android.view.Choreographer;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.KKg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ChoreographerFrameCallbackC45694KKg extends C5RN implements Choreographer.FrameCallback {
    public static final CharSequence A0Q = "…";
    public int A00;
    public int A01;
    public Date A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final UserSession A09;
    public final C6RB A0A;
    public final C6RB A0B;
    public final String A0C;
    public final String A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final ChoreographerFrameCallbackC13290mF A0K;
    public final int[] A0N;
    public final KKd[] A0O;
    public final String[] A0P;
    public final Map A0M = AbstractC166987dD.A1G();
    public final List A0L = AbstractC166987dD.A1E();
    public Integer A02 = C05F.A00;

    public static final void A00(ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg) {
        Integer num;
        Date date = choreographerFrameCallbackC45694KKg.A03;
        if (date != null && (num = choreographerFrameCallbackC45694KKg.A02) != C05F.A00) {
            if (num == C05F.A01) {
                Context context = choreographerFrameCallbackC45694KKg.A08;
                String A03 = C23831Eq.A03(context, TimeUnit.MILLISECONDS.toSeconds(date.getTime()));
                C6RB c6rb = choreographerFrameCallbackC45694KKg.A0A;
                c6rb.A0E(choreographerFrameCallbackC45694KKg.getIntrinsicWidth());
                c6rb.A0M(AbstractC167007dF.A0f(context, A03, 2131956867));
            } else {
                choreographerFrameCallbackC45694KKg.A0A.A0E(choreographerFrameCallbackC45694KKg.A0J);
            }
            Map map = choreographerFrameCallbackC45694KKg.A0M;
            C23831Eq.A0H(date, map);
            ImmutableMap copyOf = ImmutableMap.copyOf(map);
            C14360o3.A07(copyOf);
            if (choreographerFrameCallbackC45694KKg.A01(AbstractC31177DnL.A03((Number) copyOf.getOrDefault(EnumC89613z1.A05, 0)), AbstractC31177DnL.A03((Number) copyOf.getOrDefault(EnumC89613z1.A02, 0)), AbstractC31177DnL.A03((Number) copyOf.getOrDefault(EnumC89613z1.A03, 0)), AbstractC31177DnL.A03((Number) copyOf.getOrDefault(EnumC89613z1.A04, 0)), AbstractC25227BEk.A06((Number) copyOf.getOrDefault(EnumC89613z1.A06, 0), 0))) {
                choreographerFrameCallbackC45694KKg.A0K.A00();
                choreographerFrameCallbackC45694KKg.invalidateSelf();
            }
        } else {
            int[] iArr = choreographerFrameCallbackC45694KKg.A0N;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            C6RB c6rb2 = choreographerFrameCallbackC45694KKg.A0A;
            c6rb2.A0E(choreographerFrameCallbackC45694KKg.getIntrinsicWidth());
            c6rb2.A0M(choreographerFrameCallbackC45694KKg.A0C);
        }
        choreographerFrameCallbackC45694KKg.A0K.A01();
        choreographerFrameCallbackC45694KKg.invalidateSelf();
    }

    private final boolean A01(int i, int i2, int i3, int i4, int i5) {
        String[] strArr;
        String A00;
        boolean A1O = AbstractC167007dF.A1O(i);
        boolean A1O2 = AbstractC167007dF.A1O(i2);
        int[] iArr = this.A0N;
        if (A1O) {
            iArr[0] = i;
            iArr[1] = i2;
            iArr[2] = i3;
            strArr = this.A0P;
            Context context = this.A08;
            strArr[0] = AbstractC47090Krl.A00(context, EnumC89613z1.A05, i);
            strArr[1] = AbstractC47090Krl.A00(context, EnumC89613z1.A02, i2);
            A00 = AbstractC47090Krl.A00(context, EnumC89613z1.A03, i3);
        } else if (A1O2) {
            iArr[0] = i2;
            iArr[1] = i3;
            iArr[2] = i4;
            strArr = this.A0P;
            Context context2 = this.A08;
            strArr[0] = AbstractC47090Krl.A00(context2, EnumC89613z1.A02, i2);
            strArr[1] = AbstractC47090Krl.A00(context2, EnumC89613z1.A03, i3);
            A00 = AbstractC47090Krl.A00(context2, EnumC89613z1.A04, i4);
        } else {
            iArr[0] = i3;
            iArr[1] = i4;
            iArr[2] = i5;
            String[] strArr2 = this.A0P;
            Context context3 = this.A08;
            strArr2[0] = AbstractC47090Krl.A00(context3, EnumC89613z1.A03, i3);
            strArr2[1] = AbstractC47090Krl.A00(context3, EnumC89613z1.A04, i4);
            strArr2[2] = AbstractC47090Krl.A00(context3, EnumC89613z1.A06, i5);
            return true;
        }
        strArr[2] = A00;
        return false;
    }

    public final void A08(int i, int i2, int i3, int i4) {
        int i5 = 0;
        do {
            KKd kKd = this.A0O[i5];
            kKd.A0H.A0F(i);
            kKd.A0I.A0F(i);
            kKd.A0G.setColorFilter(i2, PorterDuff.Mode.SRC);
            kKd.invalidateSelf();
            i5++;
        } while (i5 < 6);
        this.A0B.A0F(i3);
        this.A0A.A0F(i4);
        invalidateSelf();
    }

    public final void A0A(Date date) {
        int i;
        this.A03 = date;
        this.A02 = C05F.A0C;
        this.A0A.A0E(this.A0J);
        Map map = this.A0M;
        Date date2 = this.A03;
        if (date2 != null) {
            C23831Eq.A0H(date2, map);
            ImmutableMap copyOf = ImmutableMap.copyOf(map);
            C14360o3.A07(copyOf);
            EnumC89613z1 enumC89613z1 = EnumC89613z1.A05;
            int A0K = AbstractC167017dG.A0K((Number) copyOf.getOrDefault(enumC89613z1, 0));
            EnumC89613z1 enumC89613z12 = EnumC89613z1.A02;
            int A0K2 = AbstractC167017dG.A0K((Number) copyOf.getOrDefault(enumC89613z12, 0));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            if (A0K > 0) {
                i = 11;
            } else {
                if (A0K2 > 0) {
                    i = 12;
                }
                Date time = calendar.getTime();
                C14360o3.A07(time);
                C23831Eq.A0H(time, map);
                ImmutableMap copyOf2 = ImmutableMap.copyOf(map);
                A01(AbstractC31177DnL.A03((Number) copyOf2.getOrDefault(enumC89613z1, 0)), AbstractC31177DnL.A03((Number) copyOf2.getOrDefault(enumC89613z12, 0)), AbstractC31177DnL.A03((Number) copyOf2.getOrDefault(EnumC89613z1.A03, 0)), AbstractC31177DnL.A03((Number) copyOf2.getOrDefault(EnumC89613z1.A04, 0)), AbstractC25227BEk.A06((Number) copyOf2.getOrDefault(EnumC89613z1.A06, 0), 0));
                this.A0K.A00();
                invalidateSelf();
                return;
            }
            calendar.add(i, 1);
            Date time2 = calendar.getTime();
            C14360o3.A07(time2);
            C23831Eq.A0H(time2, map);
            ImmutableMap copyOf22 = ImmutableMap.copyOf(map);
            A01(AbstractC31177DnL.A03((Number) copyOf22.getOrDefault(enumC89613z1, 0)), AbstractC31177DnL.A03((Number) copyOf22.getOrDefault(enumC89613z12, 0)), AbstractC31177DnL.A03((Number) copyOf22.getOrDefault(EnumC89613z1.A03, 0)), AbstractC31177DnL.A03((Number) copyOf22.getOrDefault(EnumC89613z1.A04, 0)), AbstractC25227BEk.A06((Number) copyOf22.getOrDefault(EnumC89613z1.A06, 0), 0));
            this.A0K.A00();
            invalidateSelf();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A05 = true;
        A00(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r1 != X.C05F.A01) goto L9;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            r6 = 0
            X.C14360o3.A0B(r15, r6)
            r15.save()
            java.util.Date r0 = r14.A03
            r13 = 1
            r12 = 0
            if (r0 == 0) goto L18
            r12 = 1
            java.lang.Integer r1 = r14.A02
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto L18
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L1d
        L18:
            X.6RB r0 = r14.A0A
            r0.draw(r15)
        L1d:
            int[] r5 = r14.A0N
            r0 = r5[r6]
            r4 = 2
            if (r0 != 0) goto L9e
            r0 = r5[r13]
            if (r0 != 0) goto L9e
            r0 = r5[r4]
            if (r0 != 0) goto L9e
        L2c:
            r3 = 0
        L2d:
            if (r12 == 0) goto L45
            java.lang.Integer r1 = r14.A02
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L45
            X.6RB r1 = r14.A0A
            java.lang.String[] r0 = r14.A0P
            r0 = r0[r3]
            if (r0 != 0) goto L3f
            java.lang.String r0 = ""
        L3f:
            r1.A0M(r0)
            r1.draw(r15)
        L45:
            r11 = r5[r3]
            X.KKd[] r9 = r14.A0O
            int r10 = r3 * 2
            r2 = r9[r10]
            int r1 = r11 / 10
            boolean r0 = r14.A05
            r2.A09(r1, r0)
            r0 = r9[r10]
            r0.draw(r15)
            int r8 = r14.A0G
            int r0 = r14.A0E
            int r0 = r0 + r8
            float r0 = (float) r0
            r7 = 0
            r15.translate(r0, r7)
            if (r13 == 0) goto L92
            boolean r0 = r14.A04
            if (r0 == 0) goto L92
            if (r3 != r4) goto L92
            r14.A04 = r6
            int r0 = r10 + 1
            r0 = r9[r0]
            r0.A08()
        L74:
            int r0 = r10 + 1
            r0 = r9[r0]
            r0.draw(r15)
            float r0 = (float) r8
            r15.translate(r0, r7)
            if (r3 >= r4) goto La0
            X.6RB r0 = r14.A0B
            r0.draw(r15)
            int r0 = r14.A0I
            float r0 = (float) r0
            r15.translate(r0, r7)
            int r3 = r3 + 1
            r0 = 3
            if (r3 >= r0) goto La0
            goto L2d
        L92:
            int r0 = r10 + 1
            r2 = r9[r0]
            int r1 = r11 % 10
            boolean r0 = r14.A05
            r2.A09(r1, r0)
            goto L74
        L9e:
            r13 = 0
            goto L2c
        La0:
            r15.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ChoreographerFrameCallbackC45694KKg.draw(android.graphics.Canvas):void");
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0L;
    }

    public final void A09(Date date) {
        this.A03 = date;
        this.A02 = C05F.A0C;
        this.A05 = false;
        A00(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0F + this.A0H + this.A0A.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (this.A0G * 6) + (this.A0E * 3) + (this.A0I * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        float intrinsicWidth = ((i + i3) / 2.0f) - (getIntrinsicWidth() / 2.0f);
        float intrinsicHeight = ((i2 + i4) / 2.0f) - (getIntrinsicHeight() / 2.0f);
        float f = this.A0F;
        float f2 = f + intrinsicHeight;
        C6RB c6rb = this.A0B;
        float f3 = c6rb.A0A;
        float f4 = c6rb.A06;
        float f5 = (this.A0I / 2.0f) + intrinsicWidth;
        float f6 = (f / 2.0f) + intrinsicHeight;
        C6RB c6rb2 = this.A0A;
        float f7 = c6rb2.A0A;
        int i6 = this.A0H;
        float f8 = i6 + c6rb2.A06;
        float descent = c6rb2.A0b.descent();
        int i7 = 0;
        do {
            i5 = (int) intrinsicWidth;
            this.A0O[i7].setBounds(i5, (int) intrinsicHeight, (int) (this.A0G + intrinsicWidth), (int) f2);
            i7++;
        } while (i7 < 6);
        float f9 = f3 / 2.0f;
        float f10 = f4 / 2.0f;
        c6rb.setBounds((int) (f5 - f9), (int) (f6 - f10), (int) (f5 + f9), (int) (f6 + f10));
        float f11 = descent / 2.0f;
        c6rb2.setBounds(i5, (int) (i6 + f2 + f11), (int) (intrinsicWidth + f7), (int) ((f2 + f8) - f11));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        ChoreographerFrameCallbackC13290mF choreographerFrameCallbackC13290mF = this.A0K;
        if (z) {
            choreographerFrameCallbackC13290mF.A00();
        } else {
            choreographerFrameCallbackC13290mF.A01();
        }
        return super.setVisible(z, z2);
    }

    public ChoreographerFrameCallbackC45694KKg(UserSession userSession, Context context) {
        this.A09 = userSession;
        this.A08 = context;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A0G = dimensionPixelSize;
        this.A0F = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        int A0D = AbstractC166997dE.A0D(resources);
        this.A0E = A0D;
        this.A0I = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A07 = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        this.A0H = AbstractC166997dE.A07(resources);
        this.A06 = AbstractC166997dE.A0A(resources);
        this.A0J = (dimensionPixelSize * 2) + A0D;
        this.A0N = new int[3];
        this.A0P = new String[3];
        this.A0K = new ChoreographerFrameCallbackC13290mF(this, 1000L);
        ArrayList A17 = AbstractC25225BEi.A17(6);
        int i = 0;
        int i2 = 0;
        do {
            A17.add(new KKd(this.A08, null, this.A09, this.A0G, this.A0F, -1));
            i2++;
        } while (i2 < 6);
        this.A0O = (KKd[]) A17.toArray(new KKd[0]);
        do {
            this.A0O[i].setCallback(this);
            this.A0L.add(this.A0O[i]);
            i++;
        } while (i < 6);
        this.A0D = resources.getString(2131956875);
        this.A01 = this.A08.getColor(R.color.countdown_sticker_title_text_color);
        C6RB A0z = AbstractC166987dD.A0z(this.A08, this.A0I);
        this.A0B = A0z;
        AMr.A05(this.A08, this.A09, A0z, this.A07);
        A0z.A0M(this.A0D);
        A0z.A0F(this.A01);
        this.A0L.add(A0z);
        this.A0C = resources.getString(2131956871);
        this.A00 = this.A08.getColor(R.color.countdown_sticker_footer_text_color);
        C6RB A0z2 = AbstractC166987dD.A0z(this.A08, getIntrinsicWidth());
        this.A0A = A0z2;
        A0z2.A0C(0.0f, 0.0f);
        A0z2.A0J(Typeface.SANS_SERIF, 1);
        A0z2.A0M(this.A0C);
        A0z2.A0A(this.A06);
        A0z2.A0F(this.A00);
        A0z2.A0G(1, "…");
        A0z2.A0K(Layout.Alignment.ALIGN_NORMAL);
        this.A0L.add(A0z2);
    }
}
