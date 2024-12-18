package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;
import com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Lu7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49494Lu7 implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49494Lu7(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(C146106i8 c146106i8, Object obj, Object obj2, int i) {
        c146106i8.A0A = new C49494Lu7(i, obj, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        String str;
        Object obj;
        InterfaceC16820sZ interfaceC16820sZ;
        switch (this.A00) {
            case 0:
                ((CreatorAIAgentCreationRepository) this.A02).A03.A03(C8p.A0U);
            case 1:
            case 2:
            default:
                obj = this.A01;
                interfaceC16820sZ = (InterfaceC16820sZ) obj;
                interfaceC16820sZ.invoke();
                return;
            case 3:
                UserSession userSession = (UserSession) this.A02;
                new C55083Oaf(userSession);
                C55083Oaf.A00(userSession, (Activity) this.A01, "instagram_listening_status");
                return;
            case 4:
                Bundle A06 = AbstractC31178DnM.A06("arg_fetch_for_listening_now", AbstractC166997dE.A0b());
                UserSession userSession2 = (UserSession) this.A02;
                AbstractC31177DnL.A0n((Activity) this.A01, A06, userSession2, ModalActivity.class, "notes_creation");
                AbstractC135966Db.A01(userSession2).A0D(EnumC46303KeZ.A0H);
                new C4AA(userSession2).A00(C05F.A0u);
                return;
            case 5:
                KCU kcu = (KCU) this.A02;
                InterfaceC83713oG interfaceC83713oG = ((C49449LtN) this.A01).A03;
                C36881nl A01 = C36881nl.A01(kcu.requireActivity(), kcu, AbstractC166987dD.A0r(kcu.A0o), "friend_map_reply");
                A01.A0B = interfaceC83713oG;
                A01.A06();
                return;
            case 6:
                MP7 mp7 = ((FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig) ((KDY) this.A02).A09.getValue()).A00;
                if (mp7 == null) {
                    return;
                }
                mp7.Cgr(((C49422Lsw) this.A01).A03);
                return;
            case 7:
                C65972yZ c65972yZ = (C65972yZ) this.A02;
                C38321qM c38321qM = ((C47Z) this.A01).A1C;
                if (c38321qM == null) {
                    return;
                }
                Fragment fragment = c65972yZ.A01;
                C14360o3.A0C(fragment, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                UserSession userSession3 = c65972yZ.A02;
                InterfaceC60442pS interfaceC60442pS = c65972yZ.A03;
                if (c38321qM.A5P()) {
                    str = "clips_upload_success_snackbar";
                } else {
                    str = "feed_upload_success_snackbar";
                }
                AbstractC31510Dsu.A0V(fragment, userSession3, c38321qM, interfaceC60442pS, null, str);
                return;
            case 8:
                obj = this.A02;
                interfaceC16820sZ = (InterfaceC16820sZ) obj;
                interfaceC16820sZ.invoke();
                return;
            case 9:
                interfaceC16820sZ = ((L34) this.A01).A03;
                if (interfaceC16820sZ == null) {
                    return;
                }
                interfaceC16820sZ.invoke();
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        switch (this.A00) {
            case 1:
                ((C47305KvG) this.A02).A00 = null;
                return;
            case 2:
                ((C47306KvH) this.A02).A00 = null;
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                return;
            case 8:
                ((C47944LFy) this.A01).A00(false);
                return;
            case 9:
                ((PopupWindow) this.A02).dismiss();
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        switch (this.A00) {
            case 0:
                ((CreatorAIAgentCreationRepository) this.A02).A03.A03(C8p.A0T);
                return;
            case 8:
                ((C47944LFy) this.A01).A00(true);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
