package X;

import android.content.Context;
import com.instagram.api.schemas.MessagingOffPlatformShareType;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectRoomsXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.7TM, reason: invalid class name */
/* loaded from: classes3.dex */
public interface C7TM {
    void AWc(DirectForwardingParams directForwardingParams, DirectShareTarget directShareTarget, C2EY c2ey, String str, String str2, boolean z);

    void EN2(DirectAREffectShare directAREffectShare, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void EN4(Context context, UserSession userSession, DirectShareTarget directShareTarget, DirectAnimatedMedia directAnimatedMedia, String str, String str2, boolean z);

    void ENA(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void ENB(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, boolean z);

    void ENC(SocialContextType socialContextType, C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void END(SocialContextType socialContextType, C148286ly c148286ly, C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z);

    void ENE(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z);

    void ENF(C84923qg c84923qg, DirectShareTarget directShareTarget, String str, boolean z);

    void ENG(C148286ly c148286ly, C38321qM c38321qM, DirectPendingLayeredXma directPendingLayeredXma, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2);

    void ENH(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, long j, boolean z);

    void ENJ(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, boolean z);

    void ENP(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, boolean z);

    void ENQ(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, boolean z, boolean z2);

    void ENT(DirectShareTarget directShareTarget, GKP gkp, String str, String str2, String str3, boolean z);

    void ENU(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void ENV(EnumC33381EpE enumC33381EpE, DirectShareTarget directShareTarget, Long l, String str, String str2, String str3, long j, boolean z);

    void ENW(InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void ENX(InfoCenterShareInfoIntf infoCenterShareInfoIntf, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void ENc(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void ENd(Context context, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z);

    void ENe(C148286ly c148286ly, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z);

    void ENh(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void ENi(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2);

    void ENj(SocialContextType socialContextType, C148286ly c148286ly, C32068E6u c32068E6u, C38321qM c38321qM, DirectShareTarget directShareTarget, Long l, String str, String str2, String str3);

    void ENw(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EO0(Context context, AnonymousClass442 anonymousClass442, DirectShareTarget directShareTarget, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, boolean z);

    void EO3(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z);

    void EO4(DirectShareTarget directShareTarget, Product product, String str, String str2, boolean z);

    void EO5(C148286ly c148286ly, DirectShareTarget directShareTarget, User user, String str, String str2, String str3, boolean z);

    void EO7(MessagingOffPlatformShareType messagingOffPlatformShareType, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z);

    void EO8(DirectShareTarget directShareTarget, SavedCollection savedCollection, String str, String str2, boolean z, boolean z2);

    void EOB(C45001Jvr c45001Jvr, String str, String str2, String str3);

    void EOC(C148286ly c148286ly, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, boolean z);

    void EOD(C38321qM c38321qM, DirectShareTarget directShareTarget, String str, boolean z);

    void EOK(DirectRoomsXma directRoomsXma, DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void EOM(DirectShareTarget directShareTarget, String str, String str2, boolean z);

    void EOP(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z);

    void EOQ(DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z);

    void EOU(C45001Jvr c45001Jvr, String str);

    void EOV(C148286ly c148286ly, C32068E6u c32068E6u, C38321qM c38321qM, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, boolean z, boolean z2);

    void EOW(DirectShareTarget directShareTarget, User user, String str, String str2, String str3, String str4, boolean z);

    @Deprecated(message = "Please use forwardMessage instead.")
    void EOX(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z, boolean z2);

    void EOf(EnumC46200Kcc enumC46200Kcc, DirectShareTarget directShareTarget, Boolean bool, String str, String str2, String str3, boolean z);

    void EOi(Context context, C26069Bfx c26069Bfx, AnonymousClass442 anonymousClass442, DirectShareTarget directShareTarget, ClipInfo clipInfo, C47Z c47z, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3);

    void EOp(DirectShareTarget directShareTarget, String str, String str2, boolean z);
}
