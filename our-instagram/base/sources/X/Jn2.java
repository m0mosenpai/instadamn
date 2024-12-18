package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jn2 extends AbstractC52922bZ {
    public boolean A00;
    public final UserSession A01;
    public final NotesRepository A02;
    public final C44528JmY A03;
    public final String A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;
    public final C0UO A09;
    public final L5X A0A;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r12.A0E == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        r2 = r12.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        X.AbstractC25232BEp.A1J(r9, new X.MBY(r9, r5, r6, null, 5), r11.A0r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        X.AbstractC25232BEp.A1J(r9, new X.GST(r9, null, 34), r13.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r1 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r9.A03.A02(false);
        r3.Egh(A01(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        X.AbstractC25232BEp.A1J(r9, new X.JXO(r9, r6, (X.InterfaceC23621Ds) null, 17), r11.A0p);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r12 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r12 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Jn2(com.instagram.common.session.UserSession r10, com.instagram.direct.inbox.notes.NotesRepository r11, X.L5X r12, X.C44528JmY r13, java.lang.String r14, java.lang.String r15) {
        /*
            r9 = this;
            r4 = r9
            r6 = r14
            r5 = r15
            r9.<init>()
            r9.A01 = r10
            r9.A02 = r11
            r9.A03 = r13
            r9.A0A = r12
            r9.A04 = r15
            X.KQw r0 = X.C45841KQw.A00
            X.02u r3 = X.C10E.A00(r0)
            r9.A06 = r3
            X.059 r0 = X.AbstractC208910l.A02(r3)
            r9.A09 = r0
            X.EcQ r0 = X.C32822EcQ.A00
            X.02u r0 = X.C10E.A00(r0)
            r9.A05 = r0
            X.059 r0 = X.AbstractC208910l.A02(r0)
            r9.A08 = r0
            X.0UO r0 = r13.A03
            r9.A07 = r0
            r1 = 1
            r9.A00 = r1
            r7 = 0
            if (r15 != 0) goto L3a
            if (r12 == 0) goto L8e
            java.lang.String r5 = r12.A09
        L3a:
            if (r14 != 0) goto L48
            if (r12 == 0) goto L46
            X.6C9 r0 = r12.A03
            if (r0 == 0) goto L46
            java.lang.String r6 = r0.A0H
            if (r6 != 0) goto L4a
        L46:
            java.lang.String r6 = ""
        L48:
            if (r12 == 0) goto L89
        L4a:
            boolean r0 = r12.A0E
            if (r0 != r1) goto L89
        L4e:
            X.6C9 r2 = r12.A03
        L50:
            if (r5 == 0) goto L6a
            X.0UO r0 = r11.A0r
            r8 = 5
            X.MBY r3 = new X.MBY
            r3.<init>(r4, r5, r6, r7, r8)
            X.AbstractC25232BEp.A1J(r9, r3, r0)
        L5d:
            X.0UO r2 = r13.A02
            r1 = 34
            X.GST r0 = new X.GST
            r0.<init>(r9, r7, r1)
            X.AbstractC25232BEp.A1J(r9, r0, r2)
            return
        L6a:
            if (r1 == 0) goto L7c
            if (r2 == 0) goto L7c
            X.JmY r1 = r9.A03
            r0 = 0
            r1.A02(r0)
            X.KQt r0 = r9.A01(r2)
            r3.Egh(r0)
            goto L5d
        L7c:
            X.0UO r2 = r11.A0p
            r1 = 17
            X.JXO r0 = new X.JXO
            r0.<init>(r9, r6, r7, r1)
            X.AbstractC25232BEp.A1J(r9, r0, r2)
            goto L5d
        L89:
            r1 = 0
            if (r12 != 0) goto L4e
            r2 = r7
            goto L50
        L8e:
            r5 = r7
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jn2.<init>(com.instagram.common.session.UserSession, com.instagram.direct.inbox.notes.NotesRepository, X.L5X, X.JmY, java.lang.String, java.lang.String):void");
    }

    public static final C6C9 A00(C45052Jwh c45052Jwh, Jn2 jn2) {
        List list;
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
            if (AbstractC31171DnF.A1W(jn2.A01, ((C6C9) next).A0K)) {
                obj = next;
                break;
            }
        }
        return (C6C9) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e1, code lost:
    
        if (r11 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00dc, code lost:
    
        if (r11 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d7, code lost:
    
        if (r11 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C45838KQt A01(X.C6C9 r46) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jn2.A01(X.6C9):X.KQt");
    }

    public static final void A02(C6C9 c6c9, Jn2 jn2) {
        jn2.A03.A02(false);
        jn2.A00 = false;
        jn2.A06.Egh(jn2.A01(c6c9));
    }

    public static final void A03(Jn2 jn2) {
        if (jn2.A00 && !C14360o3.A0K(jn2.A06.getValue(), C45839KQu.A00)) {
            AbstractC166987dD.A1Z(new MC6(jn2, null, 20), AbstractC141776au.A00(jn2));
        }
    }
}
