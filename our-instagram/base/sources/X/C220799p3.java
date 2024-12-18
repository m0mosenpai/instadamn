package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9p3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220799p3 extends AbstractC130945vi implements C1NJ, C5RR {
    public Drawable A00;
    public C216199hc A01;
    public boolean A02;
    public int A03;
    public int A04;
    public C9Rz A05;
    public final int A06;
    public final Context A07;
    public final AlC A08;
    public final ChoreographerFrameCallbackC45694KKg A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Drawable A0F;
    public final GradientDrawable A0G;
    public final C6RB A0H;
    public final List A0I;

    public C220799p3(Context context, UserSession userSession, AlC alC, String str, boolean z) {
        Date date;
        this.A07 = context;
        this.A08 = alC;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        int A04 = AbstractC166997dE.A04(context, R.dimen.ai_agent_share_profile_sticker_padding);
        int A0F = AbstractC167017dG.A0F(context);
        int A0G = AbstractC167017dG.A0G(context);
        int A0A = AbstractC167017dG.A0A(context);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        this.A0B = dimensionPixelSize2;
        this.A0E = AbstractC167017dG.A0G(context);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A0D = dimensionPixelSize3;
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_width);
        this.A06 = dimensionPixelSize4;
        this.A0C = AbstractC167017dG.A04(context);
        this.A0A = AbstractC167017dG.A0E(context);
        String A0p = AbstractC166997dE.A0p(context, 2131956876);
        Drawable drawable = context.getDrawable(R.drawable.interactive_sticker_background);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            C14360o3.A0C(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) mutate;
            this.A0G = gradientDrawable;
            Drawable drawable2 = context.getDrawable(R.drawable.sticker_background_shadow);
            if (drawable2 != null) {
                this.A0F = drawable2;
                Drawable drawable3 = context.getDrawable(R.drawable.instagram_circle_chevron_24);
                if (drawable3 != null) {
                    this.A00 = drawable3;
                    ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg = new ChoreographerFrameCallbackC45694KKg(userSession, context);
                    this.A09 = choreographerFrameCallbackC45694KKg;
                    Spannable spannable = C6RB.A0d;
                    C6RB A0z = AbstractC166987dD.A0z(context, ((dimensionPixelSize4 - (dimensionPixelSize3 * 2)) - this.A00.getIntrinsicWidth()) - dimensionPixelSize2);
                    this.A0H = A0z;
                    this.A04 = A04;
                    this.A03 = A0F;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    this.A0I = A1E;
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                    drawable2.setCallback(this);
                    choreographerFrameCallbackC45694KKg.setVisible(true, false);
                    choreographerFrameCallbackC45694KKg.setCallback(this);
                    int color = context.getColor(R.color.countdown_sticker_title_text_color);
                    AbstractC167017dG.A0z(context, A0z);
                    AbstractC167007dF.A19(A0z, dimensionPixelSize, 0.0f);
                    A0z.A0F(color);
                    A0z.A0K(Layout.Alignment.ALIGN_NORMAL);
                    A0z.setCallback(this);
                    this.A00.mutate().setAlpha(128);
                    Drawable mutate2 = this.A00.mutate();
                    Integer num = C05F.A0j;
                    mutate2.setColorFilter(AbstractC46530KiV.A00(num, color));
                    User user = alC.A00.A00;
                    if (user != null) {
                        C216199hc c216199hc = new C216199hc(context, user.Bhu(), str, user.getUsername(), dimensionPixelSize4);
                        c216199hc.setCallback(this);
                        A1E.add(c216199hc);
                        this.A01 = c216199hc;
                    }
                    SimpleImageUrl simpleImageUrl = new SimpleImageUrl(this.A08.A00.A05);
                    if (!AbstractC81033jX.A03(simpleImageUrl)) {
                        AbstractC167017dG.A1K(this, C25821No.A00(), simpleImageUrl, "countdown_sticker_drawable");
                    }
                    String str2 = alC.A00.A0B;
                    if ((str2 == null ? "" : str2).length() > 0) {
                        str2 = str2 == null ? "" : str2;
                        Locale locale = Locale.getDefault();
                        C14360o3.A07(locale);
                        A0p = AbstractC166997dE.A10(locale, str2);
                    }
                    A0z.A0M(A0p);
                    AlC alC2 = this.A08;
                    if (alC2.A00.A06 == null && alC2.A00() < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                        date = null;
                    } else {
                        date = new Date(TimeUnit.SECONDS.toMillis(alC.A00()));
                    }
                    if (z && date != null) {
                        choreographerFrameCallbackC45694KKg.A0A(date);
                    } else {
                        choreographerFrameCallbackC45694KKg.A09(date);
                    }
                    StaticLayout staticLayout = A0z.A0G;
                    if (staticLayout != null && staticLayout.getLineCount() > 1) {
                        this.A04 = A0G;
                        this.A03 = A0A;
                    } else {
                        this.A04 = A04;
                        this.A03 = A0F;
                    }
                    int A0C = AbstractC13950nL.A0C(alC.A00.A0C, -1);
                    URL url = alC.A00;
                    String str3 = url.A0B;
                    float f = 1.0f;
                    int A07 = AbstractC13950nL.A07(A0C, AbstractC167007dF.A1N((str3 == null ? "" : str3).length()) ? 0.5f : 1.0f);
                    int A0C2 = AbstractC13950nL.A0C(url.A08, -8519535);
                    AlC alC3 = this.A08;
                    if (alC3.A00.A06 == null && alC3.A00() < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                        f = 0.3f;
                    }
                    int A072 = AbstractC13950nL.A07(A0C2, f);
                    int A0B = AbstractC13950nL.A0B(alC.A00.A07, -855638017);
                    String str4 = alC.A00.A0A;
                    int[] iArr = AlC.A04;
                    int i = AbstractC13950nL.A0C(str4, iArr[0]) == -1 ? -869915098 : A0B;
                    gradientDrawable.setColors(new int[]{AbstractC13950nL.A0C(alC.A00.A0A, iArr[0]), AbstractC13950nL.A0C(alC.A00.A09, iArr[1])});
                    A0z.A0F(A07);
                    this.A00.mutate().setColorFilter(AbstractC46530KiV.A00(num, A07));
                    Drawable mutate3 = choreographerFrameCallbackC45694KKg.mutate();
                    C14360o3.A0C(mutate3, AbstractC111324zv.A00(2793));
                    ((ChoreographerFrameCallbackC45694KKg) mutate3).A08(A072, A0B, A07, i);
                    Collections.addAll(A1E, this.A05, gradientDrawable, A0z, choreographerFrameCallbackC45694KKg, this.A00);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            int i = this.A06;
            boolean z = C1NC.A02;
            Bitmap A00 = C0fK.A00(bitmap, i, (int) (bitmap.getHeight() * (i / bitmap.getWidth())), true);
            C14360o3.A07(A00);
            C9Rz c9Rz = new C9Rz(A00, null, this.A0A, 15);
            this.A05 = c9Rz;
            c9Rz.setBounds(this.A0G.getBounds());
            invalidateSelf();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C216199hc c216199hc;
        C14360o3.A0B(canvas, 0);
        if (this.A02) {
            this.A0F.draw(canvas);
        }
        Drawable drawable = this.A05;
        if (drawable == null) {
            drawable = this.A0G;
        }
        drawable.draw(canvas);
        this.A0H.draw(canvas);
        this.A09.draw(canvas);
        this.A00.draw(canvas);
        if (this.A08.A02 && (c216199hc = this.A01) != null) {
            c216199hc.draw(canvas);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0I;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        C216199hc c216199hc;
        int i2 = this.A04;
        C6RB c6rb = this.A0H;
        int A0F = AbstractC166987dD.A0F(this.A09, ((i2 + c6rb.A06) - c6rb.A08) + this.A03) + this.A0E;
        if (this.A08.A02 && (c216199hc = this.A01) != null) {
            i = c216199hc.A03;
        } else {
            i = 0;
        }
        return A0F + i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        C216199hc c216199hc;
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = this.A06 / 2.0f;
        float f3 = f - f2;
        float intrinsicHeight = getIntrinsicHeight() / 2.0f;
        float f4 = A03 - intrinsicHeight;
        float f5 = f + f2;
        float f6 = A03 + intrinsicHeight;
        C6RB c6rb = this.A0H;
        int i5 = c6rb.A06;
        int i6 = c6rb.A08;
        int i7 = this.A04;
        int i8 = ((i7 + this.A03) + i5) - i6;
        ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg = this.A09;
        int intrinsicHeight2 = choreographerFrameCallbackC45694KKg.getIntrinsicHeight();
        int intrinsicWidth = this.A00.getIntrinsicWidth();
        float f7 = i7 + f4;
        float f8 = f7 + ((i5 - i6) / 2.0f);
        float f9 = this.A0D;
        float f10 = f5 - f9;
        float f11 = intrinsicWidth;
        float f12 = f10 - f11;
        C9Rz c9Rz = this.A05;
        if (c9Rz != null) {
            AbstractC166997dE.A1E(c9Rz, f3, f4, f5, f6);
        }
        int i9 = (int) f3;
        int i10 = (int) f5;
        int i11 = (int) f6;
        this.A0G.setBounds(i9, (int) f4, i10, i11);
        Drawable drawable = this.A0F;
        float f13 = this.A0C;
        drawable.setBounds((int) (f3 - f13), (int) (f4 - f13), (int) (f13 + f5), (int) (f13 + f6));
        int i12 = (int) (f9 + f3);
        float f14 = i6;
        float f15 = f4 + i8;
        c6rb.setBounds(i12, (int) (f7 - f14), (int) (f12 - this.A0B), (int) (f14 + f15));
        float f16 = f11 / 2.0f;
        int i13 = (int) f10;
        this.A00.setBounds((int) f12, (int) (f8 - f16), i13, (int) (f8 + f16));
        choreographerFrameCallbackC45694KKg.setBounds(i12, (int) f15, i13, (int) (f15 + intrinsicHeight2));
        if (this.A08.A02 && (c216199hc = this.A01) != null) {
            c216199hc.setBounds(i9, (int) (f6 - c216199hc.A03), i10, i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        this.A09.setVisible(z, z2);
        return super.setVisible(z, z2);
    }
}
