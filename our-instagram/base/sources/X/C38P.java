package X;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableSet;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.38P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38P extends AbstractC59962oe implements C1M1, AnonymousClass309, InterfaceC60072op, InterfaceC60092or, InterfaceC11480j6, InterfaceC60122ou, InterfaceC60132ov, InterfaceC60172oz, C38Q {
    public static final String __redex_internal_original_name = "ExploreFragment";
    public MTJ A00;
    public C66085TzM A01;
    public ViewOnTouchListenerC60632pm A02;
    public C38147GqE A03;
    public C66095TzW A04;
    public C38125Gps A05;
    public C65823Tug A06;
    public JIG A07;
    public C38084GpD A08;
    public C38083GpC A09;
    public C77433dT A0A;
    public JPU A0B;
    public C38089GpI A0C;
    public C93Y A0D;
    public C37934GmW A0E;
    public C66089TzQ A0F;
    public C66087TzO A0G;
    public C66086TzN A0H;
    public C38082GpB A0I;
    public C38135Gq2 A0J;
    public C38126Gpt A0K;
    public C30A A0L;
    public Gt7 A0M;
    public MR7 A0N;
    public C5GR A0O;
    public C64842wi A0P;
    public C64742wY A0Q;
    public C32S A0R;
    public C66177U2s A0S;
    public InterfaceC62602sz A0T;
    public IM0 A0U;
    public String A0V;
    public String A0W;
    public InterfaceC16820sZ A0X;
    public boolean A0Y;
    public C3MJ A0Z;
    public C3MT A0a;
    public C128025qW A0b;
    public C38137Gq4 A0c;
    public final long A0d;
    public final C53S A0e;
    public final C37330GcY A0f;
    public final C7KY A0g;
    public final InterfaceC71925XAj A0h;
    public final InterfaceC43405JFv A0i;
    public final InterfaceC43406JFw A0j;
    public final IL0 A0k;
    public final C69533Vqx A0l;
    public final IC2 A0m;
    public final InterfaceC101554hQ A0n;
    public final C38U A0o;
    public final String A0p;
    public final InterfaceC09390do A0q;
    public final InterfaceC09390do A0r;
    public final InterfaceC09390do A0s;
    public final InterfaceC09390do A0t;
    public final InterfaceC09390do A0u;
    public final InterfaceC09390do A0v;
    public final InterfaceC09390do A0w;
    public final InterfaceC09390do A0x;
    public final InterfaceC09390do A0y;
    public final InterfaceC09390do A0z;
    public final InterfaceC43641zu A10;
    public final InterfaceC41501vz A11;
    public final InterfaceC41501vz A12;
    public final InterfaceC41501vz A13;
    public final InterfaceC60602pj A14;
    public final IC1 A15;
    public final InterfaceC62612t0 A16;
    public final JHG A17;
    public final C1PC A18;
    public final InterfaceC62602sz A19;
    public final InterfaceC09390do A1A;

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return true;
    }

    @Override // X.C38Q
    public final void DRS(C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        String str;
        C14360o3.A0B(c38321qM, 0);
        C38125Gps c38125Gps = this.A05;
        if (c38125Gps == null) {
            str = "clipsHeroDismissController";
        } else {
            C127935qM A00 = C38125Gps.A00(c38125Gps);
            if (A00 != null && C14360o3.A0K(A00.BQN(), c38321qM)) {
                C130535uy c130535uy = A00.A01;
                if (z) {
                    EnumC75193Zm enumC75193Zm = EnumC75193Zm.A09;
                    C14360o3.A0B(enumC75193Zm, 0);
                    c75113Zb.A0m = enumC75193Zm;
                }
                if (c130535uy.A00 < c130535uy.A02().size() - 1) {
                    c130535uy.A00++;
                    c38125Gps.A04.Eoj(c38321qM, "hide", true);
                    String str2 = c130535uy.A0A;
                    C65823Tug c65823Tug = c38125Gps.A03;
                    c65823Tug.A08(str2);
                    c65823Tug.A0D.EJ1();
                    return;
                }
                AbstractC153666vb abstractC153666vb = c38125Gps.A01;
                abstractC153666vb.A02(c130535uy.A03);
                abstractC153666vb.A04(null, null, C16930sl.A00, false);
            }
            JIG jig = this.A07;
            if (jig == null) {
                str = "videoPlayerManager";
            } else {
                jig.Eoj(c38321qM, "hide", true);
                C65823Tug c65823Tug2 = this.A06;
                if (c65823Tug2 == null) {
                    str = "grid";
                } else {
                    String id = c38321qM.getId();
                    if (id != null) {
                        c65823Tug2.A08(id);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.mView != null) {
            C65823Tug c65823Tug = this.A06;
            String str = "grid";
            if (c65823Tug != null) {
                C3FQ c3fq = c65823Tug.A06;
                if (c3fq != null) {
                    JPU jpu = this.A0B;
                    if (jpu != null) {
                        jpu.configureActionBar(interfaceC56362iU);
                        JPU jpu2 = this.A0B;
                        if (jpu2 != null) {
                            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A02;
                            if (viewOnTouchListenerC60632pm == null) {
                                str = "scrollableNavigationHelper";
                            } else {
                                C65823Tug c65823Tug2 = this.A06;
                                if (c65823Tug2 != null) {
                                    jpu2.AJJ(viewOnTouchListenerC60632pm, c65823Tug2.A0B, c3fq);
                                }
                            }
                        }
                    }
                    C14360o3.A0F("headerController");
                    throw C00O.createAndThrow();
                }
                MR7 mr7 = this.A0N;
                if (mr7 != null) {
                    JPU jpu3 = this.A0B;
                    if (jpu3 != null) {
                        float C9q = jpu3.C9q();
                        C65823Tug c65823Tug3 = this.A06;
                        if (c65823Tug3 != null) {
                            mr7.FBA(c65823Tug3.A0B, C9q);
                            return;
                        }
                    }
                    C14360o3.A0F("headerController");
                    throw C00O.createAndThrow();
                }
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (AbstractC66119Tzx.A00(getSession()).A00) {
            ((C38086GpF) this.A0q.getValue()).A05();
            C38135Gq2 c38135Gq2 = this.A0J;
            if (c38135Gq2 == null) {
                str = "viewController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C38135Gq2.A00(c38135Gq2, C05F.A00, true, true, false, false, false);
        }
        C65823Tug c65823Tug = this.A06;
        str = "grid";
        if (c65823Tug != null) {
            InterfaceC62602sz interfaceC62602sz = this.A0T;
            if (interfaceC62602sz == null) {
                str = "loadMoreInterface";
            } else {
                c65823Tug.A05(view, interfaceC62602sz.isLoading());
                C38089GpI c38089GpI = this.A0C;
                if (c38089GpI != null) {
                    C65823Tug c65823Tug2 = this.A06;
                    if (c65823Tug2 != null) {
                        C3FQ c3fq = c65823Tug2.A06;
                        c38089GpI.A06 = c3fq;
                        c38089GpI.A01 = view;
                        C38082GpB c38082GpB = this.A0I;
                        if (c38082GpB == null) {
                            str = "gridMediaLoadingTracker";
                        } else {
                            c38082GpB.A00 = c3fq;
                            c65823Tug2.A06(this.A16);
                            C65823Tug c65823Tug3 = this.A06;
                            if (c65823Tug3 != null) {
                                DiscoveryRecyclerView discoveryRecyclerView = c65823Tug3.A04;
                                if (discoveryRecyclerView != null) {
                                    C93Y c93y = this.A0D;
                                    if (c93y != null) {
                                        if (c93y.A01 == 2) {
                                            discoveryRecyclerView.setClipToPadding(false);
                                            AbstractC13880nE.A0Y(discoveryRecyclerView, requireContext().getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height));
                                        }
                                    }
                                    C14360o3.A0F("exploreSurface");
                                    throw C00O.createAndThrow();
                                }
                                C65823Tug c65823Tug4 = this.A06;
                                if (c65823Tug4 != null) {
                                    DiscoveryRecyclerView discoveryRecyclerView2 = c65823Tug4.A04;
                                    if (discoveryRecyclerView2 != null) {
                                        discoveryRecyclerView2.setItemAnimator(null);
                                    }
                                    C38137Gq4 c38137Gq4 = this.A0c;
                                    if (c38137Gq4 == null) {
                                        str = "commonViewControl";
                                    } else {
                                        C218914p.A03(EnumC220415e.A04, c38137Gq4.A05);
                                        C41451vu c41451vu = C41451vu.A01;
                                        c41451vu.A02(c38137Gq4.A04, C3NF.class);
                                        c41451vu.A02(c38137Gq4.A02, C42661xu.class);
                                        AbstractC25651Mw.A00(c38137Gq4.A06).A01(c38137Gq4.A03, C36060Fvw.class);
                                        C64842wi c64842wi = this.A0P;
                                        if (c64842wi == null) {
                                            str = "quickPromotionDelegate";
                                        } else {
                                            c64842wi.DiZ();
                                            if (Cen()) {
                                                C56352iT A03 = C56352iT.A0t.A03(requireActivity());
                                                A03.A0N.setBackground(BOU.A00(requireContext(), GradientDrawable.Orientation.TOP_BOTTOM, 0.5d));
                                                C57982lB.A0B.A04(requireActivity(), new C66176U2r(A03, this), true);
                                            }
                                            FragmentActivity requireActivity = requireActivity();
                                            if (requireActivity instanceof IgFragmentActivity) {
                                                ((IgFragmentActivity) requireActivity).registerOnActivityResultListener(this.A14);
                                            }
                                            Gt7 gt7 = this.A0M;
                                            if (gt7 != null) {
                                                C93Y c93y2 = this.A0D;
                                                if (c93y2 != null) {
                                                    if (c93y2.A05) {
                                                        ExploreTopicCluster exploreTopicCluster = c93y2.A00;
                                                        if (exploreTopicCluster != null && exploreTopicCluster.A01 == EnumC127875qG.A07) {
                                                            ViewStub viewStub = (ViewStub) requireView().findViewById(R.id.nido_follow_topic_stub);
                                                            viewStub.setLayoutResource(R.layout.explore_parent_layout);
                                                            View inflate = viewStub.inflate();
                                                            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                                                            ViewGroup viewGroup = (ViewGroup) inflate;
                                                            C38089GpI c38089GpI2 = this.A0C;
                                                            if (c38089GpI2 != null) {
                                                                C69025Vg1 c69025Vg1 = new C69025Vg1(c38089GpI2, exploreTopicCluster);
                                                                getSession();
                                                                C14360o3.A0B(viewGroup, 2);
                                                                View inflate2 = LayoutInflater.from(requireContext()).inflate(R.layout.explore_follow_button, viewGroup);
                                                                C0fQ.A00(new WMP(inflate2, c69025Vg1), inflate2.findViewById(R.id.follow_topic_btn));
                                                                return;
                                                            }
                                                        } else {
                                                            return;
                                                        }
                                                    } else {
                                                        if (!c93y2.A03) {
                                                            return;
                                                        }
                                                        ViewStub viewStub2 = (ViewStub) requireView().findViewById(R.id.nido_treatment_stub);
                                                        viewStub2.setLayoutResource(R.layout.explore_parent_layout);
                                                        View inflate3 = viewStub2.inflate();
                                                        C14360o3.A0C(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
                                                        ViewGroup viewGroup2 = (ViewGroup) inflate3;
                                                        MR7 mr7 = this.A0N;
                                                        if (mr7 != null) {
                                                            mr7.D8U(viewGroup2, this, getSession());
                                                        }
                                                        C57312k6 A00 = C07Y.A00(getViewLifecycleOwner());
                                                        C9DH c9dh = new C9DH(this, viewGroup2, gt7, null, 47);
                                                        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, A00);
                                                        return;
                                                    }
                                                }
                                                C14360o3.A0F("exploreSurface");
                                                throw C00O.createAndThrow();
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F("exploreGridDelegate");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(C38P c38p) {
        C37934GmW c37934GmW = c38p.A0E;
        String str = "dataStore";
        if (c37934GmW != null) {
            if (c37934GmW.A02 != null) {
                InterfaceC09390do interfaceC09390do = c38p.A0t;
                C38144GqB c38144GqB = (C38144GqB) interfaceC09390do.getValue();
                C37934GmW c37934GmW2 = c38p.A0E;
                if (c37934GmW2 != null) {
                    c38144GqB.A00 = c37934GmW2.A02;
                    C38089GpI c38089GpI = c38p.A0C;
                    if (c38089GpI == null) {
                        str = "exploreGridDelegate";
                    } else {
                        c38089GpI.A02 = (C38144GqB) interfaceC09390do.getValue();
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(C38P c38p) {
        InterfaceC62602sz interfaceC62602sz = c38p.A0T;
        if (interfaceC62602sz == null) {
            C14360o3.A0F("loadMoreInterface");
            throw C00O.createAndThrow();
        }
        if (interfaceC62602sz.CUG()) {
            C19280xC A00 = C19280xC.A00(c38p, "action_bar_feed_retry");
            C150856qj.A03(c38p.requireContext(), A00);
            AbstractC11060iN.A00(c38p.getSession()).EHW(A00);
        }
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        return (UserSession) this.A1A.getValue();
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A02;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("scrollableNavigationHelper");
            throw C00O.createAndThrow();
        }
        return viewOnTouchListenerC60632pm;
    }

    @Override // X.InterfaceC60172oz
    public final boolean CVP() {
        C93Y c93y = this.A0D;
        if (c93y == null) {
            C14360o3.A0F("exploreSurface");
            throw C00O.createAndThrow();
        }
        if (!c93y.A05) {
            UserSession session = getSession();
            C14360o3.A0B(session, 0);
            if (C3o3.A00(session).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC60172oz
    public final boolean Cen() {
        C7DK c7dk;
        C5TA c5ta;
        C93Y c93y = this.A0D;
        if (c93y == null) {
            C14360o3.A0F("exploreSurface");
            throw C00O.createAndThrow();
        }
        if (!c93y.A05 && ((c7dk = AbstractC123725im.A00(getSession()).A00) == null || (!c7dk.A0C() && ((c5ta = c7dk.A06) == null || !c5ta.A01)))) {
            UserSession session = getSession();
            C14360o3.A0B(session, 0);
            if (C3o3.A00(session).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        String str;
        C11520jB c11520jB = new C11520jB();
        if (this.A0B == null) {
            str = "headerController";
        } else {
            C37934GmW c37934GmW = this.A0E;
            if (c37934GmW == null) {
                str = "dataStore";
            } else {
                ExploreTopicCluster exploreTopicCluster = c37934GmW.A02;
                C11500j9 c11500j9 = C5I8.A9J;
                if (exploreTopicCluster != null) {
                    c11520jB.A04(c11500j9, exploreTopicCluster.A06);
                    c11520jB.A04(C5I8.A9L, exploreTopicCluster.A0A);
                    c11520jB.A04(C5I8.A9M, AbstractC127885qH.A00(exploreTopicCluster.A03));
                    c11520jB.A04(C5I8.A9I, exploreTopicCluster.A05);
                    String str2 = this.A0V;
                    if (str2 == null) {
                        str = "exploreSessionId";
                    } else {
                        c11520jB.A04(C5I8.A83, str2);
                        return c11520jB;
                    }
                } else {
                    c11520jB.A04(c11500j9, "explore_all:0");
                    return c11520jB;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        String str;
        C37934GmW c37934GmW = this.A0E;
        C11520jB c11520jB = null;
        if (c37934GmW == null) {
            str = "dataStore";
        } else {
            ExploreTopicCluster exploreTopicCluster = c37934GmW.A02;
            if (exploreTopicCluster != null) {
                c11520jB = new C11520jB();
                String str2 = this.A0V;
                str = "exploreSessionId";
                if (str2 != null) {
                    AbstractC38158GqP.A00(str2);
                    c11520jB.A04(C5I8.A9J, exploreTopicCluster.A06);
                    c11520jB.A04(C5I8.A9L, exploreTopicCluster.A0A);
                    c11520jB.A04(C5I8.A9M, AbstractC127885qH.A00(exploreTopicCluster.A03));
                    c11520jB.A04(C5I8.A9I, exploreTopicCluster.A05);
                    c11520jB.A0A("topic_cluster_session_id", str2);
                    c11520jB.A0A("topic_nav_order", String.valueOf(0));
                }
            }
            return c11520jB;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        C65823Tug c65823Tug = this.A06;
        String str = "grid";
        if (c65823Tug != null) {
            c65823Tug.A03();
            JPU jpu = this.A0B;
            if (jpu == null) {
                str = "headerController";
            } else {
                jpu.EMG();
                UserSession session = getSession();
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, session, 36317405938324626L)) {
                    C37934GmW c37934GmW = this.A0E;
                    if (c37934GmW == null) {
                        str = "dataStore";
                    } else {
                        Long l = c37934GmW.A04;
                        if (l != null) {
                            if (System.currentTimeMillis() - l.longValue() > TimeUnit.SECONDS.toMillis(C18U.A01(c06090Tz, getSession(), 36598880915098944L))) {
                                C65823Tug c65823Tug2 = this.A06;
                                if (c65823Tug2 != null) {
                                    C3FQ c3fq = c65823Tug2.A06;
                                    if (c3fq != null && (c3fq instanceof C3FR)) {
                                        C3FR c3fr = (C3FR) c3fq;
                                        if (c3fr.CbL()) {
                                            c3fr.ElT();
                                        }
                                    }
                                    if (C18U.A06(c06090Tz, getSession(), 36328224958987610L)) {
                                        C38089GpI c38089GpI = this.A0C;
                                        if (c38089GpI == null) {
                                            str = "exploreGridDelegate";
                                        } else {
                                            View view = c38089GpI.A01;
                                            if (view != null) {
                                                view.performHapticFeedback(1);
                                            } else {
                                                str = "rootView";
                                            }
                                        }
                                    }
                                    C38135Gq2 c38135Gq2 = this.A0J;
                                    if (c38135Gq2 == null) {
                                        str = "viewController";
                                    } else {
                                        c38135Gq2.A02(true);
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
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

    @Override // X.C1M1
    public final String getSessionId() {
        String str = this.A0V;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 808) {
            C93Y c93y = this.A0D;
            if (c93y == null) {
                C14360o3.A0F("exploreSurface");
                throw C00O.createAndThrow();
            }
            if (c93y.A04 && i2 == -1) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    return;
                }
                return;
            }
        } else if (i == 15739) {
            VWZ.A00(getSession()).A00(requireActivity());
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public C38P() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0y = AbstractC09440dt.A00(enumC09460dv, C44210JgE.A00);
        this.A0o = C38U.A00;
        this.A0f = new C37330GcY();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A0p = obj;
        this.A0X = B79.A00;
        this.A0x = AbstractC09440dt.A00(enumC09460dv, C57364PdO.A00);
        this.A0q = AbstractC09440dt.A01(new C9E1(this, 46));
        this.A0z = AbstractC09440dt.A01(new C206889Dt(this, 4));
        this.A0d = 600000L;
        this.A0u = AbstractC09440dt.A01(C9Q9.A00);
        this.A0v = AbstractC09440dt.A01(B78.A00);
        this.A0w = AbstractC09440dt.A01(new C206889Dt(this, 0));
        this.A0s = AbstractC09440dt.A01(new C9E1(this, 48));
        this.A0r = AbstractC09440dt.A01(new C9E1(this, 47));
        this.A18 = C39362Ha2.A00;
        this.A17 = new C38198Gr3(this);
        this.A0t = C1XM.A00(new C9E1(this, 49));
        this.A14 = new C36157FxW(this);
        this.A1A = AbstractC60492pY.A02(this);
        this.A0h = new C38216GrL(this);
        this.A0j = new C38161GqS(this);
        this.A16 = new C38207GrC(this);
        this.A19 = new C37935GmX(this);
        this.A0i = new C42422IqP(this);
        this.A0g = new C42414IqH(this);
        this.A15 = new IC1(this);
        this.A0n = new C42563Ish(this);
        this.A0m = new IC2(this);
        this.A0e = new C42128Ilc(this);
        this.A12 = new C42262Inm(this);
        this.A13 = new C65824Tuh(this);
        this.A11 = new C70719Wfk(this);
        this.A10 = new C42108IlI(this);
        this.A0k = new IL0(this);
        this.A0l = new C69533Vqx(this);
    }

    private final void A00() {
        String str;
        UserSession session = getSession();
        String str2 = this.A0V;
        if (str2 == null) {
            str = "exploreSessionId";
        } else {
            C37934GmW c37934GmW = this.A0E;
            if (c37934GmW == null) {
                str = "dataStore";
            } else {
                AbstractC37836Gkq.A01(this, session, c37934GmW.A02, str2, "canceled");
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        return E6P();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        Integer num;
        ExploreTopicCluster exploreTopicCluster;
        ExploreFragmentConfig exploreFragmentConfig = (ExploreFragmentConfig) requireArguments().getParcelable("ExploreFragment.ARGUMENT_CONFIG");
        if (exploreFragmentConfig != null && (exploreTopicCluster = exploreFragmentConfig.A02) != null) {
            num = exploreTopicCluster.A03;
        } else {
            num = null;
        }
        if (num == C05F.A1F) {
            return "explore_interest";
        }
        return "explore_popular";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Integer num;
        if (AbstractC153456vF.A02(getSession())) {
            ImmutableSet A03 = ImmutableSet.A03(AbstractC153456vF.A01);
            Integer num2 = null;
            if (A03 != null) {
                num = Integer.valueOf(A03.size());
            } else {
                num = null;
            }
            C14360o3.A0A(num);
            if (num.intValue() <= 0) {
                ImmutableSet A032 = ImmutableSet.A03(AbstractC153456vF.A02);
                if (A032 != null) {
                    num2 = Integer.valueOf(A032.size());
                }
                C14360o3.A0A(num2);
                if (num2.intValue() <= 0) {
                    AbstractC153456vF.A00 = false;
                }
            }
            C38084GpD c38084GpD = this.A08;
            if (c38084GpD == null) {
                C14360o3.A0F("exploreMultiHideLogger");
                throw C00O.createAndThrow();
            }
            C18920wW c18920wW = c38084GpD.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(395));
            A00.AAP("action", "ig_explore_controls_multi_hide_unsaved_changes_shown");
            A00.AAP("nudge_name", AbstractC111324zv.A00(4939));
            A00.Cht();
            C193328hC c193328hC = new C193328hC(requireContext());
            c193328hC.A0A(2131976209);
            c193328hC.A09(2131976208);
            c193328hC.A0I(DialogInterfaceOnClickListenerC23168AOh.A00, 2131968555);
            c193328hC.A0J(new DialogInterfaceOnClickListenerC41790If6(this), 2131977166);
            C0fJ.A00(c193328hC.A02());
            return true;
        }
        UserSession session = getSession();
        C14360o3.A0B(session, 0);
        session.A01(C47441KxW.class, new C50159MDm(session, 42));
        requireActivity();
        JWq.A00(getSession()).A00(requireActivity());
        C30A c30a = this.A0L;
        if (c30a == null || !c30a.onBackPressed()) {
            FragmentActivity requireActivity = requireActivity();
            C1OU c1ou = C1OU.$redex_init_class;
            C3M4 A05 = C3M4.A05(requireActivity);
            if (A05 == null || !A05.A0b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x0421, code lost:
    
        if (X.C18U.A06(r5, r2, 36312866157364585L) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0436, code lost:
    
        if (X.C18U.A06(r5, r2, 36312866157364585L) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0f7d, code lost:
    
        if (X.C18U.A06(r5, r2, 36312866157364585L) == false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0f92, code lost:
    
        if (X.C18U.A06(r5, r2, 36312866157364585L) == false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x02b9, code lost:
    
        if (r2 == 4) goto L62;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:352:0x0be3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0c5d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0c54 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0c45 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0bd3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0c3a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0bd3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0c78  */
    /* JADX WARN: Type inference failed for: r112v0, types: [X.2pS, X.1M1, X.2or, X.0iw, X.07e, X.07X, X.38P, androidx.fragment.app.Fragment, X.2oh, java.lang.Object, X.309, X.2oe] */
    /* JADX WARN: Type inference failed for: r1v193, types: [X.1M1, X.1M0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v102, types: [X.4ED, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v6, types: [X.2y7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r31v3, types: [X.VIU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v56, types: [X.JIG] */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.2fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28, types: [X.2sP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.2zG] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r113) {
        /*
            Method dump skipped, instructions count: 4164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38P.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate;
        int A02 = C0f9.A02(-1436834244);
        C14360o3.A0B(layoutInflater, 0);
        JPU jpu = this.A0B;
        if (jpu == null) {
            str = "headerController";
        } else {
            jpu.D8R(layoutInflater, viewGroup);
            str = "grid";
            if (getActivity() != null && viewGroup != null) {
                if (this.A06 != null) {
                    inflate = C50802Vb.A00(layoutInflater, null, viewGroup, R.layout.layout_grid_recyclerview_wrapper, 0, false, true);
                    C0f9.A09(-1178653587, A02);
                    return inflate;
                }
            } else if (this.A06 != null) {
                inflate = layoutInflater.inflate(R.layout.layout_grid_recyclerview_wrapper, viewGroup, false);
                C0f9.A09(-1178653587, A02);
                return inflate;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-566555920);
        super.onDestroy();
        C31561Dtm A00 = JWq.A00(getSession());
        Long l = A00.A05;
        if (l != null) {
            A00.A01 += A00.A08.now() - l.longValue();
        }
        A00.A03 = null;
        C38137Gq4 c38137Gq4 = this.A0c;
        if (c38137Gq4 == null) {
            C14360o3.A0F("commonViewControl");
            throw C00O.createAndThrow();
        }
        C42411xV.A00(c38137Gq4.A06).A08(c38137Gq4.A01.getModuleName());
        C25671My A002 = AbstractC25651Mw.A00(getSession());
        A002.A02(this.A12, C42251Inb.class);
        A002.A02(this.A13, C70073Cr.class);
        A002.A02(this.A11, C3D2.class);
        C32S c32s = this.A0R;
        if (c32s != null) {
            c32s.A0B();
        }
        C0f9.A09(389133246, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1239787221);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof IgFragmentActivity) {
            ((IgFragmentActivity) requireActivity).unregisterOnActivityResultListener(this.A14);
        }
        A00();
        super.onDestroyView();
        C66177U2s c66177U2s = this.A0S;
        String str = "grid";
        if (c66177U2s != null) {
            C65823Tug c65823Tug = this.A06;
            if (c65823Tug != null) {
                C1I4 c1i4 = new C1I4[]{c66177U2s}[0];
                C61372qz c61372qz = c65823Tug.A0G;
                C14360o3.A0B(c1i4, 0);
                c61372qz.A01.remove(c1i4);
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C56352iT.A0t.A03(requireActivity()).A0N.setVisibility(8);
        C65823Tug c65823Tug2 = this.A06;
        if (c65823Tug2 != null) {
            c65823Tug2.A01();
            JPU jpu = this.A0B;
            if (jpu == null) {
                str = "headerController";
            } else {
                jpu.onDestroyView();
                C38137Gq4 c38137Gq4 = this.A0c;
                if (c38137Gq4 == null) {
                    str = "commonViewControl";
                } else {
                    C218914p.A06(c38137Gq4.A05);
                    C41451vu c41451vu = C41451vu.A01;
                    c41451vu.A03(c38137Gq4.A04, C3NF.class);
                    c41451vu.A03(c38137Gq4.A02, C42661xu.class);
                    AbstractC25651Mw.A00(c38137Gq4.A06).A02(c38137Gq4.A03, C36060Fvw.class);
                    IM0 im0 = this.A0U;
                    if (im0 != null) {
                        synchronized (im0) {
                            java.util.Set set = im0.A02;
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                im0.A01.EGO((View) it.next());
                            }
                            set.clear();
                        }
                    }
                    MR7 mr7 = this.A0N;
                    if (mr7 != null) {
                        mr7.onDestroyView();
                    }
                    Gt7 gt7 = this.A0M;
                    if (gt7 != null) {
                        C141796aw A00 = AbstractC141776au.A00(gt7);
                        PZG pzg = new PZG(gt7, (InterfaceC23621Ds) null, 10);
                        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, pzg, A00);
                    }
                    C0f9.A09(-816058742, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-561029359);
        C65823Tug c65823Tug = this.A06;
        String str = "grid";
        if (c65823Tug != null) {
            c65823Tug.A0D.AGc();
            JIG jig = this.A07;
            if (jig == null) {
                str = "videoPlayerManager";
            } else {
                jig.EE9();
                super.onPause();
                A00();
                JPU jpu = this.A0B;
                if (jpu == null) {
                    str = "headerController";
                } else {
                    jpu.onPause();
                    C38137Gq4 c38137Gq4 = this.A0c;
                    if (c38137Gq4 == null) {
                        str = "commonViewControl";
                    } else {
                        UserSession userSession = c38137Gq4.A06;
                        C42411xV.A00(userSession);
                        C11T.A00();
                        C11T.A00();
                        FragmentActivity fragmentActivity = c38137Gq4.A00;
                        C1OU c1ou = C1OU.$redex_init_class;
                        C3M4 A05 = C3M4.A05(fragmentActivity);
                        if (A05 != null) {
                            A05.A0T();
                        }
                        C1BX c1bx = ((C97694a4) userSession.A01(C97694a4.class, new C57517Pfr(userSession, 35))).A00;
                        if (c1bx != null) {
                            c1bx.A09();
                        }
                        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A02;
                        if (viewOnTouchListenerC60632pm == null) {
                            str = "scrollableNavigationHelper";
                        } else {
                            C65823Tug c65823Tug2 = this.A06;
                            if (c65823Tug2 != null) {
                                C3FQ c3fq = c65823Tug2.A06;
                                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                                viewOnTouchListenerC60632pm.A09(c3fq);
                                C26661Qv.A00(getSession()).EGT(this.A10);
                                C31561Dtm A00 = JWq.A00(getSession());
                                Long l = A00.A05;
                                if (l != null) {
                                    A00.A01 += A00.A08.now() - l.longValue();
                                }
                                AbstractC104474nD.A00(getSession()).A01(new C104744ne(null, new C09530e4(EnumC104514nH.A07, EnumC104534nJ.A03)));
                                C3MJ c3mj = this.A0Z;
                                str = "screenshotDetector";
                                if (c3mj != null) {
                                    c3mj.A06(this.A0a);
                                    C3MJ c3mj2 = this.A0Z;
                                    if (c3mj2 != null) {
                                        c3mj2.A04();
                                        this.A0a = null;
                                        C0f9.A09(-1118671192, A02);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        String str2;
        List list;
        int A02 = C0f9.A02(1866034560);
        super.onResume();
        C77433dT c77433dT = this.A0A;
        if (c77433dT == null) {
            str = "exploreQuickPromotionHelper";
        } else {
            c77433dT.A00(null);
            AnonymousClass746.A00(getSession()).A01(requireActivity());
            JPU jpu = this.A0B;
            str = "headerController";
            if (jpu != null) {
                jpu.onResume();
                JPU jpu2 = this.A0B;
                if (jpu2 != null) {
                    ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A02;
                    if (viewOnTouchListenerC60632pm == null) {
                        str = "scrollableNavigationHelper";
                    } else {
                        jpu2.AJK(viewOnTouchListenerC60632pm, new U03(this));
                        C65823Tug c65823Tug = this.A06;
                        str = "grid";
                        if (c65823Tug != null) {
                            c65823Tug.A0D.EJ1();
                            C38137Gq4 c38137Gq4 = this.A0c;
                            if (c38137Gq4 == null) {
                                str = "commonViewControl";
                            } else {
                                UserSession userSession = c38137Gq4.A06;
                                C3MA A00 = C3M9.A00(userSession);
                                InterfaceC11380iw interfaceC11380iw = c38137Gq4.A01;
                                A00.A00(interfaceC11380iw);
                                C42411xV.A00(userSession);
                                C11T.A00();
                                C11T.A00();
                                FragmentActivity fragmentActivity = c38137Gq4.A00;
                                C1OU c1ou = C1OU.$redex_init_class;
                                C3M4 A05 = C3M4.A05(fragmentActivity);
                                if (A05 != null && A05.A0a()) {
                                    A05.A0X(null, null, interfaceC11380iw, null);
                                }
                                C31561Dtm A002 = JWq.A00(getSession());
                                A002.A05 = Long.valueOf(A002.A08.now());
                                C26661Qv.A00(getSession()).AAd(this.A10);
                                C66095TzW c66095TzW = this.A04;
                                if (c66095TzW == null) {
                                    str = "adapter";
                                } else {
                                    c66095TzW.A04 = true;
                                    if (AbstractC66119Tzx.A00(getSession()).A00) {
                                        C65823Tug c65823Tug2 = this.A06;
                                        if (c65823Tug2 != null) {
                                            c65823Tug2.A02();
                                            AbstractC66119Tzx.A00(getSession()).A00 = false;
                                        }
                                    }
                                    C38144GqB c38144GqB = (C38144GqB) this.A0t.getValue();
                                    if (c38144GqB.A04()) {
                                        c38144GqB.A09.clear();
                                        c38144GqB.A08.clear();
                                        Object value = c38144GqB.A0C.getValue();
                                        C14360o3.A07(value);
                                        if (((Boolean) value).booleanValue() && (str2 = c38144GqB.A01) != null) {
                                            UserSession userSession2 = c38144GqB.A04;
                                            if (AbstractC38168GqZ.A00(userSession2).A00.containsKey(str2) && (list = (List) AbstractC38168GqZ.A00(userSession2).A00.get(str2)) != null) {
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj : list) {
                                                    if (obj instanceof C40971v4) {
                                                        arrayList.add(obj);
                                                    }
                                                }
                                                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
                                                Iterator it = arrayList.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add(((C40971v4) it.next()).A0K.getId());
                                                }
                                                for (Map.Entry entry : AbstractC06930Yk.A0B(c38144GqB.A0A).entrySet()) {
                                                    C38169Gqa A003 = AbstractC38168GqZ.A00(userSession2);
                                                    Object key = entry.getKey();
                                                    C14360o3.A0B(key, 0);
                                                    List list2 = (List) A003.A00.get(key);
                                                    Boolean bool = null;
                                                    if (list2 != null) {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (Object obj2 : list2) {
                                                            if (obj2 instanceof C40971v4) {
                                                                arrayList3.add(obj2);
                                                            }
                                                        }
                                                        ArrayList arrayList4 = new ArrayList(AbstractC06950Ym.A1E(arrayList3, 10));
                                                        Iterator it2 = arrayList3.iterator();
                                                        while (it2.hasNext()) {
                                                            arrayList4.add(((C40971v4) it2.next()).A0K.getId());
                                                        }
                                                        bool = Boolean.valueOf(AbstractC001800i.A0t(AbstractC001800i.A0l(arrayList4, arrayList2)));
                                                    }
                                                    if (C14360o3.A0K(bool, true)) {
                                                        entry.getKey();
                                                        C38144GqB.A01(c38144GqB, (String) entry.getKey());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    C3MJ c3mj = this.A0Z;
                                    str = "screenshotDetector";
                                    if (c3mj != null) {
                                        C3MT A004 = C3MJ.A00(new C3MR() { // from class: X.9QA
                                            @Override // X.C3MR
                                            public final void Dih(long j) {
                                                C38P c38p = C38P.this;
                                                if (C18U.A06(C06090Tz.A05, c38p.getSession(), 36320051636215766L)) {
                                                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c38p.getSession()), "screenshot_taken_v2");
                                                    if (A0f.isSampled()) {
                                                        A0f.AAP("surface", c38p.getModuleName());
                                                        String str3 = c38p.getSession().userId;
                                                        C14360o3.A0B(str3, 0);
                                                        A0f.A9K(AbstractC111324zv.A00(1368), AbstractC166997dE.A0j(str3));
                                                        A0f.Cht();
                                                    }
                                                }
                                            }
                                        });
                                        c3mj.A03();
                                        C3MJ c3mj2 = this.A0Z;
                                        if (c3mj2 != null) {
                                            c3mj2.A05(A004);
                                            this.A0a = A004;
                                            C66085TzM c66085TzM = this.A01;
                                            if (c66085TzM == null) {
                                                str = "autoplayManagerConnector";
                                            } else {
                                                UserSession session = getSession();
                                                C14360o3.A0B(session, 0);
                                                C65868TvV A005 = c66085TzM.A00(session);
                                                if (A005 != null) {
                                                    A005.A00();
                                                }
                                                View view = this.mView;
                                                if (view != null) {
                                                    view.post(new RunnableC44212JgG(this));
                                                }
                                                C0f9.A09(1591652767, A02);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1568314126);
        super.onStart();
        C226218q.A01(AbstractC12960li.A00).A0T((C44224JgU) this.A0y.getValue());
        C0f9.A09(175455069, A02);
    }
}
