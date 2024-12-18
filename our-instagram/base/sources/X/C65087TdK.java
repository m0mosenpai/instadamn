package X;

import com.facebookpay.paymentmethod.model.PaymentMethod;

/* renamed from: X.TdK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65087TdK extends C0YY implements InterfaceC16620sF {
    public static final C65087TdK A00 = new C65087TdK();

    public C65087TdK() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        C63406Sjd c63406Sjd2 = (C63406Sjd) obj2;
        AbstractC167017dG.A1N(c63406Sjd, c63406Sjd2);
        PaymentMethod paymentMethod = (PaymentMethod) c63406Sjd.A01;
        String str2 = null;
        if (paymentMethod != null) {
            str = paymentMethod.AtA();
        } else {
            str = null;
        }
        PaymentMethod paymentMethod2 = (PaymentMethod) c63406Sjd2.A01;
        if (paymentMethod2 != null) {
            str2 = paymentMethod2.AtA();
        }
        return AbstractC43593JPy.A0n(str, str2);
    }
}
