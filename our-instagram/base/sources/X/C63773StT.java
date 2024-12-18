package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.StT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63773StT implements InterfaceC65570Tn3, InterfaceC65471Tko {
    public int A00;
    public EnumC61107RfN A01;
    public InterfaceC65471Tko A02;
    public List A03;
    public boolean A04;
    public final C02Q A05;
    public final List A06;

    @Override // X.InterfaceC65570Tn3
    public final void cancel() {
        this.A04 = true;
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((InterfaceC65570Tn3) it.next()).cancel();
        }
    }

    private void A00() {
        if (!this.A04) {
            if (this.A00 < AbstractC25226BEj.A05(this.A06)) {
                this.A00++;
                ChQ(this.A01, this.A02);
            } else {
                List list = this.A03;
                Rs8.A00(list);
                this.A02.DPj(new RkJ("Fetch failed", AbstractC166987dD.A1F(list)));
            }
        }
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return ((InterfaceC65570Tn3) AbstractC166987dD.A16(this.A06)).Avg();
    }

    @Override // X.InterfaceC65570Tn3
    public final Integer Avo() {
        return ((InterfaceC65570Tn3) AbstractC166987dD.A16(this.A06)).Avo();
    }

    @Override // X.InterfaceC65570Tn3
    public final void ChQ(EnumC61107RfN enumC61107RfN, InterfaceC65471Tko interfaceC65471Tko) {
        this.A01 = enumC61107RfN;
        this.A02 = interfaceC65471Tko;
        this.A03 = (List) this.A05.A7H();
        ((InterfaceC65570Tn3) this.A06.get(this.A00)).ChQ(enumC61107RfN, this);
        if (this.A04) {
            cancel();
        }
    }

    @Override // X.InterfaceC65471Tko
    public final void D9H(Object obj) {
        if (obj != null) {
            this.A02.D9H(obj);
        } else {
            A00();
        }
    }

    @Override // X.InterfaceC65471Tko
    public final void DPj(Exception exc) {
        List list = this.A03;
        Rs8.A00(list);
        list.add(exc);
        A00();
    }

    @Override // X.InterfaceC65570Tn3
    public final void cleanup() {
        List list = this.A03;
        if (list != null) {
            this.A05.EE6(list);
        }
        this.A03 = null;
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((InterfaceC65570Tn3) it.next()).cleanup();
        }
    }

    public C63773StT(C02Q c02q, List list) {
        this.A05 = c02q;
        if (!list.isEmpty()) {
            this.A06 = list;
            this.A00 = 0;
            return;
        }
        throw AbstractC166987dD.A12("Must not be empty.");
    }
}
