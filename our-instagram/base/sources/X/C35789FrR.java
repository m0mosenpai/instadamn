package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FrR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35789FrR implements CallerContextable {
    public static final String __redex_internal_original_name = "GetMultipleLinksAccountTypesCommand";

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bf, code lost:
    
        r6.add(new com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookPageLinkData(X.AbstractC166997dE.A0p(r25, 2131970188), r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d9, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r28, 36321533400000038L) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e5, code lost:
    
        if (X.AbstractC49092Nc.A00(r28).A00(r10, "ig_to_fb_sharing_account") != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
    
        if (X.C18U.A06(r4, r28, 36321533400393260L) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f6, code lost:
    
        if (A00(r28, r29, false) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f8, code lost:
    
        r2 = X.FAH.A00(r25, r27, r28, X.C05F.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0200, code lost:
    
        if (r2 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0202, code lost:
    
        r6.add(new com.instagram.profile.bindergroup.AccountLinkModel.BottomMessageData("", r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020d, code lost:
    
        if (r16 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020f, code lost:
    
        if (r14 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0211, code lost:
    
        r6.add(new com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookLinkData(X.AbstractC166997dE.A0p(r25, 2131970187), r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x018f, code lost:
    
        if ((r2 instanceof java.util.Collection) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0195, code lost:
    
        if (r2.isEmpty() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022a, code lost:
    
        r6 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0232, code lost:
    
        if (r6.hasNext() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0240, code lost:
    
        if (((X.InterfaceC81873l7) r6.next()).BNW() != com.instagram.api.schemas.IgUserBioLinkTypeEnum.A04) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0242, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x024c, code lost:
    
        if (X.C18U.A06(r4, r28, 36315056589638620L) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0175, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0176, code lost:
    
        if (r2 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (X.C18U.A06(r4, r28, 36320090292166703L) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (X.C18U.A06(r4, r28, 36320090292166703L) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
    
        if (r2 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016d, code lost:
    
        if ((r2 instanceof java.util.Collection) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
    
        if (r2.isEmpty() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0250, code lost:
    
        r6 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0258, code lost:
    
        if (r6.hasNext() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0266, code lost:
    
        if (((X.InterfaceC81873l7) r6.next()).BNW() != com.instagram.api.schemas.IgUserBioLinkTypeEnum.A07) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0268, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0178, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0188, code lost:
    
        if (r2.size() >= X.AbstractC25225BEi.A07(X.C06090Tz.A06, r28, 36596531566086695L)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018b, code lost:
    
        if (r2 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        r6 = X.AbstractC166987dD.A1E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019c, code lost:
    
        if (r2 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019e, code lost:
    
        r9 = A00(r28, r29, true);
        r2 = r25.getString(2131970186);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a9, code lost:
    
        if (r9 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ab, code lost:
    
        X.C14360o3.A07(r2);
        r1 = new com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataEnhanced(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b3, code lost:
    
        r6.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0221, code lost:
    
        X.C14360o3.A07(r2);
        r1 = new com.instagram.profile.bindergroup.AccountLinkModel.AddExternalLinkDataV2(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b6, code lost:
    
        if (r7 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b8, code lost:
    
        r6.addAll(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bb, code lost:
    
        if (r15 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bd, code lost:
    
        if (r13 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A01(android.content.Context r25, X.InterfaceC81833l1 r26, X.InterfaceC11380iw r27, com.instagram.common.session.UserSession r28, com.instagram.user.model.User r29) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35789FrR.A01(android.content.Context, X.3l1, X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User):java.util.ArrayList");
    }

    public static final boolean A00(UserSession userSession, User user, boolean z) {
        C06090Tz c06090Tz;
        Boolean CTH = user.A03.CTH();
        if (CTH != null && CTH.booleanValue()) {
            C14360o3.A0B(userSession, 0);
            if (z) {
                c06090Tz = C06090Tz.A06;
            } else {
                c06090Tz = C06090Tz.A05;
            }
            if (C18U.A06(c06090Tz, userSession, 36322761760975337L)) {
                return true;
            }
        }
        return false;
    }
}
