package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LKc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47991LKc {
    public static final List A00 = AbstractC16960so.A1Q("❤️", "😍", "🔥", "😭", "😔", "🥺", "🙏", "😂");

    public static final String A00(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        String str = (String) AbstractC31171DnF.A0Y(A002, A002.A0w, C23031Ai.A8c, 158);
        if (i == 29) {
            if (str != null) {
                ImmutableList immutableList = C83863oV.A03;
                if (!str.equals("❤")) {
                    return str;
                }
            }
        } else if (str != null) {
            return str;
        }
        ImmutableList immutableList2 = C83863oV.A03;
        return "❤";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final void A03(ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        ?? r4;
        C14360o3.A0B(userSession, 1);
        String A04 = C18U.A04(AbstractC25225BEi.A0j(interfaceC11380iw, 3), userSession, 36886046723670720L);
        StringBuilder A1C = AbstractC166987dD.A1C();
        int length = A04.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = A04.charAt(i3);
            if (charAt != '\\' && charAt != 'U') {
                A1C.append(charAt);
            }
        }
        List A0m = AbstractC167007dF.A0m(AbstractC166987dD.A19(A1C), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
        try {
            r4 = AbstractC167007dF.A0i(A0m);
            Iterator it = A0m.iterator();
            while (it.hasNext()) {
                char[] chars = Character.toChars(AbstractC28418CgP.A00(AbstractC166987dD.A1B(it), C28209Cc7.A03));
                C14360o3.A07(chars);
                r4.add(new String(chars));
            }
        } catch (IllegalArgumentException unused) {
            r4 = A00;
        }
        if (!(r4 instanceof Collection) || !r4.isEmpty()) {
            Iterator it2 = r4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!AbstractC13670mt.A0D(AbstractC166987dD.A1B(it2))) {
                        r4 = A00;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        List A0d = AbstractC001800i.A0d(r4, 3);
        ArrayList<C148336m3> A0i = AbstractC167007dF.A0i(A0d);
        Iterator it3 = A0d.iterator();
        while (it3.hasNext()) {
            A0i.add(C168157fA.A01(AbstractC166987dD.A1B(it3)));
        }
        for (C148336m3 c148336m3 : A0i) {
            IgFrameLayout A002 = AbstractC168777gB.A00(viewGroup.getContext(), i, i);
            Object tag = A002.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.widget.emojigrid.EmojiGridRowItemViewBinder.Holder");
            AbstractC168777gB.A03(interfaceC11380iw, userSession, c148336m3, new C49649Lwg(0, viewGroup, interfaceC16620sF), (C168757g9) tag, 1.0f, true);
            ViewGroup.LayoutParams layoutParams = A002.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 16;
            layoutParams2.setMarginEnd(i2);
            viewGroup.addView(A002, viewGroup.getChildCount() - 1);
        }
    }

    public static final ArrayList A01() {
        ArrayList A1E = AbstractC166987dD.A1E();
        C1LC A0I = AbstractC43592JPx.A0I(C83863oV.A04);
        while (A0I.hasNext()) {
            A1E.add(((C83863oV) AbstractC166997dE.A0l(A0I)).A02);
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r2.length() == 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, com.google.common.collect.ImmutableList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A02(com.instagram.common.session.UserSession r7) {
        /*
            X.0Tz r2 = X.AbstractC166997dE.A0U(r7)
            r0 = 36328027390491696(0x81102600003c30, double:3.0373290307473465E-306)
            boolean r6 = X.C18U.A06(r2, r7, r0)
            java.lang.String r4 = "failed to parse reaction set"
            java.lang.String r3 = "DirectReactionSetUtil"
            X.1Ai r5 = X.AbstractC23021Ah.A00(r7)
            X.0ry r2 = r5.A0x
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.Object r2 = X.AbstractC31171DnF.A0Y(r5, r2, r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r6 == 0) goto Lb5
            r5 = 0
            if (r2 == 0) goto L2d
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L2e
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L62
            java.util.ArrayList r3 = A01()
        L34:
            X.KNH r0 = new X.KNH
            r0.<init>(r7)
            java.util.ArrayList r0 = r0.A02()
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r0.iterator()
        L45:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Aez r0 = (X.C23726Aez) r0
            X.6m3 r0 = r0.A04
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.A02
        L58:
            boolean r0 = X.AbstractC001800i.A0u(r3, r0)
            X.AbstractC25228BEl.A1Q(r1, r4, r0)
            goto L45
        L60:
            r0 = 0
            goto L58
        L62:
            X.16L r0 = X.C16V.A00(r2)     // Catch: java.io.IOException -> L78
            X.Kws r0 = X.AbstractC46901Koi.parseFromJson(r0)     // Catch: java.io.IOException -> L78
            X.C14360o3.A07(r0)     // Catch: java.io.IOException -> L78
            java.util.List r0 = r0.A00     // Catch: java.io.IOException -> L78
            com.google.common.collect.ImmutableList r0 = X.AbstractC31173DnH.A0L(r0)     // Catch: java.io.IOException -> L78
            java.util.ArrayList r3 = X.AbstractC166987dD.A1F(r0)     // Catch: java.io.IOException -> L78
            goto L34
        L78:
            r0 = move-exception
            X.C0w9.A06(r3, r4, r0)
            java.util.ArrayList r3 = A01()
            goto L34
        L81:
            r0 = 5
            java.util.List r1 = X.AbstractC001800i.A0d(r4, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lce
            java.util.Iterator r2 = r1.iterator()
        L90:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lce
            java.lang.Object r0 = r2.next()
            int r1 = r5 + 1
            if (r5 >= 0) goto La6
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        La6:
            X.Aez r0 = (X.C23726Aez) r0
            X.6m3 r0 = r0.A04
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r0.A02
            if (r0 == 0) goto Lb3
            r3.add(r1, r0)
        Lb3:
            r5 = r1
            goto L90
        Lb5:
            if (r2 == 0) goto Lca
            X.16L r0 = X.C16V.A00(r2)     // Catch: java.io.IOException -> Lc6
            X.Kws r0 = X.AbstractC46901Koi.parseFromJson(r0)     // Catch: java.io.IOException -> Lc6
            java.util.List r0 = r0.A00     // Catch: java.io.IOException -> Lc6
            com.google.common.collect.ImmutableList r3 = X.AbstractC31173DnH.A0L(r0)     // Catch: java.io.IOException -> Lc6
            return r3
        Lc6:
            r0 = move-exception
            X.C0w9.A06(r3, r4, r0)
        Lca:
            java.util.ArrayList r3 = A01()
        Lce:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47991LKc.A02(com.instagram.common.session.UserSession):java.util.List");
    }
}
