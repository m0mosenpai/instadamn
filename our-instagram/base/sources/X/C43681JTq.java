package X;

import android.view.View;

/* renamed from: X.JTq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43681JTq extends AbstractRunnableC14200nk {
    public final /* synthetic */ C162307Os A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43681JTq(C162307Os c162307Os) {
        super(703, 3, false, false);
        this.A00 = c162307Os;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2EC c2ec;
        InterfaceC37159GYw interfaceC37159GYw;
        InterfaceC50428MOi interfaceC50428MOi;
        boolean z;
        String str;
        C162307Os c162307Os = this.A00;
        AbstractC46442Kh2 abstractC46442Kh2 = c162307Os.A02;
        if (abstractC46442Kh2 != null) {
            AbstractC46524KiP Csr = c162307Os.A0B.Csr();
            if (Csr != null) {
                if (abstractC46442Kh2 instanceof KR9) {
                    c2ec = ((KR9) abstractC46442Kh2).A00;
                    interfaceC37159GYw = c162307Os.A0A;
                    interfaceC50428MOi = c162307Os.A09;
                    z = c162307Os.A06;
                    str = c162307Os.A05;
                } else if (abstractC46442Kh2 instanceof KRA) {
                    c2ec = null;
                    interfaceC37159GYw = c162307Os.A0A;
                    interfaceC50428MOi = c162307Os.A09;
                    z = c162307Os.A06;
                    str = null;
                } else {
                    throw new RuntimeException();
                }
                Csr.A07(interfaceC50428MOi, interfaceC37159GYw, c2ec, str, z);
                return;
            }
            View view = c162307Os.A00;
            if (view == null) {
                return;
            }
            C11T.A02(new M44(view, c162307Os));
        }
    }
}
