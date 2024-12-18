package X;

import android.graphics.Typeface;

/* renamed from: X.TuG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65798TuG implements InterfaceC71911X9v {
    public final /* synthetic */ C65757TtX A00;

    public C65798TuG(C65757TtX c65757TtX) {
        this.A00 = c65757TtX;
    }

    @Override // X.InterfaceC71911X9v
    public final void ABu(Typeface typeface) {
        C65757TtX c65757TtX = this.A00;
        C67767Uxi c67767Uxi = c65757TtX.A0d;
        if (c67767Uxi != null) {
            c67767Uxi.A00 = true;
        }
        if (c65757TtX.A0a != typeface) {
            c65757TtX.A0a = typeface;
            c65757TtX.A0G(false);
        }
    }
}
