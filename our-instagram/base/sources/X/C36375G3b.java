package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.G3b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36375G3b implements InterfaceC37196Ga7 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C189478aR A01;
    public final /* synthetic */ C189448aO A02;
    public final /* synthetic */ C144296fB A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ boolean A06;

    @Override // X.InterfaceC37196Ga7
    public final void DGI(String str) {
        Integer num;
        String str2;
        C14360o3.A0B(str, 0);
        if (C14360o3.A0K(this.A04, ChatStickerChannelType.A05.A00)) {
            if (this.A06) {
                num = C05F.A0I;
            } else {
                num = C05F.A0G;
            }
        } else {
            num = C05F.A04;
        }
        C1YY A01 = FVI.A01();
        UserSession userSession = this.A00;
        java.util.Set set = FE3.A00;
        switch (num.intValue()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                str2 = "join_chat_story_sticker_subscriber_chat";
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                str2 = "live_pinned_view";
                break;
            case 14:
                str2 = "available_creators_notification";
                break;
            case Process.SIGTERM /* 15 */:
                str2 = "suggested_subscriptions_netego";
                break;
            case 16:
                str2 = "subscribed_list_in_follow_connected";
                break;
            case 17:
                str2 = "subscribed_list_in_follow_unconnected";
                break;
            case 18:
                str2 = "recommendations_list_in_sub_feed";
                break;
            case Process.SIGSTOP /* 19 */:
                str2 = "content_preview_activation_card";
                break;
            case 20:
                str2 = "content_preview_attribution";
                break;
            case 21:
                str2 = "new_story";
                break;
            case 22:
                str2 = "fan_referral_dm";
                break;
            case 23:
                str2 = "invite_link_preview_broadcast_chat";
                break;
            case 24:
                str2 = "message_in_story";
                break;
            default:
                str2 = "clips_chat_sticker";
                break;
        }
        A01.A07(userSession, this.A01, this.A02, str, str2);
    }

    @Override // X.InterfaceC37196Ga7
    public final void DV6() {
    }

    public C36375G3b(UserSession userSession, C189478aR c189478aR, C189448aO c189448aO, C144296fB c144296fB, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A03 = c144296fB;
        this.A00 = userSession;
        this.A04 = str;
        this.A06 = z;
        this.A02 = c189448aO;
        this.A01 = c189478aR;
        this.A05 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC37196Ga7
    public final void Czz(boolean z) {
        this.A05.invoke();
    }

    @Override // X.InterfaceC37196Ga7
    public final void DJl() {
        int A01;
        C144296fB c144296fB = this.A03;
        StoryJoinChatStatus storyJoinChatStatus = StoryJoinChatStatus.A04;
        UserSession userSession = this.A00;
        String str = "model";
        C24012Akq c24012Akq = c144296fB.A05;
        if (c24012Akq != null) {
            StoryJoinChatStatus storyJoinChatStatus2 = c24012Akq.A00.A02;
            if (storyJoinChatStatus2 != null && storyJoinChatStatus2 == storyJoinChatStatus) {
                A01 = c24012Akq.A01();
            } else {
                A01 = c24012Akq.A01() + 1;
            }
            c24012Akq.A05(A01);
            C24012Akq c24012Akq2 = c144296fB.A05;
            if (c24012Akq2 != null) {
                c24012Akq2.A06(storyJoinChatStatus);
                C202488xS c202488xS = c144296fB.A04;
                if (c202488xS != null) {
                    View view = c144296fB.A01;
                    str = "stickerContainerView";
                    if (view != null) {
                        Context A0L = AbstractC166997dE.A0L(view);
                        c202488xS.A03.A05(A01);
                        C220759oz c220759oz = c202488xS.A01;
                        C6RB c6rb = c220759oz.A04;
                        c6rb.A0M(c220759oz.A02.A04(A0L, userSession));
                        float centerX = c220759oz.getBounds().centerX();
                        Rect bounds = c220759oz.A01.getBounds();
                        C14360o3.A07(bounds);
                        c6rb.setBounds(C220759oz.A00(bounds, c220759oz, centerX));
                        c220759oz.invalidateSelf();
                        C202488xS c202488xS2 = c144296fB.A04;
                        if (c202488xS2 != null) {
                            View view2 = c144296fB.A01;
                            if (view2 != null) {
                                c202488xS2.A0B(AbstractC166997dE.A0L(view2), storyJoinChatStatus, userSession);
                                IgSimpleImageView igSimpleImageView = c144296fB.A03;
                                if (igSimpleImageView == null) {
                                    str = "stickerView";
                                } else {
                                    igSimpleImageView.invalidate();
                                    return;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F("stickerDrawable");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
