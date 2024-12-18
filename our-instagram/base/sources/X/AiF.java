package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class AiF implements InterfaceC25190BCn {
    public final C23031Ai A00;
    public final AiE A01;
    public final Map A02;

    public AiF(C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 1);
        this.A00 = c23031Ai;
        this.A02 = AbstractC06930Yk.A0E();
        this.A01 = new AiE(this);
    }

    @Override // X.InterfaceC25190BCn
    public final int AyT(String str) {
        InterfaceC25190BCn interfaceC25190BCn = (InterfaceC25190BCn) this.A02.get(str);
        if (interfaceC25190BCn == null) {
            interfaceC25190BCn = this.A01;
        }
        return interfaceC25190BCn.AyT(str);
    }

    @Override // X.InterfaceC25190BCn
    public final void ELd(String str, int i) {
        InterfaceC25190BCn interfaceC25190BCn = (InterfaceC25190BCn) this.A02.get(str);
        if (interfaceC25190BCn == null) {
            interfaceC25190BCn = this.A01;
        }
        interfaceC25190BCn.ELd(str, i);
    }
}
