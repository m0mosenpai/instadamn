package X;

import android.content.Context;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WbJ implements InterfaceC72010XEy {
    public boolean A01;
    public final UserSession A02;
    public final VKC A04;
    public W6H A00 = new W6H(null);
    public final Boolean A03 = AbstractC166997dE.A0a();
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(C71773X4a.A00);
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C37053GUj(this, 23));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C37053GUj(this, 24));

    @Override // X.InterfaceC72010XEy
    public final PaymentRequest AMk() {
        return null;
    }

    @Override // X.InterfaceC72010XEy
    public final void CjG() {
    }

    @Override // X.InterfaceC72010XEy
    public final void E4g(Map map) {
    }

    @Override // X.InterfaceC72010XEy
    public final VKC Aa4() {
        return this.A04;
    }

    @Override // X.InterfaceC72010XEy
    public final /* synthetic */ java.util.Set AbM(PaymentRequest paymentRequest) {
        java.util.Set singleton = Collections.singleton(EnumC68119VCc.A02);
        C14360o3.A07(singleton);
        return singleton;
    }

    @Override // X.InterfaceC72010XEy
    public final String AcM() {
        return "META_PAY_APP_STYLE_IG";
    }

    @Override // X.InterfaceC72010XEy
    public final String AeN() {
        return null;
    }

    @Override // X.InterfaceC72010XEy
    public final W6H AnO() {
        return this.A00;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1X() {
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1c() {
        return true;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1i() {
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1j() {
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B7o() {
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean BOV() {
        return C18U.A06(C06090Tz.A05, this.A02, 36313501811214373L);
    }

    @Override // X.InterfaceC72010XEy
    public final List Bbo(C69478Vo1 c69478Vo1) {
        ArrayList arrayList = new ArrayList();
        if (c69478Vo1.A00 != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.BILLING_ADDRESS);
        }
        if (!c69478Vo1.A0C.isEmpty()) {
            arrayList.add(PaymentDetailChangeTypes$Companion.OFFERS);
        }
        if (c69478Vo1.A0A != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID);
        }
        if (c69478Vo1.A01 != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS);
        }
        if (c69478Vo1.A06 != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.FULFILLMENT_OPTION_ID);
        }
        if (c69478Vo1.A09 != null) {
            arrayList.add(PaymentDetailChangeTypes$Companion.PICKUP_ZIP_CODE);
        }
        return arrayList;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean Bc7() {
        return C18U.A06(C06090Tz.A06, this.A02, 36313501811214373L);
    }

    @Override // X.InterfaceC72010XEy
    public final boolean Bgn() {
        return true;
    }

    @Override // X.InterfaceC72010XEy
    public final /* synthetic */ Integer Bgo() {
        return C05F.A00;
    }

    @Override // X.InterfaceC72010XEy
    public final String BlK() {
        return (String) AbstractC166987dD.A17(this.A06);
    }

    @Override // X.InterfaceC72010XEy
    public final boolean BoJ() {
        return C18U.A06(C06090Tz.A05, this.A02, 36313501812066346L);
    }

    @Override // X.InterfaceC72010XEy
    public final String Br8() {
        return (String) this.A07.getValue();
    }

    @Override // X.InterfaceC72010XEy
    public final boolean BvX() {
        return this.A01;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean Bvb() {
        return true;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean C3L() {
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final Boolean CQi() {
        return this.A03;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean Cb4() {
        return AbstractC167007dF.A1Z(this.A05);
    }

    @Override // X.InterfaceC72010XEy
    public final void clear() {
        this.A00 = new W6H(this.A00.A02);
    }

    @Override // X.InterfaceC72010XEy
    public final String getProductId() {
        return "742725890006429";
    }

    public WbJ(Context context, InterfaceC172717mh interfaceC172717mh, UserSession userSession) {
        this.A02 = userSession;
        this.A04 = new C67718Uwj(context, interfaceC172717mh);
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1T() {
        return C18U.A06(C06090Tz.A06, C2FP.A0D().A00, 36313415912720342L);
    }

    @Override // X.InterfaceC72010XEy
    public final Boolean B1a() {
        Boolean A0c = AbstractC166997dE.A0c(C06090Tz.A06, C2FP.A0D().A00, 36321846932678505L);
        C14360o3.A0A(A0c);
        return A0c;
    }

    @Override // X.InterfaceC72010XEy
    public final Boolean B1e() {
        boolean z;
        if (!C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313415912982488L)) {
            C2FP.A0D();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1f() {
        if (!C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313415912982488L)) {
            C2FP.A0D();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean B1g() {
        if (!C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313415912982488L)) {
            C2FP.A0D();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final boolean CRH() {
        C2FP.A0D();
        return false;
    }

    @Override // X.InterfaceC72010XEy
    public final void EeA(boolean z) {
        this.A01 = z;
    }

    @Override // X.InterfaceC72010XEy
    public final Boolean Eij(String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ) {
        return AbstractC166997dE.A0a();
    }
}
