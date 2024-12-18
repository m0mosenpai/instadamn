package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes8.dex */
public final class L8Q {
    public final C006802i A00;

    public final void A00(String str, boolean z) {
        C006802i c006802i = this.A00;
        c006802i.A0G.E38(944520647, 1);
        int hashCode = str.hashCode();
        c006802i.markerStart(944520647, hashCode);
        c006802i.markerAnnotate(944520647, hashCode, "is_animated", z);
        c006802i.markerAnnotate(944520647, hashCode, TraceFieldType.RequestID, str);
        c006802i.markerPoint(944520647, hashCode, "server_request_sent");
    }

    public final void A01(String str, boolean z) {
        C006802i c006802i = this.A00;
        c006802i.A0G.E38(944511429, 1);
        int hashCode = str.hashCode();
        c006802i.markerStart(944511429, hashCode);
        c006802i.markerPoint(944511429, hashCode, "download_start");
        c006802i.markerAnnotate(944511429, hashCode, "is_animated", z);
        c006802i.markerAnnotate(944511429, hashCode, "download_id", str);
    }

    public L8Q(C006802i c006802i) {
        this.A00 = c006802i;
    }
}
