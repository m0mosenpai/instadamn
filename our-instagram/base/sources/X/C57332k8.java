package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.LruCache;
import android.util.Pair;
import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.2k8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57332k8 implements InterfaceC13050lr, InterfaceC220315d {
    public static final C57342k9 A0m = new Object();
    public Drawable A00;
    public final UserSession A0J;
    public final HandlerC57442kJ A0K;
    public final C57462kL A0L;
    public final C25671My A0f;
    public final InterfaceC41501vz A0g;
    public final InterfaceC41501vz A0h;
    public final InterfaceC41501vz A0i;
    public final C57352kA A0j;
    public final C57472kM A0k;
    public final LruCache A0X = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0Q = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0P = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0F = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0I = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0Y = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0R = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0B = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A03 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0A = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0D = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0Z = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0c = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0d = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A05 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0H = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A04 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A09 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0T = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A06 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A07 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A08 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final Map A0M = new WeakHashMap();
    public final LruCache A0N = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0V = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final C57392kE A0l = new C57392kE();
    public final LruCache A0b = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0S = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0a = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0e = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0C = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A02 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0W = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0O = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A01 = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0U = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0E = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    public final LruCache A0G = new LruCache(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);

    public static final Drawable A02(Context context, C57332k8 c57332k8, String str, String str2, List list) {
        return A01(context, c57332k8, null, str, str2, list, 0.6f, context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin));
    }

    public final Drawable A06(Context context, C38321qM c38321qM, String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(str, 2);
        ArrayList arrayList = new ArrayList();
        User A2D = c38321qM.A2D();
        if (A2D != null) {
            arrayList.add(A2D);
        }
        User A2E = c38321qM.A2E(this.A0J);
        if (A2E != null) {
            arrayList.add(A2E);
        }
        return A02(context, this, c38321qM.BqK(), str, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:
    
        if (r0 == 2) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable A07(android.content.Context r9, X.C38321qM r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57332k8.A07(android.content.Context, X.1qM, java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Drawable A08(Context context, C38321qM c38321qM, String str) {
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(str, 2);
        User BAR = c38321qM.A0C.BAR();
        User A2E = c38321qM.A2E(this.A0J);
        String BqK = c38321qM.BqK();
        ArrayList arrayList = new ArrayList();
        if (BAR != null) {
            arrayList.add(BAR);
        }
        if (A2E != null) {
            arrayList.add(A2E);
        }
        return A01(context, this, Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)), BqK, str, arrayList, 0.5f, context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin));
    }

    public final Drawable A09(Context context, C38321qM c38321qM, String str) {
        InterfaceC87503vI interfaceC87503vI;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(str, 2);
        List ByK = c38321qM.A0C.ByK();
        if (ByK != null && (interfaceC87503vI = (InterfaceC87503vI) AbstractC001800i.A0J(ByK)) != null) {
            List ByM = interfaceC87503vI.ByM();
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(ByM, 10));
            Iterator it = ByM.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC101524hN.A00((User) it.next()));
            }
            return A00(context, interfaceC87503vI.ByT(), c38321qM, this, str, arrayList);
        }
        return null;
    }

    public final Drawable A0A(Context context, C38321qM c38321qM, String str) {
        List A05;
        LruCache lruCache;
        LruCache lruCache2;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(str, 2);
        C3HM c3hm = C3HM.A00;
        UserSession userSession = this.A0J;
        boolean A06 = c3hm.A06(userSession, str);
        ArrayList arrayList = new ArrayList();
        C77403dQ c77403dQ = C77403dQ.A00;
        if (A06) {
            A05 = c77403dQ.A07(c38321qM);
        } else {
            A05 = c77403dQ.A05(userSession, c38321qM);
        }
        if (A05 != null) {
            arrayList.addAll(A05);
        }
        String BqK = c38321qM.BqK();
        if (A06) {
            lruCache = this.A0S;
        } else {
            lruCache = this.A0b;
        }
        Drawable drawable = (Drawable) lruCache.get(BqK);
        if (drawable == null) {
            drawable = AbstractC89513yr.A00(context, null, null, C05F.A00, null, null, null, null, str, arrayList, context.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin), true, !this.A0L.A05(c38321qM), true, true, false);
            if (A06) {
                lruCache2 = this.A0S;
            } else {
                lruCache2 = this.A0b;
            }
            lruCache2.put(BqK, drawable);
        }
        return drawable;
    }

    public final Layout A0C(Context context, C84923qg c84923qg, int i) {
        SpannableStringBuilder A01;
        LruCache lruCache = this.A0V;
        Layout layout = (Layout) lruCache.get(AbstractC13670mt.A06("%s_%s", c84923qg.A0E, c84923qg.A0G));
        if (layout == null) {
            C57352kA c57352kA = this.A0j;
            if (c84923qg.A0p) {
                A01 = new SpannableStringBuilder();
            } else {
                A01 = C57352kA.A01(context, c57352kA.A08, c84923qg, i, false);
            }
            String str = c84923qg.A0e;
            if (str != null) {
                UserSession userSession = c57352kA.A08;
                C85383rT c85383rT = new C85383rT(new SpannableStringBuilder(str), userSession);
                C38321qM c38321qM = c84923qg.A07;
                c38321qM.getClass();
                C38321qM A1g = c38321qM.A1g(userSession);
                boolean A02 = c84923qg.A02();
                c85383rT.A02(new C85413rW(userSession, A1g, A02));
                C38321qM c38321qM2 = c84923qg.A07;
                c38321qM2.getClass();
                c85383rT.A03(new C85393rU(userSession, c38321qM2.A1g(userSession), A02));
                A01.append((CharSequence) c85383rT.A00());
            }
            if (A01.length() > 0) {
                A01.setSpan(new C107814tQ(c84923qg, c57352kA), 0, A01.length(), 33);
            }
            C57482kN c57482kN = this.A0k.A00;
            C14360o3.A07(c57482kN);
            StaticLayout staticLayout = new StaticLayout(A01, c57482kN.A04, c57482kN.A00, Layout.Alignment.ALIGN_NORMAL, c57482kN.A02, c57482kN.A01, c57482kN.A06);
            lruCache.put(AbstractC13670mt.A06("%s_%s", c84923qg.A0E, c84923qg.A0G), staticLayout);
            return staticLayout;
        }
        return layout;
    }

    public final Layout A0D(Context context, C84923qg c84923qg, AnonymousClass341 anonymousClass341, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Layout layout;
        C57482kN c57482kN;
        C14360o3.A0B(c84923qg, 1);
        LruCache lruCache = this.A0l.A00;
        Map map = (Map) lruCache.get(AbstractC13670mt.A06("%s_%s", c84923qg.A0E, c84923qg.A0G));
        if (map == null) {
            layout = null;
        } else {
            layout = (Layout) map.get(AbstractC13670mt.A06("%d%b%b%b%s%b", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), anonymousClass341.name(), Boolean.valueOf(z4)));
        }
        if (AbstractC52812bN.A00) {
            lruCache.evictAll();
        }
        if (layout == null) {
            C57472kM c57472kM = this.A0k;
            if (z) {
                if (z2) {
                    c57482kN = c57472kM.A02;
                } else {
                    c57482kN = c57472kM.A01;
                }
            } else if (z2) {
                c57482kN = c57472kM.A03;
            } else {
                c57482kN = c57472kM.A00;
            }
            layout = AbstractC85153r6.A01(context, this.A0J, c57482kN, c84923qg, anonymousClass341, null, null, null, i, z3, z4);
            Map map2 = (Map) lruCache.get(AbstractC13670mt.A06("%s_%s", c84923qg.A0E, c84923qg.A0G));
            if (map2 == null) {
                map2 = new HashMap();
                lruCache.put(AbstractC13670mt.A06("%s_%s", c84923qg.A0E, c84923qg.A0G), map2);
            }
            map2.put(AbstractC13670mt.A06("%d%b%b%b%s%b", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), anonymousClass341.name(), Boolean.valueOf(z4)), layout);
        }
        return layout;
    }

    public final CharSequence A0F(Context context, C38321qM c38321qM, String str) {
        boolean z;
        LruCache lruCache;
        List A06;
        CharSequence charSequence;
        LruCache lruCache2;
        C14360o3.A0B(c38321qM, 1);
        if (str != null && C3HM.A00.A06(this.A0J, str)) {
            z = true;
            lruCache = this.A0Q;
        } else {
            z = false;
            lruCache = this.A0X;
        }
        CharSequence charSequence2 = (CharSequence) lruCache.get(c38321qM);
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            UserSession userSession = this.A0J;
            boolean A00 = C77153d1.A00(userSession, c38321qM);
            C14360o3.A0B(userSession, 1);
            String str2 = "";
            if (c38321qM.A0w() == 0) {
                C0w9.A03("MediaLikersTextRenderer", AnonymousClass001.A0R("generateLikersText() called with 0 likes, media id ", c38321qM.getId()));
                charSequence = str2;
            } else {
                C77403dQ c77403dQ = C77403dQ.A00;
                if (z) {
                    A06 = c77403dQ.A08(c38321qM);
                } else {
                    A06 = c77403dQ.A06(userSession, c38321qM);
                }
                if (A00) {
                    if (!c38321qM.CdW() && (!A06.isEmpty())) {
                        charSequence = C101514hM.A01(context, userSession, c38321qM, A06);
                    } else {
                        charSequence = new SpannableStringBuilder(Html.fromHtml(context.getResources().getString(2131976854)));
                    }
                } else if (!A06.isEmpty()) {
                    charSequence = C101514hM.A02(context, userSession, c38321qM, A06, 3, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Resources resources = context.getResources();
                    C14360o3.A07(resources);
                    spannableStringBuilder.append((CharSequence) AbstractC74053Tw.A00(resources, c38321qM.A0w()));
                    spannableStringBuilder.setSpan(new CharacterStyle(), 0, spannableStringBuilder.length(), 33);
                    charSequence = spannableStringBuilder;
                }
            }
            if (z) {
                lruCache2 = this.A0Q;
            } else {
                lruCache2 = this.A0X;
            }
            lruCache2.put(c38321qM, charSequence);
            charSequence3 = charSequence;
        }
        return charSequence3;
    }

    public final CharSequence A0G(Context context, C38321qM c38321qM, String str) {
        boolean z;
        LruCache lruCache;
        List A06;
        LruCache lruCache2;
        C14360o3.A0B(c38321qM, 1);
        if (str != null && C3HM.A00.A06(this.A0J, str)) {
            z = true;
            lruCache = this.A0R;
        } else {
            z = false;
            lruCache = this.A0Y;
        }
        CharSequence charSequence = (CharSequence) lruCache.get(c38321qM);
        if (charSequence == null) {
            UserSession userSession = this.A0J;
            C14360o3.A0B(userSession, 1);
            charSequence = "";
            if (c38321qM.A0w() == 0) {
                C18950wb.A01.AEp(AnonymousClass001.A0R("generateLikersTextWithSocialContextAndWithoutCount() called with 0 likes, media id ", c38321qM.getId()), 817899586);
            } else {
                boolean A00 = C77153d1.A00(userSession, c38321qM);
                C77403dQ c77403dQ = C77403dQ.A00;
                if (z) {
                    A06 = c77403dQ.A08(c38321qM);
                } else {
                    A06 = c77403dQ.A06(userSession, c38321qM);
                }
                if (!A06.isEmpty()) {
                    charSequence = C101514hM.A01(context, userSession, c38321qM, A06);
                } else {
                    if (A00) {
                        charSequence = new SpannableStringBuilder().append((CharSequence) Html.fromHtml(context.getResources().getString(2131976854)));
                        C14360o3.A07(charSequence);
                    }
                    charSequence = charSequence;
                }
            }
            if (z) {
                lruCache2 = this.A0R;
            } else {
                lruCache2 = this.A0Y;
            }
            lruCache2.put(c38321qM, charSequence);
        }
        return charSequence;
    }

    public final CharSequence A0H(Context context, final C38321qM c38321qM, String str) {
        boolean z;
        LruCache lruCache;
        int i;
        List A06;
        LruCache lruCache2;
        C14360o3.A0B(c38321qM, 1);
        if (str != null && C3HM.A00.A06(this.A0J, str)) {
            z = true;
            lruCache = this.A0d;
        } else {
            z = false;
            lruCache = this.A0c;
        }
        CharSequence charSequence = (CharSequence) lruCache.get(c38321qM);
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            final UserSession userSession = this.A0J;
            C14360o3.A0B(userSession, 1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Resources resources = context.getResources();
            C14360o3.A07(resources);
            Integer CFm = c38321qM.A0C.CFm();
            if (CFm != null) {
                i = CFm.intValue();
            } else {
                i = 0;
            }
            spannableStringBuilder.append((CharSequence) AbstractC74053Tw.A03(resources, Integer.valueOf(i), 2131976904));
            spannableStringBuilder.setSpan(new AbstractC85543rj() { // from class: X.5SI
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("sans-serif-medium", -1, false);
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    AbstractC25651Mw.A00(UserSession.this).E4s(new C72363Mj(c38321qM));
                }
            }, 0, spannableStringBuilder.length(), 33);
            C77403dQ c77403dQ = C77403dQ.A00;
            if (z) {
                A06 = c77403dQ.A08(c38321qM);
            } else {
                A06 = c77403dQ.A06(userSession, c38321qM);
            }
            if (!A06.isEmpty()) {
                spannableStringBuilder.append((CharSequence) context.getResources().getString(2131961132));
                spannableStringBuilder.append((CharSequence) C101514hM.A02(context, userSession, c38321qM, A06, 2, false));
            }
            if (z) {
                lruCache2 = this.A0d;
            } else {
                lruCache2 = this.A0c;
            }
            lruCache2.put(c38321qM, spannableStringBuilder);
            charSequence2 = spannableStringBuilder;
        }
        return charSequence2;
    }

    public final void A0L(C38321qM c38321qM) {
        this.A0X.remove(c38321qM);
        this.A0Q.remove(c38321qM);
        this.A0F.remove(c38321qM);
        this.A0Y.remove(c38321qM);
        this.A0R.remove(c38321qM);
        this.A0B.remove(c38321qM);
        this.A03.remove(c38321qM);
        this.A0A.remove(c38321qM);
        this.A0c.remove(c38321qM);
        this.A0d.remove(c38321qM);
        this.A05.remove(c38321qM);
        this.A04.remove(c38321qM);
        this.A0D.remove(c38321qM);
        this.A0P.remove(c38321qM);
        this.A0b.remove(c38321qM.BqK());
        this.A0S.remove(c38321qM.BqK());
        this.A0a.remove(c38321qM.BqK());
        this.A02.remove(c38321qM.BqK());
        this.A0W.remove(c38321qM.BqK());
        this.A09.remove(c38321qM);
        this.A0T.remove(c38321qM);
        this.A06.remove(c38321qM);
        this.A07.remove(c38321qM);
        this.A0U.remove(c38321qM.BqK());
        this.A0E.remove(c38321qM.BqK());
        this.A0G.remove(c38321qM.BqK());
        this.A0O.remove(c38321qM.BqK());
        for (C84923qg c84923qg : c38321qM.A1Z().A00) {
            C57392kE c57392kE = this.A0l;
            C14360o3.A0B(c84923qg, 0);
            Map map = (Map) c57392kE.A00.get(AbstractC13670mt.A06("%s_%s", c84923qg.A0E, c84923qg.A0G));
            if (map != null) {
                map.clear();
            }
        }
    }

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        C14360o3.A0B(c1kj, 0);
        if (c1kj == C1KJ.A04 || c1kj == C1KJ.A09) {
            UserSession userSession = this.A0J;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36327812644027280L)) {
                A05();
            }
        }
    }

    public static final Drawable A01(Context context, C57332k8 c57332k8, Integer num, String str, String str2, List list, float f, int i) {
        LruCache lruCache = c57332k8.A0U;
        Drawable drawable = (Drawable) lruCache.get(str);
        if (drawable == null) {
            Drawable A00 = AbstractC89513yr.A00(context, null, Float.valueOf(f), C05F.A0C, null, null, num, null, str2, list, i, false, true, false, true, false);
            lruCache.put(str, A00);
            return A00;
        }
        return drawable;
    }

    public static final C89553yv A03(Context context, Drawable drawable, Integer num, String str, List list) {
        C14360o3.A0B(list, 1);
        C14360o3.A0B(str, 2);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).Bhu());
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        return AbstractC89513yr.A03(context, drawable, Float.valueOf(0.6f), C05F.A01, null, null, Integer.valueOf(context.getColor(R.color.fds_transparent)), null, Integer.valueOf(context.getColor(R.color.clips_spins_attribution_pill_background_color)), null, num, str, arrayList, dimensionPixelSize, false, false, false, true, false);
    }

    public static final synchronized C57332k8 A04(Context context, UserSession userSession) {
        C57332k8 A00;
        synchronized (C57332k8.class) {
            A00 = A0m.A00(context, userSession);
        }
        return A00;
    }

    private final void A05() {
        this.A0X.evictAll();
        this.A0Q.evictAll();
        this.A0F.evictAll();
        this.A0Y.evictAll();
        this.A0R.evictAll();
        this.A0B.evictAll();
        this.A03.evictAll();
        this.A0A.evictAll();
        this.A0c.evictAll();
        this.A0d.evictAll();
        this.A05.evictAll();
        this.A0H.evictAll();
        this.A04.evictAll();
        this.A0M.clear();
        this.A0N.evictAll();
        this.A0Z.evictAll();
        this.A0D.evictAll();
        this.A0P.evictAll();
        this.A0V.evictAll();
        this.A0l.A00.evictAll();
        this.A0b.evictAll();
        this.A0S.evictAll();
        this.A0a.evictAll();
        this.A02.evictAll();
        this.A0W.evictAll();
        this.A0U.evictAll();
        this.A0E.evictAll();
        this.A09.evictAll();
        this.A0T.evictAll();
        this.A06.evictAll();
        this.A07.evictAll();
        this.A0G.evictAll();
        this.A0O.evictAll();
    }

    public final Drawable A0B(Context context, C38321qM c38321qM, String str, List list) {
        C14360o3.A0B(str, 3);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        String BqK = c38321qM.BqK();
        LruCache lruCache = this.A0W;
        Drawable drawable = (Drawable) lruCache.get(BqK);
        if (drawable == null) {
            Drawable A00 = AbstractC89513yr.A00(context, null, null, C05F.A00, null, null, null, null, str, arrayList, context.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin), true, false, true, true, false);
            lruCache.put(BqK, A00);
            return A00;
        }
        return drawable;
    }

    public final CharSequence A0E(Context context, C38321qM c38321qM) {
        LruCache lruCache = this.A0P;
        CharSequence charSequence = (CharSequence) lruCache.get(c38321qM);
        if (charSequence == null) {
            InterfaceC87503vI A1M = c38321qM.A1M();
            if (A1M == null) {
                return "";
            }
            SpannableStringBuilder A00 = C101514hM.A00(context, A1M, this.A0J, c38321qM);
            lruCache.put(c38321qM, A00);
            return A00;
        }
        return charSequence;
    }

    public final CharSequence A0J(C38321qM c38321qM, C66 c66) {
        InterfaceC107114sH B7j;
        String Aya;
        LruCache lruCache = this.A0Z;
        CharSequence charSequence = (CharSequence) lruCache.get(new Pair(c38321qM, c66));
        if (charSequence == null) {
            int ordinal = c66.ordinal();
            String str = "";
            InterfaceC87803vo BUx = c38321qM.A0C.BUx();
            if (ordinal != 0) {
                if (BUx != null) {
                    B7j = BUx.AtW();
                    if (B7j != null && (Aya = B7j.Aya()) != null) {
                        str = Aya;
                    }
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                lruCache.put(new Pair(c38321qM, c66), spannableStringBuilder);
                return spannableStringBuilder;
            }
            if (BUx != null) {
                B7j = BUx.B7j();
                if (B7j != null) {
                    str = Aya;
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            lruCache.put(new Pair(c38321qM, c66), spannableStringBuilder2);
            return spannableStringBuilder2;
        }
        return charSequence;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A0f.A02(this.A0i, C57452kK.class);
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A0h, C57432kI.class);
        c41451vu.A03(this.A0g, C2W4.class);
        AbstractC25061Kk.A00().A09(this);
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [X.2kM, java.lang.Object] */
    public C57332k8(Context context, UserSession userSession, C57352kA c57352kA) {
        C57472kM c57472kM;
        this.A0j = c57352kA;
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.2kF
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1447412913);
                C57452kK c57452kK = (C57452kK) obj;
                int A032 = C0f9.A03(-692303323);
                C14360o3.A0B(c57452kK, 0);
                C57332k8.this.A0L(c57452kK.A00);
                C0f9.A0A(1845291875, A032);
                C0f9.A0A(-716716264, A03);
            }
        };
        this.A0i = interfaceC41501vz;
        InterfaceC41501vz interfaceC41501vz2 = new InterfaceC41501vz() { // from class: X.2kG
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(822716757);
                C57432kI c57432kI = (C57432kI) obj;
                int A032 = C0f9.A03(-1251539086);
                C14360o3.A0B(c57432kI, 0);
                C57332k8 c57332k8 = C57332k8.this;
                Context context2 = c57432kI.A00;
                C14360o3.A07(context2);
                c57332k8.A0K(context2);
                C0f9.A0A(-1855965369, A032);
                C0f9.A0A(708336248, A03);
            }
        };
        this.A0h = interfaceC41501vz2;
        InterfaceC41501vz interfaceC41501vz3 = new InterfaceC41501vz() { // from class: X.2kH
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1611310765);
                C2W4 c2w4 = (C2W4) obj;
                int A032 = C0f9.A03(1427316874);
                C14360o3.A0B(c2w4, 0);
                C57332k8.this.A0K(c2w4.A00);
                C0f9.A0A(-131326326, A032);
                C0f9.A0A(-111979567, A03);
            }
        };
        this.A0g = interfaceC41501vz3;
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A02(interfaceC41501vz2, C57432kI.class);
        c41451vu.A02(interfaceC41501vz3, C2W4.class);
        this.A0K = new HandlerC57442kJ(C1CG.A00(), this);
        this.A0J = userSession;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        this.A0f = A00;
        A00.A01(interfaceC41501vz, C57452kK.class);
        this.A0L = new C57462kL(userSession);
        synchronized (C57472kM.class) {
            C57472kM c57472kM2 = C57472kM.A04;
            c57472kM = c57472kM2;
            if (c57472kM2 == null) {
                ?? obj = new Object();
                C57472kM.A01(context, obj);
                C57472kM.A04 = obj;
                c57472kM = obj;
            }
        }
        this.A0k = c57472kM;
        AbstractC25061Kk.A00().EDS(this);
    }

    public static final Drawable A00(Context context, SocialContextType socialContextType, C38321qM c38321qM, C57332k8 c57332k8, String str, List list) {
        LruCache lruCache;
        int ordinal = socialContextType.ordinal();
        if (ordinal != 7) {
            if (ordinal != 1) {
                if (ordinal == 20) {
                    lruCache = c57332k8.A0e;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unsupported social context type ");
                    sb.append(socialContextType);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                lruCache = c57332k8.A0O;
            }
        } else {
            lruCache = c57332k8.A0a;
        }
        ArrayList arrayList = new ArrayList(list);
        String BqK = c38321qM.BqK();
        Drawable drawable = (Drawable) lruCache.get(BqK);
        if (drawable == null) {
            Drawable A00 = AbstractC89513yr.A00(context, null, null, C05F.A00, null, null, null, null, str, arrayList, context.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin), true, !c57332k8.A0L.A05(c38321qM), true, true, false);
            lruCache.put(BqK, A00);
            return A00;
        }
        return drawable;
    }

    public final CharSequence A0I(Context context, String str) {
        String A0O = AnonymousClass001.A0O(str, R.color.red_4);
        LruCache lruCache = this.A0N;
        CharSequence charSequence = (CharSequence) lruCache.get(A0O);
        if (charSequence == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.red_4)), 0, spannableStringBuilder.length(), 18);
            lruCache.put(A0O, spannableStringBuilder);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public final void A0K(Context context) {
        A05();
        C57472kM.A01(context, this.A0k);
    }
}
