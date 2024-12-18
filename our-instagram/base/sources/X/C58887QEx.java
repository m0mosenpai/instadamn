package X;

import android.content.Intent;
import com.facebook.iabadscontext.IABAdsContext;
import com.instagram.common.session.UserSession;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.QEx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58887QEx extends AbstractC63223SfY implements Thread.UncaughtExceptionHandler, BEG, InterfaceC65639Tq2, InterfaceC65638Tq1 {
    public static final List A0C = AbstractC16960so.A1Q("facebookpay", "fbpay", "ecp", "expresscheckout", "offsite");
    public SNG A00;
    public SPI A01;
    public UserSession A02;
    public R8Y A03;
    public String A04;
    public String A05;
    public Thread.UncaughtExceptionHandler A06;
    public InterfaceC09390do A08;
    public AnonymousClass195 A09;
    public final IABAdsContext A0B;
    public final InterfaceC58362lv A0A = C63628Sqa.A00(this, 17);
    public ArrayList A07 = AbstractC166987dD.A1E();

    @Override // X.AbstractC63223SfY, X.BCM
    public final void destroy() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A06;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            this.A06 = null;
        }
        super.destroy();
    }

    public C58887QEx(IABAdsContext iABAdsContext, UserSession userSession) {
        this.A0B = iABAdsContext;
        this.A02 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (r1 == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C58887QEx r9) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58887QEx.A00(X.QEx):void");
    }

    public static final void A01(C58887QEx c58887QEx, Throwable th) {
        Intent intent;
        String A02;
        String str;
        String A00 = C2Ql.A00(th);
        C0K8.A0G("BaseOffsiteFbPaySDKController", A00, th);
        InterfaceC172717mh interfaceC172717mh = ((AbstractC63223SfY) c58887QEx).A03;
        if (interfaceC172717mh != null && (intent = interfaceC172717mh.getIntent()) != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_LOGGING_ENABLED", true)) {
            List list = A0C;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC001900j.A0a(A00, AbstractC166987dD.A1B(it), true)) {
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                    Locale locale = Locale.ROOT;
                    C14360o3.A08(locale);
                    A1I2.put(AbstractC31172DnG.A16(locale, "ERROR_MESSAGE"), A00);
                    A1I.put("EVENT_EXTRA", A1I2);
                    if (c58887QEx.A08 == null || (A02 = AbstractC63223SfY.A03(c58887QEx).A09) == null) {
                        A02 = AbstractC58442PvL.A02();
                    }
                    if (c58887QEx.A08 != null && AbstractC63223SfY.A03(c58887QEx).A03 != null) {
                        str = AbstractC63223SfY.A03(c58887QEx).A0A().getProductId();
                    } else {
                        str = "-1";
                    }
                    A1I.put("logging_context", C70189WFs.A00(A02, str));
                    if (c58887QEx.A08 != null) {
                        AbstractC63223SfY.A03(c58887QEx).A0L(A1I);
                    }
                    C70189WFs.A03(VDH.A0K, A1I);
                    return;
                }
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        AbstractC167017dG.A1N(thread, th);
        A01(this, th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A06;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
