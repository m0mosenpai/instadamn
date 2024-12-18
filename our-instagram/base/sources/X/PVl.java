package X;

import com.facebook.react.bridge.BaseJavaModule;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes9.dex */
public final /* synthetic */ class PVl implements InterfaceC73823Sp {
    public static final PVl A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = BugReportAttachment.A05;
        String str = null;
        String str2 = null;
        BugReportAttachmentMediaType bugReportAttachmentMediaType = null;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource = null;
        boolean z = false;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz != 3) {
                                if (ANz == 4) {
                                    z = ADQ.ANs(serialDescriptor, 4);
                                    i |= 16;
                                } else {
                                    throw new X6K(ANz);
                                }
                            } else {
                                bugReportAttachmentMediaSource = (BugReportAttachmentMediaSource) MSW.A12(bugReportAttachmentMediaSource, serialDescriptor, ADQ, c3r9Arr, 3);
                                i |= 8;
                            }
                        } else {
                            bugReportAttachmentMediaType = (BugReportAttachmentMediaType) MSW.A12(bugReportAttachmentMediaType, serialDescriptor, ADQ, c3r9Arr, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = ADQ.AOK(serialDescriptor, 1);
                        i |= 2;
                    }
                } else {
                    str = ADQ.AOK(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new BugReportAttachment(bugReportAttachmentMediaSource, bugReportAttachmentMediaType, str, str2, i, z);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.3Sp, java.lang.Object, X.PVl] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.meta.flytrap.attachment.model.BugReportAttachment", obj, 5);
        c73833Sq.A00("path");
        c73833Sq.A00("generatorName");
        c73833Sq.A00("mediaType");
        c73833Sq.A00("mediaSource");
        c73833Sq.A01(BaseJavaModule.METHOD_TYPE_ASYNC, true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = BugReportAttachment.A05;
        C3RD c3rd = C3RD.A01;
        return new C3R9[]{c3rd, c3rd, c3r9Arr[2], c3r9Arr[3], C3SL.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BugReportAttachment bugReportAttachment = (BugReportAttachment) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, bugReportAttachment);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = BugReportAttachment.A05;
        ADR.ASL(bugReportAttachment.A03, serialDescriptor, 0);
        ADR.ASL(bugReportAttachment.A02, serialDescriptor, A1R ? 1 : 0);
        ADR.ASH(bugReportAttachment.A01, c3r9Arr[2], serialDescriptor, 2);
        ADR.ASH(bugReportAttachment.A00, c3r9Arr[3], serialDescriptor, 3);
        if (ADR.EiY(serialDescriptor, 4) || bugReportAttachment.A04 != A1R) {
            ADR.AS2(serialDescriptor, 4, bugReportAttachment.A04);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
