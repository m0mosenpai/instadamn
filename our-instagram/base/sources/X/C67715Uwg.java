package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.Uwg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67715Uwg extends UFZ implements X9h {
    public C2GT A00;
    public AbstractC67710Uwb A01;
    public LoggingData A02;
    public String A03;
    public final C2GS A04;
    public final C152406tQ A05;

    public C67715Uwg(C152406tQ c152406tQ) {
        C14360o3.A0B(c152406tQ, 1);
        this.A05 = c152406tQ;
        this.A04 = new C2GS();
        c152406tQ.A04.put("bottom_sheet_filter_index", new WT4(this, 2));
    }

    public static final void A02(C67715Uwg c67715Uwg, ImmutableList.Builder builder, String str) {
        C69753Vuo c69753Vuo = new C69753Vuo(null, A01(str), VEP.A0o);
        C2GS c2gs = c67715Uwg.A04;
        boolean A0K = C14360o3.A0K(c2gs.A02(), str);
        builder.add((Object) AbstractC67687UwE.A00(new WMS(str, c67715Uwg, 0), c69753Vuo, new W4A(new WDT(A01(str), null, C05F.A01, true, C14360o3.A0K(c2gs.A02(), str), false)), A0K));
    }

    @Override // X.X9h
    public final void CNv(AbstractC67710Uwb abstractC67710Uwb) {
        this.A01 = abstractC67710Uwb;
        this.A00 = C75M.A01(this.A04, new X59(this, 31));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.Waa A01(java.lang.String r3) {
        /*
            int r2 = r3.hashCode()
            r0 = -68623507(0xfffffffffbe8e36d, float:-2.4184512E36)
            r1 = 0
            if (r2 == r0) goto L32
            r0 = -25097047(0xfffffffffe810ca9, float:-8.576807E37)
            if (r2 == r0) goto L28
            r0 = 64897(0xfd81, float:9.094E-41)
            if (r2 != r0) goto L1f
            java.lang.String r0 = "ALL"
            boolean r0 = r3.equals(r0)
            r2 = 2131962567(0x7f132ac7, float:1.9561863E38)
        L1d:
            if (r0 != 0) goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.Waa r0 = new X.Waa
            r0.<init>(r1, r2)
            return r0
        L28:
            java.lang.String r0 = "EARNINGS"
            boolean r0 = r3.equals(r0)
            r2 = 2131962568(0x7f132ac8, float:1.9561865E38)
            goto L1d
        L32:
            java.lang.String r0 = "PAYOUTS"
            boolean r0 = r3.equals(r0)
            r2 = 2131962569(0x7f132ac9, float:1.9561867E38)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67715Uwg.A01(java.lang.String):X.Waa");
    }

    public static final void A03(C67715Uwg c67715Uwg, String str, String str2) {
        String str3;
        C2GC c2gc = C2FP.A02().A01;
        LoggingData loggingData = c67715Uwg.A02;
        if (loggingData == null) {
            str3 = "loggingData";
        } else {
            HashMap A00 = VNP.A00(loggingData);
            String str4 = c67715Uwg.A03;
            if (str4 == null) {
                str3 = "financialEntityID";
            } else {
                A00.put("financial_entity_id", str4);
                A00.put("view_name", "transactions");
                A00.put("target_name", str);
                A00.put("filter_type", str2);
                c2gc.Chz("user_click_payouthub_atomic", A00);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.os.BaseBundle] */
    @Override // X.UFZ
    public final void A09(Bundle bundle) {
        String string;
        super.A09(bundle);
        LoggingData loggingData = null;
        if (bundle != null) {
            loggingData = (LoggingData) bundle.getParcelable("logging_data");
        }
        if (loggingData != null) {
            this.A02 = loggingData;
            if (bundle != null && (string = bundle.getString("financial_entity_id")) != null) {
                this.A03 = string;
                ?? r0 = (BaseBundle) this.A05.A00("bottom_sheet_filter_index");
                if (r0 != 0) {
                    bundle = r0;
                }
                C2GS c2gs = this.A04;
                String string2 = bundle.getString("filter_transaction_type");
                if (string2 != null) {
                    c2gs.A0B(string2);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
