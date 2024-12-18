package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.LruCache;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ListIterator;

/* renamed from: X.Lmy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49072Lmy implements C7Zf {
    public static final long A04 = C36H.A03(C36G.A09, 10);
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC08830cm A02;
    public final C163867Va A03;

    @Override // X.C7Zf
    public final void Cqb(String str, String str2) {
        MsysThreadId msysThreadId;
        String valueOf;
        DirectShareTarget directShareTarget;
        Object obj;
        String str3;
        UserSession userSession = this.A01;
        L6G l6g = new L6G(userSession);
        InterfaceC08830cm interfaceC08830cm = this.A02;
        String C7I = AbstractC31176DnK.A0X(interfaceC08830cm).C7I();
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0C, userSession);
        c116875Qr.A0h = str;
        c116875Qr.A1J = null;
        c116875Qr.A1F = C7I;
        AbstractC59962oe abstractC59962oe = this.A00;
        c116875Qr.A0o = abstractC59962oe.requireContext().getString(2131953861);
        C7U0 c7u0 = (C7U0) interfaceC08830cm.get();
        InterfaceC163837Ux C7r = c7u0.C7r();
        C3o9 B90 = C7r.B90();
        C14360o3.A07(B90);
        DirectThreadKey directThreadKey = null;
        if (JRE.A02(B90) != null) {
            directThreadKey = JRE.A01(B90);
            valueOf = directThreadKey.A00;
            msysThreadId = null;
        } else if (B90 instanceof MsysThreadId) {
            msysThreadId = (MsysThreadId) B90;
            valueOf = String.valueOf(msysThreadId.A02);
        } else {
            throw AbstractC43594JPz.A0o(B90, "Expected DirectThreadKey or MsysThreadKey, instead found: ", AbstractC166987dD.A1C());
        }
        Context context = abstractC59962oe.getContext();
        if (context != null) {
            directShareTarget = C7r.C7f(context);
        } else {
            directShareTarget = null;
        }
        ClipsReplyBarData clipsReplyBarData = null;
        if (directShareTarget != null) {
            String BtL = c7u0.BT6().BtL(null);
            ListIterator A14 = AbstractC43592JPx.A14(C7r.BSH());
            while (true) {
                if (A14.hasPrevious()) {
                    obj = A14.previous();
                    if (C14360o3.A0K(AbstractC31171DnF.A0g(obj), BtL)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                str3 = AbstractC101904i3.A08(user);
            } else {
                str3 = null;
            }
            boolean A1V = AbstractC31171DnF.A1V(userSession, BtL);
            MsysThreadId msysThreadId2 = msysThreadId;
            DirectThreadKey directThreadKey2 = directThreadKey;
            DirectShareTarget directShareTarget2 = directShareTarget;
            clipsReplyBarData = new ClipsReplyBarData(directShareTarget2, directThreadKey2, msysThreadId2, null, null, null, "clips_blend_reply_direct", C7r.C7l(), valueOf, str3, str, directShareTarget.A01, C7r.AdZ(), C7r.CWO(), C7r.CVY(), A1V, false, AbstractC167007dF.A1W(C7r.BNh()), false, false, false, true, true);
        }
        c116875Qr.A0I = clipsReplyBarData;
        c116875Qr.A1d = false;
        l6g.A00(abstractC59962oe.requireActivity(), c116875Qr.A00(), null);
    }

    @Override // X.C7Zf
    public final void Cqj(RectF rectF, ImageUrl imageUrl, C47777L8c c47777L8c, MessageIdentifier messageIdentifier, C40971v4 c40971v4, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        MsysThreadId msysThreadId;
        String valueOf;
        DirectThreadKey directThreadKey;
        String str7 = str;
        C14360o3.A0B(rectF, 6);
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        C18U.A06(c06090Tz, userSession, 36329470499635551L);
        C18U.A06(c06090Tz, userSession, 36329470499701088L);
        if (str == null) {
            if (str2 != null) {
                str7 = AbstractC47024Kqh.A00(str2);
            } else {
                throw AbstractC166987dD.A12("Must pass either mediaId or mediaCode");
            }
        }
        this.A03.CMc();
        C7U0 c7u0 = (C7U0) this.A02.get();
        C3o9 B90 = c7u0.C7r().B90();
        C14360o3.A07(B90);
        if (JRE.A02(B90) != null) {
            directThreadKey = JRE.A01(B90);
            valueOf = directThreadKey.A00;
            msysThreadId = null;
        } else if (B90 instanceof MsysThreadId) {
            msysThreadId = (MsysThreadId) B90;
            valueOf = String.valueOf(msysThreadId.A02);
            directThreadKey = null;
        } else {
            throw AbstractC43594JPz.A0o(B90, "Expected DirectThreadKey or MsysThreadKey, instead found: ", AbstractC166987dD.A1C());
        }
        if (AbstractC166997dE.A1Z(bool, true) && valueOf != null && AbstractC2056998t.A00(userSession).booleanValue()) {
            C50133MCh c50133MCh = new C50133MCh(this, c47777L8c, c7u0, directThreadKey, messageIdentifier, msysThreadId, c40971v4, bool2, str7, str4, str6, str3, valueOf, z);
            if (c47777L8c != null) {
                c47777L8c.A01();
            }
            LEP lep = (LEP) userSession.A01(LEP.class, new MHO(userSession, 33));
            LruCache lruCache = lep.A00;
            Object obj = lruCache.get(valueOf);
            if (obj == null) {
                obj = new KZA(lep.A01, valueOf);
                lruCache.put(valueOf, obj);
            }
            AbstractC166987dD.A1Z(new MBJ(obj, c47777L8c, c50133MCh, this, messageIdentifier, c7u0, directThreadKey, msysThreadId, str7, valueOf, str5, str3, null, 1, z), C07Y.A00(this.A00));
            return;
        }
        A01(this, c47777L8c, c7u0, directThreadKey, messageIdentifier, msysThreadId, c40971v4, bool2, str7, str4, str6, str3, valueOf, z);
    }

    public C49072Lmy(AbstractC59962oe abstractC59962oe, UserSession userSession, C163867Va c163867Va, InterfaceC08830cm interfaceC08830cm) {
        AbstractC167017dG.A1Q(abstractC59962oe, interfaceC08830cm);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = interfaceC08830cm;
        this.A03 = c163867Va;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C49072Lmy r15, X.C47777L8c r16, X.C7U0 r17, com.instagram.model.direct.DirectThreadKey r18, com.instagram.model.direct.messageid.MessageIdentifier r19, com.instagram.model.direct.threadkey.impl.MsysThreadId r20, X.C40971v4 r21, java.lang.Boolean r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28) {
        /*
            boolean r0 = X.AbstractC31177DnL.A1b(r22)
            r4 = r15
            if (r0 == 0) goto L4d
            com.instagram.common.session.UserSession r3 = r15.A01
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36328521312583271(0x811099000d3e67, double:3.037641389066923E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L4d
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.A0t
        L18:
            com.instagram.common.session.UserSession r0 = r15.A01
            X.5Qr r3 = new X.5Qr
            r3.<init>(r1, r0)
            r13 = 0
            r15 = 0
            r1 = r21
            r3.A02(r0, r1, r15)
            r10 = r23
            r3.A1D = r10
            r0 = r24
            if (r24 == 0) goto L30
            r3.A1H = r0
        L30:
            r0 = r25
            if (r25 == 0) goto L36
            r3.A19 = r0
        L36:
            r6 = r17
            X.C14360o3.A0A(r6)
            r14 = r28
            r5 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r11 = r26
            r12 = r27
            A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L4d:
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.A0s
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49072Lmy.A01(X.Lmy, X.L8c, X.7U0, com.instagram.model.direct.DirectThreadKey, com.instagram.model.direct.messageid.MessageIdentifier, com.instagram.model.direct.threadkey.impl.MsysThreadId, X.1v4, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2.A0P() == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (X.C161857Mv.A02.A03(r15, r8.Aic()) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0222 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C116875Qr r46, X.C49072Lmy r47, X.C47777L8c r48, X.C7U0 r49, com.instagram.model.direct.DirectThreadKey r50, com.instagram.model.direct.messageid.MessageIdentifier r51, com.instagram.model.direct.threadkey.impl.MsysThreadId r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, boolean r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49072Lmy.A00(X.5Qr, X.Lmy, X.L8c, X.7U0, com.instagram.model.direct.DirectThreadKey, com.instagram.model.direct.messageid.MessageIdentifier, com.instagram.model.direct.threadkey.impl.MsysThreadId, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
