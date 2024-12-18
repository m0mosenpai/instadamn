package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.JmY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44528JmY extends AbstractC52922bZ {
    public final String A00;
    public final String A01;
    public final C0UO A02;
    public final C0UO A03;
    public final UserSession A04;
    public final KZJ A05;
    public final NotesRepository A06;
    public final KZK A07;
    public final String A08;
    public final boolean A09;

    public C44528JmY(UserSession userSession, KZJ kzj, NotesRepository notesRepository, KZK kzk, String str, String str2, String str3, boolean z) {
        C0UO c0uo;
        int i;
        C0UO c0uo2;
        C0UO c0uo3;
        int i2;
        C14360o3.A0B(notesRepository, 6);
        this.A04 = userSession;
        this.A01 = str;
        this.A08 = str2;
        this.A00 = str3;
        this.A09 = z;
        this.A06 = notesRepository;
        this.A05 = kzj;
        this.A07 = kzk;
        if (str3 != null) {
            c0uo = kzj.A07;
            i = 7;
        } else if (z) {
            c0uo = kzk.A07;
            i = 8;
        } else {
            c0uo = notesRepository.A0n;
            i = 9;
        }
        C31199Dni c31199Dni = new C31199Dni(i, c0uo, this);
        C141796aw A00 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A01;
        this.A02 = AbstractC208910l.A01(C16930sl.A00, A00, c31199Dni, c10h);
        if (str3 != null) {
            c0uo3 = kzj.A08;
            i2 = 10;
        } else if (z) {
            c0uo3 = kzk.A08;
            i2 = 11;
        } else {
            c0uo2 = notesRepository.A0o;
            this.A03 = c0uo2;
        }
        c0uo2 = AbstractC208910l.A01(false, AbstractC141776au.A00(this), new C31199Dni(i2, c0uo3, this), c10h);
        this.A03 = c0uo2;
    }

    public final void A00() {
        String str;
        String str2 = this.A00;
        if (str2 != null) {
            KZJ kzj = this.A05;
            InterfaceC111084zP interfaceC111084zP = (InterfaceC111084zP) kzj.A02.get(str2);
            if (interfaceC111084zP != null && interfaceC111084zP.BUt()) {
                kzj.A00(str2, interfaceC111084zP.BPp());
                return;
            }
            return;
        }
        if (this.A09 && (str = this.A01) != null) {
            KZK kzk = this.A07;
            InterfaceC111084zP interfaceC111084zP2 = (InterfaceC111084zP) kzk.A02.get(str);
            if (interfaceC111084zP2 == null || !interfaceC111084zP2.BUt()) {
                return;
            }
            kzk.A00(str, interfaceC111084zP2.BPp());
            return;
        }
        String str3 = this.A01;
        if (str3 == null) {
            return;
        }
        NotesRepository notesRepository = this.A06;
        String str4 = this.A08;
        InterfaceC111084zP interfaceC111084zP3 = (InterfaceC111084zP) notesRepository.A0J.get(str3);
        if (interfaceC111084zP3 == null || !interfaceC111084zP3.BUt()) {
            return;
        }
        notesRepository.A0R(str3, str4, interfaceC111084zP3.BPp(), false);
    }

    public final void A01() {
        C19L c19l;
        InterfaceC16620sF c206649Cv;
        C4A7 c4a7;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        String str = this.A00;
        if (str != null) {
            c4a7 = this.A05;
            c19l = c4a7.A01;
            interfaceC23621Ds = null;
            i = 15;
        } else if (this.A09 && (str = this.A01) != null) {
            c4a7 = this.A07;
            c19l = c4a7.A01;
            interfaceC23621Ds = null;
            i = 30;
        } else {
            NotesRepository notesRepository = this.A06;
            c19l = ((C4A7) notesRepository).A01;
            c206649Cv = new C206649Cv(notesRepository, null, 11);
            AbstractC166987dD.A1Z(c206649Cv, c19l);
        }
        c206649Cv = new MCF(c4a7, str, interfaceC23621Ds, i);
        AbstractC166987dD.A1Z(c206649Cv, c19l);
    }

    public final void A02(boolean z) {
        String str;
        String str2 = this.A00;
        if (str2 != null) {
            this.A05.A00(str2, null);
            return;
        }
        if (this.A09 && (str = this.A01) != null) {
            this.A07.A00(str, null);
            return;
        }
        String str3 = this.A01;
        if (str3 == null) {
            return;
        }
        this.A06.A0R(str3, this.A08, null, z);
    }
}
