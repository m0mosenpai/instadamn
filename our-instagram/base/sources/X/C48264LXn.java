package X;

/* renamed from: X.LXn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48264LXn implements InterfaceC24551Hy {
    public final int A00;
    public final Object A01;

    public C48264LXn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC24551Hy
    public final void D6Z(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        Object value;
        if (this.A00 == 0) {
            AbstractC167007dF.A1K(interfaceC26451Qa, c3jx);
            C05A c05a = ((KZX) this.A01).A07;
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, C45118Jxn.A00(null, (C45118Jxn) value, null, C05F.A0C, null, 1023, false, false, false, false)));
        }
    }

    @Override // X.InterfaceC24551Hy
    public final void DFq(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
        String str;
        if (this.A00 == 0) {
            C14360o3.A0B(abstractC115105If, 1);
            KZX kzx = (KZX) this.A01;
            C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
            if (c40781ul != null) {
                str = c40781ul.getErrorMessage();
            } else {
                str = null;
            }
            KZX.A02(kzx, str);
        }
    }

    @Override // X.InterfaceC24551Hy
    public final /* bridge */ /* synthetic */ void DVQ(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
        if (this.A00 == 0) {
            K86 k86 = (K86) interfaceC40801un;
            C14360o3.A0B(k86, 2);
            KZX kzx = (KZX) this.A01;
            C45074Jx3 c45074Jx3 = k86.A02;
            if (c45074Jx3 == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            C1DS.A00(kzx.A02);
            KZX.A01(c45074Jx3, kzx, true, false, true);
        }
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVR() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void Dg4() {
        if (this.A00 != 0) {
            ((InterfaceC1116050z) this.A01).AVi(AbstractC111324zv.A00(2367));
        }
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DgK() {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DVS(InterfaceC40801un interfaceC40801un, InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void DFs(AbstractC115105If abstractC115105If, InterfaceC26451Qa interfaceC26451Qa) {
    }

    @Override // X.InterfaceC24551Hy
    public final /* synthetic */ void Dgo(InterfaceC26451Qa interfaceC26451Qa, C3JX c3jx) {
    }
}
