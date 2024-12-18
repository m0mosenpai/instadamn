package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* renamed from: X.Fx2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36128Fx2 implements InterfaceC41501vz {
    public final /* synthetic */ C32271EJg A00;

    public C36128Fx2(C32271EJg c32271EJg) {
        this.A00 = c32271EJg;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(240669527);
        C36049Fvl c36049Fvl = (C36049Fvl) obj;
        int A032 = C0f9.A03(1144252275);
        C32271EJg c32271EJg = this.A00;
        Bundle bundle = c32271EJg.mArguments;
        if (bundle != null && bundle.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER) != null && AbstractC31178DnM.A0d(c32271EJg, PaymentDetailChangeTypes$Companion.PHONE_NUMBER).equals(c36049Fvl.A02)) {
            Context requireContext = c32271EJg.requireContext();
            String string = c32271EJg.getString(2131961880);
            String str = c36049Fvl.A01;
            if (TextUtils.isEmpty(str)) {
                str = AbstractC31173DnH.A0m(c32271EJg);
            }
            AbstractC35254Fgn.A06(requireContext, str, string);
            i = -1521928810;
        } else {
            i = 1940679066;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-1497926542, A03);
    }
}
