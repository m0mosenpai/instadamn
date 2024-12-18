package com.instagram.direct.groupinvites;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC209010m;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC31172DnG;
import X.AbstractC31175DnJ;
import X.AbstractC33538EsC;
import X.AnonymousClass058;
import X.C0Hg;
import X.C0eB;
import X.C14360o3;
import X.C189448aO;
import X.C189478aR;
import X.C1JX;
import X.C32798Ec2;
import X.C33091Eir;
import X.C36457G6h;
import X.C50541MSu;
import X.C6WQ;
import X.C9GR;
import X.EN8;
import X.EnumC33373Ep6;
import X.G3Y;
import X.GWg;
import X.InterfaceC11380iw;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.LL3;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.groupinvites.GroupPreviewFragmentLauncher$launchForMessageShareSticker$1", f = "GroupPreviewFragmentLauncher.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class GroupPreviewFragmentLauncher$launchForMessageShareSticker$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C33091Eir A04;
    public final /* synthetic */ C6WQ A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ InterfaceC16820sZ A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupPreviewFragmentLauncher$launchForMessageShareSticker$1(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C33091Eir c33091Eir, C6WQ c6wq, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = c33091Eir;
        this.A03 = userSession;
        this.A09 = str;
        this.A06 = str2;
        this.A0B = z;
        this.A01 = fragmentActivity;
        this.A05 = c6wq;
        this.A07 = str3;
        this.A02 = interfaceC11380iw;
        this.A08 = str4;
        this.A0A = interfaceC16820sZ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C33091Eir c33091Eir = this.A04;
        UserSession userSession = this.A03;
        String str = this.A09;
        String str2 = this.A06;
        boolean z = this.A0B;
        return new GroupPreviewFragmentLauncher$launchForMessageShareSticker$1(this.A01, this.A02, userSession, c33091Eir, this.A05, str, str2, this.A07, this.A08, interfaceC23621Ds, this.A0A, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        EnumC33373Ep6 enumC33373Ep6;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            AnonymousClass058 anonymousClass058 = new AnonymousClass058(new C0Hg(new C50541MSu(10, null), this.A04.A02, (InterfaceC23621Ds) null, 0));
            this.A00 = 1;
            obj2 = AbstractC209010m.A04(this, anonymousClass058);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        AbstractC33538EsC abstractC33538EsC = (AbstractC33538EsC) obj2;
        if (abstractC33538EsC instanceof C32798Ec2) {
            GWg gWg = ((C32798Ec2) abstractC33538EsC).A00;
            if (gWg instanceof GroupLinkPreviewResponse$Success) {
                C14360o3.A0C(gWg, "null cannot be cast to non-null type com.instagram.direct.request.response.GroupLinkPreviewResponse.Success");
                GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = (GroupLinkPreviewResponse$Success) gWg;
                UserSession userSession = this.A03;
                String valueOf = String.valueOf(groupLinkPreviewResponse$Success.A04);
                boolean z = groupLinkPreviewResponse$Success.A0I;
                boolean z2 = groupLinkPreviewResponse$Success.A0C;
                boolean z3 = groupLinkPreviewResponse$Success.A0E;
                boolean z4 = groupLinkPreviewResponse$Success.A0H;
                boolean z5 = groupLinkPreviewResponse$Success.A0F;
                boolean A1T = AbstractC31175DnJ.A1T(1, userSession, valueOf);
                if ((!z || z4 || z2 || z3 || AbstractC31172DnG.A1Z(userSession, valueOf)) && !z5) {
                    String str = groupLinkPreviewResponse$Success.A0A;
                    if (str != null) {
                        ThreadFetchReason threadFetchReason = ThreadFetchReason.MESSAGE_SHARE_STICKER;
                        FragmentActivity fragmentActivity = this.A01;
                        String str2 = this.A07;
                        LL3.A03(userSession, threadFetchReason, new C36457G6h(fragmentActivity, this.A02, userSession, this.A05, str2, str, this.A08), 20, str, A1T);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    String str3 = this.A09;
                    String str4 = this.A06;
                    ChatStickerStickerType chatStickerStickerType = ChatStickerStickerType.A09;
                    boolean z6 = this.A0B;
                    C14360o3.A0B(str3, A1T ? 1 : 0);
                    C14360o3.A0B(str4, 1);
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("GroupPreviewFragment.STORY_ID_KEY", str3);
                    int ordinal = chatStickerStickerType.ordinal();
                    if (ordinal != 4) {
                        if (ordinal != 6) {
                            enumC33373Ep6 = EnumC33373Ep6.A0L;
                        } else if (z6) {
                            enumC33373Ep6 = EnumC33373Ep6.A0D;
                        } else {
                            enumC33373Ep6 = EnumC33373Ep6.A0C;
                        }
                    } else {
                        enumC33373Ep6 = EnumC33373Ep6.A03;
                    }
                    A0b.putSerializable("GroupPreviewFragment.JOINING_SURFACE", enumC33373Ep6);
                    A0b.putString("GroupPreviewFragment.CHAT_STICKER_CHANNEL_TYPE", str4);
                    EN8 en8 = new EN8();
                    en8.setArguments(A0b);
                    en8.A0D = groupLinkPreviewResponse$Success;
                    C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                    A0y.A0U = en8;
                    C189478aR A00 = A0y.A00();
                    en8.A0C = new G3Y(userSession, A00, A0y, this.A0A);
                    FragmentActivity fragmentActivity2 = this.A01;
                    A00.A02(fragmentActivity2, en8);
                    if (!fragmentActivity2.isDestroyed()) {
                        this.A05.dismiss();
                    }
                }
                return C0eB.A00;
            }
        }
        FragmentActivity fragmentActivity3 = this.A01;
        if (!fragmentActivity3.isDestroyed()) {
            this.A05.dismiss();
            C9GR.A0F(fragmentActivity3, "general_error_try_again", 2131963183);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GroupPreviewFragmentLauncher$launchForMessageShareSticker$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
