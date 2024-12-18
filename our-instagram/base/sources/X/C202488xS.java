package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.R;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8xS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202488xS extends AbstractC130945vi implements C5RR, InterfaceC133125ze {
    public final int A00;
    public final C220759oz A01;
    public final C220749oy A02;
    public final C24012Akq A03;

    public C202488xS(Context context, UserSession userSession, C24012Akq c24012Akq) {
        C14360o3.A0B(c24012Akq, 3);
        this.A03 = c24012Akq;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.chat_sticker_width);
        this.A01 = new C220759oz(context, userSession, c24012Akq);
        this.A02 = new C220749oy(context, userSession, c24012Akq);
    }

    public final void A0B(Context context, StoryJoinChatStatus storyJoinChatStatus, UserSession userSession) {
        C14360o3.A0B(context, 1);
        this.A03.A06(storyJoinChatStatus);
        C220749oy c220749oy = this.A02;
        C6RB c6rb = c220749oy.A04;
        c6rb.A0M(c220749oy.A03.A03(context, userSession));
        float centerX = c220749oy.getBounds().centerX();
        Rect bounds = c220749oy.A05.getBounds();
        C14360o3.A07(bounds);
        c6rb.setBounds(C220749oy.A00(bounds, c220749oy, centerX));
        c220749oy.invalidateSelf();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A02.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A01, this.A02);
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A03;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        if (this.A03.A09()) {
            return "subscriber_chat_sticker_default_id";
        }
        return AbstractC111324zv.A00(229);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight() + this.A02.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float f3 = this.A00 / 2.0f;
        float intrinsicHeight = f2 - (getIntrinsicHeight() / 2.0f);
        C220759oz c220759oz = this.A01;
        int i5 = (int) (f - f3);
        int i6 = (int) intrinsicHeight;
        int i7 = (int) (f + f3);
        int intrinsicHeight2 = (int) (f2 + (getIntrinsicHeight() / 2.0f));
        C220749oy c220749oy = this.A02;
        int i8 = intrinsicHeight2 - c220749oy.A00;
        c220759oz.setBounds(new Rect(i5, i6, i7, i8));
        c220749oy.setBounds(new Rect(i5, i8, i7, intrinsicHeight2));
    }
}
