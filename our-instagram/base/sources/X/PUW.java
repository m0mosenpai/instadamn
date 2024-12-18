package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class PUW implements Supplier {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    public PUW(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i, long j) {
        this.A00 = i;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A08 = str;
        this.A07 = obj;
        this.A01 = j;
        this.A06 = obj5;
        this.A04 = obj6;
        this.A03 = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [long] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        StringBuilder A11;
        String str;
        long j;
        StringBuilder A112;
        String str2;
        long j2;
        if (this.A00 != 0) {
            OLW olw = (OLW) this.A02;
            Object obj = this.A06;
            olw.A02("view_hierarchy.txt", "ViewHierarchyMetadataTransformer", this.A08);
            UserFlowLogger userFlowLogger = (UserFlowLogger) this.A07;
            long j3 = this.A01;
            AbstractC50523MSb.A1C(userFlowLogger, "ViewHierarchyMetadataTransformer", "_START", j3);
            try {
                BugReport bugReport = (BugReport) this.A03;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A05;
                File A00 = new C54762OHr(bugReport, abstractC12990ll).A00("view_hierarchy.txt", null);
                C55117Obb.A00(abstractC12990ll, (ExecutorService) this.A04, new C57261Pbj(46, bugReport, A00, obj));
                android.net.Uri fromFile = android.net.Uri.fromFile(A00);
                C14360o3.A0A(fromFile);
                C55117Obb.A01(fromFile, abstractC12990ll, true);
                List A002 = LBC.A00(fromFile, abstractC12990ll);
                ArrayList A0q = AbstractC167017dG.A0q(A002);
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    AbstractC50523MSb.A1R(A0q, it);
                }
                Iterator it2 = A0q.iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    if (str3 != null) {
                        AbstractC50523MSb.A1C(userFlowLogger, "ViewHierarchyMetadataTransformer", "_SUCCEEDED", j3);
                        olw.A00(C05F.A00, "view_hierarchy.txt", A00.length());
                        C3R9[] c3r9Arr = BugReportAttachment.A05;
                        j3 = AbstractC166987dD.A1J(new BugReportAttachment(BugReportAttachmentMediaSource.A08, BugReportAttachmentMediaType.A03, str3, "ViewHierarchyMetadataTransformer", true));
                        return j3;
                    }
                    AbstractC50523MSb.A1C(userFlowLogger, "ViewHierarchyMetadataTransformer", "_FAILED_URI_IS_NULL", j3);
                    olw.A01("view_hierarchy.txt", "URI is null");
                }
            } catch (IOException e) {
                e = e;
                C0K8.A0F("BugReportComposerFragment", "Could not create log file for file attachment.", e);
                A112 = AbstractC166997dE.A11("ViewHierarchyMetadataTransformer");
                str2 = "_FAILED_URI_IO_EXCEPTION";
                j2 = j3;
                userFlowLogger.flowMarkPoint(j2, AbstractC166997dE.A0x(str2, A112));
                olw.A01("view_hierarchy.txt", e.toString());
            } catch (ExecutionException e2) {
                e = e2;
                C0K8.A0F("BugReportComposerFragment", "Failed generating attachment", e);
                A112 = AbstractC166997dE.A11("ViewHierarchyMetadataTransformer");
                str2 = "_FAILED_EXECUTION_EXCEPTION";
                j2 = j3;
                userFlowLogger.flowMarkPoint(j2, AbstractC166997dE.A0x(str2, A112));
                olw.A01("view_hierarchy.txt", e.toString());
            } catch (TimeoutException e3) {
                C0K8.A0F("BugReportComposerFragment", AnonymousClass001.A0r("Could not create log file for attachment within timeout of ", "ms for ", "ViewHierarchyMetadataTransformer", C18U.A01(C06090Tz.A05, (AbstractC12990ll) this.A05, 36605770041398613L)), e3);
                AbstractC50523MSb.A1C(userFlowLogger, "ViewHierarchyMetadataTransformer", "_TIMEOUT", j3);
                olw.A01("view_hierarchy.txt", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            }
        } else {
            AnonymousClass266 anonymousClass266 = (AnonymousClass266) this.A05;
            String filenamePrefix = anonymousClass266.getFilenamePrefix();
            String filenameSuffix = anonymousClass266.getFilenameSuffix();
            if (filenameSuffix != null) {
                filenamePrefix = AnonymousClass001.A0R(filenamePrefix, filenameSuffix);
            }
            OLW olw2 = (OLW) this.A02;
            String tag = anonymousClass266.getTag();
            olw2.A02(filenamePrefix, tag, this.A08);
            UserFlowLogger userFlowLogger2 = (UserFlowLogger) this.A07;
            long j4 = this.A01;
            AbstractC50523MSb.A1C(userFlowLogger2, tag, "_START", j4);
            UserSession userSession = (UserSession) this.A06;
            try {
                File file = (File) C55117Obb.A00(userSession, (ExecutorService) this.A04, new C57253Pbb(6, this.A03, anonymousClass266));
                anonymousClass266.FEr(userSession, file);
                android.net.Uri fromFile2 = android.net.Uri.fromFile(file);
                C14360o3.A0A(fromFile2);
                C55117Obb.A01(fromFile2, userSession, anonymousClass266.Bv4());
                List A003 = LBC.A00(fromFile2, userSession);
                ArrayList A0q2 = AbstractC167017dG.A0q(A003);
                Iterator it3 = A003.iterator();
                while (it3.hasNext()) {
                    AbstractC50523MSb.A1R(A0q2, it3);
                }
                Iterator it4 = A0q2.iterator();
                while (it4.hasNext()) {
                    String str4 = (String) it4.next();
                    if (str4 != null) {
                        AbstractC50523MSb.A1C(userFlowLogger2, tag, "_SUCCEEDED", j4);
                        olw2.A00(C05F.A00, filenamePrefix, file.length());
                        C3R9[] c3r9Arr2 = BugReportAttachment.A05;
                        j4 = AbstractC166987dD.A1J(new BugReportAttachment(BugReportAttachmentMediaSource.A08, BugReportAttachmentMediaType.A03, str4, tag, true));
                        return j4;
                    }
                    AbstractC50523MSb.A1C(userFlowLogger2, tag, "_FAILED_URI_IS_NULL", j4);
                    olw2.A01(filenamePrefix, "URI is null");
                }
            } catch (IOException e4) {
                e = e4;
                C0K8.A0F("BugReportComposerFragment", "Could not create log file for file attachment.", e);
                A11 = AbstractC166997dE.A11(tag);
                str = "_FAILED_URI_IO_EXCEPTION";
                j = j4;
                userFlowLogger2.flowMarkPoint(j, AbstractC166997dE.A0x(str, A11));
                olw2.A01(filenamePrefix, e.toString());
            } catch (ExecutionException e5) {
                e = e5;
                C0K8.A0F("BugReportComposerFragment", "Failed generating attachment", e);
                A11 = AbstractC166997dE.A11(tag);
                str = "_FAILED_EXECUTION_EXCEPTION";
                j = j4;
                userFlowLogger2.flowMarkPoint(j, AbstractC166997dE.A0x(str, A11));
                olw2.A01(filenamePrefix, e.toString());
            } catch (TimeoutException e6) {
                C0K8.A0F("BugReportComposerFragment", AnonymousClass001.A0r("Could not create log file for attachment within timeout of ", "ms for ", tag, C18U.A01(C06090Tz.A05, userSession, 36605770041398613L)), e6);
                AbstractC50523MSb.A1C(userFlowLogger2, tag, "_TIMEOUT", j4);
                olw2.A01(filenamePrefix, PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            }
        }
        return C16930sl.A00;
    }
}
