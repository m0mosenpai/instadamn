package X;

import java.util.List;

/* renamed from: X.WlF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70968WlF implements MQC {
    public final /* synthetic */ C69727VuM A00;
    public final /* synthetic */ AbstractC67878V0j A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    @Override // X.MQC
    public final void DYD(EnumC172127lh enumC172127lh) {
        int i;
        Integer num;
        AbstractC67878V0j abstractC67878V0j = this.A01;
        C69727VuM c69727VuM = this.A00;
        String str = this.A02;
        boolean z = this.A03;
        if (enumC172127lh == EnumC172127lh.A05) {
            i = 756;
        } else {
            i = 755;
        }
        String A00 = AbstractC43591JPw.A00(i);
        if (AbstractC15820qc.A0E(abstractC67878V0j.requireContext())) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        C4I7 c4i7 = abstractC67878V0j.A0A;
        if (c4i7 != null) {
            Long A002 = C4I8.A00(abstractC67878V0j.getSession());
            List A1J = AbstractC166987dD.A1J(C4I9.UNKNOWN);
            C9CH c9ch = new C9CH(C4IA.A08, C4IB.A05, 4);
            c9ch.A00(num);
            c4i7.A00(c9ch, A002, A00, "SEARCH_NEARBY", null, A1J);
            int ordinal = enumC172127lh.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (!z) {
                            C1VW c1vw = C1VW.A00;
                            if (c1vw != null && c1vw.shouldUseNewNativeReconsiderDialog(abstractC67878V0j.getSession())) {
                                return;
                            }
                            String A0p = AbstractC25231BEo.A0p();
                            V9E v9e = new V9E(A0p, abstractC67878V0j, 1);
                            C4I8 c4i8 = AbstractC68641VYw.A00;
                            C4I7 c4i72 = abstractC67878V0j.A0A;
                            if (c4i72 != null) {
                                c4i8.A03(abstractC67878V0j.getSession(), c4i72, "SEARCH_NEARBY", A0p);
                                WGH.A04(abstractC67878V0j.requireActivity(), null, v9e, null, null, null, null, 2131965675, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    return;
                }
            } else {
                abstractC67878V0j.A06().A02().A06(c69727VuM.A00().A02, str);
                return;
            }
        }
        C14360o3.A0F("devicePermissionKitLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.MQC
    public final boolean EjC() {
        return true;
    }

    public C70968WlF(C69727VuM c69727VuM, AbstractC67878V0j abstractC67878V0j, String str, boolean z) {
        this.A01 = abstractC67878V0j;
        this.A00 = c69727VuM;
        this.A02 = str;
        this.A03 = z;
    }
}
