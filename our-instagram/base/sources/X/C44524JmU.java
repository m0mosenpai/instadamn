package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import java.util.ArrayList;

/* renamed from: X.JmU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44524JmU extends AbstractC52922bZ {
    public C05A A00;
    public C05A A01;
    public C05A A02;
    public final C0UO A03;
    public final C0UO A04;
    public final boolean A05;
    public final UserSession A06;
    public final boolean A07;

    public C44524JmU(UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A05 = z;
        this.A07 = z2;
        NoteAudience noteAudience = NoteAudience.A07;
        C008002u A1H = AbstractC25225BEi.A1H(new NoteAudienceItem(noteAudience, null, null, 0));
        this.A01 = A1H;
        this.A03 = AbstractC208910l.A02(A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(new NoteAudienceItem(noteAudience, null, null, 0));
        this.A02 = A1H2;
        this.A04 = AbstractC208910l.A02(A1H2);
        this.A00 = AbstractC31171DnF.A0o();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new NoteAudienceItem(noteAudience, null, null, 0));
        A1E.add(new NoteAudienceItem(NoteAudience.A05, null, null, 0));
        boolean A00 = C1C0.A00(userSession);
        if (z ? !(!A00 || !C18U.A06(C06090Tz.A05, userSession, 36320618575110902L)) : A00) {
            A1E.add(new NoteAudienceItem(NoteAudience.A06, null, null, 0));
        }
        this.A00.Egh(A1E);
    }

    public final NoteAudienceItem A00() {
        C1AV c1av;
        NoteAudience noteAudience;
        UserSession userSession = this.A06;
        C1AU A01 = C1AT.A01(userSession);
        boolean z = this.A05;
        if (z) {
            c1av = C1AV.A0v;
        } else {
            c1av = C1AV.A2M;
        }
        String string = AbstractC31174DnI.A0g(A01, c1av, this).getString("AudiencePickerViewModel.DefaultNotesAudience", null);
        if (string != null && ((NoteAudience.valueOf(string) != NoteAudience.A06 || C1C0.A00(userSession)) && (z || this.A07 || !C18U.A06(C06090Tz.A05, userSession, 36323826912603774L)))) {
            noteAudience = NoteAudience.valueOf(string);
        } else {
            noteAudience = NoteAudience.A07;
        }
        return new NoteAudienceItem(noteAudience, null, null, 0);
    }

    public final void A01() {
        C1AV c1av;
        String str;
        Object value = this.A02.getValue();
        C14360o3.A0B(value, 0);
        this.A01.Egh(value);
        boolean z = this.A05;
        if (!z && !this.A07) {
            if (C18U.A06(C06090Tz.A05, this.A06, 36323826912603774L)) {
                return;
            }
        }
        C1AU A01 = C1AT.A01(this.A06);
        if (z) {
            c1av = C1AV.A0v;
        } else {
            c1av = C1AV.A2M;
        }
        InterfaceC19610xo ARD = AbstractC31174DnI.A0g(A01, c1av, this).ARD();
        NoteAudienceItem noteAudienceItem = (NoteAudienceItem) this.A04.getValue();
        if (noteAudienceItem != null) {
            str = noteAudienceItem.A00.name();
        } else {
            str = null;
        }
        ARD.E7K("AudiencePickerViewModel.DefaultNotesAudience", str);
        ARD.apply();
    }
}
