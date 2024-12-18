package X;

import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uvy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67681Uvy extends AbstractC67710Uwb implements InterfaceC71900X9k {
    public UZ1 A00;
    public AbstractC70120W4v A01;
    public C63406Sjd A02;
    public String A03;
    public final C58252li A04;
    public final InterfaceC09390do A05;
    public final C152406tQ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67681Uvy(C152406tQ c152406tQ) {
        super(c152406tQ);
        C14360o3.A0B(c152406tQ, 1);
        this.A06 = c152406tQ;
        this.A05 = AbstractC09440dt.A01(X47.A00);
        this.A02 = C63406Sjd.A03(null);
        this.A04 = new C58252li();
        this.A03 = "ALL";
        c152406tQ.A04.put("filter_type_bundle", new WT4(this, 4));
    }

    public static final void A05(C67681Uvy c67681Uvy, String str) {
        A04(c67681Uvy, null, str, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // X.AbstractC67710Uwb
    public final boolean A0C(Bundle bundle, Integer num) {
        boolean z;
        String str;
        boolean A1R = AbstractC167007dF.A1R(0, bundle, num);
        boolean A0C = super.A0C(bundle, num);
        String string = bundle.getString("filter_transaction_type");
        if (string != null && !C14360o3.A0K(this.A03, string)) {
            this.A03 = string;
            z = true;
        } else {
            z = false;
        }
        if (A0C || z) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == A1R) {
                    str = "overview_view_details";
                }
                A02();
                if (A0C && !z) {
                    return false;
                }
            }
            str = "filter";
            C2FP.A02();
            AbstractC70159WDv.A02(667758015, 0, (short) 615);
            A06(this, null, null, str, string, null, null, 667758015, 0);
            A02();
            return A0C ? true : true;
        }
        return false;
    }

    @Override // X.InterfaceC71900X9k
    public final void COL(UFY ufy) {
        C14360o3.A0B(ufy, 0);
        ufy.A04(C75M.A01(((AbstractC67710Uwb) this).A03, X5Y.A00));
        AbstractC58321PtD.A1D(ufy.A06, this.A04, new X59(this, 49), 24);
        AbstractC58321PtD.A1D(ufy.A08, ((UFZ) this).A03, new X58(this, 0), 24);
    }

    public static final LinkedHashMap A01(C63406Sjd c63406Sjd) {
        C2JS A01;
        String A07;
        AbstractCollection abstractCollection = (AbstractCollection) c63406Sjd.A01;
        LinkedHashMap linkedHashMap = null;
        if (abstractCollection != null) {
            linkedHashMap = new LinkedHashMap(AbstractC50522MSa.A09(abstractCollection));
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                C67535UnZ c67535UnZ = (C67535UnZ) it.next();
                String A072 = c67535UnZ.A0E().A07("transaction_id");
                if (A072 != null) {
                    C2JS optionalTreeField = c67535UnZ.A0E().getOptionalTreeField(6, "transaction_status", C66740UZy.class, 1599165905);
                    if (optionalTreeField != null && (A01 = optionalTreeField.A01(C67528UnS.class, -1925217936)) != null && (A07 = A01.A07("text")) != null) {
                        linkedHashMap.put(A072, A07);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return linkedHashMap;
    }

    private final void A02() {
        String optionalStringField;
        String optionalStringField2;
        String valueOf = String.valueOf(25);
        A04(this, null, "client_fetch_payouthub_init", null, null, null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", "0", valueOf, null, null, null, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C58252li c58252li = ((AbstractC67710Uwb) this).A03;
        C2JS c2js = (C2JS) c58252li.A02();
        if (c2js != null && (optionalStringField = c2js.getOptionalStringField(0, "financial_id")) != null) {
            linkedHashMap.put("financial_entity_id", optionalStringField);
            linkedHashMap.put("transaction_type_filter", this.A03);
            linkedHashMap.put("start_cursor", "0");
            linkedHashMap.put("end_cursor", valueOf);
            C2FP.A02();
            AbstractC70159WDv.A01(667758015, 0, linkedHashMap);
            ((UFZ) this).A00 = null;
            A07("fetch_init");
            C58252li c58252li2 = this.A04;
            Object value = this.A05.getValue();
            C2JS c2js2 = (C2JS) c58252li.A02();
            if (c2js2 != null && (optionalStringField2 = c2js2.getOptionalStringField(0, "financial_id")) != null) {
                String str = this.A03;
                String str2 = A0B().A00;
                C14360o3.A0B(str, 2);
                Q8J A00 = REU.A00(new C70274WPf(value, str2, null, str, optionalStringField2, 2), C2FP.A06());
                C14360o3.A07(A00);
                AbstractC63246Sg0.A02(A00, c58252li2, new C70303WQi(this, 11));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    @OnLifecycleEvent(C07R.ON_RESUME)
    public final void onResume(C07X c07x) {
        short s;
        Object A02 = super.A06.A02();
        if (A02 == EnumC68120VCd.SUCCESS) {
            s = 2;
        } else if (A02 != EnumC68120VCd.ERROR) {
            return;
        } else {
            s = 3;
        }
        C2FP.A02();
        AbstractC70159WDv.A02(667758015, 0, s);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Uw3, X.Vjc] */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.Uw3, X.Vjc] */
    public static final void A03(C67681Uvy c67681Uvy) {
        C2JS c2js;
        String str;
        VEP vep;
        String str2;
        C2JS reinterpretRequired;
        C2JS reinterpretRequired2;
        ImmutableList.Builder builder = ImmutableList.builder();
        C14360o3.A0A(builder);
        C67689UwG A0A = c67681Uvy.A0A();
        ?? abstractC69209Vjc = new AbstractC69209Vjc();
        abstractC69209Vjc.A02 = new C70515WZw(3, 4, 0, 0);
        abstractC69209Vjc.A00 = new C70514WZv(13, null, R.drawable.circle_drawable, 0);
        Integer num = C05F.A00;
        WDT wdt = new WDT(null, null, num, false, false, false);
        wdt.A04 = true;
        WDT.A00(wdt, new Object[0], 2131962559);
        abstractC69209Vjc.A01 = new W4A(wdt);
        abstractC69209Vjc.A00 = new WNN(c67681Uvy, 28);
        A0A.A06 = new Uw7(abstractC69209Vjc);
        AbstractC70120W4v.A00(A0A, builder);
        AbstractC70120W4v abstractC70120W4v = c67681Uvy.A01;
        if (abstractC70120W4v != null) {
            builder.add((Object) abstractC70120W4v);
        }
        AbstractCollection abstractCollection = (AbstractCollection) c67681Uvy.A02.A01;
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                C67535UnZ c67535UnZ = (C67535UnZ) it.next();
                C66741UZz A0E = c67535UnZ.A0E();
                C14360o3.A07(A0E);
                C2JS optionalTreeField = A0E.getOptionalTreeField(6, "transaction_status", C66740UZy.class, 1599165905);
                C70513WZu c70513WZu = null;
                r2 = null;
                String str3 = null;
                if (optionalTreeField != null) {
                    c2js = optionalTreeField.A01(C67528UnS.class, -1925217936);
                } else {
                    c2js = null;
                }
                EnumC68162VEg enumC68162VEg = (EnumC68162VEg) A0E.getOptionalEnumField(7, "transaction_status_style", EnumC68162VEg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                C2JS reinterpretRequired3 = c67535UnZ.reinterpretRequired(3, C66737UZv.class, -806265702);
                C14360o3.A07(reinterpretRequired3);
                C2JS reinterpretRequired4 = c67535UnZ.reinterpretRequired(2, C66738UZw.class, 271775793);
                C14360o3.A07(reinterpretRequired4);
                C2JS A01 = c67535UnZ.A01(C66743Ua1.class, 1921271336);
                C14360o3.A07(A01);
                C2JS reinterpretRequired5 = c67535UnZ.reinterpretRequired(4, C66742Ua0.class, -434343875);
                C14360o3.A07(reinterpretRequired5);
                int i = 22;
                if (A0E.getOptionalEnumField(1, "transaction_type", VFQ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == VFQ.PAYOUT) {
                    i = 32;
                }
                if (enumC68162VEg != null) {
                    if (c2js != null) {
                        str = c2js.A07("text");
                    } else {
                        str = null;
                    }
                    Wab wab = new Wab(str);
                    int ordinal = enumC68162VEg.ordinal();
                    int i2 = 11;
                    if (ordinal != 3) {
                        if (ordinal != 2) {
                            if (ordinal != 4) {
                                vep = VEP.A0U;
                            } else {
                                i2 = 10;
                                vep = VEP.A0X;
                            }
                        } else {
                            i2 = 9;
                            vep = VEP.A0V;
                        }
                    } else {
                        i2 = 8;
                        vep = VEP.A0W;
                    }
                    C69753Vuo c69753Vuo = new C69753Vuo(new C70514WZv(Integer.valueOf(i2), null, R.drawable.status_background_drawable, 0), wab, vep);
                    if (c67535UnZ.getOptionalTreeField(5, "universe_info", C66739UZx.class, -1794245734) != null) {
                        C2JS optionalTreeField2 = c67535UnZ.getOptionalTreeField(5, "universe_info", C66739UZx.class, -1794245734);
                        if (optionalTreeField2 != null && (reinterpretRequired2 = optionalTreeField2.reinterpretRequired(0, UXT.class, -546348433)) != null) {
                            str2 = reinterpretRequired2.A09("icon_uri");
                        } else {
                            str2 = null;
                        }
                        C2JS optionalTreeField3 = c67535UnZ.getOptionalTreeField(5, "universe_info", C66739UZx.class, -1794245734);
                        if (optionalTreeField3 != null && (reinterpretRequired = optionalTreeField3.reinterpretRequired(0, UXT.class, -546348433)) != null) {
                            str3 = reinterpretRequired.A0A("icon_uri_dark");
                        }
                        c70513WZu = new C70513WZu(str2, str3, false, true);
                    }
                    C67689UwG c67689UwG = new C67689UwG(i);
                    ?? abstractC69209Vjc2 = new AbstractC69209Vjc();
                    abstractC69209Vjc2.A02 = new C70513WZu(A01.getOptionalStringField(0, "transaction_image_uri"), A01.getOptionalStringField(1, "transaction_image_uri_dark"), false, true);
                    abstractC69209Vjc2.A01 = c70513WZu;
                    Uw5 A00 = Uw5.A00(abstractC69209Vjc2, c67689UwG);
                    Wab wab2 = new Wab(A0E.A0B("transaction_description_title"));
                    VEP vep2 = VEP.A0o;
                    Uw5.A03(wab2, A00, vep2);
                    c67689UwG.A00(Uw5.A01(Wab.A00(reinterpretRequired4, "transaction_date", 0), A00, VEP.A14), 1);
                    ?? abstractC69209Vjc3 = new AbstractC69209Vjc();
                    Uw5.A03(Wab.A00(reinterpretRequired3, "transaction_formatted_amount", 0), abstractC69209Vjc3, vep2);
                    abstractC69209Vjc3.A02 = c69753Vuo;
                    abstractC69209Vjc3.A03 = false;
                    c67689UwG.A06 = new C67684UwB(abstractC69209Vjc3);
                    c67689UwG.A03 = new WNV(24, c67535UnZ, c67681Uvy);
                    WDT wdt2 = new WDT(null, null, num, false, false, false);
                    wdt2.A01 = Wab.A00(reinterpretRequired5, "transaction_row_accessibility_label", 0);
                    wdt2.A00 = new Waa(new Object[0], 2131975715);
                    wdt2.A04 = true;
                    W4A.A00(wdt2, c67689UwG, builder);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        UZ1 uz1 = c67681Uvy.A00;
        if (uz1 != null && uz1.getCoercedBooleanField(0, "has_next_page") && ((UFZ) c67681Uvy).A06.A02() != EnumC68120VCd.LOADING) {
            builder.add((Object) new AbstractC70120W4v(new AbstractC69335Vlh(31)));
        }
        c67681Uvy.A04.A0B(builder.build());
    }

    public static final void A04(C67681Uvy c67681Uvy, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map) {
        String A07;
        C2GC c2gc = C2FP.A02().A01;
        HashMap A00 = VNP.A00(c67681Uvy.A0B());
        C2JS c2js = (C2JS) ((AbstractC67710Uwb) c67681Uvy).A03.A02();
        if (c2js != null && (A07 = c2js.A07("financial_id")) != null) {
            A00.put("financial_entity_id", A07);
            AbstractC65703TsZ.A1O("view_name", "transactions", str2, A00);
            if (str3 != null) {
                A00.put("batch_item_id", str3);
            }
            if (str4 != null) {
                A00.put("payout_record_id", str4);
            }
            if (str5 != null) {
                A00.put("endpoint", str5);
            }
            if (str6 != null) {
                A00.put("start_cursor", str6);
            }
            if (str7 != null) {
                A00.put("end_cursor", str7);
            }
            if (bool != null) {
                A00.put("has_next_page", bool);
            }
            if (str8 != null) {
                A00.put("error_message", str8);
            }
            if (str9 != null) {
                A00.put("error_stacktrace", str9);
            }
            if (str10 != null) {
                A00.put("exception_class", str10);
            }
            if (map != null) {
                A00.put("transactions_id_list", map);
            }
            c2gc.Chz(str, A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A06(C67681Uvy c67681Uvy, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        String A07;
        C2FP.A02();
        C2JS c2js = (C2JS) ((AbstractC67710Uwb) c67681Uvy).A03.A02();
        if (c2js != null && (A07 = c2js.A07("financial_id")) != null) {
            AbstractC70159WDv.A03(A07, str3, str, str2, null, null, str4, str5, str6, i, i2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A07(String str) {
        C2FP.A02();
        AbstractC70159WDv.A00(667758015, 0, str, AbstractC06930Yk.A0E());
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000f, code lost:
    
        if (r3 != null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r0 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        r2.A03 = r0;
        A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r0 = r2.A03;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.BaseBundle] */
    @Override // X.AbstractC67710Uwb, X.UFZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(android.os.Bundle r3) {
        /*
            r2 = this;
            super.A09(r3)
            X.6tQ r1 = r2.A06
            java.lang.String r0 = "filter_type_bundle"
            java.lang.Object r0 = r1.A00(r0)
            android.os.BaseBundle r0 = (android.os.BaseBundle) r0
            if (r0 != 0) goto L21
            if (r3 == 0) goto L19
        L11:
            java.lang.String r0 = "filter_transaction_type"
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L1b
        L19:
            java.lang.String r0 = r2.A03
        L1b:
            r2.A03 = r0
            r2.A02()
            return
        L21:
            r3 = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67681Uvy.A09(android.os.Bundle):void");
    }
}
