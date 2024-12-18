package X;

import android.app.PendingIntent;
import java.util.List;

/* loaded from: classes10.dex */
public final class RP1 extends AbstractC62642SJz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final PendingIntent A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC62642SJz) {
                RP1 rp1 = (RP1) ((AbstractC62642SJz) obj);
                if (this.A00 == rp1.A00 && this.A01 == rp1.A01 && this.A02 == rp1.A02 && this.A03 == rp1.A03 && this.A04 == rp1.A04) {
                    List list = this.A06;
                    List list2 = rp1.A06;
                    if (list != null ? list.equals(list2) : list2 == null) {
                        List list3 = this.A07;
                        List list4 = rp1.A07;
                        if (list3 != null ? list3.equals(list4) : list4 == null) {
                            PendingIntent pendingIntent = this.A05;
                            PendingIntent pendingIntent2 = rp1.A05;
                            if (pendingIntent != null ? pendingIntent.equals(pendingIntent2) : pendingIntent2 == null) {
                                List list5 = this.A08;
                                List list6 = rp1.A08;
                                if (list5 != null ? list5.equals(list6) : list6 == null) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.A00 ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A02;
        long j = this.A03;
        long j2 = this.A04;
        long j3 = j2 ^ (j2 >>> 32);
        int i2 = i * 1000003;
        return ((((((((((i2 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) j3)) * 1000003) ^ AbstractC167017dG.A0M(this.A06)) * 1000003) ^ AbstractC167017dG.A0M(this.A07)) * 1000003) ^ AbstractC167017dG.A0M(this.A05)) * 1000003) ^ AbstractC166997dE.A0I(this.A08);
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        long j = this.A03;
        long j2 = this.A04;
        String valueOf = String.valueOf(this.A06);
        String valueOf2 = String.valueOf(this.A07);
        String valueOf3 = String.valueOf(this.A05);
        String valueOf4 = String.valueOf(this.A08);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SplitInstallSessionState{sessionId=");
        A1C.append(i);
        A1C.append(", status=");
        A1C.append(i2);
        A1C.append(AbstractC111324zv.A00(1413));
        A1C.append(i3);
        A1C.append(", bytesDownloaded=");
        A1C.append(j);
        A1C.append(", totalBytesToDownload=");
        A1C.append(j2);
        A1C.append(", moduleNamesNullable=");
        A1C.append(valueOf);
        A1C.append(", languagesNullable=");
        A1C.append(valueOf2);
        A1C.append(", resolutionIntent=");
        A1C.append(valueOf3);
        A1C.append(", splitFileIntents=");
        return AbstractC50523MSb.A0W(valueOf4, A1C);
    }

    public RP1(PendingIntent pendingIntent, List list, List list2, List list3, int i, int i2, int i3, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A04 = j2;
        this.A06 = list;
        this.A07 = list2;
        this.A05 = pendingIntent;
        this.A08 = list3;
    }
}
