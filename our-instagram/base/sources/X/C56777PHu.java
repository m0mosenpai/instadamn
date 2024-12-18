package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import java.util.Iterator;

/* renamed from: X.PHu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56777PHu implements InterfaceC676933j {
    public final /* synthetic */ ClipsStackedTimelineFragment A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        Integer num;
        String str;
        float f;
        float f2;
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        O7O o7o = this.A00.A0U;
        if (o7o == null) {
            str = "zoomingThrottler";
        } else {
            float A00 = scaleGestureDetectorOnScaleGestureListenerC81153jk.A00();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - o7o.A00 > 100) {
                O24 o24 = o7o.A01;
                float f3 = OZQ.A00;
                ClipsStackedTimelineFragment clipsStackedTimelineFragment = o24.A00;
                C87H c87h = clipsStackedTimelineFragment.A0j;
                if (c87h == null) {
                    str = "videoPlaybackViewModel";
                } else {
                    C87J A0P = MSX.A0P(c87h);
                    if (A0P != null) {
                        num = Integer.valueOf(A0P.CFM());
                    } else {
                        num = null;
                    }
                    Context requireContext = clipsStackedTimelineFragment.requireContext();
                    float f4 = OZQ.A00 * A00;
                    float A002 = (f4 / (AbstractC50522MSa.A00(requireContext, f4) * (OZQ.A00(f4, false) * 2))) * C1H4.A01(r1);
                    float f5 = OZQ.A01;
                    float min = Math.min(Math.max(f5, 10.0f), Math.max(Math.min(f5, 10.0f), A002));
                    OZQ.A00 = min;
                    str = "viewController";
                    if (!AbstractC167007dF.A1N((f3 > min ? 1 : (f3 == min ? 0 : -1)))) {
                        ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
                        if (clipsStackedTimelineViewController != null) {
                            LinearLayoutManager linearLayoutManager = clipsStackedTimelineViewController.A01;
                            if (linearLayoutManager == null) {
                                str = "linearLayoutManager";
                            } else {
                                int A1a = linearLayoutManager.A1a();
                                if (A1a > 0) {
                                    Context requireContext2 = clipsStackedTimelineViewController.A09.requireContext();
                                    f = 0.0f - (((A1a - 1) / 2) * ((AbstractC50522MSa.A00(requireContext2, min) * (OZQ.A00(min, false) * 2)) - (AbstractC50522MSa.A00(requireContext2, f3) * (OZQ.A00(f3, false) * 2))));
                                } else {
                                    f = 0.0f;
                                }
                                if (num != null) {
                                    AbstractC59962oe abstractC59962oe = clipsStackedTimelineViewController.A09;
                                    Context requireContext3 = abstractC59962oe.requireContext();
                                    int intValue = num.intValue();
                                    float A003 = AbstractC50522MSa.A00(requireContext3, min);
                                    float f6 = intValue;
                                    f += (A003 * f6) - (AbstractC50522MSa.A00(abstractC59962oe.requireContext(), f3) * f6);
                                    ((OXZ) clipsStackedTimelineViewController).A00 = (int) (AbstractC50522MSa.A00(abstractC59962oe.requireContext(), min) * f6);
                                }
                                if (A1a < (OZQ.A02 / OZQ.A00(min, false)) + 1 + 2) {
                                    OXZ.A07(clipsStackedTimelineViewController, clipsStackedTimelineViewController.A0E, true);
                                    if (f != 0.0f) {
                                        clipsStackedTimelineViewController.A0G(f);
                                    }
                                } else {
                                    clipsStackedTimelineViewController.A04 = true;
                                    OXZ.A07(clipsStackedTimelineViewController, clipsStackedTimelineViewController.A0E, true);
                                }
                                clipsStackedTimelineViewController.A0B.DuY(((OXZ) clipsStackedTimelineViewController).A00);
                                NI5 ni5 = clipsStackedTimelineFragment.A0E;
                                if (ni5 == null) {
                                    str = "videoTrackViewController";
                                } else {
                                    float f7 = OZQ.A00;
                                    C50868Mdz c50868Mdz = ni5.A0K;
                                    c50868Mdz.A0U(null, Integer.MAX_VALUE);
                                    int A1a2 = ni5.A0E.A1a();
                                    float f8 = 0.0f;
                                    for (int i = 1; i < A1a2; i++) {
                                        if (i % 2 == 0) {
                                            Integer A0I = c50868Mdz.A0E.A0I((i / 2) - 1);
                                            if (A0I != null) {
                                                float intValue2 = A0I.intValue();
                                                f2 = (AbstractC50522MSa.A00(MSZ.A0G(c50868Mdz), f3) * intValue2) - (AbstractC50522MSa.A00(MSZ.A0G(c50868Mdz), f7) * intValue2);
                                            } else {
                                                f2 = 0.0f;
                                            }
                                            f8 += f2;
                                        }
                                    }
                                    if (num != null) {
                                        Context context = ni5.A07;
                                        float intValue3 = num.intValue();
                                        f8 += (AbstractC50522MSa.A00(context, f7) * intValue3) - (AbstractC50522MSa.A00(context, f3) * intValue3);
                                        int A004 = (int) (AbstractC50522MSa.A00(context, f7) * intValue3);
                                        ((OXZ) ni5).A00 = A004;
                                        c50868Mdz.A03 = A004;
                                        AbstractC25231BEo.A1H(c50868Mdz, AbstractC141776au.A00(c50868Mdz), 7);
                                    }
                                    c50868Mdz.A0Q(ni5.A07, null, null, ni5.A06 / 2, false, true);
                                    ni5.A0G(f8);
                                    C55103ObG c55103ObG = clipsStackedTimelineFragment.A0B;
                                    if (c55103ObG == null) {
                                        str = "audioElementTracksManager";
                                    } else {
                                        float f9 = OZQ.A00;
                                        Iterator A01 = C55103ObG.A01(c55103ObG);
                                        while (A01.hasNext()) {
                                            MSW.A0T(A01).A0P(num, f3, f9);
                                        }
                                        Iterator A005 = C55103ObG.A00(c55103ObG);
                                        while (A005.hasNext()) {
                                            MSW.A0T(A005).A0P(num, f3, f9);
                                        }
                                        C54843OMo c54843OMo = clipsStackedTimelineFragment.A0D;
                                        if (c54843OMo == null) {
                                            str = "timedElementTracksManager";
                                        } else {
                                            float f10 = OZQ.A00;
                                            Iterator it = c54843OMo.A0C.iterator();
                                            while (it.hasNext()) {
                                                ((NI6) it.next()).A0O(num, f3, f10);
                                            }
                                            Iterator it2 = c54843OMo.A0B.iterator();
                                            while (it2.hasNext()) {
                                                ((NI6) it2.next()).A0O(num, f3, f10);
                                            }
                                            ClipsStackedTimelineFragment.A0B(clipsStackedTimelineFragment);
                                            o7o.A00 = currentTimeMillis;
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (OZQ.A05 && (min == 10.0f || min == f5)) {
                            ClipsStackedTimelineViewController clipsStackedTimelineViewController2 = clipsStackedTimelineFragment.A0F;
                            if (clipsStackedTimelineViewController2 != null) {
                                clipsStackedTimelineViewController2.A0O().performHapticFeedback(1);
                                OZQ.A05 = false;
                            }
                        }
                        ClipsStackedTimelineFragment.A0B(clipsStackedTimelineFragment);
                        o7o.A00 = currentTimeMillis;
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        String str;
        OZQ.A06 = false;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A00;
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
        if (clipsStackedTimelineViewController == null) {
            str = "viewController";
        } else {
            int i = clipsStackedTimelineViewController.A06;
            C51148Mir c51148Mir = clipsStackedTimelineViewController.A02;
            if (c51148Mir == null) {
                str = "timeBarAdapter";
            } else {
                int i2 = c51148Mir.A01;
                Context requireContext = clipsStackedTimelineViewController.A09.requireContext();
                int i3 = OZQ.A02;
                int i4 = OZQ.A03;
                int i5 = i3 - ((i3 / i4) * i4);
                int i6 = i / 2;
                if (i2 % 2 != 1) {
                    i5 -= i4;
                }
                clipsStackedTimelineViewController.A0U(i6 + AbstractC53880NsC.A00(requireContext, i5));
                NI5 ni5 = clipsStackedTimelineFragment.A0E;
                if (ni5 == null) {
                    str = "videoTrackViewController";
                } else {
                    ni5.A0K.A0U(null, Integer.valueOf(ni5.A06 / 2));
                    C55103ObG c55103ObG = clipsStackedTimelineFragment.A0B;
                    if (c55103ObG == null) {
                        str = "audioElementTracksManager";
                    } else {
                        Iterator A01 = C55103ObG.A01(c55103ObG);
                        while (A01.hasNext()) {
                            NI7 A0T = MSW.A0T(A01);
                            A0T.A0H.A0I(A0T.A05);
                        }
                        Iterator A00 = C55103ObG.A00(c55103ObG);
                        while (A00.hasNext()) {
                            NI7 A0T2 = MSW.A0T(A00);
                            A0T2.A0H.A0I(A0T2.A05);
                        }
                        C54843OMo c54843OMo = clipsStackedTimelineFragment.A0D;
                        if (c54843OMo == null) {
                            str = "timedElementTracksManager";
                        } else {
                            NIX.A02(c54843OMo.A0A, c54843OMo.A01);
                            C50868Mdz c50868Mdz = clipsStackedTimelineFragment.A0h;
                            if (c50868Mdz == null) {
                                str = "stackedTimelineViewModel";
                            } else {
                                c50868Mdz.A07 = false;
                                Float f = clipsStackedTimelineFragment.A0m;
                                if (f != null) {
                                    float floatValue = f.floatValue();
                                    float f2 = OZQ.A00;
                                    C22C A0L = MSY.A0L(clipsStackedTimelineFragment);
                                    EnumC114925Hg A0J = A0L.A0J();
                                    if (floatValue < f2) {
                                        if (A0J != null) {
                                            C22C.A0C(A0L, "TIMELINE_ELEMENT_ZOOM_IN");
                                        }
                                    } else if (A0J != null) {
                                        C22C.A0C(A0L, "TIMELINE_ELEMENT_ZOOM_OUT");
                                    }
                                }
                                clipsStackedTimelineFragment.A0m = null;
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C56777PHu(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        this.A00 = clipsStackedTimelineFragment;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A00;
        C50868Mdz c50868Mdz = clipsStackedTimelineFragment.A0h;
        if (c50868Mdz == null) {
            C14360o3.A0F("stackedTimelineViewModel");
            throw C00O.createAndThrow();
        }
        c50868Mdz.A07 = true;
        OZQ.A06 = true;
        OZQ.A05 = true;
        clipsStackedTimelineFragment.A0p = true;
        clipsStackedTimelineFragment.A0m = Float.valueOf(OZQ.A00);
        return true;
    }
}
