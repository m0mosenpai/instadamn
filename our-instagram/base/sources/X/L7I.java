package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;
import java.util.Map;

/* loaded from: classes8.dex */
public final class L7I {
    public final UserSession A00;
    public final C7X3 A01;
    public final C8M2 A02;

    public final void A00(AnonymousClass442 anonymousClass442, DirectShareTarget directShareTarget, Integer num, Integer num2, Long l, Long l2, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Boolean bool;
        Integer num3;
        InterfaceC83713oG interfaceC83713oG;
        LocalSendSpeedMessageTypes localSendSpeedMessageTypes;
        boolean z6;
        String str2;
        C3o9 A02;
        C3o9 A022;
        int intValue = num2.intValue();
        if (intValue != 2 && intValue != 3 && intValue != 7) {
            throw AbstractC166987dD.A1D(AnonymousClass001.A0R(AbstractC58317Pt9.A00(644), AbstractC46895Koc.A00(num2)));
        }
        Integer A01 = AHZ.A01(num2);
        C7X3 c7x3 = this.A01;
        C8M2 c8m2 = this.A02;
        Long l3 = null;
        EnumC92794Ds A012 = c8m2.A01(directShareTarget, null, A01, z, false);
        C3o9 c3o9 = null;
        if (directShareTarget != null) {
            bool = Boolean.valueOf(directShareTarget.A0M());
        } else {
            bool = null;
        }
        if (num == null) {
            if (directShareTarget != null) {
                num3 = Integer.valueOf(directShareTarget.A01);
            } else {
                num3 = null;
            }
        } else {
            num3 = num;
        }
        Map A00 = C8M2.A00(Boolean.valueOf(z), z2, z3);
        Map A0n = AbstractC167007dF.A0n("ephemeral_lifetime_ms", l);
        if (directShareTarget != null) {
            interfaceC83713oG = directShareTarget.A01();
            c3o9 = directShareTarget.A02();
        } else {
            interfaceC83713oG = null;
        }
        c7x3.A00(A012, interfaceC83713oG, bool, c8m2.A02(c3o9, null, A01, z, false), num2, num3, str, A00, A0n);
        if (i != 0) {
            c7x3.A01.markerAnnotate(c7x3.A00, str.hashCode(), "send_group_size", i);
        }
        switch (intValue) {
            case 2:
                localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.PHOTO;
                break;
            case 3:
                localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.VIDEO;
                break;
            case 4:
            default:
                localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.TEXT;
                break;
            case 5:
                localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.GIF;
                break;
            case 6:
                localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.STICKER;
                break;
            case 7:
                localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.COLLECTION;
                break;
        }
        Integer A013 = AHZ.A01(num2);
        int hashCode = str.hashCode();
        UserSession userSession = this.A00;
        C46103Kb3 A014 = C7R5.A01(userSession, hashCode);
        if (A014 != null) {
            boolean z7 = false;
            if (directShareTarget != null) {
                z6 = directShareTarget.A0M();
            } else {
                z6 = false;
            }
            A014.onStartFlow(z6);
            A014.annotateMessageType(localSendSpeedMessageTypes);
            A014.annotateLocalDataId(str);
            A014.onLogDataProcessingStart();
            if (directShareTarget != null) {
                str2 = AbstractC92784Dr.A02(directShareTarget.A01());
            } else {
                str2 = null;
            }
            A014.annotateOpenThreadId(str2);
            if (directShareTarget != null) {
                l3 = AbstractC92784Dr.A01(directShareTarget.A01());
            }
            A014.annotateOccamadilloThreadId(l3);
            if (num != null || (directShareTarget != null && (num = Integer.valueOf(directShareTarget.A01)) != null)) {
                int intValue2 = num.intValue();
                A014.annotateThreadType(intValue2, C4GR.A00(intValue2));
            }
            A014.annotateIsReply(AbstractC167007dF.A1W(anonymousClass442));
            if (anonymousClass442 != null) {
                A014.annotateReplyToType(anonymousClass442.A0F.A00);
                if ((directShareTarget == null || (A022 = directShareTarget.A02()) == null || !(A022 instanceof MsysThreadId)) && !anonymousClass442.A05()) {
                    z7 = true;
                }
            }
            EnumC92794Ds A015 = c8m2.A01(directShareTarget, Boolean.valueOf(z4), A013, z, z7);
            A014.annotateTransportType(A015.A00);
            A014.annotateIsEncrypted(AbstractC167007dF.A1X(A015, EnumC92794Ds.A04));
            A014.annotateIsVm(z);
            A014.annotateIsDm(z4);
            A014.annotateAfterSendEphemeralLifetimeMs(l);
            A014.annotateAfterViewedEphemeralLifetimeMs(l2);
            A014.annotateIsInstamadillo(z5);
            if (directShareTarget != null && (A02 = directShareTarget.A02()) != null) {
                A014.annotateIsMsys(A02 instanceof MsysThreadId);
            }
            A014.onLogTransportMessageStart();
            if (i != 0) {
                A014.annotateSendGroupSize(i);
            }
            A014.annotateMediaPreviewEnabled(AbstractC46749Km6.A00(userSession));
        }
    }

    public /* synthetic */ L7I(UserSession userSession) {
        C7X3 A00 = C7X2.A00(userSession);
        C8M2 c8m2 = new C8M2(userSession);
        AbstractC167017dG.A1P(userSession, A00);
        this.A00 = userSession;
        this.A01 = A00;
        this.A02 = c8m2;
    }
}
