package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;

/* renamed from: X.NJb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52457NJb extends AbstractC55082Oac {
    public String A00;
    public final C07X A01;
    public final UserSession A02;
    public final ClipsSharingDraftViewModel A03;
    public final C05A A04;
    public final C0UO A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52457NJb(C07X c07x, UserSession userSession, ClipsSharingDraftViewModel clipsSharingDraftViewModel) {
        super(userSession);
        Object obj;
        C128175qm A09;
        String str;
        C128175qm A092;
        AbstractC167017dG.A1P(userSession, clipsSharingDraftViewModel);
        C14360o3.A0B(c07x, 3);
        this.A02 = userSession;
        this.A03 = clipsSharingDraftViewModel;
        this.A01 = c07x;
        boolean z = clipsSharingDraftViewModel.A0A;
        if (z && (A092 = clipsSharingDraftViewModel.A07.A09()) != null) {
            obj = new C8ZT(OOw.A00(A092));
        } else {
            obj = C193588hd.A00;
        }
        C008002u A00 = C10E.A00(obj);
        this.A04 = A00;
        this.A05 = AbstractC208910l.A02(A00);
        String str2 = "";
        if (z && (A09 = clipsSharingDraftViewModel.A07.A09()) != null && (str = A09.A0S) != null) {
            str2 = str;
        }
        this.A00 = str2;
        ClipsSharingDraftViewModel clipsSharingDraftViewModel2 = this.A03;
        C2GS c2gs = clipsSharingDraftViewModel2.A03;
        C07X c07x2 = this.A01;
        c2gs.A06(c07x2, new C151846sU(new C44145JfA(this, 3)));
        MY1.A01(c07x2, clipsSharingDraftViewModel2.A01, this, 12);
        AbstractC31174DnI.A1E(c07x2, clipsSharingDraftViewModel2.A00, new C57749Pjc(this, 19), 4);
    }
}
