package X;

import java.io.File;

/* renamed from: X.VmH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69371VmH {
    public C69582Vrl A00;
    public boolean A01;
    public File[] A02;
    public File[] A03;
    public final String A04;
    public final long[] A05;
    public final /* synthetic */ C71183WpV A06;

    public C69371VmH(C71183WpV c71183WpV, String str) {
        this.A06 = c71183WpV;
        this.A04 = str;
        int i = c71183WpV.A06;
        this.A05 = new long[i];
        this.A02 = new File[i];
        this.A03 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2 = 1) {
            sb.append(i2);
            File[] fileArr = this.A02;
            File file = c71183WpV.A07;
            fileArr[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.A03[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }
}
