package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138136Nr implements C59Z, InterfaceC138146Ns {
    public final C6N7 A00;
    public final C6O2 A01;
    public final C6NO A02;
    public final HashMap A03 = new HashMap();

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A02.Awk();
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A02.B7e();
    }

    @Override // X.InterfaceC1131259a
    public final boolean CXp() {
        return this.A02.CXp();
    }

    @Override // X.C59Z
    public final InterfaceC119205ac Cgx(Map map, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        return this.A02.Cgx(map, interfaceC16660sJ, i, i2);
    }

    @Override // X.InterfaceC1128957x
    public final int EL8(float f) {
        return this.A02.EL8(f);
    }

    @Override // X.InterfaceC1128957x
    public final float EqS(long j) {
        return this.A02.EqS(j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqT(float f) {
        return this.A02.EqT(f);
    }

    @Override // X.InterfaceC1131259a
    public final AnonymousClass583 getLayoutDirection() {
        return this.A02.getLayoutDirection();
    }

    @Override // X.InterfaceC138146Ns
    public final List CpC(int i, long j) {
        HashMap hashMap = this.A03;
        Integer valueOf = Integer.valueOf(i);
        List list = (List) hashMap.get(valueOf);
        List list2 = list;
        if (list == null) {
            C6O2 c6o2 = this.A01;
            Object BKc = c6o2.BKc(i);
            List Ep4 = this.A02.Ep4(BKc, this.A00.A01(BKc, c6o2.ArA(i), i));
            int size = Ep4.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((InterfaceC1131559d) Ep4.get(i2)).CpF(j));
            }
            hashMap.put(valueOf, arrayList);
            list2 = arrayList;
        }
        return list2;
    }

    @Override // X.C57y
    public final float EqG(long j) {
        return this.A02.EqG(j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqH(float f) {
        return this.A02.EqH(f);
    }

    @Override // X.InterfaceC1128957x
    public final float EqI(int i) {
        return this.A02.EqI(i);
    }

    @Override // X.InterfaceC1128957x
    public final long EqJ(long j) {
        return this.A02.EqJ(j);
    }

    @Override // X.InterfaceC1128957x
    public final long F7k(long j) {
        return this.A02.F7k(j);
    }

    @Override // X.C57y
    public final long F7l(float f) {
        return this.A02.F7l(f);
    }

    @Override // X.InterfaceC1128957x
    public final long F7m(float f) {
        return this.A02.F7m(f);
    }

    public C138136Nr(C6N7 c6n7, C6NO c6no) {
        this.A00 = c6n7;
        this.A02 = c6no;
        this.A01 = (C6O2) c6n7.A01.invoke();
    }
}
