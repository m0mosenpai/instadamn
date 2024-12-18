package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.Choreographer;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.KKh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ChoreographerFrameCallbackC45695KKh extends C5RN implements Choreographer.FrameCallback {
    public static final CharSequence A0L = "…";
    public Date A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Typeface A07;
    public final UserSession A08;
    public final ChoreographerFrameCallbackC13290mF A09;
    public final C6RB A0A;
    public final String A0B;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int[] A0I;
    public final KKd[] A0J;
    public final String[] A0K;
    public final HashMap A0C = AbstractC166987dD.A1G();
    public final List A0H = AbstractC166987dD.A1E();
    public Integer A00 = C05F.A00;

    public static void A01(ChoreographerFrameCallbackC45695KKh choreographerFrameCallbackC45695KKh) {
        Date date = choreographerFrameCallbackC45695KKh.A01;
        if (date != null && choreographerFrameCallbackC45695KKh.A00 != C05F.A00) {
            HashMap hashMap = choreographerFrameCallbackC45695KKh.A0C;
            C23831Eq.A0H(date, hashMap);
            ImmutableMap copyOf = ImmutableMap.copyOf((Map) hashMap);
            if (A02(choreographerFrameCallbackC45695KKh, JQ0.A08(copyOf, EnumC89613z1.A05, 0), JQ0.A08(copyOf, EnumC89613z1.A02, 0), JQ0.A08(copyOf, EnumC89613z1.A03, 0), JQ0.A08(copyOf, EnumC89613z1.A04, 0), JQ0.A08(copyOf, EnumC89613z1.A06, 0))) {
                choreographerFrameCallbackC45695KKh.A09.A00();
                choreographerFrameCallbackC45695KKh.invalidateSelf();
            }
        } else {
            int[] iArr = choreographerFrameCallbackC45695KKh.A0I;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
        }
        choreographerFrameCallbackC45695KKh.A09.A01();
        choreographerFrameCallbackC45695KKh.invalidateSelf();
    }

    public static boolean A02(ChoreographerFrameCallbackC45695KKh choreographerFrameCallbackC45695KKh, int i, int i2, int i3, int i4, int i5) {
        int[] iArr = choreographerFrameCallbackC45695KKh.A0I;
        if (i > 0) {
            iArr[0] = i;
            iArr[1] = i2;
            iArr[2] = i3;
            iArr[3] = i4;
            String[] strArr = choreographerFrameCallbackC45695KKh.A0K;
            Context context = choreographerFrameCallbackC45695KKh.A06;
            strArr[0] = A00(context, EnumC89613z1.A05, i);
            strArr[1] = A00(context, EnumC89613z1.A02, i2);
            strArr[2] = A00(context, EnumC89613z1.A03, i3);
            strArr[3] = A00(context, EnumC89613z1.A04, i4);
            return false;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        String[] strArr2 = choreographerFrameCallbackC45695KKh.A0K;
        Context context2 = choreographerFrameCallbackC45695KKh.A06;
        strArr2[0] = A00(context2, EnumC89613z1.A02, i2);
        strArr2[1] = A00(context2, EnumC89613z1.A03, i3);
        strArr2[2] = A00(context2, EnumC89613z1.A04, i4);
        strArr2[3] = A00(context2, EnumC89613z1.A06, i5);
        return true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A02 = true;
        A01(this);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0H;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (this.A0F * 8) + (this.A0D * 4) + (this.A0G * 3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float intrinsicWidth = ((i + i3) / 2.0f) - (getIntrinsicWidth() / 2.0f);
        float intrinsicHeight = ((i2 + i4) / 2.0f) - (getIntrinsicHeight() / 2.0f);
        float f = this.A0E;
        float f2 = f + intrinsicHeight;
        C6RB c6rb = this.A0A;
        float f3 = c6rb.A0A;
        float f4 = c6rb.A06;
        float f5 = (this.A0G / 2.0f) + intrinsicWidth;
        float f6 = (f / 2.0f) + intrinsicHeight;
        int i5 = 0;
        do {
            this.A0J[i5].setBounds((int) intrinsicWidth, (int) intrinsicHeight, (int) (this.A0F + intrinsicWidth), (int) f2);
            i5++;
        } while (i5 < 8);
        float f7 = f3 / 2.0f;
        float f8 = f4 / 2.0f;
        c6rb.setBounds((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        ChoreographerFrameCallbackC13290mF choreographerFrameCallbackC13290mF = this.A09;
        if (z) {
            choreographerFrameCallbackC13290mF.A00();
        } else {
            choreographerFrameCallbackC13290mF.A01();
        }
        return super.setVisible(z, z2);
    }

    public ChoreographerFrameCallbackC45695KKh(Context context, UserSession userSession, int i, int i2, int i3) {
        this.A08 = userSession;
        this.A06 = context;
        Resources resources = context.getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.account_group_management_row_text_size);
        this.A07 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0x);
        this.A0F = AbstractC166997dE.A09(resources);
        this.A0E = resources.getDimensionPixelSize(R.dimen.audio_bar_margin_bottom);
        this.A0D = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
        this.A0G = AbstractC166997dE.A09(resources);
        this.A0I = new int[4];
        this.A0K = new String[4];
        this.A09 = new ChoreographerFrameCallbackC13290mF(this, 1000L);
        this.A0J = new KKd[8];
        int i4 = 0;
        do {
            this.A0J[i4] = new KKd(this.A06, this.A07, this.A08, this.A0F, this.A0E, this.A04);
            KKd kKd = this.A0J[i4];
            kKd.A0H.A0F(i2);
            kKd.A0I.A0F(i2);
            kKd.A0G.setColorFilter(i3, PorterDuff.Mode.SRC);
            kKd.invalidateSelf();
            this.A0J[i4].setCallback(this);
            this.A0H.add(this.A0J[i4]);
            i4++;
        } while (i4 < 8);
        this.A0B = resources.getString(2131956875);
        this.A05 = i;
        C6RB A0z = AbstractC166987dD.A0z(this.A06, this.A0G);
        this.A0A = A0z;
        AMr.A05(this.A06, this.A08, A0z, this.A04);
        A0z.A0M(this.A0B);
        A0z.A0F(this.A05);
        Typeface typeface = this.A07;
        if (typeface != null) {
            A0z.A0I(typeface);
        }
        this.A0H.add(A0z);
        resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public static String A00(Context context, EnumC89613z1 enumC89613z1, int i) {
        Resources resources;
        int i2;
        int ordinal = enumC89613z1.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    resources = context.getResources();
                    i2 = R.plurals.countdown_sticker_day;
                    if (ordinal != 3) {
                        i2 = R.plurals.countdown_sticker_month;
                    }
                } else {
                    resources = context.getResources();
                    i2 = R.plurals.countdown_sticker_hour;
                }
            } else {
                resources = context.getResources();
                i2 = R.plurals.countdown_sticker_minute;
            }
        } else {
            resources = context.getResources();
            i2 = R.plurals.countdown_sticker_second;
        }
        return resources.getQuantityString(i2, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        int i = 0;
        do {
            int[] iArr = this.A0I;
            int i2 = iArr[i];
            KKd[] kKdArr = this.A0J;
            int i3 = i * 2;
            kKdArr[i3].A09(i2 / 10, this.A02);
            kKdArr[i3].draw(canvas);
            int i4 = this.A0F;
            canvas.translate(this.A0D + i4, 0.0f);
            if (iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0 && this.A03 && i == 3) {
                this.A03 = false;
                C2UY.A01.A05(50L);
                kKdArr[i3 + 1].A08();
            } else {
                kKdArr[i3 + 1].A09(i2 % 10, this.A02);
            }
            kKdArr[i3 + 1].draw(canvas);
            canvas.translate(i4, 0.0f);
            if (i >= 3) {
                break;
            }
            this.A0A.draw(canvas);
            canvas.translate(this.A0G, 0.0f);
            i++;
        } while (i < 4);
        canvas.restore();
    }
}
