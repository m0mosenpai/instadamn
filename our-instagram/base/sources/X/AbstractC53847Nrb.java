package X;

import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nrb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53847Nrb {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        BugReportSource bugReportSource;
        UserSession A01 = AbstractC03270Dk.A01(C6BQ.A0B(c6fq));
        Object A10 = MSW.A10(c6fw, 1);
        if (A10 == null || (bugReportSource = (BugReportSource) BugReportSource.A01.get(A10)) == null) {
            bugReportSource = BugReportSource.A0J;
        }
        if (bugReportSource == BugReportSource.A0J) {
            bugReportSource = BugReportSource.A08;
        }
        if (A01 != null) {
            AbstractC35237FgW.A00(C6BQ.A04(c6fq), bugReportSource, A01);
            return null;
        }
        return null;
    }
}
