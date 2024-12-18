package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.P2p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56402P2p implements GZA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56402P2p(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.GZA
    public final void onActionClicked() {
        C63397SjR c63397SjR;
        String str;
        switch (this.A00) {
            case 0:
                OUH ouh = (OUH) this.A01;
                UserSession userSession = ouh.A00;
                String A04 = C18U.A04(C06090Tz.A05, userSession, 36882645107343818L);
                if (TextUtils.isEmpty(A04)) {
                    return;
                }
                c63397SjR = new C63397SjR((Context) this.A02, userSession, C2Fb.A0H, A04);
                str = ouh.A05;
                c63397SjR.A0S = str;
                c63397SjR.A0A();
                return;
            case 1:
                C55196Oe3.A00((Context) this.A01, (C55196Oe3) this.A02);
                return;
            default:
                EffectsPageFragment effectsPageFragment = (EffectsPageFragment) this.A01;
                String A042 = C18U.A04(C06090Tz.A05, effectsPageFragment.A07, 36882645107343818L);
                if (!TextUtils.isEmpty(A042)) {
                    c63397SjR = new C63397SjR((Context) this.A02, effectsPageFragment.A07, C2Fb.A0H, A042);
                    str = "effect_page";
                    c63397SjR.A0S = str;
                    c63397SjR.A0A();
                    return;
                }
                return;
        }
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        if (1 - this.A00 == 0) {
            C55196Oe3.A04((C55196Oe3) this.A02, "DISMISSAL");
        }
    }
}
