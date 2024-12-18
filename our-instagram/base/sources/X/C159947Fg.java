package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.7Fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159947Fg {
    public C160007Fm A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C159627Dy A03;
    public final C159917Fd A04;
    public final C159957Fh A05;
    public final InterfaceC83713oG A06;
    public final java.util.Set A07;
    public final InterfaceC08830cm A08;
    public final C7FR A09;
    public final List A0A;
    public final InterfaceC08830cm A0B;

    public C159947Fg(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C159917Fd c159917Fd, InterfaceC83713oG interfaceC83713oG, List list, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC08830cm, 2);
        C14360o3.A0B(interfaceC83713oG, 3);
        C14360o3.A0B(interfaceC11380iw, 8);
        this.A02 = userSession;
        this.A08 = interfaceC08830cm;
        this.A06 = interfaceC83713oG;
        this.A04 = c159917Fd;
        this.A0A = list;
        this.A0B = interfaceC08830cm3;
        this.A01 = interfaceC11380iw;
        this.A03 = new C159627Dy(interfaceC11380iw, userSession);
        this.A05 = new C159957Fh(interfaceC11380iw, userSession, interfaceC83713oG, interfaceC08830cm2);
        this.A09 = new C7FR(interfaceC11380iw, userSession);
        this.A07 = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x01c8, code lost:
    
        if (r1.A09 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01df, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0.A1Z, 36314450999052864L) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x020c, code lost:
    
        if (r6 != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, com.instagram.direct.model.mentions.MentionedEntity] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.L7G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.instagram.direct.model.mentions.SendMentionData$MentionData, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.text.Editable r51, java.lang.Long r52, java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 2474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159947Fg.A01(android.text.Editable, java.lang.Long, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.A02() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(boolean r12) {
        /*
            r11 = this;
            X.7FR r10 = r11.A09
            java.util.List r8 = r11.A0A
            X.7Fd r6 = r11.A04
            X.7El r5 = r6.A01
            X.7Hp r0 = r5.A0c
            if (r0 == 0) goto L13
            boolean r0 = r0.A02()
            r9 = 1
            if (r0 != 0) goto L14
        L13:
            r9 = 0
        L14:
            X.3oG r4 = r11.A06
            com.instagram.common.session.UserSession r7 = r11.A02
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36325669454427392(0x810e01000f3500, double:3.035837862485634E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto Lb6
            X.0cm r0 = r5.A22
            java.lang.Object r0 = r0.get()
            X.2EC r0 = (X.C2EC) r0
            X.Xdd r3 = X.AbstractC34774FTx.A00(r0)
        L31:
            X.0wW r2 = r10.A00
            java.lang.String r1 = "direct_composer_tap_gallery"
            X.0kM r0 = r2.A00
            X.0Ai r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L7f
            java.lang.String r1 = X.AbstractC92784Dr.A02(r4)
            java.lang.String r0 = "open_thread_id"
            r2.AAP(r0, r1)
            java.lang.Long r1 = X.AbstractC92784Dr.A01(r4)
            java.lang.String r0 = "occamadillo_thread_id"
            r2.A9K(r0, r1)
            java.lang.String r0 = "recipient_ids"
            r2.AAk(r0, r8)
            boolean r0 = X.AbstractC140946Yw.A07(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_e2ee"
            r2.A7v(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "is_reply_flow"
            r2.A7v(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.String r0 = "is_bottom_sheet_thread"
            r2.A7v(r0, r1)
            java.lang.String r0 = "thread_type"
            r2.A8R(r3, r0)
            r2.Cht()
        L7f:
            X.LI5 r3 = X.AbstractC46750Km7.A00(r7)
            r4 = 0
            java.lang.String r2 = "thread_composer"
            r1 = 49
            X.MHi r0 = new X.MHi
            r0.<init>(r4, r3, r2, r1)
            X.LI5.A01(r3, r0)
            X.JZk r2 = X.AbstractC208269Jl.A00(r7)
            X.22P r1 = X.C22P.A2T
            r0 = 1
            r2.A07(r1, r0)
            android.view.ViewGroup r0 = r5.A1V
            X.AbstractC13880nE.A0O(r0)
            boolean r3 = X.C159737El.A12(r5)
            X.JfZ r2 = X.EnumC44170JfZ.A05
            androidx.fragment.app.FragmentActivity r1 = r6.A00
            X.Lrv r0 = new X.Lrv
            r0.<init>()
            boolean r0 = X.C159737El.A16(r5, r2, r0)
            if (r0 != 0) goto Lb5
            r5.A1N(r1, r4, r3)
        Lb5:
            return
        Lb6:
            X.Xdd r3 = X.EnumC72433Xdd.A07
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159947Fg.A00(boolean):void");
    }
}
