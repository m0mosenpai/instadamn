package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class F8D {
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.Vn6, java.lang.Boolean, X.4lE, java.lang.String, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static final void A00(Context context, C26069Bfx c26069Bfx, UserSession userSession) {
        ?? r5;
        C16920sk c16920sk;
        Map A0B;
        long j;
        int i;
        String str;
        String str2 = c26069Bfx.A01;
        LinkedHashMap A0u = AbstractC167017dG.A0u("surface", c26069Bfx.A03, AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c26069Bfx.A00), AbstractC166987dD.A1L("flow", str2), AbstractC166987dD.A1L("flow_id", c26069Bfx.A02));
        if (C14360o3.A0K(str2, "management_surface")) {
            r5 = 0;
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            BitSet A0j = AbstractC31171DnF.A0j(1);
            C14360o3.A0B(A0u, 0);
            A1I.put("logging_data", A0u);
            A0j.set(0);
            if (A0j.nextClearBit(0) >= 1) {
                c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                A0B = AbstractC06930Yk.A0B(A1I);
                j = 0;
                i = 719983200;
                str = "com.bloks.www.screen_query.ig_permissions.management_surface_screen";
            } else {
                throw AbstractC31172DnG.A0v();
            }
        } else {
            if (!C14360o3.A0K(str2, "removed_accounts")) {
                return;
            }
            r5 = 0;
            LinkedHashMap A1I2 = AbstractC166987dD.A1I();
            BitSet A0j2 = AbstractC31171DnF.A0j(1);
            C14360o3.A0B(A0u, 0);
            A1I2.put("logging_data", A0u);
            A0j2.set(0);
            if (A0j2.nextClearBit(0) >= 1) {
                c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                A0B = AbstractC06930Yk.A0B(A1I2);
                j = 0;
                i = 719983200;
                str = "com.bloks.www.screen_query.ig_permissions.management_surface.removed_accounts";
            } else {
                throw AbstractC31172DnG.A0v();
            }
        }
        C63719SsZ c63719SsZ = new C63719SsZ(str, r5, "ig_permissions_first_screen_query", A0B, c16920sk, i, j, true);
        AnonymousClass637 A00 = VRA.A00(userSession, false);
        WTY wty = new WTY(r5, r5, r5, r5);
        C14360o3.A0B(A00, 1);
        c63719SsZ.A02(context, wty, A00);
    }
}
