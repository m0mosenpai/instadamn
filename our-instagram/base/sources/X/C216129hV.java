package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.9hV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216129hV extends C5RN {
    public final C6RB A00;
    public final int A01;

    public C216129hV(Context context, int i) {
        this.A01 = AbstractC167017dG.A05(context);
        Spannable spannable = C6RB.A0d;
        C6RB A0Y = AbstractC167007dF.A0Y(context, context.getResources(), R.dimen.achievements_list_container_height);
        AbstractC180577zl.A00(context, AbstractC167017dG.A0R(context), A0Y, C05F.A01);
        AbstractC166997dE.A1B(context.getResources(), A0Y, R.dimen.action_bar_item_spacing_right);
        A0Y.A0F(i);
        AbstractC166987dD.A1Q(context, A0Y, 2131966171);
        AbstractC167027dH.A0b(context, this, A0Y, 1);
        this.A00 = A0Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC166987dD.A1J(this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01 + this.A00.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float A02 = AbstractC167007dF.A02(this, (i + i3) / 2.0f);
        AbstractC167017dG.A1M(this.A00, A02 - r1.A0A, A03, A02);
    }
}
