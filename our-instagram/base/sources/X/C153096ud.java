package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.6ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153096ud extends C1I2 {
    public final C3A9 A00;
    public final Fragment A01;
    public final InterfaceC152956uP A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C153096ud(Fragment fragment, final InterfaceC153086uc interfaceC153086uc, final InterfaceC152956uP interfaceC152956uP, final java.util.Set set) {
        this.A01 = fragment;
        this.A02 = interfaceC152956uP;
        this.A00 = new C3A9(interfaceC152956uP, (InterfaceC60682pr) fragment, new C3CI(interfaceC153086uc, interfaceC152956uP, set) { // from class: X.6ue
            public final InterfaceC153086uc A00;
            public final java.util.Set A01;
            public final InterfaceC152956uP A02;

            @Override // X.C36Z
            public final Class CAO() {
                return C153126ug.class;
            }

            @Override // X.C3CI, X.C36Z
            public final /* bridge */ /* synthetic */ void CtJ(Object obj, int i) {
                C153126ug c153126ug = (C153126ug) obj;
                for (int i2 = 0; i2 < c153126ug.A01(); i2++) {
                    Object A02 = c153126ug.A02(i2);
                    if (A02 instanceof C38321qM) {
                        C38321qM c38321qM = (C38321qM) A02;
                        String id = c38321qM.getId();
                        java.util.Set set2 = this.A01;
                        if (!set2.contains(id)) {
                            set2.add(id);
                            this.A00.DNW(c38321qM, i, i2);
                        }
                    }
                }
            }

            @Override // X.C36Z
            public final void FDm(C3AB c3ab, int i) {
                InterfaceC152956uP interfaceC152956uP2 = this.A02;
                Object item = interfaceC152956uP2.getItem(i);
                item.getClass();
                c3ab.FDo(String.valueOf(item.hashCode()), item, interfaceC152956uP2.BQs(String.valueOf(item.hashCode())).A00);
            }

            {
                this.A02 = interfaceC152956uP;
                this.A00 = interfaceC153086uc;
                this.A01 = set;
            }
        }, new C3CI(interfaceC153086uc, interfaceC152956uP, set) { // from class: X.6uf
            public final int A00 = 3;
            public final InterfaceC153086uc A01;
            public final java.util.Set A02;
            public final InterfaceC152956uP A03;

            {
                this.A03 = interfaceC152956uP;
                this.A01 = interfaceC153086uc;
                this.A02 = set;
            }

            @Override // X.C36Z
            public final Class CAO() {
                return C38321qM.class;
            }

            @Override // X.C3CI, X.C36Z
            public final /* bridge */ /* synthetic */ void CtJ(Object obj, int i) {
                C38321qM c38321qM = (C38321qM) obj;
                String id = c38321qM.getId();
                java.util.Set set2 = this.A02;
                if (!set2.contains(id)) {
                    set2.add(id);
                    this.A01.DNW(c38321qM, i, i % this.A00);
                }
            }

            @Override // X.C36Z
            public final void FDm(C3AB c3ab, int i) {
                Object item = this.A03.getItem(i);
                item.getClass();
                c3ab.FDo(((C38321qM) item).getId(), item, i);
            }
        });
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A03 = C0f9.A03(-1547958063);
        if (!this.A01.isResumed()) {
            i6 = 1308880662;
        } else {
            this.A00.A01();
            i6 = -816583881;
        }
        C0f9.A0A(i6, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(-1257678141, C0f9.A03(-1154911985));
    }
}
