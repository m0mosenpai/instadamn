package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Iy9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42895Iy9 implements JPq {
    public final INQ A00;
    public final JI6 A01;
    public final C41121IIm A02;
    public final InterfaceC11380iw A03;
    public final C6FG A04;
    public final UserSession A05;
    public final C41693IdM A06;
    public final C41726Idx A07;
    public final Product A08;

    @Override // X.JPq
    public final void A7u(C41726Idx c41726Idx, C39354HZt c39354HZt) {
    }

    @Override // X.JPq
    public final void DGS(IN1 in1, String str) {
    }

    @Override // X.JPq
    public final void DGT(IN1 in1, String str) {
    }

    @Override // X.JPq
    public final void DKN(C39354HZt c39354HZt) {
        C14360o3.A0B(c39354HZt, 0);
        C41693IdM c41693IdM = this.A06;
        if (c41693IdM != null) {
            c41693IdM.A02 = true;
        }
        C6FG c6fg = this.A04;
        Context context = c6fg.A00;
        AbstractC31171DnF.A1P(context);
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (!C6PX.A00(fragmentActivity)) {
            C9GR.A07(fragmentActivity, 2131953164);
            return;
        }
        C1XJ c1xj = C1XJ.A00;
        UserSession userSession = this.A05;
        String str = this.A02.A02;
        C22P c22p = C22P.A4K;
        String moduleName = this.A03.getModuleName();
        C41623IbD A08 = c1xj.A08(fragmentActivity, c22p, userSession, c39354HZt.A01, this.A08, str, moduleName);
        Fragment fragment = ((C62862tP) c6fg.A02).A02;
        C14360o3.A0B(fragment, 0);
        A08.A00 = fragment;
        A08.A03 = str;
        A08.A01();
    }

    @Override // X.JPq
    public final void DKO(ProductArEffectMetadata productArEffectMetadata) {
    }

    @Override // X.JPq
    public final void DKQ(C39350HZp c39350HZp, String str) {
    }

    @Override // X.JPq
    public final void DKS(C39349HZo c39349HZo, String str) {
    }

    @Override // X.JPq
    public final void DKT(InterfaceC58290Psi interfaceC58290Psi, C39352HZr c39352HZr, String str) {
    }

    @Override // X.JPq
    public final void DKU(C39353HZs c39353HZs, String str) {
    }

    @Override // X.JPq
    public final void ED6(View view, String str) {
    }

    @Override // X.InterfaceC43421JGl
    public final void DKP(IN1 in1) {
        C38321qM c38321qM;
        INQ inq = this.A00;
        inq.A03("scroll");
        if (in1 == null) {
            JI6 ji6 = this.A01;
            C41726Idx C02 = ji6.C02();
            C41753IeT c41753IeT = new C41753IeT(C02);
            C41753IeT.A01(null, EnumC39541HdD.A02, c41753IeT, new C41617Ib7(C02.A04));
            C41726Idx.A02(ji6, c41753IeT);
            return;
        }
        if (in1 instanceof C39350HZp) {
            c38321qM = ((C39350HZp) in1).A00;
        } else if (in1 instanceof C39349HZo) {
            c38321qM = ((C39349HZo) in1).A00;
        } else if (!(in1 instanceof C39352HZr)) {
            return;
        } else {
            c38321qM = ((C39352HZr) in1).A00;
        }
        JI6 ji62 = this.A01;
        C41726Idx C022 = ji62.C02();
        C41753IeT c41753IeT2 = new C41753IeT(C022);
        C41753IeT.A01(c38321qM, EnumC39541HdD.A04, c41753IeT2, new C41617Ib7(C022.A04));
        C41726Idx.A02(ji62, c41753IeT2);
        inq.A00(c38321qM);
    }

    @Override // X.JPq
    public final void DKR(C39351HZq c39351HZq, String str) {
        boolean A1Y = AbstractC25229BEm.A1Y(c39351HZq);
        C41726Idx c41726Idx = this.A07;
        C41723Idu c41723Idu = c41726Idx.A04;
        UserSession userSession = this.A05;
        Product product = this.A08;
        Parcelable[] A00 = I8E.A00(c41723Idu.A01(userSession, product));
        String str2 = product.A0H;
        Map unmodifiableMap = Collections.unmodifiableMap(c41726Idx.A07.A01);
        C14360o3.A07(unmodifiableMap);
        Bundle A0b = AbstractC166987dD.A0b();
        C14360o3.A0A(A00);
        String str3 = c39351HZq.A01;
        String moduleName = this.A03.getModuleName();
        String str4 = this.A02.A00.A0H;
        HashMap hashMap = new HashMap(unmodifiableMap);
        java.util.Set keySet = c41726Idx.A0D.keySet();
        C14360o3.A07(keySet);
        A0b.putParcelable("arguments", new LightboxArguments(null, product, str2, "", "mCheckoutSessionId", str3, moduleName, "", str4, null, null, null, null, null, null, null, hashMap, keySet, A00, A1Y, A1Y));
        Context context = this.A04.A00;
        Activity activity = (Activity) context;
        C6XJ A0L = AbstractC31171DnF.A0L(activity, A0b, userSession, ModalActivity.class, "shopping_lightbox");
        C14360o3.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        A0L.A0A(activity, 7);
    }

    public C42895Iy9(C41121IIm c41121IIm, InterfaceC11380iw interfaceC11380iw, C6FG c6fg, UserSession userSession, INQ inq, C41693IdM c41693IdM, JI6 ji6, C41726Idx c41726Idx, Product product) {
        this.A05 = userSession;
        this.A08 = product;
        this.A07 = c41726Idx;
        this.A03 = interfaceC11380iw;
        this.A04 = c6fg;
        this.A00 = inq;
        this.A01 = ji6;
        this.A02 = c41121IIm;
        this.A06 = c41693IdM;
    }
}
