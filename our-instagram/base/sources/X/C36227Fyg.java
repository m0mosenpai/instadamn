package X;

import java.util.List;

/* renamed from: X.Fyg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36227Fyg implements C6D2 {
    public final int A00;
    public final long A01;
    public final Object A02;

    @Override // X.C6D2
    public final Object apply(Object obj) {
        if (this.A00 != 0) {
            C1345666g c1345666g = (C1345666g) this.A02;
            long j = this.A01;
            return C42221xC.A07(new C48447Lc0(c1345666g, (List) obj, 1, j), AbstractC137146It.A00("instagram_secure_participants_add"));
        }
        long j2 = this.A01;
        List list = (List) this.A02;
        return C42221xC.A07(new C48447Lc0((C1345666g) obj, list, 0, j2), AbstractC137146It.A00("tam_client_request_participants_remove"));
    }

    public C36227Fyg(long j, Object obj, int i) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
