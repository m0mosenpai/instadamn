package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class NK3 extends OX6 {
    public C47Z A00;
    public final AbstractC55082Oac A01;
    public final InterfaceC19390xP A02;
    public final C05A A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NK3(AbstractC55082Oac abstractC55082Oac) {
        super(abstractC55082Oac);
        C14360o3.A0B(abstractC55082Oac, 1);
        this.A01 = abstractC55082Oac;
        C008002u A1H = AbstractC25225BEi.A1H(new C51756Mtf((C50627MWo) null, (DefaultConstructorMarker) null, 1, 46));
        this.A03 = A1H;
        this.A02 = A1H;
    }

    public final C47Z A08() {
        C47Z c47z = this.A00;
        if (c47z != null) {
            return c47z;
        }
        C14360o3.A0F("pendingMedia");
        throw C00O.createAndThrow();
    }
}
