package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.ReceiverFetchXma;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.model.DirectForwardingParams;

/* loaded from: classes8.dex */
public final class LGK {
    public static final LGK A00 = new Object();

    public final TransportPayload A00(C44920JuY c44920JuY, UserSession userSession, Media media, DirectForwardingParams directForwardingParams, AbstractC29011ae abstractC29011ae, String str) {
        AbstractC167017dG.A1P(c44920JuY, abstractC29011ae);
        String A19 = AbstractC166987dD.A19(c44920JuY.A00);
        AbstractC60877RXa A0I = ReceiverFetchXma.DEFAULT_INSTANCE.A0I();
        ReceiverFetchXma receiverFetchXma = (ReceiverFetchXma) AbstractC43592JPx.A0K(A0I);
        receiverFetchXma.bitField0_ |= 1;
        receiverFetchXma.contentRef_ = A19;
        if (str != null) {
            ReceiverFetchXma receiverFetchXma2 = (ReceiverFetchXma) AbstractC43592JPx.A0K(A0I);
            receiverFetchXma2.bitField0_ |= 2;
            receiverFetchXma2.text_ = str;
        }
        if (media != null) {
            ReceiverFetchXma receiverFetchXma3 = (ReceiverFetchXma) AbstractC43592JPx.A0K(A0I);
            receiverFetchXma3.media_ = media;
            receiverFetchXma3.bitField0_ |= 4;
        }
        C45376K6j A002 = AddMessageContent.A00();
        JQ1.A0B(A002, A0I).addMessageContentCase_ = 4;
        return A01(userSession, (AddMessageContent) AbstractC43592JPx.A0L(A002), directForwardingParams, null, abstractC29011ae);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (X.C6X6.A0L(r14, r7, true) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ec, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r2 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.direct.armadilloexpress.transportpayload.TransportPayload A01(com.instagram.common.session.UserSession r14, com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent r15, com.instagram.direct.model.DirectForwardingParams r16, X.C47588Kzy r17, X.AbstractC29011ae r18) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LGK.A01(com.instagram.common.session.UserSession, com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent, com.instagram.direct.model.DirectForwardingParams, X.Kzy, X.1ae):com.instagram.direct.armadilloexpress.transportpayload.TransportPayload");
    }
}
