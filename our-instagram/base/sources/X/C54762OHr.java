package X;

import com.instagram.bugreporter.model.BugReport;
import java.io.File;

/* renamed from: X.OHr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54762OHr {
    public final OVY A00;
    public final AbstractC12990ll A01;

    public C54762OHr(BugReport bugReport, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 2);
        this.A01 = abstractC12990ll;
        this.A00 = new OVY(bugReport.A0G);
    }

    public final File A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        OVY ovy = this.A00;
        if (str2 == null) {
            str2 = "";
        }
        File A0w = MSW.A0w(ovy.A00(), AnonymousClass001.A0R(str, str2));
        MSZ.A1N(A0w);
        return A0w;
    }
}
