package X;

import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class GOY implements Runnable {
    public final /* synthetic */ C62862tP A00;
    public final /* synthetic */ C35229FgM A01;

    public GOY(C62862tP c62862tP, C35229FgM c35229FgM) {
        this.A01 = c35229FgM;
        this.A00 = c62862tP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35229FgM c35229FgM = this.A01;
        ImmutableList A0L = AbstractC31173DnH.A0L(c35229FgM.A02.A07);
        C19700xy c19700xy = C17280tP.A4E;
        String A08 = c19700xy.A00().A08();
        if (AbstractC13670mt.A0B(A08)) {
            A08 = AbstractC166997dE.A0o();
            c19700xy.A00().A0G(A08);
        }
        C11820jg c11820jg = C11830jh.A04;
        C07270a1 c07270a1 = c35229FgM.A0D;
        String A02 = c11820jg.A01(c07270a1).A02(C19T.A20);
        if (A02 == null) {
            A02 = "";
        }
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        BitSet A0j = AbstractC31171DnF.A0j(0);
        String A00 = C16030qx.A00(c35229FgM.A08);
        C14360o3.A07(A00);
        A1I.put(AbstractC31189DnY.A02(), A00);
        A1I.put("family_device_id", A02);
        C17280tP A002 = c19700xy.A00();
        A1I.put("logged_out_user", AbstractC31171DnF.A0Y(A002, A002.A09, C17280tP.A4G, 185));
        A1I.put("offline_experiment_group", "caa_iteration_v3_perf_ig_4");
        A1I.put("show_internal_settings", false);
        A1I.put("waterfall_id", A08);
        C14360o3.A0C(A0L, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, java.lang.Object>>");
        A1I.put("account_list", A0L);
        A1I.put(AbstractC111324zv.A00(2227), C1Q2.A00());
        if (A0j.nextClearBit(0) >= 0) {
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            C35773FrB c35773FrB = new C35773FrB(AbstractC06930Yk.A0B(A1I), c16920sk);
            C62862tP c62862tP = this.A00;
            C65981Txa A01 = C35205Ffx.A01(C35205Ffx.A00(), c35229FgM, 4);
            c35773FrB.E5D(A01, VRA.A00(c07270a1, false), new C36031FvT(c35773FrB, c62862tP, c35229FgM, A01), true);
            return;
        }
        throw AbstractC31172DnG.A0v();
    }
}
