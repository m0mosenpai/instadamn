package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.T7q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64281T7q implements C2n2 {
    public static final C64281T7q A00 = new C64281T7q();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        SE8 se8;
        String str;
        C2JS c2js = (C2JS) obj;
        if (c2js != null) {
            try {
                C2JS reinterpretRequired = c2js.reinterpretRequired(0, C58998QTi.class, -1284681296);
                se8 = new SE8();
                if (reinterpretRequired.A03(C58997QTh.class, "transaction_hub_history_query(pagination:$pagination)", -1855094489) != null) {
                    str = reinterpretRequired.A03(C58997QTh.class, "transaction_hub_history_query(pagination:$pagination)", -1855094489).A08("last_transaction_index");
                } else {
                    str = null;
                }
                se8.A01 = str;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                if (reinterpretRequired.A03(C58997QTh.class, "transaction_hub_history_query(pagination:$pagination)", -1855094489) != null) {
                    C1LC A0a = AbstractC58319PtB.A0a(reinterpretRequired.A03(C58997QTh.class, "transaction_hub_history_query(pagination:$pagination)", -1855094489), R1P.class, "transactions", 0, 1809617422);
                    while (A0a.hasNext()) {
                        C2JS A0l = AbstractC25225BEi.A0l(A0a);
                        if (A0l.A09("creation_date") != null && A0l.A07("receiver_name") != null && A0l.A08("receiver_profile_image_uri") != null && A0l.A0A("transaction_amount_formatted") != null && A0l.getOptionalStringField(6, "transaction_id") != null && A0l.A0C("transaction_payment_type") != null) {
                            builder.add((Object) A0l);
                        }
                    }
                }
                ImmutableList build = builder.build();
                se8.A00 = build;
                AbstractC63311ShH.A04(build, "transactions");
            } catch (ClassNotFoundException e) {
                throw AbstractC58318PtA.A0f(e);
            }
        } else {
            se8 = new SE8();
        }
        return new C62963SZg(se8);
    }
}
