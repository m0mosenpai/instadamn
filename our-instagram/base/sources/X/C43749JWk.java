package X;

/* renamed from: X.JWk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43749JWk {
    public String A00;
    public final C006802i A01;

    public final void A00(String str) {
        String str2 = this.A00;
        short s = 3;
        C006802i c006802i = this.A01;
        if (str2 == null) {
            c006802i.markerAnnotate(20128369, "reason", "tapped_media_id_is_missing");
            c006802i.markerEnd(20128369, (short) 3);
            return;
        }
        c006802i.markerAnnotate(20128369, "viewing media id exist", AbstractC167007dF.A1W(str));
        if (!C14360o3.A0K(this.A00, str)) {
            c006802i.markerAnnotate(20128369, "reason", "media_id_mismatch");
        } else {
            s = 2;
        }
        c006802i.markerEnd(20128369, s);
        this.A00 = null;
    }

    public C43749JWk(C006802i c006802i) {
        this.A01 = c006802i;
    }
}
