package X;

import android.webkit.CookieManager;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.facebookpay.offsite.models.message.StartCheckoutRequest;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class TQ1 implements Runnable {
    public final /* synthetic */ StartCheckoutRequest A00;
    public final /* synthetic */ R8Y A01;
    public final /* synthetic */ C15370ps A02;

    public TQ1(StartCheckoutRequest startCheckoutRequest, R8Y r8y, C15370ps c15370ps) {
        this.A00 = startCheckoutRequest;
        this.A02 = c15370ps;
        this.A01 = r8y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        StartCheckoutRequest startCheckoutRequest = this.A00;
        List<String> list = startCheckoutRequest.content.cookieNames;
        if (list != null && !list.isEmpty()) {
            C15370ps c15370ps = this.A02;
            List<String> list2 = startCheckoutRequest.content.cookieNames;
            QF6 C9a = this.A01.A02.C9a();
            if (C9a != null) {
                str3 = C9a.A05();
            } else {
                str3 = null;
            }
            ArrayList arrayList = null;
            if (str3 != null) {
                String A00 = AbstractC62190S1l.A00(str3);
                Pattern pattern = SUV.A01;
                AbstractC61712RsT.A00();
                String cookie = CookieManager.getInstance().getCookie(A00);
                if (cookie != null) {
                    List A0Q = AbstractC001900j.A0Q(cookie, new char[]{';'}, 0);
                    ArrayList A0q = AbstractC167017dG.A0q(A0Q);
                    Iterator it = A0Q.iterator();
                    while (it.hasNext()) {
                        AbstractC166997dE.A1S(AbstractC001900j.A0B(AbstractC166987dD.A1B(it)), A0q);
                    }
                    arrayList = AbstractC166987dD.A1E();
                    for (Object obj : A0q) {
                        String str4 = (String) obj;
                        String A1A = AbstractC25228BEl.A1A(AbstractC001900j.A0J(str4, str4, '='));
                        if (list2 != null) {
                            if (!list2.contains(A1A)) {
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator<String> it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (new C11L(AbstractC166987dD.A1B(it2)).A08(A1A)) {
                                        }
                                    }
                                }
                            }
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            c15370ps.A00 = arrayList;
        }
        C15370ps c15370ps2 = this.A02;
        if (c15370ps2.A00 != null) {
            str = new Gson().A0B(c15370ps2.A00);
        } else {
            str = null;
        }
        R8Y r8y = this.A01;
        PaymentRequest AMk = ((T2U) r8y).A00.AMk();
        if (AMk != null) {
            r8y.A01(AMk.content);
            ArrayList A1E = AbstractC166987dD.A1E();
            if (str != null) {
                A1E.add(new CheckoutSetupKeyValue("COOKIES", str));
            }
            String str5 = startCheckoutRequest.content.handle;
            if (str5 != null) {
                A1E.add(new CheckoutSetupKeyValue("JS_HANDLE", str5));
            }
            InterfaceC09390do interfaceC09390do = r8y.A08;
            String str6 = ((CheckoutHandler) interfaceC09390do.getValue()).A0A().AnO().A07;
            if (str6 != null) {
                A1E.add(new CheckoutSetupKeyValue("ORDER_STUB_ID", str6));
            }
            InterfaceC172717mh interfaceC172717mh = r8y.A02;
            QF6 C9a2 = interfaceC172717mh.C9a();
            if (C9a2 != null) {
                str2 = C9a2.A05();
            } else {
                str2 = null;
            }
            String A002 = AbstractC62190S1l.A00(str2);
            if (A002 != null) {
                C2GS A09 = ((CheckoutHandler) interfaceC09390do.getValue()).A09(AMk, A002, AbstractC63402SjX.A05(r8y.A06), A1E);
                FragmentActivity activity = interfaceC172717mh.getActivity();
                if (activity != null) {
                    A09.A06(activity, r8y.A00);
                }
            }
        }
    }
}
