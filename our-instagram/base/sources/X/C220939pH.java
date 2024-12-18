package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.9pH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220939pH extends AbstractC130945vi implements C5RR, InterfaceC133125ze {
    public final Al3 A00;
    public final C216219he A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C44376JjF A06;
    public final C6RB A07;
    public final C6RB A08;

    public C220939pH(Context context, Al3 al3, String str) {
        C14360o3.A0B(context, 1);
        AbstractC167007dF.A1E(al3, 2, str);
        this.A00 = al3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_width);
        int A05 = AbstractC167017dG.A05(context);
        this.A04 = A05;
        this.A05 = AbstractC167017dG.A07(context);
        this.A02 = AbstractC167017dG.A05(context);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        int A04 = AbstractC166997dE.A04(context, R.dimen.abc_list_item_height_large_material);
        this.A03 = A04;
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_subtitle_size);
        int A042 = AbstractC166997dE.A04(context, R.dimen.bio_product_sticker_subtitle_size);
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_subtitle_size_smaller);
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_text_on_white);
        C216219he c216219he = new C216219he(context);
        c216219he.A00 = dimensionPixelSize;
        this.A01 = c216219he;
        C44376JjF c44376JjF = new C44376JjF(context, 0.5f, 0.6f, AbstractC167017dG.A05(context), 0.2f, 0.2f, 0, 0, 0, true, false);
        c44376JjF.A02(new SimpleImageUrl(al3.A00, dimensionPixelSize2, A04), str);
        this.A06 = c44376JjF;
        int i = dimensionPixelSize - (A05 * 2);
        C6RB A0z = AbstractC166987dD.A0z(context, i);
        A0z.A0F(A09);
        A0z.A0A(dimensionPixelSize3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        A0z.A0K(alignment);
        A0z.A0M(al3.A03);
        A0z.A0b.setFakeBoldText(true);
        A0z.A0G(2, "...");
        this.A08 = A0z;
        C6RB A0z2 = AbstractC166987dD.A0z(context, i);
        A0z2.A0F(A09);
        A0z2.A0A(A042);
        A0z2.A0K(alignment);
        String str2 = al3.A02;
        A0z2.A0M(str2);
        A0z2.A0G(1, "...");
        CharSequence A01 = AbstractC85253rG.A01(A0z2.A08(), "", str2, "...", 1, false);
        C14360o3.A07(A01);
        if (!A01.equals(str2)) {
            A0z2.A0A(dimensionPixelSize4);
            A0z2.A0M(str2);
            A0z2.A0G(1, "...");
        }
        this.A07 = A0z2;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "ig_bio_product_sticker_id";
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A08.draw(canvas);
        this.A07.draw(canvas);
        C44376JjF c44376JjF = this.A06;
        C23665Ae0 c23665Ae0 = new C23665Ae0(canvas);
        c44376JjF.A02 = c23665Ae0;
        if (c44376JjF.A01 != null) {
            c44376JjF.draw(c23665Ae0.A00);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A01, this.A06, this.A08, this.A07);
    }

    @Override // X.C5RR
    public final /* bridge */ /* synthetic */ C5NL C0T() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (this.A04 * 2) + this.A03 + this.A02 + this.A08.A06 + this.A05 + this.A07.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        C216219he c216219he = this.A01;
        float f2 = c216219he.A00 / 2.0f;
        float f3 = f - f2;
        float A06 = AbstractC166987dD.A06(this) / 2.0f;
        float f4 = A03 - A06;
        float f5 = f + f2;
        float f6 = A03 + A06;
        float f7 = this.A04;
        float f8 = f7 + f4;
        float f9 = this.A03 + f8;
        C6RB c6rb = this.A08;
        float f10 = f7 + f9;
        float f11 = c6rb.A06 + f10;
        AbstractC166997dE.A1E(c216219he, f3, f4, f5, f6);
        int i5 = (int) (f7 + f3);
        int i6 = (int) (f5 - f7);
        this.A06.setBounds(i5, (int) f8, i6, (int) f9);
        c6rb.setBounds(i5, (int) f10, i6, (int) f11);
        this.A07.setBounds(i5, (int) (this.A05 + f11), i6, (int) (f6 - f7));
    }
}
