package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;

/* renamed from: X.TEl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64449TEl implements InterfaceC65450TkM {
    public final /* synthetic */ C60889Rax A00;

    @Override // X.InterfaceC65450TkM
    public final void CyI(String str, boolean z) {
        C27431Uw A00 = C27431Uw.A02.A00();
        C60889Rax c60889Rax = this.A00;
        C64489TFz A002 = A00.A00(AbstractC166987dD.A0n(c60889Rax.A05));
        Q21 A04 = C64489TFz.A00(A002.A01, A002).A04();
        if (A04 != null) {
            WritableNativeMap A0c = AbstractC58321PtD.A0c();
            if (!AbstractC167007dF.A1N(str.length()) && !z) {
                A0c.putBoolean("success", true);
                A0c.putString("returnUrl", str);
            } else {
                A0c.putBoolean("success", false);
            }
            ((RCTNativeAppEventEmitter) A04.A03(RCTNativeAppEventEmitter.class)).emit("trustly_authentication_close_event", A0c);
            C64486TFw c64486TFw = c60889Rax.A00;
            if (c64486TFw == null) {
                C14360o3.A0F("callbackManager");
                throw C00O.createAndThrow();
            }
            c64486TFw.A00 = null;
        }
    }

    public C64449TEl(C60889Rax c60889Rax) {
        this.A00 = c60889Rax;
    }
}
