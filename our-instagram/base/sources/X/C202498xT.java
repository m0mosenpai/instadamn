package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.8xT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202498xT extends C5RN implements InterfaceC133125ze {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final Al9 A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final boolean A0F;
    public final int A0G;
    public final int A0H;
    public final String A0I;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        ((Drawable) this.A0A.getValue()).draw(canvas);
        ((Drawable) this.A09.getValue()).draw(canvas);
        ((Drawable) this.A0D.getValue()).draw(canvas);
        Drawable drawable = (Drawable) this.A0E.getValue();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        ((Drawable) this.A0B.getValue()).draw(canvas);
        ((Drawable) this.A0C.getValue()).draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        Drawable[] drawableArr = {(Drawable) this.A0A.getValue(), (Drawable) this.A09.getValue(), (Drawable) this.A0D.getValue(), (Drawable) this.A0E.getValue(), (Drawable) this.A0B.getValue(), (Drawable) this.A0C.getValue()};
        C14360o3.A0B(drawableArr, 0);
        return AbstractC009903n.A0I(drawableArr);
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        Drawable drawable = (Drawable) this.A0E.getValue();
        if (drawable != null) {
            i = drawable.getIntrinsicHeight() + this.A0H;
        } else {
            i = 0;
        }
        return ((C216229hf) this.A09.getValue()).A00 + ((Drawable) this.A0D.getValue()).getIntrinsicHeight() + i + ((Drawable) this.A0B.getValue()).getIntrinsicHeight() + ((Drawable) this.A0C.getValue()).getIntrinsicHeight() + (this.A0G * 3);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public C202498xT(Context context, Al9 al9, boolean z) {
        this.A07 = context;
        this.A08 = al9;
        this.A0F = z;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(z ? R.dimen.asset_picker_video_sticker_width : R.dimen.challenge_sticker_width);
        this.A06 = dimensionPixelSize;
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0G = dimensionPixelSize2;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0H = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_subtitle_text_size);
        this.A03 = dimensionPixelSize - (dimensionPixelSize2 * 2);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C25027B5z(this, 32));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C25027B5z(this, 31));
        this.A0D = AbstractC09440dt.A00(enumC09460dv, new C25027B5z(this, 35));
        this.A0E = AbstractC09440dt.A00(enumC09460dv, new C25027B5z(this, 36));
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C25027B5z(this, 33));
        this.A0C = AbstractC09440dt.A00(enumC09460dv, new C25027B5z(this, 34));
        this.A0I = "channel_challenge_sticker_id";
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = (Drawable) this.A0A.getValue();
        InterfaceC09390do interfaceC09390do = this.A09;
        drawable.setBounds(i, ((C216229hf) interfaceC09390do.getValue()).A00 + i2, i3, i4);
        float f = (i + i3) / 2.0f;
        InterfaceC09390do interfaceC09390do2 = this.A0D;
        int intrinsicWidth = (int) (f - (((Drawable) interfaceC09390do2.getValue()).getIntrinsicWidth() / 2.0f));
        int i5 = ((C216229hf) interfaceC09390do.getValue()).A00 + i2;
        int intrinsicHeight = ((Drawable) interfaceC09390do2.getValue()).getIntrinsicHeight() + i5;
        ((Drawable) interfaceC09390do2.getValue()).setBounds(new Rect(intrinsicWidth, i5, ((Drawable) interfaceC09390do2.getValue()).getIntrinsicWidth() + intrinsicWidth, intrinsicHeight));
        Drawable drawable2 = (Drawable) this.A0E.getValue();
        if (drawable2 != null) {
            int intrinsicWidth2 = (int) (f - (drawable2.getIntrinsicWidth() / 2.0f));
            int i6 = intrinsicHeight + this.A0H;
            int intrinsicHeight2 = drawable2.getIntrinsicHeight() + i6;
            drawable2.setBounds(intrinsicWidth2, i6, drawable2.getIntrinsicWidth() + intrinsicWidth2, intrinsicHeight2);
            intrinsicHeight = intrinsicHeight2;
        }
        int i7 = this.A0G;
        int i8 = intrinsicHeight + i7;
        InterfaceC09390do interfaceC09390do3 = this.A0B;
        int intrinsicHeight3 = ((Drawable) interfaceC09390do3.getValue()).getIntrinsicHeight() + i8;
        ((Drawable) interfaceC09390do.getValue()).setBounds(i, i2, i3, i8);
        ((Drawable) interfaceC09390do3.getValue()).setBounds(i, i8, i3, intrinsicHeight3);
        InterfaceC09390do interfaceC09390do4 = this.A0C;
        int intrinsicWidth3 = (int) (f - (((Drawable) interfaceC09390do4.getValue()).getIntrinsicWidth() / 2.0f));
        int i9 = intrinsicHeight3 + i7;
        ((Drawable) interfaceC09390do4.getValue()).setBounds(intrinsicWidth3, i9, ((Drawable) interfaceC09390do4.getValue()).getIntrinsicWidth() + intrinsicWidth3, ((Drawable) interfaceC09390do4.getValue()).getIntrinsicHeight() + i9);
    }
}
