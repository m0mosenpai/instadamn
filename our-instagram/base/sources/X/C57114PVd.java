package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.location.platform.api.Location;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.PVd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57114PVd implements InterfaceC73823Sp {
    public static final C57114PVd A00;
    public static final /* synthetic */ C73833Sq A01;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.PVd, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.bugreporter.model.BugReport", obj, 25);
        c73833Sq.A00(DevServerEntity.COLUMN_DESCRIPTION);
        c73833Sq.A00("additionalDescription");
        c73833Sq.A00("screenCaptureAttachments");
        c73833Sq.A00("screenCaptureChunkAttachments");
        c73833Sq.A00("otherAttachments");
        c73833Sq.A00("syncAttachments");
        c73833Sq.A00("categoryId");
        c73833Sq.A00("customConfigId");
        c73833Sq.A00("userId");
        c73833Sq.A00("adId");
        c73833Sq.A01(CacheBehaviorLogger.SOURCE, true);
        c73833Sq.A00(Location.EXTRAS);
        c73833Sq.A00("areCompleteLogsEnabled");
        c73833Sq.A00("screenRageShakingFrom");
        c73833Sq.A00("navChain");
        c73833Sq.A00("notifName");
        c73833Sq.A00("notifAggId");
        c73833Sq.A00("notificationType");
        c73833Sq.A00("promotionId");
        c73833Sq.A00("reportId");
        c73833Sq.A00("screenshotsAdded");
        c73833Sq.A00("screenshotsRemoved");
        c73833Sq.A00("videosAdded");
        c73833Sq.A00("videosRemoved");
        c73833Sq.A00("viewHierarchyDump");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = BugReport.A0P;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), c3r9Arr[2], c3r9Arr[3], c3r9Arr[4], c3r9Arr[5], AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), c3r9Arr[10], c3r9Arr[11], C3SL.A00, AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), AbstractC192698gB.A00(c3rd), c3rd, c3r9Arr[20], c3r9Arr[21], c3r9Arr[22], c3r9Arr[23], AbstractC192698gB.A00(C71702WzB.A00)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x003f. Please report as an issue. */
    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i;
        C14360o3.A0B(decoder, 0);
        C73833Sq c73833Sq = A01;
        C3T8 ADQ = decoder.ADQ(c73833Sq);
        C3R9[] c3r9Arr = BugReport.A0P;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        File file = null;
        AttachmentCounter attachmentCounter = null;
        AttachmentCounter attachmentCounter2 = null;
        String str6 = null;
        AttachmentCounter attachmentCounter3 = null;
        AttachmentCounter attachmentCounter4 = null;
        Map map = null;
        String str7 = null;
        String str8 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        BugReportSource bugReportSource = null;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int ANz = ADQ.ANz(c73833Sq);
            switch (ANz) {
                case -1:
                    ADQ.ASc(c73833Sq);
                    return new BugReport(bugReportSource, attachmentCounter4, attachmentCounter2, attachmentCounter, attachmentCounter3, file, str7, str8, str10, str11, str12, str13, str, str2, str3, str5, str6, str4, str9, list, list2, list3, list4, map, i2, z);
                case 0:
                    str7 = (String) ADQ.AOE(str7, C3RD.A01, c73833Sq, 0);
                    i2 |= 1;
                case 1:
                    str8 = (String) ADQ.AOE(str8, C3RD.A01, c73833Sq, 1);
                    i2 |= 2;
                case 2:
                    list = (List) MSW.A12(list, c73833Sq, ADQ, c3r9Arr, 2);
                    i2 |= 4;
                case 3:
                    list2 = (List) MSW.A12(list2, c73833Sq, ADQ, c3r9Arr, 3);
                    i2 |= 8;
                case 4:
                    list3 = (List) MSW.A12(list3, c73833Sq, ADQ, c3r9Arr, 4);
                    i2 |= 16;
                case 5:
                    list4 = (List) MSW.A12(list4, c73833Sq, ADQ, c3r9Arr, 5);
                    i2 |= 32;
                case 6:
                    str10 = (String) ADQ.AOE(str10, C3RD.A01, c73833Sq, 6);
                    i2 |= 64;
                case 7:
                    str11 = (String) ADQ.AOE(str11, C3RD.A01, c73833Sq, 7);
                    i2 |= 128;
                case 8:
                    str12 = (String) ADQ.AOE(str12, C3RD.A01, c73833Sq, 8);
                    i2 |= 256;
                case 9:
                    str13 = (String) ADQ.AOE(str13, C3RD.A01, c73833Sq, 9);
                    i2 |= 512;
                case 10:
                    bugReportSource = (BugReportSource) MSW.A12(bugReportSource, c73833Sq, ADQ, c3r9Arr, 10);
                    i2 |= 1024;
                case 11:
                    map = (Map) MSW.A12(map, c73833Sq, ADQ, c3r9Arr, 11);
                    i2 |= C3OO.FLAG_MOVED;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    z = ADQ.ANs(c73833Sq, 12);
                    i2 |= 4096;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str = (String) ADQ.AOE(str, C3RD.A01, c73833Sq, 13);
                    i2 |= 8192;
                case 14:
                    str2 = (String) ADQ.AOE(str2, C3RD.A01, c73833Sq, 14);
                    i2 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
                case Process.SIGTERM /* 15 */:
                    str3 = (String) ADQ.AOE(str3, C3RD.A01, c73833Sq, 15);
                    i = Constants.LOAD_RESULT_PGO;
                    i2 |= i;
                case 16:
                    str5 = (String) ADQ.AOE(str5, C3RD.A01, c73833Sq, 16);
                    i = Constants.LOAD_RESULT_PGO_ATTEMPTED;
                    i2 |= i;
                case 17:
                    str6 = (String) ADQ.AOE(str6, C3RD.A01, c73833Sq, 17);
                    i = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
                    i2 |= i;
                case 18:
                    str4 = (String) ADQ.AOE(str4, C3RD.A01, c73833Sq, 18);
                    i = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
                    i2 |= i;
                case Process.SIGSTOP /* 19 */:
                    str9 = ADQ.AOK(c73833Sq, 19);
                    i = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
                    i2 |= i;
                case 20:
                    attachmentCounter4 = (AttachmentCounter) MSW.A12(attachmentCounter4, c73833Sq, ADQ, c3r9Arr, 20);
                    i = 1048576;
                    i2 |= i;
                case 21:
                    attachmentCounter2 = (AttachmentCounter) MSW.A12(attachmentCounter2, c73833Sq, ADQ, c3r9Arr, 21);
                    i = 2097152;
                    i2 |= i;
                case 22:
                    attachmentCounter = (AttachmentCounter) MSW.A12(attachmentCounter, c73833Sq, ADQ, c3r9Arr, 22);
                    i = 4194304;
                    i2 |= i;
                case 23:
                    attachmentCounter3 = (AttachmentCounter) MSW.A12(attachmentCounter3, c73833Sq, ADQ, c3r9Arr, 23);
                    i = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
                    i2 |= i;
                case 24:
                    file = (File) ADQ.AOE(file, C71702WzB.A00, c73833Sq, 24);
                    i = 16777216;
                    i2 |= i;
                default:
                    throw new X6K(ANz);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BugReport bugReport = (BugReport) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, bugReport);
        C73833Sq c73833Sq = A01;
        C4D8 ADR = encoder.ADR(c73833Sq);
        C3R9[] c3r9Arr = BugReport.A0P;
        C3RD c3rd = C3RD.A01;
        ADR.ASG(bugReport.A0A, c3rd, c73833Sq, 0);
        ADR.ASG(bugReport.A07, c3rd, c73833Sq, A1R ? 1 : 0);
        ADR.ASH(bugReport.A0K, c3r9Arr[2], c73833Sq, 2);
        ADR.ASH(bugReport.A0L, c3r9Arr[3], c73833Sq, 3);
        ADR.ASH(bugReport.A0J, c3r9Arr[4], c73833Sq, 4);
        ADR.ASH(bugReport.A0M, c3r9Arr[5], c73833Sq, 5);
        ADR.ASG(bugReport.A08, c3rd, c73833Sq, 6);
        ADR.ASG(bugReport.A09, c3rd, c73833Sq, 7);
        ADR.ASG(bugReport.A0I, c3rd, c73833Sq, 8);
        ADR.ASG(bugReport.A06, c3rd, c73833Sq, 9);
        if (ADR.EiY(c73833Sq, 10) || bugReport.A00 != BugReportSource.A0K) {
            ADR.ASH(bugReport.A00, c3r9Arr[10], c73833Sq, 10);
        }
        ADR.ASH(bugReport.A0N, c3r9Arr[11], c73833Sq, 11);
        ADR.AS2(c73833Sq, 12, bugReport.A0O);
        ADR.ASG(bugReport.A0H, c3rd, c73833Sq, 13);
        ADR.ASG(bugReport.A0B, c3rd, c73833Sq, 14);
        ADR.ASG(bugReport.A0D, c3rd, c73833Sq, 15);
        ADR.ASG(bugReport.A0C, c3rd, c73833Sq, 16);
        ADR.ASG(bugReport.A0E, c3rd, c73833Sq, 17);
        ADR.ASG(bugReport.A0F, c3rd, c73833Sq, 18);
        ADR.ASL(bugReport.A0G, c73833Sq, 19);
        ADR.ASH(bugReport.A01, c3r9Arr[20], c73833Sq, 20);
        ADR.ASH(bugReport.A02, c3r9Arr[21], c73833Sq, 21);
        ADR.ASH(bugReport.A03, c3r9Arr[22], c73833Sq, 22);
        ADR.ASH(bugReport.A04, c3r9Arr[23], c73833Sq, 23);
        ADR.ASG(bugReport.A05, C71702WzB.A00, c73833Sq, 24);
        ADR.ASc(c73833Sq);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
