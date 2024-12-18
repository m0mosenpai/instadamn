package X;

import org.json.JSONObject;

/* renamed from: X.T1w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64167T1w implements InterfaceC65375Tj7 {
    public final long A00;
    public final long A01;
    public final long A02;

    public C64167T1w(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    @Override // X.InterfaceC65375Tj7
    public final JSONObject EqM() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("available_space", this.A00);
        A0q.put("free_space", this.A01);
        A0q.put("total_space", this.A02);
        return A0q;
    }
}
