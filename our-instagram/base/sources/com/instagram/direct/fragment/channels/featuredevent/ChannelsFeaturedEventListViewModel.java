package com.instagram.direct.fragment.channels.featuredevent;

import X.AbstractC141776au;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25230BEn;
import X.AbstractC52922bZ;
import X.AnonymousClass195;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C10I;
import X.C10Q;
import X.C14360o3;
import X.C15230pd;
import X.C16930sl;
import X.C57185PaM;
import X.EnumC53135Neo;
import X.FKO;
import X.InterfaceC23621Ds;
import X.PYc;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ChannelsFeaturedEventListViewModel extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public final C05A A01;
    public final C05A A02;
    public final C0UO A03;
    public final UserSession A04;
    public final C05A A05;

    public ChannelsFeaturedEventListViewModel(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        EnumC53135Neo enumC53135Neo = EnumC53135Neo.A02;
        C008002u A1H = AbstractC25225BEi.A1H(enumC53135Neo);
        this.A01 = A1H;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A02 = A00;
        C008002u A002 = C10E.A00(null);
        this.A05 = A002;
        C15230pd A003 = C10Q.A00(new C57185PaM(2, null), A1H, A002, A00);
        this.A03 = AbstractC208910l.A01(new FKO(null, enumC53135Neo, c16930sl), AbstractC141776au.A00(this), A003, C10I.A01);
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        C05A c05a = this.A01;
        if (c05a.getValue() != EnumC53135Neo.A04) {
            c05a.Egh(EnumC53135Neo.A02);
            InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A00);
            this.A00 = AbstractC25226BEj.A1L(new PYc(this, str, A0s, 23), AbstractC141776au.A00(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r8 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r10 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r10 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r11 = r2.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        r1.add(new X.C66638URc(r7, r8, r9, r10, r11));
        r0 = r5.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r0 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r4.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r3 = (X.C54528O7f) r4.next();
        r2 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        r1.add(new X.C51810MvE(r2));
        r0 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        r2 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (r2.hasNext() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        r0 = (X.C54683ODj) r2.next();
        r6 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        if (r6 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        r7 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        if (r7 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        r8 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        if (r8 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        r9 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (r9 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        r10 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        if (r10 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
    
        r1.add(new X.C32096E8u(r6, r7, r8, r9, r10, r0.A05));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        r0 = "creatorUsername";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        X.C14360o3.A0F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0147, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013e, code lost:
    
        r0 = "threadId";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012f, code lost:
    
        r0 = "imageUrl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
    
        r0 = "subtitle";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        r0 = com.facebook.react.modules.dialog.DialogModule.KEY_TITLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0138, code lost:
    
        r0 = com.facebook.react.modules.dialog.DialogModule.KEY_ITEMS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        r0 = "sectionName";
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0151, code lost:
    
        r1 = X.AbstractC25225BEi.A0z(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x006e, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x006f, code lost:
    
        if (r2 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0071, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0063, code lost:
    
        r9 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0065, code lost:
    
        if (r9 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x005a, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel.A00(com.instagram.direct.fragment.channels.featuredevent.ChannelsFeaturedEventListViewModel, java.lang.String, X.1Ds):java.lang.Object");
    }
}
