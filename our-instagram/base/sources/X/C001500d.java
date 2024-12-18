package X;

import java.util.zip.ZipEntry;

/* renamed from: X.00d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C001500d extends C09240dZ implements Comparable {
    public final int A00;
    public final ZipEntry A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C001500d c001500d = (C001500d) obj;
            if (!this.A01.equals(c001500d.A01) || this.A00 != c001500d.A00) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return super.A01.compareTo(((C09240dZ) obj).A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public C001500d(String str, ZipEntry zipEntry, int i) {
        super(str, String.valueOf(zipEntry.getCrc()));
        this.A01 = zipEntry;
        this.A00 = i;
    }
}
