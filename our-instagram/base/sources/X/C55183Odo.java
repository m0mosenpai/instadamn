package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Odo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55183Odo {
    public static final C55183Odo A00 = new Object();

    public static final SpannableStringBuilder A01(AbstractC59962oe abstractC59962oe, UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(str, 2);
        String A0v = AbstractC25227BEk.A0v(abstractC59962oe, 2131965064);
        SpannableStringBuilder A09 = AbstractC31178DnM.A09(str2, A0v);
        C14360o3.A07(A09);
        AnonymousClass773.A03(A09, new C52785NXu(abstractC59962oe, userSession, str3, str, AbstractC31179DnN.A01(abstractC59962oe)), A0v);
        return A09;
    }

    public static final MediaComposition A03(Context context, UserSession userSession, C47Z c47z, boolean z) {
        boolean z2 = true;
        if (!c47z.A61) {
            z2 = false;
        }
        if (!z2 && !z) {
            return c47z.A0r;
        }
        C115595Kt c115595Kt = c47z.A1P;
        if (c115595Kt == null) {
            return null;
        }
        C1126256q A002 = AbstractC23119AKd.A00(context, userSession, c115595Kt, C2Ps.A00(context, userSession), true, true, C18U.A06(C06090Tz.A05, userSession, 36327469044939356L));
        if (z) {
            A002.A03(EnumC1125356h.VIDEO, new C55779Opo(c47z, false));
        }
        return new MediaComposition(A002);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return X.MYO.GALLERY;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.MYO A02(X.C47Z r3) {
        /*
            if (r3 == 0) goto L23
            java.util.List r0 = r3.A4J
            if (r0 == 0) goto L23
            java.util.Iterator r3 = r0.iterator()
        La:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5JD r0 = (X.C5JD) r0
            java.lang.String r1 = r0.A0H
            java.lang.String r0 = "camera"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto La
            if (r2 == 0) goto L26
        L23:
            X.MYO r0 = X.MYO.CAPTURE
            return r0
        L26:
            X.MYO r0 = X.MYO.GALLERY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55183Odo.A02(X.47Z):X.MYO");
    }

    public static final int A00(AnonymousClass841 anonymousClass841, boolean z) {
        int i = 0;
        if (!anonymousClass841.CPp()) {
            return 1;
        }
        List CpK = anonymousClass841.CpK();
        if ((CpK instanceof Collection) && CpK.isEmpty()) {
            return 0;
        }
        Iterator it = CpK.iterator();
        while (it.hasNext()) {
            MediaSession A0R = MSW.A0R(it);
            if (!z || A0R.Btq() == C05F.A00) {
                i++;
                if (i < 0) {
                    AbstractC16960so.A1T();
                    throw C00O.createAndThrow();
                }
            }
        }
        return i;
    }
}
