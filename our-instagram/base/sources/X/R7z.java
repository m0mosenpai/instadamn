package X;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class R7z extends C62673SLl implements InterfaceC65375Tj7 {
    public R7z(C62673SLl c62673SLl) {
        super(c62673SLl.A00, c62673SLl.A02, c62673SLl.A01);
    }

    @Override // X.InterfaceC65375Tj7
    public final JSONObject EqM() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("bytes", this.A00);
        A0q.put("ondisk", this.A02);
        A0q.put("entries", this.A01);
        return A0q;
    }
}
