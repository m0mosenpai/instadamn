package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.SiC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63355SiC {
    public static final java.util.Set A01 = AbstractC16830sb.A07("IAB_AUTOFILL", "IAB_AUTOFILL_MIGRATION", "IAB_AUTOFILL_CROSS_APP", "IAB_AUTOFILL_CROSS_APP_MIGRATION", "IAB_AUTOFILL_SILENT_BINDING", "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN", "IAB_AUTOFILL_BINDING_UPDATER", "UNKNOWN");
    public static final java.util.Set A00 = AbstractC16830sb.A07("IAB_AUTOFILL_MIGRATION", "IAB_AUTOFILL_CROSS_APP", "IAB_AUTOFILL_CROSS_APP_MIGRATION");

    public static final String A00(W3CCardDetail w3CCardDetail) {
        C14360o3.A0B(w3CCardDetail, 0);
        if (!w3CCardDetail.A05 && AbstractC43592JPx.A04(w3CCardDetail.A02) == 0) {
            return "UNBOUND_CARD";
        }
        if (!AbstractC31177DnL.A1U(C06090Tz.A06, AbstractC58318PtA.A0T(), 36310426619805799L) && A04(w3CCardDetail)) {
            return "FILTERED_BY_TRUSTED_DEVICE_EXPERIMENT";
        }
        return MessageAvailabilityResponseId$Companion.AVAILABLE;
    }

    public static final ArrayList A01(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            W3CCardDetail w3CCardDetail = (W3CCardDetail) it.next();
            if (!w3CCardDetail.A05 && AbstractC43592JPx.A04(w3CCardDetail.A02) == 0) {
                CardDetails cardDetails = w3CCardDetail.A00;
                C14360o3.A07(cardDetails);
                A12.add(cardDetails);
            }
        }
        return A12;
    }

    public static final LinkedHashSet A02(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CardDetails cardDetails = ((W3CCardDetail) it.next()).A00;
            C14360o3.A07(cardDetails);
            A12.add(cardDetails);
        }
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Iterator it2 = A12.iterator();
        while (it2.hasNext()) {
            String str = ((CardDetails) it2.next()).A08;
            if (str != null) {
                A0l.add(str);
            }
        }
        return A0l;
    }

    public static final List A03(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        for (Object obj : list) {
            if (C14360o3.A0K(A00((W3CCardDetail) obj), MessageAvailabilityResponseId$Companion.AVAILABLE)) {
                A12.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A12);
        Iterator it = A12.iterator();
        while (it.hasNext()) {
            A0q.add(((W3CCardDetail) it.next()).A00);
        }
        return A0q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r7.length() == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(com.fbpay.w3c.W3CCardDetail r9) {
        /*
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            java.lang.String r8 = r9.A04
            java.lang.String r7 = r9.A03
            r9 = 0
            if (r8 == 0) goto L11
            int r1 = r8.length()
            if (r1 != 0) goto L12
        L11:
            r0 = 1
        L12:
            r6 = r0 ^ 1
            if (r7 == 0) goto L1d
            int r1 = r7.length()
            r0 = 0
            if (r1 != 0) goto L1e
        L1d:
            r0 = 1
        L1e:
            r5 = r0 ^ 1
            if (r6 != 0) goto L25
            r4 = 0
            if (r5 == 0) goto L26
        L25:
            r4 = 1
        L26:
            java.lang.String r3 = "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN"
            if (r8 == 0) goto L30
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L38
        L30:
            if (r7 == 0) goto L6d
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L6d
        L38:
            r2 = 1
        L39:
            if (r6 == 0) goto L4b
            if (r8 == 0) goto L6b
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L4b
            java.util.Set r0 = X.AbstractC63355SiC.A00
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L6b
        L4b:
            r1 = 1
        L4c:
            if (r5 == 0) goto L5e
            if (r7 == 0) goto L69
            boolean r0 = r7.equals(r3)
            if (r0 != 0) goto L5e
            java.util.Set r0 = X.AbstractC63355SiC.A00
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L69
        L5e:
            r0 = 1
        L5f:
            if (r4 == 0) goto L68
            if (r2 == 0) goto L68
            if (r1 == 0) goto L68
            if (r0 == 0) goto L68
            r9 = 1
        L68:
            return r9
        L69:
            r0 = 0
            goto L5f
        L6b:
            r1 = 0
            goto L4c
        L6d:
            r2 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63355SiC.A04(com.fbpay.w3c.W3CCardDetail):boolean");
    }
}
