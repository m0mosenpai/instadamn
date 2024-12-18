package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Eg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92904Eg extends C4A7 {
    public String A00;
    public Map A01;
    public AnonymousClass195 A02;
    public final C41761wQ A03;
    public final UserSession A04;
    public final C92914Eh A05;
    public final NotesRepository A06;
    public final C41951wl A07;
    public final C4El A08;
    public final C18A A09;
    public final java.util.Set A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC19390xP A0E;
    public final InterfaceC19390xP A0F;
    public final InterfaceC19390xP A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C41891wf A0K;

    public C92904Eg(UserSession userSession, C92914Eh c92914Eh, NotesRepository notesRepository) {
        super("Direct", C4A8.A01(1889994548, C18U.A06(C06090Tz.A05, userSession, 36323178372607035L) ? 2 : 3));
        this.A04 = userSession;
        this.A06 = notesRepository;
        this.A05 = c92914Eh;
        this.A01 = AbstractC06930Yk.A0E();
        this.A0A = new LinkedHashSet();
        this.A09 = AnonymousClass189.A00(userSession);
        this.A07 = C41951wl.A00(userSession);
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A0K = A01;
        this.A08 = AbstractC92924Ek.A00(userSession);
        this.A0B = AbstractC09440dt.A01(new C206869Dr(this, 11));
        this.A03 = new C41761wQ(null);
        this.A0G = C0JE.A00(new C9D4(this, null, 0));
        this.A0H = C10E.A00(C16930sl.A00);
        this.A0J = C10E.A00(null);
        this.A0C = AbstractC09440dt.A01(new C206869Dr(this, 12));
        this.A0E = notesRepository.A0e;
        this.A0F = notesRepository.A0g;
        this.A0I = C10E.A00(AbstractC92944En.A04(userSession.deviceSession.A06(), userSession, false, false, false, false, false));
        this.A0D = AbstractC09440dt.A01(new C206869Dr(this, 13));
        A00();
        notesRepository.A0D();
        AbstractC18560vj.A03(super.A01, new C15340po(new C9D0(this, null, 41), notesRepository.A0k));
    }

    private final void A00() {
        UserSession userSession = this.A04;
        if (C4AC.A01(userSession) && !C18U.A06(C06090Tz.A05, userSession, 36327486225398387L)) {
            AnonymousClass195 anonymousClass195 = this.A02;
            if (anonymousClass195 != null && anonymousClass195.isActive()) {
                return;
            }
            C19L c19l = super.A01;
            C206629Ct c206629Ct = new C206629Ct(this, null, 22);
            this.A02 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, c19l);
        }
    }

    public static final void A01(C5e4 c5e4, C92904Eg c92904Eg) {
        List list = c5e4.A01("direct_inbox_active_now").A02;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List unmodifiableList = Collections.unmodifiableList(((DirectShareTarget) obj).A0Q);
            if (unmodifiableList != null && !unmodifiableList.isEmpty()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List unmodifiableList2 = Collections.unmodifiableList(((DirectShareTarget) it.next()).A0Q);
            C14360o3.A07(unmodifiableList2);
            String str = ((PendingRecipient) AbstractC001800i.A0I(unmodifiableList2)).A0B;
            if (str == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        C05A c05a = c92904Eg.A0H;
        if (!C14360o3.A0K(c05a.getValue(), arrayList2)) {
            c05a.Egh(arrayList2);
        }
    }

    public final void A02(Integer num, Runnable runnable, boolean z) {
        A00();
        this.A06.A0N(num, runnable, z, false);
        if (C18U.A06(C06090Tz.A06, this.A04, 36324264999333941L)) {
            C92914Eh c92914Eh = this.A05;
            AnonymousClass195 anonymousClass195 = c92914Eh.A01;
            if (anonymousClass195 != null && anonymousClass195.isActive()) {
                return;
            }
            if (!z && c92914Eh.A00 + C92914Eh.A07 >= System.currentTimeMillis()) {
                return;
            }
            C19L c19l = ((C4A7) c92914Eh).A01;
            C206649Cv c206649Cv = new C206649Cv(c92914Eh, null, 9);
            c92914Eh.A01 = AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
        }
    }
}
