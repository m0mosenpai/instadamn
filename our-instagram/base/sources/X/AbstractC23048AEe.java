package X;

/* renamed from: X.AEe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23048AEe {
    public static boolean A00(C44059Jdk c44059Jdk, C7FH c7fh, long j, long j2, boolean z) {
        int i;
        long j3 = c44059Jdk.A03;
        if (j3 < 0) {
            C11T.A02(new RunnableC24712Awt(c7fh, 2131976703));
            return false;
        }
        if (j3 == -2) {
            i = 2131976697;
        } else if (z && j3 < j) {
            i = 2131976702;
        } else if (j3 > j2) {
            C0w9.A03("Import long clip", String.valueOf(j3));
            i = 2131976701;
        } else {
            return true;
        }
        C11T.A02(new RunnableC24712Awt(c7fh, i));
        return false;
    }

    public static boolean A01(C44059Jdk c44059Jdk, C7FH c7fh, boolean z, boolean z2) {
        int i;
        long j = c44059Jdk.A03;
        if (j < 0) {
            C11T.A02(new RunnableC24712Awt(c7fh, 2131976703));
            return false;
        }
        if (j == -2) {
            i = 2131976697;
        } else if (z && j < 500) {
            i = 2131976702;
        } else if (z2 && j > 600000) {
            C0w9.A03("Import long clip", String.valueOf(j));
            i = 2131976701;
        } else {
            return true;
        }
        C11T.A02(new RunnableC24712Awt(c7fh, i));
        return false;
    }
}
