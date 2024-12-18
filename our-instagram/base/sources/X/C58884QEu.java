package X;

import android.os.Bundle;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.iabeventlogging.model.IABHistoryEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.QEu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58884QEu extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2, InterfaceC65638Tq1, InterfaceC65637Tq0 {
    public C62914SWv A00;
    public C63305ShB A01 = C63305ShB.A00();
    public final C03250Di A02;

    public static final void A00(C58884QEu c58884QEu) {
        C23016ACq c23016ACq;
        C62914SWv c62914SWv = c58884QEu.A00;
        if (c62914SWv != null) {
            String[] strArr = (String[]) c62914SWv.A04.toArray(new String[0]);
            InterfaceC172717mh interfaceC172717mh = c58884QEu.A03;
            if (interfaceC172717mh != null && (c23016ACq = ((BrowserLiteFragment) interfaceC172717mh).A0e) != null) {
                Long l = c62914SWv.A02;
                Long l2 = c62914SWv.A01;
                Long l3 = c62914SWv.A00;
                boolean z = c62914SWv.A03;
                long now = c23016ACq.A0m.now();
                IABHistoryEvent iABHistoryEvent = new IABHistoryEvent(l, l2, l3, c23016ACq.A0Z, strArr, now, now, z);
                if (!c62914SWv.A04.isEmpty()) {
                    BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) interfaceC172717mh;
                    Bundle bundle = browserLiteFragment.A09;
                    ZonePolicy zonePolicy = browserLiteFragment.A0f;
                    if (zonePolicy == null) {
                        zonePolicy = ZonePolicy.A05;
                    }
                    interfaceC172717mh.Ckl(bundle, iABHistoryEvent, zonePolicy);
                }
            }
            c58884QEu.A00 = null;
        }
    }

    public C58884QEu() {
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        this.A02 = c03250Di;
    }

    @Override // X.AbstractC63223SfY, X.BCM
    public final void destroy() {
        A00(this);
        super.destroy();
    }
}
