package X;

import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LBC {
    public static final List A00(android.net.Uri uri, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(uri, 0);
        List A00 = AbstractC46658Kkb.A00(abstractC12990ll, AbstractC53645Nnq.A00(uri), C50351MLd.A00);
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            A0q.add(android.net.Uri.fromFile((File) it.next()));
        }
        return A0q;
    }

    public static final List A01(AbstractC12990ll abstractC12990ll, BugReportAttachment bugReportAttachment) {
        boolean A1a = AbstractC167017dG.A1a(bugReportAttachment, abstractC12990ll);
        List A00 = AbstractC46658Kkb.A00(abstractC12990ll, AbstractC166987dD.A11(bugReportAttachment.A03), C50351MLd.A00);
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            String canonicalPath = ((File) it.next()).getCanonicalPath();
            C14360o3.A07(canonicalPath);
            String str = bugReportAttachment.A02;
            BugReportAttachmentMediaType bugReportAttachmentMediaType = bugReportAttachment.A01;
            BugReportAttachmentMediaSource bugReportAttachmentMediaSource = bugReportAttachment.A00;
            boolean z = bugReportAttachment.A04;
            AbstractC25233BEq.A0v(A1a ? 1 : 0, str, bugReportAttachmentMediaType, bugReportAttachmentMediaSource);
            A0q.add(new BugReportAttachment(bugReportAttachmentMediaSource, bugReportAttachmentMediaType, canonicalPath, str, z));
        }
        return A0q;
    }
}
