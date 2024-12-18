package X;

import android.os.Bundle;
import com.facebookpay.logging.LoggingContext;

/* renamed from: X.VwM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69836VwM {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r21.A01 != true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.os.Bundle A00(X.C2GS r20, com.facebookpay.form.fragment.model.FeatureConfiguration r21, com.facebookpay.logging.LoggingContext r22) {
        /*
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.VpU r3 = X.VYN.A00
            r1 = 1
            r4 = r21
            if (r21 == 0) goto L13
            boolean r0 = r4.A01
            r18 = 2131961458(0x7f132672, float:1.9559613E38)
            if (r0 == r1) goto L16
        L13:
            r18 = 2131961465(0x7f132679, float:1.9559628E38)
        L16:
            java.lang.Object r0 = X.C63406Sjd.A07(r20)
            X.UXS r0 = (X.UXS) r0
            com.facebookpay.form.model.AddressFormFieldsConfig r5 = X.WF4.A00(r0)
            r7 = 0
            r19 = 2131961474(0x7f132682, float:1.9559646E38)
            r20 = 2131961481(0x7f132689, float:1.955966E38)
            r21 = 0
            r6 = r22
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r22 = r21
            com.facebookpay.form.fragment.model.FormParams r1 = r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = "ECP_FORM_FRAGMENT_PARAMS"
            r2.putParcelable(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69836VwM.A00(X.2GS, com.facebookpay.form.fragment.model.FeatureConfiguration, com.facebookpay.logging.LoggingContext):android.os.Bundle");
    }

    public static final Bundle A01(VEY vey, VEY vey2, LoggingContext loggingContext, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("ECP_SESSION_ID", str);
        bundle.putString("ECP_PRODUCT_ID", str2);
        bundle.putString("ECP_CLIENT_RECEIVER_ID", str3);
        bundle.putString("ECP_CONTENT_FRAGMENT_REQUEST_KEY", str4);
        bundle.putParcelable("logging_context", loggingContext);
        bundle.putSerializable("ECP_SELECTION_NAV_BAR_STYLE", vey);
        bundle.putSerializable("ECP_FORM_NAV_BAR_STYLE", vey2);
        return bundle;
    }
}
