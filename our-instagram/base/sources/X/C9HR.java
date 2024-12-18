package X;

import android.content.Context;

/* renamed from: X.9HR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9HR implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C9HR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(279610222);
                int A0N = AbstractC167017dG.A0N(obj, 1040183808);
                InterfaceC24741Ir interfaceC24741Ir = (InterfaceC24741Ir) this.A01;
                if (!interfaceC24741Ir.CRR()) {
                    AbstractC12430kl.A00(AbstractC43591JPw.A00(699), new C29897DGl(44, interfaceC24741Ir, obj));
                }
                C0f9.A0A(1881601942, A0N);
                i = 777134776;
                break;
            case 1:
                A03 = C0f9.A03(-2040283174);
                ((InterfaceC24741Ir) this.A01).F8s(obj);
                i = 1695943954;
                break;
            case 2:
                int A032 = C0f9.A03(1452206290);
                int A033 = C0f9.A03(428631152);
                C214959fX c214959fX = (C214959fX) this.A01;
                Context requireContext = c214959fX.requireContext();
                C195918ld c195918ld = c214959fX.A05;
                if (c195918ld != null) {
                    boolean z = c195918ld.A03;
                    boolean A00 = C196008lp.A00(AbstractC166997dE.A0W(c214959fX));
                    C195918ld c195918ld2 = c214959fX.A05;
                    if (c195918ld2 != null) {
                        c195918ld2.A02();
                        if (z != A00 && A00) {
                            C9GR.A09(requireContext, requireContext.getString(2131974559));
                        }
                        C0f9.A0A(216425562, A033);
                        C0f9.A0A(1126629228, A032);
                        return;
                    }
                }
                C14360o3.A0F("shareToFBController");
                throw C00O.createAndThrow();
            case 3:
                A03 = C0f9.A03(-236025796);
                C7LZ c7lz = (C7LZ) obj;
                int A034 = C0f9.A03(2108325410);
                C14360o3.A0B(c7lz, 0);
                if (c7lz.A00.intValue() != 0) {
                    ((C22996ABv) this.A01).A02 = true;
                } else {
                    ((C22996ABv) this.A01).A01 = true;
                }
                C0f9.A0A(152609250, A034);
                i = -2124113021;
                break;
            default:
                int A035 = C0f9.A03(-1587763453);
                int A036 = C0f9.A03(835412889);
                BCG bcg = ((C22985ABk) this.A01).A00;
                if (bcg != null) {
                    bcg.DFW();
                    C0f9.A0A(-1422510891, A036);
                    C0f9.A0A(1362687830, A035);
                    return;
                } else {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A0A(1615823989, A036);
                    throw A0g;
                }
        }
        C0f9.A0A(i, A03);
    }
}
