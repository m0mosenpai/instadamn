package X;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class GKP implements Serializable {
    public int A00;
    public GKO A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final GKO A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public GKP(GKO gko, GKO gko2, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2) {
        this.A08 = str;
        this.A09 = str2;
        this.A07 = str3;
        this.A06 = gko;
        this.A01 = gko2;
        this.A02 = str4;
        this.A00 = i;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = str5;
    }
}
