package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.9kC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217799kC extends C202598xd implements C5RQ {
    public final InterfaceC09390do A00;

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // X.C202598xd, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        AbstractC167007dF.A0v(canvas, this.A00);
    }

    @Override // X.C202598xd, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        AbstractC166987dD.A0a(this.A00).setBounds(rect);
        invalidateSelf();
    }

    public C217799kC(Context context, Drawable drawable, UserSession userSession, ImageUrl imageUrl, C68024V6s c68024V6s, EnumC40111tc enumC40111tc, C3YU c3yu, ProductType productType) {
        super(context, drawable, null, null, userSession, imageUrl, c68024V6s, enumC40111tc, c3yu, productType, null, C05F.A0N, null, false);
        this.A00 = AbstractC09440dt.A01(new ME5(13, context, this, c68024V6s));
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0c;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        ((C210359Sa) this.A00.getValue()).A02.A00 = i;
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        Long l = this.A0c.A06;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 15000) {
                longValue = 15000;
            }
            return (int) longValue;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C202598xd, android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.A00.getValue();
        return -3;
    }

    @Override // X.C202598xd, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        AbstractC166987dD.A0a(this.A00).setAlpha(i);
    }

    @Override // X.C202598xd, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC166987dD.A0a(this.A00).setColorFilter(colorFilter);
    }
}
