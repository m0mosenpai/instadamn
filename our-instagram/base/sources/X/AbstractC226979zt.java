package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226979zt {
    public static final C195868lW A00(C115475Kh c115475Kh) {
        long currentTimeMillis = System.currentTimeMillis();
        C115525Km c115525Km = c115475Kh.A0G;
        int i = c115525Km.A07;
        C195868lW c195868lW = new C195868lW(AbstractC166987dD.A11(c115525Km.A0F), null, c115525Km.A0D, 1080, 1920, i, currentTimeMillis, currentTimeMillis, false, AbstractC167007dF.A1M(c115525Km.A08), true);
        c195868lW.A19 = true;
        c195868lW.A0v = AbstractC166987dD.A1J(AHY.A00(c115475Kh, null, 0));
        ImmutableList of = ImmutableList.of((Object) AbstractC115515Kl.A03(C115475Kh.A00(null, null, c115475Kh, null, 0.0f, 0, c115475Kh.A0G.A04, 0, 0, 2147483623)));
        C14360o3.A07(of);
        ImmutableList of2 = ImmutableList.of();
        C14360o3.A07(of2);
        C16930sl c16930sl = C16930sl.A00;
        ImmutableList of3 = ImmutableList.of();
        AbstractC167017dG.A1T(c16930sl, of3);
        B9U b9u = B9U.A00;
        C14360o3.A0B(b9u, 2);
        c195868lW.A0O = new MediaComposition(AbstractC23120AKe.A00(null, null, of2, of, of3, null, c16930sl, c16930sl, b9u, 1.0f, 0.5625f, 0, true, false));
        return c195868lW;
    }
}
