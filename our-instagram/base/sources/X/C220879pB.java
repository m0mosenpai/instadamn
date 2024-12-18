package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9pB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220879pB extends AbstractC130945vi implements InterfaceC133125ze {
    public C41629IbK A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final C6RL A09;
    public final C216229hf A0A;
    public final C6RB A0B;
    public final C6RB A0C;
    public final C6RB A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Drawable A0H;
    public final Drawable A0I;
    public final C124385ju A0J;
    public final List A0K;

    /* JADX WARN: Code restructure failed: missing block: B:83:0x002f, code lost:
    
        if (r3 == r1[1]) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.C41629IbK r10) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220879pB.A0B(X.IbK):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        C14360o3.A0B(canvas, 0);
        this.A0A.draw(canvas);
        if (this.A02) {
            drawable = this.A0I;
        } else {
            drawable = this.A0H;
        }
        drawable.draw(canvas);
        this.A0D.draw(canvas);
        if (!A00()) {
            this.A0C.draw(canvas);
        }
        this.A0B.draw(canvas);
        this.A09.draw(canvas);
    }

    public C220879pB(Context context) {
        boolean A1V = AbstractC167007dF.A1V(context);
        this.A08 = context;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0K = A1E;
        this.A01 = "";
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A07 = dimensionPixelSize;
        int A05 = AbstractC166997dE.A05(resources);
        this.A06 = resources.getDimensionPixelSize(R.dimen.fundraiser_sticker_title_text_size);
        this.A0G = AbstractC166997dE.A0C(resources);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A04 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A0E = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A0F = AbstractC166997dE.A0A(resources);
        this.A03 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_v2_facepile_text_size);
        int i = A05 * 2;
        int i2 = dimensionPixelSize - i;
        C216229hf c216229hf = new C216229hf(context);
        this.A0A = c216229hf;
        c216229hf.A0F(GradientDrawable.Orientation.TL_BR);
        c216229hf.setCallback(this);
        Drawable drawable = context.getDrawable(R.drawable.smb_support_sticker_cta_background);
        if (drawable != null) {
            this.A0H = drawable;
            Drawable drawable2 = context.getDrawable(R.drawable.fundraiser_white_sticker_donate_button_background);
            if (drawable2 != null) {
                this.A0I = drawable2;
                C124385ju c124385ju = new C124385ju(context, AbstractC166997dE.A0B(resources), R.color.chat_sticker_button_divider_color, 80);
                this.A0J = c124385ju;
                C6RB A0z = AbstractC166987dD.A0z(context, i2);
                this.A0D = A0z;
                C6RB A0z2 = AbstractC166987dD.A0z(context, i2);
                this.A0C = A0z2;
                C6RB A0z3 = AbstractC166987dD.A0z(context, i2);
                this.A0B = A0z3;
                C6RK c6rk = new C6RK(context, this, -1);
                c6rk.A00 = AbstractC13880nE.A0A(context) - i;
                c6rk.A01(2131974263);
                c6rk.A02(R.dimen.account_discovery_bottom_gap);
                C6RL A00 = c6rk.A00();
                this.A09 = A00;
                Collections.addAll(A1E, c216229hf, drawable, drawable2, c124385ju, A0z, A0z2, A0z3, A00);
                Context context2 = this.A08;
                C6RB c6rb = this.A0D;
                AMr.A06(context2, c6rb, this.A06, this.A05);
                c6rb.A0F(-16777216);
                c6rb.setCallback(this);
                C6RB c6rb2 = this.A0C;
                c6rb2.A0C(0.0f, this.A05);
                c6rb2.A0A(this.A04);
                c6rb2.A0F(-6710887);
                c6rb2.setCallback(this);
                C6RB c6rb3 = this.A0B;
                c6rb3.A0J(Typeface.SANS_SERIF, A1V ? 1 : 0);
                c6rb3.A0A(this.A03);
                c6rb3.A0F(-13068304);
                c6rb3.setCallback(this);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    private final boolean A00() {
        C41629IbK c41629IbK = this.A00;
        if (c41629IbK == null) {
            C14360o3.A0F("smbSupportStickerModel");
            throw C00O.createAndThrow();
        }
        return AbstractC167007dF.A1X(c41629IbK.A01(), C05F.A0C);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0K;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        int i2 = this.A0G;
        C6RB c6rb = this.A0D;
        int i3 = (i2 + c6rb.A06) - c6rb.A08;
        int i4 = this.A05;
        int i5 = i3 - i4;
        int i6 = this.A0A.A00;
        C41629IbK c41629IbK = this.A00;
        if (c41629IbK != null) {
            String str = c41629IbK.A00.A0D;
            boolean z = false;
            if (str == null || str.length() == 0) {
                z = true;
            }
            int i7 = 0;
            if (z) {
                i5 = 0;
            }
            int i8 = i6 + i5 + this.A0E;
            int i9 = this.A0F;
            int i10 = i8 + i9;
            if (A00()) {
                return i10 + i9;
            }
            C6RB c6rb2 = this.A0C;
            int i11 = (c6rb2.A06 - i4) + i9;
            Context context = this.A08;
            C41629IbK c41629IbK2 = this.A00;
            if (c41629IbK2 != null) {
                Float f = c41629IbK2.A00.A02;
                if (f != null) {
                    i = (int) f.floatValue();
                } else {
                    i = 0;
                }
                C14360o3.A0B(context, 0);
                int i12 = (int) (i * AbstractC167007dF.A0K(context).density);
                int i13 = c6rb2.A06;
                if (i13 < i12) {
                    i7 = i12 - i13;
                }
                return i10 + i11 + i7;
            }
        }
        C14360o3.A0F("smbSupportStickerModel");
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        super.setBounds(i, i2, i3, i4);
        float f2 = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f3 = this.A07 / 2.0f;
        float f4 = f2 - f3;
        float A06 = AbstractC166987dD.A06(this) / 2.0f;
        float f5 = A03 - A06;
        float f6 = f3 + f2;
        float f7 = A03 + A06;
        int i6 = this.A0E;
        float f8 = i6;
        float f9 = this.A0F;
        float f10 = (f7 - f8) - f9;
        float f11 = f8 + f10;
        float f12 = f9 + f4;
        float f13 = f6 - f9;
        float f14 = (f8 / 2.0f) + f10;
        C216229hf c216229hf = this.A0A;
        int i7 = c216229hf.A00;
        C6RB c6rb = this.A0D;
        int i8 = c6rb.A0A;
        int i9 = c6rb.A06;
        int i10 = c6rb.A08;
        int i11 = this.A0G;
        int i12 = ((i11 + i9) - i10) - this.A05;
        C6RB c6rb2 = this.A0B;
        int i13 = c6rb2.A0A;
        int i14 = c6rb2.A06;
        int i15 = (int) f4;
        int i16 = (int) f6;
        c216229hf.setBounds(i15, (int) f5, i16, (int) f7);
        int i17 = 0;
        if (A00()) {
            i17 = i6;
        }
        C41629IbK c41629IbK = this.A00;
        if (c41629IbK != null) {
            String str = c41629IbK.A00.A0D;
            if (str != null && str.length() != 0) {
                float A02 = AbstractC166987dD.A02(i8);
                float f15 = i7 + f5;
                float f16 = i10;
                c6rb.setBounds((int) (f2 - A02), (int) ((i11 + f15) - f16), (int) (A02 + f2), (int) (f15 + i12 + f16 + i17));
            }
            if (!A00()) {
                C6RB c6rb3 = this.A0C;
                int i18 = c6rb3.A0A;
                int i19 = c6rb3.A06;
                Context context = this.A08;
                C41629IbK c41629IbK2 = this.A00;
                if (c41629IbK2 != null) {
                    Float f17 = c41629IbK2.A00.A02;
                    if (f17 != null) {
                        i5 = (int) f17.floatValue();
                    } else {
                        i5 = 0;
                    }
                    C14360o3.A0B(context, 0);
                    if (i19 < ((int) (i5 * AbstractC167007dF.A0K(context).density))) {
                        f = (r0 - i19) / 2.0f;
                    } else {
                        f = 0.0f;
                    }
                    float f18 = i18 / 2.0f;
                    float f19 = f5 + i7 + i12;
                    c6rb3.setBounds((int) (f2 - f18), (int) (f19 + f), (int) (f18 + f2), (int) (f19 + i19 + f));
                }
            }
            int i20 = (int) f10;
            this.A0J.setBounds(i15, i20, i16, i20);
            int i21 = (int) f12;
            int i22 = (int) f13;
            int i23 = (int) f11;
            this.A0H.setBounds(i21, i20, i22, i23);
            this.A0I.setBounds(i21, i20, i22, i23);
            float f20 = i13 / 2.0f;
            float f21 = i14 / 2.0f;
            c6rb2.setBounds((int) (f2 - f20), (int) (f14 - f21), (int) (f2 + f20), (int) (f14 + f21));
            return;
        }
        C14360o3.A0F("smbSupportStickerModel");
        throw C00O.createAndThrow();
    }
}
