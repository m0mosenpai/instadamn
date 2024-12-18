package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.LhN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48755LhN implements InterfaceC50465MPt {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final NotesRepository A03;
    public final boolean A04;

    public /* synthetic */ C48755LhN(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, int i, boolean z) {
        z = (i & 8) != 0 ? false : z;
        NotesRepository A00 = (i & 16) != 0 ? C4A5.A00(userSession) : null;
        C14360o3.A0B(A00, 5);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        this.A04 = z;
        this.A03 = A00;
    }

    @Override // X.InterfaceC50465MPt
    public final void DW0(L5X l5x) {
        Long A0j;
        C14360o3.A0B(l5x, 0);
        String str = l5x.A09;
        if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
            long longValue = A0j.longValue();
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A02;
            C50674MYs c50674MYs = new C50674MYs(fragmentActivity, userSession);
            c50674MYs.A01(new LOw(this, longValue, 1), 2131954100);
            if (C18U.A06(C06090Tz.A05, userSession, 36321267112813847L)) {
                c50674MYs.A03(new LOw(this, longValue, 2), 2131954103);
            }
            C31727DwY.A00(fragmentActivity, c50674MYs);
        }
    }

    @Override // X.InterfaceC50465MPt
    public final void DW3(L5X l5x) {
        C14360o3.A0B(l5x, 0);
        if (this.A04) {
            NotesRepository notesRepository = this.A03;
            C05A c05a = notesRepository.A0T;
            C05A c05a2 = notesRepository.A0b;
            c05a.Egh(c05a2.getValue());
            c05a2.Egh(C16930sl.A00);
            return;
        }
        KDK kdk = new KDK();
        AbstractC25227BEk.A1C(kdk, AbstractC167007dF.A1b("arg_num_of_total_prompt_responses", l5x.A06, AbstractC166987dD.A1L("arg_prompt_id", l5x.A09), AbstractC166987dD.A1L("arg_prompt_title", l5x.A0A)));
        C189448aO A0y = AbstractC25225BEi.A0y(this.A02);
        A0y.A1R = true;
        A0y.A0T = kdk;
        A0y.A0U = new C56758PHa(2, this, l5x);
        A0y.A00().A02(this.A00, kdk);
    }
}
