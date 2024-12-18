package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3mE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82503mE {
    public static final C82503mE A00 = new Object();

    public static final C82513mF A00(String str) {
        return new C82513mF(str, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), -1L);
    }

    public final C82513mF A03(InterfaceC82463mA interfaceC82463mA, C82513mF c82513mF) {
        ArrayList arrayList = new ArrayList(c82513mF.A07);
        List arrayList2 = new ArrayList(c82513mF.A02);
        ArrayList arrayList3 = new ArrayList(c82513mF.A06);
        List arrayList4 = new ArrayList(c82513mF.A04);
        ArrayList arrayList5 = new ArrayList(c82513mF.A03);
        ArrayList arrayList6 = new ArrayList(c82513mF.A05);
        long j = c82513mF.A00;
        switch (interfaceC82463mA.C0M().intValue()) {
            case 0:
                A01(interfaceC82463mA, arrayList);
                float BcM = interfaceC82463mA.BcM();
                if (BcM < 1.0f && BcM >= 0.5f) {
                    A01(interfaceC82463mA, arrayList2);
                    break;
                } else if (BcM == 1.0f) {
                    A01(interfaceC82463mA, arrayList2);
                    A01(interfaceC82463mA, arrayList4);
                    break;
                }
                break;
            case 1:
                A02(interfaceC82463mA, arrayList);
                A02(interfaceC82463mA, arrayList2);
                A02(interfaceC82463mA, arrayList4);
                A02(interfaceC82463mA, arrayList5);
                A02(interfaceC82463mA, arrayList6);
                break;
            default:
                if ((!arrayList.isEmpty()) || interfaceC82463mA.B7r()) {
                    float BcM2 = interfaceC82463mA.BcM();
                    if (BcM2 < 1.0f && BcM2 >= 0.5f) {
                        A02(interfaceC82463mA, arrayList4);
                    } else if (BcM2 == 1.0f) {
                        A05(interfaceC82463mA, arrayList4);
                    } else if (BcM2 < 0.5f && BcM2 >= 0.0f) {
                        if (interfaceC82463mA.B7r()) {
                            A05(interfaceC82463mA, arrayList);
                        }
                        A02(interfaceC82463mA, arrayList2);
                        A02(interfaceC82463mA, arrayList4);
                        break;
                    } else {
                        C0K8.A0C("UnifiedTimeEntryMerger", "when percent is zero percent, it should never be FBMerlinVPVStatusUpdate status.");
                        break;
                    }
                    A05(interfaceC82463mA, arrayList2);
                    if (interfaceC82463mA.B7r()) {
                        A05(interfaceC82463mA, arrayList);
                        break;
                    }
                }
                break;
        }
        return new C82513mF(c82513mF.A01, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, j);
    }

    public final C82493mD A04(InterfaceC82463mA interfaceC82463mA, C82493mD c82493mD) {
        C82513mF c82513mF = c82493mD.A00;
        C82513mF c82513mF2 = c82493mD.A01;
        if (interfaceC82463mA.BWW()) {
            c82513mF = A03(interfaceC82463mA, c82513mF);
        } else {
            if (interfaceC82463mA.C0M() == C05F.A01 && !c82513mF.A00()) {
                c82513mF = A03(interfaceC82463mA, c82513mF);
            }
            c82513mF2 = A03(interfaceC82463mA, c82513mF2);
        }
        return new C82493mD(c82513mF2, c82513mF);
    }

    public static final void A01(InterfaceC82463mA interfaceC82463mA, List list) {
        C82523mG c82523mG;
        if (list.isEmpty()) {
            c82523mG = new C82523mG(interfaceC82463mA.C8K(), -1L);
        } else {
            C82523mG c82523mG2 = (C82523mG) list.get(list.size() - 1);
            if (c82523mG2.A01 != -1 && c82523mG2.A00 == -1) {
                C0K8.A0C("UnifiedTimeEntryMerger", "Unexpected last time entry with exit timestamp placeholder");
            }
            c82523mG = new C82523mG(interfaceC82463mA.C8K(), -1L);
        }
        list.add(c82523mG);
    }

    public static final void A02(InterfaceC82463mA interfaceC82463mA, List list) {
        if (!list.isEmpty()) {
            C82523mG c82523mG = (C82523mG) list.get(list.size() - 1);
            if (c82523mG.A00 == -1) {
                list.set(list.size() - 1, new C82523mG(c82523mG.A01, interfaceC82463mA.C8K()));
            }
        }
    }

    public final void A05(InterfaceC82463mA interfaceC82463mA, List list) {
        if (!list.isEmpty()) {
            C82523mG c82523mG = (C82523mG) list.get(list.size() - 1);
            if (c82523mG.A01 == -1 || c82523mG.A00 == -1) {
                return;
            }
        }
        A01(interfaceC82463mA, list);
    }
}
