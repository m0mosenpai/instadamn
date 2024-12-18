package X;

import com.fbpay.w3c.security.SecurityProviderEphemeral;

/* renamed from: X.PhI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57606PhI extends C0YY implements InterfaceC16660sJ {
    public static final C57606PhI A00 = new C57606PhI();

    public C57606PhI() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(AbstractC25230BEn.A1P((AbstractC166987dD.A0N(obj) > (System.currentTimeMillis() - SecurityProviderEphemeral.A01) ? 1 : (AbstractC166987dD.A0N(obj) == (System.currentTimeMillis() - SecurityProviderEphemeral.A01) ? 0 : -1))));
    }
}
