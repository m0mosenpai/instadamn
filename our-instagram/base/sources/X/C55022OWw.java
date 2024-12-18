package X;

import java.util.ArrayList;

/* renamed from: X.OWw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55022OWw {
    public final C006802i A00;
    public final Integer A01;
    public final ArrayList A02;
    public final ArrayList A03;

    public final void A02(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C006802i c006802i = this.A00;
        Integer num = this.A01;
        if (num != null) {
            c006802i.markerAnnotate(238951310, num.intValue(), str, str2);
            return;
        }
        throw AbstractC166987dD.A14("instanceKey is not set, which means [startLoggingFlow] wasn't properly called for this logger instance");
    }

    public final void A00(String str) {
        C006802i c006802i = this.A00;
        Integer num = this.A01;
        if (num != null) {
            c006802i.markerPoint(238951310, num.intValue(), AnonymousClass001.A0R(str, "_end"));
            return;
        }
        throw AbstractC166987dD.A14("instanceKey is not set, which means [startLoggingFlow] wasn't properly called for this logger instance");
    }

    public final void A01(String str) {
        C006802i c006802i = this.A00;
        Integer num = this.A01;
        if (num != null) {
            c006802i.markerPoint(238951310, num.intValue(), AnonymousClass001.A0R(str, "_start"));
            return;
        }
        throw AbstractC166987dD.A14("instanceKey is not set, which means [startLoggingFlow] wasn't properly called for this logger instance");
    }

    public C55022OWw(Integer num) {
        this.A02 = AbstractC166987dD.A1E();
        this.A03 = AbstractC166987dD.A1E();
        this.A01 = num;
        this.A00 = AbstractC43592JPx.A0N();
    }

    public C55022OWw() {
        this(null);
    }
}
