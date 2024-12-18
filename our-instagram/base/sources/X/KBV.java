package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes8.dex */
public final class KBV extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectVisualTimelineFragment";
    public View A00;
    public View A01;
    public C47946LGa A02;
    public C2EC A03;
    public C47949LGf A04;
    public final String A06 = "viewer_fragment_tag";
    public final String A05 = "camera_fragment_tag";
    public final long A08 = 200;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_visual_timeline";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.KCV, androidx.fragment.app.Fragment, X.2oe] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Window A0H = AbstractC31174DnI.A0H(this);
        C14360o3.A07(A0H);
        AbstractC13440mV.A05(A0H);
        this.A01 = AbstractC166987dD.A0c(view, R.id.child_viewer_fragment_holder);
        this.A00 = AbstractC166987dD.A0c(view, R.id.child_camera_fragment_holder);
        C47949LGf c47949LGf = new C47949LGf(requireContext(), new C47425KxG(this), new L6T(this), new C47426KxH(this), new L6U(this));
        this.A04 = c47949LGf;
        View A0c = AbstractC166987dD.A0c(view, R.id.visual_timeline_container);
        c47949LGf.A01 = A0c;
        String str = "timelineContainer";
        RecyclerView A0B = AbstractC43592JPx.A0B(A0c, R.id.clips_timeline_recycler_view);
        c47949LGf.A02 = A0B;
        if (A0B != null) {
            A0B.setAdapter(c47949LGf.A08);
            RecyclerView recyclerView = c47949LGf.A02;
            if (recyclerView != null) {
                Context context = c47949LGf.A07;
                AbstractC31174DnI.A17(context, recyclerView, false);
                RecyclerView recyclerView2 = c47949LGf.A02;
                if (recyclerView2 != null) {
                    recyclerView2.A10(new JoA(context));
                    View view2 = c47949LGf.A01;
                    if (view2 != null) {
                        View findViewById = view2.findViewById(R.id.direct_visual_timeline_play_indicator);
                        c47949LGf.A00 = findViewById;
                        RecyclerView recyclerView3 = c47949LGf.A02;
                        if (recyclerView3 != null) {
                            if (findViewById == null) {
                                str = "playIndicator";
                            } else {
                                L6U l6u = c47949LGf.A0C;
                                C47427KxI c47427KxI = c47949LGf.A0D;
                                c47949LGf.A03 = new C49675Lx6(context, findViewById, recyclerView3, c47949LGf.A09, c47949LGf.A0A, l6u, c47427KxI);
                                C47946LGa c47946LGa = this.A02;
                                if (c47946LGa == null) {
                                    A00(this);
                                    C47949LGf c47949LGf2 = this.A04;
                                    if (c47949LGf2 != null) {
                                        c47949LGf2.A02(C16930sl.A00);
                                        return;
                                    }
                                } else {
                                    ArrayList A1E = AbstractC166987dD.A1E();
                                    List list = c47946LGa.A03;
                                    int size = list.size();
                                    for (int i = 0; i < size; i++) {
                                        C45093JxN A01 = c47946LGa.A01(i);
                                        if (A01 != null) {
                                            A1E.add(A01);
                                        }
                                    }
                                    C47949LGf c47949LGf3 = this.A04;
                                    if (c47949LGf3 != null) {
                                        c47949LGf3.A02(A1E);
                                        Bundle bundle2 = requireArguments().getBundle("DirectVisualTimelineFragment.VISUAL_VIEWER_ARGS");
                                        if (list.size() <= 0 || bundle2 == null) {
                                            return;
                                        }
                                        C47949LGf c47949LGf4 = this.A04;
                                        if (c47949LGf4 != null) {
                                            c47949LGf4.A01();
                                            ?? abstractC59962oe = new AbstractC59962oe();
                                            AbstractC03240Dh.A00(bundle2, AbstractC166987dD.A0o(this.A07));
                                            abstractC59962oe.setArguments(bundle2);
                                            C47949LGf c47949LGf5 = this.A04;
                                            if (c47949LGf5 != null) {
                                                C49675Lx6 c49675Lx6 = c47949LGf5.A03;
                                                if (c49675Lx6 == null) {
                                                    str = "directVisualTimelineScrollController";
                                                } else {
                                                    abstractC59962oe.A02 = c49675Lx6;
                                                    C14240no A0F = AbstractC43593JPy.A0F(this);
                                                    A0F.A0C(abstractC59962oe, this.A06, R.id.child_viewer_fragment_holder);
                                                    A0F.A00();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F("timelineController");
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F("timelineRecyclerView");
        throw C00O.createAndThrow();
    }

    public static final void A00(KBV kbv) {
        C22P c22p = C22P.A2H;
        AbstractC208269Jl.A00(AbstractC166987dD.A0r(kbv.A07)).A07(c22p, true);
        A01(kbv);
        View view = kbv.A00;
        String str = "childCameraFragmentHolder";
        if (view != null) {
            Fragment A0Q = kbv.getChildFragmentManager().A0Q(kbv.A05);
            if (A0Q == null || !A0Q.isAdded()) {
                AbstractC13880nE.A0q(view, new RunnableC50000M5p(view, c22p, kbv));
            }
            View view2 = kbv.A00;
            if (view2 != null) {
                if (view2.getVisibility() != 0) {
                    C47949LGf c47949LGf = kbv.A04;
                    if (c47949LGf == null) {
                        str = "timelineController";
                    } else {
                        C49675Lx6 c49675Lx6 = c47949LGf.A03;
                        if (c49675Lx6 == null) {
                            str = "directVisualTimelineScrollController";
                        } else {
                            ListIterator A14 = AbstractC43592JPx.A14(c49675Lx6.A03);
                            while (true) {
                                if (!A14.hasPrevious()) {
                                    break;
                                }
                                if (A14.previous() instanceof C45656KIt) {
                                    int nextIndex = A14.nextIndex();
                                    if (nextIndex != -1) {
                                        C110814yt c110814yt = c49675Lx6.A08;
                                        ((AbstractC110824yu) c110814yt).A00 = nextIndex;
                                        AbstractC70663Fe abstractC70663Fe = c49675Lx6.A09.A0D;
                                        if (abstractC70663Fe != null) {
                                            abstractC70663Fe.A10(c110814yt);
                                        }
                                    }
                                }
                            }
                            c49675Lx6.A01 = -1;
                            c49675Lx6.A00 = 0.0f;
                            View view3 = kbv.A00;
                            if (view3 != null) {
                                view3.setVisibility(0);
                                View view4 = kbv.A00;
                                if (view4 != null) {
                                    view4.setAlpha(0.0f);
                                    View view5 = kbv.A00;
                                    if (view5 != null) {
                                        AbstractC43594JPz.A0H(view5).setDuration(kbv.A08).start();
                                        View view6 = kbv.A01;
                                        if (view6 == null) {
                                            str = "childViewerFragmentHolder";
                                        } else {
                                            view6.setVisibility(8);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public static final void A01(KBV kbv) {
        DirectVisualMessageViewerController directVisualMessageViewerController;
        KCV kcv = (KCV) kbv.getChildFragmentManager().A0Q(kbv.A06);
        if (kcv != null && kcv.isResumed() && (directVisualMessageViewerController = kcv.A01) != null) {
            directVisualMessageViewerController.A0W("seek");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r7 == null) goto L15;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -488489999(0xffffffffe2e23bf1, float:-2.0866417E21)
            int r2 = X.C0f9.A02(r0)
            super.onCreate(r12)
            X.0do r4 = r11.A07
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r4)
            X.2DS r8 = X.AbstractC28761aE.A00(r0)
            android.os.Bundle r1 = r11.requireArguments()
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"
            android.os.Parcelable r3 = r1.getParcelable(r0)
            com.instagram.model.direct.DirectThreadKey r3 = (com.instagram.model.direct.DirectThreadKey) r3
            java.lang.String r0 = "DirectVisualTimelineFragment.VISUAL_VIEWER_ARGS"
            android.os.Bundle r5 = r1.getBundle(r0)
            r0 = 0
            if (r3 == 0) goto L71
            r1 = r8
            X.2DU r1 = (X.C2DU) r1
            X.3kb r7 = X.C2DU.A03(r1, r3)
        L30:
            if (r5 == 0) goto L6b
            r1 = 0
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_IS_REPLAY"
            boolean r10 = r5.getBoolean(r0, r1)
            java.lang.String r0 = "DirectVisualMessageViewerFragment.REPLAY_SESSION_ID"
            java.lang.String r9 = r5.getString(r0)
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_MESSAGE_ID"
            java.lang.String r1 = r5.getString(r0)
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_MESSAGE_CLIENT_CONTEXT"
            java.lang.String r0 = r5.getString(r0)
            if (r7 == 0) goto L6d
            com.instagram.common.session.UserSession r6 = X.AbstractC166987dD.A0r(r4)
            androidx.fragment.app.FragmentActivity r5 = r11.requireActivity()
            if (r9 == 0) goto L73
            X.L7z r4 = new X.L7z
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.LGa r0 = r4.A00(r3, r1, r0)
        L60:
            r11.A03 = r7
            r11.A02 = r0
        L64:
            r0 = 406421047(0x18397e37, float:2.3974412E-24)
            X.C0f9.A09(r0, r2)
            return
        L6b:
            if (r7 != 0) goto L60
        L6d:
            X.AbstractC25227BEk.A1B(r11)
            goto L64
        L71:
            r7 = r0
            goto L30
        L73:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            r0 = 1102097826(0x41b0ada2, float:22.084782)
            X.C0f9.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KBV.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1262886633);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_visual_timeline, viewGroup, false);
        C0f9.A09(403972711, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-339295351);
        super.onResume();
        Window A0H = AbstractC31174DnI.A0H(this);
        C14360o3.A07(A0H);
        AbstractC56402iY.A07(AbstractC31174DnI.A0H(this).getDecorView(), A0H, false);
        AbstractC145016gM.A05(requireActivity(), AbstractC166987dD.A0r(this.A07), true);
        C0f9.A09(-1927015607, A02);
    }
}
