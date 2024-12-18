package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Gcd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37335Gcd implements InterfaceC41501vz {
    public final /* synthetic */ C141956bE A00;

    public C37335Gcd(C141956bE c141956bE) {
        this.A00 = c141956bE;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        Context context;
        int i2;
        String str;
        Object tag;
        String str2;
        int A03 = C0f9.A03(-816224604);
        C141936bC c141936bC = (C141936bC) obj;
        int A032 = C0f9.A03(1746397782);
        C14360o3.A0B(c141936bC, 0);
        C141956bE c141956bE = this.A00;
        Fragment fragment = (Fragment) c141956bE.A08.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            InterfaceC1118853a interfaceC1118853a = c141956bE.A06;
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
            C41551w4 c41551w4 = reelViewerFragment.A0a;
            if (c41551w4 == null) {
                i = -409194368;
            } else {
                C41181vS AuU = interfaceC1118853a.AuU();
                if (AuU == null) {
                    i = 258876397;
                } else {
                    InterfaceC147266kB interfaceC147266kB = reelViewerFragment.mViewPager;
                    if (interfaceC147266kB == null) {
                        i = 241956957;
                    } else {
                        int CNP = reelViewerFragment.A1C.CNP(c41551w4.A0H);
                        View view = ((C147256kA) interfaceC147266kB).A04.A0F;
                        if (view != null && (tag = view.getTag()) != null && (tag instanceof C143556du) && C14360o3.A0K(AbstractC37301Gc2.A0h(AuU.A0b), c141936bC.A01)) {
                            UserSession userSession = c141956bE.A00;
                            if (userSession == null) {
                                str2 = "userSession";
                            } else {
                                C6e7 c6e7 = ((C143556du) tag).A1e;
                                C141596ac C00 = reelViewerFragment.A1C.C00(AuU);
                                ReelViewerConfig reelViewerConfig = c141956bE.A01;
                                if (reelViewerConfig == null) {
                                    str2 = "reelViewerConfig";
                                } else {
                                    InterfaceC144586fe interfaceC144586fe = c141956bE.A07;
                                    C3G2 c3g2 = c141956bE.A02;
                                    if (c3g2 == null) {
                                        str2 = "reelViewerSource";
                                    } else {
                                        C141466aP.A01(c141956bE.A05, userSession, AuU, c41551w4, reelViewerConfig, c3g2, C00, interfaceC144586fe, c6e7, CNP, false, c141956bE.A04);
                                    }
                                }
                            }
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        if (c141936bC.A02) {
                            if (c141936bC.A00 == EnumC77173d3.A02) {
                                i2 = 2131974646;
                                str = "story_like_like_failed_message";
                            } else {
                                i2 = 2131974647;
                                str = "story_like_unlike_failed_message";
                            }
                            C9GR.A01(context, str, i2, 0);
                        }
                        i = -1873159776;
                    }
                }
            }
        } else {
            i = -284945548;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(747789039, A03);
    }
}
