package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
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

/* renamed from: X.Lqp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49295Lqp implements C7TH {
    public final C7TG A00;
    public final C44139Jf4 A01;

    @Override // X.C7TH
    public final boolean BJs() {
        this.A01.BJs();
        throw C00O.createAndThrow();
    }

    @Override // X.C7TH
    public final Integer CIY() {
        this.A01.CIY();
        throw C00O.createAndThrow();
    }

    @Override // X.C7TH
    public final void EKv(Context context, InterfaceC11380iw interfaceC11380iw, C83403nh c83403nh, DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 0);
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final C42221xC EKw(C3o9 c3o9, String str) {
        C14360o3.A0B(c3o9, 0);
        return this.A01.EKw(c3o9, str);
    }

    @Override // X.C7TH
    public final void EN3(Context context, UserSession userSession, AnonymousClass442 anonymousClass442, DirectAnimatedMedia directAnimatedMedia, InterfaceC83713oG interfaceC83713oG, String str, String str2, List list, boolean z) {
        AbstractC25229BEm.A1I(directAnimatedMedia, 2, userSession);
        this.A01.EN3(context, userSession, anonymousClass442, directAnimatedMedia, interfaceC83713oG, str, str2, list, z);
    }

    @Override // X.C7TH
    public final void EN8(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, List list, boolean z) {
        AbstractC167017dG.A1N(context, userSession);
        C14360o3.A0B(c148286ly, 4);
        this.A01.EN8(context, userSession, c148286ly, anonymousClass442, c3o9, str, list, z);
    }

    @Override // X.C7TH
    public final void ENK(InterfaceC83713oG interfaceC83713oG, String str, String str2, String str3) {
        C14360o3.A0B(interfaceC83713oG, 0);
        this.A01.ENK(interfaceC83713oG, str, str2, str3);
    }

    @Override // X.C7TH
    public final void ENY(Capabilities capabilities, C3o9 c3o9, String str, String str2, String str3, String str4, String str5) {
        this.A01.ENY(capabilities, c3o9, str, str2, "push_notif", "push_notification_action", null);
    }

    @Override // X.C7TH
    public final C42221xC ENn(C26086BgF c26086BgF, C47588Kzy c47588Kzy, C3o9 c3o9, String str, String str2, String str3, List list, boolean z) {
        C14360o3.A0B(str2, 5);
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void ENs(DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, InterfaceC83713oG interfaceC83713oG, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        C14360o3.A0B(directAnimatedMedia, 3);
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void ENt(C148286ly c148286ly, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        C14360o3.A0B(c148286ly, 2);
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void ENu(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
    }

    @Override // X.C7TH
    public final void ENv(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, boolean z) {
        this.A01.ENv(imageUrl, directShareTarget, extendedImageUrl, user, str, str2, str3, str4, null, str6, str7, str8, j, z);
    }

    @Override // X.C7TH
    public final ListenableFuture ENz(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, String str4, List list, boolean z) {
        C14360o3.A0B(c3o9, 0);
        return this.A01.ENz(null, c26086BgF, anonymousClass442, c47588Kzy, c3o9, c47z, c183978Ee, str, null, str3, str4, list, z);
    }

    @Override // X.C7TH
    public final void EO1(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, String str4, List list, boolean z) {
        this.A01.EO1(null, c26086BgF, anonymousClass442, c47588Kzy, c3o9, c47z, c183978Ee, str, null, str3, str4, list, z);
    }

    @Override // X.C7TH
    public final void EOL(InterfaceC83713oG interfaceC83713oG, String str, String str2, long j) {
        C14360o3.A0B(interfaceC83713oG, 0);
    }

    @Override // X.C7TH
    public final void EOT(AnonymousClass442 anonymousClass442, DirectStoreSticker directStoreSticker, InterfaceC83713oG interfaceC83713oG, String str) {
        C14360o3.A0B(directStoreSticker, 1);
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    @Deprecated(message = "Use {@link SendMessageManager#sendTextMessageRx} instead.")
    public final String EOY(Context context, L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(c3o9, 1);
        return this.A01.EOY(context, null, anonymousClass442, null, c3o9, num, str, str2, str3, null, str5, z);
    }

    @Override // X.C7TH
    @Deprecated(message = "Use {@link SendMessageManager#sendTextMessageRx} instead.")
    public final String EOZ(AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        return this.A01.EOZ(null, c3o9, str, NetInfoModule.CONNECTION_TYPE_NONE, "push_notification_action", false);
    }

    @Override // X.C7TH
    public final C42221xC EOb(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, DirectShareTarget directShareTarget, C2EY c2ey, InterfaceC83713oG interfaceC83713oG, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2) {
        return this.A01.EOb(null, anonymousClass442, null, directShareTarget, c2ey, interfaceC83713oG, null, null, str, str2, str3, null, null, null, list, z, z2);
    }

    @Override // X.C7TH
    public final ListenableFuture EOh(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        AbstractC167017dG.A1O(c3o9, clipInfo);
        return this.A01.EOh(null, c26086BgF, anonymousClass442, c47588Kzy, c3o9, clipInfo, c47z, str, str2, null, str4, str5, list, z);
    }

    @Override // X.C7TH
    public final void EOj(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        C14360o3.A0B(clipInfo, 2);
        this.A01.EOj(null, c26086BgF, anonymousClass442, c47588Kzy, c3o9, clipInfo, c47z, str, str2, null, str4, str5, list, z);
    }

    @Override // X.C7TH
    public final C42221xC EOk(InterfaceC83713oG interfaceC83713oG, ClipInfo clipInfo, Long l, String str, String str2) {
        C14360o3.A0B(str, 2);
        return this.A01.EOk(interfaceC83713oG, clipInfo, l, str, null);
    }

    @Override // X.C7TH
    public final C42221xC EOl(InterfaceC83713oG interfaceC83713oG, C183978Ee c183978Ee, Long l, String str, String str2, boolean z) {
        C14360o3.A0B(str, 3);
        return this.A01.EOl(interfaceC83713oG, c183978Ee, l, str, null, z);
    }

    @Override // X.C7TH
    public final ListenableFuture EOm(AnonymousClass442 anonymousClass442, C3o9 c3o9, L33 l33, String str, String str2, String str3, List list, boolean z) {
        C14360o3.A0B(c3o9, 0);
        return this.A01.EOm(anonymousClass442, c3o9, l33, str, str2, str3, list, z);
    }

    @Override // X.C7TH
    public final void EOn(AnonymousClass442 anonymousClass442, C3o9 c3o9, L33 l33, String str, String str2, String str3, List list, boolean z) {
        this.A01.EOn(anonymousClass442, c3o9, l33, str, str2, str3, list, z);
    }

    @Override // X.C7TH
    public final void EWd(boolean z) {
        this.A01.EWd(z);
        throw C00O.createAndThrow();
    }

    @Override // X.C7TH
    public final void EhS(Integer num) {
        C14360o3.A0B(num, 0);
        this.A01.EhS(num);
        throw C00O.createAndThrow();
    }

    @Override // X.C7TH
    public final ListenableFuture F9r(AbstractC46511KiA abstractC46511KiA, C3o9 c3o9, String str) {
        C7TH c7th;
        C14360o3.A0B(c3o9, 0);
        if (abstractC46511KiA instanceof KWh) {
            c7th = this.A00;
        } else if (abstractC46511KiA instanceof KWg) {
            c7th = this.A01;
        } else {
            throw B4Z.A00();
        }
        return c7th.F9r(abstractC46511KiA, c3o9, null);
    }

    @Override // X.C7TH
    public final void ENO(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        C44139Jf4.A01(anonymousClass442, this.A01, c3o9, str, str3, list);
    }

    @Override // X.C7TH
    public final void ENb(EnumC159397Cz enumC159397Cz, C45059Jwo c45059Jwo, L1W l1w, C2EY c2ey, C3o9 c3o9, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        AbstractC167017dG.A1N(c3o9, str);
        this.A01.ENb(enumC159397Cz, c45059Jwo, l1w, c2ey, c3o9, str, str2, str3, str4, str5, str6, str7, j, z, z2);
    }

    @Override // X.C7TH
    public final void EOR(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        C44139Jf4.A01(anonymousClass442, this.A01, c3o9, str, str3, list);
    }

    @Override // X.C7TH
    public final C42221xC EOa(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, DirectShareTarget directShareTarget, C2EY c2ey, InterfaceC83713oG interfaceC83713oG, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC25229BEm.A1M(interfaceC83713oG, 0, c2ey);
        return this.A01.EOa(c50679MYx, l7g, anonymousClass442, c47588Kzy, null, c2ey, interfaceC83713oG, null, null, num3, num4, num5, l, str, NetInfoModule.CONNECTION_TYPE_NONE, str3, str4, null, str6, str7, list, z, false, false, z4);
    }

    @Override // X.C7TH
    public final void EOd(L7G l7g, AnonymousClass442 anonymousClass442, SendMentionData$MentionData sendMentionData$MentionData, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        C44139Jf4.A01(anonymousClass442, this.A01, c3o9, str, str3, list2);
    }

    public C49295Lqp(UserSession userSession, C44139Jf4 c44139Jf4) {
        AbstractC167017dG.A1P(userSession, c44139Jf4);
        this.A01 = c44139Jf4;
        this.A00 = AbstractC165967bO.A00(userSession);
    }

    @Override // X.C7TH
    public final void AGT(InterfaceC11380iw interfaceC11380iw, C83403nh c83403nh, DirectThreadKey directThreadKey) {
        AbstractC167017dG.A1N(directThreadKey, c83403nh);
        this.A00.AGT(interfaceC11380iw, c83403nh, directThreadKey);
    }

    @Override // X.C7TH
    public final C42221xC AGU(C3o9 c3o9, String str) {
        AbstractC167017dG.A1N(c3o9, str);
        return this.A01.AGU(c3o9, str);
    }

    @Override // X.C7TH
    public final void ELt(C3o9 c3o9, String str) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void EN1(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, boolean z) {
        AbstractC167017dG.A1N(context, userSession);
        C14360o3.A0B(c148286ly, 3);
    }

    @Override // X.C7TH
    public final void ENI(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, boolean z) {
        AbstractC167017dG.A1N(context, userSession);
        C14360o3.A0B(c148286ly, 3);
    }

    @Override // X.C7TH
    public final void ENa(C47588Kzy c47588Kzy, C3o9 c3o9, String str, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final C42221xC ENg(C47588Kzy c47588Kzy, MessageIdentifier messageIdentifier, C3o9 c3o9, String str, List list, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void ENo(Context context, UserSession userSession, C3o9 c3o9, JIN jin, String str, boolean z) {
        AbstractC167017dG.A1N(context, userSession);
        AbstractC167007dF.A1G(jin, 3, str);
    }

    @Override // X.C7TH
    public final void EO6(AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, String str2, String str3, String str4, String str5) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void EOc(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void F9o(C3o9 c3o9, String str) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void ENS(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        AbstractC167017dG.A1P(str, str2);
    }

    @Override // X.C7TH
    public final void EO2(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        AbstractC167017dG.A1P(str, str2);
    }

    @Override // X.C7TH
    public final void EO9(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        AbstractC167017dG.A1P(str, str2);
    }

    @Override // X.C7TH
    public final void EOq(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
        AbstractC167017dG.A1P(str, str2);
    }
}
