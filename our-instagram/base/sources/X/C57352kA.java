package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BidiFormatter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.LruCache;
import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: X.2kA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57352kA implements InterfaceC13000lm, InterfaceC220315d {
    public static final Pattern A0A = Pattern.compile("\\p{Blank}+");
    public C57372kC A00;
    public final BidiFormatter A01;
    public final C25671My A07;
    public final UserSession A08;
    public final C57382kD A09;
    public final LruCache A04 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A06 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A02 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A05 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A03 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);

    public static SpannableStringBuilder A01(Context context, final UserSession userSession, final C84923qg c84923qg, final int i, final boolean z) {
        boolean A6S;
        String username;
        String str;
        boolean A6S2;
        if (c84923qg.A08 != null) {
            final C38321qM c38321qM = c84923qg.A07;
            c38321qM.getClass();
            final User user = c84923qg.A08;
            boolean A02 = AbstractC13620mo.A02(context);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean A2N = user.A2N();
            C14360o3.A0B(userSession, 0);
            C40971v4 A00 = AbstractC41561w6.A00(userSession).A00(c38321qM);
            if (A2N) {
                if (A00 != null) {
                    A6S2 = A00.A15;
                } else {
                    A6S2 = c38321qM.A6S();
                }
                if (A6S2 && !TextUtils.isEmpty(AbstractC41071vF.A08(userSession, c38321qM)) && c38321qM.A2E(userSession) == user) {
                    spannableStringBuilder.append((CharSequence) AbstractC41071vF.A08(userSession, c38321qM)).append((CharSequence) " ");
                    spannableStringBuilder.setSpan(new CharacterStyle(), 0, AbstractC41071vF.A08(userSession, c38321qM).length(), 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, AbstractC41071vF.A08(userSession, c38321qM).length(), 33);
                }
            } else {
                if (A00 != null) {
                    A6S = A00.A15;
                } else {
                    A6S = c38321qM.A6S();
                }
                if (A6S && !TextUtils.isEmpty(AbstractC41071vF.A08(userSession, c38321qM)) && c38321qM.A2E(userSession) == user) {
                    username = AbstractC41071vF.A08(userSession, c38321qM);
                } else {
                    username = user.getUsername();
                }
                if (A02) {
                    str = "\u200f";
                } else {
                    str = "";
                }
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append((CharSequence) username);
                AbstractC85213rC abstractC85213rC = new AbstractC85213rC(userSession, c84923qg, c38321qM, user, i, z) { // from class: X.3rB
                    public final int A00;
                    public final C71313Hs A01;
                    public final C25671My A02;
                    public final UserSession A03;
                    public final C84923qg A04;
                    public final C38321qM A05;
                    public final User A06;
                    public final String A07 = "comment_owner";
                    public final boolean A08;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        String str2;
                        C14360o3.A0B(view, 0);
                        this.A01.A0B(view, new String[0]);
                        C84923qg c84923qg2 = this.A04;
                        if (c84923qg2 != null) {
                            str2 = c84923qg2.A0G;
                            if (c84923qg2.A0a == C05F.A00) {
                                C3N0.A00(this.A03).EWt(str2);
                            }
                        } else {
                            str2 = null;
                        }
                        if (!this.A08) {
                            this.A02.E4s(new C72343Mh(this.A05, this.A06, this.A07, str2, false));
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        C14360o3.A0B(textPaint, 0);
                        textPaint.setColor(this.A00);
                        AbstractC14710oj.A06(null, Typeface.create("sans-serif-medium", 0), textPaint, C05F.A01);
                        ((AbstractC85213rC) this).A00 = textPaint.getColor();
                    }

                    {
                        this.A03 = userSession;
                        this.A06 = user;
                        this.A05 = c38321qM;
                        this.A00 = i;
                        this.A04 = c84923qg;
                        this.A08 = z;
                        this.A02 = AbstractC25651Mw.A00(userSession);
                        C71313Hs A002 = C71313Hs.A00(userSession);
                        C14360o3.A07(A002);
                        this.A01 = A002;
                    }
                };
                int length = str.length();
                spannableStringBuilder.setSpan(abstractC85213rC, length, username.length() + length, 33);
                spannableStringBuilder.append((CharSequence) " ");
                if (A02) {
                    spannableStringBuilder.append((CharSequence) "\u202c");
                    return spannableStringBuilder;
                }
            }
            return spannableStringBuilder;
        }
        return new SpannableStringBuilder();
    }

    public static SpannableStringBuilder A02(Context context, C84923qg c84923qg) {
        C14360o3.A0B(context, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C23831Eq.A07(context, c84923qg.A03));
        spannableStringBuilder.append((CharSequence) " • ");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text))), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r4.A0o() > 2200) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(X.C84923qg r13, X.AnonymousClass341 r14, X.C57352kA r15, X.C3AG r16, com.instagram.search.common.analytics.SearchContext r17, java.util.HashMap r18, boolean r19, boolean r20) {
        /*
            r2 = 0
            r0 = r13
            if (r19 == 0) goto L61
            X.341 r4 = X.AnonymousClass341.A0A
            X.341 r5 = X.AnonymousClass341.A0B
            X.341 r6 = X.AnonymousClass341.A0H
            X.341 r7 = X.AnonymousClass341.A0Q
            X.341 r8 = X.AnonymousClass341.A0U
            X.341 r9 = X.AnonymousClass341.A0V
            X.341 r10 = X.AnonymousClass341.A0W
            X.341 r11 = X.AnonymousClass341.A0F
            X.341 r12 = X.AnonymousClass341.A0I
            X.341 r13 = X.AnonymousClass341.A06
            X.341[] r1 = new X.AnonymousClass341[]{r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.EnumSet r1 = java.util.EnumSet.of(r4, r1)
            r7 = r14
            boolean r1 = r1.contains(r14)
            if (r1 == 0) goto L4e
            X.1qM r4 = r0.A07
            r4.getClass()
            boolean r1 = r4.CdW()
            if (r1 == 0) goto L4e
            int r4 = r4.A0o()
            r1 = 2200(0x898, float:3.083E-42)
            if (r4 <= r1) goto L4e
        L3a:
            X.1My r4 = r15.A07
            X.1qM r3 = r0.A07
            r3.getClass()
            java.lang.Integer r1 = r0.A0a
            java.lang.String r0 = r0.A0G
            X.3Mg r5 = new X.3Mg
            r5.<init>(r2, r3, r1, r0)
        L4a:
            r4.E4s(r5)
        L4d:
            return
        L4e:
            X.1My r4 = r15.A07
            X.1qM r6 = r0.A07
            r6.getClass()
            X.3Lw r5 = new X.3Lw
            r8 = r16
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10)
            goto L4a
        L61:
            if (r20 != 0) goto L4d
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57352kA.A08(X.3qg, X.341, X.2kA, X.3AG, com.instagram.search.common.analytics.SearchContext, java.util.HashMap, boolean, boolean):void");
    }

    public static boolean A0A(C57352kA c57352kA, C85163r7 c85163r7) {
        AnonymousClass341 anonymousClass341 = c85163r7.A03;
        return ((anonymousClass341 == AnonymousClass341.A07 && !A0B(c57352kA, c85163r7)) || anonymousClass341 == AnonymousClass341.A0Y || anonymousClass341 == AnonymousClass341.A0X) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (r14.A0N != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.text.SpannableStringBuilder A00(android.content.Context r12, android.text.SpannableStringBuilder r13, X.C85163r7 r14) {
        /*
            r11 = this;
            X.3qg r2 = r14.A01
            java.util.Map r5 = r2.A0g
            com.instagram.common.session.UserSession r6 = r11.A08
            X.3rT r1 = new X.3rT
            r1.<init>(r13, r6)
            X.1qM r3 = r2.A07
            r3.getClass()
            boolean r4 = r2.A02()
            X.3rU r0 = new X.3rU
            r0.<init>(r6, r3, r4)
            r1.A03(r0)
            X.1qM r3 = r2.A07
            r3.getClass()
            X.3rW r0 = new X.3rW
            r0.<init>(r6, r3, r4)
            r1.A02(r0)
            boolean r0 = r14.A0B
            if (r0 == 0) goto L3b
            X.Cvt r0 = new X.Cvt
            r0.<init>(r12, r6, r14, r4)
            r1.A07 = r12
            r1.A0C = r0
            r1.A0J = r5
            r0 = 1
            r1.A0W = r0
        L3b:
            X.2kD r0 = r11.A09
            boolean r0 = r0.A00()
            if (r0 == 0) goto L72
            java.util.List r0 = r2.A0I
            java.lang.String r9 = r2.A0G
            boolean r10 = r14.A0D
            X.1qM r7 = r2.A07
            r7.getClass()
            X.3Zb r8 = r14.A02
            X.Cvq r5 = new X.Cvq
            r5.<init>(r6, r7, r8, r9, r10)
            r1.A01(r12, r5, r0)
            X.3qh r2 = r2.A06
            X.3qh r0 = X.EnumC84933qh.A07
            if (r2 == r0) goto L67
            X.3qh r0 = X.EnumC84933qh.A06
            if (r2 == r0) goto L67
            boolean r0 = r14.A0N
            r2 = 0
            if (r0 == 0) goto L68
        L67:
            r2 = 1
        L68:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r0.booleanValue()
            r1.A0c = r0
        L72:
            java.lang.Integer r0 = r14.A07
            if (r0 == 0) goto Lc0
            int r4 = r0.intValue()
        L7a:
            java.lang.Integer r0 = r14.A05
            if (r0 == 0) goto Lb8
            int r3 = r0.intValue()
        L82:
            boolean r2 = r14.A0G
            r1.A0M = r2
            r0 = r4
            if (r2 == 0) goto L8a
            r0 = r3
        L8a:
            r1.A03 = r0
            boolean r0 = r14.A0E
            r1.A0L = r0
            if (r0 != 0) goto L93
            r3 = r4
        L93:
            r1.A01 = r3
            java.util.List r3 = r14.A09
            if (r3 == 0) goto Lc8
            int r2 = r3.size()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            r1.A0I = r0
            java.util.Iterator r3 = r3.iterator()
        La8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r2 = r3.next()
            java.util.HashSet r0 = r1.A0I
            r0.add(r2)
            goto La8
        Lb8:
            r0 = 2130971409(0x7f040b11, float:1.7551556E38)
            int r3 = X.AbstractC53242c7.A0F(r12, r0)
            goto L82
        Lc0:
            r0 = 2130970248(0x7f040688, float:1.75492E38)
            int r4 = X.AbstractC53242c7.A0F(r12, r0)
            goto L7a
        Lc8:
            r1.A04 = r4
            r0 = 2130971417(0x7f040b19, float:1.7551572E38)
            int r0 = X.AbstractC53242c7.A0F(r12, r0)
            r1.A02 = r0
            java.lang.String r0 = ""
            r1.A0F = r0
            android.text.SpannableStringBuilder r0 = r1.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57352kA.A00(android.content.Context, android.text.SpannableStringBuilder, X.3r7):android.text.SpannableStringBuilder");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01cc, code lost:
    
        if (X.C18U.A06(r6, r5, 36322315084245129L) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0398, code lost:
    
        if (r0.CdW() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03fe, code lost:
    
        if (X.C18U.A06(r8, r7, 36328710290489066L) != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0404, code lost:
    
        if (r0 != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x044e, code lost:
    
        if (X.C18U.A06(r8, r7, 36328710290423529L) != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0460, code lost:
    
        if (X.C18U.A06(r8, r7, 36328710290357992L) != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x043e, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x043c, code lost:
    
        if (r1 == 2810001) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0150, code lost:
    
        if (r0.booleanValue() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ab, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0368, code lost:
    
        if (r9 < 3) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableStringBuilder A03(android.content.Context r30, final X.C57352kA r31, X.C85163r7 r32, com.instagram.search.common.analytics.SearchContext r33, final boolean r34) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57352kA.A03(android.content.Context, X.2kA, X.3r7, com.instagram.search.common.analytics.SearchContext, boolean):android.text.SpannableStringBuilder");
    }

    private SpannableStringBuilder A04(Context context, final C85163r7 c85163r7, final SearchContext searchContext, String str, final boolean z) {
        final boolean z2;
        final int color;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        if (c85163r7.A03 == AnonymousClass341.A07) {
            z2 = C18U.A06(C06090Tz.A06, this.A08, 36321537698571863L);
        } else {
            z2 = c85163r7.A0F;
        }
        Integer num = c85163r7.A06;
        if (num != null) {
            color = num.intValue();
        } else {
            color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
        }
        spannableStringBuilder.setSpan(new AbstractC85543rj(color, z2) { // from class: X.3rk
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                HashMap hashMap;
                C57352kA c57352kA = C57352kA.this;
                C85163r7 c85163r72 = c85163r7;
                C84923qg c84923qg = c85163r72.A01;
                boolean A02 = c84923qg.A02();
                AnonymousClass341 anonymousClass341 = c85163r72.A03;
                boolean z3 = z;
                SearchContext searchContext2 = searchContext;
                C3AG c3ag = c85163r72.A04;
                C75113Zb c75113Zb = c85163r72.A02;
                if (c75113Zb != null && (hashMap = c75113Zb.A1d) != null) {
                    hashMap.put("tap_area", "ellipsis_area");
                } else {
                    hashMap = null;
                }
                C57352kA.A08(c84923qg, anonymousClass341, c57352kA, c3ag, searchContext2, hashMap, A02, z3);
            }
        }, 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static C57352kA A05(final UserSession userSession) {
        return (C57352kA) userSession.A01(C57352kA.class, new InterfaceC16820sZ() { // from class: X.2kB
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C57352kA(UserSession.this);
            }
        });
    }

    public static String A06(Context context, C85163r7 c85163r7) {
        int A0F;
        int A0F2;
        C84923qg c84923qg = c85163r7.A01;
        String str = c84923qg.A0G;
        Integer num = c85163r7.A05;
        if (num != null) {
            A0F = num.intValue();
        } else {
            A0F = AbstractC53242c7.A0F(context, R.attr.textColorBoldLink);
        }
        Integer valueOf = Integer.valueOf(A0F);
        Integer num2 = c85163r7.A07;
        if (num2 != null) {
            A0F2 = num2.intValue();
        } else {
            A0F2 = AbstractC53242c7.A0F(context, R.attr.igds_color_link);
        }
        String A06 = AbstractC13670mt.A06("%s%d%d%b%b%b%b%b%b", str, valueOf, Integer.valueOf(A0F2), false, false, Boolean.valueOf(c85163r7.A0K), Boolean.valueOf(c85163r7.A0C), false, Boolean.valueOf(c85163r7.A0M), false);
        if (num2 != null) {
            A06 = String.format("%s%d", A06, num2);
        }
        if (c84923qg.A0a == C05F.A01) {
            return String.format("%s%b%b", A06, Boolean.valueOf(c85163r7.A0L), Boolean.valueOf(c85163r7.A0J));
        }
        return A06;
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder, LruCache lruCache, String str) {
        if (C2UX.A01) {
            C2UX.A00().A8P(spannableStringBuilder, -1, false);
        }
        lruCache.put(str, spannableStringBuilder);
    }

    public static boolean A09(UserSession userSession, C38321qM c38321qM, C85163r7 c85163r7) {
        if (c85163r7.A01.A02() && c38321qM.CdW() && C3YV.A0A(c38321qM)) {
            AnonymousClass341 anonymousClass341 = c85163r7.A03;
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(anonymousClass341, 2);
            if ((anonymousClass341 == AnonymousClass341.A0H || anonymousClass341 == AnonymousClass341.A0A) && C3YV.A0A(c38321qM) && C3YV.A00(userSession, c38321qM) == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean A0B(C57352kA c57352kA, C85163r7 c85163r7) {
        C38321qM c38321qM;
        if (c85163r7.A03 == AnonymousClass341.A07 && (c38321qM = c85163r7.A01.A07) != null) {
            boolean CdW = c38321qM.CdW();
            UserSession userSession = c57352kA.A08;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (CdW) {
                if (C18U.A06(c06090Tz, userSession, 36321537698375253L)) {
                    return true;
                }
            } else if (C18U.A06(c06090Tz, userSession, 36321537698506326L)) {
                return true;
            }
        }
        return false;
    }

    public final String A0F(Context context, C85163r7 c85163r7, boolean z, boolean z2) {
        String string;
        if (!z2) {
            return " [...]";
        }
        if (!A0A(this, c85163r7)) {
            string = " …";
        } else {
            string = context.getString(2131954794);
        }
        if (!z) {
            return string;
        }
        return AnonymousClass001.A0R("\u200f", string);
    }

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        if (c1kj == C1KJ.A04 || c1kj == C1KJ.A09) {
            UserSession userSession = this.A08;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36330720335905777L)) {
                this.A04.evictAll();
                this.A06.evictAll();
                this.A02.evictAll();
                this.A05.evictAll();
                this.A03.evictAll();
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        UserSession userSession = this.A08;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36330720335971314L)) {
            this.A04.evictAll();
            this.A06.evictAll();
            this.A02.evictAll();
            this.A05.evictAll();
            this.A03.evictAll();
        }
    }

    public C57352kA(UserSession userSession) {
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        bidiFormatter.getClass();
        this.A01 = bidiFormatter;
        this.A00 = new C57372kC(this);
        this.A08 = userSession;
        this.A07 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(userSession, 0);
        this.A09 = new C57382kD(userSession);
        AbstractC25061Kk.A00().EDS(this);
    }

    public final SpannableString A0C(Context context, C85163r7 c85163r7, SearchContext searchContext) {
        Drawable drawable = context.getDrawable(R.drawable.instagram_link_pano_outline_24);
        drawable.setBounds(0, 0, 36, 36);
        drawable.setColorFilter(C3DY.A00(context.getColor(R.color.audio_bar_action_color_enabled)));
        SpannableString spannableString = new SpannableString("  ");
        spannableString.setSpan(new ImageSpan(drawable, 1), spannableString.length() - 1, spannableString.length(), 33);
        if (C18U.A06(C06090Tz.A06, this.A08, 36321537698244180L)) {
            spannableString.setSpan(new BYY(this, c85163r7, searchContext), spannableString.length() - 1, spannableString.length(), 33);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder A0D(android.content.Context r10, X.C85163r7 r11) {
        /*
            r9 = this;
            boolean r8 = X.AbstractC13620mo.A02(r10)
            java.lang.String r5 = A06(r10, r11)
            android.util.LruCache r4 = r9.A04
            java.lang.Object r6 = r4.get(r5)
            android.text.SpannableStringBuilder r6 = (android.text.SpannableStringBuilder) r6
            if (r6 != 0) goto La0
            boolean r0 = r11.A0L
            if (r0 == 0) goto Lcd
            com.instagram.common.session.UserSession r3 = r9.A08
            X.3qg r2 = r11.A01
            boolean r1 = r11.A0A
            java.lang.Integer r0 = r11.A05
            if (r0 == 0) goto Lc4
            int r0 = r0.intValue()
        L24:
            android.text.SpannableStringBuilder r6 = A01(r10, r3, r2, r0, r1)
        L28:
            boolean r0 = r11.A0J
            if (r0 == 0) goto L35
            X.3qg r0 = r11.A01
            android.text.SpannableStringBuilder r0 = A02(r10, r0)
            r6.append(r0)
        L35:
            X.3qg r7 = r11.A01
            X.1qM r1 = r7.A07
            if (r1 == 0) goto L69
            boolean r0 = r1.CdW()
            if (r0 == 0) goto L69
            boolean r0 = r11.A0K
            if (r0 != 0) goto L69
            com.instagram.common.session.UserSession r0 = r9.A08
            boolean r0 = A09(r0, r1, r11)
            if (r0 == 0) goto L69
            java.lang.String r0 = X.C3YV.A01(r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L66
            r0 = 2131961132(0x7f13252c, float:1.9558952E38)
            java.lang.String r0 = r10.getString(r0)
            r1.append(r0)
        L66:
            r6.append(r1)
        L69:
            boolean r0 = r11.A0K
            if (r0 == 0) goto La9
            java.lang.String r0 = r7.A0G
            android.util.LruCache r1 = r9.A05
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = r7.A0G
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
        L85:
            if (r2 == 0) goto L9d
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            if (r8 == 0) goto L93
            java.lang.String r0 = "\u200f"
            r1.append(r0)
        L93:
            r1.append(r2)
            boolean r0 = r11.A0M
            if (r0 == 0) goto La1
            r6.append(r1)
        L9d:
            A07(r6, r4, r5)
        La0:
            return r6
        La1:
            android.text.SpannableStringBuilder r0 = r9.A00(r10, r1, r11)
            r6.append(r0)
            goto L9d
        La9:
            com.instagram.common.session.UserSession r3 = r9.A08
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330423982244717(0x8112540000436d, double:3.0388446450222574E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lc1
            android.text.BidiFormatter r1 = r9.A01
            java.lang.String r0 = r7.A0e
            java.lang.String r2 = r1.unicodeWrap(r0)
            goto L85
        Lc1:
            java.lang.String r2 = r7.A0e
            goto L85
        Lc4:
            r0 = 2130971409(0x7f040b11, float:1.7551556E38)
            int r0 = X.AbstractC53242c7.A0F(r10, r0)
            goto L24
        Lcd:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57352kA.A0D(android.content.Context, X.3r7):android.text.SpannableStringBuilder");
    }

    public final SpannableStringBuilder A0E(Context context, C85163r7 c85163r7, SearchContext searchContext) {
        String A06 = A06(context, c85163r7);
        LruCache lruCache = this.A02;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) lruCache.get(A06);
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder(A0D(context, c85163r7));
            C84923qg c84923qg = c85163r7.A01;
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.setSpan(new C107814tQ(c84923qg, this), 0, spannableStringBuilder.length(), 33);
            }
            A07(spannableStringBuilder, lruCache, A06);
        }
        if (c85163r7.A0I) {
            spannableStringBuilder.append((CharSequence) A0C(context, c85163r7, searchContext));
        }
        return spannableStringBuilder;
    }
}
