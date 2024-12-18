package X;

import android.os.Bundle;
import com.facebookpay.msc.logging.LoggingData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uwf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67714Uwf extends UFZ implements X9h {
    public C2GT A00;
    public AbstractC67710Uwb A01;
    public LoggingData A02;
    public String A03;
    public List A04;
    public final C2GS A05;
    public final C152406tQ A06;

    public C67714Uwf(C152406tQ c152406tQ) {
        C14360o3.A0B(c152406tQ, 1);
        this.A06 = c152406tQ;
        this.A05 = new C2GS();
        c152406tQ.A04.put("fe_selector_financial_entity", new WT4(this, 0));
    }

    @Override // X.X9h
    public final void CNv(AbstractC67710Uwb abstractC67710Uwb) {
        this.A01 = abstractC67710Uwb;
        C2FP.A02().A08();
        this.A00 = C75M.A01(this.A05, new DHP(3, this, false));
    }

    @Override // X.UFZ
    public final void A09(Bundle bundle) {
        LoggingData loggingData;
        super.A09(bundle);
        ArrayList A03 = C63368SiU.A03(bundle);
        if (A03 != null) {
            this.A04 = A03;
            Bundle bundle2 = (Bundle) this.A06.A00("fe_selector_financial_entity");
            if (bundle2 == null) {
                bundle2 = bundle;
            }
            C2GS c2gs = this.A05;
            Object A01 = C63368SiU.A01(bundle2, "financial_entity");
            if (A01 != null) {
                c2gs.A0B(A01);
                if (bundle != null && (loggingData = (LoggingData) bundle.getParcelable("logging_data")) != null) {
                    this.A02 = loggingData;
                    String string = bundle.getString("parent_view_name");
                    if (string != null) {
                        this.A03 = string;
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
