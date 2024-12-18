package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kaw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46096Kaw extends PJX {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ boolean A03;

    public C46096Kaw(FragmentActivity fragmentActivity, UserSession userSession, long j, boolean z) {
        this.A02 = userSession;
        this.A00 = j;
        this.A03 = z;
        this.A01 = fragmentActivity;
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        List list;
        UserSession userSession = this.A02;
        NotesRepository A00 = C4A5.A00(userSession);
        long j = this.A00;
        C45052Jwh c45052Jwh = (C45052Jwh) AbstractC25231BEo.A0o(String.valueOf(j), A00.A0r);
        boolean z = false;
        if (c45052Jwh != null && (list = c45052Jwh.A05) != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (AbstractC31174DnI.A1Y(C6C8.A05(A00.A0B), ((C6C9) it.next()).A0D.getId())) {
                    z = true;
                    break;
                }
            }
        }
        if (this.A03) {
            if (C18U.A06(C06090Tz.A05, userSession, 36321267113010458L)) {
                AbstractC166987dD.A1Z(new C50121MBv(A00, userSession, null, 7, j), C07Y.A00(this.A01));
            }
            if (z) {
                C41451vu c41451vu = C41451vu.A01;
                C146106i8 A0Y = AbstractC31174DnI.A0Y();
                A0Y.A0H = "prompt_note_response_deleted";
                AbstractC31172DnG.A1H(this.A01.getResources(), A0Y, 2131968799);
                AbstractC31178DnM.A1N(c41451vu, A0Y);
            }
        }
    }
}
