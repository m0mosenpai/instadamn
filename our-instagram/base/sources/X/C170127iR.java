package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7iR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170127iR implements InterfaceC65452xh {
    public final int A00;
    public final C170077iM A01;
    public final C170087iN A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    @Override // X.InterfaceC65452xh
    public final void DTy(int i, int i2) {
        ArrayList arrayList = new ArrayList(1);
        List list = this.A06;
        list.add(i2, list.remove(i));
        List list2 = this.A03;
        Object remove = list2.remove(i);
        arrayList.add(remove);
        list2.add(i2, remove);
        this.A05.add(new C170147iT(null, arrayList, 3, i, i2));
    }

    @Override // X.InterfaceC65452xh
    public final void D2j(int i, int i2, Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            C170137iS c170137iS = (C170137iS) this.A06.get(i4);
            c170137iS.A01 = true;
            arrayList.add(c170137iS);
            arrayList2.add(this.A03.get(i4));
        }
        this.A05.add(new C170147iT(arrayList, arrayList2, 1, i, -1));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.7iS, java.lang.Object] */
    @Override // X.InterfaceC65452xh
    public final void DMJ(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            ?? obj = new Object();
            obj.A00 = null;
            obj.A01 = true;
            this.A06.add(i4, obj);
            arrayList.add(obj);
            C51022Vy c51022Vy = new C51022Vy(null, null);
            this.A03.add(i4, c51022Vy);
            arrayList2.add(c51022Vy);
        }
        this.A05.add(new C170147iT(arrayList, arrayList2, 0, i, -1));
    }

    @Override // X.InterfaceC65452xh
    public final void DfC(int i, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.A06.remove(i);
            arrayList.add(this.A03.remove(i));
        }
        this.A05.add(new C170147iT(null, arrayList, 2, i, i2));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.7iS, java.lang.Object] */
    public C170127iR(C170077iM c170077iM, C170087iN c170087iN, List list, List list2) {
        int i;
        this.A07 = list;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A04 = list2;
        this.A01 = c170077iM;
        this.A02 = c170087iN;
        this.A05 = new ArrayList();
        this.A06 = new ArrayList();
        this.A03 = new ArrayList();
        for (int i2 = 0; i2 < this.A00; i2++) {
            List list3 = this.A06;
            ?? obj = new Object();
            obj.A00 = null;
            obj.A01 = false;
            list3.add(obj);
            this.A03.add(new C51022Vy(this.A07.get(i2), null));
        }
    }
}
