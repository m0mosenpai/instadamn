package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jn6 extends AbstractC52922bZ {
    public int A00;
    public InterfaceC169517hR A01;
    public Float A02;
    public Float A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public C05A A09;
    public C05A A0A;
    public C05A A0B;
    public C05A A0C;
    public C05A A0D;
    public C05A A0E;
    public boolean A0F;
    public boolean A0G;
    public C05A A0H;
    public C05A A0I;
    public C05A A0J;
    public C05A A0K;
    public final int A0L;
    public final UserSession A0M;
    public final C4F0 A0N;
    public final NotesRepository A0O;
    public final KZC A0P;
    public final C05A A0Q;
    public final C05A A0R;
    public final C05A A0S;
    public final C05A A0T;
    public final C05A A0U;
    public final C0UO A0V;
    public final C0UO A0W;
    public final C0UO A0X;
    public final C0UO A0Y;
    public final C0UO A0Z;
    public final C0UO A0a;
    public final C0UO A0b;
    public final C0UO A0c;
    public final C0UO A0d;
    public final C0UO A0e;
    public final C0UO A0f;
    public final C0UO A0g;
    public final C0UO A0h;
    public final C0UO A0i;
    public final C0UO A0j;

    public Jn6(UserSession userSession, C4F0 c4f0, NotesRepository notesRepository, KZC kzc) {
        AbstractC25233BEq.A0w(2, notesRepository, c4f0, kzc);
        this.A0M = userSession;
        this.A0O = notesRepository;
        this.A0N = c4f0;
        this.A0P = kzc;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC46184KcM.A06);
        this.A0E = A1H;
        this.A0h = AbstractC208910l.A02(A1H);
        C008002u A00 = C10E.A00(Integer.valueOf(C4AC.A00(userSession)));
        this.A0I = A00;
        this.A0Z = AbstractC208910l.A02(A00);
        C06090Tz c06090Tz = C06090Tz.A05;
        C008002u A002 = C10E.A00(AbstractC31172DnG.A0s(C18U.A06(c06090Tz, userSession, 36317607800018339L)));
        this.A0H = A002;
        this.A0Y = AbstractC208910l.A02(A002);
        C008002u A003 = C10E.A00(null);
        this.A0J = A003;
        this.A0c = AbstractC208910l.A02(A003);
        C008002u A004 = C10E.A00(null);
        this.A0D = A004;
        this.A0j = AbstractC208910l.A02(A004);
        C008002u A1H2 = AbstractC25225BEi.A1H(EnumC46160Kby.A02);
        this.A0K = A1H2;
        this.A0e = AbstractC208910l.A02(A1H2);
        C008002u A005 = C10E.A00(C45109Jxe.A03);
        this.A0U = A005;
        this.A0i = AbstractC208910l.A02(A005);
        C008002u A006 = C10E.A00(null);
        this.A0T = A006;
        this.A0g = AbstractC208910l.A02(A006);
        C008002u A007 = C10E.A00(null);
        this.A0R = A007;
        this.A0W = AbstractC208910l.A02(A007);
        C008002u A008 = C10E.A00(null);
        this.A0Q = A008;
        this.A0V = AbstractC208910l.A02(A008);
        C008002u A009 = C10E.A00(null);
        this.A0S = A009;
        this.A0X = AbstractC208910l.A02(A009);
        C008002u A0010 = C10E.A00(null);
        this.A09 = A0010;
        this.A0a = AbstractC208910l.A02(A0010);
        C008002u A0011 = C10E.A00(null);
        this.A0B = A0011;
        this.A0d = AbstractC208910l.A02(A0011);
        C008002u A0012 = C10E.A00(null);
        this.A0C = A0012;
        this.A0f = AbstractC208910l.A02(A0012);
        C008002u A0013 = C10E.A00(null);
        this.A0A = A0013;
        this.A0b = AbstractC208910l.A02(A0013);
        this.A0L = AbstractC25225BEi.A07(c06090Tz, userSession, 36607230329558579L);
        if (C18U.A06(c06090Tz, userSession, 36329071067545599L)) {
            MCO.A04(this, AbstractC141776au.A00(this), 0);
        }
    }

    public static final void A01(Jn6 jn6, String str) {
        C05A c05a;
        boolean z;
        boolean z2 = true;
        if (str != null && str.length() != 0) {
            C05A c05a2 = jn6.A0I;
            UserSession userSession = jn6.A0M;
            c05a2.Egh(Integer.valueOf(C4AC.A00(userSession) - AbstractC13670mt.A00(str)));
            c05a = jn6.A0H;
            if (C18U.A06(C06090Tz.A05, userSession, 36317607800018339L) && AbstractC166987dD.A0H(c05a2.getValue()) > 5) {
                z2 = false;
            }
            z = Boolean.valueOf(z2);
        } else {
            c05a = jn6.A0H;
            z = false;
        }
        c05a.Egh(z);
    }

    private final boolean A03(String str) {
        String A1A;
        return str != null && (A1A = AbstractC25228BEl.A1A(str)) != null && A1A.length() > 0 && C4AC.A00(this.A0M) - AbstractC13670mt.A00(AbstractC25228BEl.A1A(str)) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r3 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02cd, code lost:
    
        if (r33.A03 == null) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(android.content.Context r34, com.instagram.direct.inbox.notes.models.NoteAudienceItem r35, com.instagram.direct.inbox.notes.models.NoteCreationSource r36, java.lang.String r37, java.util.List r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jn6.A05(android.content.Context, com.instagram.direct.inbox.notes.models.NoteAudienceItem, com.instagram.direct.inbox.notes.models.NoteCreationSource, java.lang.String, java.util.List, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r3.A02() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.Jn6 r3) {
        /*
            X.05A r2 = r3.A0K
            boolean r0 = r3.A07()
            if (r0 == 0) goto L44
            java.lang.String r0 = r3.A06
            boolean r1 = r3.A03(r0)
            java.lang.String r0 = r3.A05
            boolean r0 = r3.A03(r0)
            if (r1 == 0) goto L2f
            if (r0 != 0) goto L26
            com.instagram.common.session.UserSession r0 = r3.A0M
            boolean r0 = X.C4AC.A0B(r0)
            if (r0 == 0) goto L2c
            boolean r0 = r3.A02()
            if (r0 == 0) goto L2c
        L26:
            X.Kby r0 = X.EnumC46160Kby.A03
        L28:
            r2.Egh(r0)
            return
        L2c:
            X.Kby r0 = X.EnumC46160Kby.A05
            goto L28
        L2f:
            if (r0 != 0) goto L41
            com.instagram.common.session.UserSession r0 = r3.A0M
            boolean r0 = X.C4AC.A0B(r0)
            if (r0 == 0) goto L53
            X.0UO r0 = r3.A0c
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L53
        L41:
            X.Kby r0 = X.EnumC46160Kby.A04
            goto L28
        L44:
            java.lang.String r0 = r3.A05
            boolean r0 = r3.A03(r0)
            if (r0 != 0) goto L26
            boolean r0 = r3.A02()
            if (r0 == 0) goto L53
            goto L26
        L53:
            X.Kby r0 = X.EnumC46160Kby.A02
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jn6.A00(X.Jn6):void");
    }

    private final boolean A02() {
        UserSession userSession = this.A0M;
        if (!C4AC.A06(userSession) || C18U.A06(C06090Tz.A05, userSession, 36321413140915611L) || this.A0c.getValue() == null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if ((!C18U.A06(c06090Tz, userSession, 36320025866411946L) || this.A0g.getValue() == null) && ((this.A0W.getValue() == null || (C18U.A06(c06090Tz, userSession, 36320468248175122L) && (this.A02 == null || this.A03 == null))) && ((this.A0V.getValue() == null || (C18U.A06(c06090Tz, userSession, 36320468248175122L) && (this.A02 == null || this.A03 == null))) && !AbstractC167007dF.A1X(this.A0E.getValue(), EnumC46184KcM.A0A)))) {
                return false;
            }
        }
        return true;
    }

    public final void A04() {
        Object value = this.A0h.getValue();
        EnumC46184KcM enumC46184KcM = EnumC46184KcM.A0A;
        if (value != enumC46184KcM) {
            this.A0E.Egh(enumC46184KcM);
            this.A0A.Egh(C45828KQj.A00);
            this.A0K.Egh(EnumC46160Kby.A02);
        }
        NotesRepository notesRepository = this.A0O;
        GSR.A02(notesRepository, ((C4A7) notesRepository).A01, 36);
    }

    public final void A06(AudioOverlayTrack audioOverlayTrack, String str) {
        C05A c05a;
        EnumC46184KcM enumC46184KcM;
        C05A c05a2 = this.A0J;
        if (audioOverlayTrack == null) {
            c05a2.Egh(null);
            c05a = this.A0E;
            if (c05a.getValue() == EnumC46184KcM.A09) {
                enumC46184KcM = EnumC46184KcM.A08;
            } else {
                enumC46184KcM = EnumC46184KcM.A06;
            }
        } else {
            c05a2.Egh(new C45127Jxw(audioOverlayTrack, str));
            c05a = this.A0E;
            if (c05a.getValue() == EnumC46184KcM.A08) {
                enumC46184KcM = EnumC46184KcM.A09;
            } else {
                enumC46184KcM = EnumC46184KcM.A05;
            }
        }
        c05a.Egh(enumC46184KcM);
        A00(this);
    }

    public final boolean A07() {
        C05A c05a = this.A0E;
        if (c05a.getValue() != EnumC46184KcM.A08 && c05a.getValue() != EnumC46184KcM.A09) {
            return false;
        }
        return true;
    }
}
