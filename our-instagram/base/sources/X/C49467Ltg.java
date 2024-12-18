package X;

/* renamed from: X.Ltg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49467Ltg implements C74M {
    public final int A00;
    public final Object A01;

    public C49467Ltg(int i, InterfaceC23621Ds interfaceC23621Ds) {
        this.A00 = i;
        this.A01 = interfaceC23621Ds;
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        if (this.A00 != 0) {
            C14360o3.A0B(str2, 2);
            ((InterfaceC23621Ds) this.A01).resumeWith(str2);
        } else {
            ((InterfaceC23621Ds) this.A01).resumeWith(C0eB.A00);
        }
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }

    @Override // X.C74M
    public final void onError(String str) {
        C09540e5 c09540e5;
        int i = this.A00;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
        if (i != 0) {
            c09540e5 = null;
        } else {
            C50101M9p c50101M9p = new C50101M9p();
            C14360o3.A0B(c50101M9p, 0);
            c09540e5 = new C09540e5(c50101M9p);
        }
        interfaceC23621Ds.resumeWith(c09540e5);
    }

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
    }

    @Override // X.C74M
    public final /* synthetic */ void DQ4(XEC xec, String str, String str2, String str3) {
    }
}
