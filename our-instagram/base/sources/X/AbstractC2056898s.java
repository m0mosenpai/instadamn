package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.98s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2056898s {
    public final C006802i A00;
    public final C6CF A01;
    public final InterfaceC02900Bo A02;

    public final void A04(Integer num) {
        if (A0A()) {
            int intValue = num.intValue();
            short s = 3;
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        s = 4;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                s = 2;
            }
            this.A00.markerEnd(A0B(), s);
        }
    }

    public final void A07(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C006802i c006802i = this.A00;
        int A0B = A0B();
        if (!c006802i.isMarkerOn(A0B)) {
            A03();
        }
        c006802i.markerAnnotate(A0B, str, str2);
    }

    public final void A09(String str, String[] strArr) {
        C14360o3.A0B(strArr, 1);
        C006802i c006802i = this.A00;
        int A0B = A0B();
        if (!c006802i.isMarkerOn(A0B)) {
            A03();
        }
        c006802i.markerAnnotate(A0B, str, AbstractC009903n.A07(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", null, strArr));
    }

    public abstract int A0B();

    public final void A01() {
        A04(C05F.A0C);
    }

    public final void A02() {
        A04(C05F.A00);
    }

    public final void A03() {
        C006802i c006802i = this.A00;
        int A0B = A0B();
        if (!c006802i.isMarkerOn(A0B)) {
            c006802i.markerStart(A0B, false);
            c006802i.markerAnnotate(A0B, AbstractC43591JPw.A00(655), String.valueOf(this.A02.BOZ()));
            c006802i.markerAnnotate(A0B, "EB_TEST_VERSION", "V3");
            c006802i.markerAnnotate(A0B, "EB_TEST_VERSION_FROM_SERVER", C6CB.A01(this.A01.A00, 36878878430331106L));
        }
    }

    public final void A05(String str) {
        C006802i c006802i = this.A00;
        int A0B = A0B();
        if (!c006802i.isMarkerOn(A0B)) {
            A03();
        }
        c006802i.markerPoint(A0B, str);
    }

    public final void A06(String str, int i) {
        C006802i c006802i = this.A00;
        int A0B = A0B();
        if (!c006802i.isMarkerOn(A0B)) {
            A03();
        }
        c006802i.markerAnnotate(A0B, str, i);
    }

    public final void A08(String str, boolean z) {
        String str2;
        C006802i c006802i = this.A00;
        int A0B = A0B();
        if (!c006802i.isMarkerOn(A0B)) {
            A03();
        }
        if (z) {
            str2 = "TRUE";
        } else {
            str2 = "FALSE";
        }
        c006802i.markerAnnotate(A0B, str, str2);
    }

    public final boolean A0A() {
        return this.A00.isMarkerOn(A0B());
    }

    public AbstractC2056898s(C006802i c006802i, C6CF c6cf, InterfaceC02900Bo interfaceC02900Bo) {
        this.A00 = c006802i;
        this.A02 = interfaceC02900Bo;
        this.A01 = c6cf;
    }
}
