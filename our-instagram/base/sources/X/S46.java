package X;

import android.content.Context;
import java.util.AbstractCollection;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S46 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.Rq2] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        AbstractCollection abstractCollection = (AbstractCollection) c6fw.A03(0);
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A03 = c6fw.A03(3);
            C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.Number");
            long A0N = AbstractC166987dD.A0N(A03);
            Object A032 = c6fw.A03(4);
            C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.String");
            String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 5);
            Context context = c6fg.A00;
            String[] strArr = (String[]) abstractCollection.toArray(new String[0]);
            C14360o3.A0B(strArr, 1);
            AbstractC25229BEm.A1I(A032, 5, A0o);
            C62515SEr c62515SEr = new C62515SEr(c6fq, A0G);
            Object obj = new Object();
            Map map = C0YZ.A03;
            ?? r6 = obj;
            if (A0o.equals(AbstractC13230m9.A01(C58826QBj.class))) {
                r6 = new C58826QBj((C07270a1) C6BQ.A0A(C6BQ.A09(c6fq)));
            }
            C62687SMb c62687SMb = new C62687SMb(context, r6, new C62562SGn(context, r6, c62515SEr), strArr);
            Context context2 = c62687SMb.A02;
            if (C02G.A00(context2, "android.permission.READ_PHONE_STATE") == 0 && C02G.A00(context2, "android.permission.READ_CALL_LOG") == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                c62687SMb.A03.A00("client_start_flashcall_listening", AbstractC167007dF.A0n("start_flashcall_listening_timestamp", String.valueOf(currentTimeMillis)));
                c62687SMb.A01 = false;
                if (c62687SMb.A00 != null) {
                    c62687SMb.A00();
                }
                c62687SMb.A00 = new R7H(new InterfaceC08240bm[]{new C64155T1g(c62687SMb, currentTimeMillis)});
                C0b3.A00();
                C0b3.A02(context2, c62687SMb.A00);
            }
            AbstractC167007dF.A0J().postDelayed(new TQF(r6, c62687SMb, c62515SEr), A0N);
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
