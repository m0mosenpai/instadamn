package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216169hZ extends C5RN {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final Paint A03;
    public final C9SG A04;
    public final C9SG A05;
    public final List A06;

    public C216169hZ(Context context, UserSession userSession, User user) {
        AbstractC167007dF.A1D(context, 1, userSession);
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A06 = A1E;
        C9SG c9sg = new C9SG(context);
        this.A04 = c9sg;
        this.A02 = AbstractC166987dD.A0R();
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A03 = A0S;
        c9sg.setCallback(this);
        c9sg.A00(AbstractC166997dE.A0Y(userSession).Bhu());
        C9SG c9sg2 = new C9SG(context);
        this.A05 = c9sg2;
        c9sg2.setCallback(this);
        c9sg2.A00(user.Bhu());
        Resources resources = context.getResources();
        this.A00 = resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        this.A01 = AbstractC166997dE.A08(resources);
        AbstractC166997dE.A1D(A0S, PorterDuff.Mode.SRC_OUT);
        A0S.setStyle(Paint.Style.STROKE);
        A0S.setColor(0);
        A0S.setStrokeWidth(AbstractC166997dE.A09(resources));
        Collections.addAll(A1E, c9sg, c9sg2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.saveLayer(null, this.A02);
        this.A04.draw(canvas);
        C9SG c9sg = this.A05;
        canvas.drawCircle(AbstractC166997dE.A0F(c9sg), AbstractC167007dF.A00(c9sg), this.A00 / 2, this.A03);
        c9sg.draw(canvas);
        canvas.restore();
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (this.A00 * 2) - this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        C9SG c9sg = this.A04;
        int i6 = this.A00;
        int i7 = this.A01;
        int i8 = i6 - i7;
        int i9 = i6 + i2;
        c9sg.setBounds(i5 - i8, i2, i7 + i5, i9);
        this.A05.setBounds(i5 - i7, i2, i5 + i8, i9);
    }
}
