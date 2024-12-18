package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BOL extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC31066Dl8 A01;
    public final BLB A02;
    public final boolean A03;
    public final long A04;

    private final Drawable A03(C2Z1 c2z1, ImageUrl imageUrl, List list) {
        BP0 bp0;
        Context context = c2z1.ArD().A0C;
        Resources A0M = AbstractC166997dE.A0M(context);
        int dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        int dimensionPixelSize2 = A0M.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int dimensionPixelSize3 = A0M.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        int color = context.getColor(R.color.audio_bar_action_color_enabled);
        int dimensionPixelSize4 = A0M.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        UserSession userSession = this.A00;
        C3x9 A0u = AbstractC25226BEj.A0u(this.A02.A02);
        Map map = AbstractC25485BOz.A02;
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        if (C18U.A06(A0j, userSession, 36319300017069197L)) {
            bp0 = BP0.A04;
        } else if (C18U.A06(A0j, userSession, 36319300017200271L)) {
            bp0 = BP0.A05;
        } else if (C18U.A06(A0j, userSession, 36319300016938123L)) {
            bp0 = BP0.A03;
        } else if (AbstractC92574Cr.A06(A0u, userSession) && C18U.A06(A0j, userSession, 36320347989680525L)) {
            bp0 = BP0.A02;
        } else {
            bp0 = null;
        }
        BOM bom = new BOM(context, bp0, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, color, dimensionPixelSize4, -1, false);
        if (list != null) {
            bom.A05(list);
            return bom;
        }
        if (imageUrl != null) {
            bom.A04(imageUrl, null);
            return bom;
        }
        Drawable A0N = AbstractC25228BEl.A0N(c2z1, R.drawable.instagram_music_outline_44);
        AbstractC25233BEq.A10(A0N, c2z1, R.color.audio_bar_action_color_enabled);
        return A0N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b3, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.BOL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.AbstractCollection, java.util.AbstractList, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r18) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BOL.A0Y(X.3bS):X.2Vc");
    }

    public BOL(UserSession userSession, InterfaceC31066Dl8 interfaceC31066Dl8, BLB blb, long j, boolean z) {
        AbstractC167017dG.A1P(interfaceC31066Dl8, blb);
        this.A01 = interfaceC31066Dl8;
        this.A02 = blb;
        this.A03 = z;
        this.A00 = userSession;
        this.A04 = j;
    }
}
