package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.BQj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25521BQj implements InterfaceC80043ht {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final UserSession A02;
    public final InterfaceC31073DlF A03;

    public C25521BQj(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31073DlF interfaceC31073DlF) {
        AbstractC167027dH.A0a(1, interfaceC31073DlF, c120985dq, c37644Ghd, userSession);
        this.A03 = interfaceC31073DlF;
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC80043ht
    public final void D0W(SocialContextType socialContextType, int i, long j) {
        C14360o3.A0B(socialContextType, 0);
        this.A03.D0X(socialContextType, this.A00, this.A01, i, j);
    }

    @Override // X.InterfaceC80043ht
    public final void D2X(String str, String str2, boolean z, String str3) {
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A02;
            AbstractC25651Mw.A00(userSession).E4s(new C72433Mq(userSession, c38321qM, this.A01.A0E, str3, str, str2, true));
        }
    }

    @Override // X.InterfaceC80043ht
    public final void D65(String str, String str2, boolean z) {
    }

    @Override // X.InterfaceC80043ht
    public final void DHY(SocialContextType socialContextType, String str, int i, long j) {
        C14360o3.A0B(socialContextType, 2);
        this.A03.DHZ(socialContextType, this.A00, this.A01, str, i, j);
    }

    @Override // X.InterfaceC80043ht
    public final void DK7(String str) {
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM != null) {
            C25671My A00 = AbstractC25651Mw.A00(this.A02);
            String lowerCase = str.toLowerCase();
            C14360o3.A07(lowerCase);
            A00.E4s(new C72413Mo(null, null, c38321qM, lowerCase, false));
        }
    }

    @Override // X.InterfaceC80043ht
    public final void DQj(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC27426C8t enumC27426C8t, long j) {
        C14360o3.A0B(enumC27426C8t, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(fragmentActivity, 4);
        int ordinal = enumC27426C8t.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            C7JA.A01(fragmentActivity, userSession, "Friendly Viewer Launchers", AbstractC111324zv.A00(1511), BLH.A00(), C29744DAo.A00);
                            return;
                        }
                        throw B4Z.A00();
                    }
                    BLH.A00();
                    AbstractC23111AHa.A02(fragmentActivity, userSession, null, "383582548001955", false);
                    return;
                }
                User A02 = AnonymousClass189.A00(userSession).A02(String.valueOf(j));
                if (A02 == null) {
                    return;
                }
                AbstractC35261Fgv.A04(fragmentActivity, userSession, new C33276EnX(1), A02, AbstractC111324zv.A00(3118), interfaceC11380iw.getModuleName(), null, false);
                return;
            }
            User A022 = AnonymousClass189.A00(userSession).A02(String.valueOf(j));
            if (A022 == null) {
                return;
            }
            C28261Yl.A00.A00(fragmentActivity, fragmentActivity, userSession, A022, null, interfaceC11380iw.getModuleName(), null, A022.getUsername());
            return;
        }
        AbstractC25228BEl.A1G(fragmentActivity, AbstractC31364DqT.A03().A01.A01(userSession, AbstractC31402Dr6.A01(userSession, String.valueOf(j), "clips_social_context_bubble_long_press", interfaceC11380iw.getModuleName()).A03()), userSession, ModalActivity.class, "profile");
    }

    @Override // X.InterfaceC80043ht
    public final void DfW(SocialContextType socialContextType, int i, long j) {
        C14360o3.A0B(socialContextType, 2);
        this.A03.DfX(socialContextType, this.A00, this.A01, i, j);
    }

    @Override // X.InterfaceC80043ht
    public final void DnD(SocialContextType socialContextType, List list) {
        C14360o3.A0B(socialContextType, 1);
        this.A03.DnE(socialContextType, this.A00, this.A01, list);
    }

    @Override // X.InterfaceC80043ht
    public final void Dxx(String str) {
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM != null) {
            AbstractC25651Mw.A00(this.A02).E4s(new C72393Mm(null, null, c38321qM, AbstractC167007dF.A0h(str), false));
        }
    }

    @Override // X.InterfaceC80043ht
    public final void D6M(long j, int i, String str) {
        this.A03.D6N(this.A00, this.A01, str, i, j);
    }

    @Override // X.InterfaceC80043ht
    public final void DP3(long j, int i, boolean z) {
        this.A03.DP4(this.A00, this.A01, i, j, z);
    }

    @Override // X.InterfaceC80043ht
    public final void DsX() {
        this.A03.DsY(this.A00, this.A01);
    }

    @Override // X.InterfaceC80043ht
    public final void Dy3(long j, int i) {
        this.A03.Dy4(this.A00, this.A01, i, j);
    }

    @Override // X.InterfaceC80043ht
    public final C51722Yv B5a() {
        return C51722Yv.A02;
    }

    @Override // X.InterfaceC80043ht
    public final C51722Yv Apk(String str) {
        return C51722Yv.A02;
    }
}
