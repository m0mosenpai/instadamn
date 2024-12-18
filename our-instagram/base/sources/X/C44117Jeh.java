package X;

import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Jeh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44117Jeh {
    public EnumC43799JYm A00;
    public List A01 = A00(this);
    public final Context A02;
    public final UserSession A03;
    public final boolean A04;
    public final InterfaceC11380iw A05;
    public final C44118Jei A06;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.EtN, java.lang.Object] */
    public static void A01(C44117Jeh c44117Jeh, EnumC43799JYm enumC43799JYm, C189478aR c189478aR) {
        int i;
        Integer num;
        Context context = c44117Jeh.A02;
        if (c44117Jeh.A04 && enumC43799JYm == EnumC43799JYm.A05) {
            i = 2131964410;
        } else {
            i = enumC43799JYm.A00;
        }
        String string = context.getString(i);
        boolean A1X = AbstractC167007dF.A1X(enumC43799JYm, c44117Jeh.A00);
        ViewOnClickListenerC48068LPt viewOnClickListenerC48068LPt = new ViewOnClickListenerC48068LPt(13, enumC43799JYm, c44117Jeh, c189478aR);
        if (C2E8.A08(c44117Jeh.A03)) {
            num = enumC43799JYm.A02;
        } else {
            num = null;
        }
        C14360o3.A0B(string, 1);
        ?? obj = new Object();
        obj.A02 = string;
        obj.A03 = A1X;
        obj.A00 = viewOnClickListenerC48068LPt;
        obj.A01 = num;
        E05.A00.add(obj);
    }

    public final void A02(EnumC43799JYm enumC43799JYm) {
        String str;
        boolean z = false;
        if (this.A00 != enumC43799JYm) {
            if (this.A01.contains(enumC43799JYm) || enumC43799JYm == EnumC43799JYm.A05) {
                z = true;
            }
            C18C.A0B(enumC43799JYm.toString(), "The filter type %s is not in the enabled filter list.", z);
            this.A00 = enumC43799JYm;
            UserSession userSession = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A05;
            switch (enumC43799JYm.ordinal()) {
                case 0:
                    str = "filter_inbox";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 1:
                    str = AbstractC111324zv.A00(4468);
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 2:
                case 3:
                    str = AbstractC111324zv.A00(4463);
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 4:
                    str = "filter_close_friends";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 5:
                    str = "filter_verified_accounts";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 6:
                    str = "filter_subscribers";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 7:
                    str = "filter_creators";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 8:
                    str = "filter_businesses";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 9:
                    str = AbstractC111324zv.A00(4467);
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 10:
                    str = AbstractC111324zv.A00(4462);
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 11:
                    str = AbstractC111324zv.A00(4464);
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str = "filter_paid";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str = AbstractC111324zv.A00(4465);
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 14:
                    str = "filter_lead";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case Process.SIGTERM /* 15 */:
                    str = "filter_people_you_follow";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 18:
                    C162337Ov.A0Q(interfaceC11380iw, userSession, "filter_creator_ai");
                    new BP5(userSession, null).A03(C8p.A0H);
                    break;
                case Process.SIGSTOP /* 19 */:
                    str = "filter_followers";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
                case 20:
                    str = "filter_groups";
                    C162337Ov.A0Q(interfaceC11380iw, userSession, str);
                    break;
            }
            C44118Jei c44118Jei = this.A06;
            JR2 jr2 = c44118Jei.A01;
            MRN C0B = AbstractC43593JPy.A0V(jr2).C0B();
            C4I3 c4i3 = enumC43799JYm.A01;
            C0B.Efi(c4i3);
            C43626JRj c43626JRj = c44118Jei.A00;
            C4I3 c4i32 = C4I3.A03;
            boolean A1a = AbstractC25229BEm.A1a(c4i3, c4i32);
            C43970JcJ c43970JcJ = c43626JRj.A0E;
            c43970JcJ.A0P = A1a;
            c43626JRj.A0C(C2E8.A06(c43626JRj.A0B));
            if (c4i3 == c4i32 && C2E9.A00(jr2.A0p())) {
                c43970JcJ.A0B = AbstractC46766KmN.A00(jr2.A0p(), AbstractC44116Jeg.A00(c4i3), jr2.A0g, jr2.A0t());
                C43626JRj.A03(c43626JRj);
            }
        }
    }

    public C44117Jeh(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C44118Jei c44118Jei, String str, boolean z) {
        C4I3 c4i3;
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = c44118Jei;
        this.A04 = z;
        C4I3[] values = C4I3.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                c4i3 = values[i];
                if (AbstractC002300n.A0g(c4i3.A00, str, true)) {
                    break;
                } else {
                    i++;
                }
            } else {
                c4i3 = C4I3.A03;
                break;
            }
        }
        this.A00 = AbstractC44116Jeg.A00(c4i3);
        this.A05 = interfaceC11380iw;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r0.getFanClubId() != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r7, 36322237774571595L) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (X.C2E8.A01(r7) == false) goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A00(X.C44117Jeh r11) {
        /*
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            X.JYm[] r5 = X.EnumC43799JYm.values()
            int r4 = r5.length
            r3 = 0
        La:
            if (r3 >= r4) goto Lde
            r2 = r5[r3]
            com.instagram.common.session.UserSession r7 = r11.A03
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            r8 = 1
            X.C14360o3.A0B(r7, r8)
            boolean r10 = X.C2E9.A0A(r7)
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto Lc7;
                case 1: goto Lc0;
                case 2: goto L71;
                case 3: goto L28;
                case 4: goto Lc7;
                case 5: goto Lbe;
                case 6: goto L85;
                case 7: goto Lb8;
                case 8: goto Lb8;
                case 9: goto Lc0;
                case 10: goto L55;
                case 11: goto L55;
                case 12: goto L55;
                case 13: goto L55;
                case 14: goto L55;
                case 15: goto L9c;
                case 16: goto L35;
                case 17: goto L43;
                case 18: goto L64;
                case 19: goto Lbe;
                case 20: goto Lbe;
                default: goto L23;
            }
        L23:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L28:
            X.0Tz r9 = X.C06090Tz.A05
            r0 = 36330007370416768(0x8111f300004280, double:3.038581178024701E-306)
            boolean r10 = X.C18U.A06(r9, r7, r0)
            goto Lbe
        L35:
            boolean r0 = X.C2E8.A08(r7)
            if (r0 == 0) goto Lc7
            X.0Tz r9 = X.C06090Tz.A05
            r0 = 36316813231854251(0x8105f3000f12ab, double:3.030237151669234E-306)
            goto L50
        L43:
            boolean r0 = X.C2E8.A08(r7)
            if (r0 == 0) goto Lc7
            X.0Tz r9 = X.C06090Tz.A05
            r0 = 36316813231919788(0x8105f3001012ac, double:3.03023715171068E-306)
        L50:
            boolean r0 = X.C18U.A06(r9, r7, r0)
            goto L61
        L55:
            boolean r0 = X.C2E8.A08(r7)
            if (r0 != 0) goto Lc0
            if (r10 == 0) goto Lc7
            boolean r0 = X.C2E9.A08(r7)
        L61:
            if (r0 == 0) goto Lc7
            goto Lc0
        L64:
            X.0sy r0 = X.C08730cb.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r10 = r0.A2L()
            goto Lbe
        L71:
            if (r10 != 0) goto Lc0
            X.0Tz r9 = X.C06090Tz.A05
            r0 = 36330007370416768(0x8111f300004280, double:3.038581178024701E-306)
            boolean r0 = X.C18U.A06(r9, r7, r0)
            if (r0 != 0) goto Lc7
            boolean r10 = X.AbstractC31235DoI.A01(r7)
            goto Lbe
        L85:
            X.0sy r0 = X.C08730cb.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            X.17P r0 = r0.A03
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B4O()
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r0.getFanClubId()
            if (r0 == 0) goto Lbe
            goto Lc0
        L9c:
            X.0sy r0 = X.C08730cb.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.C2E7.A01(r0)
            if (r0 == 0) goto Lbe
            X.0Tz r9 = X.C06090Tz.A06
            r0 = 36322237774571595(0x810ae20000284b, double:3.0336676543265626E-306)
            boolean r0 = X.C18U.A06(r9, r7, r0)
            if (r0 == 0) goto Lbe
            goto Lc0
        Lb8:
            boolean r0 = X.C2E8.A01(r7)
            if (r0 != 0) goto Lc0
        Lbe:
            if (r10 == 0) goto Lc7
        Lc0:
            X.JYm r0 = X.EnumC43799JYm.A0N
            if (r2 != r0) goto Lcb
            r6.add(r8, r2)
        Lc7:
            int r3 = r3 + 1
            goto La
        Lcb:
            X.JYm r0 = X.EnumC43799JYm.A0A
            if (r2 != r0) goto Lda
            r0 = 0
            X.BP5 r1 = new X.BP5
            r1.<init>(r7, r0)
            X.C8p r0 = X.C8p.A0I
            r1.A03(r0)
        Lda:
            r6.add(r2)
            goto Lc7
        Lde:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44117Jeh.A00(X.Jeh):java.util.ArrayList");
    }
}
