package X;

import com.instagram.user.model.User;

/* renamed from: X.Cxo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29417Cxo implements InterfaceC37213GaO {
    public final /* synthetic */ C167297di A00;
    public final /* synthetic */ C166007bS A01;
    public final /* synthetic */ C28355CfF A02;
    public final /* synthetic */ InterfaceC16620sF A03;

    @Override // X.InterfaceC37213GaO
    public final void DqX() {
    }

    @Override // X.InterfaceC37213GaO
    public final void DqY() {
    }

    public C29417Cxo(C167297di c167297di, C166007bS c166007bS, C28355CfF c28355CfF, InterfaceC16620sF interfaceC16620sF) {
        this.A01 = c166007bS;
        this.A02 = c28355CfF;
        this.A00 = c167297di;
        this.A03 = interfaceC16620sF;
    }

    @Override // X.InterfaceC37213GaO
    public final void Dgt() {
        C28238Cci.A00.A00(this.A01.A02);
    }

    @Override // X.InterfaceC37213GaO
    public final void Dgu() {
        C28238Cci.A00.A01(this.A01.A02);
    }

    @Override // X.InterfaceC37213GaO
    public final void DqW() {
        C166007bS c166007bS = this.A01;
        String str = this.A02.A00.A0F;
        C167297di c167297di = this.A00;
        User user = c167297di.A0C;
        String str2 = c167297di.A0K;
        String str3 = c167297di.A0N;
        C14360o3.A0B(str, 0);
        C75R.A00.A0G(c166007bS.A01, user, "optimistic_restrict_delete_comment_button", str2, str3, str, null);
        this.A03.invoke(str2, str3);
    }
}
