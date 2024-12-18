package X;

import android.view.View;
import android.widget.SeekBar;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.7EM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7EM implements InterfaceC62892tS, C42J {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
        C14360o3.A0B(c3vz, 0);
        if (c3vz == C3VZ.A02) {
            DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
            KL4 kl4 = directAggregatedMediaViewerController.A0I;
            if (kl4 == null) {
                C14360o3.A0F("pagerAdapter");
                throw C00O.createAndThrow();
            }
            kl4.A04 = false;
            InterfaceC37230Gaf interfaceC37230Gaf = directAggregatedMediaViewerController.A0M;
            if (interfaceC37230Gaf != null) {
                interfaceC37230Gaf.Ech(false);
            }
            C35011Fbi c35011Fbi = directAggregatedMediaViewerController.A0L;
            if (c35011Fbi != null) {
                AbstractC13880nE.A0v(c35011Fbi.A02, false);
                return;
            }
            return;
        }
        if (c3vz == C3VZ.A03) {
            DirectAggregatedMediaViewerController directAggregatedMediaViewerController2 = this.A00;
            InterfaceC37230Gaf interfaceC37230Gaf2 = directAggregatedMediaViewerController2.A0M;
            if (interfaceC37230Gaf2 != null) {
                interfaceC37230Gaf2.Ech(true);
            }
            C35011Fbi c35011Fbi2 = directAggregatedMediaViewerController2.A0L;
            if (c35011Fbi2 != null) {
                AbstractC13880nE.A0v(c35011Fbi2.A02, true);
            }
            DirectAggregatedMediaViewerController.A0M(directAggregatedMediaViewerController2);
        }
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
        L5T l5t;
        C14360o3.A0B(view, 0);
        Object tag = view.getTag();
        if ((tag instanceof L5T) && (l5t = (L5T) tag) != null) {
            C46094Kas c46094Kas = l5t.A0A;
            C5TA c5ta = c46094Kas.A01;
            if (c5ta != null) {
                c5ta.A0A("finished");
            }
            c46094Kas.A01 = null;
        }
    }

    public C7EM(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        String str;
        C5TA c5ta;
        C5TA c5ta2;
        C46094Kas c46094Kas;
        Runnable runnable;
        L5T A04;
        C46094Kas c46094Kas2;
        C5TA c5ta3;
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        C158797Aq A06 = DirectAggregatedMediaViewerController.A06(directAggregatedMediaViewerController, i2);
        if (A06 != null && A06.A0t && (A04 = DirectAggregatedMediaViewerController.A04(directAggregatedMediaViewerController, i2)) != null && (c5ta3 = (c46094Kas2 = A04.A0A).A01) != null) {
            c5ta3.A09("horizontal_scroll");
            C46094Kas.A01(c46094Kas2);
        }
        C158797Aq A062 = DirectAggregatedMediaViewerController.A06(directAggregatedMediaViewerController, i);
        if (A062 != null) {
            if (A062.A0t) {
                L5T A042 = DirectAggregatedMediaViewerController.A04(directAggregatedMediaViewerController, i);
                if (A042 != null && (runnable = (c46094Kas = A042.A0A).A03) != null) {
                    runnable.run();
                    c46094Kas.A03 = null;
                }
                boolean A0h = DirectAggregatedMediaViewerController.A0h(directAggregatedMediaViewerController);
                L5T A043 = DirectAggregatedMediaViewerController.A04(directAggregatedMediaViewerController, i);
                if (A0h) {
                    if (A043 != null && (c5ta2 = A043.A0A.A01) != null) {
                        c5ta2.A0B("fragment_resumed", false);
                    }
                } else if (A043 != null && (c5ta = A043.A0A.A01) != null) {
                    c5ta.A04(0, false);
                    c5ta.A0B("horizontal_scroll", false);
                }
            }
            DirectAggregatedMediaViewerController.A0Q(directAggregatedMediaViewerController, A062);
        }
        C34639FNw c34639FNw = directAggregatedMediaViewerController.A0J;
        if (c34639FNw == null) {
            str = "mediaFetchController";
        } else {
            KL4 kl4 = directAggregatedMediaViewerController.A0I;
            if (kl4 == null) {
                str = "pagerAdapter";
            } else {
                int count = kl4.getCount();
                C3o9 c3o9 = c34639FNw.A00;
                if (c3o9 != null && !c34639FNw.A03 && c34639FNw.A02 && (count - 1) - i < 2) {
                    c34639FNw.A03 = true;
                    c34639FNw.A06.A0A(c3o9, 20);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C42J
    public final void DXR(int i) {
        boolean z;
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel;
        Integer num;
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        C158797Aq A06 = DirectAggregatedMediaViewerController.A06(directAggregatedMediaViewerController, i);
        UserSession userSession = directAggregatedMediaViewerController.A0y;
        if (A06 != null) {
            z = C14360o3.A0K(A06.A0J, true);
        } else {
            z = false;
        }
        if (JUW.A03(userSession, z)) {
            Integer num2 = directAggregatedMediaViewerController.A0X;
            RoundedCornerFrameLayout roundedCornerFrameLayout = null;
            if (num2 == null) {
                ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
                if (reboundViewPager == null) {
                    C14360o3.A0F("viewPager");
                    throw C00O.createAndThrow();
                }
                num2 = Integer.valueOf(reboundViewPager.getCurrentDataIndex());
            }
            directAggregatedMediaViewerController.A0X = num2;
            C158847Aw A08 = DirectAggregatedMediaViewerController.A08(directAggregatedMediaViewerController, i);
            if (A06 != null && (privacyMediaOverlayViewModel = A06.A01) != null && ((num = directAggregatedMediaViewerController.A0X) == null || i != num.intValue() || directAggregatedMediaViewerController.A0W == C05F.A00)) {
                if (A08 != null) {
                    A08.A04(privacyMediaOverlayViewModel, new ME5(47, A06, directAggregatedMediaViewerController, privacyMediaOverlayViewModel), 1);
                }
                if (directAggregatedMediaViewerController.A0j) {
                    L5T A04 = DirectAggregatedMediaViewerController.A04(directAggregatedMediaViewerController, i);
                    if (A04 != null) {
                        roundedCornerFrameLayout = A04.A0E;
                    }
                    DirectAggregatedMediaViewerController.A0U(directAggregatedMediaViewerController, roundedCornerFrameLayout);
                    return;
                }
                return;
            }
            if (A08 == null) {
                return;
            }
            A08.A02();
        }
    }

    @Override // X.C42J
    public final void DXS(int i) {
        L5T A04;
        C46094Kas c46094Kas;
        C5TA c5ta;
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        C158797Aq A06 = DirectAggregatedMediaViewerController.A06(directAggregatedMediaViewerController, i);
        if (A06 != null && A06.A0t && (A04 = DirectAggregatedMediaViewerController.A04(directAggregatedMediaViewerController, i)) != null && (c5ta = (c46094Kas = A04.A0A).A01) != null) {
            c5ta.A04(0, false);
            IgTextView igTextView = c46094Kas.A0E;
            SeekBar seekBar = c46094Kas.A0C;
            igTextView.setText(C23831Eq.A02(seekBar.getMax()));
            seekBar.setProgress(0);
        }
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
        IgdsMediaButton igdsMediaButton;
        String str;
        Integer num;
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        C158797Aq A06 = DirectAggregatedMediaViewerController.A06(directAggregatedMediaViewerController, i2);
        String A0B = DirectAggregatedMediaViewerController.A0B(directAggregatedMediaViewerController);
        if (A0B != null && A06 != null && (str = A06.A0S) != null) {
            UserSession userSession = directAggregatedMediaViewerController.A0y;
            EnumC40111tc enumC40111tc = A06.A0I;
            if (enumC40111tc != null) {
                num = Integer.valueOf(enumC40111tc.A00);
            } else {
                num = null;
            }
            String valueOf = String.valueOf(num);
            C14360o3.A0B(valueOf, 3);
            C18920wW A02 = AbstractC12220kQ.A02(userSession);
            InterfaceC02590Ai A00 = A02.A00(A02.A00, "direct_permanent_media_viewer_swipe");
            if (A00.isSampled()) {
                A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A0B);
                A00.AAP("media_id", str);
                A00.AAP("media_type", valueOf);
                A00.Cht();
            }
        }
        L5T A04 = DirectAggregatedMediaViewerController.A04(directAggregatedMediaViewerController, i2);
        if (A04 != null && (igdsMediaButton = A04.A0D) != null) {
            igdsMediaButton.setVisibility(8);
        }
    }
}
