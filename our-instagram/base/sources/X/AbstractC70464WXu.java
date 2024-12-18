package X;

/* renamed from: X.WXu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70464WXu implements InterfaceC58180Pqk {
    public final InterfaceC72008XEw A00;
    public final long A01;

    @Override // X.InterfaceC58180Pqk
    public final void CnT(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A00.CnT(str, str2);
    }

    @Override // X.InterfaceC58180Pqk
    public final void AGG(String str) {
        this.A00.Ch8(str);
    }

    @Override // X.InterfaceC58180Pqk
    public final void AR7() {
        this.A00.CnY();
    }

    @Override // X.InterfaceC58180Pqk
    public final void AUk(String str) {
        this.A00.AUk(str);
    }

    @Override // X.InterfaceC58180Pqk
    public final long CA4() {
        return this.A01;
    }

    @Override // X.InterfaceC58180Pqk
    public final void CnR(String str, int i) {
        this.A00.CnR(MSV.A00(899), i);
    }

    @Override // X.InterfaceC58180Pqk
    public final void CnU(String str, boolean z) {
        this.A00.CnU(str, z);
    }

    public AbstractC70464WXu(InterfaceC72008XEw interfaceC72008XEw) {
        this.A00 = interfaceC72008XEw;
        this.A01 = interfaceC72008XEw.CBF();
    }
}
