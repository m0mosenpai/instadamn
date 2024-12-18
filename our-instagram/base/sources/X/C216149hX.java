package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9hX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216149hX extends C5RN {
    public final Drawable A00;
    public final int A01;
    public final Context A02;
    public final Resources A03;
    public final C6RB A04;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
        this.A04.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A00, this.A04);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth() + this.A01 + this.A04.A0A;
    }

    public C216149hX(Context context) {
        this.A02 = context;
        Resources resources = context.getResources();
        this.A03 = resources;
        this.A01 = AbstractC166997dE.A07(resources);
        int color = context.getColor(AbstractC53242c7.A0C(context));
        Drawable drawable = context.getDrawable(R.drawable.instagram_app_messenger_filled_16);
        if (drawable != null) {
            AbstractC166997dE.A1F(drawable, color);
            drawable.setCallback(this);
            this.A00 = drawable;
            Spannable spannable = C6RB.A0d;
            C6RB A0Y = AbstractC167007dF.A0Y(context, resources, R.dimen.eu_stamp_icon_size);
            Context context2 = A0Y.A0Z;
            C14360o3.A07(context2);
            AbstractC166987dD.A1U(EnumC15950qp.A13, AbstractC15960qq.A00(context2), A0Y);
            AbstractC166997dE.A1B(resources, A0Y, R.dimen.account_discovery_bottom_gap);
            A0Y.A0F(color);
            AbstractC166987dD.A1Q(context2, A0Y, 2131973085);
            A0Y.setCallback(this);
            this.A04 = A0Y;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float A032 = AbstractC167007dF.A03(this, f);
        Drawable drawable = this.A00;
        float A01 = AbstractC167007dF.A01(drawable, A03);
        float A02 = AbstractC167007dF.A02(this, f);
        int i5 = (int) A032;
        drawable.setBounds(i5, (int) A01, drawable.getIntrinsicWidth() + i5, (int) (AbstractC166987dD.A05(drawable) + A03));
        AbstractC167017dG.A1M(this.A04, A02 - r1.A0A, A03, A02);
    }
}
