package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.2lZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58172lZ extends AbstractC58182la {
    public final C54392et A00;
    public final C54412ev A01;
    public final EnumC58162lY A02;
    public final boolean A03;

    public C58172lZ(C54392et c54392et, C54412ev c54412ev, EnumC58122lU enumC58122lU, EnumC58122lU enumC58122lU2, EnumC58122lU enumC58122lU3, EnumC58122lU enumC58122lU4, EnumC58162lY enumC58162lY, InterfaceC54232eZ interfaceC54232eZ, C54602fI c54602fI, C54672fP c54672fP, InterfaceC16820sZ interfaceC16820sZ, C19L c19l, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(enumC58122lU, enumC58122lU2, enumC58122lU3, enumC58122lU4, interfaceC54232eZ, c54672fP, interfaceC16820sZ, c19l, c54602fI.A00(interfaceC54232eZ), i, i2, z, z2, z4);
        this.A03 = z3;
        this.A02 = enumC58162lY;
        this.A00 = c54392et;
        this.A01 = c54412ev;
    }

    public static final LinkedHashMap A00(C54432ex c54432ex) {
        List list = c54432ex.A04;
        if (list != null) {
            ArrayList<C54432ex> arrayList = new ArrayList();
            for (Object obj : list) {
                C54432ex c54432ex2 = (C54432ex) obj;
                if (c54432ex2.A01 + c54432ex2.A00 > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            for (C54432ex c54432ex3 : arrayList) {
                arrayList2.add(new C09530e4(c54432ex3.A03.toString(), String.valueOf(c54432ex3.A01 + c54432ex3.A00)));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC06930Yk.A0F(arrayList2, linkedHashMap);
            return linkedHashMap;
        }
        return null;
    }

    @Override // X.AbstractC58182la
    public final void A03() {
        C54432ex c54432ex = super.A01;
        if (c54432ex != null) {
            C54392et c54392et = this.A00;
            EnumC58162lY enumC58162lY = this.A02;
            EnumC58122lU enumC58122lU = EnumC58122lU.A03;
            c54392et.A02(enumC58122lU, enumC58162lY, c54432ex);
            C54412ev c54412ev = this.A01;
            C14360o3.A0B(enumC58162lY, 0);
            c54412ev.A02(new C72053Ld(enumC58122lU, enumC58162lY, null, null), c54432ex);
        }
    }
}
