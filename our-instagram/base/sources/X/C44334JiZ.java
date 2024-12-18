package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.user.model.User;

/* renamed from: X.JiZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44334JiZ extends Drawable {
    public int A00;
    public NoteBubbleView A01;
    public C44201Jg4 A02;
    public final int A03;
    public final Context A04;
    public final UserSession A05;
    public final C4F5 A06;
    public final AbstractC44205Jg9 A07;
    public final User A08;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
        float A0F = AbstractC166997dE.A0F(this);
        C44201Jg4 c44201Jg4 = this.A02;
        if (c44201Jg4 == null) {
            C14360o3.A0F("presencePogDrawable");
            throw C00O.createAndThrow();
        }
        AbstractC167007dF.A0u(canvas, c44201Jg4, A0F - AbstractC166987dD.A02(AbstractC166997dE.A0H(c44201Jg4)), this.A00);
        canvas.save();
        NoteBubbleView noteBubbleView = this.A01;
        if (noteBubbleView != null) {
            JQ0.A0z(noteBubbleView);
            noteBubbleView.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C44201Jg4 c44201Jg4 = this.A02;
        if (c44201Jg4 == null) {
            C14360o3.A0F("presencePogDrawable");
            throw C00O.createAndThrow();
        }
        c44201Jg4.setAlpha(i);
        NoteBubbleView noteBubbleView = this.A01;
        if (noteBubbleView != null) {
            noteBubbleView.setAlpha(i / 255.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C44201Jg4 c44201Jg4 = this.A02;
        if (c44201Jg4 == null) {
            C14360o3.A0F("presencePogDrawable");
            throw C00O.createAndThrow();
        }
        c44201Jg4.setColorFilter(colorFilter);
    }

    public /* synthetic */ C44334JiZ(Context context, UserSession userSession, C4F5 c4f5, AbstractC44205Jg9 abstractC44205Jg9, User user) {
        int measuredHeight;
        int A04 = AbstractC166997dE.A04(context, R.dimen.ad_not_delivering_thumbnail_height);
        AbstractC25229BEm.A1I(user, 4, abstractC44205Jg9);
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = c4f5;
        this.A08 = user;
        this.A03 = A04;
        this.A07 = abstractC44205Jg9;
        this.A02 = new C44201Jg4(context, userSession, AbstractC44199Jg2.A01(user), this.A07, new C50158MDl(this, 42));
        C4F5 c4f52 = this.A06;
        if (c4f52 != null) {
            this.A01 = AbstractC47028Kql.A00(context, null, userSession, c4f52, C05F.A0C, false);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i = this.A03;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        NoteBubbleView noteBubbleView = this.A01;
        if (noteBubbleView != null) {
            noteBubbleView.measure(makeMeasureSpec2, makeMeasureSpec);
        }
        C44201Jg4 c44201Jg4 = this.A02;
        if (c44201Jg4 != null) {
            int max = Math.max(AbstractC166997dE.A0H(c44201Jg4), i);
            NoteBubbleView noteBubbleView2 = this.A01;
            if (noteBubbleView2 == null) {
                measuredHeight = AbstractC44198Jg1.A03(this.A04, R.dimen.abc_select_dialog_padding_start_material);
            } else {
                measuredHeight = noteBubbleView2.getMeasuredHeight() - AbstractC44198Jg1.A03(this.A04, R.dimen.ad4ad_button_bottom_margin);
            }
            this.A00 = measuredHeight;
            C44201Jg4 c44201Jg42 = this.A02;
            if (c44201Jg42 != null) {
                setBounds(0, 0, max, AbstractC166997dE.A0G(c44201Jg42) + this.A00);
                return;
            }
        }
        C14360o3.A0F("presencePogDrawable");
        throw C00O.createAndThrow();
    }
}
