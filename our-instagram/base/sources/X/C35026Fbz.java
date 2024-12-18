package X;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Fbz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35026Fbz {
    public Resources.Theme A05;
    public ColorFilter A06;
    public ColorFilter A07;
    public Drawable A08;
    public Drawable A09;
    public View.OnClickListener A0A;
    public final Integer A0C;
    public int A03 = -2;
    public int A04 = -2;
    public int A01 = -2;
    public int A02 = -2;
    public int A00 = -2;
    public boolean A0B = true;

    public C35026Fbz(Integer num) {
        this.A0C = num;
    }

    public final C114795Gm A01() {
        Drawable drawable = this.A09;
        Drawable drawable2 = this.A08;
        int i = this.A03;
        int i2 = this.A04;
        boolean z = this.A0B;
        int i3 = this.A01;
        int i4 = this.A02;
        View.OnClickListener onClickListener = this.A0A;
        int i5 = this.A00;
        return new C114795Gm(this.A05, this.A06, this.A07, drawable, drawable2, onClickListener, this.A0C, i, i2, -2, i3, i4, i5, -2, z);
    }

    public final void A02(int i) {
        this.A09 = new ColorDrawable(i);
    }

    public static void A00(InterfaceC56362iU interfaceC56362iU, C35026Fbz c35026Fbz) {
        interfaceC56362iU.Ehg(c35026Fbz.A01());
    }
}
