package X;

/* renamed from: X.Ahu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23901Ahu implements InterfaceC190408by {
    public final /* synthetic */ C23629AdO A00;

    @Override // X.InterfaceC190408by
    public final boolean CRN() {
        return false;
    }

    @Override // X.InterfaceC190408by
    public final boolean CUe() {
        return false;
    }

    @Override // X.InterfaceC190408by
    public final boolean Cdo() {
        return false;
    }

    public C23901Ahu(C23629AdO c23629AdO) {
        this.A00 = c23629AdO;
    }

    @Override // X.InterfaceC190408by
    public final int C6N() {
        String str = this.A00.A0H;
        if (str != null) {
            return str.length();
        }
        return 0;
    }

    @Override // X.InterfaceC190408by
    public final void Dsd(C190888ck c190888ck, Integer num) {
        if (num == C05F.A01) {
            C23629AdO c23629AdO = this.A00;
            c23629AdO.A0F = c190888ck;
            C23629AdO.A02(c23629AdO);
        }
    }
}
