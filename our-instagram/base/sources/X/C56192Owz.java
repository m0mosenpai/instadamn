package X;

import android.content.Context;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Owz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56192Owz implements InterfaceC13380mO {
    public final int A00;
    public final Object A01;

    public C56192Owz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC13380mO
    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        C115475Kh A0V;
        if (this.A00 != 0) {
            String A0Q = AbstractC167027dH.A0Q(obj);
            NKE A01 = AbstractC50867Mdy.A01((FollowersShareFragment) this.A01);
            A01.A05 = A0Q;
            PZT.A03(A01, A01.A0F, 42);
            return;
        }
        boolean A1a = AbstractC166987dD.A1a(obj);
        String str = "stackedTimelineViewModel";
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) this.A01;
        if (A1a) {
            C50868Mdz c50868Mdz = clipsStackedTimelineFragment.A0h;
            if (c50868Mdz != null) {
                C2GS c2gs = c50868Mdz.A0B;
                if (!C14360o3.A0K(c2gs.A02(), C193588hd.A00)) {
                    return;
                }
                c2gs.A0B(C193648hk.A00);
                Integer A0G = c50868Mdz.A0G();
                if (A0G == null) {
                    return;
                }
                ClipsCreationViewModel clipsCreationViewModel = c50868Mdz.A0E;
                int intValue = A0G.intValue();
                C84B A0N = MSY.A0N(clipsCreationViewModel);
                if (A0N == null || (A0V = MSW.A0V(A0N, intValue)) == null) {
                    return;
                }
                C1125456i c1125456i = new C1125456i(TimeUnit.MILLISECONDS, 0L, A0V.A0B());
                C87H c87h = c50868Mdz.A0K;
                String A0n = AbstractC167017dG.A0n(A0G, "video_video_", AbstractC166987dD.A1C());
                C14360o3.A0B(A0n, 0);
                MSX.A1A(c87h.A0F, AbstractC166987dD.A1L(A0n, c1125456i));
                return;
            }
        } else {
            C50868Mdz c50868Mdz2 = clipsStackedTimelineFragment.A0h;
            if (c50868Mdz2 != null) {
                c50868Mdz2.A0T(null);
                Context context = clipsStackedTimelineFragment.getContext();
                if (context == null) {
                    return;
                }
                C50868Mdz c50868Mdz3 = clipsStackedTimelineFragment.A0h;
                if (c50868Mdz3 != null) {
                    if (clipsStackedTimelineFragment.A0F == null) {
                        str = "viewController";
                    } else {
                        c50868Mdz3.A0N((int) (((OXZ) r0).A00 / AbstractC50522MSa.A00(context, OZQ.A00)));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
