package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G2G implements InterfaceC37193Ga4 {
    public User A00;
    public String A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final C41181vS A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    @Override // X.InterfaceC37193Ga4
    public final void CNX(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        C14360o3.A0B(viewStub, 0);
        View A0E = AbstractC31173DnH.A0E(viewStub, R.layout.fragment_direct_reply_modal_feed_media_with_badged_profile);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(A0E, R.id.context_image);
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        C38321qM c38321qM = this.A04;
        ((IgImageView) roundedCornerImageView).A05 = c38321qM.A18();
        ImageUrl A1S = c38321qM.A1S();
        if (A1S != null) {
            roundedCornerImageView.setUrl(A1S, this.A02);
        }
        User user = this.A00;
        if (user != null) {
            AbstractC31172DnG.A0Z(A0E, R.id.context_badge).setUrl(user.Bhu(), this.A02);
        }
    }

    @Override // X.InterfaceC37193Ga4
    public final /* synthetic */ void DDM(C148336m3 c148336m3) {
    }

    @Override // X.InterfaceC37193Ga4
    public final void EOe(C2EC c2ec, C2DS c2ds, DirectShareTarget directShareTarget, String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A13(c2ds, c2ec, directShareTarget);
        String str3 = this.A01;
        if (!this.A08) {
            C7TL.A00(this.A03).EOf(null, directShareTarget, false, str, str3, this.A06, z);
        } else if (str3 != null) {
            C28531Zo c28531Zo = C28531Zo.A04;
            UserSession userSession = this.A03;
            C41181vS c41181vS = this.A05;
            User user = c41181vS.A0i;
            if (user != null) {
                String id = user.getId();
                String str4 = c41181vS.A0k;
                C14360o3.A07(str4);
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    c28531Zo.A0D(userSession, new C45092JxM(c38321qM, directShareTarget, id, str4, str, "reel", z).A00(), str3, this.A06);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        UserSession userSession2 = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        String str5 = this.A07;
        C38321qM c38321qM2 = this.A04;
        String id2 = c38321qM2.getId();
        if (id2 != null) {
            User A2E = c38321qM2.A2E(userSession2);
            if (A2E != null) {
                C162337Ov.A0L(interfaceC11380iw, userSession2, str5, id2, A2E.getId());
                User user2 = this.A05.A0i;
                if (user2 != null) {
                    str2 = user2.getId();
                } else {
                    str2 = "";
                }
                C5M8.A01(userSession2, str2, 766842320);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC37193Ga4
    public final User CE6() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AbstractC166997dE.A0g();
    }

    public G2G(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        User user;
        AbstractC167017dG.A1S(str2, str3);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A07 = str;
        this.A08 = z;
        this.A06 = str6 == null ? "" : str6;
        C1OU c1ou = C1OU.$redex_init_class;
        ReelStore A03 = ReelStore.A03(userSession);
        C14360o3.A07(A03);
        Reel A0M = A03.A0M(str2);
        if (A0M != null) {
            for (C41181vS c41181vS : A0M.A0O(userSession)) {
                if (str3.equals(c41181vS.A0j)) {
                    this.A05 = c41181vS;
                    C38321qM c38321qM = c41181vS.A0b;
                    if (c38321qM != null) {
                        this.A04 = c38321qM;
                        if (str4 != null) {
                            user = AbstractC31174DnI.A0k(this.A03, str4);
                            if (user == null) {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            user = c41181vS.A0i;
                            if (user == null) {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                        this.A00 = user;
                        String str7 = this.A07;
                        this.A01 = str5 != null ? AnonymousClass001.A0R(str7, str5) : str7;
                        if (c38321qM.getId() != null) {
                            User A2E = c38321qM.A2E(this.A03);
                            if (A2E != null) {
                                A2E.getId();
                                return;
                            }
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            throw AbstractC166987dD.A14("Reel item not available");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
