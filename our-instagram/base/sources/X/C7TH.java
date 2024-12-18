package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.7TH, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C7TH {
    void AGT(InterfaceC11380iw interfaceC11380iw, C83403nh c83403nh, DirectThreadKey directThreadKey);

    C42221xC AGU(C3o9 c3o9, String str);

    boolean BJs();

    Integer CIY();

    void EKv(Context context, InterfaceC11380iw interfaceC11380iw, C83403nh c83403nh, DirectThreadKey directThreadKey);

    C42221xC EKw(C3o9 c3o9, String str);

    void ELt(C3o9 c3o9, String str);

    void EN1(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, boolean z);

    void EN3(Context context, UserSession userSession, AnonymousClass442 anonymousClass442, DirectAnimatedMedia directAnimatedMedia, InterfaceC83713oG interfaceC83713oG, String str, String str2, List list, boolean z);

    void EN8(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, List list, boolean z);

    void ENI(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, boolean z);

    void ENK(InterfaceC83713oG interfaceC83713oG, String str, String str2, String str3);

    void ENO(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z);

    void ENS(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void ENY(Capabilities capabilities, C3o9 c3o9, String str, String str2, String str3, String str4, String str5);

    void ENa(C47588Kzy c47588Kzy, C3o9 c3o9, String str, boolean z);

    void ENb(EnumC159397Cz enumC159397Cz, C45059Jwo c45059Jwo, L1W l1w, C2EY c2ey, C3o9 c3o9, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2);

    C42221xC ENg(C47588Kzy c47588Kzy, MessageIdentifier messageIdentifier, C3o9 c3o9, String str, List list, boolean z);

    C42221xC ENn(C26086BgF c26086BgF, C47588Kzy c47588Kzy, C3o9 c3o9, String str, String str2, String str3, List list, boolean z);

    void ENo(Context context, UserSession userSession, C3o9 c3o9, JIN jin, String str, boolean z);

    void ENs(DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, InterfaceC83713oG interfaceC83713oG, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j);

    void ENt(C148286ly c148286ly, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j);

    void ENu(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z);

    void ENv(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, boolean z);

    ListenableFuture ENz(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, String str4, List list, boolean z);

    void EO1(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, String str4, List list, boolean z);

    void EO2(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EO6(AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, String str2, String str3, String str4, String str5);

    void EO9(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EOL(InterfaceC83713oG interfaceC83713oG, String str, String str2, long j);

    void EOR(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z);

    void EOT(AnonymousClass442 anonymousClass442, DirectStoreSticker directStoreSticker, InterfaceC83713oG interfaceC83713oG, String str);

    @Deprecated(message = "Use {@link SendMessageManager#sendTextMessageRx} instead.")
    String EOY(Context context, L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, String str, String str2, String str3, String str4, String str5, boolean z);

    @Deprecated(message = "Use {@link SendMessageManager#sendTextMessageRx} instead.")
    String EOZ(AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, String str2, String str3, boolean z);

    C42221xC EOa(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, DirectShareTarget directShareTarget, C2EY c2ey, InterfaceC83713oG interfaceC83713oG, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, boolean z4);

    C42221xC EOb(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, DirectShareTarget directShareTarget, C2EY c2ey, InterfaceC83713oG interfaceC83713oG, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2);

    void EOc(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z);

    void EOd(L7G l7g, AnonymousClass442 anonymousClass442, SendMentionData$MentionData sendMentionData$MentionData, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z);

    ListenableFuture EOh(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4, String str5, List list, boolean z);

    void EOj(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4, String str5, List list, boolean z);

    C42221xC EOk(InterfaceC83713oG interfaceC83713oG, ClipInfo clipInfo, Long l, String str, String str2);

    C42221xC EOl(InterfaceC83713oG interfaceC83713oG, C183978Ee c183978Ee, Long l, String str, String str2, boolean z);

    ListenableFuture EOm(AnonymousClass442 anonymousClass442, C3o9 c3o9, L33 l33, String str, String str2, String str3, List list, boolean z);

    void EOn(AnonymousClass442 anonymousClass442, C3o9 c3o9, L33 l33, String str, String str2, String str3, List list, boolean z);

    void EOq(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EWd(boolean z);

    void EhS(Integer num);

    void F9o(C3o9 c3o9, String str);

    ListenableFuture F9r(AbstractC46511KiA abstractC46511KiA, C3o9 c3o9, String str);
}
