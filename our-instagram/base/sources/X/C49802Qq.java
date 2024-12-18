package X;

import java.io.File;

/* renamed from: X.2Qq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C49802Qq implements Comparable {
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final File A05;
    public final String A06;
    public final boolean A07;
    public volatile long A08;

    @Override // java.lang.Comparable
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C49802Qq c49802Qq) {
        String str = this.A06;
        String str2 = c49802Qq.A06;
        if (!str.equals(str2)) {
            return str.compareTo(str2);
        }
        long j = this.A04 - c49802Qq.A04;
        if (j == 0) {
            return 0;
        }
        if (j >= 0) {
            return 1;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CacheSpan{");
        sb.append(this.A06);
        sb.append(" lat:");
        sb.append(this.A02);
        sb.append(" pos: ");
        sb.append(this.A04);
        sb.append(" size: ");
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }

    public C49802Qq(File file, String str, long j, long j2, long j3, boolean z) {
        this.A06 = str;
        this.A04 = j;
        this.A03 = j2;
        this.A07 = z;
        this.A05 = file;
        this.A02 = j3;
        this.A01 = -1L;
        this.A08 = -1L;
    }

    public C49802Qq(File file, String str, long j, long j2, long j3) {
        this.A06 = str;
        this.A04 = j;
        this.A03 = j2;
        this.A07 = file != null;
        this.A05 = file;
        this.A02 = j3;
    }
}
