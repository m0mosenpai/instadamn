package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.Map;

/* renamed from: X.LvP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49570LvP implements InterfaceC148526mN {
    public final /* synthetic */ DirectVisualMessageViewerController A00;

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void ClF(C84823qW c84823qW, int i, int i2) {
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void CuP() {
    }

    @Override // X.InterfaceC148526mN
    public final void Cyj(C84823qW c84823qW) {
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void D5Q(C84823qW c84823qW) {
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void DGN(C84823qW c84823qW) {
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void DGR() {
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void DP9(View view, C84823qW c84823qW) {
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void DTJ() {
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void DWE() {
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ void Ddn(C84823qW c84823qW) {
    }

    @Override // X.InterfaceC148526mN
    public final void ELF(String str, Map map) {
    }

    public C49570LvP(DirectVisualMessageViewerController directVisualMessageViewerController) {
        this.A00 = directVisualMessageViewerController;
    }

    @Override // X.InterfaceC148526mN
    public final View Aqk() {
        return this.A00.viewerContainer;
    }

    @Override // X.InterfaceC148526mN
    public final View Auc() {
        int i;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
        C45093JxN A02 = DirectVisualMessageViewerController.A02(directVisualMessageViewerController);
        boolean z = true;
        if (A02 == null || !AbstractC167007dF.A1X(A02.A0B, EnumC40111tc.A0a)) {
            z = false;
        }
        View view = directVisualMessageViewerController.itemView;
        if (z) {
            if (view != null) {
                i = R.id.viewer_texture_view;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (view != null) {
            i = R.id.viewer_image_view;
        } else {
            throw AbstractC166987dD.A14("Required value was null.");
        }
        return view.findViewById(i);
    }

    @Override // X.InterfaceC148526mN
    public final void CJ7(User user, String str) {
        DirectVisualMessageViewerController.A0M(this.A00, user.getId(), str);
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ boolean CSA() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [X.0Ml, java.lang.Object] */
    @Override // X.InterfaceC148526mN
    public final void DZg(View view, C84823qW c84823qW) {
        Bundle A0b;
        UserSession userSession;
        Class<ModalActivity> cls;
        FragmentActivity fragmentActivity;
        String str;
        String str2;
        String str3;
        long j;
        C25531Mh A0A;
        ?? obj;
        C6RN A08;
        C45093JxN A00;
        C101594hU c101594hU;
        EnumC40111tc enumC40111tc;
        Long A0j;
        C45093JxN A002;
        C101594hU c101594hU2;
        InterfaceC216113n interfaceC216113n;
        C45093JxN A003;
        C101594hU c101594hU3;
        User user;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
        directVisualMessageViewerController.A0U = true;
        String str4 = null;
        switch (c84823qW.A12.ordinal()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                FragmentActivity fragmentActivity2 = directVisualMessageViewerController.A0e;
                UserSession userSession2 = directVisualMessageViewerController.A0m;
                H7X h7x = c84823qW.A0k;
                if (h7x != null && (str2 = h7x.A01) != null) {
                    AbstractC41776Ies.A09(fragmentActivity2, userSession2, C2Fb.A1d, str2, directVisualMessageViewerController.A0f.getModuleName());
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case Process.SIGTERM /* 15 */:
                HashtagImpl hashtagImpl = c84823qW.A0l;
                A0b = AbstractC166987dD.A0b();
                A0b.putParcelable(AbstractC111324zv.A00(156), hashtagImpl);
                userSession = directVisualMessageViewerController.A0m;
                cls = ModalActivity.class;
                fragmentActivity = directVisualMessageViewerController.A0e;
                str = AbstractC111324zv.A00(431);
                break;
            case 18:
                C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
                if (c47946LGa != null && (A003 = c47946LGa.A00()) != null && (c101594hU3 = A003.A07) != null) {
                    str3 = c101594hU3.A0K;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                try {
                    C47946LGa c47946LGa2 = directVisualMessageViewerController.A0G;
                    if (c47946LGa2 != null && (A002 = c47946LGa2.A00()) != null && (c101594hU2 = A002.A07) != null && (interfaceC216113n = c101594hU2.A03) != null) {
                        str4 = (String) interfaceC216113n.get();
                    }
                    long j2 = 0;
                    if (str4 == null || (A0j = AbstractC166997dE.A0j(str4)) == null) {
                        j = 0;
                    } else {
                        j = A0j.longValue();
                    }
                    C47946LGa c47946LGa3 = directVisualMessageViewerController.A0G;
                    if (c47946LGa3 != null && (A00 = c47946LGa3.A00()) != null && (c101594hU = A00.A07) != null && (enumC40111tc = c101594hU.A07) != null) {
                        j2 = enumC40111tc.A00;
                    }
                    A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(directVisualMessageViewerController.A0h, AbstractC111324zv.A00(4690)), 307);
                    A0A.A0Q("author_id", Long.valueOf(j));
                    A0A.A0R("media_id", str3);
                    A0A.A0Q("media_type", Long.valueOf(j2));
                    A0A.A0R("reel_id", "");
                    A0A.A0R("tray_session_id", "");
                    A0A.A0R("viewer_session_id", directVisualMessageViewerController.A16);
                    A0A.A0R(AbstractC111324zv.A00(5465), "link_web");
                    obj = new Object();
                    A08 = c84823qW.A08();
                } catch (Exception e) {
                    C0w9.A06(AbstractC111324zv.A00(3735), AbstractC111324zv.A00(3620), e);
                }
                if (A08 != null) {
                    ((AbstractC02600Aj) A0A).A00.AAK(obj.A03(AbstractC08820cl.A03(A08.A00()), null), "link_url");
                    A0A.Cht();
                    FragmentActivity fragmentActivity3 = directVisualMessageViewerController.A0e;
                    UserSession userSession3 = directVisualMessageViewerController.A0m;
                    C6RN A082 = c84823qW.A08();
                    if (A082 != null) {
                        String A004 = A082.A00();
                        C2Fb c2Fb = C2Fb.A3C;
                        String moduleName = directVisualMessageViewerController.A0f.getModuleName();
                        AbstractC167007dF.A1G(A004, 2, moduleName);
                        AbstractC41776Ies.A0A(fragmentActivity3, userSession3, c2Fb, A004, moduleName, str3, null);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case Process.SIGSTOP /* 19 */:
                Venue A09 = c84823qW.A09();
                if (A09 != null) {
                    A0b = AbstractC166987dD.A0b();
                    A0b.putString("LocationFeedFragment.ARGUMENT_LOCATION_VENUE_ID", A09.A05());
                    userSession = directVisualMessageViewerController.A0m;
                    cls = ModalActivity.class;
                    fragmentActivity = directVisualMessageViewerController.A0e;
                    str = "location_feed";
                    break;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            case 21:
                C140966Yy A0r = AbstractC25225BEi.A0r(directVisualMessageViewerController.A0e, directVisualMessageViewerController.A0m);
                IgFragmentFactoryImpl.A00();
                String str5 = c84823qW.A1b;
                if (str5 != null) {
                    C35028Fc1 c35028Fc1 = new C35028Fc1();
                    c35028Fc1.A0B = str5;
                    c35028Fc1.A0E = directVisualMessageViewerController.A0v.getModuleName();
                    A0r.A0B(null, c35028Fc1.A02());
                    A0r.A04();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 23:
                User user2 = c84823qW.A1C;
                if (user2 != null) {
                    DirectVisualMessageViewerController.A0M(directVisualMessageViewerController, user2.getId(), "direct_visual_message_reel_mention");
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 28:
                MusicOverlayStickerModel musicOverlayStickerModel = c84823qW.A0v;
                if (musicOverlayStickerModel != null && (user = musicOverlayStickerModel.A05) != null) {
                    CJ7(user, "music_overlay_sticker_artist");
                    return;
                }
                return;
            default:
                throw AbstractC166987dD.A1D("Unknown interactive type");
        }
        AbstractC25228BEl.A1G(fragmentActivity, A0b, userSession, cls, str);
    }

    @Override // X.InterfaceC148526mN
    public final void Ddm() {
        this.A00.A0X("resume");
    }

    @Override // X.InterfaceC148526mN
    public final void Ddo(C84823qW c84823qW, int i, int i2) {
        this.A00.A0W("tapped");
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ boolean EiX(C84823qW c84823qW) {
        return false;
    }

    @Override // X.InterfaceC148526mN
    public final /* synthetic */ boolean Cnz(C84823qW c84823qW, int i, int i2) {
        return false;
    }
}
