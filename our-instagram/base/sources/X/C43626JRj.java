package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JRj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43626JRj {
    public C51729Mt8 A00;
    public EnumC44025JdC A01;
    public boolean A02;
    public final Context A03;
    public final FragmentActivity A04;
    public final InterfaceC11380iw A05;
    public final C42201xA A06;
    public final C42221xC A07;
    public final C42221xC A08;
    public final C42221xC A09;
    public final C41761wQ A0A;
    public final UserSession A0B;
    public final C43629JRm A0C;
    public final C43976JcP A0D;
    public final C43970JcJ A0E;
    public final MSJ A0F;
    public final InterfaceC42241xE A0G;
    public final InterfaceC42241xE A0H;
    public final InterfaceC42241xE A0I;
    public final List A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final C41951wl A0M;
    public final C41891wf A0N;
    public final boolean A0O;
    public final boolean A0P;

    public static EnumC44024JdB A01(Object[] objArr) {
        objArr[0] = EnumC44024JdB.A0F;
        EnumC44024JdB enumC44024JdB = EnumC44024JdB.A0Q;
        objArr[1] = enumC44024JdB;
        objArr[2] = EnumC44024JdB.A05;
        return enumC44024JdB;
    }

    public static EnumC44024JdB A02(Object[] objArr) {
        EnumC44024JdB enumC44024JdB = EnumC44024JdB.A0K;
        objArr[3] = enumC44024JdB;
        objArr[4] = EnumC44024JdB.A0N;
        objArr[5] = EnumC44024JdB.A0R;
        objArr[6] = EnumC44024JdB.A0E;
        return enumC44024JdB;
    }

    public final void A07(C44096JeL c44096JeL, boolean z, boolean z2) {
        EY6 ey6;
        C14360o3.A0B(c44096JeL, 1);
        C43970JcJ c43970JcJ = this.A0E;
        if (z) {
            ey6 = new EY6(this.A0B, c44096JeL, z, z2);
        } else {
            ey6 = null;
        }
        c43970JcJ.A0D = ey6;
        A03(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r17.A0B, 36322169055815722L) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r0 = ((X.C45141Jyh) r7).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        r0 = (X.XFT) X.AbstractC001800i.A0O(r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r6 = ((X.C45146Jym) r0).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        r1 = r17.A03;
        r10 = X.AbstractC166997dE.A0p(r1, 2131959690);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r6 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r6.isEmpty() != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r2 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        r8 = r17.A0E;
        r8.A00 = 2;
        r3 = X.AbstractC166987dD.A1E();
        r7 = (X.C45141Jyh) r7;
        r9 = r7.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r9 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        r0 = r7.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        r7 = new X.C31461Ds5(r9, r10, X.AbstractC166997dE.A0p(r1, 2131959684));
        r10 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r10.hasNext() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        r6 = (X.E8F) ((X.XFS) r10.next());
        r12 = r6.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        if (r12 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        if (r12.B7L() != com.instagram.user.model.FollowStatus.A08) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        r12.A0k(com.instagram.user.model.FollowStatus.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        r0 = r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        r0 = r0.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        r12.A10(r0);
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c8, code lost:
    
        if (r8.A00 != 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        r3.add(new X.C31462Ds6(r12, r6.A05, r6.A06, r3.size(), r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
    
        r6 = r17.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0106, code lost:
    
        if (X.C54P.A00(r1, r6) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:
    
        r0 = X.AbstractC23021Ah.A00(r6);
        r9 = java.lang.System.currentTimeMillis();
        r2 = r0.A01;
        r9 = r9 - X.AbstractC31175DnJ.A03(r2, "last_time_dismissed_ci_direct_follow_list");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        if (r2.getInt("num_times_dismissed_ci_direct_follow_list", 0) >= 3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0127, code lost:
    
        if (r9 < 86400000) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0129, code lost:
    
        r4 = X.AbstractC31176DnK.A1a(X.C06090Tz.A05, r6, 36322169055881259L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:
    
        r8.A09 = r7;
        r8.A0M = r3;
        r2 = r8.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013e, code lost:
    
        if (r8.A0E == X.C47062Du.A00) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0142, code lost:
    
        if (r8.A00 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0149, code lost:
    
        if (r2.size() <= 3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014b, code lost:
    
        r2 = r2.subList(0, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        X.C14360o3.A0B(r2, 0);
        r8.A0N = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
    
        if (r4 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0158, code lost:
    
        r8.A06 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
    
        A03(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0162, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r17.A0B, 36322169055225891L) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00fc, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.Fxm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43626JRj.A09(java.util.List):void");
    }

    public final void A0A(List list, int i) {
        C14360o3.A0B(list, 0);
        A0B(list, i, this.A0O, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r1.A0F() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r19.A0P == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r1.A0R() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1.A0X(r19.A0B.userId) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r1.A05() == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r11 = (com.instagram.model.direct.DirectShareTarget) r20.get(r13);
        r14 = r19.A0N.A0A((com.instagram.model.direct.DirectShareTarget) r20.get(r13), r19.A0M);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r21 == 2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r21 == 4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r12 = null;
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r21 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r17 = true;
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r21 == 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        r4.add(new X.C31459Ds3(r11, r12, r13, r14, r22, r16, r17, r18));
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        r1 = r19.A03;
        r0 = 2131960559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        r12 = java.util.Collections.singletonList(r1.getString(r0));
        X.C14360o3.A07(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        r1 = r19.A03;
        r0 = 2131959654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r19.A0B, 36317908447663773L) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b5, code lost:
    
        if (r1 != r2) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r20.isEmpty() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r13 >= r9) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        r1 = (com.instagram.model.direct.DirectShareTarget) r20.get(r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(java.util.List r20, int r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43626JRj.A0B(java.util.List, int, boolean, boolean):void");
    }

    public static final C45653KIq A00(C43626JRj c43626JRj, EnumC44025JdC enumC44025JdC) {
        if (enumC44025JdC == EnumC44025JdC.A09) {
            return null;
        }
        int i = enumC44025JdC.A01;
        Context context = c43626JRj.A03;
        return new C45653KIq(new C49476Ltp(2, c43626JRj, enumC44025JdC), AbstractC166997dE.A0p(context, enumC44025JdC.A00), AbstractC166997dE.A0p(context, 2131963642), i, enumC44025JdC.A05, enumC44025JdC.A04);
    }

    public static final void A03(C43626JRj c43626JRj) {
        if (c43626JRj.A02) {
            A04(c43626JRj);
        }
    }

    public static final void A04(C43626JRj c43626JRj) {
        AbstractC46972Dl abstractC46972Dl;
        EnumC44024JdB[] enumC44024JdBArr;
        EnumC44024JdB enumC44024JdB;
        EnumC44024JdB enumC44024JdB2;
        EnumC44024JdB enumC44024JdB3;
        EnumC44024JdB enumC44024JdB4;
        EnumC44024JdB enumC44024JdB5;
        char c;
        List A1Q;
        List Av6;
        if (!c43626JRj.A02 && c43626JRj.A0L && (Av6 = c43626JRj.A0F.Av6()) != null && !Av6.isEmpty()) {
            c43626JRj.A0I.accept(Av6);
            return;
        }
        try {
            AbstractC09800fd.A01("InboxViewModelGenerator.calculateAndApplyDiffUpdate", -1131555541);
            C42201xA c42201xA = c43626JRj.A06;
            C43970JcJ c43970JcJ = c43626JRj.A0E;
            AbstractC46972Dl abstractC46972Dl2 = c43970JcJ.A0E;
            if (abstractC46972Dl2 == null) {
                abstractC46972Dl = C4I1.A00;
            } else {
                abstractC46972Dl = abstractC46972Dl2;
            }
            if (C14360o3.A0K(abstractC46972Dl, C47072Dv.A00)) {
                EnumC44024JdB enumC44024JdB6 = EnumC44024JdB.A0F;
                enumC44024JdB = EnumC44024JdB.A0Q;
                EnumC44024JdB enumC44024JdB7 = EnumC44024JdB.A05;
                enumC44024JdB2 = EnumC44024JdB.A0K;
                EnumC44024JdB enumC44024JdB8 = EnumC44024JdB.A0N;
                EnumC44024JdB enumC44024JdB9 = EnumC44024JdB.A0R;
                EnumC44024JdB enumC44024JdB10 = EnumC44024JdB.A0E;
                EnumC44024JdB enumC44024JdB11 = EnumC44024JdB.A08;
                EnumC44024JdB enumC44024JdB12 = EnumC44024JdB.A0B;
                EnumC44024JdB enumC44024JdB13 = EnumC44024JdB.A0J;
                enumC44024JdB3 = EnumC44024JdB.A0P;
                enumC44024JdBArr = new EnumC44024JdB[]{enumC44024JdB6, enumC44024JdB, enumC44024JdB7, enumC44024JdB2, enumC44024JdB8, enumC44024JdB9, enumC44024JdB10, enumC44024JdB11, enumC44024JdB12, enumC44024JdB13, enumC44024JdB3, EnumC44024JdB.A0H, EnumC44024JdB.A0G};
            } else {
                if (C14360o3.A0K(abstractC46972Dl, C47032Dr.A00)) {
                    enumC44024JdBArr = new EnumC44024JdB[16];
                    enumC44024JdB = A01(enumC44024JdBArr);
                    enumC44024JdB2 = A02(enumC44024JdBArr);
                    enumC44024JdBArr[7] = EnumC44024JdB.A08;
                    enumC44024JdBArr[8] = EnumC44024JdB.A0B;
                    enumC44024JdBArr[9] = EnumC44024JdB.A0J;
                    enumC44024JdB3 = EnumC44024JdB.A0P;
                    enumC44024JdBArr[10] = enumC44024JdB3;
                    enumC44024JdBArr[11] = EnumC44024JdB.A0O;
                    enumC44024JdBArr[12] = EnumC44024JdB.A07;
                    enumC44024JdBArr[13] = EnumC44024JdB.A0L;
                    enumC44024JdBArr[14] = EnumC44024JdB.A0H;
                    enumC44024JdB5 = EnumC44024JdB.A0G;
                    c = 15;
                } else {
                    if (C14360o3.A0K(abstractC46972Dl, C46962Dk.A00)) {
                        enumC44024JdBArr = new EnumC44024JdB[15];
                        enumC44024JdB = A01(enumC44024JdBArr);
                        enumC44024JdB2 = A02(enumC44024JdBArr);
                        enumC44024JdBArr[7] = EnumC44024JdB.A08;
                        enumC44024JdBArr[8] = EnumC44024JdB.A0B;
                        enumC44024JdBArr[9] = EnumC44024JdB.A09;
                        enumC44024JdBArr[10] = EnumC44024JdB.A0A;
                        enumC44024JdB3 = EnumC44024JdB.A0P;
                        enumC44024JdBArr[11] = enumC44024JdB3;
                        enumC44024JdBArr[12] = EnumC44024JdB.A0H;
                        enumC44024JdBArr[13] = EnumC44024JdB.A0G;
                        enumC44024JdB5 = EnumC44024JdB.A06;
                    } else if (C14360o3.A0K(abstractC46972Dl, C47062Du.A00)) {
                        enumC44024JdBArr = new EnumC44024JdB[14];
                        enumC44024JdB = A01(enumC44024JdBArr);
                        enumC44024JdB2 = A02(enumC44024JdBArr);
                        enumC44024JdBArr[7] = EnumC44024JdB.A0B;
                        enumC44024JdBArr[8] = EnumC44024JdB.A08;
                        enumC44024JdB3 = EnumC44024JdB.A0P;
                        enumC44024JdBArr[9] = enumC44024JdB3;
                        enumC44024JdBArr[10] = EnumC44024JdB.A0G;
                        enumC44024JdBArr[11] = EnumC44024JdB.A04;
                        enumC44024JdBArr[12] = EnumC44024JdB.A0O;
                        enumC44024JdB5 = EnumC44024JdB.A06;
                        c = '\r';
                    } else if (C14360o3.A0K(abstractC46972Dl, C4I1.A00)) {
                        enumC44024JdBArr = new EnumC44024JdB[15];
                        enumC44024JdB = A01(enumC44024JdBArr);
                        enumC44024JdB2 = A02(enumC44024JdBArr);
                        enumC44024JdBArr[7] = EnumC44024JdB.A08;
                        enumC44024JdBArr[8] = EnumC44024JdB.A0B;
                        enumC44024JdB3 = EnumC44024JdB.A0P;
                        enumC44024JdBArr[9] = enumC44024JdB3;
                        enumC44024JdBArr[10] = EnumC44024JdB.A0O;
                        enumC44024JdBArr[11] = EnumC44024JdB.A07;
                        enumC44024JdBArr[12] = EnumC44024JdB.A0L;
                        enumC44024JdBArr[13] = EnumC44024JdB.A0H;
                        enumC44024JdB5 = EnumC44024JdB.A0G;
                    } else {
                        if (C14360o3.A0K(abstractC46972Dl, C4I2.A00)) {
                            enumC44024JdBArr = new EnumC44024JdB[8];
                            enumC44024JdB = A01(enumC44024JdBArr);
                            enumC44024JdB2 = EnumC44024JdB.A0K;
                            enumC44024JdBArr[3] = enumC44024JdB2;
                            enumC44024JdBArr[4] = EnumC44024JdB.A0I;
                            enumC44024JdBArr[5] = EnumC44024JdB.A0E;
                            enumC44024JdB3 = EnumC44024JdB.A0P;
                            enumC44024JdBArr[6] = enumC44024JdB3;
                            enumC44024JdB4 = EnumC44024JdB.A0G;
                        } else if (C14360o3.A0K(abstractC46972Dl, C44037JdO.A00)) {
                            EnumC44024JdB enumC44024JdB14 = EnumC44024JdB.A0F;
                            enumC44024JdB = EnumC44024JdB.A0Q;
                            enumC44024JdB2 = EnumC44024JdB.A0K;
                            enumC44024JdB3 = EnumC44024JdB.A0P;
                            enumC44024JdBArr = new EnumC44024JdB[]{enumC44024JdB14, enumC44024JdB, enumC44024JdB2, enumC44024JdB3};
                        } else if (C14360o3.A0K(abstractC46972Dl, C47092Dx.A00)) {
                            enumC44024JdB = EnumC44024JdB.A0Q;
                            EnumC44024JdB enumC44024JdB15 = EnumC44024JdB.A05;
                            enumC44024JdB2 = EnumC44024JdB.A0K;
                            EnumC44024JdB enumC44024JdB16 = EnumC44024JdB.A0N;
                            EnumC44024JdB enumC44024JdB17 = EnumC44024JdB.A0R;
                            EnumC44024JdB enumC44024JdB18 = EnumC44024JdB.A0E;
                            EnumC44024JdB enumC44024JdB19 = EnumC44024JdB.A08;
                            EnumC44024JdB enumC44024JdB20 = EnumC44024JdB.A0D;
                            EnumC44024JdB enumC44024JdB21 = EnumC44024JdB.A0B;
                            enumC44024JdB3 = EnumC44024JdB.A0P;
                            enumC44024JdBArr = new EnumC44024JdB[]{enumC44024JdB, enumC44024JdB15, enumC44024JdB2, enumC44024JdB16, enumC44024JdB17, enumC44024JdB18, enumC44024JdB19, enumC44024JdB20, enumC44024JdB21, enumC44024JdB3, EnumC44024JdB.A0G};
                        } else if (C14360o3.A0K(abstractC46972Dl, C44035JdM.A00)) {
                            EnumC44024JdB enumC44024JdB22 = EnumC44024JdB.A0F;
                            enumC44024JdB = EnumC44024JdB.A0Q;
                            enumC44024JdB2 = EnumC44024JdB.A0K;
                            EnumC44024JdB enumC44024JdB23 = EnumC44024JdB.A0N;
                            EnumC44024JdB enumC44024JdB24 = EnumC44024JdB.A0R;
                            EnumC44024JdB enumC44024JdB25 = EnumC44024JdB.A0E;
                            EnumC44024JdB enumC44024JdB26 = EnumC44024JdB.A08;
                            enumC44024JdB3 = EnumC44024JdB.A0P;
                            enumC44024JdBArr = new EnumC44024JdB[]{enumC44024JdB22, enumC44024JdB, enumC44024JdB2, enumC44024JdB23, enumC44024JdB24, enumC44024JdB25, enumC44024JdB26, enumC44024JdB3, EnumC44024JdB.A0G, EnumC44024JdB.A06};
                        } else if (abstractC46972Dl instanceof C2E6) {
                            EnumC44024JdB enumC44024JdB27 = EnumC44024JdB.A0F;
                            enumC44024JdB = EnumC44024JdB.A0Q;
                            enumC44024JdB2 = EnumC44024JdB.A0K;
                            EnumC44024JdB enumC44024JdB28 = EnumC44024JdB.A0N;
                            EnumC44024JdB enumC44024JdB29 = EnumC44024JdB.A0R;
                            EnumC44024JdB enumC44024JdB30 = EnumC44024JdB.A0E;
                            EnumC44024JdB enumC44024JdB31 = EnumC44024JdB.A08;
                            enumC44024JdB3 = EnumC44024JdB.A0P;
                            enumC44024JdBArr = new EnumC44024JdB[]{enumC44024JdB27, enumC44024JdB, enumC44024JdB2, enumC44024JdB28, enumC44024JdB29, enumC44024JdB30, enumC44024JdB31, enumC44024JdB3, EnumC44024JdB.A0G};
                        } else {
                            if (!C14360o3.A0K(abstractC46972Dl, C132705yt.A00) && !C14360o3.A0K(abstractC46972Dl, C132695ys.A00)) {
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                A1C.append("No capabilities object found for mode ");
                                A1C.append(abstractC46972Dl2);
                                A1C.append('!');
                                throw AbstractC166987dD.A14(A1C.toString());
                            }
                            enumC44024JdBArr = new EnumC44024JdB[8];
                            enumC44024JdBArr[0] = EnumC44024JdB.A0F;
                            enumC44024JdB = EnumC44024JdB.A0Q;
                            enumC44024JdBArr[1] = enumC44024JdB;
                            enumC44024JdB2 = EnumC44024JdB.A0K;
                            enumC44024JdBArr[2] = enumC44024JdB2;
                            enumC44024JdBArr[3] = EnumC44024JdB.A0N;
                            enumC44024JdBArr[4] = EnumC44024JdB.A08;
                            enumC44024JdB3 = EnumC44024JdB.A0P;
                            enumC44024JdBArr[5] = enumC44024JdB3;
                            enumC44024JdBArr[6] = EnumC44024JdB.A0G;
                            enumC44024JdB4 = EnumC44024JdB.A06;
                        }
                        enumC44024JdBArr[7] = enumC44024JdB4;
                    }
                    c = 14;
                }
                enumC44024JdBArr[c] = enumC44024JdB5;
            }
            C43628JRl c43628JRl = new C43628JRl(enumC44024JdBArr);
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            C43976JcP c43976JcP = c43626JRj.A0D;
            if (!AbstractC43627JRk.A01(A0E, c43628JRl, c43976JcP, EnumC44024JdB.A0F, c43970JcJ)) {
                UserSession userSession = c43626JRj.A0B;
                if (C2E9.A07(userSession)) {
                    A1Q = c43626JRj.A0J;
                } else {
                    A1Q = AbstractC16960so.A1Q(enumC44024JdB, EnumC44024JdB.A05, enumC44024JdB2, EnumC44024JdB.A0N, EnumC44024JdB.A03, EnumC44024JdB.A0R, EnumC44024JdB.A0I, EnumC44024JdB.A0E, EnumC44024JdB.A06, EnumC44024JdB.A08, EnumC44024JdB.A0D, EnumC44024JdB.A0B);
                }
                AbstractC43627JRk.A00(A0E, c43628JRl, c43976JcP, c43970JcJ, A1Q);
                if (!AbstractC43627JRk.A01(A0E, c43628JRl, c43976JcP, EnumC44024JdB.A09, c43970JcJ)) {
                    AbstractC43627JRk.A00(A0E, c43628JRl, c43976JcP, c43970JcJ, AbstractC16960so.A1Q(EnumC44024JdB.A0A, EnumC44024JdB.A0J, EnumC44024JdB.A0H, enumC44024JdB3, EnumC44024JdB.A0G, EnumC44024JdB.A04));
                    if (!C2E9.A07(userSession)) {
                        AbstractC43627JRk.A00(A0E, c43628JRl, c43976JcP, c43970JcJ, AbstractC16960so.A1Q(EnumC44024JdB.A0O, EnumC44024JdB.A0L, EnumC44024JdB.A07));
                    }
                }
            }
            c42201xA.accept(A0E);
            AbstractC09800fd.A00(1413354230);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1365252926);
            throw th;
        }
    }

    public final C43918JbT A05() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (JRL jrl : this.A0E.A0O) {
            if (jrl.A0j) {
                if (jrl.A0W) {
                    i2++;
                } else {
                    i++;
                }
                if (!jrl.A0e) {
                    i3++;
                }
            }
        }
        return new C43918JbT(i + i2, i, i2, i3);
    }

    public final void A06(InterfaceC66482zP interfaceC66482zP) {
        if (interfaceC66482zP == null && this.A0E.A03 == null) {
            return;
        }
        this.A0E.A03 = interfaceC66482zP;
        if (C18U.A06(C06090Tz.A05, this.A0B, 36323178372672572L)) {
            A04(this);
        } else {
            A03(this);
        }
    }

    public final void A08(JUS jus) {
        C43970JcJ c43970JcJ = this.A0E;
        JUS jus2 = c43970JcJ.A0C;
        if (jus != null) {
            if (jus2 != null && jus.equals(jus2)) {
                return;
            }
        } else if (jus == jus2) {
            return;
        }
        c43970JcJ.A0C = jus;
        A04(this);
    }

    public final void A0C(boolean z) {
        C43970JcJ c43970JcJ = this.A0E;
        if (c43970JcJ.A0H != null) {
            c43970JcJ.A0H = JTI.A00(this.A0B, c43970JcJ.A0S, z, c43970JcJ.A0P, c43970JcJ.A0T, c43970JcJ.A0U, c43970JcJ.A0W, c43970JcJ.A0X, c43970JcJ.A0Y, c43970JcJ.A0V);
            A03(this);
        }
    }

    public C43626JRj(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C42221xC c42221xC, C42221xC c42221xC2, C42221xC c42221xC3, UserSession userSession, C43961JcA c43961JcA, C31612Due c31612Due, C43629JRm c43629JRm, C31608Dua c31608Dua, C43955Jc4 c43955Jc4, MSJ msj, C31610Duc c31610Duc, C41951wl c41951wl, JTJ jtj, C43960Jc9 c43960Jc9, C43960Jc9 c43960Jc92, C43960Jc9 c43960Jc93, C31607DuZ c31607DuZ, C31454Dry c31454Dry, InterfaceC62602sz interfaceC62602sz, C31609Dub c31609Dub, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C5Fn c5Fn;
        this.A03 = context;
        this.A0B = userSession;
        this.A05 = interfaceC11380iw;
        this.A0M = c41951wl;
        this.A04 = fragmentActivity;
        this.A0F = msj;
        C41891wf A01 = C41891wf.A01(userSession);
        C14360o3.A07(A01);
        this.A0N = A01;
        this.A0C = c43629JRm;
        this.A06 = AbstractC42021ws.A00();
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36329036707872743L);
        this.A0L = A06;
        this.A0K = C18U.A06(c06090Tz, userSession, 36325819777496471L);
        if (A06) {
            c5Fn = null;
        } else {
            c5Fn = AbstractC142856cl.A01;
        }
        this.A0A = new C41761wQ(c5Fn);
        this.A08 = c42221xC;
        this.A09 = c42221xC2;
        this.A07 = c42221xC3;
        this.A0G = new C44109JeZ(7, c43955Jc4, this);
        this.A0O = z;
        this.A0P = z2;
        this.A00 = new C51729Mt8(3, 2, false);
        BizUserInboxState A00 = AbstractC81043jY.A00(String.valueOf(AbstractC2056298m.A00(userSession).A02()));
        C2056398n A002 = AbstractC2056298m.A00(userSession);
        EnumC44025JdC enumC44025JdC = (EnumC44025JdC) AbstractC166997dE.A0m(EnumC44025JdC.A06, AbstractC43594JPz.A0B(A002, A002.A0G, C2056398n.A0d, 10));
        this.A01 = AbstractC43963JcC.A00(A00, enumC44025JdC == null ? EnumC44025JdC.A09 : enumC44025JdC);
        C43965JcE c43965JcE = new C43965JcE(userSession);
        this.A0D = new C43976JcP(new C43962JcB(userSession, c43629JRm), C44031JdI.A01, C44030JdH.A00, C44026JdD.A00, C44029JdG.A00, new C43982JcV(c31610Duc), C44027JdE.A00, C44028JdF.A00, C44032JdJ.A00, new C43974JcN(userSession, c43629JRm, c43965JcE), new C43973JcM(userSession, c31612Due, c43965JcE), new C43981JcU(), new C43979JcS(), new C43980JcT(), new C43983JcW(userSession), new C43968JcH(c43629JRm), new C43972JcL(userSession, c43960Jc92, c43960Jc93, c31607DuZ), new C43971JcK(c43961JcA, c31454Dry, c31609Dub), new C43969JcI(userSession, c31608Dua, interfaceC62602sz), new C43977JcQ(userSession, c43960Jc9), new C43975JcO(), new C43978JcR(userSession), C44033JdK.A00);
        this.A0E = new C43970JcJ(A00, A00(this, this.A01), jtj, i, z3, z4, z5, z6, z7, z8);
        this.A0H = new JQn(this, 23);
        this.A0I = new JQn(this, 24);
        this.A0J = AbstractC16960so.A1Q(EnumC44024JdB.A0Q, EnumC44024JdB.A05, EnumC44024JdB.A0K, EnumC44024JdB.A0N, EnumC44024JdB.A08, EnumC44024JdB.A03, EnumC44024JdB.A0R, EnumC44024JdB.A0I, EnumC44024JdB.A0E, EnumC44024JdB.A06, EnumC44024JdB.A0D, EnumC44024JdB.A0B);
    }
}
