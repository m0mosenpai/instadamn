package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.transactions.api.UpcomingPayout;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class REK extends Q8X {
    public QuickPerformanceLogger A00;
    public FBPayLoggerData A01;
    public UpcomingPayout A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final C2GT A06;
    public final C58252li A07;
    public final C2GC A08;
    public final SE9 A09;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [X.S4r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [X.S4r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.RE1, java.lang.Object] */
    public static ImmutableList A00(C62963SZg c62963SZg, REK rek) {
        Object swn;
        RE3 re3;
        String str;
        String quantityString;
        C59064QVw c59064QVw;
        ImmutableList immutableList = c62963SZg.A01;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (immutableList.isEmpty()) {
            C63307ShD A0E = C2FP.A0E();
            if (A0E.A04 == null) {
                A0E.A04 = new Object();
            }
            RDo rDo = new RDo();
            rDo.A02 = C2FP.A0E().A08.getString(2131975714);
            boolean A1O = AbstractC58319PtB.A1O();
            Context context = C2FP.A0E().A08;
            int i = 2131975712;
            if (A1O) {
                i = 2131975713;
            }
            C2FP.A0E();
            rDo.A01 = AbstractC167007dF.A0f(context, "Instagram", i);
            C63307ShD A0E2 = C2FP.A0E();
            if (A0E2.A04 == null) {
                A0E2.A04 = new Object();
            }
            rDo.A00 = R.attr.fbpay_order_icon;
            swn = new RDv(rDo);
        } else {
            int i2 = 3;
            if (rek.A04) {
                RDq rDq = new RDq();
                rDq.A02 = 2131962336;
                if (immutableList.size() > 3) {
                    rDq.A00 = 2131962348;
                    rDq.A03 = ViewOnClickListenerC63508Sob.A00(rek, 57);
                }
                RDz.A00(rDq, builder);
            } else {
                C2FP.A0E().A06();
            }
            if (!rek.A04) {
                i2 = immutableList.size();
            }
            int i3 = 6;
            if (rek.A05) {
                i3 = 8;
            }
            for (int i4 = 0; i4 < i2 && i4 < immutableList.size(); i4++) {
                R1P r1p = (R1P) immutableList.get(i4);
                RDs rDs = new RDs(i3);
                rDs.A0G = r1p.A07("receiver_name");
                rDs.A04 = 1;
                rDs.A03 = 2;
                rDs.A0H = true;
                rDs.A0F = r1p.A0C("transaction_payment_type");
                rDs.A0D = r1p.getOptionalStringField(2, "creation_date");
                rDs.A0E = r1p.getOptionalStringField(1, "receiver_profile_image_uri");
                if (rek.A05) {
                    re3 = new RE3(r1p.getRequiredCompactedStringListField(9, "transaction_item_images"));
                } else {
                    String A0A = r1p.A0A("transaction_amount_formatted");
                    String A0B = r1p.A0B("transaction_amount_subtitle");
                    ?? obj = new Object();
                    obj.A01 = A0A;
                    obj.A00 = A0B;
                    re3 = obj;
                }
                rDs.A0B = re3;
                rDs.A08 = new ViewOnClickListenerC63509Soc(24, r1p, rek);
                if (rek.A05) {
                    C59064QVw c59064QVw2 = null;
                    if (r1p.A0F() == null) {
                        c59064QVw = null;
                    } else {
                        c59064QVw = (C59064QVw) r1p.A0F().A01(C59064QVw.class, 254825634);
                    }
                    rDs.A0A = c59064QVw;
                    if (r1p.A0E() != null) {
                        c59064QVw2 = (C59064QVw) r1p.A0E().A01(C59064QVw.class, 254825634);
                    }
                    rDs.A09 = c59064QVw2;
                }
                SE4 se4 = new SE4();
                se4.A00 = C05F.A01;
                if (rek.A05) {
                    String optionalStringField = r1p.getOptionalStringField(0, "receiver_name");
                    String str2 = "";
                    if (r1p.A0F() == null) {
                        str = "";
                    } else {
                        str = AbstractC58320PtC.A0z(r1p.A0F(), C59064QVw.class, 254825634);
                    }
                    if (r1p.A0E() != null) {
                        str2 = AbstractC58320PtC.A0z(r1p.A0E(), C59064QVw.class, 254825634);
                    }
                    boolean isEmpty = r1p.getRequiredCompactedStringListField(9, "transaction_item_images").isEmpty();
                    C63307ShD A0E3 = C2FP.A0E();
                    if (isEmpty) {
                        quantityString = A0E3.A08.getString(2131962337, optionalStringField, str, str2);
                    } else {
                        quantityString = A0E3.A08.getResources().getQuantityString(R.plurals.fbpay_hub_transaction_row_content_description_with_items, r1p.getRequiredCompactedStringListField(9, "transaction_item_images").size(), optionalStringField, Integer.valueOf(r1p.getRequiredCompactedStringListField(9, "transaction_item_images").size()), str, str2);
                    }
                    se4.A01 = quantityString;
                }
                ((AbstractC61568Rpr) rDs).A02 = new SW2(se4);
                builder.add((Object) new RDx(rDs));
            }
            if (rek.A03 != null && !rek.A04) {
                swn = new SWN(7);
            }
            return builder.build();
        }
        builder.add(swn);
        return builder.build();
    }

    public REK(QuickPerformanceLogger quickPerformanceLogger, C2GC c2gc, SE9 se9) {
        C58252li A0I = AbstractC58318PtA.A0I();
        this.A07 = A0I;
        this.A08 = c2gc;
        this.A00 = quickPerformanceLogger;
        this.A09 = se9;
        this.A06 = TW3.A00(A0I, this, 19);
        C63627SqZ.A02(A0I, super.A03, this, 36);
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A01 = AbstractC58320PtC.A0Z(bundle);
        boolean z = bundle.getBoolean("is_short_version", false);
        this.A04 = z;
        if (!z) {
            this.A00.markerStart(110177888);
        }
        this.A05 = bundle.getBoolean("use_transactions_v1", false);
        if (!this.A04) {
            this.A08.Chz("fbpay_transactions_page_display", AbstractC58442PvL.A08(this.A01));
        }
    }
}
