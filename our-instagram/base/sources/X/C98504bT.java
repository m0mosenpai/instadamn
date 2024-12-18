package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.4bT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98504bT extends AbstractC98514bU {
    public boolean A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final InterfaceC92404Bv A04;
    public final C4XG A05;
    public volatile boolean A06;
    public volatile boolean A07;

    @Override // X.InterfaceC98244b3
    public final void AGY() {
        this.A07 = true;
    }

    public C98504bT(InterfaceC92404Bv interfaceC92404Bv, C4B6 c4b6, C4XG c4xg, InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, Object obj, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        super(c4b6, interfaceC92354Bq, c4c7, obj, i, j, j2, j3, j4, j5, j7);
        this.A06 = false;
        this.A02 = i2;
        this.A03 = j6;
        this.A05 = c4xg;
        this.A04 = interfaceC92404Bv;
    }

    @Override // X.InterfaceC98244b3
    public final void ChG() {
        long j;
        if (this.A01 == 0) {
            C98134as c98134as = ((AbstractC98514bU) this).A00;
            C4B8.A01(c98134as);
            long j2 = this.A03;
            for (C98044aj c98044aj : c98134as.A00) {
                if (c98044aj.A07 != j2) {
                    c98044aj.A07 = j2;
                    c98044aj.A0H = true;
                }
            }
            C4XG c4xg = this.A05;
            long j3 = ((AbstractC98514bU) this).A03;
            long j4 = -9223372036854775807L;
            if (j3 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j3 - j2;
            }
            long j5 = ((AbstractC98514bU) this).A02;
            if (j5 != -9223372036854775807L) {
                j4 = j5 - j2;
            }
            c4xg.CNn(c98134as, j, j4);
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("bytes_loaded", Long.valueOf(this.A01));
            C4C7 c4c7 = super.A06;
            long j6 = this.A01;
            long j7 = c4c7.A03;
            long j8 = -1;
            if (j7 != -1) {
                j8 = j7 - j6;
            }
            C4C7 A00 = c4c7.A00(j6, j8);
            C98254b4 c98254b4 = super.A07;
            C98274b6 c98274b6 = new C98274b6(c98254b4, A00.A02, c98254b4.open(A00));
            this.A06 = false;
            while (!this.A07) {
                try {
                    int E7m = ((C4XE) this.A05).A05.E7m(c98274b6, C4XE.A09);
                    boolean z = false;
                    if (E7m != 1) {
                        z = true;
                    }
                    C4B8.A04(z);
                    if (E7m != 0) {
                        break;
                    }
                } catch (IOException e) {
                    hashMap.put("exception", e.getLocalizedMessage());
                    hashMap.put("stream_position", Long.valueOf(c98274b6.A02));
                    hashMap.put("absolute_position", Long.valueOf(c4c7.A02));
                    this.A06 = true;
                }
            }
            this.A01 = c98274b6.A02 - c4c7.A02;
            InterfaceC92354Bq interfaceC92354Bq = c98254b4.A03;
            if (this.A07 && (interfaceC92354Bq instanceof InterfaceC97874aS)) {
                ((C97864aR) ((InterfaceC97874aS) interfaceC92354Bq)).A01.cancel();
            }
            try {
                c98254b4.close();
            } catch (IOException unused) {
            }
            this.A00 = true;
        } catch (Throwable th) {
            C98254b4 c98254b42 = super.A07;
            InterfaceC92354Bq interfaceC92354Bq2 = c98254b42.A03;
            if (this.A07 && (interfaceC92354Bq2 instanceof InterfaceC97874aS)) {
                ((C97864aR) ((InterfaceC97874aS) interfaceC92354Bq2)).A01.cancel();
            }
            try {
                c98254b42.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
