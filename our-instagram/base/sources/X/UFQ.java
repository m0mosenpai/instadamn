package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class UFQ extends AbstractC52922bZ {
    public UPP A00;
    public XIGIGBoostDestination A01;
    public C68942Veg A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final V9j A06;
    public final IGBoostPackagesFlowInfo A07;
    public final UserSession A08;
    public final ProductType A09;
    public final String A0A;
    public final String A0B;
    public final Currency A0C;
    public final InterfaceC09390do A0D;
    public final C05A A0E;
    public final C0UO A0F;
    public final InterfaceC41501vz A0G;

    public UFQ(XIGIGBoostDestination xIGIGBoostDestination, V9j v9j, IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo, UserSession userSession, ProductType productType, String str, String str2, Currency currency, int i) {
        C14360o3.A0B(userSession, 1);
        AbstractC25229BEm.A1I(currency, 4, str);
        C14360o3.A0B(str2, 7);
        this.A08 = userSession;
        this.A06 = v9j;
        this.A07 = iGBoostPackagesFlowInfo;
        this.A0C = currency;
        this.A05 = i;
        this.A0A = str;
        this.A0B = str2;
        this.A01 = xIGIGBoostDestination;
        this.A09 = productType;
        C008002u c008002u = new C008002u(new C66622UPj(new QIw(0, -1, 2, 3), new C50627MWo((Integer) null, C16930sl.A00, 23), null, null, null, true, false, AbstractC167007dF.A1W(xIGIGBoostDestination)));
        this.A0E = c008002u;
        this.A0F = c008002u;
        this.A0D = AbstractC09440dt.A01(new X2y(this, 7));
        C141796aw A00 = AbstractC141776au.A00(this);
        MC3 mc3 = new MC3(this, (InterfaceC23621Ds) null, 42);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mc3, A00);
        AbstractC23641Du.A05(anonymousClass191, new MC3(this, (InterfaceC23621Ds) null, 41), AbstractC141776au.A00(this));
        this.A0G = new C70723Wfo(this, 1);
    }

    public static final void A02(UFQ ufq, boolean z) {
        Object value;
        boolean z2;
        QIw qIw;
        C50627MWo c50627MWo;
        boolean z3;
        UQ6 uq6;
        E71 e71;
        String str;
        ufq.A04 = z;
        C05A c05a = ufq.A0E;
        do {
            value = c05a.getValue();
            C66622UPj c66622UPj = (C66622UPj) value;
            z2 = c66622UPj.A07;
            qIw = c66622UPj.A00;
            c50627MWo = c66622UPj.A01;
            z3 = c66622UPj.A05;
            uq6 = c66622UPj.A03;
            e71 = c66622UPj.A02;
            str = c66622UPj.A04;
            AbstractC167017dG.A1R(qIw, c50627MWo);
        } while (!c05a.AIi(value, new C66622UPj(qIw, c50627MWo, e71, uq6, str, z2, z, z3)));
    }

    public final void A03(Integer num) {
        Object value;
        C66622UPj c66622UPj;
        QIw qIw;
        List list;
        int i = num == null ? 0 : 1;
        C70399WUb.A00(this.A08).A0G(VG4.A0P, AbstractC167017dG.A0n(num, "boost_packages_option_", new StringBuilder()));
        C05A c05a = this.A0E;
        do {
            value = c05a.getValue();
            c66622UPj = (C66622UPj) value;
            QIw qIw2 = c66622UPj.A00;
            qIw = new QIw(i, qIw2.A01, qIw2.A03, 3);
            list = (List) c66622UPj.A01.A00;
            C14360o3.A0B(list, 1);
        } while (!c05a.AIi(value, new C66622UPj(qIw, new C50627MWo(num, list, 23), c66622UPj.A02, c66622UPj.A03, c66622UPj.A04, c66622UPj.A07, c66622UPj.A06, c66622UPj.A05)));
    }

    public static final void A00(UFQ ufq) {
        XAD xad;
        InterfaceC72021XFj interfaceC72021XFj;
        PromoteAudience promoteAudience;
        C0UO c0uo = ufq.A0F;
        C51752Mtb A01 = ((C66622UPj) c0uo.getValue()).A01();
        if (A01 != null) {
            C68942Veg c68942Veg = ufq.A02;
            if (c68942Veg != null) {
                int A02 = AbstractC37302Gc3.A02((Number) ((C66622UPj) c0uo.getValue()).A01.A01);
                Currency currency = (Currency) A01.A02;
                int A00 = A01.A00 * ((C66622UPj) c0uo.getValue()).A00();
                int A002 = ((C66622UPj) c0uo.getValue()).A00();
                C14360o3.A0B(currency, 1);
                C1UC activity = c68942Veg.A01.getActivity();
                if ((activity instanceof InterfaceC72021XFj) && (interfaceC72021XFj = (InterfaceC72021XFj) activity) != null) {
                    PromoteData BiY = interfaceC72021XFj.BiY();
                    BiY.A21.clear();
                    IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo = BiY.A0m;
                    if (iGBoostPackagesFlowInfo != null && (promoteAudience = iGBoostPackagesFlowInfo.A01) != null) {
                        BiY.A1Z = promoteAudience.A05;
                        Map map = BiY.A22;
                        C14360o3.A06(map);
                        map.put(promoteAudience.A05, promoteAudience);
                    }
                    BiY.A0H = A02;
                    BiY.A1j = currency;
                    BiY.A0I = A00;
                    BiY.A0A = A002;
                    BiY.A2w = false;
                }
            }
            C68942Veg c68942Veg2 = ufq.A02;
            if (c68942Veg2 != null) {
                C1UC activity2 = c68942Veg2.A01.getActivity();
                if ((activity2 instanceof XAD) && (xad = (XAD) activity2) != null) {
                    xad.AMs(VG4.A0P, new C70650WeW(ufq));
                }
            }
        }
    }

    public static final void A01(UFQ ufq, String str, String str2) {
        ufq.A06.A00 = new HashMap();
        String str3 = null;
        ufq.A03 = null;
        ufq.A00 = null;
        UserSession userSession = ufq.A08;
        AbstractC25651Mw.A00(userSession).A01(ufq.A0G, C70711Wfa.class);
        C70399WUb A00 = C70399WUb.A00(userSession);
        VG4 vg4 = VG4.A0P;
        A00.A0S(vg4.toString(), str2);
        C70399WUb A002 = C70399WUb.A00(userSession);
        C70399WUb.A07(A002, A002.A01, VG4.A1M.toString(), str);
        C68942Veg c68942Veg = ufq.A02;
        if (c68942Veg != null) {
            String str4 = (String) ufq.A0D.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject put = new JSONObject().put("currency", ufq.A0C.getCurrencyCode());
                E71 e71 = ((C66622UPj) ufq.A0F.getValue()).A02;
                if (e71 != null) {
                    jSONObject.put("payment_amount", put.put("amount", e71.A00));
                    str3 = jSONObject.toString();
                }
            } catch (JSONException unused) {
            }
            C14360o3.A0B(str4, 0);
            C67884V0q c67884V0q = c68942Veg.A01;
            FragmentActivity activity = c67884V0q.getActivity();
            if (activity != null) {
                InterfaceC09390do interfaceC09390do = c67884V0q.A0F;
                AbstractC43594JPz.A0N(interfaceC09390do).A0S(vg4.toString(), AnonymousClass001.A0R("open_billing_wizard_", str));
                W6f.A02(activity, new C70629We9(activity, c67884V0q, str4, str, str3), (UserSession) interfaceC09390do.getValue(), false);
            }
        }
    }
}
