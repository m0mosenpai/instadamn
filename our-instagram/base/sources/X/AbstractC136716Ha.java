package X;

import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.6Ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136716Ha {
    public static final void A03(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        Modifier modifier2 = modifier;
        c5Tl.Enr(406962479);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i5 = 2;
            if (c5Tl.AH2(i)) {
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
            if (c5Tl.AH5(z)) {
                i6 = 32;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            int i7 = 128;
            if (c5Tl.AH5(z2)) {
                i7 = 256;
            }
            i4 |= i7;
        }
        if ((i3 & 16) != 0) {
            i4 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            int i8 = 8192;
            if (c5Tl.AH6(interfaceC16820sZ)) {
                i8 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i4 |= i8;
        }
        if ((i4 & 8339) == 8338 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if ((i3 & 8) != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1161588337, "com.instagram.barcelona.feed.post.ui.PostLikeCountAnimatedLabel (PostCollapsedChildContent.kt:243)");
            }
            A05(c5Tl, interfaceC16820sZ, i, (i4 & 14) | (i4 & 112) | (i4 & 896) | ((i4 >> 3) & 7168), z, z2);
            if (C0fH.A02()) {
                C0fH.A00(1401857611);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30230DTj(modifier2, interfaceC16820sZ, i, i2, i3, z, z2);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, int i, int i2, int i3, boolean z) {
        int i4;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-482805433);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i5 = 2;
            if (c5Tl.AH2(i)) {
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
            if (c5Tl.AH5(z)) {
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
                C0fH.A01(-824693429, "com.instagram.barcelona.feed.post.ui.PostRepliesCountLabel (PostCollapsedChildContent.kt:224)");
            }
            if (i > 0 && z) {
                C5WR.A03(c5Tl, modifier2, null, null, null, null, A00(c5Tl, i, R.plurals.barcelona_expand_replies, i4 & 14), null, 0, 0, 0, 0, (i4 >> 3) & 112, 0, 32760, C5XL.A00(c5Tl).A0t, 0L, 0L, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1676868473);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C136756He(modifier2, i, i2, i3, z);
        }
    }

    public static final void A04(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        Modifier modifier2 = modifier;
        c5Tl.Enr(1403008697);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i5 = 2;
            if (c5Tl.AH2(i)) {
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
            if (c5Tl.AH5(z)) {
                i6 = 32;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            int i7 = 128;
            if (c5Tl.AH5(z2)) {
                i7 = 256;
            }
            i4 |= i7;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            int i9 = 1024;
            if (c5Tl.AH4(modifier2)) {
                i9 = C3OO.FLAG_MOVED;
            }
            i4 |= i9;
        }
        if ((i3 & 16) != 0) {
            i4 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            int i10 = 8192;
            if (c5Tl.AH6(interfaceC16820sZ)) {
                i10 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            i4 |= i10;
        }
        if ((i4 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i8 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1431291330, "com.instagram.barcelona.feed.post.ui.PostLikeCountTextLabel (PostCollapsedChildContent.kt:287)");
            }
            if (i > 0) {
                c5Tl.Eno(1432356114);
                if (z) {
                    A07(null, c5Tl, 0, 1);
                }
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C117505Tk.A0L(c117505Tk, false);
                C5XQ c5xq = new C5XQ(0);
                c5Tl.Eno(1432359892);
                boolean z3 = false;
                if ((57344 & i4) == 16384) {
                    z3 = true;
                }
                Object EEc = c5Tl.EEc();
                if (z3 || EEc == C5UI.A00) {
                    EEc = new C9EI(interfaceC16820sZ, 36);
                    c5Tl.FBy(EEc);
                }
                C117505Tk.A0L(c117505Tk, false);
                Modifier A01 = AbstractC118635Yc.A01(c5Tl, modifier2, c5xq, null, (InterfaceC16820sZ) EEc, 3, false);
                InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0E, false);
                int A002 = C5X2.A00(c5Tl);
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A012 = C5X3.A01(c5Tl, A01);
                InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
                c5Tl.Ent();
                if (c117505Tk.A0K) {
                    c5Tl.AMd(interfaceC16820sZ2);
                } else {
                    c5Tl.FDO();
                }
                C5XJ.A00(c5Tl, A00, C5X8.A03);
                C5XJ.A00(c5Tl, A04, C5X8.A05);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A002))) {
                    Integer valueOf = Integer.valueOf(A002);
                    c5Tl.FBy(valueOf);
                    c5Tl.ABx(valueOf, interfaceC16620sF);
                }
                C5XJ.A00(c5Tl, A012, C5X8.A04);
                if (z2) {
                    c5Tl.Eno(736040540);
                    A06(null, c5Tl, 0, 1);
                } else {
                    c5Tl.Eno(736092558);
                    C5WR.A03(c5Tl, null, null, null, null, null, A00(c5Tl, i, R.plurals.barcelona_post_like_count, i4 & 14), null, 0, 0, 1, 2, 0, 390, 27642, C5XL.A00(c5Tl).A0t, 0L, 0L, false);
                }
                C117505Tk.A0L(c117505Tk, false);
                C117505Tk.A0L(c117505Tk, true);
            }
            if (C0fH.A02()) {
                C0fH.A00(-2025231139);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C6I8(modifier2, interfaceC16820sZ, i, i2, i3, z, z2);
        }
    }

    public static final void A06(Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1409794415);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i5 = 2;
            if (c5Tl.AH4(modifier2)) {
                i5 = 4;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1698039421, "com.instagram.barcelona.feed.post.ui.HiddenLikeCountLabel (PostCollapsedChildContent.kt:308)");
            }
            C5WR.A03(c5Tl, modifier2, null, null, null, null, C5YD.A00(c5Tl, 2131953756), null, 0, 0, 1, 2, (i3 << 3) & 112, 390, 27640, C5XL.A00(c5Tl).A0t, 0L, 0L, false);
            if (C0fH.A02()) {
                C0fH.A00(-609555932);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30501Dbk(modifier2, i2, i, 1);
        }
    }

    public static final void A07(Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(274310790);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i5 = 2;
            if (c5Tl.AH4(modifier2)) {
                i5 = 4;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-2141599920, "com.instagram.barcelona.feed.post.ui.LabelSeparator (PostCollapsedChildContent.kt:319)");
            }
            C5WR.A03(c5Tl, modifier2, null, null, null, null, " · ", null, 0, 0, 0, 0, ((i3 << 3) & 112) | 6, 0, 32760, C5XL.A00(c5Tl).A0t, 0L, 0L, false);
            if (C0fH.A02()) {
                C0fH.A00(-2087638304);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30501Dbk(modifier2, i2, i, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if ((r6 & 6) == 4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(X.C5Tl r7, int r8, int r9, int r10) {
        /*
            r0 = 736094519(0x2bdfe937, float:1.5909833E-12)
            r7.Eno(r0)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L14
            r1 = -869815289(0xffffffffcc27ac07, float:-4.3954204E7)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.countsStringResource (PostCollapsedChildContent.kt:348)"
            X.C0fH.A01(r1, r0)
        L14:
            r6 = r10 & 14
            int r0 = r10 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r6 = r6 | r0
            r4 = 0
            r0 = -137576504(0xfffffffff7ccbfc8, float:-8.305612E33)
            r7.Eno(r0)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L30
            r1 = 943343170(0x383a4642, float:4.441129E-5)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.rememberCountShortFormattedString (PostCollapsedChildContent.kt:331)"
            X.C0fH.A01(r1, r0)
        L30:
            X.5UP r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            r3 = r7
            X.5Tk r3 = (X.C117505Tk) r3
            X.59P r0 = X.C117505Tk.A04(r3)
            java.lang.Object r0 = X.C5UT.A01(r1, r0)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r5 = r0.getResources()
            r0 = -1236613191(0xffffffffb64ac7b9, float:-3.02166E-6)
            r7.Eno(r0)
            r0 = r6 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L56
            boolean r0 = r7.AH2(r8)
            if (r0 != 0) goto L5b
        L56:
            r1 = r6 & 6
            r0 = 0
            if (r1 != r2) goto L5c
        L5b:
            r0 = 1
        L5c:
            java.lang.Object r1 = r7.EEc()
            if (r0 != 0) goto L66
            java.lang.Object r0 = X.C5UI.A00
            if (r1 != r0) goto L78
        L66:
            X.C14360o3.A0A(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r1 = 1
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            java.lang.String r1 = X.C84963qk.A04(r5, r2, r0, r1, r4)
            r7.FBy(r1)
        L78:
            X.C117505Tk.A0L(r3, r4)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L87
            r0 = 1267001650(0x4b84e932, float:1.74209E7)
            X.C0fH.A00(r0)
        L87:
            X.C117505Tk.A0L(r3, r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            java.lang.String r1 = X.AbstractC136736Hc.A02(r7, r0, r9, r8)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L9e
            r0 = -798101243(0xffffffffd06df105, float:-1.5967983E10)
            X.C0fH.A00(r0)
        L9e:
            X.C117505Tk.A0L(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC136716Ha.A00(X.5Tl, int, int, int):java.lang.String");
    }

    public static final void A05(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z, boolean z2) {
        int i3;
        Modifier Eq3;
        c5Tl.Enr(-922199509);
        if ((i2 & 6) == 0) {
            int i4 = 2;
            if (c5Tl.AH2(i)) {
                i4 = 4;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i5 = 16;
            if (c5Tl.AH5(z)) {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            int i6 = 128;
            if (c5Tl.AH5(z2)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            int i7 = 1024;
            if (c5Tl.AH6(interfaceC16820sZ)) {
                i7 = C3OO.FLAG_MOVED;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(608430127, "com.instagram.barcelona.feed.post.ui.PostLikeCountAnimatedTextLabel (PostCollapsedChildContent.kt:258)");
            }
            if (i > 0) {
                c5Tl.Eno(-1143824273);
                boolean z3 = true;
                if (z) {
                    A07(null, c5Tl, 0, 1);
                }
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C117505Tk.A0L(c117505Tk, false);
                if (z2) {
                    c5Tl.Eno(-1098729122);
                    Eq3 = C6L2.A00(Modifier.A00).Eq3(new SizeAnimationModifierElement(new C5Y4(new C119055aN(1 | (1 << 32)), 1.0f, 400.0f), C118195Wf.A0E));
                    C5XQ c5xq = new C5XQ(0);
                    c5Tl.Eno(-1143817393);
                    if ((i3 & 7168) != 2048) {
                        z3 = false;
                    }
                    Object EEc = c5Tl.EEc();
                    if (z3 || EEc == C5UI.A00) {
                        EEc = new C50154MDh(interfaceC16820sZ, 44);
                        c5Tl.FBy(EEc);
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    A06(AbstractC118635Yc.A02(c5Tl, Eq3, c5xq, (InterfaceC16820sZ) EEc), c5Tl, 0, 0);
                } else {
                    c5Tl.Eno(-1098525700);
                    CED.A00(c5Tl, null, interfaceC16820sZ, i, R.plurals.barcelona_post_like_count, (i3 & 14) | ((i3 >> 3) & 896), 8);
                }
                C117505Tk.A0L(c117505Tk, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(-235643253);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30200DSf(interfaceC16820sZ, i, i2, z, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x030f, code lost:
    
        if (r74 == false) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r58, androidx.compose.ui.Modifier r59, com.instagram.api.schemas.LineType r60, X.InterfaceC132315yA r61, X.C6HZ r62, X.InterfaceC16820sZ r63, X.InterfaceC16820sZ r64, X.InterfaceC16820sZ r65, X.InterfaceC16820sZ r66, X.C5Hc r67, int r68, int r69, int r70, int r71, int r72, boolean r73, boolean r74, boolean r75, boolean r76, boolean r77, boolean r78, boolean r79) {
        /*
            Method dump skipped, instructions count: 1475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC136716Ha.A02(X.5Tl, androidx.compose.ui.Modifier, com.instagram.api.schemas.LineType, X.5yA, X.6HZ, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.5Hc, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
