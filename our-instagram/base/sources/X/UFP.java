package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.FeaturedIncentiveDetails;
import com.facebookpay.incentives.model.IncentiveList;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class UFP extends AbstractC52922bZ {
    public XGq A00;
    public ECPIncentive A01;
    public ECPIncentive A02;
    public LoggingContext A03;
    public boolean A05;
    public final C2GS A07;
    public final C2GS A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C = new C2GS();
    public final C2GS A0D = new C2GS();
    public boolean A06 = true;
    public Integer A04 = C05F.A00;

    public final Void A02(String str) {
        Object obj;
        ECPIncentive eCPOffsiteOffer;
        C66695UYf A0E;
        Iterator it = WF5.A01(this.A09).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C67525UnP c67525UnP = (C67525UnP) obj;
                if (C14360o3.A0K(c67525UnP.A0E().getOptionalStringField(0, "incentive_id"), str) || C14360o3.A0K(c67525UnP.A0E().A0D("promo_code"), AbstractC65702TsY.A0g(str))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C67525UnP c67525UnP2 = (C67525UnP) obj;
        if (c67525UnP2 == null || (A0E = c67525UnP2.A0E()) == null || (eCPOffsiteOffer = VNK.A00(A0E)) == null) {
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            C14360o3.A07(upperCase);
            String upperCase2 = str.toUpperCase(locale);
            C14360o3.A07(upperCase2);
            eCPOffsiteOffer = new ECPOffsiteOffer(null, VFP.PROMO_CODE, upperCase, upperCase2, null, null, null, false);
        }
        C2GS c2gs = this.A0A;
        List A02 = WF5.A02(c2gs);
        if (!(A02 instanceof Collection) || !A02.isEmpty()) {
            Iterator it2 = A02.iterator();
            while (it2.hasNext()) {
                if (C14360o3.A0K(((ECPIncentive) it2.next()).getId(), str)) {
                    return null;
                }
            }
        }
        this.A01 = eCPOffsiteOffer;
        Wap wap = C2FP.A01().A04;
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            C14360o3.A0F("loggingContext");
            throw C00O.createAndThrow();
        }
        Wap.A03(new C25531Mh(MSY.A0H(wap.A00, "client_add_incentives_init"), 25), loggingContext, new C50372MLz(14, null, loggingContext, A00(AbstractC166987dD.A1J(eCPOffsiteOffer)), A00(WF5.A02(c2gs))));
        WF5.A00(eCPOffsiteOffer).AC9(eCPOffsiteOffer, this, C05F.A01);
        return null;
    }

    public final void A09(PromoCodeList promoCodeList) {
        ECPOffsiteOffer eCPOffsiteOffer;
        String str;
        IncentiveList incentiveList;
        C14360o3.A0B(promoCodeList, 0);
        List<String> list = promoCodeList.A00;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC65702TsY.A0g(it.next()));
        }
        C2GS c2gs = this.A0A;
        C63406Sjd c63406Sjd = (C63406Sjd) c2gs.A02();
        if (c63406Sjd != null && (incentiveList = (IncentiveList) c63406Sjd.A01) != null && (!incentiveList.A00.isEmpty())) {
            C63406Sjd.A0C(c2gs, new IncentiveList(C16930sl.A00));
        }
        if (this.A04 == C05F.A0C && A0q.isEmpty() && C63406Sjd.A0H((C63406Sjd) c2gs.A02())) {
            C63406Sjd.A0C(c2gs, new IncentiveList(C16930sl.A00));
        }
        Iterator it2 = A0q.iterator();
        while (true) {
            if (it2.hasNext()) {
                String str2 = (String) it2.next();
                ECPIncentive eCPIncentive = this.A01;
                if (eCPIncentive != null) {
                    str = eCPIncentive.getId();
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, str2)) {
                    ECPIncentive eCPIncentive2 = this.A01;
                    if (eCPIncentive2 != null) {
                        A01(eCPIncentive2, this);
                        Wap wap = C2FP.A01().A04;
                        LoggingContext loggingContext = this.A03;
                        if (loggingContext == null) {
                            break;
                        } else {
                            wap.A0h(loggingContext, A00(AbstractC166987dD.A1J(eCPIncentive2)), A00(WF5.A02(c2gs)));
                        }
                    }
                    this.A01 = null;
                } else {
                    ECPOffsiteOffer eCPOffsiteOffer2 = new ECPOffsiteOffer(null, VFP.PROMO_CODE, str2, str2, null, null, null, false);
                    A01(eCPOffsiteOffer2, this);
                    Wal.A00.AC9(eCPOffsiteOffer2, this, C05F.A00);
                }
            } else {
                ECPIncentive eCPIncentive3 = this.A02;
                if ((eCPIncentive3 instanceof ECPOffsiteOffer) && (eCPOffsiteOffer = (ECPOffsiteOffer) eCPIncentive3) != null && !A0q.contains(AbstractC65702TsY.A0g(eCPOffsiteOffer.A01))) {
                    Wap wap2 = C2FP.A01().A04;
                    LoggingContext loggingContext2 = this.A03;
                    if (loggingContext2 != null) {
                        wap2.A0i(loggingContext2, A00(AbstractC166987dD.A1J(eCPOffsiteOffer)), A00(WF5.A02(c2gs)));
                        this.A02 = null;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F("loggingContext");
        throw C00O.createAndThrow();
    }

    public static final void A01(ECPIncentive eCPIncentive, UFP ufp) {
        C2GS c2gs = ufp.A0A;
        C63406Sjd.A0C(c2gs, new IncentiveList(AbstractC001800i.A0T(eCPIncentive, AbstractC001800i.A0U(WF5.A02(c2gs)))));
    }

    public final Void A03(String str) {
        Object obj;
        C2GS c2gs = this.A0A;
        Iterator it = WF5.A02(c2gs).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((ECPIncentive) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ECPIncentive eCPIncentive = (ECPIncentive) obj;
        if (eCPIncentive != null) {
            this.A02 = eCPIncentive;
            Wap wap = C2FP.A01().A04;
            LoggingContext loggingContext = this.A03;
            if (loggingContext == null) {
                C14360o3.A0F("loggingContext");
                throw C00O.createAndThrow();
            }
            Wap.A03(new C25531Mh(MSY.A0H(wap.A00, "client_remove_incentives_init"), 113), loggingContext, new C50372MLz(17, null, loggingContext, A00(AbstractC166987dD.A1J(eCPIncentive)), A00(WF5.A02(c2gs))));
            WF5.A00(eCPIncentive).EFP(eCPIncentive, this);
        }
        return null;
    }

    public final List A04() {
        ECPOnsiteOffer eCPOnsiteOffer;
        List<ECPIncentive> A02 = WF5.A02(this.A0A);
        ArrayList A0q = AbstractC167017dG.A0q(A02);
        for (ECPIncentive eCPIncentive : A02) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, eCPIncentive.getTitle());
            c0Zx.A06("offer_id", eCPIncentive.getId());
            if ((eCPIncentive instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive) != null) {
                c0Zx.A06("credential_id", eCPOnsiteOffer.A01);
            }
            A0q.add(c0Zx);
        }
        return A0q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final List A05() {
        ?? r3;
        String optionalStringField;
        C2GS c2gs = this.A09;
        List<C67525UnP> A01 = WF5.A01(c2gs);
        if (A01 != null) {
            r3 = AbstractC167017dG.A0q(A01);
            for (C67525UnP c67525UnP : A01) {
                C66695UYf A0E = c67525UnP.A0E();
                C14360o3.A07(A0E);
                boolean z = VNK.A00(A0E) instanceof ECPOffsiteOffer;
                C66695UYf A0E2 = c67525UnP.A0E();
                if (z) {
                    optionalStringField = A0E2.A0D("promo_code");
                } else {
                    optionalStringField = A0E2.getOptionalStringField(0, "incentive_id");
                }
                C09530e4 c09530e4 = new C09530e4("offer_id", optionalStringField);
                C09530e4 c09530e42 = new C09530e4(DialogModule.KEY_TITLE, c67525UnP.A0E().A0B(DialogModule.KEY_TITLE));
                C09530e4 c09530e43 = new C09530e4(DevServerEntity.COLUMN_DESCRIPTION, c67525UnP.A0E().getOptionalStringField(5, "subtitle"));
                C09530e4 c09530e44 = new C09530e4("expiration_date", c67525UnP.A0E().getOptionalStringField(6, "expiration_date_text"));
                String lowerCase = String.valueOf(c67525UnP.A0E().getOptionalEnumField(1, "incentive_type", VFP.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)).toLowerCase();
                C14360o3.A07(lowerCase);
                r3.add(AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4("incentive_type", lowerCase)));
            }
        } else {
            r3 = C16930sl.A00;
        }
        for (ECPIncentive eCPIncentive : WF5.A02(this.A0A)) {
            List<C67525UnP> A012 = WF5.A01(c2gs);
            if (!(A012 instanceof Collection) || !A012.isEmpty()) {
                for (C67525UnP c67525UnP2 : A012) {
                    String A0D = c67525UnP2.A0E().A0D("promo_code");
                    String id = eCPIncentive.getId();
                    if (!C14360o3.A0K(A0D, id) && !C14360o3.A0K(c67525UnP2.A0E().getOptionalStringField(0, "incentive_id"), id)) {
                    }
                }
            }
            C09530e4 c09530e45 = new C09530e4("offer_id", eCPIncentive.getId());
            C09530e4 c09530e46 = new C09530e4(DialogModule.KEY_TITLE, eCPIncentive.getTitle());
            C09530e4 c09530e47 = new C09530e4(DevServerEntity.COLUMN_DESCRIPTION, "");
            C09530e4 c09530e48 = new C09530e4("expiration_date", "");
            String lowerCase2 = AbstractC166987dD.A19(VFP.PROMO_CODE).toLowerCase();
            C14360o3.A07(lowerCase2);
            r3 = AbstractC001800i.A0T(AbstractC06930Yk.A06(c09530e45, c09530e46, c09530e47, c09530e48, new C09530e4("incentive_type", lowerCase2)), r3);
        }
        return r3;
    }

    public final List A06() {
        ECPOnsiteOffer eCPOnsiteOffer;
        ECPIncentive eCPIncentive = this.A01;
        if (eCPIncentive != null) {
            C0Zx c0Zx = new C0Zx();
            String str = "";
            c0Zx.A06(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, eCPIncentive.getTitle());
            ECPIncentive eCPIncentive2 = this.A01;
            if (eCPIncentive2 != null) {
                str = eCPIncentive2.getId();
            }
            c0Zx.A06("offer_id", str);
            ECPIncentive eCPIncentive3 = this.A01;
            if ((eCPIncentive3 instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive3) != null) {
                c0Zx.A06("credential_id", eCPOnsiteOffer.A01);
            }
            return AbstractC166987dD.A1J(c0Zx);
        }
        return C16930sl.A00;
    }

    public final List A07() {
        List A02 = WF5.A02(this.A0A);
        ArrayList A0q = AbstractC167017dG.A0q(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            A0q.add(((ECPIncentive) it.next()).getId());
        }
        return A0q;
    }

    public final void A08(C63019Saj c63019Saj, LoggingContext loggingContext) {
        C70073W1q c70073W1q;
        if (this.A04 == C05F.A00) {
            this.A04 = C05F.A01;
            C62433SBj c62433SBj = C2FP.A01().A0A;
            Wap wap = C2FP.A01().A04;
            List A1J = AbstractC166987dD.A1J(EnumC129485tD.A08);
            String str = c63019Saj.A09;
            boolean A0K = C14360o3.A0K(str, "PRE_WARM");
            OtcInput otcInput = c63019Saj.A04;
            if (otcInput != null) {
                c70073W1q = AbstractC63060Sbh.A01(otcInput);
            } else {
                c70073W1q = null;
            }
            wap.A0U(loggingContext, str, A1J, AbstractC58320PtC.A1B(c70073W1q), A0K);
            c63019Saj.A01(ImmutableList.of((Object) "INCENTIVES"));
            C2FP.A00();
            String A00 = AbstractC111324zv.A00(2230);
            C2JO c2jo = new C2JO();
            c2jo.A09(A00, AbstractC111324zv.A00(4019));
            c63019Saj.A00 = c2jo;
            REV rev = new REV(C2FP.A06(), C63566SpZ.A00, new C63545SpD(5, c63019Saj, c62433SBj), 1);
            AbstractC63144Sdq.A02(rev);
            Q8J q8j = rev.A03;
            C14360o3.A0A(q8j);
            C75M.A01(q8j, new C65076Td9(48, loggingContext, c63019Saj)).A09(new C9LO(15, new X59(this, 26)));
        }
    }

    public final void A0A(LoggingContext loggingContext, String str) {
        C2GS c2gs = this.A0A;
        if (C63406Sjd.A0H((C63406Sjd) c2gs.A02())) {
            C63406Sjd.A0C(c2gs, new IncentiveList(C16930sl.A00));
        }
        List A02 = WF5.A02(c2gs);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A02) {
            if (obj instanceof ECPOffsiteOffer) {
                arrayList.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0q.add(((ECPOffsiteOffer) it.next()).A01);
        }
        C63406Sjd.A0C(this.A0D, new C69074VhP(C05F.A01, new PromoCodeList(A0q), null));
        if (this.A01 != null) {
            Wap wap = C2FP.A01().A04;
            ECPIncentive eCPIncentive = this.A01;
            if (eCPIncentive != null) {
                wap.A0T(loggingContext, str, A00(AbstractC166987dD.A1J(eCPIncentive)), A00(WF5.A02(c2gs)));
                this.A01 = null;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        ECPIncentive eCPIncentive2 = this.A02;
        SPR A01 = C2FP.A01();
        if (eCPIncentive2 != null) {
            Wap wap2 = A01.A04;
            ECPIncentive eCPIncentive3 = this.A02;
            if (eCPIncentive3 != null) {
                List A00 = A00(AbstractC166987dD.A1J(eCPIncentive3));
                Wap.A03(new C25531Mh(MSY.A0H(wap2.A00, "client_remove_incentives_fail"), 112), loggingContext, new MIO(A00(WF5.A02(c2gs)), loggingContext, A00, null, str, 3));
                this.A02 = null;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        A01.A04.A0T(loggingContext, str, C16930sl.A00, A00(WF5.A02(c2gs)));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.2GT, X.2GS] */
    public UFP() {
        C2GS c2gs = new C2GS();
        this.A0B = c2gs;
        this.A0A = new C2GT(C63406Sjd.A03(new IncentiveList(C16930sl.A00)));
        C2GS c2gs2 = new C2GS();
        C63406Sjd.A0D(c2gs2, null);
        this.A09 = c2gs2;
        this.A07 = new C2GS();
        this.A08 = new C2GT(C63406Sjd.A03(new FeaturedIncentiveDetails(null, null)));
        c2gs.A09(new C9LO(15, new X59(this, 25)));
    }

    public static final List A00(List list) {
        ECPOffsiteOffer eCPOffsiteOffer;
        ECPOnsiteOffer eCPOnsiteOffer;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECPIncentive eCPIncentive = (ECPIncentive) it.next();
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("offer_id", eCPIncentive.getId());
            c0Zx.A03("is_auto_applied", Boolean.valueOf(eCPIncentive.CQZ()));
            VHZ valueOf = VHZ.valueOf(AbstractC166987dD.A19(eCPIncentive.BHM()));
            if (valueOf == null) {
                valueOf = VHZ.PROMO_CODE;
            }
            c0Zx.A01(valueOf, "incentive_type");
            if ((eCPIncentive instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive) != null) {
                c0Zx.A06("credential_id", eCPOnsiteOffer.A01);
            }
            if ((eCPIncentive instanceof ECPOffsiteOffer) && (eCPOffsiteOffer = (ECPOffsiteOffer) eCPIncentive) != null) {
                String str = eCPOffsiteOffer.A02;
                if (str == null) {
                    str = eCPOffsiteOffer.A01;
                }
                c0Zx.A06("offer_id", str);
                c0Zx.A03("is_auto_applied", Boolean.valueOf(eCPOffsiteOffer.A03));
                VHZ valueOf2 = VHZ.valueOf(AbstractC166987dD.A19(eCPOffsiteOffer.A00));
                if (valueOf2 == null) {
                    valueOf2 = VHZ.PROMO_CODE;
                }
                c0Zx.A01(valueOf2, "incentive_type");
                c0Zx.A06("promo_code", eCPOffsiteOffer.A01);
            }
            A0q.add(c0Zx);
        }
        return A0q;
    }
}
