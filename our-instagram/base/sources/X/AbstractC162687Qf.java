package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/* renamed from: X.7Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162687Qf {
    public static C163537Tq A00;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (X.C18U.A06(r5, r14, r0) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r5 != X.C2EY.A1i) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if (r2 != X.C2EY.A1i) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
    
        if (r1 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r14, 36325540605408416L) == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C9C0 A00(android.content.Context r13, com.instagram.common.session.UserSession r14, X.C160787Im r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162687Qf.A00(android.content.Context, com.instagram.common.session.UserSession, X.7Im, int, int):X.9C0");
    }

    public static C9C0 A01(Context context, UserSession userSession, C160787Im c160787Im, C7IM c7im, Boolean bool) {
        int color;
        if (A00 == null) {
            A00 = new C163537Tq(userSession);
        }
        C83403nh c83403nh = c160787Im.A0e;
        InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
        context.getResources();
        C7IH c7ih = c7im.A04;
        int[] iArr = c7ih.A0X;
        if (interfaceC83733oI != null && c83403nh.A0Q != null && C18U.A06(C06090Tz.A05, userSession, 36319368737856750L) && c83403nh.A0h() != null && !bool.booleanValue()) {
            InterfaceC83733oI interfaceC83733oI2 = c160787Im.A0G.A0P;
            String A0h = c83403nh.A0h();
            boolean z = false;
            if (interfaceC83733oI2 != null && A0h != null) {
                C163537Tq c163537Tq = A00;
                String str = ((C83693oE) interfaceC83733oI2).A00;
                C14360o3.A0B(str, 0);
                if (C14360o3.A0K(c163537Tq.A00.getString(AnonymousClass001.A0R("thread_id_", str), null), A0h)) {
                    C163537Tq c163537Tq2 = A00;
                    if (!C14360o3.A0K(c163537Tq2.A00.getString(AnonymousClass001.A0R("thread_id_feedback_", str), null), A0h)) {
                        z = true;
                    }
                }
            }
            if (Boolean.valueOf(z).booleanValue()) {
                C7BW c7bw = c83403nh.A0Q;
                if (c7bw != null && c7bw.A02 == C05F.A01) {
                    return null;
                }
                String str2 = ((C83693oE) interfaceC83733oI).A00;
                DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(C2EY.A0H, c83403nh.A0h(), c83403nh.A0g());
                int i = c7ih.A0K;
                if (iArr.length > 0) {
                    color = iArr[0];
                } else {
                    color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_purple));
                }
                return new C9C0(directMessageIdentifier, str2, i, color, 0);
            }
            return null;
        }
        return null;
    }

    public static C7BZ A02(UserSession userSession, C160787Im c160787Im) {
        if (c160787Im.A01 != 0 && C18U.A06(C06090Tz.A05, userSession, 36324612892733726L)) {
            return null;
        }
        C83403nh c83403nh = c160787Im.A0e;
        return new C7BZ(new MessageIdentifier(c83403nh.A0i(), c83403nh.A0g()), c160787Im.A01, c160787Im.A0O);
    }

    public static C7BU A03(UserSession userSession, C160787Im c160787Im, int i, int i2) {
        C7QT c7qt = (C7QT) userSession.A01(C7QT.class, new C50252MHh(userSession, 39));
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        boolean z = c160787Im.A0G.A0r;
        if (c83403nh.A0h() != null && C7QT.A00(c7qt, c83403nh, z)) {
            String A0h = c83403nh.A0h();
            if (A0h != null) {
                C2EY c2ey = c83403nh.A10;
                C14360o3.A07(c2ey);
                return new C7BU(c2ey, A0h, C22P.A2R.toString(), i, i2);
            }
            throw new IllegalStateException("Required value was null.");
        }
        return null;
    }

    public static C158897Bb A04(UserSession userSession, C160787Im c160787Im, int i, int i2) {
        C83403nh c83403nh = c160787Im.A0e;
        if (A0F(c160787Im)) {
            C14360o3.A07(c83403nh);
            C7TT c7tt = c160787Im.A0G;
            if (C7QO.A00(userSession, c83403nh, c7tt.A08, c7tt.A1G, c7tt.A0y) && c83403nh.A0h() != null) {
                return new C158897Bb(c83403nh.A10, c83403nh.A0h(), i, i2, 0, C14360o3.A0K(userSession.userId, c83403nh.BtE()));
            }
            return null;
        }
        return null;
    }

    public static C76K A05(Context context, UserSession userSession, C160787Im c160787Im, C7IM c7im) {
        HashMap hashMap;
        String A03;
        C2EY c2ey;
        String str;
        String string;
        int dimensionPixelOffset;
        if (!c160787Im.A0Z) {
            C160787Im c160787Im2 = c160787Im.A0E;
            if (c160787Im2 == null) {
                c160787Im2 = c160787Im;
            }
            C83403nh c83403nh = c160787Im2.A0e;
            if (!c83403nh.A1R() || !C18U.A06(C06090Tz.A05, userSession, 36317706586625522L)) {
                int i = 8388611;
                if (c83403nh.A1j(C17060sy.A01.A01(userSession))) {
                    i = 8388613;
                }
                C9B5 c9b5 = c83403nh.A04;
                if (c9b5 != null && c9b5.A00) {
                    string = context.getString(2131958775);
                    dimensionPixelOffset = 12;
                } else {
                    C7BW c7bw = c83403nh.A0Q;
                    if (c7bw != null && (str = c7bw.A07) != null && str.equals("source:bm_genai_agent") && !c160787Im2.A0U) {
                        string = context.getString(2131958697);
                        dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                    } else if (c83403nh.A2F && (c2ey = c83403nh.A10) != C2EY.A1V && c2ey != C2EY.A20 && c2ey != C2EY.A1z && c2ey != C2EY.A1g && c2ey != C2EY.A22) {
                        String A0E = A0E(context, userSession, c160787Im2, AbstractC47009KqS.A00(context, userSession, c160787Im2));
                        if (!TextUtils.isEmpty(A0E)) {
                            return new C76K(c83403nh.A0V(), A0E, c83403nh.A1Z, c83403nh.A1a, null, 12, i, c7im.A00, c7im.A04.A04);
                        }
                    } else {
                        String A0E2 = A0E(context, userSession, c160787Im2, A0C(context, userSession, c160787Im2));
                        if (!TextUtils.isEmpty(A0E2)) {
                            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                            int i2 = c7im.A00;
                            int i3 = c7im.A04.A04;
                            DirectMessageIdentifier A0V = c83403nh.A0V();
                            if (c83403nh.A00 == 12 && !F28.A00(userSession)) {
                                ImmutableList A0H = c83403nh.A0H();
                                AbstractC224309vG A01 = AbstractC178007vZ.A01(userSession, c83403nh.A1V, C16930sl.A00);
                                if (A01 != null && (A03 = A01.A03()) != null && !A03.equals("")) {
                                    hashMap = new HashMap();
                                    if (A0H != null) {
                                        C1LC it = A0H.iterator();
                                        while (it.hasNext()) {
                                            hashMap.put(String.valueOf(((C910143t) it.next()).A0K), A03);
                                        }
                                    } else {
                                        C38321qM c38321qM = c83403nh.A0s;
                                        if (c38321qM != null) {
                                            hashMap.put(c38321qM.getId(), A03);
                                        }
                                    }
                                    return new C76K(A0V, A0E2, null, null, hashMap, dimensionPixelOffset2, i, i2, i3);
                                }
                            }
                            hashMap = null;
                            return new C76K(A0V, A0E2, null, null, hashMap, dimensionPixelOffset2, i, i2, i3);
                        }
                    }
                }
                return new C76K(c83403nh.A0V(), string, null, null, null, dimensionPixelOffset, i, c7im.A00, c7im.A04.A04);
            }
        }
        return null;
    }

    public static C7BT A06(UserSession userSession, C160787Im c160787Im, int i, int i2) {
        Integer num;
        boolean z;
        C83403nh c83403nh = c160787Im.A0e;
        String str = null;
        if (c83403nh.A0h() != null) {
            String A0h = c83403nh.A0h();
            if (c83403nh.A1T != null) {
                synchronized (c83403nh) {
                    z = c83403nh.A2E;
                }
                if (z && c83403nh.A10 != C2EY.A1k) {
                    if (C6X6.A0U(c160787Im.A0G.A0G)) {
                        num = c83403nh.A1T() ? C05F.A01 : C05F.A0N;
                    } else if (C6X6.A05(userSession)) {
                        num = C05F.A00;
                    }
                    return new C7BT(num, str, c83403nh.A1u, A0h, i, i2);
                }
            }
            if (c83403nh.A10 == C2EY.A1u && !c83403nh.A1S() && C18U.A06(C06090Tz.A05, userSession, 36322538422282555L)) {
                num = C05F.A0C;
                C910143t A01 = AbstractC158887Ba.A01(c83403nh);
                if (A01 != null) {
                    str = A01.A0w;
                }
                return new C7BT(num, str, c83403nh.A1u, A0h, i, i2);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C162717Qi A08(X.C160787Im r4, java.lang.Integer r5) {
        /*
            com.instagram.user.model.User r2 = r4.A0K
            if (r5 == 0) goto L33
            int r0 = r5.intValue()
        L8:
            if (r0 == 0) goto L1c
            r1 = 4
            if (r0 == r1) goto L30
            X.7Sj r3 = X.C163247Sj.A00
        Lf:
            if (r2 != 0) goto L2b
            r2 = 0
        L12:
            X.7TT r0 = r4.A0G
            boolean r1 = r0.A0r
            X.7Qi r0 = new X.7Qi
            r0.<init>(r2, r3, r1)
            return r0
        L1c:
            if (r2 == 0) goto L30
            com.instagram.direct.model.messaginguser.MessagingUser r1 = com.instagram.direct.model.messaginguser.MessagingUser.A00(r2)
            java.lang.String r0 = X.AbstractC101904i3.A07(r2)
            X.7SW r3 = new X.7SW
            r3.<init>(r1, r0)
        L2b:
            com.instagram.common.typedurl.ImageUrl r2 = r2.Bhu()
            goto L12
        L30:
            X.7Qg r3 = X.C162697Qg.A00
            goto Lf
        L33:
            int r0 = r4.A00
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162687Qf.A08(X.7Im, java.lang.Integer):X.7Qi");
    }

    public static C7BQ A09(UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IH c7ih) {
        C83403nh c83403nh = c160787Im.A0e;
        DirectMessageComments directMessageComments = c83403nh.A0q;
        InterfaceC83733oI interfaceC83733oI = c160787Im.A0G.A0P;
        if (directMessageComments != null && c83403nh.A0h() != null && interfaceC83733oI != null && C98Q.A00(userSession).A00(interfaceC83733oI, 44) && !C18U.A06(C06090Tz.A05, userSession, 36319377327856951L)) {
            return new C7BQ(userSession, anonymousClass988, c7ih, new MessageIdentifier(c83403nh.A0h(), c83403nh.A0g()), AbstractC1345466e.A01(interfaceC83733oI).A00, directMessageComments.A01, directMessageComments.A00, false, false);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x039e, code lost:
    
        if (r24.isEmpty() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05b5, code lost:
    
        if (r3.isEmpty() != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r60, 36319377327856951L) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0221, code lost:
    
        if (r11 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d8, code lost:
    
        if (r11 == false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AnonymousClass794 A0A(android.content.Context r59, com.instagram.common.session.UserSession r60, X.AnonymousClass988 r61, X.C160787Im r62, X.C7IH r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162687Qf.A0A(android.content.Context, com.instagram.common.session.UserSession, X.988, X.7Im, X.7IH, boolean):X.794");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (((X.C910143t) r0.A0H().get(0)).A02 == 6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r27, 36320232025301145L) == false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C7DA A0B(android.content.Context r25, android.graphics.PointF r26, com.instagram.common.session.UserSession r27, X.AnonymousClass988 r28, X.C160787Im r29, X.C7IH r30, X.C18A r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162687Qf.A0B(android.content.Context, android.graphics.PointF, com.instagram.common.session.UserSession, X.988, X.7Im, X.7IH, X.18A, boolean):X.7DA");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01e9, code lost:
    
        if (r5.A0z != X.C2EY.A0m) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ba, code lost:
    
        if (r2.A0C.AdX() == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0145, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r10.A03)) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0147, code lost:
    
        r0 = 2131959189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014a, code lost:
    
        if (r13 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014c, code lost:
    
        r0 = 2131959257;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0030. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence A0C(android.content.Context r14, com.instagram.common.session.UserSession r15, X.C160787Im r16) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162687Qf.A0C(android.content.Context, com.instagram.common.session.UserSession, X.7Im):java.lang.CharSequence");
    }

    public static CharSequence A0D(Context context, UserSession userSession, C83403nh c83403nh, boolean z) {
        String str = c83403nh.A1V;
        if (str != null) {
            int i = c83403nh.A00;
            if (i != 8) {
                if (i != 11) {
                    if (i != 13) {
                        return str;
                    }
                    C14360o3.A0B(context, 0);
                    Drawable drawable = context.getDrawable(R.drawable.instagram_blend_pano_filled_12);
                    if (drawable != null) {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawable.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A0H(context, R.attr.igdsSecondaryIcon))));
                        C85973sR c85973sR = new C85973sR(drawable);
                        boolean A02 = AbstractC13620mo.A02(context);
                        if (!z ? A02 : !A02) {
                            SpannableString spannableString = new SpannableString(AnonymousClass001.A0C(str, ' '));
                            c85973sR.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                            spannableString.setSpan(c85973sR, spannableString.length() - 1, spannableString.length(), 18);
                            return spannableString;
                        }
                        SpannableString spannableString2 = new SpannableString(AnonymousClass001.A0D(str, ' '));
                        c85973sR.A01 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                        spannableString2.setSpan(c85973sR, 0, 1, 18);
                        return spannableString2;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(context, 1);
            }
            return AbstractC172497mJ.A07(context, str, z);
        }
        C9B5 c9b5 = c83403nh.A04;
        if (c9b5 != null && c9b5.A00) {
            return context.getString(2131958775);
        }
        return null;
    }

    public static String A0E(Context context, UserSession userSession, C160787Im c160787Im, CharSequence charSequence) {
        String str;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        C83403nh c83403nh = c160787Im.A0e;
        if (c83403nh.A01 > 0 && (C14360o3.A0K(userSession.userId, c83403nh.BtE()) || !c160787Im.A0G.A0r)) {
            int i = 2131959873;
            if (c160787Im.A0Z) {
                i = 2131959883;
            }
            String string = context.getString(i);
            if (sb.length() > 0) {
                string = context.getString(2131964621, "", string);
            }
            sb.append(string);
        }
        if (c83403nh.A2H && (C14360o3.A0K(userSession.userId, c83403nh.BtE()) || !c160787Im.A0G.A0r)) {
            String string2 = context.getString(2131959903);
            if (sb.length() > 0) {
                string2 = context.getString(2131964621, "", string2);
            }
            sb.append(string2);
            if (c83403nh.A0U() != null) {
                AbstractC46705KlO.A00(userSession).A00(c83403nh.A0U().A00, String.valueOf(c83403nh.A10));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A0F(C160787Im c160787Im) {
        C83403nh c83403nh = c160787Im.A0e;
        int i = c160787Im.A0G.A08;
        C2EY c2ey = c83403nh.A10;
        if ((c2ey != C2EY.A1F || c83403nh.A1Y()) && c2ey != C2EY.A0t && c2ey != C2EY.A0W && c2ey != C2EY.A1r && c2ey != C2EY.A19 && c2ey != C2EY.A1C) {
            ImmutableList A0H = c83403nh.A0H();
            if (A0H != null) {
                if (A0H.size() == 1 && A0H.get(0) != 0) {
                    if (((C910143t) A0H.get(0)).A02 != 20 && ((C910143t) A0H.get(0)).A04()) {
                        return true;
                    }
                } else if (!A0H.isEmpty() && A0H.get(0) != 0 && ((C910143t) A0H.get(0)).A02 == 9 && ((C910143t) A0H.get(0)).A04()) {
                    return true;
                }
            }
            if (i == 29 && c160787Im.A0W) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static C7BV A07(Context context, C45076Jx5 c45076Jx5, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (!C17280tP.A00().A0c()) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss.SSS");
        long j = c45076Jx5.A00;
        String format = simpleDateFormat.format(new Date(j));
        Long l = c45076Jx5.A02;
        if (l != null) {
            long longValue = l.longValue();
            str3 = simpleDateFormat.format(new Date(longValue));
            str4 = AnonymousClass001.A0A(longValue - j, " MS");
        } else {
            str3 = null;
            str4 = null;
        }
        Long l2 = c45076Jx5.A05;
        if (l2 != null) {
            str5 = simpleDateFormat.format(new Date(l2.longValue()));
        } else {
            str5 = null;
        }
        Long l3 = c45076Jx5.A04;
        if (l3 != null && l2 != null) {
            long longValue2 = l3.longValue();
            str7 = simpleDateFormat.format(new Date(longValue2));
            str6 = AnonymousClass001.A0A(longValue2 - l2.longValue(), " MS");
        } else {
            str6 = null;
        }
        return new C7BV(format, context.getString(2131957578), str3, context.getString(2131957576), str4, context.getString(2131957575), str5, context.getString(2131957581), str7, context.getString(2131957580), str6, context.getString(2131957579), c45076Jx5.A08, context.getString(2131957577), str, str2);
    }
}
