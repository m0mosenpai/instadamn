package X;

import java.util.ArrayList;

/* renamed from: X.8hl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193658hl {
    public final ArrayList A00;
    public final ArrayList A01;
    public final C05A A02;
    public final C05A A03;
    public final C0UO A04;
    public final C0UO A05;

    public final void A01(EnumC191648eM enumC191648eM, C128175qm c128175qm) {
        C14360o3.A0B(enumC191648eM, 0);
        ArrayList arrayList = this.A01;
        if (arrayList.size() >= 20) {
            AnonymousClass016.A13(arrayList);
            this.A03.Egh(Integer.valueOf(((Number) r1.getValue()).intValue() - 1));
        }
        arrayList.add(new C09530e4(enumC191648eM, c128175qm));
        C05A c05a = this.A03;
        c05a.Egh(Integer.valueOf(((Number) c05a.getValue()).intValue() + 1));
    }

    public final void A00() {
        this.A01.clear();
        this.A03.Egh(0);
        this.A00.clear();
        this.A02.Egh(0);
    }

    public C193658hl() {
        ArrayList arrayList = new ArrayList(20);
        this.A01 = arrayList;
        C008002u A00 = C10E.A00(Integer.valueOf(arrayList.size()));
        this.A03 = A00;
        this.A05 = AbstractC208910l.A02(A00);
        ArrayList arrayList2 = new ArrayList(20);
        this.A00 = arrayList2;
        C008002u A002 = C10E.A00(Integer.valueOf(arrayList2.size()));
        this.A02 = A002;
        this.A04 = AbstractC208910l.A02(A002);
    }
}
