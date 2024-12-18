package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class MMC extends C0YY implements InterfaceC16620sF {
    public static final MMC A00 = new MMC();

    public MMC() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean z;
        KNW knw;
        Object obj3;
        Object obj4;
        KNZ knz;
        KNX knx;
        AbstractC46508Ki7 abstractC46508Ki7 = (AbstractC46508Ki7) obj;
        AbstractC46508Ki7 abstractC46508Ki72 = (AbstractC46508Ki7) obj2;
        AbstractC167017dG.A1N(abstractC46508Ki7, abstractC46508Ki72);
        if (abstractC46508Ki7 instanceof KNX) {
            KNX knx2 = (KNX) abstractC46508Ki7;
            z = false;
            if ((abstractC46508Ki72 instanceof KNX) && (knx = (KNX) abstractC46508Ki72) != null) {
                obj3 = knx.A00;
                obj4 = knx2.A00;
                z = C14360o3.A0K(obj3, obj4);
            }
            return Boolean.valueOf(z);
        }
        if (abstractC46508Ki7 instanceof KNZ) {
            KNZ knz2 = (KNZ) abstractC46508Ki7;
            z = false;
            if ((abstractC46508Ki72 instanceof KNZ) && (knz = (KNZ) abstractC46508Ki72) != null && knz.A01 == knz2.A01) {
                List list = knz2.A02;
                List list2 = knz.A02;
                if (list.size() == list2.size()) {
                    int i = 0;
                    for (Object obj5 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        if (!C14360o3.A0K(obj5, list2.get(i))) {
                            break;
                        }
                        i = i2;
                    }
                }
            }
        } else if (abstractC46508Ki7 instanceof KNY) {
            KNY kny = (KNY) abstractC46508Ki7;
            if (abstractC46508Ki72 instanceof KNY) {
                KNY kny2 = (KNY) abstractC46508Ki72;
                z = false;
                if (kny2 != null) {
                    if (kny2.A00 == kny.A00) {
                        z = true;
                    }
                }
            }
            z = false;
        } else {
            KNW knw2 = (KNW) abstractC46508Ki7;
            z = false;
            if ((abstractC46508Ki72 instanceof KNW) && (knw = (KNW) abstractC46508Ki72) != null) {
                obj3 = knw.A00;
                obj4 = knw2.A00;
                z = C14360o3.A0K(obj3, obj4);
            }
        }
        return Boolean.valueOf(z);
    }
}
