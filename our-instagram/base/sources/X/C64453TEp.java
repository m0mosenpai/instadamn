package X;

import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;

/* renamed from: X.TEp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64453TEp implements InterfaceC65451TkN {
    public final /* synthetic */ T8J A00;

    public C64453TEp(T8J t8j) {
        this.A00 = t8j;
    }

    @Override // X.InterfaceC65451TkN
    public final void CyT(BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        T8J t8j = this.A00;
        InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall = (InstantExperiencesJSBridgeCall) t8j.A02;
        instantExperiencesJSBridgeCall.A02(new RequestAutofillJSBridgeCallResult(new C64904TZe(browserExtensionsAutofillData, this, 0)));
        instantExperiencesJSBridgeCall.A02(new RequestAutofillJSBridgeCallResult(new C64904TZe(browserExtensionsAutofillData, this, 1)));
        ((SZU) t8j.A01).A01(instantExperiencesJSBridgeCall);
    }
}
