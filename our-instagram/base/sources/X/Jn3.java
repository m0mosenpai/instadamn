package X;

import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent;
import com.instagram.direct.inbox.notes.reply.QuickReplySheetContent;
import com.instagram.friendmap.data.FriendMapRepository;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Jn3 extends AbstractC52922bZ {
    public long A00;
    public boolean A01;
    public final UserSession A02;
    public final C4F0 A03;
    public final NotesRepository A04;
    public final FriendMapRepository A05;
    public final String A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final QuickReplySheetContent A0B;

    /* JADX WARN: Code restructure failed: missing block: B:101:0x009f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36328048865524796L) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01bc, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c8, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c3, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c4, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0065, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        r13 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        r2 = r0.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        if (r2 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        r12 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        r20 = null;
        r20 = null;
        r20 = null;
        r20 = null;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (r0 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        r2 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (r2 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        r2 = r2.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36328048865393722L) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r2 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r2 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r3 = r2.A00;
        r45 = X.AbstractC31177DnL.A03(r3.BVa().Adg());
        r4 = r3.BVa().BaR();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r4 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        r46 = r4.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        r44 = r3.BVa().getDerivedContentId();
        r47 = r3.BVa().getShouldMuteAudio();
        r40 = r3.BVV();
        r5 = r2.A01;
        r4 = r2.A02;
        r2 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        if (r16 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        r3 = r3.BVV().BPT();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        r20 = r3.EwA();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        r38 = new X.C45068Jwx(r20, r40, r5, r4, r2, r44, r45, r46, r47);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        r20 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0159, code lost:
    
        r46 = 30000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015d, code lost:
    
        r2 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015f, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0161, code lost:
    
        r3 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0163, code lost:
    
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0165, code lost:
    
        r4 = r3.BVa();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0169, code lost:
    
        if (r4 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016b, code lost:
    
        r4 = r4.Adg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016f, code lost:
    
        if (r4 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0171, code lost:
    
        r45 = r4.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0175, code lost:
    
        r4 = r3.BVa();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0179, code lost:
    
        if (r4 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017b, code lost:
    
        r4 = r4.BaR();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017f, code lost:
    
        if (r4 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0181, code lost:
    
        r46 = r4.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0185, code lost:
    
        r4 = r3.BVa();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0189, code lost:
    
        if (r4 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018b, code lost:
    
        r44 = r4.getDerivedContentId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018f, code lost:
    
        r4 = r3.BVa();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0193, code lost:
    
        if (r4 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0195, code lost:
    
        r47 = r4.getShouldMuteAudio();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0199, code lost:
    
        r38 = new X.C45068Jwx(null, r3.BVV(), null, false, r2.A02, r44, r45, r46, r47);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b0, code lost:
    
        r47 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b3, code lost:
    
        r44 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b6, code lost:
    
        r46 = 30000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b9, code lost:
    
        r45 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
    
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fe, code lost:
    
        r7 = r0.A06;
        r2 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0102, code lost:
    
        if (r2 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0104, code lost:
    
        r5 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        r2 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0108, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
    
        r4 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010c, code lost:
    
        r3 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010e, code lost:
    
        r35 = X.AbstractC166997dE.A1Z(r46.A0E, true);
        r2 = r46.A0O;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0116, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0118, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011a, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011c, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011e, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        r0 = r0.BVV();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0124, code lost:
    
        if (r0 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0126, code lost:
    
        r29 = r0.getAudioClusterId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012a, code lost:
    
        r0 = r46.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0061, code lost:
    
        if (r0.A0B == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012c, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012e, code lost:
    
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0130, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0132, code lost:
    
        r6 = X.AbstractC167017dG.A0q(r0);
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013e, code lost:
    
        if (r1.hasNext() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0140, code lost:
    
        r6.add(((X.C38705H2q) r1.next()).A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cb, code lost:
    
        r11.Egh(new X.C45842KQx(r3, r7, r4, r5, r17, null, r10, r20, r0, r22, r23, r15, r9, r26, r13, r12, r29, r6, r31, r32, r33, r14, r35, r36, r37, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ed, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        r2 = r0.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014c, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0154, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0155, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0157, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0150, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0151, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x014f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0092, code lost:
    
        if (r15.length() != 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        if (r2 == null) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C6C9 r46, X.Jn3 r47) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jn3.A02(X.6C9, X.Jn3):void");
    }

    public Jn3(UserSession userSession, C4F0 c4f0, NotesRepository notesRepository, QuickReplySheetContent quickReplySheetContent, FriendMapRepository friendMapRepository, String str, long j) {
        C0UO c0uo;
        GST gst;
        C45068Jwx c45068Jwx;
        this.A02 = userSession;
        this.A04 = notesRepository;
        this.A03 = c4f0;
        this.A05 = friendMapRepository;
        this.A00 = j;
        this.A06 = str;
        this.A0B = quickReplySheetContent;
        C008002u A00 = C10E.A00(C45844KQz.A00);
        this.A08 = A00;
        this.A0A = AbstractC208910l.A02(A00);
        C008002u A002 = C10E.A00(null);
        this.A07 = A002;
        this.A09 = AbstractC208910l.A02(A002);
        this.A01 = true;
        if (quickReplySheetContent != null) {
            String valueOf = String.valueOf(quickReplySheetContent.A00);
            String str2 = quickReplySheetContent.A0F;
            String str3 = quickReplySheetContent.A0A;
            ImageUrl imageUrl = quickReplySheetContent.A05;
            String str4 = quickReplySheetContent.A0B;
            String str5 = quickReplySheetContent.A09;
            NotesRepository notesRepository2 = this.A04;
            UserSession userSession2 = this.A02;
            int A05 = notesRepository2.A05(userSession2.userId);
            NoteAudience noteAudience = quickReplySheetContent.A07;
            String str6 = quickReplySheetContent.A0E;
            boolean A1X = AbstractC167007dF.A1X(noteAudience, NoteAudience.A05);
            boolean A003 = AbstractC43643JSb.A00(AbstractC31174DnI.A0k(userSession2, str5));
            boolean z = quickReplySheetContent.A0H;
            boolean z2 = quickReplySheetContent.A0J;
            boolean z3 = quickReplySheetContent.A0I;
            String str7 = quickReplySheetContent.A0D;
            String str8 = quickReplySheetContent.A0C;
            MusicNoteQuickReplySheetContent musicNoteQuickReplySheetContent = quickReplySheetContent.A08;
            if (musicNoteQuickReplySheetContent != null) {
                int i = musicNoteQuickReplySheetContent.A01;
                int i2 = musicNoteQuickReplySheetContent.A00;
                c45068Jwx = new C45068Jwx(null, musicNoteQuickReplySheetContent.A02, musicNoteQuickReplySheetContent.A03, musicNoteQuickReplySheetContent.A04, musicNoteQuickReplySheetContent.A05, musicNoteQuickReplySheetContent.A06, i, i2, musicNoteQuickReplySheetContent.A07);
            } else {
                c45068Jwx = null;
            }
            LocationNoteResponseInfo locationNoteResponseInfo = quickReplySheetContent.A02;
            NotePogVideoDict notePogVideoDict = quickReplySheetContent.A04;
            A00.Egh(new C45842KQx(quickReplySheetContent.A01, locationNoteResponseInfo, quickReplySheetContent.A03, notePogVideoDict, imageUrl, quickReplySheetContent.A06, noteAudience, c45068Jwx, valueOf, str2, str3, str4, str5, str6, str7, str8, null, null, A05, A1X, A003, z, quickReplySheetContent.A0G, z2, z3, true));
            return;
        }
        if (str != null) {
            c0uo = notesRepository.A0r;
            gst = new GST(this, null, 35);
        } else {
            c0uo = notesRepository.A0p;
            gst = new GST(this, null, 36);
        }
        AbstractC25232BEp.A1J(this, gst, c0uo);
    }

    public static final C6C9 A00(Jn3 jn3, Map map) {
        List list;
        C45052Jwh c45052Jwh = (C45052Jwh) map.get(jn3.A06);
        Object obj = null;
        if (c45052Jwh == null || (list = c45052Jwh.A05) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C14360o3.A0K(((C6C9) next).A0H, String.valueOf(jn3.A00))) {
                obj = next;
                break;
            }
        }
        return (C6C9) obj;
    }

    public static Object A01(C45487KCc c45487KCc) {
        return ((Jn3) c45487KCc.A0j.getValue()).A0A.getValue();
    }

    public static final void A03(Jn3 jn3) {
        if (jn3.A01) {
            AbstractC166987dD.A1Z(new MC6(jn3, null, 24), AbstractC141776au.A00(jn3));
        }
    }
}
