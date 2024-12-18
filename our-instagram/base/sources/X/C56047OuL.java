package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OuL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56047OuL implements InterfaceC60602pj {
    public long A00;
    public Integer A01;
    public final UserSession A02;
    public final ClipsCreationViewModel A03;
    public final C50869Me0 A04;
    public final C187418Sj A05;
    public final C187358Sd A06;
    public final NIX A07;
    public final ClipsStackedTimelineViewController A08;
    public final C87H A09;

    public C56047OuL(UserSession userSession, ClipsStackedTimelineViewController clipsStackedTimelineViewController, ClipsCreationViewModel clipsCreationViewModel, C50869Me0 c50869Me0, C187418Sj c187418Sj, C187358Sd c187358Sd, NIX nix, C87H c87h) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A08 = clipsStackedTimelineViewController;
        this.A03 = clipsCreationViewModel;
        this.A06 = c187358Sd;
        this.A05 = c187418Sj;
        this.A04 = c50869Me0;
        this.A07 = nix;
        this.A09 = c87h;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A08;
        ViewOnClickListenerC55460OkF viewOnClickListenerC55460OkF = new ViewOnClickListenerC55460OkF(this, 13);
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = clipsStackedTimelineViewController.A0C;
        ClipsTimelineActionBarViewController.A01(viewOnClickListenerC55460OkF, EnumC53325Ni3.A0Z, clipsTimelineActionBarViewController);
        ClipsTimelineActionBarViewController.A01(new ViewOnClickListenerC55460OkF(this, 14), EnumC53325Ni3.A0a, clipsTimelineActionBarViewController);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final int A00(C56047OuL c56047OuL) {
        ViewGroup viewGroup = c56047OuL.A08.container;
        if (viewGroup != null) {
            return (int) (((OXZ) r1).A00 / AbstractC50522MSa.A00(AbstractC166997dE.A0L(viewGroup), OZQ.A00));
        }
        C14360o3.A0F("container");
        throw C00O.createAndThrow();
    }

    public static final Integer A02(C56047OuL c56047OuL) {
        C51832Mva A0G;
        int i;
        Integer num;
        C51832Mva A0G2;
        Integer valueOf;
        int intValue;
        C84B A0W;
        C84B A0W2;
        C187358Sd c187358Sd = c56047OuL.A06;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if (A0E instanceof C8TF) {
            C58252li c58252li = c56047OuL.A03.A0G;
            C84B A0W3 = MSW.A0W(c58252li);
            if (A0W3 != null) {
                int i2 = ((C8TF) A0E).A00;
                if (A0W3.A04(i2) != null && (A0W2 = MSW.A0W(c58252li)) != null) {
                    List list = A0W2.A01;
                    int A05 = AbstractC25226BEj.A05(list);
                    if (i2 > A05) {
                        i2 = A05;
                    }
                    i = ((C9BO) list.get(i2)).A00;
                    num = Integer.valueOf(i);
                }
            }
            num = null;
        } else {
            if ((A0E instanceof C8TE) && (A0G = ((AbstractC50863Mdu) c56047OuL.A07).A01.A0G()) != null) {
                i = A0G.A05;
                num = Integer.valueOf(i);
            }
            num = null;
        }
        AbstractC187378Sf A0E2 = c187358Sd.A0E();
        if (A0E2 instanceof C8TF) {
            C58252li c58252li2 = c56047OuL.A03.A0G;
            C84B A0W4 = MSW.A0W(c58252li2);
            if (A0W4 != null) {
                int i3 = ((C8TF) A0E2).A00;
                if (A0W4.A04(i3) != null && (A0W = MSW.A0W(c58252li2)) != null) {
                    valueOf = Integer.valueOf(A0W.A00(i3));
                }
            }
            valueOf = null;
        } else {
            if ((A0E2 instanceof C8TE) && (A0G2 = ((AbstractC50863Mdu) c56047OuL.A07).A01.A0G()) != null) {
                valueOf = Integer.valueOf(A0G2.A02 - A0G2.A05);
            }
            valueOf = null;
        }
        if (num == null || valueOf == null) {
            return null;
        }
        boolean z = c187358Sd.A0E() instanceof C8TE;
        int A00 = A00(c56047OuL) - num.intValue();
        ViewGroup viewGroup = c56047OuL.A08.container;
        if (viewGroup != null) {
            if (Math.abs(A00) <= AbstractC13880nE.A04(AbstractC166997dE.A0L(viewGroup), 2)) {
                return MSX.A0Z(z ? 1 : 0);
            }
            if (A00 >= 0 && A00 <= (intValue = valueOf.intValue())) {
                if (A00 >= 100 && A00 <= intValue - 100) {
                    return null;
                }
                if (z) {
                    return C05F.A0j;
                }
                return C05F.A0Y;
            }
            if (z) {
                return C05F.A0N;
            }
            return C05F.A0C;
        }
        C14360o3.A0F("container");
        throw C00O.createAndThrow();
    }

    public static final int A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 2131955988;
            case 1:
                return 2131955990;
            case 2:
                return 2131955985;
            case 3:
                return 2131955986;
            case 4:
                return 2131955987;
            case 5:
                return 2131955989;
            default:
                throw B4Z.A00();
        }
    }

    public static final void A03(C56047OuL c56047OuL) {
        boolean z;
        Integer valueOf;
        Integer A02 = A02(c56047OuL);
        C50869Me0 c50869Me0 = c56047OuL.A04;
        if (A02 == null) {
            z = true;
            valueOf = null;
        } else {
            z = false;
            valueOf = Integer.valueOf(A01(A02));
        }
        c50869Me0.A02 = z;
        c50869Me0.A00 = valueOf;
        C05A c05a = c50869Me0.A0D;
        ArrayList A0w = MSZ.A0w(c05a);
        C14360o3.A0C(A0w, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsTimelineActionBarViewModel.ButtonState>");
        int size = A0w.size();
        for (int i = 0; i < size; i++) {
            if (((C51960Mxi) A0w.get(i)).A00 == EnumC53325Ni3.A0Z || ((C51960Mxi) A0w.get(i)).A00 == EnumC53325Ni3.A0a) {
                C51960Mxi c51960Mxi = (C51960Mxi) A0w.get(i);
                EnumC53325Ni3 enumC53325Ni3 = c51960Mxi.A00;
                boolean z2 = c51960Mxi.A06;
                boolean z3 = c51960Mxi.A05;
                boolean z4 = c51960Mxi.A07;
                String str = c51960Mxi.A02;
                boolean z5 = c51960Mxi.A03;
                C14360o3.A0B(enumC53325Ni3, 0);
                A0w.set(i, new C51960Mxi(enumC53325Ni3, valueOf, str, z2, z3, z, z4, z5));
            }
        }
        c05a.Egh(A0w);
    }

    public static final void A04(C56047OuL c56047OuL, Integer num) {
        if (System.currentTimeMillis() - c56047OuL.A00 <= 1000 && c56047OuL.A01 == num) {
            return;
        }
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = c56047OuL.A08;
        int A01 = A01(num);
        Context context = clipsStackedTimelineViewController.A09.getContext();
        if (context != null) {
            C55081Oab.A02.A01(context, A01);
        }
        c56047OuL.A01 = num;
        c56047OuL.A00 = System.currentTimeMillis();
    }
}
