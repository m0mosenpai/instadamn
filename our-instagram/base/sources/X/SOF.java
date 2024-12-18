package X;

import java.util.List;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class SOF {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final long A08;
    public final SQ2 A09;
    public final C58799QAg A0A;
    public final C58805QAm A0B;
    public final SHA A0C;
    public final Ss5 A0D;
    public final SAK A0E;
    public final SI6 A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final String A0J;
    public final String A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final boolean A0O;

    public final String toString() {
        return A00("");
    }

    public final String A00(String str) {
        int i;
        StringBuilder A11 = AbstractC166997dE.A11(str);
        A11.append(this.A0J);
        A11.append("\n");
        SQ2 sq2 = this.A09;
        SOF sof = (SOF) sq2.A06.A05(this.A08);
        if (sof != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                A11.append(str2);
                A11.append(sof.A0J);
                sof = (SOF) sq2.A06.A05(sof.A08);
                if (sof == null) {
                    break;
                }
                str2 = "->";
            }
            A11.append(str);
            A11.append("\n");
        }
        List list = this.A0M;
        if (!list.isEmpty()) {
            A11.append(str);
            A11.append("\tMasks: ");
            A11.append(list.size());
            A11.append("\n");
        }
        int i2 = this.A06;
        if (i2 != 0 && (i = this.A05) != 0) {
            A11.append(str);
            A11.append("\tBackground: ");
            A11.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.A04)));
        }
        List list2 = this.A0N;
        if (!list2.isEmpty()) {
            A11.append(str);
            A11.append("\tShapes:\n");
            for (Object obj : list2) {
                A11.append(str);
                A11.append("\t\t");
                A11.append(obj);
                A11.append("\n");
            }
        }
        return A11.toString();
    }

    public SOF(SQ2 sq2, C58799QAg c58799QAg, C58805QAm c58805QAm, SHA sha, Ss5 ss5, SAK sak, SI6 si6, Integer num, Integer num2, Integer num3, String str, String str2, List list, List list2, List list3, float f, float f2, float f3, float f4, int i, int i2, int i3, long j, long j2, boolean z) {
        this.A0N = list;
        this.A09 = sq2;
        this.A0J = str;
        this.A07 = j;
        this.A0H = num;
        this.A08 = j2;
        this.A0K = str2;
        this.A0M = list2;
        this.A0D = ss5;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = i3;
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A0B = c58805QAm;
        this.A0C = sha;
        this.A0L = list3;
        this.A0I = num2;
        this.A0A = c58799QAg;
        this.A0O = z;
        this.A0E = sak;
        this.A0F = si6;
        this.A0G = num3;
    }
}
