package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.iabadscontext.CheckoutSetupPayload;
import com.facebook.iabadscontext.DisclaimerText;
import com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension;
import com.facebook.iabadscontext.ReceiverInfo;
import com.facebookpay.offsite.models.message.AvailabilityInitiator$Companion;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class R8X extends WbK {
    public String A00;
    public final IABAdsMetaCheckoutPaymentsSDKDataExtension A01;
    public final UserSession A02;
    public final VKC A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC72010XEy
    public final VKC Aa4() {
        return this.A03;
    }

    @Override // X.InterfaceC72010XEy
    public final String AcM() {
        return "META_CHECKOUT_APP_STYLE_IG";
    }

    @Override // X.InterfaceC72010XEy
    public final String AeN() {
        return this.A00;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1j() {
        return C18U.A06(C06090Tz.A06, this.A02, 36313501813180469L);
    }

    @Override // X.InterfaceC72010XEy
    public final boolean BOV() {
        return C18U.A06(C06090Tz.A05, this.A02, 36313501812000809L);
    }

    @Override // X.InterfaceC72010XEy
    public final boolean Bc7() {
        return C18U.A06(C06090Tz.A06, this.A02, 36313501812000809L);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0bW, java.lang.Object] */
    @Override // X.InterfaceC72010XEy
    public final Integer Bgo() {
        List list;
        IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension = this.A01;
        if (iABAdsMetaCheckoutPaymentsSDKDataExtension != null) {
            CheckoutSetupPayload checkoutSetupPayload = iABAdsMetaCheckoutPaymentsSDKDataExtension.A00;
            boolean z = checkoutSetupPayload.A00.A00;
            String str = iABAdsMetaCheckoutPaymentsSDKDataExtension.A01;
            if (z) {
                if (str != null) {
                    ReceiverInfo receiverInfo = checkoutSetupPayload.A01;
                    if (receiverInfo == null || (list = receiverInfo.A00) == null) {
                        list = C16930sl.A00;
                    }
                    String A00 = AbstractC62190S1l.A00(str);
                    if (A00 != null && A00.length() != 0) {
                        ?? obj = new Object();
                        ArrayList A1E = AbstractC166987dD.A1E();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            android.net.Uri A002 = AbstractC08820cl.A00(obj, AbstractC166987dD.A1B(it));
                            if (A002 != null) {
                                Uri.Builder builder = new Uri.Builder();
                                builder.scheme(A002.getScheme());
                                builder.authority(A002.getAuthority());
                                String A0q = AbstractC58319PtB.A0q(builder);
                                if (A0q != null) {
                                    A1E.add(A0q);
                                }
                            }
                        }
                        Iterator it2 = A1E.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (A00.equals(next)) {
                                if (next != null) {
                                    return C05F.A0C;
                                }
                            }
                        }
                    }
                }
            }
            return C05F.A01;
        }
        return C05F.A00;
    }

    @Override // X.InterfaceC72010XEy
    public final String BlK() {
        Object value = this.A05.getValue();
        C14360o3.A07(value);
        return (String) value;
    }

    @Override // X.InterfaceC72010XEy
    public final String Br8() {
        return AbstractC25225BEi.A15(this.A06);
    }

    @Override // X.InterfaceC72010XEy
    public final boolean Cb4() {
        return AbstractC167007dF.A1Z(this.A04);
    }

    public R8X(Context context, InterfaceC172717mh interfaceC172717mh, DisclaimerText disclaimerText, IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension, UserSession userSession) {
        String str;
        InterfaceC65619ToA t2s;
        this.A01 = iABAdsMetaCheckoutPaymentsSDKDataExtension;
        if (iABAdsMetaCheckoutPaymentsSDKDataExtension != null) {
            str = AvailabilityInitiator$Companion.INITIATOR_UAC;
        } else {
            str = AvailabilityInitiator$Companion.INITIATOR_IAW;
        }
        this.A00 = str;
        this.A02 = userSession;
        this.A04 = AbstractC09440dt.A01(C65010TbZ.A00);
        if (disclaimerText != null) {
            t2s = new T2T(context, disclaimerText);
        } else {
            t2s = new T2S(context);
        }
        this.A03 = new R8W(context, interfaceC172717mh, t2s, userSession);
        this.A05 = AbstractC09440dt.A01(new C37053GUj(this, 21));
        this.A06 = AbstractC09440dt.A01(new C37053GUj(this, 22));
    }
}
