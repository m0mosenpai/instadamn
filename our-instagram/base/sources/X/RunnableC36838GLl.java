package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* renamed from: X.GLl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36838GLl implements Runnable {
    public final /* synthetic */ C32320ELo A00;

    public RunnableC36838GLl(C32320ELo c32320ELo) {
        this.A00 = c32320ELo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32320ELo c32320ELo = this.A00;
        c32320ELo.requireArguments().putBoolean("push_to_next", false);
        FragmentActivity requireActivity = c32320ELo.requireActivity();
        String str = C32320ELo.__redex_internal_original_name;
        C140966Yy A0N = AbstractC31177DnL.A0N(requireActivity, c32320ELo.A02);
        C32271EJg c32271EJg = new C32271EJg();
        String string = c32320ELo.mArguments.getString(PaymentDetailChangeTypes$Companion.PHONE_NUMBER);
        String string2 = c32320ELo.mArguments.getString("COUNTRY_CODE");
        String string3 = c32320ELo.mArguments.getString("NATIONAL_NUMBER");
        Bundle bundle = c32320ELo.mArguments;
        AbstractC31181DnP.A0R(bundle, string2, string3, string, false);
        AbstractC34231F8d.A00(bundle, EnumC33365Eoy.A07);
        bundle.putBoolean("HAS_SMS_CONSENT", false);
        A0N.A0B(bundle, c32271EJg);
        A0N.A0F(c32320ELo, 0);
        A0N.A04();
    }
}
