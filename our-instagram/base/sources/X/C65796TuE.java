package X;

import android.graphics.Typeface;

/* renamed from: X.TuE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65796TuE extends C3WX {
    public final /* synthetic */ C70154WDd A00;
    public final /* synthetic */ VK5 A01;

    public C65796TuE(C70154WDd c70154WDd, VK5 vk5) {
        this.A00 = c70154WDd;
        this.A01 = vk5;
    }

    @Override // X.C3WX
    public final void A01(int i) {
        this.A00.A02 = true;
        this.A01.A00(i);
    }

    @Override // X.C3WX
    public final void A02(Typeface typeface) {
        C70154WDd c70154WDd = this.A00;
        Typeface create = Typeface.create(typeface, c70154WDd.A07);
        c70154WDd.A01 = create;
        c70154WDd.A02 = true;
        this.A01.A01(create, false);
    }
}
