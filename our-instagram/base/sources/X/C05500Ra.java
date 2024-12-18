package X;

/* renamed from: X.0Ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05500Ra implements C0CD {
    @Override // X.C0CD
    public final /* bridge */ /* synthetic */ void EIU(AbstractC02960Bu abstractC02960Bu, C0CC c0cc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        C0SO c0so = (C0SO) abstractC02960Bu;
        int i = c0so.A04;
        if (i == 0) {
            z = false;
        } else {
            c0cc.A7l("mqtt_full_power_time_s", i);
            z = true;
        }
        int i2 = c0so.A05;
        if (i2 == 0) {
            z2 = false;
        } else {
            c0cc.A7l("mqtt_low_power_time_s", i2);
            z2 = true;
        }
        boolean z15 = z | z2;
        long j = c0so.A0D;
        if (j == 0) {
            z3 = false;
        } else {
            c0cc.A7m("mqtt_tx_bytes", j);
            z3 = true;
        }
        boolean z16 = z15 | z3;
        long j2 = c0so.A0C;
        if (j2 == 0) {
            z4 = false;
        } else {
            c0cc.A7m("mqtt_rx_bytes", j2);
            z4 = true;
        }
        boolean z17 = z16 | z4;
        int i3 = c0so.A06;
        if (i3 == 0) {
            z5 = false;
        } else {
            c0cc.A7l("mqtt_request_count", i3);
            z5 = true;
        }
        boolean z18 = z17 | z5;
        int i4 = c0so.A07;
        if (i4 == 0) {
            z6 = false;
        } else {
            c0cc.A7l("mqtt_wakeup_count", i4);
            z6 = true;
        }
        boolean z19 = z18 | z6;
        int i5 = c0so.A00;
        if (i5 == 0) {
            z7 = false;
        } else {
            c0cc.A7l("liger_full_power_time_s", i5);
            z7 = true;
        }
        boolean z20 = z19 | z7;
        int i6 = c0so.A01;
        if (i6 == 0) {
            z8 = false;
        } else {
            c0cc.A7l("liger_low_power_time_s", i6);
            z8 = true;
        }
        boolean z21 = z20 | z8;
        long j3 = c0so.A0B;
        if (j3 == 0) {
            z9 = false;
        } else {
            c0cc.A7m("liger_tx_bytes", j3);
            z9 = true;
        }
        boolean z22 = z21 | z9;
        long j4 = c0so.A0A;
        if (j4 == 0) {
            z10 = false;
        } else {
            c0cc.A7m("liger_rx_bytes", j4);
            z10 = true;
        }
        boolean z23 = z22 | z10;
        int i7 = c0so.A02;
        if (i7 == 0) {
            z11 = false;
        } else {
            c0cc.A7l("liger_request_count", i7);
            z11 = true;
        }
        boolean z24 = z23 | z11;
        int i8 = c0so.A03;
        if (i8 == 0) {
            z12 = false;
        } else {
            c0cc.A7l("liger_wakeup_count", i8);
            z12 = true;
        }
        boolean z25 = z24 | z12;
        int i9 = c0so.A08;
        if (i9 == 0) {
            z13 = false;
        } else {
            c0cc.A7l("proxygen_active_radio_time_s", i9);
            z13 = true;
        }
        boolean z26 = z25 | z13;
        int i10 = c0so.A09;
        if (i10 == 0) {
            z14 = false;
        } else {
            c0cc.A7l("proxygen_tail_radio_time_s", i10);
            z14 = true;
        }
        if (z14 | z26) {
            c0cc.A7l("proxygen_meter_version", 1);
        }
    }
}
