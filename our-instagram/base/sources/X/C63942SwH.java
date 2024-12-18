package X;

import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import java.lang.ref.WeakReference;

/* renamed from: X.SwH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63942SwH implements InterfaceC65482Tkz {
    public final Bundle A00;
    public final C63305ShB A01;
    public final WeakReference A02;

    @Override // X.InterfaceC65482Tkz
    public final void CyS(AutofillData autofillData, boolean z) {
        C58883QEt A0K = AbstractC58318PtA.A0K(this.A02);
        if (A0K != null) {
            if (A0K.A03 != null) {
                A0K.A03.A0B(BusinessExtensionJSBridgeCall.A00(A0K.A0Y.A00.A08.A01, autofillData.A01()));
            }
            A0K.A0C(autofillData);
        }
        this.A01.A07(this.A00, S6J.A00.A00("ACCEPTED_AUTOFILL", "CONTACT_AUTOFILL", z));
    }

    @Override // X.InterfaceC65482Tkz
    public final void onDecline() {
        C58883QEt A0K = AbstractC58318PtA.A0K(this.A02);
        if (A0K != null) {
            A0K.A0C(null);
        }
    }

    public C63942SwH(Bundle bundle, C63305ShB c63305ShB, C58883QEt c58883QEt) {
        this.A00 = bundle;
        this.A01 = c63305ShB;
        this.A02 = AbstractC25225BEi.A16(c58883QEt);
    }
}
