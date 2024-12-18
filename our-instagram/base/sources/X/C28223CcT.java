package X;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.CcT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28223CcT {
    public final C6Nu A00;
    public final C6L A01;
    public final String A02;
    public final Map A03;
    public final InterfaceC16620sF A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void A02(String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16590sC interfaceC16590sC, C5Hc c5Hc) {
        ?? r11;
        C14360o3.A0B(c5Hc, 0);
        if (this.A01 == C6L.A02) {
            HashSet A1H = AbstractC166987dD.A1H();
            r11 = AbstractC166987dD.A1E();
            for (Object obj : c5Hc) {
                AbstractC25231BEo.A1F(interfaceC16660sJ.invoke(obj), obj, A1H, r11);
            }
        } else {
            r11 = c5Hc;
        }
        List list = (List) r11;
        this.A00.CgN(new C50365MLr(interfaceC16660sJ, this, list, str, 27), new BAO(4, interfaceC16660sJ2, list), C5UA.A03(new C30751Dfo(7, interfaceC16590sC, c5Hc), 2126948908), list.size());
    }

    public static final String A00(C28223CcT c28223CcT, String str, String str2, int i) {
        String A0j = AnonymousClass001.A0j(c28223CcT.A02, str2, str, ':', ':');
        Map map = c28223CcT.A03;
        Number number = (Number) map.get(A0j);
        if (number != null) {
            if (number.intValue() != i) {
                C6L c6l = c28223CcT.A01;
                if (c6l != C6L.A04) {
                    EnumC12410kj enumC12410kj = EnumC12410kj.A0A;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Key collision for ");
                    A1C.append(A0j);
                    A1C.append(". ");
                    A1C.append(c6l);
                    A1C.append(" item at index - ");
                    A1C.append(i);
                    A1C.append('.');
                    C0w9.A01(enumC12410kj, "IgLazyColumn", A1C.toString());
                    InterfaceC16620sF interfaceC16620sF = c28223CcT.A04;
                    if (interfaceC16620sF != null) {
                        AbstractC25227BEk.A1P(A0j, interfaceC16620sF, i);
                    }
                    A0j = AnonymousClass001.A0G(A0j, ':', i);
                } else {
                    throw AbstractC167007dF.A0c("IgLazyColumn key conflict: ", A0j);
                }
            }
            return A0j;
        }
        map.put(A0j, Integer.valueOf(i));
        return A0j;
    }

    public C28223CcT(C6Nu c6Nu, C6L c6l, String str, InterfaceC16620sF interfaceC16620sF) {
        AbstractC167017dG.A1P(str, c6l);
        this.A02 = str;
        this.A01 = c6l;
        this.A00 = c6Nu;
        this.A04 = interfaceC16620sF;
        this.A03 = AbstractC166987dD.A1I();
    }

    public final void A01(Object obj, String str, String str2, InterfaceC16610sE interfaceC16610sE) {
        boolean A1b = AbstractC25233BEq.A1b(str, str2, obj);
        this.A00.CgN(new MI9(this, str2, str, 6), C30185DRq.A02(obj, 27), C5UA.A04(new C30750Dfn(interfaceC16610sE, 10), -877655627, A1b), A1b ? 1 : 0);
    }
}
