package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Du6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31578Du6 {
    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(context), viewGroup, R.layout.follow_list_row, false);
        A0C.setTag(new C31579Du7(A0C));
        return A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r5, 36327245706443178L) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r1.equals("potential_spam") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r6, com.instagram.user.model.User r7, X.InterfaceC37297Gby r8, X.C31579Du7 r9, X.C31538DtO r10, boolean r11) {
        /*
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            float r0 = r1.getDimension(r0)
            int r3 = (int) r0
            android.os.Bundle r1 = r10.A02
            java.lang.String r0 = "FollowListFragment.ShouldHideMoreOptionsMenu"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L3c
            boolean r0 = r10.A06
            if (r0 == 0) goto L3c
            X.Dtg r1 = r10.A04
            X.Dtg r0 = X.EnumC31556Dtg.A04
            if (r1 != r0) goto L4f
            com.instagram.common.session.UserSession r5 = r10.A03
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36324604301553927(0x810d0900003107, double:3.0351642555194286E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 != 0) goto L3c
            X.0Tz r4 = X.C06090Tz.A06
            r0 = 36327245706443178(0x810f70000039aa, double:3.036834690607475E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto L67
        L3c:
            android.widget.ImageView r1 = r9.A01
            if (r1 == 0) goto L49
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setOnClickListener(r0)
        L49:
            android.view.ViewGroup r0 = r9.A06
            X.AbstractC13880nE.A0b(r0, r3)
            return
        L4f:
            X.Dtg r0 = X.EnumC31556Dtg.A05
            if (r1 == r0) goto L67
            X.Dtg r0 = X.EnumC31556Dtg.A09
            if (r1 == r0) goto L67
            X.Dtg r0 = X.EnumC31556Dtg.A08
            if (r1 != r0) goto L3c
            java.lang.String r1 = r10.A05
            if (r1 == 0) goto L3c
            java.lang.String r0 = "potential_spam"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
        L67:
            android.widget.ImageView r3 = r9.A01
            if (r3 != 0) goto L86
            android.view.ViewStub r0 = r9.A0C
            if (r0 == 0) goto L95
            android.view.View r3 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.C14360o3.A0C(r3, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2131963919(0x7f13300f, float:1.9564605E38)
            java.lang.String r0 = r6.getString(r0)
            r3.setContentDescription(r0)
            r9.A01 = r3
        L86:
            r3.setVisibility(r2)
            r1 = 20
            X.Fp7 r0 = new X.Fp7
            r0.<init>(r1, r8, r7, r11)
            X.C0fQ.A00(r0, r3)
            r3 = 0
            goto L49
        L95:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31578Du6.A02(android.content.Context, com.instagram.user.model.User, X.Gby, X.Du7, X.DtO, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x036f, code lost:
    
        r8 = r49.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0371, code lost:
    
        if (r8 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0373, code lost:
    
        r8 = r49.A09.inflate();
        X.C14360o3.A0C(r8, "null cannot be cast to non-null type com.instagram.user.follow.FollowButton");
        r8 = (com.instagram.user.follow.FollowButton) r8;
        r8.setVisibility(0);
        r49.A04 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0385, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0386, code lost:
    
        if (r8 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x038a, code lost:
    
        if (r8.A0J == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x038c, code lost:
    
        r10 = X.C57582kX.A00(r43).A0N(r45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0396, code lost:
    
        if (r10 != com.instagram.user.model.FollowStatus.A05) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0398, code lost:
    
        if (r51 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x039a, code lost:
    
        r8.setText(2131959939);
        r10 = new X.ViewOnClickListenerC35610Fo1(19, r40, r42, r43, r45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03ad, code lost:
    
        X.C0fQ.A00(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x044f, code lost:
    
        r8.setText(2131972171);
        r10 = new X.ViewOnClickListenerC35670Fp5(8, r48, r45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03b0, code lost:
    
        X.AbstractC13880nE.A0b(r49.A06, (int) r41.getResources().getDimension(com.facebook.R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        r7 = r49.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03c4, code lost:
    
        if (r7 == null) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03c6, code lost:
    
        X.C1QI.A0H(r7, r7);
        r10 = r45.B7L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03cd, code lost:
    
        if (r47 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03d1, code lost:
    
        if (r47.A00 != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03d3, code lost:
    
        r11 = r10.ordinal();
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03d9, code lost:
    
        if (r11 == 3) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03dc, code lost:
    
        if (r11 == 5) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03df, code lost:
    
        if (r11 != 4) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03e1, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03e2, code lost:
    
        r47.A01 = r10;
        r47.A00 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03ea, code lost:
    
        if (r47.A01 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03ee, code lost:
    
        if (r49.A03 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03f0, code lost:
    
        r0 = r49.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03f2, code lost:
    
        if (r0 == null) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03f4, code lost:
    
        r7 = r0.inflate();
        X.C14360o3.A0C(r7, "null cannot be cast to non-null type com.instagram.user.follow.FollowButton");
        r7 = (com.instagram.user.follow.FollowButton) r7;
        r7.setVisibility(0);
        r49.A03 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x06c7, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0404, code lost:
    
        r7 = r49.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0406, code lost:
    
        if (r7 == null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0408, code lost:
    
        r7.setText(" • ");
        r7.setVisibility(0);
        r0 = r49.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0412, code lost:
    
        if (r0 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0414, code lost:
    
        r0.setPadding(0, 0, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0417, code lost:
    
        r0 = r49.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0419, code lost:
    
        if (r0 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x041b, code lost:
    
        r7 = r0.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x041d, code lost:
    
        if (r7 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x041f, code lost:
    
        r7.A0K = r9;
        r7.A04(r42, r43, r45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0426, code lost:
    
        r7 = r49.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0428, code lost:
    
        if (r7 == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x042a, code lost:
    
        X.AbstractC99834e5.A02(r7, r43, r45.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0431, code lost:
    
        A02(r41, r45, r48, r49, r50, r51);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x06bb, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x06c1, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0440, code lost:
    
        r7 = r49.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0442, code lost:
    
        if (r7 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0444, code lost:
    
        r7.setVisibility(8);
        r7 = r49.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0449, code lost:
    
        if (r7 == null) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x044b, code lost:
    
        r7.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x06cd, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x06d3, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0264, code lost:
    
        if (r49.A02 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0266, code lost:
    
        r2 = r49.A09.inflate();
        X.C14360o3.A0C(r2, "null cannot be cast to non-null type com.instagram.user.follow.FollowButton");
        r2 = (com.instagram.user.follow.FollowButton) r2;
        r2.setVisibility(0);
        r49.A02 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0278, code lost:
    
        X.AbstractC13880nE.A0b(r49.A06, (int) r41.getResources().getDimension(com.facebook.R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        r8 = r49.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x028a, code lost:
    
        if (r8 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x028c, code lost:
    
        r8.getLayoutParams().width = (int) r41.getResources().getDimension(com.facebook.R.dimen.avatar_size_ridiculously_xlarge);
        r2 = r8.A0J;
        r2.A0K = r9;
        r2.A04(r42, r43, r45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02a7, code lost:
    
        r2 = r49.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02a9, code lost:
    
        if (r2 == null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ab, code lost:
    
        X.AbstractC99834e5.A02(r2, r43, r45.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02b6, code lost:
    
        if (r49.A04 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02b8, code lost:
    
        r0 = r49.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ba, code lost:
    
        if (r0 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02bc, code lost:
    
        r2 = r0.inflate();
        X.C14360o3.A0C(r2, "null cannot be cast to non-null type com.instagram.user.follow.FollowButton");
        r2 = (com.instagram.user.follow.FollowButton) r2;
        r2.setVisibility(0);
        r49.A04 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x06ad, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02cc, code lost:
    
        r2 = r49.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02ce, code lost:
    
        if (r2 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02d0, code lost:
    
        r2.setText(" • ");
        r2.setVisibility(0);
        r7 = r49.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02da, code lost:
    
        if (r7 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02dc, code lost:
    
        r7.setPadding(0, 0, 0, 0);
        r7.setText(2131972171);
        r7.setTextColor(r41.getColor(X.C1QI.A01(r41)));
        X.C0fQ.A00(new X.ViewOnClickListenerC35670Fp5(7, r48, r45), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x06a7, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x06b5, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x045e, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0480, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r50.A03, 36327353080625686L) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x048c, code lost:
    
        if (X.C14360o3.A0K(r50.A05, "least_interacted_with_followers") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0567, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r50.A03, 36327245706443178L) != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0569, code lost:
    
        r2 = null;
        r8 = r49.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x056c, code lost:
    
        if (r8 != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x056e, code lost:
    
        r0 = r49.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0570, code lost:
    
        if (r0 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0572, code lost:
    
        r2 = r0.inflate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0576, code lost:
    
        r49.A00 = r2;
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0579, code lost:
    
        if (r8 == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x057b, code lost:
    
        r8.setVisibility(0);
        X.C0fQ.A00(new X.ViewOnClickListenerC35670Fp5(6, r48, r45), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x05b1, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r50.A03, 36327353080625686L) != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0624, code lost:
    
        if (X.C18U.A06(r9, r11, 36323002279013220L) == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d5, code lost:
    
        if (X.C18U.A06(r9, r11, 36323002279013220L) == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0232, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r50.A03, 36327245706443178L) != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0234, code lost:
    
        if (r53 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0236, code lost:
    
        r9 = r42.getModuleName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x023e, code lost:
    
        if (X.C31538DtO.A00(r50) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0244, code lost:
    
        if (r50.A04() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0246, code lost:
    
        r10 = r50.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0253, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r10, 36315623525256649L) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0260, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10, 36327353080625686L) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x036d, code lost:
    
        if (r40 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0332, code lost:
    
        if (r47.A04 == false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0359  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.app.Activity r40, android.content.Context r41, X.InterfaceC11380iw r42, com.instagram.common.session.UserSession r43, com.instagram.model.reels.Reel r44, com.instagram.user.model.User r45, X.EnumC31556Dtg r46, X.C34958Fai r47, X.InterfaceC37297Gby r48, X.C31579Du7 r49, X.C31538DtO r50, boolean r51, boolean r52, boolean r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31578Du6.A01(android.app.Activity, android.content.Context, X.0iw, com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, com.instagram.user.model.User, X.Dtg, X.Fai, X.Gby, X.Du7, X.DtO, boolean, boolean, boolean, boolean):void");
    }
}
