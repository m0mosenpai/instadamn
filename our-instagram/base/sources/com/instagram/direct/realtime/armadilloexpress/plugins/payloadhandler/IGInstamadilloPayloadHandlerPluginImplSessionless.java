package com.instagram.direct.realtime.armadilloexpress.plugins.payloadhandler;

import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC43592JPx;
import X.AbstractC60877RXa;
import X.AbstractC64538TIu;
import X.C45370K6d;
import X.C45377K6k;
import X.C45383K6q;
import X.C45385K6s;
import X.C46908Kop;
import X.JQ0;
import X.RWI;
import X.RYn;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.OriginalTransportPayload;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import java.util.List;

/* loaded from: classes8.dex */
public final class IGInstamadilloPayloadHandlerPluginImplSessionless extends Sessionless {
    public static final C46908Kop Companion = new Object();

    @Deprecated
    public static final String TAG = "IGInstamadilloPayloadHandlerPluginImplSessionless";

    private final TransportPayload createSupplementalPayloadWithOriginalPayload(String str, byte[] bArr, boolean z) {
        C45370K6d c45370K6d = (C45370K6d) SupplementMessageContent.DEFAULT_INSTANCE.A0I();
        AbstractC60877RXa A0I = OriginalTransportPayload.DEFAULT_INSTANCE.A0I();
        RWI A01 = AbstractC64538TIu.A01(bArr, 0, bArr.length);
        OriginalTransportPayload originalTransportPayload = (OriginalTransportPayload) AbstractC43592JPx.A0K(A0I);
        originalTransportPayload.bitField0_ |= 1;
        originalTransportPayload.originalTransportPayload_ = A01;
        SupplementMessageContent supplementMessageContent = (SupplementMessageContent) AbstractC43592JPx.A0K(c45370K6d);
        RYn A02 = A0I.A02();
        A02.getClass();
        supplementMessageContent.supplementMessageContent_ = A02;
        supplementMessageContent.supplementMessageContentCase_ = 5;
        C45383K6q c45383K6q = (C45383K6q) TransportPayload.DEFAULT_INSTANCE.A0I();
        C45385K6s c45385K6s = (C45385K6s) SupplementMessagePayload.DEFAULT_INSTANCE.A0I();
        c45385K6s.A07(str);
        c45385K6s.A06(c45370K6d);
        c45383K6q.A07(c45385K6s);
        if (z) {
            c45383K6q.A08(true);
        }
        return (TransportPayload) AbstractC43592JPx.A0L(c45383K6q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r1 != 2) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.instagram.direct.armadilloexpress.transportpayload.TransportPayload removeLinksAndRepack(byte[] r11) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.realtime.armadilloexpress.plugins.payloadhandler.IGInstamadilloPayloadHandlerPluginImplSessionless.removeLinksAndRepack(byte[]):com.instagram.direct.armadilloexpress.transportpayload.TransportPayload");
    }

    private final C45377K6k clearDirectPath(CommonMediaTransport commonMediaTransport) {
        C45377K6k c45377K6k = (C45377K6k) commonMediaTransport.A0J();
        CommonMediaTransport A0P = JQ0.A0P(c45377K6k);
        A0P.bitField0_ &= -17;
        CommonMediaTransport commonMediaTransport2 = CommonMediaTransport.DEFAULT_INSTANCE;
        A0P.directPath_ = commonMediaTransport2.directPath_;
        CommonMediaTransport A0P2 = JQ0.A0P(c45377K6k);
        A0P2.bitField0_ &= -3;
        A0P2.fileSha256_ = commonMediaTransport2.fileSha256_;
        return c45377K6k;
    }

    @Override // com.instagram.direct.realtime.armadilloexpress.plugins.payloadhandler.Sessionless
    public List IGInstamadilloPayloadHandlerPluginImpl_InstamadilloPayloadHandlingCreateSplitRavenPayload(String str, byte[] bArr, long j) {
        AbstractC167017dG.A1N(str, bArr);
        TransportPayload removeLinksAndRepack = removeLinksAndRepack(bArr);
        if (removeLinksAndRepack == null) {
            return null;
        }
        return AbstractC16960so.A1Q(removeLinksAndRepack.A0H(), createSupplementalPayloadWithOriginalPayload(str, bArr, removeLinksAndRepack.openEb_).A0H());
    }
}
