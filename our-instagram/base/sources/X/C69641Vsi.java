package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.handler.ECPHandler;

/* renamed from: X.Vsi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69641Vsi {
    public ECPHandler A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final AbstractC10360h2 A03;
    public final C07X A04;
    public final InterfaceC58362lv A05;
    public final C69208Vjb A06;
    public final ECPHandler A07;

    /* JADX WARN: Multi-variable type inference failed */
    public C69641Vsi(Fragment fragment, FragmentActivity fragmentActivity, ECPHandler eCPHandler) {
        AbstractC10360h2 supportFragmentManager;
        this.A01 = fragment;
        this.A02 = fragmentActivity;
        this.A07 = eCPHandler;
        String A00 = AbstractC58317Pt9.A00(185);
        if ((fragment == null || (supportFragmentManager = fragment.getChildFragmentManager()) == null) && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            throw new IllegalArgumentException(A00);
        }
        this.A03 = supportFragmentManager;
        Fragment fragment2 = fragment != null ? fragment : fragmentActivity;
        this.A04 = fragment2;
        this.A00 = eCPHandler == null ? new T2J(fragment2) : eCPHandler;
        C2FP.A01();
        this.A06 = new C69208Vjb(fragment, fragmentActivity);
        this.A05 = new C70302WQh(this, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01dc, code lost:
    
        if (r7.A07(r4, r6, r1) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0217  */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.2GT, X.2GS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2GS A00(android.os.Bundle r28, com.facebookpay.expresscheckout.models.CheckoutConfiguration r29, com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r30, com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r31, com.facebookpay.expresscheckout.models.EcpUIConfiguration r32, com.facebookpay.expresscheckout.models.PaymentReceiverInfo r33, com.facebookpay.expresscheckout.models.TransactionInfo r34, com.facebookpay.logging.LoggingPolicy r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.util.List r41, boolean r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69641Vsi.A00(android.os.Bundle, com.facebookpay.expresscheckout.models.CheckoutConfiguration, com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration, com.facebookpay.expresscheckout.models.ECPPaymentConfiguration, com.facebookpay.expresscheckout.models.EcpUIConfiguration, com.facebookpay.expresscheckout.models.PaymentReceiverInfo, com.facebookpay.expresscheckout.models.TransactionInfo, com.facebookpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean):X.2GS");
    }
}
