package X;

import java.io.File;

/* renamed from: X.9h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215859h1 extends C2AH {
    public final int A00;
    public final Object A01;

    public C215859h1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        int i = this.A00;
        C14360o3.A0B(exc, 0);
        if (i != 0) {
            C1828989k c1828989k = ((Ah1) this.A01).A09.A08;
            c1828989k.A06.A0B(EnumC1829089l.A03);
            return;
        }
        ((InterfaceC23621Ds) this.A01).resumeWith(new C09540e5(exc));
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A00 != 0) {
            File A0Z = AbstractC166997dE.A0Z(obj);
            Ah1 ah1 = (Ah1) this.A01;
            C1828989k c1828989k = ah1.A09.A08;
            C1816283r c1816283r = c1828989k.A00;
            if (c1816283r != null && c1816283r.A04.A5x()) {
                c1828989k.A02(ah1.A03, ah1.A07, A0Z);
                return;
            } else {
                c1828989k.A01 = A0Z;
                c1828989k.A06.A0B(EnumC1829089l.A04);
                return;
            }
        }
        C195868lW c195868lW = (C195868lW) obj;
        C14360o3.A0B(c195868lW, 0);
        try {
            InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
            int i = c195868lW.A07;
            interfaceC23621Ds.resumeWith(new C115475Kh(null, null, new C115545Ko(null, null, null, 1.0f, -1, false), AbstractC23036ADs.A00(c195868lW, 4, i, i), null, null, null, null, null, 0.0f, 0, 0, 0, 0, 0, 0, 2147483644, false, false, false, false));
        } catch (IllegalArgumentException e) {
            ((InterfaceC23621Ds) this.A01).resumeWith(new C09540e5(e));
        }
    }
}
