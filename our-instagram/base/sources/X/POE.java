package X;

import com.facebook.common.dextricks.Constants;

/* loaded from: classes9.dex */
public final class POE implements Runnable {
    public final /* synthetic */ PCP A00;

    public POE(PCP pcp) {
        this.A00 = pcp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC09390do interfaceC09390do = this.A00.A0I;
        AbstractC166987dD.A0d(interfaceC09390do).requestFocus();
        AbstractC166987dD.A0d(interfaceC09390do).sendAccessibilityEvent(8);
        AbstractC166987dD.A0d(interfaceC09390do).sendAccessibilityEvent(Constants.LOAD_RESULT_PGO);
        AbstractC166987dD.A0d(interfaceC09390do).sendAccessibilityEvent(8);
    }
}
