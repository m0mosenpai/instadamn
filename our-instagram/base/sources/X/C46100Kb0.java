package X;

import android.content.Context;
import com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder;

/* renamed from: X.Kb0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46100Kb0 extends PJX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C46100Kb0(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.PJX, X.MRA
    public final void Czw(boolean z) {
        C47373KwO c47373KwO;
        switch (this.A00) {
            case 0:
                ImmersiveReplyControlMenuViewBinder.A02(C0eB.A00, (InterfaceC24901Jp) this.A01);
                return;
            case 1:
                c47373KwO = (C47373KwO) this.A02;
                if (c47373KwO == null) {
                    return;
                }
                c47373KwO.A00.A04.D01();
                return;
            default:
                c47373KwO = (C47373KwO) this.A02;
                c47373KwO.A00.A04.D01();
                return;
        }
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        switch (this.A00) {
            case 1:
            case 2:
                C9GR.A0E((Context) this.A01, "request_error");
                return;
            default:
                super.Dfe();
                return;
        }
    }
}
