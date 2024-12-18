package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jj9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44370Jj9 extends Drawable implements Drawable.Callback, C1NJ {
    public C8FY A00;
    public C51721Msy A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final UserSession A08;
    public final InterfaceC09390do A09 = C50254MHj.A01(this, 44);
    public final InterfaceC09390do A0D = C50254MHj.A01(this, 48);
    public final InterfaceC09390do A0A = C50254MHj.A01(this, 45);
    public final InterfaceC09390do A0C = C50254MHj.A01(this, 47);
    public final InterfaceC09390do A0B = C50254MHj.A01(this, 46);

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            int i = this.A04;
            Bitmap A09 = C1NC.A09(bitmap, i, i, 0, false);
            C14360o3.A07(A09);
            C8FY c8fy = new C8FY(this.A07.getResources(), A09);
            this.A00 = c8fy;
            c8fy.A02(this.A02);
            C51721Msy c51721Msy = this.A01;
            boolean z = c51721Msy.A04;
            this.A01 = new C51721Msy(c51721Msy.A01, 0, true, c51721Msy.A02, z);
            invalidateDrawable(this);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        int i = this.A05;
        if (i > 0) {
            A00(canvas, AbstractC166987dD.A0a(this.A0C), this.A04 + i);
        }
        if (this.A01.A03) {
            Drawable A0a = AbstractC166987dD.A0a(this.A0A);
            if (A0a != null) {
                A00(canvas, A0a, this.A04);
            }
            C8FY c8fy = this.A00;
            if (c8fy != null) {
                A00(canvas, c8fy, this.A04);
                return;
            }
            return;
        }
        Drawable A0a2 = AbstractC166987dD.A0a(this.A0B);
        int i2 = this.A04;
        A00(canvas, A0a2, i2);
        Drawable A0a3 = AbstractC166987dD.A0a(this.A0D);
        if (A0a3 != null) {
            A00(canvas, A0a3, i2);
        }
        InterfaceC09390do interfaceC09390do = this.A09;
        Drawable A0a4 = AbstractC166987dD.A0a(interfaceC09390do);
        if (A0a4 != null) {
            A00(canvas, A0a4, this.A03);
        }
        Drawable A0a5 = AbstractC166987dD.A0a(interfaceC09390do);
        if (A0a5 == null) {
            return;
        }
        AbstractC25231BEo.A0x(this.A07, A0a5, R.color.design_dark_default_color_on_background);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private final void A00(Canvas canvas, Drawable drawable, int i) {
        int i2 = (this.A06 - i) / 2;
        int i3 = i + i2;
        drawable.setBounds(i2, i2, i3, i3);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable A0a;
        if (this.A01.A02) {
            Drawable A0a2 = AbstractC166987dD.A0a(this.A0A);
            if (A0a2 != null) {
                A0a2.setAlpha(i);
            }
            A0a = this.A00;
            if (A0a == null) {
                return;
            }
        } else {
            Drawable A0a3 = AbstractC166987dD.A0a(this.A09);
            if (A0a3 != null) {
                A0a3.setAlpha(i);
            }
            A0a = AbstractC166987dD.A0a(this.A0B);
        }
        A0a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable A0a;
        if (this.A01.A02) {
            Drawable A0a2 = AbstractC166987dD.A0a(this.A0A);
            if (A0a2 != null) {
                A0a2.setColorFilter(colorFilter);
            }
            A0a = this.A00;
            if (A0a == null) {
                return;
            }
        } else {
            Drawable A0a3 = AbstractC166987dD.A0a(this.A09);
            if (A0a3 != null) {
                A0a3.setColorFilter(colorFilter);
            }
            A0a = AbstractC166987dD.A0a(this.A0B);
        }
        A0a.setColorFilter(colorFilter);
    }

    public C44370Jj9(Context context, C51721Msy c51721Msy, UserSession userSession, int i) {
        this.A07 = context;
        this.A08 = userSession;
        this.A05 = i;
        this.A01 = c51721Msy;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A04 = dimensionPixelOffset;
        this.A02 = AbstractC166987dD.A02(dimensionPixelOffset);
        this.A03 = context.getResources().getDimensionPixelOffset(C18U.A06(C06090Tz.A05, userSession, 36322409573263579L) ? R.dimen.ai_agent_share_profile_sticker_padding : R.dimen.abc_select_dialog_padding_start_material);
        this.A06 = context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
        if (this.A01.A02) {
            AbstractC167017dG.A1K(this, C25821No.A00(), AbstractC25225BEi.A0t(this.A01.A01), "AVATAR_STICKER_TOGGLE");
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
