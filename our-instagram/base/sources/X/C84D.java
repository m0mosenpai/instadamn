package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.84D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84D {
    public static final C84E A01 = new Object();
    public final UserSession A00;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        if (X.C1LE.A0F(r10.A00) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.X9T A00(android.content.Context r8, com.facebook.videolite.transcoder.base.composition.MediaComposition r9, X.C84D r10, java.lang.String r11, java.util.List r12) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r12.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C219789nQ
            if (r0 == 0) goto L9
            r3.add(r1)
            goto L9
        L1b:
            boolean r0 = r3 instanceof java.util.Collection
            r7 = 1
            if (r0 == 0) goto L42
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L42
        L26:
            r6 = 0
        L27:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r12.iterator()
        L30:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C219779nP
            if (r0 == 0) goto L30
            r3.add(r1)
            goto L30
        L42:
            java.util.Iterator r1 = r3.iterator()
        L46:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.next()
            X.9nQ r0 = (X.C219789nQ) r0
            X.8gS r0 = r0.A00
            if (r0 == 0) goto L46
            r6 = 1
            goto L27
        L58:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto Lc6
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lc6
        L62:
            r7 = 0
        L63:
            com.instagram.common.session.UserSession r5 = r10.A00
            X.0e4 r2 = X.AbstractC53677NoS.A00(r5)
            java.lang.Object r0 = r2.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            java.lang.Object r4 = r2.A01
            X.OMT r4 = (X.OMT) r4
            boolean r0 = X.C1LE.A0E(r5)
            java.util.Map r3 = X.ON2.A01(r8, r9, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 == 0) goto L90
            java.lang.String r1 = r4.A01()
            X.YS5 r0 = new X.YS5
            r0.<init>(r1)
            r2.add(r0)
        L90:
            X.MYi r0 = new X.MYi
            r0.<init>(r5)
            X.O6k r1 = new X.O6k
            r1.<init>(r0, r11, r3)
            X.WYw r0 = new X.WYw
            r0.<init>(r4, r1)
            r2.add(r0)
            if (r6 == 0) goto Lba
            X.WYn r1 = new X.WYn
            if (r7 == 0) goto Lb6
            r1.<init>()
        Lab:
            r0 = r1
            X.X9T r0 = (X.X9T) r0
            X.WYo r1 = new X.WYo
            r1.<init>(r0, r2)
        Lb3:
            X.X9T r1 = (X.X9T) r1
            return r1
        Lb6:
            r1.<init>()
            goto Lb3
        Lba:
            X.WYv r1 = new X.WYv
            if (r7 == 0) goto Lc2
            r1.<init>()
            goto Lab
        Lc2:
            r1.<init>()
            goto Lb3
        Lc6:
            java.util.Iterator r1 = r3.iterator()
        Lca:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r1.next()
            X.9nP r0 = (X.C219779nP) r0
            X.8bb r0 = r0.A00
            if (r0 == 0) goto Lca
            com.instagram.common.session.UserSession r0 = r10.A00
            boolean r0 = X.C1LE.A0F(r0)
            if (r0 == 0) goto L62
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84D.A00(android.content.Context, com.facebook.videolite.transcoder.base.composition.MediaComposition, X.84D, java.lang.String, java.util.List):X.X9T");
    }

    public static final void A01(C115475Kh c115475Kh, C49602Pt c49602Pt) {
        try {
            File file = new File(c115475Kh.A0G.A0F);
            long j = c115475Kh.A09;
            long j2 = c115475Kh.A08;
            StringBuilder sb = new StringBuilder();
            sb.append("user_trimmed_");
            sb.append(j);
            sb.append('_');
            sb.append(j2);
            File A012 = AMc.A01(c49602Pt, file, sb.toString());
            if (A012.exists()) {
                A012.delete();
            }
        } catch (IOException unused) {
        }
    }

    public C84D(UserSession userSession) {
        this.A00 = userSession;
    }
}
