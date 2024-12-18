package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.SpF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63547SpF implements C1N8 {
    public final /* synthetic */ SE9 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C63547SpF(SE9 se9, String str, boolean z) {
        this.A00 = se9;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C62731SNv c62731SNv = (C62731SNv) obj;
        SCS scs = this.A00.A01;
        String str = this.A01;
        boolean z = this.A02;
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        int i = 50;
        if (z) {
            i = 4;
        }
        C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, Integer.valueOf(i), AbstractC111324zv.A00(2808));
        C0CA.A00(A0T, str, "after");
        C2JM A0b = AbstractC25225BEi.A0b();
        return C60622REh.A00(c62731SNv, scs.A00, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "pagination"), "IGFBPayShareableTransactionsQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59543QhH.class, false, null, 0, null, null, AbstractC166987dD.A1E()), C64281T7q.A00);
    }
}
