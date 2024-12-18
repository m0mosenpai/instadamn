package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.Bke, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26333Bke extends AbstractC51572Yf {
    public final C87 A00;
    public final CharSequence A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC31128DmB A00 = C28351CfB.A00(AbstractC28337CeP.A00(c76223bS));
        Drawable A002 = AbstractC27723CKq.A00(c76223bS, new D8K(12, c76223bS, this), new Object[]{this.A00});
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A003 = C9CU.A00(C9CU.A00(null, C05F.A0E, 0, AbstractC25235BEs.A0A(A00, C05F.A0V)), C05F.A0F, 0, AbstractC25229BEm.A0J());
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        long A0I = AbstractC25230BEn.A0I();
        Integer num = C05F.A00;
        A12.A00(new C26611Bp8(A002, ImageView.ScaleType.CENTER_INSIDE, AbstractC25234BEr.A0L(null, num, 0, A0I), 0, false));
        C51722Yv A0H = AbstractC25234BEr.A0H(null, AbstractC25225BEi.A0n(C05F.A0B, 0, AbstractC25230BEn.A0L()), num);
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        CharSequence charSequence = this.A01;
        Integer num2 = C05F.A02;
        C88 c88 = C88.A03;
        long A0K = AbstractC25230BEn.A0K();
        AbstractC25230BEn.A1H(new C26567BoQ(null, C93E.TEXT_START, c88, charSequence, num2, 0, A0K, A0K), A13, A12, A0H);
        return AbstractC76963ci.A0I(A12, c76223bS, A003);
    }

    public C26333Bke(C87 c87, CharSequence charSequence) {
        AbstractC167017dG.A1P(c87, charSequence);
        this.A00 = c87;
        this.A01 = charSequence;
    }
}
