package X;

import com.facebook.common.dextricks.JITProfilePQR;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public final class YCK implements InterfaceC179187xU {
    public final WeakReference A00;

    @Override // X.InterfaceC179187xU, X.InterfaceC179117xN
    public final void E6H(InterfaceC179247xa interfaceC179247xa) {
        Y2I y2i = (Y2I) this.A00.get();
        if (y2i != null && interfaceC179247xa.CBM() == EnumC179217xX.A09) {
            y2i.A0A = ((Ab9) interfaceC179247xa).A00;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0045. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.7oL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.7oK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.7vF] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, X.7oN] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.7oM, java.lang.Object] */
    @Override // X.InterfaceC179187xU
    public final void EDH(InterfaceC179577y7 interfaceC179577y7, EnumC179217xX enumC179217xX) {
        InterfaceC179247xa interfaceC179247xa;
        Y2I y2i = (Y2I) this.A00.get();
        if (y2i != null) {
            C0J8.A08(AbstractC167007dF.A1W(interfaceC179577y7), "Null listener registered");
            Y1e y1e = y2i.A0K;
            Map map = y1e.A00;
            synchronized (map) {
                C1814082s c1814082s = (C1814082s) map.get(enumC179217xX);
                if (c1814082s == null) {
                    c1814082s = new C1814082s();
                    map.put(enumC179217xX, c1814082s);
                }
                if (Y1e.A00(y1e, interfaceC179577y7, enumC179217xX) == null) {
                    c1814082s.A01(AbstractC25225BEi.A16(interfaceC179577y7));
                }
            }
            Y2I.A00(y2i);
            InterfaceC199678sJ interfaceC199678sJ = y2i.A03;
            if (interfaceC199678sJ == null) {
                return;
            }
            switch (enumC179217xX.ordinal()) {
                case 5:
                    int Bfz = interfaceC199678sJ.Bfz();
                    int Bfo = interfaceC199678sJ.Bfo();
                    ?? obj = new Object();
                    obj.A01 = Bfz;
                    obj.A00 = Bfo;
                    interfaceC179247xa = obj;
                    y1e.A01(y2i.A0J, interfaceC179247xa);
                    return;
                case 6:
                    YOk yOk = y2i.A04;
                    if (yOk == null) {
                        Integer num = C05F.A01;
                        ?? obj2 = new Object();
                        obj2.A00 = num;
                        interfaceC179247xa = obj2;
                    } else {
                        interfaceC179247xa = yOk.BHz();
                    }
                    y1e.A01(y2i.A0J, interfaceC179247xa);
                    return;
                case 7:
                    YOk yOk2 = y2i.A04;
                    if (yOk2 == null) {
                        ?? obj3 = new Object();
                        obj3.A00 = 0;
                        obj3.A01 = 0;
                        interfaceC179247xa = obj3;
                    } else {
                        interfaceC179247xa = yOk2.BI4();
                    }
                    y1e.A01(y2i.A0J, interfaceC179247xa);
                    return;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    Integer num2 = y2i.A08;
                    if (num2 == null) {
                        return;
                    }
                    ?? obj4 = new Object();
                    obj4.A00 = num2;
                    interfaceC179247xa = obj4;
                    y1e.A01(y2i.A0J, interfaceC179247xa);
                    return;
                case 14:
                    YPH yph = y2i.A00;
                    if (yph == null) {
                        return;
                    }
                    int width = yph.getWidth();
                    int height = y2i.A00.getHeight();
                    float Awk = y2i.A00.Awk();
                    ?? obj5 = new Object();
                    obj5.A02 = width;
                    obj5.A01 = height;
                    obj5.A00 = Awk;
                    interfaceC179247xa = obj5;
                    y1e.A01(y2i.A0J, interfaceC179247xa);
                    return;
                case 22:
                    interfaceC179247xa = new C203818zp(y2i.A05);
                    y1e.A01(y2i.A0J, interfaceC179247xa);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // X.InterfaceC179187xU
    public final void F9X(InterfaceC179577y7 interfaceC179577y7) {
        Y2I y2i = (Y2I) this.A00.get();
        if (y2i != null) {
            Y1e y1e = y2i.A0K;
            Map map = y1e.A00;
            synchronized (map) {
                Iterator A12 = AbstractC43593JPy.A12(map);
                while (A12.hasNext()) {
                    y1e.A02(interfaceC179577y7, (EnumC179217xX) A12.next());
                }
            }
            Y2I.A00(y2i);
        }
    }

    @Override // X.InterfaceC179187xU
    public final void F9Y(InterfaceC179577y7 interfaceC179577y7, EnumC179217xX enumC179217xX) {
        Y2I y2i = (Y2I) this.A00.get();
        if (y2i != null) {
            C0J8.A08(AbstractC167007dF.A1W(interfaceC179577y7), "Null listener unregistered");
            y2i.A0K.A02(interfaceC179577y7, enumC179217xX);
            Y2I.A00(y2i);
        }
    }

    public YCK(Y2I y2i) {
        this.A00 = AbstractC25225BEi.A16(y2i);
    }
}
