package X;

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Uvw extends AbstractC67710Uwb implements InterfaceC71900X9k {
    public C2GS A00;
    public C66713UYx A01;
    public AbstractC70120W4v A02;
    public String A03;
    public boolean A04;
    public final C58252li A05;
    public final InterfaceC09390do A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uvw(C152406tQ c152406tQ) {
        super(c152406tQ);
        C14360o3.A0B(c152406tQ, 1);
        this.A06 = AbstractC09440dt.A01(X3w.A00);
        this.A05 = new C58252li();
        this.A00 = new C58252li();
    }

    public static final void A03(Uvw uvw, String str, String str2) {
        A04(uvw, str, null, str2, null, null, null, null, null, null);
    }

    @Override // X.AbstractC67710Uwb, X.UFZ
    public final void A09(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("page_id");
        } else {
            str = null;
        }
        this.A03 = str;
        if (bundle != null) {
            boolean z = bundle.getBoolean("IS_V2");
            if (Boolean.valueOf(z) != null) {
                this.A04 = z;
                ((UFZ) this).A00 = null;
                Object obj = new Object();
                AbstractC58321PtD.A1D(C75M.A02(((AbstractC67710Uwb) this).A03, new C65076Td9(49, this, obj)), this.A05, new X67(0, obj, this), 19);
                super.A09(bundle);
                return;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC71900X9k
    public final void COL(UFY ufy) {
        C14360o3.A0B(ufy, 0);
        ufy.A04(C75M.A01(((AbstractC67710Uwb) this).A03, X5W.A00));
        AbstractC58321PtD.A1D(ufy.A06, this.A05, new X59(this, 38), 19);
        AbstractC58321PtD.A1D(ufy.A08, ((UFZ) this).A03, new X59(this, 39), 19);
    }

    public static final void A02(Uvw uvw, String str) {
        String optionalStringField;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2JS c2js = (C2JS) ((AbstractC67710Uwb) uvw).A03.A02();
        if (c2js != null && (optionalStringField = c2js.getOptionalStringField(0, "financial_id")) != null) {
            linkedHashMap.put("financial_entity_id", optionalStringField);
            C2FP.A02();
            AbstractC70159WDv.A00(667754853, 0, str, linkedHashMap);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0D(String str, String str2, String str3) {
        A04(this, "user_click_payouthub_atomic", str, null, null, null, null, null, null, null);
        C2GS c2gs = this.A00;
        Bundle bundle = new Bundle();
        C63368SiU.A04(bundle, (C2JT) ((AbstractC67710Uwb) this).A03.A02(), "financial_entity");
        bundle.putString("filter_transaction_type", str3);
        bundle.putParcelable("logging_data", A0B());
        C63167SeR.A00(c2gs, new Wb1(str2, bundle));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x010d, code lost:
    
        if (r1 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.Uvw r21) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Uvw.A01(X.Uvw):void");
    }

    public static final void A04(Uvw uvw, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, Map map3) {
        String A07;
        C2GC c2gc = C2FP.A02().A01;
        HashMap A00 = VNP.A00(uvw.A0B());
        C2JS c2js = (C2JS) ((AbstractC67710Uwb) uvw).A03.A02();
        if (c2js != null && (A07 = c2js.A07("financial_id")) != null) {
            AbstractC65703TsZ.A1O("financial_entity_id", A07, str2, A00);
            A00.put("view_name", "overview");
            if (str3 != null) {
                A00.put("endpoint", str3);
            }
            if (str4 != null) {
                A00.put("error_message", str4);
            }
            if (str5 != null) {
                A00.put("error_stacktrace", str5);
            }
            if (str6 != null) {
                A00.put("exception_class", str6);
            }
            if (map != null) {
                A00.put("earning_summary", map);
            }
            if (map2 != null) {
                A00.put("earning_summary_breakdown", map2);
            }
            if (map3 != null) {
                A00.put("payout_summary", map3);
            }
            c2gc.Chz(str, A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
