package X;

import java.util.LinkedHashSet;

/* renamed from: X.LGv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47959LGv {
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final boolean A06;
    public final boolean A07;

    public /* synthetic */ C47959LGv(boolean z, boolean z2) {
        this.A05 = false;
        this.A00 = Long.MAX_VALUE;
        this.A01 = -1L;
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A06 = z;
        this.A07 = z2;
    }

    public final synchronized String A00(boolean z) {
        String A0P;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        if (!this.A05) {
            A0l.add("rendering");
        }
        if (!z && this.A01 < this.A00 && !this.A06) {
            A0l.add("iris_sync");
        }
        if (z && !this.A03 && !this.A07) {
            A0l.add("mem_offline_sync");
        }
        if (!z && !this.A04) {
            A0l.add("mqtt_connection");
        }
        if (z && !this.A02) {
            A0l.add("chatd_connection");
        }
        if (!A0l.isEmpty()) {
            A0P = AbstractC001800i.A0P(", ", "[", "]", A0l, null);
        } else {
            A0P = null;
        }
        return A0P;
    }

    public final synchronized void A01(boolean z) {
        this.A02 = z;
    }

    public final synchronized void A02(boolean z) {
        this.A03 = z;
    }

    public final synchronized void A03(boolean z) {
        this.A04 = z;
    }

    public final synchronized boolean A04(boolean z) {
        boolean z2;
        z2 = true;
        if (this.A05) {
            if (z) {
                if ((this.A07 || this.A03) && this.A02) {
                }
            } else if ((this.A06 || this.A01 >= this.A00) && this.A04) {
            }
        }
        z2 = false;
        return z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47959LGv) {
                C47959LGv c47959LGv = (C47959LGv) obj;
                if (this.A05 != c47959LGv.A05 || this.A00 != c47959LGv.A00 || this.A01 != c47959LGv.A01 || this.A03 != c47959LGv.A03 || this.A04 != c47959LGv.A04 || this.A02 != c47959LGv.A02 || this.A06 != c47959LGv.A06 || this.A07 != c47959LGv.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A07, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A07(this.A01, AbstractC167007dF.A07(this.A00, AbstractC25225BEi.A08(this.A05))))))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FOAMessagingMarkerEndingCriteria(rendered=");
        A1C.append(this.A05);
        A1C.append(", irisLatestSeqId=");
        A1C.append(this.A00);
        A1C.append(", irisLocalSeqId=");
        A1C.append(this.A01);
        A1C.append(", memUpToDate=");
        A1C.append(this.A03);
        A1C.append(", mqttConnected=");
        A1C.append(this.A04);
        A1C.append(", chatdConnected=");
        A1C.append(this.A02);
        A1C.append(", disableIrisCheck=");
        A1C.append(this.A06);
        A1C.append(", disableMemCheck=");
        return AbstractC25236BEt.A0a(A1C, this.A07);
    }

    public C47959LGv() {
        this.A05 = false;
        this.A00 = Long.MAX_VALUE;
        this.A01 = -1L;
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A06 = false;
        this.A07 = false;
    }
}
