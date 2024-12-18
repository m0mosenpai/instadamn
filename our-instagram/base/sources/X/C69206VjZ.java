package X;

import android.graphics.Rect;

/* renamed from: X.VjZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69206VjZ {
    public final int A00;
    public final Rect A01;
    public final C68925VeP A02;
    public final VD4 A03;

    public C69206VjZ(C68925VeP c68925VeP, VD4 vd4) {
        this.A03 = vd4;
        this.A02 = c68925VeP;
        XDA xda = c68925VeP.A00;
        Rect rect = new Rect(0, 0, (int) xda.BJH(), (int) xda.BJG());
        rect.offset((-rect.width()) / 2, (-rect.height()) / 2);
        this.A01 = rect;
        this.A00 = Math.max(rect.width(), rect.height());
    }
}
