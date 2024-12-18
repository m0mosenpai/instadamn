package X;

import java.util.List;

/* renamed from: X.Ler, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48615Ler implements InterfaceC50447MPb {
    public final /* synthetic */ C8HF A00;

    public C48615Ler(C8HF c8hf) {
        this.A00 = c8hf;
    }

    @Override // X.InterfaceC50447MPb
    public final void DqF(List list) {
        C8HF c8hf = this.A00;
        Object A0J = AbstractC001800i.A0J(list);
        if (A0J != null) {
            c8hf.Dq8((C183978Ee) A0J);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC50447MPb
    public final void onFailure(Exception exc) {
        this.A00.onFailure(exc);
    }
}
