package com.facebookpay.expresscheckout.sample;

import X.AbstractC09560e7;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C2FP;
import X.C69642Vsj;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.RunnableC71637Wxj;
import android.os.Handler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.logging.LoggingPolicy;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebookpay.expresscheckout.sample.SampleECPLaunch$launchECP$1", f = "SampleECPLaunch.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class SampleECPLaunch$launchECP$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ CheckoutConfiguration A01;
    public final /* synthetic */ ECPPaymentConfiguration A02;
    public final /* synthetic */ EcpUIConfiguration A03;
    public final /* synthetic */ PaymentReceiverInfo A04;
    public final /* synthetic */ TransactionInfo A05;
    public final /* synthetic */ C69642Vsj A06;
    public final /* synthetic */ LoggingPolicy A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SampleECPLaunch$launchECP$1(CheckoutConfiguration checkoutConfiguration, ECPPaymentConfiguration eCPPaymentConfiguration, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, TransactionInfo transactionInfo, C69642Vsj c69642Vsj, LoggingPolicy loggingPolicy, String str, String str2, String str3, List list, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A0A = str;
        this.A09 = str2;
        this.A04 = paymentReceiverInfo;
        this.A0B = list;
        this.A06 = c69642Vsj;
        this.A03 = ecpUIConfiguration;
        this.A01 = checkoutConfiguration;
        this.A02 = eCPPaymentConfiguration;
        this.A05 = transactionInfo;
        this.A07 = loggingPolicy;
        this.A08 = str3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str = this.A0A;
        String str2 = this.A09;
        PaymentReceiverInfo paymentReceiverInfo = this.A04;
        List list = this.A0B;
        C69642Vsj c69642Vsj = this.A06;
        return new SampleECPLaunch$launchECP$1(this.A01, this.A02, this.A03, paymentReceiverInfo, this.A05, c69642Vsj, this.A07, str, str2, this.A08, list, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SampleECPLaunch$launchECP$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C2FP.A05();
            String str = this.A0A;
            String str2 = this.A09;
            String str3 = this.A04.A02;
            List list = this.A0B;
            this.A00 = 1;
            if (C2FP.A01().A08.A04(null, null, str, str2, null, str3, list, this) == c1jx) {
                return c1jx;
            }
        }
        Handler A0J = AbstractC167007dF.A0J();
        C69642Vsj c69642Vsj = this.A06;
        String str4 = this.A0A;
        String str5 = this.A09;
        EcpUIConfiguration ecpUIConfiguration = this.A03;
        PaymentReceiverInfo paymentReceiverInfo = this.A04;
        A0J.postDelayed(new RunnableC71637Wxj(this.A01, this.A02, ecpUIConfiguration, paymentReceiverInfo, this.A05, c69642Vsj, this.A07, str4, str5, this.A08, this.A0B), 3000L);
        return C0eB.A00;
    }
}
