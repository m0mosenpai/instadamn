package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class RDm extends SNK {
    public final Context A00;
    public final UserSession A01;

    public RDm(Context context, UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        super(interfaceC08830cm);
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.SNK
    public final Fragment A00(Bundle bundle, String str) {
        String str2;
        switch (str.hashCode()) {
            case -1847017863:
                str2 = "payment_methods";
                break;
            case -1825227990:
                str2 = "bank_account";
                break;
            case -1404556881:
                str2 = "transaction_details_bloks";
                break;
            case -808149289:
                str2 = "connect_fbpay";
                break;
            case -689995158:
                str2 = "promotion_payment";
                break;
            case 3208415:
                str2 = "home";
                break;
            case 598628962:
                str2 = "order_detail";
                break;
            case 756171503:
                str2 = "order_list";
                break;
            case 1082290744:
                str2 = "receipt";
                break;
            case 2138025441:
                str2 = "transaction_details";
                break;
            default:
                return super.A00(bundle, str);
        }
        if (str.equals(str2)) {
            return A01(bundle, str);
        }
        return super.A00(bundle, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x029a, code lost:
    
        if (X.C4K3.A00(r5) != false) goto L129;
     */
    @Override // X.SNK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment A01(android.os.Bundle r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RDm.A01(android.os.Bundle, java.lang.String):androidx.fragment.app.Fragment");
    }
}
