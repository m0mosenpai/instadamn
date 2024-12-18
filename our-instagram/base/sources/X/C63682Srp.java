package X;

import java.util.List;

/* renamed from: X.Srp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63682Srp implements InterfaceC65535Tm7 {
    public final List A00;

    @Override // X.InterfaceC65535Tm7
    public final AbstractC63308ShE ALc() {
        List list = this.A00;
        if (((C63366SiP) AbstractC166987dD.A16(list)).A03()) {
            return new QAd(list);
        }
        return new QAc(list);
    }

    @Override // X.InterfaceC65535Tm7
    public final List BKm() {
        return this.A00;
    }

    @Override // X.InterfaceC65535Tm7
    public final boolean Cde() {
        List list = this.A00;
        if (list.size() != 1 || !((C63366SiP) list.get(0)).A03()) {
            return false;
        }
        return true;
    }

    public C63682Srp(List list) {
        this.A00 = list;
    }
}
