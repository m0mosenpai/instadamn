package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.facebook.R;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.9pS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221049pS extends AbstractC202358xF implements InterfaceC25199BCx {
    public final C9SA A00;
    public final String A01;
    public final List A02;
    public final Context A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A00.onBoundsChange(rect);
    }

    public static final String A00(C221049pS c221049pS) {
        String A0f;
        List list = c221049pS.A02;
        if (list.size() == 1) {
            A0f = ((Product) list.get(0)).A0J;
        } else {
            A0f = AbstractC167007dF.A0f(c221049pS.A03, Integer.valueOf(list.size()), 2131973977);
        }
        if (A0f != null) {
            return AbstractC166997dE.A10(C1Q2.A02(), A0f);
        }
        return "";
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A01;
    }

    @Override // X.InterfaceC25199BCx
    public final C190888ck C6I() {
        return this.A00.A0D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    @Override // X.InterfaceC25199BCx
    public final void setTextFormat(C190888ck c190888ck) {
        if (c190888ck != null) {
            this.A00.A04(c190888ck);
        }
    }

    public C221049pS(Context context, String str, List list, int i, boolean z) {
        AbstractC167017dG.A1R(str, list);
        this.A03 = context;
        this.A01 = str;
        this.A02 = list;
        C9SA c9sa = new C9SA(context, this.A01, i, context.getResources().getDimensionPixelSize(R.dimen.direct_emoji_quick_reply_emoji_item_size), false);
        this.A00 = c9sa;
        c9sa.A0G = z;
        c9sa.A05(A00(this), -1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A00.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
