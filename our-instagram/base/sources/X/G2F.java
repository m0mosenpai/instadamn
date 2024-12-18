package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G2F implements InterfaceC37193Ga4 {
    public User A00;
    public String A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

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
        IgImageView A0Z = AbstractC31172DnG.A0Z(A0E, R.id.context_badge);
        User user = this.A00;
        if (user == null) {
            C14360o3.A0F("_userToSendMessageTo");
            throw C00O.createAndThrow();
        }
        A0Z.setUrl(user.Bhu(), this.A02);
    }

    @Override // X.InterfaceC37193Ga4
    public final /* synthetic */ void DDM(C148336m3 c148336m3) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // X.InterfaceC37193Ga4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EOe(X.C2EC r15, X.C2DS r16, com.instagram.model.direct.DirectShareTarget r17, java.lang.String r18, boolean r19) {
        /*
            r14 = this;
            r3 = 0
            r8 = r17
            r10 = r18
            X.AbstractC167007dF.A1E(r10, r3, r8)
            boolean r1 = r14.A07
            java.lang.String r0 = "sendAttribution"
            com.instagram.common.session.UserSession r5 = r14.A03
            X.7TL r6 = X.C7TL.A00(r5)
            r13 = r19
            if (r1 != 0) goto L53
            java.lang.String r11 = r14.A01
            if (r11 == 0) goto L6d
            java.lang.String r12 = r14.A05
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r7 = 0
            r6.EOf(r7, r8, r9, r10, r11, r12, r13)
        L24:
            r1 = 766842320(0x2db515d0, float:2.0587004E-11)
            X.1qM r6 = r14.A04
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A14(r6)
            if (r0 == 0) goto L50
            java.lang.String r0 = r0.getId()
        L33:
            X.C5M8.A01(r5, r0, r1)
            X.0iw r4 = r14.A02
            java.lang.String r3 = r14.A06
            java.lang.String r2 = r6.getId()
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L68
            com.instagram.user.model.User r0 = r6.A2E(r5)
            if (r0 == 0) goto L63
            java.lang.String r0 = r0.getId()
            X.C162337Ov.A0L(r4, r5, r3, r2, r0)
            return
        L50:
            java.lang.String r0 = ""
            goto L33
        L53:
            X.1qM r7 = r14.A04
            java.lang.String r1 = r14.A01
            if (r1 == 0) goto L6d
            java.lang.String r0 = r14.A05
            r9 = r10
            r11 = r0
            r12 = r3
            r10 = r1
            r6.ENi(r7, r8, r9, r10, r11, r12, r13)
            goto L24
        L63:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        L68:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        L6d:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G2F.EOe(X.2EC, X.2DS, com.instagram.model.direct.DirectShareTarget, java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC37193Ga4
    public final User CE6() {
        User user = this.A00;
        if (user == null) {
            C14360o3.A0F("_userToSendMessageTo");
            throw C00O.createAndThrow();
        }
        return user;
    }

    public G2F(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z) {
        User A2E;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A06 = str;
        this.A07 = z;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str2);
        if (A0h != null) {
            this.A04 = A0h;
            if (str3 != null) {
                A2E = AbstractC31174DnI.A0k(userSession, str3);
                if (A2E == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                A2E = A0h.A2E(userSession);
                if (A2E == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            this.A00 = A2E;
            String moduleName = interfaceC11380iw.getModuleName();
            this.A01 = str4 != null ? AnonymousClass001.A0R(moduleName, str4) : moduleName;
            this.A05 = str5 == null ? "" : str5;
            if (A0h.getId() != null) {
                this.A00.getId();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
