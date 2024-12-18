package X;

import android.util.Base64;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.bugreporter.source.BugReportSource;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class OWg {
    public AttachmentCounter A01;
    public AttachmentCounter A02;
    public AttachmentCounter A03;
    public AttachmentCounter A04;
    public File A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0K = AbstractC166987dD.A1E();
    public List A0L = AbstractC166987dD.A1E();
    public List A0J = AbstractC166987dD.A1E();
    public List A0M = C16930sl.A00;
    public BugReportSource A00 = BugReportSource.A0K;
    public Map A0N = AbstractC166987dD.A1G();
    public boolean A0O = true;

    public final void A02(BugReport bugReport) {
        C14360o3.A0B(bugReport, 0);
        this.A0A = bugReport.A0A;
        this.A07 = bugReport.A07;
        this.A0K = bugReport.A0K;
        this.A0L = bugReport.A0L;
        this.A0J = bugReport.A0J;
        this.A0M = bugReport.A0M;
        this.A08 = bugReport.A08;
        this.A09 = bugReport.A09;
        this.A0I = bugReport.A0I;
        this.A06 = bugReport.A06;
        this.A00 = bugReport.A00;
        this.A0N = bugReport.A0N;
        A00(this, bugReport, bugReport.A0O);
    }

    public static void A00(OWg oWg, BugReport bugReport, boolean z) {
        oWg.A0O = z;
        oWg.A0H = bugReport.A0H;
        oWg.A0B = bugReport.A0B;
        oWg.A0D = bugReport.A0D;
        oWg.A0C = bugReport.A0C;
        oWg.A0E = bugReport.A0E;
        oWg.A0F = bugReport.A0F;
        oWg.A0G = bugReport.A0G;
        oWg.A01 = bugReport.A01;
        oWg.A02 = bugReport.A02;
        oWg.A03 = bugReport.A03;
        oWg.A04 = bugReport.A04;
        oWg.A05 = bugReport.A05;
    }

    public final BugReport A01() {
        C3R9[] c3r9Arr = BugReport.A0P;
        String str = this.A0A;
        String str2 = this.A07;
        List list = this.A0K;
        List list2 = this.A0L;
        List list3 = this.A0J;
        List list4 = this.A0M;
        String str3 = this.A08;
        String str4 = this.A09;
        String str5 = this.A0I;
        String str6 = this.A06;
        BugReportSource bugReportSource = this.A00;
        Map map = this.A0N;
        boolean z = this.A0O;
        String str7 = this.A0H;
        String str8 = this.A0B;
        String str9 = this.A0D;
        String str10 = this.A0C;
        String str11 = this.A0E;
        String str12 = this.A0F;
        String str13 = this.A0G;
        if (str13 == null) {
            byte[] bArr = new byte[15];
            AbstractC50712Us.A00.A0B(bArr);
            String encodeToString = Base64.encodeToString(bArr, 0);
            C14360o3.A07(encodeToString);
            str13 = AbstractC25228BEl.A1A(encodeToString);
            this.A0G = str13;
        }
        return new BugReport(bugReportSource, this.A01, this.A02, this.A03, this.A04, this.A05, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, list2, list3, list4, map, z);
    }

    public OWg() {
        SerialDescriptor serialDescriptor = AttachmentCounter.A01;
        this.A01 = new AttachmentCounter(AbstractC166987dD.A1E());
        this.A02 = new AttachmentCounter(AbstractC166987dD.A1E());
        this.A03 = new AttachmentCounter(AbstractC166987dD.A1E());
        this.A04 = new AttachmentCounter(AbstractC166987dD.A1E());
    }
}
