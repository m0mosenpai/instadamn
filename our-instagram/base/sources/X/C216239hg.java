package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216239hg extends C5RN implements C5RP, InterfaceC25178BCb, InterfaceC202698xn {
    public C202668xk A00;
    public final C202728xq A01;
    public final User A02;
    public final List A03;

    public C216239hg(Context context, Medium medium, User user, String str, int i, int i2, boolean z) {
        C14360o3.A0B(context, 1);
        this.A02 = user;
        C202728xq c202728xq = new C202728xq(context, null, medium, null, C8OK.A0A, null, i, i2, false, false, false, false);
        this.A01 = c202728xq;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A03 = A1E;
        A1E.add(c202728xq);
        if (z) {
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.font_large);
            int A0A = AbstractC166997dE.A0A(resources);
            C202668xk c202668xk = new C202668xk(context, null, null, user, null, str, A0A, A0A, dimensionPixelSize, dimensionPixelSize2, A0A, false);
            this.A00 = c202668xk;
            A1E.add(c202668xk);
            return;
        }
        this.A00 = null;
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A01.A9I(interfaceC25177BCa);
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A01.EFh(interfaceC25177BCa);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
        C202668xk c202668xk = this.A00;
        if (c202668xk != null) {
            c202668xk.draw(canvas);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A03;
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A01.AHq();
    }

    @Override // X.InterfaceC25178BCb
    public final int BSK() {
        return AbstractC167007dF.A1W(this.A00) ? 1 : 0;
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        if (this.A00 != null) {
            return AbstractC166987dD.A1J(this.A02);
        }
        return C16930sl.A00;
    }

    @Override // X.InterfaceC202698xn
    public final C202668xk BhW() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A01.getIntrinsicWidth();
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        if (this.A01.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = (i + i3) / 2;
        C202668xk c202668xk = this.A00;
        if (c202668xk != null) {
            i5 = c202668xk.A02;
        } else {
            i5 = 0;
        }
        C202728xq c202728xq = this.A01;
        c202728xq.setBounds(i6 - (c202728xq.getIntrinsicWidth() / 2), i2, (c202728xq.getIntrinsicWidth() / 2) + i6, c202728xq.getIntrinsicHeight() + i2);
        if (c202668xk != null) {
            c202668xk.setBounds(i6 - (c202728xq.getIntrinsicWidth() / 2), i2, i6 + (c202728xq.getIntrinsicWidth() / 2), i5 + i2);
        }
    }
}
