package X;

import com.facebookpay.confirmation.model.ECPConfirmationParams;

/* renamed from: X.WPg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70275WPg implements C1N8 {
    public static final C70275WPg A00 = new C70275WPg();

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i;
        ECPConfirmationParams eCPConfirmationParams = (ECPConfirmationParams) obj;
        String str = eCPConfirmationParams.A01;
        if (C14360o3.A0K(str, "NEXT")) {
            i = 2131961299;
        } else if (C14360o3.A0K(str, "CLOSE")) {
            i = 2131961298;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid confirmation CTA type {");
            sb.append(eCPConfirmationParams);
            throw AbstractC58320PtC.A0m(".ctaType}", sb);
        }
        return Integer.valueOf(i);
    }
}
