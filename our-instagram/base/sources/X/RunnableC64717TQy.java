package X;

import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.TQy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64717TQy implements Runnable {
    public final /* synthetic */ AutofillSharedJSBridgeProxy A00;
    public final /* synthetic */ C58883QEt A01;
    public final /* synthetic */ C61602RqR A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ List A04;

    public RunnableC64717TQy(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, C58883QEt c58883QEt, C61602RqR c61602RqR, Integer num, List list) {
        this.A01 = c58883QEt;
        this.A00 = autofillSharedJSBridgeProxy;
        this.A04 = list;
        this.A03 = num;
        this.A02 = c61602RqR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C58883QEt c58883QEt = this.A01;
        UserSession userSession = c58883QEt.A0a;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36310426615414849L);
        boolean z = c58883QEt.A0N;
        boolean z2 = c58883QEt.A0O;
        boolean A0H = c58883QEt.A0H();
        boolean A0J = c58883QEt.A0J();
        boolean A062 = C18U.A06(C06090Tz.A06, userSession, 36310426618626144L);
        Bundle A03 = c58883QEt.A03();
        QEB qeb = new QEB();
        Bundle bundle = new Bundle(AbstractC58321PtD.A0M(A03, A03));
        bundle.putBoolean("is_payment_enabled", z);
        bundle.putBoolean("is_reconsent_enabled", z2);
        bundle.putBoolean("is_consent_accepted", A0H);
        bundle.putBoolean("should_always_show_ads_disclosure", A06);
        bundle.putBoolean("should_show_fbpay_disclosure", A0J);
        bundle.putBoolean("disable_drag_and_bg_tap_to_dismiss", A062);
        qeb.setArguments(bundle);
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy = this.A00;
        List list = this.A04;
        C5G6 c5g6 = c58883QEt.A0Y;
        C62620SJd c62620SJd = c5g6.A00;
        String str = c62620SJd.A09.A01;
        if (str == null) {
            str = "";
        }
        String str2 = c62620SJd.A06.A06;
        if (str2 == null) {
            str2 = "";
        }
        SOY soy = c58883QEt.A0X;
        C43031yW c43031yW = c5g6.A04;
        qeb.A00 = autofillSharedJSBridgeProxy;
        qeb.A07 = list;
        qeb.A03 = c58883QEt;
        qeb.A05 = str;
        qeb.A06 = str2;
        qeb.A01 = soy;
        qeb.A04 = c43031yW;
        qeb.A02 = c5g6;
        C63021Sam c63021Sam = c5g6.A02;
        Integer num = this.A03;
        c63021Sam.A03(num, "prompt_name", "AutofillContactBottomSheetDialogFragment", 772805755);
        c58883QEt.A09(qeb, this.A02, num, C05F.A00, "AutofillContactBottomSheetDialogFragment");
        if (c58883QEt.A0J()) {
            c58883QEt.A06();
        }
    }
}
