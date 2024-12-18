package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.SpV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63562SpV implements C1N8 {
    public static final C63562SpV A00 = new C63562SpV();

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ImmutableList A06;
        C2JS A03 = ((C2JS) obj).A03(C59075QWh.class, "submit_payment_container(input:$input)", 1293316173);
        if (A03 != null && (A06 = A03.A06(C59074QWg.class, "submit_payment_container_response_list", 243717521)) != null) {
            return ((C2JS) AbstractC166987dD.A16(A06)).getOptionalTreeField(3, "confirmation_component", C66722UZg.class, 1549132435);
        }
        return null;
    }
}
