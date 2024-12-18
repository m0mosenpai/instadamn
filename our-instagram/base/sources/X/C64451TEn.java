package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.TEn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64451TEn implements C26H {
    public final LinkedList A00 = AbstractC58318PtA.A11();

    @Override // X.C26H
    public final Map B3s(UserSession userSession, File file) {
        C14360o3.A0B(file, 1);
        File A0w = MSW.A0w(file, "direct_search.txt");
        Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(A0w), C15W.A05);
        if (!(outputStreamWriter instanceof BufferedWriter)) {
            outputStreamWriter = new BufferedWriter(outputStreamWriter, 8192);
        }
        PrintWriter printWriter = new PrintWriter(outputStreamWriter);
        try {
            synchronized (this) {
                while (true) {
                    LinkedList linkedList = this.A00;
                    if (!linkedList.isEmpty()) {
                        C09530e4 c09530e4 = (C09530e4) linkedList.remove();
                        printWriter.write(StringFormatUtil.formatStrLocaleSafe("Search query: %-30s", c09530e4.A00));
                        printWriter.write("\n");
                        Iterator A1J = AbstractC25226BEj.A1J(c09530e4.A01);
                        while (A1J.hasNext()) {
                            printWriter.write(StringFormatUtil.formatStrLocaleSafe(AnonymousClass001.A0C(((DirectSearchResult) A1J.next()).AEL(), '\n')));
                        }
                    }
                }
            }
            printWriter.close();
            return AbstractC167007dF.A0n(A0w.getName(), android.net.Uri.fromFile(A0w));
        } finally {
        }
    }

    @Override // X.C26H
    public final boolean CLD(UserSession userSession, String str) {
        return true;
    }

    @Override // X.C26H
    public final void Ega(long j) {
    }

    @Override // X.C26H
    public final String getTag() {
        return "DirectSearchFlytrapExtrasProvider";
    }
}
