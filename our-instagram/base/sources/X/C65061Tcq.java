package X;

import com.fbpay.hub.paymentmethods.api.FbPayCreditCard;
import com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Tcq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65061Tcq extends C0YY implements InterfaceC16660sJ {
    public static final C65061Tcq A00 = new C65061Tcq();

    public C65061Tcq() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayList;
        Integer num;
        boolean z;
        ImmutableList immutableList = ((SO4) obj).A04;
        if (immutableList != null) {
            ArrayList<FbPayPaymentMethod> A1E = AbstractC166987dD.A1E();
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((FbPayPaymentMethod) next).A03 == null || (!r0.A0F)) {
                    A1E.add(next);
                }
            }
            arrayList = AbstractC167017dG.A0q(A1E);
            for (FbPayPaymentMethod fbPayPaymentMethod : A1E) {
                AbstractC167007dF.A1C(fbPayPaymentMethod);
                FbPayCreditCard fbPayCreditCard = fbPayPaymentMethod.A03;
                C14360o3.A0A(fbPayCreditCard);
                Integer num2 = null;
                String str = null;
                Address address = new Address(null, null, fbPayCreditCard.A05, null, null, null, null, fbPayCreditCard.A0E);
                String str2 = fbPayCreditCard.A06;
                android.net.Uri uri = fbPayPaymentMethod.A01;
                Boolean bool = null;
                if (uri != null) {
                    str = uri.toString();
                }
                String name = fbPayCreditCard.A01.name();
                String str3 = fbPayCreditCard.A07;
                if (str3 != null) {
                    num = AbstractC58319PtB.A0m(str3);
                } else {
                    num = null;
                }
                String str4 = fbPayCreditCard.A08;
                if (str4 != null) {
                    num2 = AbstractC58319PtB.A0m(str4);
                }
                String str5 = fbPayCreditCard.A0A;
                ImmutableList immutableList2 = fbPayCreditCard.A02;
                CardDetails cardDetails = new CardDetails(address, immutableList2, null, num, num2, name, str, null, str2, null, str5);
                if (immutableList2 != null) {
                    bool = Boolean.valueOf(AbstractC166987dD.A1b(immutableList2));
                }
                Boolean bool2 = fbPayCreditCard.A03;
                if (bool2 != null) {
                    z = bool2.booleanValue();
                } else {
                    z = false;
                }
                String str6 = fbPayCreditCard.A0B;
                if (str6 == null) {
                    str6 = "";
                }
                AbstractC63311ShH.A04(str6, "latestBoundDevice");
                arrayList.add(new W3CCardDetail(cardDetails, bool, str6, fbPayCreditCard.A0C, fbPayCreditCard.A0D, z));
            }
        } else {
            arrayList = null;
        }
        C14360o3.A0A(arrayList);
        return arrayList;
    }
}
