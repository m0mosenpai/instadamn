package X;

import java.util.Random;

/* renamed from: X.1Uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27361Uo extends C0YY implements InterfaceC16820sZ {
    public static final C27361Uo A00 = new C27361Uo();

    public C27361Uo() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Random random = new Random();
        C12210kP c12210kP = new C12210kP(AbstractC12960li.A00);
        c12210kP.A00 = new InterfaceC11380iw() { // from class: X.1Up
            public static final String __redex_internal_original_name = "IgDrawableUsageLogger$Companion$instance$2$1";

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return "IgDrawableUsageLogger";
            }
        };
        c12210kP.A01(C12180kM.A02);
        return new C27351Un(c12210kP.A00(), random);
    }
}
