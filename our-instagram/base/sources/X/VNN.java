package X;

import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class VNN {
    /* JADX WARN: Type inference failed for: r15v0, types: [X.Uw2, X.Vjc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Uw3, X.Vjc] */
    public static final void A00(C63406Sjd c63406Sjd, ImmutableList.Builder builder, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C70515WZw c70515WZw;
        String str;
        String optionalStringField;
        WNV wnv;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String optionalStringField2;
        C14360o3.A0B(c63406Sjd, 1);
        if (z) {
            c70515WZw = new C70515WZw(4, 4, 2, 1);
        } else {
            c70515WZw = null;
        }
        AbstractCollection abstractCollection = (AbstractCollection) c63406Sjd.A01;
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                C2JS c2js = (C2JS) it.next();
                C2FP.A08();
                Locale A02 = C1Q2.A02();
                if (c2js != null) {
                    str = c2js.A0A("payout_record_start_date");
                } else {
                    str = null;
                }
                if (str != null) {
                    C2FP.A08();
                    String A00 = AbstractC33641Etr.A00(C1Q2.A02(), str);
                    if (c2js != null && (optionalStringField = c2js.getOptionalStringField(4, "payout_record_end_date")) != null) {
                        C2FP.A08();
                        String format = String.format(A02, "%s - %s", MSX.A1b(A00, AbstractC33641Etr.A00(C1Q2.A02(), optionalStringField), 2));
                        C14360o3.A07(format);
                        Wab wab = new Wab(format);
                        if (interfaceC16660sJ != null) {
                            wnv = new WNV(19, c2js, interfaceC16660sJ);
                        } else {
                            wnv = null;
                        }
                        C67689UwG c67689UwG = new C67689UwG(16);
                        ?? abstractC69209Vjc = new AbstractC69209Vjc();
                        C2JS optionalTreeField = c2js.getOptionalTreeField(6, "payee", UZN.class, -968339709);
                        if (optionalTreeField != null) {
                            str2 = optionalTreeField.getOptionalStringField(1, "payee_profile_uri");
                        } else {
                            str2 = null;
                        }
                        abstractC69209Vjc.A02 = new C70513WZu(str2, null, true, true);
                        Uw5 A002 = Uw5.A00(abstractC69209Vjc, c67689UwG);
                        C2JS optionalTreeField2 = c2js.getOptionalTreeField(6, "payee", UZN.class, -968339709);
                        if (optionalTreeField2 != null) {
                            str3 = optionalTreeField2.getOptionalStringField(0, "payee_name");
                        } else {
                            str3 = null;
                        }
                        Wab wab2 = new Wab(str3);
                        VEP vep = VEP.A0o;
                        Uw5.A03(wab2, A002, vep);
                        Wab A003 = Wab.A00(c2js, "payout_record_product_subtype_name", 1);
                        VEP vep2 = VEP.A14;
                        A002.A02 = new C69753Vuo(null, A003, vep2);
                        A002.A03 = new C69753Vuo(null, wab, vep2);
                        ((AbstractC69209Vjc) A002).A03 = false;
                        C67684UwB.A00(c67689UwG, A002, 1);
                        ?? abstractC69209Vjc2 = new AbstractC69209Vjc();
                        C2JS optionalTreeField3 = c2js.getOptionalTreeField(2, "payout_record_payout_amount", UZO.class, -645269283);
                        if (optionalTreeField3 != null) {
                            str4 = optionalTreeField3.getOptionalStringField(0, "formatted_amount");
                        } else {
                            str4 = null;
                        }
                        abstractC69209Vjc2.A01 = new C69753Vuo(null, new Wab(str4), vep);
                        abstractC69209Vjc2.A00 = c70515WZw;
                        abstractC69209Vjc2.A03 = false;
                        c67689UwG.A06 = new Uw9(abstractC69209Vjc2);
                        c67689UwG.A03 = wnv;
                        if (interfaceC16660sJ != null) {
                            num = C05F.A01;
                        } else {
                            num = C05F.A00;
                        }
                        boolean A1W = AbstractC167007dF.A1W(interfaceC16660sJ);
                        String str6 = "";
                        C2JS optionalTreeField4 = c2js.getOptionalTreeField(6, "payee", UZN.class, -968339709);
                        if (optionalTreeField4 == null || (str5 = optionalTreeField4.getOptionalStringField(0, "payee_name")) == null) {
                            str5 = "";
                        }
                        String optionalStringField3 = c2js.getOptionalStringField(1, "payout_record_product_subtype_name");
                        if (optionalStringField3 == null) {
                            optionalStringField3 = "";
                        }
                        C2JS optionalTreeField5 = c2js.getOptionalTreeField(2, "payout_record_payout_amount", UZO.class, -645269283);
                        if (optionalTreeField5 != null && (optionalStringField2 = optionalTreeField5.getOptionalStringField(0, "formatted_amount")) != null) {
                            str6 = optionalStringField2;
                        }
                        W4A.A00(new WDT(new Waa(new Object[]{str5, optionalStringField3, wab, str6}, 2131961214), new Waa(new Object[0], 2131961230), num, A1W, false, false), c67689UwG, builder);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }
}
