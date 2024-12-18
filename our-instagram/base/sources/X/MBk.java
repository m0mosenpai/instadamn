package X;

import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.File;

/* loaded from: classes8.dex */
public final class MBk extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBk(FragmentActivity fragmentActivity, C70150W8q c70150W8q, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, TransactionInfo transactionInfo, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ) {
        super(2, interfaceC23621Ds);
        this.A0A = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A04 = paymentReceiverInfo;
        this.A02 = c70150W8q;
        this.A05 = ecpUIConfiguration;
        this.A01 = transactionInfo;
        this.A07 = fragmentActivity;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A03 != 0) {
            return new MBk((UserSession) this.A07, (DirectAnimatedMedia) this.A04, (InterfaceC2056098k) this.A06, (File) this.A05, this.A0A, this.A09, this.A08, interfaceC23621Ds);
        }
        String str = this.A0A;
        String str2 = this.A09;
        String str3 = this.A08;
        PaymentReceiverInfo paymentReceiverInfo = (PaymentReceiverInfo) this.A04;
        return new MBk((FragmentActivity) this.A07, (C70150W8q) this.A02, (EcpUIConfiguration) this.A05, paymentReceiverInfo, (TransactionInfo) this.A01, str, str2, str3, interfaceC23621Ds, (InterfaceC16820sZ) this.A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r1
      0x001c: PHI (r1v28 java.lang.Object) = (r1v27 java.lang.Object), (r1v0 java.lang.Object) binds: [B:16:0x010e, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBk) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBk(UserSession userSession, DirectAnimatedMedia directAnimatedMedia, InterfaceC2056098k interfaceC2056098k, File file, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A07 = userSession;
        this.A06 = interfaceC2056098k;
        this.A05 = file;
        this.A04 = directAnimatedMedia;
        this.A0A = str;
        this.A09 = str2;
        this.A08 = str3;
    }
}
