package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AuthData;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LaY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48358LaY implements C6D2 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48358LaY(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        LK0 A00;
        InterfaceC50417MNt lsi;
        C7TT c7tt;
        String str;
        UserSession userSession;
        C81663kb A0d;
        C81613kW Aic;
        switch (this.A00) {
            case 0:
                LAI lai = (LAI) obj;
                C44456JlO c44456JlO = (C44456JlO) this.A02;
                c44456JlO.A03.A05("GDRIVE_SETUP_FETCH_TPID_START");
                if (lai.A04) {
                    A00 = LLH.A00(lai.A01, EnumC46240KdG.GOOGLE_DRIVE, "fetchTPIDForGDrive");
                } else {
                    A00 = C47967LIb.A00(lai.A00, 3);
                }
                lsi = new LSI(6, c44456JlO, lai, this.A01);
                break;
            case 1:
                C47967LIb c47967LIb = ((LAI) obj).A00;
                A00 = LK0.A00();
                if (!AbstractC25231BEo.A1b(c47967LIb.A01.A00)) {
                    C47967LIb.A01(A00);
                } else {
                    c47967LIb.A00 = new C48162LTm(new DH1(38, A00, c47967LIb));
                    K3W k3w = c47967LIb.A02;
                    JRS A002 = JRS.A00(c47967LIb, 12);
                    InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
                    MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, A002);
                    AbstractC43594JPz.A1G(A0H, new C44176Jff(k3w, A0I, 26), A0I);
                }
                lsi = new LSD(17, this.A02, this.A01);
                break;
            case 2:
                LAI lai2 = (LAI) obj;
                A00 = lai2.A01();
                lsi = new LSI(9, this.A02, this.A01, lai2);
                break;
            case 3:
                return C46h.A00(((C47954LGp) this.A02).A00(((DirectPrivateStoryRecipientController) this.A01).A0T));
            case 4:
                C34632FNp c34632FNp = (C34632FNp) this.A02;
                List list = (List) ((E72) obj).A00;
                C83693oE A02 = AbstractC1345466e.A02(((E70) this.A01).A0L);
                if (A02 != null && (str = A02.A00) != null && (A0d = AbstractC43594JPz.A0d((userSession = c34632FNp.A02), str)) != null && (Aic = A0d.Aic()) != null && C78X.A00(userSession, Aic)) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj2 : list) {
                        AbstractC43593JPy.A1R(((C35169FfL) obj2).A03(), AbstractC166997dE.A0a(), obj2, A1E);
                    }
                    return A1E;
                }
                return list;
            case 5:
                C49230Lpl c49230Lpl = (C49230Lpl) this.A01;
                if (c49230Lpl.A02) {
                    C83693oE c83693oE = c49230Lpl.A00;
                    KW0 kw0 = (KW0) this.A02;
                    UserSession userSession2 = kw0.A00;
                    AnonymousClass988 anonymousClass988 = kw0.A01;
                    AbstractC167017dG.A1P(userSession2, anonymousClass988);
                    C81663kb B3U = AbstractC28761aE.A00(userSession2).B3U(C7P4.A00(c83693oE));
                    if (B3U != null) {
                        c7tt = C7V4.A02.A00(userSession2, anonymousClass988, B3U, c83693oE, false);
                        return new C49223Lpe(c7tt, c49230Lpl.A01);
                    }
                }
                c7tt = null;
                return new C49223Lpe(c7tt, c49230Lpl.A01);
            case 6:
                MessagingUser messagingUser = (MessagingUser) obj;
                C14360o3.A0A(messagingUser);
                MsysThreadId msysThreadId = (MsysThreadId) this.A01;
                AuthData A003 = AnonymousClass618.A00((UserSession) this.A02);
                C47750L6u c47750L6u = new C47750L6u();
                c47750L6u.A01.add(new C7VB(true, false, false, true));
                c47750L6u.A00++;
                return new C45279K2h(null, null, null, null, A003, C160847Is.A0y, messagingUser, c47750L6u, msysThreadId, LDX.A00, null, null, null, AbstractC166987dD.A1H(), 20, 0, 0, 0, 0, -1);
            case 7:
                C32864Ed6 c32864Ed6 = (C32864Ed6) this.A02;
                C137756Lx c137756Lx = c32864Ed6.A02;
                C42221xC c42221xC = c137756Lx.A00;
                C137766Ly c137766Ly = c137756Lx.A01;
                MsysThreadId msysThreadId2 = c32864Ed6.A03;
                return C42221xC.A04(new C36223Fyc((AuthData) this.A01, c32864Ed6), c42221xC, c137766Ly.A01(msysThreadId2), c137766Ly.A09.A0L(new C48339LaF(msysThreadId2)), c137766Ly.A0D.A0L(new JQI(2)));
            default:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A02;
                C137766Ly c137766Ly2 = ((C137756Lx) this.A01).A01;
                C3o9 c3o9 = directVisualMessageViewerController.A0x;
                C14360o3.A0C(c3o9, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.MsysThreadId");
                long j = ((MsysThreadId) c3o9).A00;
                Long A0d2 = AbstractC167007dF.A0d();
                int i = -1;
                return C43597JQd.A00(c137766Ly2.A09.A0L(new C48367Lah(A0d2, A0d2, i, i, j)), directVisualMessageViewerController, 64);
        }
        A00.A04(lsi);
        return C0eB.A00;
    }
}
