package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.8xO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202448xO extends Drawable {
    public Drawable A00;
    public final C8F7 A01;

    public C202448xO(Context context, UserSession userSession, C8F7 c8f7) {
        Drawable bitmapDrawable;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A01 = c8f7;
        if (c8f7.A05 && c8f7.A04 != null) {
            AHE ahe = new AHE("", C08730cb.A00(userSession).A00().Bhu().getUrl(), false);
            C8F7 c8f72 = this.A01;
            AHE ahe2 = new AHE("", c8f72.A00, false);
            String str = c8f72.A04;
            if (str != null) {
                bitmapDrawable = new C9SW(context, userSession, new C1816383s(null, ahe2, ahe, null, null, c8f72.A03, "", "", str, 0));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            String str2 = c8f7.A02;
            if (str2 != null) {
                bitmapDrawable = new BitmapDrawable(context.getResources(), C1NC.A02(context, AbstractC08820cl.A03(str2)));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A00 = bitmapDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A00.setBounds(i, i2, i3, i4);
    }
}
