package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.Ltu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49481Ltu implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C49481Ltu(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            C170337im c170337im = (C170337im) this.A02;
            C51722Yv c51722Yv = C170337im.A0F;
            LBJ.A01(context, c170337im.A03, EnumC46186KcO.A06, this.A03, new BGK(c170337im.A02, 46));
            return;
        }
        AbstractC166997dE.A1Y(((C25814BbV) this.A02).A09.A07, false);
        ((TextView) this.A01).setText(this.A03);
    }
}
