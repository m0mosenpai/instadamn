package X;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

@Deprecated(message = "use {@link AutofillLogger}")
/* loaded from: classes10.dex */
public final class SOY {
    public final WeakReference A00;
    public final C5G6 A01;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0137, code lost:
    
        r0 = r11.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0139, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x013f, code lost:
    
        if (r0.clone() == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0141, code lost:
    
        r0 = r11.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0145, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0147, code lost:
    
        r0 = (java.util.TreeSet) r0.clone();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x014d, code lost:
    
        r5.put("fields_rendered_in_bottomsheet", X.AbstractC93184Fu.A00(", ", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0194, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0156, code lost:
    
        r5.put("has_valid_email", java.lang.String.valueOf(r11.A0R));
        r5.put("has_valid_phone_number", java.lang.String.valueOf(r11.A0S));
        r11 = X.AbstractC63045SbP.A02(r7, r8.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0176, code lost:
    
        if (X.MSW.A1b(r11) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0178, code lost:
    
        r0 = r11.get("supplemented_wallet_data_from_recent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x017f, code lost:
    
        if (r0 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0181, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0182, code lost:
    
        r5.put("supplemented_wallet_data_from_recent", r0);
        r0 = r11.get("supplemented_wallet_data_from_crossapp");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x018c, code lost:
    
        if (r0 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x018e, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018f, code lost:
    
        r5.put("supplemented_wallet_data_from_crossapp", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008a, code lost:
    
        if (r14.equals(r0) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
    
        r5.put("AUTOMATIC_CONTACT_UPDATE_V2_MC_ENABLED", java.lang.String.valueOf(r8.A04.A01()));
        r4 = (java.util.Map) r7.A0G.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
    
        if (r4.containsKey(8) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
    
        r1 = java.lang.String.valueOf(r4.get(8));
        r0 = "SUPPRESS_NUX_QRT_EXPERIMENT_VERSION_ID";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        r5.put(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fd, code lost:
    
        if (r14.equals("SUPPRESSED_AUTOMATIC_UPDATE") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e3, code lost:
    
        if (r14.equals(r0) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ee, code lost:
    
        r1 = java.lang.String.valueOf(r6.A03);
        r0 = "presented_end_of_session";
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ec, code lost:
    
        if (r14.equals("PROMPTED_SAVE") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0135, code lost:
    
        if (r14.equals("DECLINED_AUTOFILL") != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.RqR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.RqR, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C61602RqR A00(java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SOY.A00(java.lang.String, boolean):X.RqR");
    }

    public final void A01(Bundle bundle, Integer num, Integer num2) {
        String str;
        String A00 = AbstractC61717RsY.A00(num);
        if (AbstractC001900j.A0a(A00, "SHOW_", false) && AbstractC001900j.A0a(A00, "_DIALOG", false)) {
            String A0R = AnonymousClass001.A0R("SUPPRESSED_", AbstractC002300n.A0d(AbstractC002300n.A0d(A00, "SHOW_", "", false), "_DIALOG", "", false));
            C14360o3.A0B(A0R, 0);
            C61602RqR A002 = A00(A0R, false);
            switch (num2.intValue()) {
                case 0:
                    str = "SuppressIndefinitely";
                    break;
                case 1:
                    str = "SuppressAndDeferToClose";
                    break;
                default:
                    str = "Ineligible";
                    break;
            }
            A002.A01("suppress_strategy_type", str);
            C63305ShB.A00().A07(bundle, A002.A00().A01());
        }
    }

    public final void A02(Bundle bundle, Integer num, String str) {
        String str2;
        C61602RqR A00 = A00("NO_PROMPTED_AUTOFILL", false);
        if (str != null) {
            A00.A0G = str;
        }
        switch (num.intValue()) {
            case 1:
                str2 = "INVALID_NONCE";
                break;
            case 2:
                str2 = "AUTOFILL_DISABLED";
                break;
            case 3:
                str2 = "SYSTEM_AUTOFILL_ONLY";
                break;
            case 4:
                str2 = "QRT_BLACKOUT";
                break;
            case 5:
                str2 = "USER_PREVIOUSLY_DECLINED_FOR_DOMAIN";
                break;
            default:
                str2 = "MISSING_RELEVANT_CONTACT_INFO";
                break;
        }
        A00.A01(AnonymousClass001.A0R("NO_AUTOFILL_PROMPT_REASON_", str2), str2);
        C63305ShB.A00().A07(bundle, A00.A00().A01());
    }

    public SOY(C5G6 c5g6, WeakReference weakReference) {
        this.A01 = c5g6;
        this.A00 = weakReference;
    }
}
