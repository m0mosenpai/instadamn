package com.facebookpay.expresscheckout.checkouthelper;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C2FP;
import X.C63406Sjd;
import X.C69641Vsi;
import X.DKG;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.VEJ;
import X.WF6;
import X.X3A;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebookpay.expresscheckout.checkouthelper.ECPCheckoutHelper$showCheckoutBottomSheet$2", f = "ECPCheckoutHelper.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class ECPCheckoutHelper$showCheckoutBottomSheet$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ C69641Vsi A01;
    public final /* synthetic */ ECPPaymentRequest A02;
    public final /* synthetic */ PaymentReceiverInfo A03;
    public final /* synthetic */ TransactionInfo A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECPCheckoutHelper$showCheckoutBottomSheet$2(C69641Vsi c69641Vsi, ECPPaymentRequest eCPPaymentRequest, PaymentReceiverInfo paymentReceiverInfo, TransactionInfo transactionInfo, String str, String str2, String str3, String str4, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = eCPPaymentRequest;
        this.A01 = c69641Vsi;
        this.A04 = transactionInfo;
        this.A09 = list;
        this.A07 = str;
        this.A0A = z;
        this.A08 = str2;
        this.A06 = str3;
        this.A05 = str4;
        this.A03 = paymentReceiverInfo;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        C69641Vsi c69641Vsi = this.A01;
        TransactionInfo transactionInfo = this.A04;
        List list = this.A09;
        String str = this.A07;
        boolean z = this.A0A;
        return new ECPCheckoutHelper$showCheckoutBottomSheet$2(c69641Vsi, eCPPaymentRequest, this.A03, transactionInfo, str, this.A08, this.A06, this.A05, list, interfaceC23621Ds, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            ECPRepositoryImpl eCPRepositoryImpl = C2FP.A01().A08;
            ECPPaymentRequest eCPPaymentRequest = this.A02;
            ECPHandler eCPHandler = this.A01.A00;
            TransactionInfo transactionInfo = this.A04;
            List list = this.A09;
            String str = this.A07;
            boolean z = this.A0A;
            this.A00 = 1;
            obj2 = eCPRepositoryImpl.A03(eCPHandler, eCPPaymentRequest, transactionInfo, str, list, this, z);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        C63406Sjd c63406Sjd = (C63406Sjd) obj2;
        if (C63406Sjd.A0G(c63406Sjd)) {
            C69641Vsi c69641Vsi = this.A01;
            Fragment fragment = c69641Vsi.A01;
            if (fragment == null || (context = fragment.getContext()) == null) {
                context = c69641Vsi.A02;
            }
            String str2 = this.A08;
            String str3 = this.A06;
            String str4 = this.A05;
            WF6.A00(context, VEJ.A05, c63406Sjd.A02, new X3A(this.A03, c69641Vsi, str4, str2, str3, 1), DKG.A00);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ECPCheckoutHelper$showCheckoutBottomSheet$2) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }
}
