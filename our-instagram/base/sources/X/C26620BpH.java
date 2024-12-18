package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;

/* renamed from: X.BpH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26620BpH extends AbstractC77583di {
    public final int A00;
    public final Drawable A01;
    public final Drawable A02;
    public final ImageView.ScaleType A03;
    public final C59182nJ A04;
    public final C5FF A05;
    public final C5GG A06;
    public final InterfaceC59172nI A07;
    public final C51722Yv A08;
    public final String A09;

    public C26620BpH(Drawable drawable, Drawable drawable2, ImageView.ScaleType scaleType, C5GG c5gg, C59182nJ c59182nJ, InterfaceC59172nI interfaceC59172nI, C5FF c5ff, C51722Yv c51722Yv, String str, int i) {
        C14360o3.A0B(interfaceC59172nI, 1);
        this.A07 = interfaceC59172nI;
        this.A09 = str;
        this.A03 = scaleType;
        this.A04 = c59182nJ;
        this.A02 = drawable;
        this.A01 = drawable2;
        this.A06 = c5gg;
        this.A05 = c5ff;
        this.A00 = i;
        this.A08 = c51722Yv;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.2YT] */
    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        ImageView.ScaleType scaleType = this.A03;
        Drawable drawable = this.A02;
        CV9 cv9 = null;
        if (drawable == null) {
            drawable = null;
        }
        C59182nJ c59182nJ = this.A04;
        Drawable drawable2 = this.A01;
        if (drawable2 != null) {
            cv9 = new CV9(drawable2);
        }
        Object A00 = AbstractC77183d4.A00(c77993eR, C29890DGe.A00(this, 13), Arrays.copyOf(new Object[]{scaleType, drawable, c59182nJ, cv9, Integer.valueOf(this.A00)}, 5));
        long A01 = c77993eR.A01();
        InterfaceC59172nI interfaceC59172nI = this.A07;
        String str = this.A09;
        C5GG c5gg = this.A06;
        C14360o3.A0B(interfaceC59172nI, 1);
        C14360o3.A0B(str, 2);
        return new C78053eX(this.A08, new C2YM(new Object(), new C2YP(AbstractC25227BEk.A0d(C28973CqO.A00, 10, true), null, new MIL(4, str, null, A00, interfaceC59172nI, c5gg), A01)));
    }
}
