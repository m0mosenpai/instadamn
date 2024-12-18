package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136596Gn {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if ((r19 & 16) != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r11, androidx.compose.ui.Modifier r12, X.C118125Vw r13, X.EnumC132215xz r14, X.C69R r15, double r16, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC136596Gn.A01(X.5Tl, androidx.compose.ui.Modifier, X.5Vw, X.5xz, X.69R, double, int, int):void");
    }

    public static final void A04(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        int i4;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-602301108);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i5 = 2;
            if (c5Tl.AH6(interfaceC16820sZ)) {
                i5 = 4;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i6 = 16;
            if (c5Tl.AH2(i)) {
                i6 = 32;
            }
            i4 |= i6;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            int i8 = 128;
            if (c5Tl.AH4(modifier2)) {
                i8 = 256;
            }
            i4 |= i8;
        }
        if ((i4 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1316928166, "com.instagram.barcelona.feed.post.ui.ActionMenuButton (PostHeader.kt:483)");
            }
            C6H1.A00(c5Tl, modifier2, C5YD.A00(c5Tl, 2131953721), interfaceC16820sZ, i, (i4 & 14) | (i4 & 112) | ((i4 << 3) & 7168), 48, C5XL.A00(c5Tl).A0s, false, false);
            if (C0fH.A02()) {
                C0fH.A00(1109965861);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTU(interfaceC16820sZ, modifier2, i, i2, i3, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, (X.AbstractC12990ll) X.C5UT.A01(X.AbstractC117935Vd.A00, X.C117505Tk.A04((X.C117505Tk) r10)), 2342166127456889868L) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C5Tl r10, X.InterfaceC16820sZ r11, float r12, boolean r13) {
        /*
            r0 = -1362929837(0xffffffffaec35753, float:-8.883085E-11)
            r8 = r10
            r10.Eno(r0)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L15
            r1 = -802941743(0xffffffffd02414d1, float:-1.1011311E10)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.FediverseMark (PostHeader.kt:778)"
            X.C0fH.A01(r1, r0)
        L15:
            r5 = 1082130432(0x40800000, float:4.0)
            r0 = -1817175439(0xffffffff93b01a71, float:-4.445472E-27)
            r10.Eno(r0)
            r3 = 0
            if (r13 == 0) goto L3d
            X.5UP r1 = X.AbstractC117935Vd.A00
            r0 = r8
            X.5Tk r0 = (X.C117505Tk) r0
            X.59P r0 = X.C117505Tk.A04(r0)
            java.lang.Object r4 = X.C5UT.A01(r1, r0)
            X.0ll r4 = (X.AbstractC12990ll) r4
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342166127456889868(0x20810baf00052c0c, double:4.068229885954371E-152)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r6 = 1
            if (r0 != 0) goto L3e
        L3d:
            r6 = 0
        L3e:
            r4 = r8
            X.5Tk r4 = (X.C117505Tk) r4
            X.C117505Tk.A0L(r4, r3)
            r0 = -1817162069(0xffffffff93b04eab, float:-4.450622E-27)
            r10.Eno(r0)
            X.58n r2 = androidx.compose.ui.Modifier.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            float r0 = r0 + r12
            androidx.compose.ui.Modifier r0 = X.AbstractC118185Wd.A0C(r2, r0)
            r9 = 0
            androidx.compose.ui.Modifier r1 = X.AbstractC118175Wb.A0A(r0, r5, r9)
            X.5XQ r0 = new X.5XQ
            r0.<init>(r3)
            androidx.compose.ui.Modifier r5 = X.AbstractC118635Yc.A02(r10, r1, r0, r11)
            if (r6 == 0) goto Laf
            X.BH5 r7 = X.BH4.A02(r10)
            r10 = 1135869952(0x43b40000, float:360.0)
            X.DiB r6 = X.AbstractC25328BIx.A02
            r0 = 10000(0x2710, float:1.4013E-41)
            X.BFe r1 = new X.BFe
            r1.<init>(r6, r0, r3)
            java.lang.Integer r0 = X.C05F.A00
            X.BH6 r6 = new X.BH6
            r6.<init>(r1, r0)
            r11 = 29112(0x71b8, float:4.0795E-41)
            X.JTG r6 = X.BH4.A01(r6, r7, r8, r9, r10, r11)
            r0 = -1972024341(0xffffffff8a754beb, float:-1.18105995E-32)
            r8.Eno(r0)
            boolean r0 = r8.AH4(r6)
            java.lang.Object r1 = r8.EEc()
            if (r0 != 0) goto L94
            java.lang.Object r0 = X.C5UI.A00
            if (r1 != r0) goto L9d
        L94:
            r0 = 5
            X.MHo r1 = new X.MHo
            r1.<init>(r6, r0)
            r8.FBy(r1)
        L9d:
            X.0sJ r1 = (X.InterfaceC16660sJ) r1
            X.C117505Tk.A0L(r4, r3)
            androidx.compose.ui.graphics.BlockGraphicsLayerElement r0 = new androidx.compose.ui.graphics.BlockGraphicsLayerElement
            r0.<init>(r1)
            androidx.compose.ui.Modifier r0 = r2.Eq3(r0)
            androidx.compose.ui.Modifier r5 = r5.Eq3(r0)
        Laf:
            X.C117505Tk.A0L(r4, r3)
            r0 = 1094713344(0x41400000, float:12.0)
            int r1 = java.lang.Float.compare(r12, r0)
            r0 = 2131231070(0x7f08015e, float:1.807821E38)
            if (r1 > 0) goto Lc0
            r0 = 2131231069(0x7f08015d, float:1.8078209E38)
        Lc0:
            X.2DC r2 = X.C5Y7.A00(r8, r0, r3)
            X.5Vo r0 = X.C5XL.A00(r8)
            long r0 = r0.A0s
            X.C5YS.A06(r8, r5, r2, r0)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto Ld9
            r0 = -910406542(0xffffffffc9bc4c72, float:-1542542.2)
            X.C0fH.A00(r0)
        Ld9:
            X.C117505Tk.A0L(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC136596Gn.A05(X.5Tl, X.0sZ, float, boolean):void");
    }

    public static final void A06(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(1668443583);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(interfaceC16820sZ)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1309550459, "com.instagram.barcelona.feed.post.ui.InternalMark (PostHeader.kt:816)");
            }
            C5YS.A06(c5Tl, AbstractC118635Yc.A02(c5Tl, AbstractC118175Wb.A0A(AbstractC118185Wd.A04(Modifier.A00), 4.0f, 0.0f), new C5XQ(0), interfaceC16820sZ), C5Y7.A00(c5Tl, R.drawable.instagram_meta_logo_pano_outline_24, 0), C5XL.A00(c5Tl).A0s);
            if (C0fH.A02()) {
                C0fH.A00(734922902);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30499Dbi(interfaceC16820sZ, i, 20);
        }
    }

    public static final void A07(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(1633112853);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(interfaceC16820sZ)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1832966324, "com.instagram.barcelona.feed.post.ui.PrivateReplyMark (PostHeader.kt:757)");
            }
            C5YS.A06(c5Tl, AbstractC118635Yc.A02(c5Tl, AbstractC118175Wb.A0A(AbstractC118185Wd.A04(Modifier.A00), 4.0f, 0.0f), new C5XQ(0), interfaceC16820sZ), C5Y7.A00(c5Tl, R.drawable.instagram_lock_pano_outline_24, 0), C5XL.A00(c5Tl).A0s);
            if (C0fH.A02()) {
                C0fH.A00(-871814922);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30499Dbi(interfaceC16820sZ, i, 21);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:275:0x06a7, code lost:
    
        if ((r6 & com.facebook.common.dextricks.DalvikInternals.IOPRIO_BACKGROUND) == 16384) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0687, code lost:
    
        if ((r6 & 384) == 256) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0670, code lost:
    
        if ((r6 & 3072) == 2048) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0652, code lost:
    
        if ((r6 & 48) == 32) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0606, code lost:
    
        if ((r6 & 48) == 32) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0761, code lost:
    
        if (r2 == 16384) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x08af, code lost:
    
        if (r2 == 16384) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0132, code lost:
    
        if (r68 != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C136606Go r55, X.C5Tl r56, androidx.compose.ui.Modifier r57, X.C69P r58, java.lang.String r59, java.lang.String r60, X.InterfaceC16820sZ r61, X.InterfaceC16820sZ r62, int r63, int r64, int r65, boolean r66, boolean r67, boolean r68, boolean r69) {
        /*
            Method dump skipped, instructions count: 2514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC136596Gn.A00(X.6Go, X.5Tl, androidx.compose.ui.Modifier, X.69P, java.lang.String, java.lang.String, X.0sZ, X.0sZ, int, int, int, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:285:0x047b, code lost:
    
        if (r152 != com.instagram.user.model.FollowStatus.A05) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x04b7, code lost:
    
        if (((java.lang.Boolean) ((X.C25644BVg) X.C5UT.A01(X.AbstractC25643BVf.A00, X.C117505Tk.A04(r5))).A00.getValue()).booleanValue() != false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x06da, code lost:
    
        if (r22 != false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x06f5, code lost:
    
        if (r155 == com.instagram.api.schemas.LineType.A05) goto L365;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0a0b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r153, androidx.compose.ui.Modifier r154, com.instagram.api.schemas.LineType r155, com.instagram.api.schemas.TextPostAppHeaderFollowVariant r156, X.EnumC132215xz r157, X.C69R r158, com.instagram.common.typedurl.ImageUrl r159, com.instagram.user.model.FollowStatus r160, java.lang.Double r161, java.lang.Long r162, java.lang.String r163, java.lang.String r164, java.lang.String r165, java.lang.String r166, java.lang.String r167, java.lang.String r168, java.lang.String r169, X.InterfaceC16820sZ r170, X.InterfaceC16820sZ r171, X.InterfaceC16820sZ r172, X.InterfaceC16820sZ r173, X.InterfaceC16820sZ r174, X.InterfaceC16820sZ r175, X.InterfaceC16820sZ r176, X.InterfaceC16820sZ r177, X.InterfaceC16820sZ r178, X.InterfaceC16820sZ r179, X.InterfaceC16820sZ r180, X.InterfaceC16820sZ r181, X.InterfaceC16820sZ r182, X.InterfaceC16660sJ r183, int r184, int r185, int r186, int r187, int r188, int r189, int r190, int r191, boolean r192, boolean r193, boolean r194, boolean r195, boolean r196, boolean r197, boolean r198, boolean r199, boolean r200, boolean r201, boolean r202, boolean r203, boolean r204, boolean r205, boolean r206, boolean r207, boolean r208, boolean r209, boolean r210, boolean r211, boolean r212, boolean r213, boolean r214, boolean r215, boolean r216) {
        /*
            Method dump skipped, instructions count: 3514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC136596Gn.A02(X.5Tl, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, com.instagram.api.schemas.TextPostAppHeaderFollowVariant, X.5xz, X.69R, com.instagram.common.typedurl.ImageUrl, com.instagram.user.model.FollowStatus, java.lang.Double, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sJ, int, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static final void A03(C5Tl c5Tl, Modifier modifier, EnumC132215xz enumC132215xz, C69R c69r, Double d, Long l, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i4;
        int i5;
        C118125Vw c118125Vw;
        C118125Vw c118125Vw2;
        Modifier A0E;
        Modifier A0E2;
        Modifier modifier2 = modifier;
        InterfaceC16820sZ interfaceC16820sZ6 = interfaceC16820sZ2;
        InterfaceC16820sZ interfaceC16820sZ7 = interfaceC16820sZ3;
        boolean z6 = z5;
        c5Tl.Enr(633886860);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (c5Tl.AH6(interfaceC16820sZ) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= c5Tl.AH4(str) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= c5Tl.AH5(z) ? 256 : 128;
        }
        int i6 = i3 & 8;
        int i7 = C3OO.FLAG_MOVED;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= c5Tl.AH4(c69r) ? C3OO.FLAG_MOVED : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i4 |= c5Tl.AH4(d) ? Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            boolean AH4 = c5Tl.AH4(l);
            int i8 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
            if (AH4) {
                i8 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            i4 |= i8;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            boolean AH5 = c5Tl.AH5(z2);
            int i9 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (AH5) {
                i9 = 1048576;
            }
            i4 |= i9;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= c5Tl.AH5(z3) ? DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= c5Tl.AH5(z4) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= c5Tl.AH4(str2) ? 536870912 : 268435456;
        }
        if ((i3 & 1024) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (c5Tl.AH4(str3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & C3OO.FLAG_MOVED) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= c5Tl.AH4(enumC132215xz) ? 32 : 16;
        }
        if ((i3 & 4096) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= c5Tl.AH6(interfaceC16660sJ) ? 256 : 128;
        }
        int i10 = i3 & 8192;
        if (i10 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (!c5Tl.AH4(modifier2)) {
                i7 = 1024;
            }
            i5 |= i7;
        }
        int i11 = i3 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        if (i11 != 0) {
            i5 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i5 |= c5Tl.AH6(interfaceC16820sZ6) ? Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET : 8192;
        }
        int i12 = i3 & Constants.LOAD_RESULT_PGO;
        if (i12 != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            boolean AH6 = c5Tl.AH6(interfaceC16820sZ7);
            int i13 = Constants.LOAD_RESULT_PGO_ATTEMPTED;
            if (AH6) {
                i13 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            i5 |= i13;
        }
        if ((65536 & i3) != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            boolean AH42 = c5Tl.AH4(str4);
            int i14 = Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            if (AH42) {
                i14 = 1048576;
            }
            i5 |= i14;
        }
        if ((131072 & i3) != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= c5Tl.AH6(interfaceC16820sZ4) ? DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE : 4194304;
        }
        if ((262144 & i3) != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i5 |= c5Tl.AH6(interfaceC16820sZ5) ? 67108864 : 33554432;
        }
        int i15 = i3 & Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        if (i15 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= c5Tl.AH5(z6) ? 536870912 : 268435456;
        }
        if ((i4 & 306783379) == 306783378 && (306783379 & i5) == 306783378 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i10 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i11 != 0) {
                interfaceC16820sZ6 = B6P.A00;
            }
            if (i12 != 0) {
                interfaceC16820sZ7 = B6Q.A00;
            }
            if (i15 != 0) {
                z6 = false;
            }
            if (C0fH.A02()) {
                C0fH.A01(1448573621, "com.instagram.barcelona.feed.post.ui.PostHeaderUsername (PostHeader.kt:634)");
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            UserSession userSession = (UserSession) C5UT.A01(AbstractC117935Vd.A00, C117505Tk.A04(c117505Tk));
            int i16 = ((i5 >> 9) & 14) >> 3;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, (i16 & 14) | (i16 & 112));
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            InterfaceC16820sZ interfaceC16820sZ8 = C5X8.A00;
            c5Tl.Ent();
            if (c117505Tk.A0K) {
                c5Tl.AMd(interfaceC16820sZ8);
            } else {
                c5Tl.FDO();
            }
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            C5XJ.A00(c5Tl, A02, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A05;
            C5XJ.A00(c5Tl, A04, interfaceC16620sF2);
            InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
            if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A00))) {
                Integer valueOf = Integer.valueOf(A00);
                c5Tl.FBy(valueOf);
                c5Tl.ABx(valueOf, interfaceC16620sF3);
            }
            InterfaceC16620sF interfaceC16620sF4 = C5X8.A04;
            C5XJ.A00(c5Tl, A01, interfaceC16620sF4);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A022 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, interfaceC118225Wj, 48);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            c5Tl.Ent();
            if (c117505Tk.A0K) {
                c5Tl.AMd(interfaceC16820sZ8);
            } else {
                c5Tl.FDO();
            }
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            C5XJ.A00(c5Tl, A042, interfaceC16620sF2);
            if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A002))) {
                Integer valueOf2 = Integer.valueOf(A002);
                c5Tl.FBy(valueOf2);
                c5Tl.ABx(valueOf2, interfaceC16620sF3);
            }
            C5XJ.A00(c5Tl, A012, interfaceC16620sF4);
            C6L0 c6l0 = C6L0.A00;
            c5Tl.Eno(-620790801);
            Modifier FE5 = c6l0.FE5(c1130158n, 1.0f, false);
            if (interfaceC16820sZ != null) {
                FE5 = FE5.Eq3(AbstractC118635Yc.A01(c5Tl, c1130158n, new C5XQ(0), null, interfaceC16820sZ, 3, false));
            }
            C117505Tk.A0L(c117505Tk, false);
            if (z6) {
                c5Tl.Eno(-620780932);
                c118125Vw = C118125Vw.A00(null, null, C5XL.A01(c5Tl).A03, null, null, null, 0, 0, 0, 16646141, 0L, AbstractC118155Vz.A01(13), 0L, AbstractC118155Vz.A01(18));
            } else {
                c5Tl.Eno(-620776352);
                c118125Vw = C5XL.A01(c5Tl).A01;
            }
            C117505Tk.A0L(c117505Tk, false);
            C5WR.A03(c5Tl, FE5, c118125Vw, null, null, null, str, null, 0, 0, 1, 2, (i4 >> 3) & 14, 390, 11260, 0L, 0L, 0L, false);
            c5Tl.Eno(-620775207);
            if (z) {
                AbstractC137516Kw.A01(c5Tl, AbstractC118175Wb.A0E(c1130158n, 4.0f, 0.0f, 0.0f, 0.0f), z6 ? 10 : 12, 6, 4, 0L);
            }
            C117505Tk.A0L(c117505Tk, false);
            boolean z7 = enumC132215xz != EnumC132215xz.A03;
            c5Tl.Eno(-620766840);
            if (z7) {
                boolean z8 = enumC132215xz == EnumC132215xz.A04;
                float f = z6 ? 10 : 12;
                c5Tl.Eno(-620758210);
                boolean AH52 = ((i5 & 896) == 256) | c5Tl.AH5(z8);
                Object EEc = c5Tl.EEc();
                if (AH52 || EEc == C5UI.A00) {
                    EEc = new C50168MDv(13, interfaceC16660sJ, z8);
                    c5Tl.FBy(EEc);
                }
                C117505Tk.A0L(c117505Tk, false);
                A05(c5Tl, (InterfaceC16820sZ) EEc, f, z8);
            }
            C117505Tk.A0L(c117505Tk, false);
            if (str3 != null) {
                c5Tl.Eno(-2063536527);
                AbstractC27572CEr.A00(c5Tl, null, str3, i5 & 14, 2);
            } else if (l != null) {
                c5Tl.Eno(-2063417921);
                long longValue = l.longValue();
                if (z7) {
                    A0E2 = c1130158n;
                } else {
                    A0E2 = AbstractC118175Wb.A0E(c1130158n, 4.0f, 0.0f, 0.0f, 0.0f);
                }
                int i17 = i5 >> 6;
                AbstractC28030CXe.A00(c5Tl, A0E2, null, interfaceC16820sZ6, interfaceC16820sZ7, ((i4 >> 15) & 14) | (i17 & 896) | (i17 & 7168), 112, longValue, 0L, false);
            } else if (z2) {
                c5Tl.Eno(-2063078812);
                if (z7) {
                    A0E = c1130158n;
                } else {
                    A0E = AbstractC118175Wb.A0E(c1130158n, 4.0f, 0.0f, 0.0f, 0.0f);
                }
                AbstractC28028CXc.A00(c5Tl, A0E, null, 0, 6, 0L);
            } else if (d != null && !z4 && !z3) {
                c5Tl.Eno(-2062848451);
                double doubleValue = d.doubleValue();
                if (z6) {
                    c5Tl.Eno(-620720926);
                    c118125Vw2 = C118125Vw.A00(null, null, C5XL.A01(c5Tl).A02, null, null, null, 0, 0, 0, 16646141, 0L, AbstractC118155Vz.A01(13), 0L, AbstractC118155Vz.A01(18));
                } else {
                    c5Tl.Eno(-620716106);
                    c118125Vw2 = C5XL.A01(c5Tl).A00;
                }
                C117505Tk.A0L(c117505Tk, false);
                int i18 = i4 >> 6;
                A01(c5Tl, null, c118125Vw2, enumC132215xz, c69r, doubleValue, ((i5 >> 3) & 14) | (i18 & 112) | (i18 & 896), 8);
            } else {
                c5Tl.Eno(-2062306447);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-620714658);
            if ((l != null || z2) && C1C0.A00(userSession) && C18U.A06(C06090Tz.A05, userSession, 36328551376699007L)) {
                C5WR.A0l(c5Tl, C5XL.A01(c5Tl).A00, " [Internal-Only]", 1, 2, 6, 390, 11258, C5XL.A00(c5Tl).A0t);
            }
            C117505Tk.A0L(c117505Tk, false);
            C117505Tk.A0L(c117505Tk, true);
            if (str2 != null && str2.length() != 0) {
                c5Tl.Eno(-1025192716);
                C5WR.A03(c5Tl, null, C5XL.A01(c5Tl).A00, null, null, null, str2, null, 0, 0, 1, 2, (i4 >> 27) & 14, 390, 11258, C5XL.A00(c5Tl).A0t, 0L, 0L, false);
            } else {
                if (str4 != null && interfaceC16820sZ5 != null) {
                    C14360o3.A0B(userSession, 0);
                    long A013 = C18U.A01(C06090Tz.A05, userSession, 36609386403207045L);
                    if (Long.valueOf(A013) != null && A013 == 0) {
                        c5Tl.Eno(-1024852894);
                        c5Tl.Eno(-1279983286);
                        boolean z9 = (234881024 & i5) == 67108864;
                        Object EEc2 = c5Tl.EEc();
                        if (z9 || EEc2 == C5UI.A00) {
                            EEc2 = new C50155MDi(interfaceC16820sZ5, 1);
                            c5Tl.FBy(EEc2);
                        }
                        InterfaceC16820sZ interfaceC16820sZ9 = (InterfaceC16820sZ) EEc2;
                        C117505Tk.A0L(c117505Tk, false);
                        Modifier A0D = AbstractC118175Wb.A0D(c1130158n, 0.0f, 4.0f, 8.0f);
                        c5Tl.Eno(-1279978862);
                        boolean z10 = (29360128 & i5) == 8388608;
                        Object EEc3 = c5Tl.EEc();
                        if (z10 || EEc3 == C5UI.A00) {
                            EEc3 = new C50155MDi(interfaceC16820sZ4, 2);
                            c5Tl.FBy(EEc3);
                        }
                        C117505Tk.A0L(c117505Tk, false);
                        AbstractC28033CXh.A01(c5Tl, AbstractC118705Yo.A00(A0D, (InterfaceC16820sZ) EEc3), str4, interfaceC16820sZ9, (i5 >> 18) & 14, 0);
                    }
                }
                c5Tl.Eno(-1024562672);
            }
            C117505Tk.A0L(c117505Tk, false);
            C117505Tk.A0L(c117505Tk, true);
            if (C0fH.A02()) {
                C0fH.A00(-774190142);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30367DYq(modifier2, enumC132215xz, c69r, d, l, str, str2, str3, str4, interfaceC16820sZ, interfaceC16820sZ6, interfaceC16820sZ7, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16660sJ, i, i2, i3, z, z2, z3, z4, z6);
        }
    }
}
