package X;

import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class OF4 {
    public static int A08;
    public static int A09;
    public final int A00;
    public final long A01;
    public final C38321qM A02;
    public final Reel A03;
    public final C41181vS A04;
    public final Integer A05;
    public final String A06;
    public final String A07;

    public OF4(Reel reel, C41181vS c41181vS, Integer num, int i, long j) {
        C38321qM c38321qM;
        StringBuilder A1C;
        int i2;
        String str;
        String str2;
        this.A04 = c41181vS;
        if (c41181vS != null) {
            c38321qM = c41181vS.A0b;
        } else {
            c38321qM = null;
        }
        this.A02 = c38321qM;
        this.A03 = reel;
        this.A00 = i;
        this.A07 = reel != null ? reel.getId() : null;
        this.A05 = num;
        this.A01 = j;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 3) {
                A1C = AbstractC166987dD.A1C();
                if (intValue != 2) {
                    str2 = "media-placeholder-";
                } else {
                    str2 = "tombstone-";
                }
                A1C.append(str2);
                i2 = A08;
                A08 = i2 + 1;
            } else {
                c38321qM.getClass();
                str = c38321qM.getId();
                this.A06 = str;
            }
        } else {
            A1C = AbstractC166987dD.A1C();
            A1C.append("empty-space-");
            i2 = A09;
            A09 = i2 + 1;
        }
        A1C.append(i2);
        str = A1C.toString();
        this.A06 = str;
    }
}
