package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.UUID;

/* renamed from: X.JbW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43921JbW {
    public final int A00;
    public final C191258dU A01;
    public final C006802i A02;

    public final void A01(C3NY c3ny) {
        C006802i c006802i;
        int i;
        String A00;
        String str;
        short s;
        C14360o3.A0B(c3ny, 0);
        boolean z = c3ny instanceof C194848jk;
        if (z) {
            c006802i = this.A02;
            i = this.A00;
            Object obj = ((C194848jk) c3ny).A00;
            if (!(obj instanceof K9Q) && !C14360o3.A0K(obj, K9M.A00)) {
                if (!(obj instanceof K9P) && !C14360o3.A0K(obj, K9L.A00)) {
                    if (obj instanceof C67857Uzc) {
                        A00 = "server_error";
                    } else if (obj instanceof K9R) {
                        A00 = "insufficient_storage";
                    } else if (obj instanceof K9O) {
                        A00 = "client_validation";
                    } else {
                        A00 = "unknown";
                    }
                } else {
                    A00 = "exception";
                }
            } else {
                A00 = "http_error";
            }
            str = TraceFieldType.FailureReason;
        } else if (c3ny instanceof C3NX) {
            c006802i = this.A02;
            i = this.A00;
            A00 = AbstractC173337nl.A00(((C9OO) ((C3NX) c3ny).A00).A01);
            str = "cache_type";
        } else {
            throw B4Z.A00();
        }
        c006802i.markerAnnotate(17640860, i, str, A00);
        if (c3ny instanceof C3NX) {
            s = 2;
        } else if (z) {
            s = 3;
        } else {
            throw B4Z.A00();
        }
        c006802i.markerEnd(17640860, i, s);
    }

    public /* synthetic */ C43921JbW(C191258dU c191258dU) {
        C006802i c006802i = C006802i.A0p;
        int hashCode = UUID.randomUUID().hashCode();
        C14360o3.A0B(c006802i, 3);
        this.A01 = c191258dU;
        this.A02 = c006802i;
        this.A00 = hashCode;
    }

    public final void A00(int i) {
        C006802i c006802i = this.A02;
        int i2 = this.A00;
        c006802i.markerStart(17640860, i2);
        C191258dU c191258dU = this.A01;
        c006802i.markerAnnotate(17640860, i2, "product_id", c191258dU.A02);
        c006802i.markerAnnotate(17640860, i2, "category_id", c191258dU.A01);
        c006802i.markerAnnotate(17640860, i2, "effects_count", i);
    }
}
