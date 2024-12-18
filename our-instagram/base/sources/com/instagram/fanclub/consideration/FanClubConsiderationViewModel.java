package com.instagram.fanclub.consideration;

import X.AbstractC001800i;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC25233BEq;
import X.AbstractC25235BEs;
import X.AbstractC31172DnG;
import X.AbstractC31179DnN;
import X.AbstractC63302u8;
import X.AbstractC99684dl;
import X.B4Z;
import X.BHS;
import X.C006802i;
import X.C008002u;
import X.C01L;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C0UO;
import X.C0eM;
import X.C10E;
import X.C12L;
import X.C12M;
import X.C12N;
import X.C143436di;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C193578hc;
import X.C26085BgE;
import X.C27054Bwd;
import X.C2JS;
import X.C31199Dni;
import X.C32906Edn;
import X.C39062HHm;
import X.C48511Ld7;
import X.C50679MYx;
import X.C5QE;
import X.C84963qk;
import X.C99694dm;
import X.E6H;
import X.EnumC33336EoV;
import X.EnumC33348Eoh;
import X.EnumC53285NhN;
import X.EnumC99704do;
import X.F7M;
import X.FJ8;
import X.FJ9;
import X.G7G;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.MBp;
import X.MC9;
import X.MVZ;
import X.QgI;
import X.QgO;
import android.app.Application;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FanClubConsiderationViewModel extends C193578hc {
    public Integer A00;
    public final Application A01;
    public final C12N A02;
    public final UserSession A03;
    public final C99694dm A04;
    public final FJ8 A05;
    public final FanClubConsiderationRepository A06;
    public final C48511Ld7 A07;
    public final MonetizationRepository A08;
    public final C143436di A09;
    public final String A0A;
    public final String A0B;
    public final InterfaceC19390xP A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C0UO A0L;
    public final boolean A0M;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0071 -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(android.content.Context r11, com.instagram.fanclub.consideration.FanClubConsiderationViewModel r12, java.lang.String r13, java.util.Set r14, X.InterfaceC23621Ds r15) {
        /*
            r7 = r11
            r10 = r13
            r3 = 4
            r4 = r15
            boolean r0 = X.PX8.A03(r15, r3)
            if (r0 == 0) goto L84
            r11 = r4
            X.PX8 r11 = (X.PX8) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r11.A00 = r2
        L18:
            java.lang.Object r6 = r11.A08
            X.1JX r5 = X.C1JX.A02
            int r0 = r11.A00
            r4 = 1
            if (r0 == 0) goto L74
            if (r0 != r4) goto L8a
            java.lang.Object r9 = r11.A07
            java.lang.Object r3 = r11.A06
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r0 = r11.A05
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r11.A04
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r10 = r11.A03
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r11.A02
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r12 = r11.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r12 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r12
            X.AbstractC09560e7.A00(r6)
        L40:
            X.EsS r6 = (X.AbstractC33554EsS) r6
            boolean r1 = r6 instanceof X.C32928Ee9
            if (r1 == 0) goto L4d
            X.Ee9 r6 = (X.C32928Ee9) r6
            java.lang.String r1 = r6.A00
            r0.put(r9, r1)
        L4d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r9 = r3.next()
            java.lang.String r9 = (java.lang.String) r9
            X.Ld7 r6 = r12.A07
            java.lang.Integer r8 = X.C05F.A00
            r11.A01 = r12
            r11.A02 = r7
            r11.A03 = r10
            r11.A04 = r2
            r11.A05 = r0
            r11.A06 = r3
            r11.A07 = r9
            r11.A00 = r4
            java.lang.Object r6 = r6.A00(r7, r8, r9, r10, r11)
            if (r6 != r5) goto L40
            return r5
        L74:
            X.AbstractC09560e7.A00(r6)
            X.0Yd r0 = new X.0Yd
            r0.<init>()
            if (r14 == 0) goto L90
            java.util.Iterator r3 = r14.iterator()
            r2 = r0
            goto L4d
        L84:
            X.PX8 r11 = new X.PX8
            r11.<init>(r12, r15, r3)
            goto L18
        L8a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L8f:
            r0 = r2
        L90:
            X.0Yd r5 = X.AbstractC16850sd.A0N(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A04(android.content.Context, com.instagram.fanclub.consideration.FanClubConsiderationViewModel, java.lang.String, java.util.Set, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(androidx.fragment.app.FragmentActivity r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A0E(androidx.fragment.app.FragmentActivity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FanClubConsiderationViewModel(Application application, UserSession userSession, FanClubConsiderationRepository fanClubConsiderationRepository, C48511Ld7 c48511Ld7, C143436di c143436di, String str, String str2, boolean z) {
        super(application);
        C12L c12l = C12L.A00;
        C99694dm A00 = AbstractC99684dl.A00(userSession);
        FJ8 fj8 = new FJ8(str);
        MonetizationRepository A002 = AbstractC63302u8.A00(userSession);
        AbstractC167007dF.A1F(str, 3, str2);
        AbstractC25233BEq.A0y(7, c48511Ld7, c143436di, c12l);
        AbstractC25229BEm.A1L(A00, 10, A002);
        this.A01 = application;
        this.A03 = userSession;
        this.A0A = str;
        this.A0B = str2;
        this.A0M = z;
        this.A06 = fanClubConsiderationRepository;
        this.A07 = c48511Ld7;
        this.A09 = c143436di;
        this.A02 = c12l;
        this.A04 = A00;
        this.A05 = fj8;
        this.A08 = A002;
        C008002u A003 = C10E.A00(null);
        this.A0E = A003;
        C008002u A004 = C10E.A00(null);
        this.A0H = A004;
        C008002u A0h = AbstractC31179DnN.A0h();
        this.A0J = A0h;
        C008002u A1A = AbstractC25235BEs.A1A(true);
        this.A0I = A1A;
        C008002u A005 = C10E.A00(null);
        this.A0G = A005;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC33336EoV.A04);
        this.A0D = A1H;
        this.A0L = AbstractC208910l.A02(A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(EnumC33348Eoh.A03);
        this.A0F = A1H2;
        C008002u A006 = C10E.A00(G7G.A00);
        this.A0K = A006;
        this.A0C = new C31199Dni(14, new InterfaceC19390xP[]{A003, A004, A0h, A1A, A005, A1H, A1H2, A006}, this);
        this.A00 = C05F.A01;
        fj8.A00.markerStart(1062864564, fj8.A01.hashCode());
        AbstractC23641Du.A05(c12l.A04, new MBp(this, null, 2), AbstractC141776au.A00(this));
    }

    public static final C26085BgE A00(EnumC33336EoV enumC33336EoV, FanClubConsiderationViewModel fanClubConsiderationViewModel, Boolean bool, Boolean bool2, Integer num) {
        C5QE A00;
        int i;
        int intValue = fanClubConsiderationViewModel.A00.intValue();
        boolean z = false;
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    if (num != null) {
                        A00 = new C27054Bwd(new Object[]{num}, R.plurals.fan_club_creator_view_members_list, num.intValue());
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw B4Z.A00();
                }
            } else {
                if (enumC33336EoV == EnumC33336EoV.A03) {
                    i = 2131962180;
                } else {
                    i = 2131962187;
                    if (AbstractC166997dE.A1Z(bool2, true)) {
                        i = 2131962153;
                    }
                }
                BHS A002 = BHS.A00(new Object[0], i);
                EnumC99704do enumC99704do = EnumC99704do.A03;
                if (enumC33336EoV == EnumC33336EoV.A04 && !AbstractC166997dE.A1Z(bool, true)) {
                    z = true;
                }
                return new C26085BgE(A002, enumC99704do, z, AbstractC166997dE.A1Z(bool2, true));
            }
        } else {
            A00 = BHS.A00(new Object[0], 2131962204);
        }
        return new C26085BgE(A00, EnumC99704do.A06, AbstractC167007dF.A1X(enumC33336EoV, EnumC33336EoV.A04));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.instagram.fanclub.consideration.FanClubConsiderationViewModel r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            r3 = 27
            boolean r0 = X.MAK.A01(r15, r3)
            if (r0 == 0) goto Ld0
            r7 = r15
            X.MAK r7 = (X.MAK) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld0
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r10 = r7.A03
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A00
            r2 = 0
            r6 = 0
            r12 = 2
            r11 = 1
            r9 = 0
            if (r0 == 0) goto L57
            if (r0 == r11) goto L98
            if (r0 != r12) goto Ld7
            java.lang.Object r14 = r7.A02
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r7.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r13 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r13
            X.AbstractC09560e7.A00(r10)
        L33:
            X.R0m r10 = (X.C60486R0m) r10
            if (r10 == 0) goto L56
            X.4dm r5 = r13.A04
            java.lang.Integer r4 = X.C05F.A0Y
            X.R0l r0 = r10.A0E()
            if (r0 == 0) goto L4e
            X.QgL r1 = r0.A0E()
            if (r1 == 0) goto L4e
            java.lang.String r0 = "count"
            int r0 = r1.getCoercedIntField(r9, r0)
            long r2 = (long) r0
        L4e:
            r5.A01(r4, r14, r2)
            X.Edp r6 = new X.Edp
            r6.<init>(r10)
        L56:
            return r6
        L57:
            X.AbstractC09560e7.A00(r10)
            java.lang.Integer r0 = r13.A00
            int r0 = r0.intValue()
            if (r0 == r9) goto L7f
            if (r0 == r11) goto L7f
            if (r0 != r12) goto Ldc
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r10 = r13.A06
            com.instagram.common.session.UserSession r5 = r13.A03
            X.0Tz r4 = X.C06090Tz.A06
            r0 = 36320648636670758(0x81097000002326, double:3.0326626771191285E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            X.AbstractC31172DnG.A1V(r13, r14, r7, r12)
            java.lang.Object r10 = r10.A01(r14, r7, r0)
            if (r10 != r8) goto L33
            return r8
        L7f:
            com.instagram.fanclub.consideration.FanClubConsiderationRepository r10 = r13.A06
            com.instagram.common.session.UserSession r5 = r13.A03
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36329049592709110(0x81111400003ff6, double:3.037975475545717E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            X.AbstractC31172DnG.A1V(r13, r14, r7, r11)
            java.lang.Object r10 = r10.A02(r14, r7, r0)
            if (r10 != r8) goto La3
            return r8
        L98:
            java.lang.Object r14 = r7.A02
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r7.A01
            com.instagram.fanclub.consideration.FanClubConsiderationViewModel r13 = (com.instagram.fanclub.consideration.FanClubConsiderationViewModel) r13
            X.AbstractC09560e7.A00(r10)
        La3:
            X.R0q r10 = (X.C60490R0q) r10
            if (r10 == 0) goto L56
            X.4dm r8 = r13.A04
            java.lang.Integer r7 = X.C05F.A0C
            X.R0p r6 = r10.A0E()
            if (r6 == 0) goto Lc7
            java.lang.Class<X.QgR> r5 = X.QgR.class
            r4 = 8
            java.lang.String r1 = "members"
            r0 = -1307878652(0xffffffffb20b5b04, float:-8.111559E-9)
            X.2JS r1 = r6.getOptionalTreeField(r4, r1, r5, r0)
            if (r1 == 0) goto Lc7
            java.lang.String r0 = "count"
            int r0 = r1.getCoercedIntField(r9, r0)
            long r2 = (long) r0
        Lc7:
            r8.A01(r7, r14, r2)
            X.Edq r6 = new X.Edq
            r6.<init>(r10)
            return r6
        Ld0:
            X.MAK r7 = new X.MAK
            r7.<init>(r13, r15, r3)
            goto L16
        Ld7:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Ldc:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A05(com.instagram.fanclub.consideration.FanClubConsiderationViewModel, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (X.AbstractC166987dD.A1b(r5.A0D) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
    
        if (r0.size() <= 1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(com.instagram.fanclub.consideration.FanClubConsiderationViewModel r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.consideration.FanClubConsiderationViewModel.A06(com.instagram.fanclub.consideration.FanClubConsiderationViewModel, X.1Ds):java.lang.Object");
    }

    public static final List A07(FanClubConsiderationViewModel fanClubConsiderationViewModel, User user, List list, boolean z) {
        BHS A00;
        Object[] objArr;
        int i;
        BHS A002;
        int i2;
        Object[] objArr2;
        int i3;
        Object[] objArr3;
        int i4;
        if (z) {
            return C16930sl.A00;
        }
        boolean A1X = AbstractC167007dF.A1X(fanClubConsiderationViewModel.A00, C05F.A0C);
        C01L A1I = C0eM.A1I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ordinal = ((EnumC53285NhN) it.next()).ordinal();
            if (ordinal != 1) {
                if (ordinal != 5) {
                    if (ordinal != 7) {
                        if (ordinal == 2) {
                            String username = user.getUsername();
                            A00 = BHS.A00(new Object[0], 2131953801);
                            if (A1X) {
                                objArr3 = new Object[0];
                                i4 = 2131953795;
                            } else {
                                objArr3 = new Object[]{username};
                                i4 = 2131953796;
                            }
                            A002 = BHS.A00(objArr3, i4);
                            i2 = R.drawable.instagram_live_pano_outline_24;
                        }
                    } else {
                        String username2 = user.getUsername();
                        A00 = BHS.A00(new Object[0], 2131953803);
                        if (A1X) {
                            objArr2 = new Object[0];
                            i3 = 2131953798;
                        } else {
                            objArr2 = new Object[]{username2};
                            i3 = 2131953799;
                        }
                        A002 = BHS.A00(objArr2, i3);
                        i2 = R.drawable.instagram_app_messenger_pano_outline_24;
                    }
                } else {
                    String username3 = user.getUsername();
                    A00 = BHS.A00(new Object[0], 2131953802);
                    A002 = BHS.A00(new Object[]{username3}, 2131953797);
                    i2 = R.drawable.instagram_media_pano_outline_24;
                }
            } else {
                String username4 = user.getUsername();
                A00 = BHS.A00(new Object[0], 2131953800);
                if (A1X) {
                    objArr = new Object[0];
                    i = 2131953793;
                } else {
                    objArr = new Object[]{username4};
                    i = 2131953794;
                }
                A002 = BHS.A00(objArr, i);
                i2 = R.drawable.instagram_crown_badge_pano_outline_24;
            }
            A1I.add(new E6H(A00, A002, i2));
        }
        return C0eM.A1J(A1I);
    }

    public static final List A09(List list, boolean z) {
        if (z) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if ((obj instanceof QgO) || (obj instanceof QgI)) {
                    C2JS c2js = (C2JS) obj;
                    A1E.add(new C50679MYx(c2js.A07(DialogModule.KEY_TITLE), c2js.A08(DevServerEntity.COLUMN_DESCRIPTION), 47));
                }
            }
            return AbstractC001800i.A0a(A1E);
        }
        return C16930sl.A00;
    }

    public static final void A0B(FanClubConsiderationViewModel fanClubConsiderationViewModel, String str) {
        fanClubConsiderationViewModel.A0F.Egh(EnumC33348Eoh.A02);
        AbstractC23641Du.A05(((C12M) fanClubConsiderationViewModel.A02).A04, new MC9(fanClubConsiderationViewModel, str, (InterfaceC23621Ds) null, 46), AbstractC141776au.A00(fanClubConsiderationViewModel));
    }

    public static final boolean A0C(FanClubConsiderationViewModel fanClubConsiderationViewModel, Boolean bool) {
        User user;
        FanClubInfoDict A0M;
        Integer num = fanClubConsiderationViewModel.A00;
        Integer num2 = C05F.A0C;
        Boolean A0b = AbstractC166997dE.A0b();
        if (num == num2 || (user = (User) fanClubConsiderationViewModel.A0E.getValue()) == null || (A0M = AbstractC31172DnG.A0M(user)) == null || !C14360o3.A0K(A0M.CUI(), A0b)) {
            return false;
        }
        if (!C18U.A06(C06090Tz.A05, fanClubConsiderationViewModel.A03, 36316078791462859L) || C14360o3.A0K(bool, A0b)) {
            return false;
        }
        return true;
    }

    public static final C5QE A01(FanClubConsiderationViewModel fanClubConsiderationViewModel, Integer num, Integer num2, String str, String str2, Map map) {
        int i;
        Object[] objArr;
        int i2;
        int intValue;
        Object obj = map.get(str);
        if (obj == null) {
            return MVZ.A00("");
        }
        Object obj2 = map.get(str2);
        int intValue2 = fanClubConsiderationViewModel.A00.intValue();
        if (intValue2 != 0) {
            if (intValue2 != 1) {
                if (intValue2 == 2) {
                    if (obj2 != null && num != null) {
                        return BHS.A00(new Object[]{obj, obj2, num}, 2131965999);
                    }
                    i = 2131965998;
                } else {
                    throw B4Z.A00();
                }
            } else {
                if (obj2 != null) {
                    objArr = new Object[]{obj, obj2};
                    i2 = 2131962213;
                } else {
                    objArr = new Object[]{obj};
                    i2 = 2131962212;
                }
                ArrayList A1N = AbstractC16960so.A1N(BHS.A00(objArr, i2));
                if (num2 != null && (intValue = num2.intValue()) > 0) {
                    if (C18U.A06(C06090Tz.A05, fanClubConsiderationViewModel.A03, 36329049592709110L)) {
                        A1N.add(new C27054Bwd(new Object[]{C84963qk.A01(intValue)}, R.plurals.fan_onboarding_consideration_subtitle_member_count, intValue));
                    }
                }
                C14360o3.A0B(A1N, 3);
                return new C39062HHm(" · ", A1N);
            }
        } else {
            i = 2131962212;
        }
        return BHS.A00(new Object[]{obj}, i);
    }

    public static final C32906Edn A02(FanClubConsiderationViewModel fanClubConsiderationViewModel, int i) {
        Integer num;
        Set set;
        switch (i) {
            case 1:
                num = C05F.A01;
                break;
            case 2:
                num = C05F.A0j;
                break;
            case 4:
                num = C05F.A0N;
                break;
            case 5:
                num = C05F.A0u;
                break;
            case 6:
                num = C05F.A15;
                break;
            case 7:
                num = C05F.A1F;
                break;
            case 8:
                num = C05F.A0C;
                break;
            case 9:
                num = C05F.A0Y;
                break;
        }
        FJ8 fj8 = fanClubConsiderationViewModel.A05;
        String A00 = F7M.A00(num);
        switch (num.intValue()) {
            case 1:
            case 2:
            case 3:
                fj8.A00.markerEndAtPoint(1062864564, fj8.A01.hashCode(), (short) 3, A00);
                break;
            default:
                C006802i c006802i = fj8.A00;
                int hashCode = fj8.A01.hashCode();
                c006802i.markerAnnotate(1062864564, hashCode, "error", A00);
                c006802i.markerEnd(1062864564, hashCode, (short) 3);
                break;
        }
        C99694dm c99694dm = fanClubConsiderationViewModel.A04;
        String str = fanClubConsiderationViewModel.A0A;
        String A002 = F7M.A00(num);
        C05A c05a = fanClubConsiderationViewModel.A0H;
        FJ9 fj9 = (FJ9) c05a.getValue();
        String str2 = null;
        if (fj9 != null) {
            set = fj9.A01;
        } else {
            set = null;
        }
        String valueOf = String.valueOf(set);
        FJ9 fj92 = (FJ9) c05a.getValue();
        if (fj92 != null) {
            str2 = fj92.A00;
        }
        c99694dm.A0C(str, A002, valueOf, String.valueOf(str2), fanClubConsiderationViewModel.A0B);
        return new C32906Edn(i);
    }

    public static final Integer A03(List list, boolean z) {
        if (!list.isEmpty() && z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((C50679MYx) it.next()).A00;
                if (str != null && str.length() != 0) {
                }
            }
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static final List A08(List list) {
        String str;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C50679MYx c50679MYx = (C50679MYx) it.next();
            String str2 = c50679MYx.A01;
            if (str2 != null && (str = c50679MYx.A00) != null) {
                AbstractC166997dE.A1R(str2, str, A1E);
            }
        }
        return AbstractC001800i.A0a(A1E);
    }

    public static final void A0A(FanClubConsiderationViewModel fanClubConsiderationViewModel, String str) {
        AbstractC23641Du.A05(((C12M) fanClubConsiderationViewModel.A02).A04, new MC9(fanClubConsiderationViewModel, str, (InterfaceC23621Ds) null, 45), AbstractC141776au.A00(fanClubConsiderationViewModel));
    }
}
