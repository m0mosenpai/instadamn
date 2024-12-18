package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.user.model.User;

/* renamed from: X.Ae8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23673Ae8 implements InterfaceC25177BCa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C23673Ae8(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        if (this.A00 != 0) {
            ((C5RP) this.A02).EFh(this);
            ((C23851Ah3) this.A03).A0R.A0k((Drawable) this.A01);
            return;
        }
        C218059kd c218059kd = (C218059kd) this.A01;
        C202728xq c202728xq = c218059kd.A03;
        c202728xq.getClass();
        c202728xq.EFh(this);
        if (c218059kd.A05 == null) {
            return;
        }
        C88Y c88y = c218059kd.A0A;
        if (!c88y.A0L(c218059kd)) {
            return;
        }
        c88y.A0F(((Medium) this.A03).A0H);
        C148276lx c148276lx = C148276lx.A0a;
        C148276lx A00 = AbstractC148296lz.A00();
        C202728xq c202728xq2 = c218059kd.A03;
        C5GJ c5gj = (C5GJ) this.A02;
        C23108AGw c23108AGw = c218059kd.A0B;
        c88y.A0B(c202728xq2, c5gj, A00, new C8FC(c23108AGw), true, false);
        c88y.A08(c218059kd.A01);
        Context context = c218059kd.A07;
        User A2E = c218059kd.A05.A2E(c218059kd.A08);
        A2E.getClass();
        String id = c218059kd.A05.getId();
        C14360o3.A0B(context, 1);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.font_large);
        int A0A = AbstractC166997dE.A0A(resources);
        C202668xk c202668xk = new C202668xk(context, null, null, A2E, null, id, A0A, A0A, dimensionPixelSize, dimensionPixelSize2, A0A, false);
        c218059kd.A04 = c202668xk;
        C202728xq c202728xq3 = c218059kd.A03;
        c202728xq3.getClass();
        c23108AGw.A06 = new C221619qQ(c202728xq3.getBounds());
        C88Y.A01(c202668xk, c88y, c23108AGw, false);
    }

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
    }
}
