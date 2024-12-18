package X;

import android.content.Context;
import android.os.Bundle;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Tak, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64961Tak extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final Object A0D;
    public final Object A0E;
    public final Object A0F;
    public final String A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64961Tak(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, String str, int i, long j) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = j;
        this.A07 = obj3;
        this.A05 = obj4;
        this.A0B = obj5;
        this.A03 = obj6;
        this.A0D = obj7;
        this.A08 = obj8;
        this.A09 = obj9;
        this.A0F = obj10;
        this.A0C = obj11;
        this.A0A = obj12;
        this.A0G = str;
        this.A06 = obj13;
        this.A0E = obj14;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        C63021Sam c63021Sam = (C63021Sam) this.A02;
        Integer num = (Integer) this.A04;
        c63021Sam.A02(num, null, "BloksBottomSheetShowInMainThreadStart", 772805755);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (i != 0) {
            BitSet bitSet = new BitSet(4);
            long j = this.A01;
            QE3 qe3 = (QE3) this.A07;
            Map A00 = AbstractC63008SaW.A00((SO2) this.A05);
            C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
            C14360o3.A0B(A00, 0);
            AbstractC58322PtE.A1O("settings", A00, bitSet, A1I);
            Object obj = this.A0B;
            C14360o3.A0B(obj, 0);
            A1I.put("contact", obj);
            bitSet.set(0);
            A1I.put("logging_metadata", this.A03);
            AbstractC58323PtF.A1M(new C30712DfA(this.A08, 12), A1I, 26);
            C62762SPv c62762SPv = (C62762SPv) this.A09;
            C63024Sau c63024Sau = (C63024Sau) this.A0F;
            Map map = (Map) this.A0C;
            java.util.Set set = (java.util.Set) this.A0A;
            AbstractC58323PtF.A1N(new C65113Tdo((Bundle) this.A06, c62762SPv, c63024Sau, this.A0G, map, set, 1), A1I, 27);
            Object obj2 = this.A0E;
            A1I.put("on_autofill_callback", AbstractC58322PtE.A0e(new C30193DRy(obj2, 19), 24));
            bitSet.set(1);
            AbstractC58322PtE.A1N("on_decline_callback", AbstractC58322PtE.A0e(new C65075Td4(obj2, 6), 25), bitSet, A1I);
            if (bitSet.nextClearBit(0) >= 4) {
                C63716SsW c63716SsW = new C63716SsW(AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E(), j);
                Context context = (Context) this.A0D;
                SKL skl = qe3.A01;
                c63716SsW.E2V(context, skl.A00(), VRA.A00(skl.A00, false));
                c63021Sam.A01(num, null, 772805755);
                return C0eB.A00;
            }
            throw AbstractC31172DnG.A0v();
        }
        BitSet bitSet2 = new BitSet(5);
        long j2 = this.A01;
        QE2 qe2 = (QE2) this.A07;
        Map A002 = AbstractC63008SaW.A00((SO2) this.A05);
        C14360o3.A0C(A002, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, java.lang.Object>");
        C14360o3.A0B(A002, 0);
        A1I.put("settings", A002);
        bitSet2.set(4);
        Object obj3 = this.A0B;
        C14360o3.A0B(obj3, 0);
        A1I.put("contact", obj3);
        bitSet2.set(0);
        A1I.put("logging_metadata", this.A03);
        bitSet2.set(1);
        AbstractC58323PtF.A1M(new C30712DfA(this.A08, 11), A1I, 21);
        C62762SPv c62762SPv2 = (C62762SPv) this.A09;
        C63024Sau c63024Sau2 = (C63024Sau) this.A0F;
        Map map2 = (Map) this.A0C;
        java.util.Set set2 = (java.util.Set) this.A0A;
        AbstractC58323PtF.A1N(new C65113Tdo((Bundle) this.A06, c62762SPv2, c63024Sau2, this.A0G, map2, set2, 0), A1I, 22);
        Object obj4 = this.A0E;
        AbstractC58322PtE.A1O("on_save_callback", AbstractC58322PtE.A0e(new C30193DRy(obj4, 18), 23), bitSet2, A1I);
        AbstractC58322PtE.A1N("on_decline_callback", AbstractC58322PtE.A0e(new C57514Pfo(obj4, 49), 20), bitSet2, A1I);
        if (bitSet2.nextClearBit(0) >= 5) {
            C63715SsV c63715SsV = new C63715SsV(AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E(), j2);
            Context context2 = (Context) this.A0D;
            SKL skl2 = qe2.A01;
            c63715SsV.E2V(context2, skl2.A00(), VRA.A00(skl2.A00, false));
            c63021Sam.A01(num, null, 772805755);
            return C0eB.A00;
        }
        throw AbstractC31172DnG.A0v();
    }
}
