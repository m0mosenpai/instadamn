package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Eye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33938Eye {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0B(A0e, 0);
        AbstractC167007dF.A1D(A0B, 1, A04);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("igUserId", A0e);
        A0b.putString("stripeAccountInformationType", "BANK_ACCOUNT");
        AbstractC27401Ut.getInstance();
        C64501TGn A01 = new C64501TGn(A0B).A01("IgPaymentsSettingsPaymentAddBankAccountRoute");
        A01.A00(A0b);
        A01.EqV(A04).A04();
        return null;
    }
}
