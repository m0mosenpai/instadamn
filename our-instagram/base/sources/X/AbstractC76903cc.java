package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.api.schemas.PollType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76903cc {
    public static final InterfaceC101404gy A00(C38321qM c38321qM) {
        InterfaceC101404gy interfaceC101404gy;
        PollType pollType;
        C84823qW c84823qW;
        if (c38321qM == null) {
            return null;
        }
        AnonymousClass520 Ald = c38321qM.A0C.Ald();
        if (Ald != null) {
            interfaceC101404gy = Ald.BeJ();
        } else {
            interfaceC101404gy = null;
        }
        List A3w = c38321qM.A3w(EnumC75383a5.A0x);
        if (interfaceC101404gy == null) {
            if (A3w == null || A3w.isEmpty()) {
                return null;
            }
            C101394gx A0D = ((C84823qW) A3w.get(0)).A0D();
            if (A0D != null) {
                pollType = A0D.A00;
            } else {
                pollType = null;
            }
            if (pollType != PollType.A04 || (c84823qW = (C84823qW) A3w.get(0)) == null) {
                return null;
            }
            return c84823qW.A0D();
        }
        return interfaceC101404gy;
    }

    public static final CharSequence A01(Context context, UserSession userSession, InterfaceC101404gy interfaceC101404gy, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        int i;
        Integer num;
        int i2;
        List ByM;
        if (interfaceC101404gy != null) {
            float f = 0.0f;
            for (int i3 = 0; i3 < AbstractC140306Wi.A03(userSession, interfaceC101404gy, true).length; i3++) {
                f += r5[i3];
            }
            i = (int) f;
            InterfaceC87503vI ByI = interfaceC101404gy.ByI();
            if (ByI != null && (ByM = ByI.ByM()) != null) {
                Integer A00 = AbstractC25549BRl.A00(userSession).A00(interfaceC101404gy);
                boolean z3 = false;
                if (A00 != null) {
                    z3 = true;
                }
                C101514hM c101514hM = C101514hM.A00;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(ByM, 10));
                Iterator it = ByM.iterator();
                while (it.hasNext()) {
                    arrayList.add(((User) it.next()).getUsername());
                }
                SpannableStringBuilder A04 = c101514hM.A04(context, userSession, Integer.valueOf(i), arrayList, interfaceC16820sZ, interfaceC16660sJ, true, z2, z3);
                if (A04.length() != 0) {
                    return A04;
                }
            }
            num = AbstractC25549BRl.A00(userSession).A00(interfaceC101404gy);
        } else {
            i = 0;
            num = null;
        }
        if (z) {
            i2 = R.plurals.voters_count;
        } else {
            i2 = R.plurals.voter_count_on_surfaces_voted_viewer;
            if (num == null) {
                i2 = R.plurals.voter_count_on_surfaces;
            }
        }
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        return A02(resources, i2, i);
    }

    public static final void A03(C1P1 c1p1, UserSession userSession, C1GL c1gl, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B(AbstractC13670mt.A06("media/%s/%s/async_delete_poll/", str, str2));
        c25621Ms.A0R(C32125E9y.class, FS6.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        c1gl.schedule(A0N);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(com.instagram.common.session.UserSession r3, X.C38321qM r4) {
        /*
            r2 = 1
            X.C14360o3.A0B(r3, r2)
            X.4gy r0 = A00(r4)
            r1 = 1
            if (r0 == 0) goto L25
            if (r4 == 0) goto L20
            boolean r0 = r4.A5j()
            if (r0 == r2) goto L1f
            boolean r0 = r4.A5P()
            if (r0 != r2) goto L20
            boolean r0 = X.AbstractC50595MVg.A00(r3)
        L1d:
            if (r0 == 0) goto L25
        L1f:
            return r1
        L20:
            boolean r0 = X.AbstractC50595MVg.A01(r3)
            goto L1d
        L25:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC76903cc.A04(com.instagram.common.session.UserSession, X.1qM):boolean");
    }

    public static final String A02(Resources resources, int i, int i2) {
        String A04 = C84963qk.A04(resources, Integer.valueOf(i2), 10000, true, false);
        try {
            if (i2 == 0) {
                return resources.getString(2131976939);
            }
            return resources.getQuantityString(i, i2, A04);
        } catch (Resources.NotFoundException unused) {
            C18950wb.A01.AEp("Resource.NotFoundException when getting R.plurals.voter_count_on_surfaces", 817896325).report();
            return "";
        }
    }
}
