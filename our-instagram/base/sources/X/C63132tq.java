package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.2tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63132tq {
    public boolean A00;
    public final C006802i A01;
    public final boolean A02;

    public final void A00(boolean z) {
        if (z) {
            if (this.A00) {
                this.A00 = false;
                this.A01.markerEnd(23592986, (short) 2);
                return;
            }
            return;
        }
        if (!this.A02 || C1CC.A02() > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
            return;
        }
        this.A00 = true;
        C006802i c006802i = this.A01;
        c006802i.markerStart(23592986);
        c006802i.markerAnnotate(23592986, "startup_type", C1CC.A09.toString());
        c006802i.markerAnnotate(23592986, "time_since_startup", C1CC.A02());
    }

    public C63132tq(InterfaceC11380iw interfaceC11380iw, C006802i c006802i) {
        this.A02 = "feed_timeline".equals(interfaceC11380iw.getModuleName());
        this.A01 = c006802i;
    }
}
