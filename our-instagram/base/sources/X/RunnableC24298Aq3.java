package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.Aq3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24298Aq3 implements Runnable {
    public final /* synthetic */ InterfaceC59502nt A00;

    public RunnableC24298Aq3(InterfaceC59502nt interfaceC59502nt) {
        this.A00 = interfaceC59502nt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object C4x = this.A00.C4x();
        if (C4x != null) {
            C209509Ok c209509Ok = (C209509Ok) C4x;
            InterfaceC193488hT interfaceC193488hT = (InterfaceC193488hT) c209509Ok.A01.get();
            Medium medium = c209509Ok.A00;
            if (interfaceC193488hT != null && interfaceC193488hT.CXZ(medium)) {
                interfaceC193488hT.DN1(medium, null);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
