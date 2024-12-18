package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0tM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17260tM {
    public final UserSession A00;
    public final String A01;

    public C17260tM(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    public static void A00(final C0VP c0vp, C17260tM c17260tM, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final File file = (File) it.next();
            final UserSession userSession = c17260tM.A00;
            C1ON A01 = AbstractC19790y8.A01(userSession, file, c17260tM.A01);
            A01.A00 = new C1P1(c0vp, userSession, file) { // from class: X.0yE
                public final C0VP A00;
                public final UserSession A01;
                public final File A02;

                {
                    this.A01 = userSession;
                    this.A00 = c0vp;
                    this.A02 = file;
                }

                @Override // X.C1P1
                public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(138833177);
                    C10V A00 = C06570Wi.A00();
                    File file2 = this.A02;
                    A00.A02(file2.getName(), 1, "IgProfiloUploadService", "Trace Upload Failed: %s (reason = %d)");
                    this.A00.DxL(file2, 1);
                    C0f9.A0A(1293271867, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                    int A03 = C0f9.A03(-282534470);
                    int A032 = C0f9.A03(2124963490);
                    C10V A00 = C06570Wi.A00();
                    File file2 = this.A02;
                    A00.A03("IgProfiloUploadService", file2.getName(), "Trace Upload Success: %s");
                    this.A00.DxO(file2);
                    if (C18U.A06(C06090Tz.A05, this.A01, 36319884132490982L) && file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                    C0f9.A0A(-1073266850, A032);
                    C0f9.A0A(1369479747, A03);
                }
            };
            C1GJ.A03(A01);
        }
    }
}
