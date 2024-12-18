package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.MlI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51295MlI extends C3OO {
    public OKn A00;
    public final C52363NFb A01;
    public final InterfaceC09390do A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51295MlI(C51172MjG c51172MjG, C52363NFb c52363NFb, Integer num, int i) {
        super(c52363NFb);
        C14360o3.A0B(num, 4);
        this.A01 = c52363NFb;
        C17050sx A01 = AbstractC09440dt.A01(new C57249PbX(i, 23, this));
        this.A02 = A01;
        c52363NFb.A00((Drawable) A01.getValue(), AbstractC167007dF.A1X(num, C05F.A00));
        c52363NFb.A00 = ViewOnClickListenerC55465OkK.A00(c51172MjG, this, 0);
        c52363NFb.A01 = true;
    }
}
