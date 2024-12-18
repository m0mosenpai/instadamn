package X;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HD4 extends C38K implements AbsListView.OnScrollListener, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PBIAProxyProfileFragment";
    public int A00;
    public int A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public InterfaceC56362iU A05;
    public InterfaceC38371qR A06;
    public C71L A07;
    public HEL A08;
    public C41188ILb A09;
    public II2 A0A;
    public C42590It8 A0B;
    public EmptyStateView A0C;
    public RefreshableListView A0D;
    public C1M1 A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public AnonymousClass396 A0K;
    public SourceModelInfoParams A0L;
    public final InterfaceC09390do A0N;
    public final C61372qz A0P = new C61372qz();
    public final InterfaceC09390do A0O = AbstractC60492pY.A02(this);
    public final InterfaceC60442pS A0Q = AbstractC60952qJ.A01("pbia_proxy_profile", true, false);
    public final InterfaceC60442pS A0M = AbstractC60952qJ.A01("pbia_proxy_profile", true, true);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A05 = interfaceC56362iU;
        A02(this);
        interfaceC56362iU.EkS(true);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0A = R.layout.navbar_overflow_button;
        A0B.A05 = 2131966337;
        A0B.A0G = new ViewOnClickListenerC31724DwT(this, 48);
        interfaceC56362iU.AAB(new C3LY(A0B));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "pbia_proxy_profile";
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RefreshableListView refreshableListView;
        String str;
        KeyEvent.Callback callback;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ListView A02 = AbstractC37300Gc1.A02(this);
        EmptyStateView emptyStateView = null;
        if (A02 instanceof RefreshableListView) {
            refreshableListView = (RefreshableListView) A02;
        } else {
            refreshableListView = null;
        }
        this.A0D = refreshableListView;
        if (refreshableListView != null) {
            refreshableListView.setIsLoading(true);
            refreshableListView.setOnScrollListener(this);
        }
        C41188ILb c41188ILb = this.A09;
        if (c41188ILb == null) {
            str2 = "dataFetcher";
        } else {
            String str3 = this.A0F;
            if (str3 == null) {
                str2 = "adId";
            } else {
                if (this.A06 == null) {
                    str = this.A0G;
                } else {
                    str = null;
                }
                c41188ILb.A00(str3, str, this.A0H);
                RefreshableListView refreshableListView2 = this.A0D;
                if (refreshableListView2 != null) {
                    callback = refreshableListView2.getEmptyView();
                } else {
                    callback = null;
                }
                if (callback instanceof EmptyStateView) {
                    emptyStateView = (EmptyStateView) callback;
                }
                this.A0C = emptyStateView;
                if (emptyStateView != null) {
                    emptyStateView.A0N(new ViewOnClickListenerC42034Ik3(33, emptyStateView, this), EnumC153216up.A04);
                    emptyStateView.A0L();
                }
                C71313Hs.A00(AbstractC166987dD.A0r(this.A0O)).A05(view, EnumC71343Hv.A0O);
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final UserSession A01(HD4 hd4) {
        return AbstractC166987dD.A0r(hd4.A0O);
    }

    public static final void A02(HD4 hd4) {
        InterfaceC56362iU interfaceC56362iU;
        String A0G;
        C38321qM BQN;
        User A2D;
        InterfaceC38371qR interfaceC38371qR = hd4.A06;
        if (interfaceC38371qR != null && (BQN = interfaceC38371qR.BQN()) != null && (A2D = BQN.A2D()) != null && hd4.A0H != null && C14360o3.A0K(A2D.getId(), hd4.A0H)) {
            interfaceC56362iU = hd4.A05;
            if (interfaceC56362iU != null) {
                A0G = A2D.getFullName();
            } else {
                return;
            }
        } else {
            InterfaceC38371qR interfaceC38371qR2 = hd4.A06;
            if (interfaceC38371qR2 == null || (interfaceC56362iU = hd4.A05) == null) {
                return;
            } else {
                A0G = AbstractC41071vF.A0G(AbstractC166987dD.A0r(hd4.A0O), interfaceC38371qR2.BQN());
            }
        }
        interfaceC56362iU.setTitle(A0G);
    }

    public static final void A03(HD4 hd4, int i) {
        InterfaceC38371qR interfaceC38371qR;
        TextView A0e;
        ViewGroup viewGroup = hd4.A04;
        if (viewGroup != null && (interfaceC38371qR = hd4.A06) != null) {
            InterfaceC09390do interfaceC09390do = hd4.A0O;
            C1565771f.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(interfaceC38371qR.BQN().A2E(AbstractC166987dD.A0r(interfaceC09390do)), i);
            if (viewGroup.findViewById(R.id.profile_tombstone) == null) {
                viewGroup.addView(hd4.A02);
                View view = hd4.A02;
                if (view != null && (A0e = AbstractC166987dD.A0e(view, R.id.tombstone_feedback_text)) != null) {
                    int i2 = 2131975664;
                    if (i == 1) {
                        i2 = 2131975665;
                    }
                    A0e.setText(i2);
                }
                AbstractC167007dF.A0w(hd4.A02);
                View view2 = hd4.A02;
                if (view2 != null) {
                    view2.bringToFront();
                }
                viewGroup.invalidate();
            }
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0r(this.A0O);
    }

    public HD4() {
        DGZ dgz = new DGZ(this, 5);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGZ(new DGZ(this, 6), 7));
        this.A0N = AbstractC25225BEi.A0a(new DGZ(A00, 8), dgz, new C57255Pbd(31, null, A00), AbstractC25225BEi.A1D(C61142qc.class));
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, X.392] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1109002706);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C61972ry c61972ry = new C61972ry(requireContext(), AbstractC018607g.A00(this), null);
        InterfaceC09390do interfaceC09390do = this.A0O;
        this.A09 = new C41188ILb(c61972ry, AbstractC166987dD.A0r(interfaceC09390do), this);
        this.A0F = AbstractC153636vY.A01(requireArguments, "PBIAProxyProfileFragment.AD_ID");
        SourceModelInfoParams sourceModelInfoParams = (SourceModelInfoParams) AbstractC153636vY.A00(requireArguments, SourceModelInfoParams.class, "PBIAProxyProfileFragment.SOURCE_MODEL_INFO_PARAMS");
        this.A0L = sourceModelInfoParams;
        String str = "sourceModelInfoParams";
        if (sourceModelInfoParams != null) {
            this.A0G = sourceModelInfoParams.A06;
            this.A0H = sourceModelInfoParams.A08;
            this.A01 = sourceModelInfoParams.A02;
            this.A00 = sourceModelInfoParams.A00;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            String string = requireArguments.getString("PBIAProxyProfileFragment.AD_RETRIEVAL_KEY");
            String str2 = this.A0G;
            C14360o3.A0B(A0r, 0);
            InterfaceC38371qR interfaceC38371qR = null;
            if (str2 != null) {
                interfaceC38371qR = AbstractC151266rU.A00(A0r, string, str2);
            }
            this.A06 = interfaceC38371qR;
            if (interfaceC38371qR == null) {
                C0f5 AEp = C18950wb.A01.AEp("PBIAProxyProfileFragment#media is null from media cache", 817903741);
                String str3 = this.A0G;
                String str4 = this.A0F;
                if (str4 == null) {
                    str = "adId";
                } else {
                    AEp.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A0u("Media Id: ", str3, ", Ad Id: ", str4));
                    AEp.report();
                }
            }
            this.A0E = C1M3.A00();
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            InterfaceC60442pS interfaceC60442pS = this.A0Q;
            InterfaceC60442pS interfaceC60442pS2 = this.A0M;
            SourceModelInfoParams sourceModelInfoParams2 = this.A0L;
            if (sourceModelInfoParams2 != null) {
                C1M1 c1m1 = this.A0E;
                str = "sessionIdProvider";
                if (c1m1 != null) {
                    this.A0B = new C42590It8(this, A0r2, interfaceC60442pS, interfaceC60442pS2, sourceModelInfoParams2, c1m1);
                    C60972qL c60972qL = new C60972qL(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), interfaceC60442pS);
                    FragmentActivity requireActivity = requireActivity();
                    C61142qc c61142qc = (C61142qc) this.A0N.getValue();
                    C42590It8 c42590It8 = this.A0B;
                    String str5 = "delegate";
                    if (c42590It8 != null) {
                        HEL hel = new HEL(requireActivity, c61142qc, c60972qL, c42590It8, c42590It8);
                        this.A08 = hel;
                        A0U(hel);
                        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        ViewOnTouchListenerC60632pm A00 = AbstractC60622pl.A00(requireContext(), null, false);
                        HEL hel2 = this.A08;
                        str5 = "adapter";
                        if (hel2 != null) {
                            C61372qz c61372qz = this.A0P;
                            C33A c33a = new C33A(this, A00, c61372qz, hel2);
                            AnonymousClass391 anonymousClass391 = new AnonymousClass391(this, this.mFragmentManager, hel2, c60972qL);
                            C1M1 c1m12 = this.A0E;
                            if (c1m12 != null) {
                                anonymousClass391.A0R = c1m12;
                                anonymousClass391.A0C = c33a;
                                anonymousClass391.A0B = new Object();
                                this.A0K = anonymousClass391.A00();
                                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                                HEL hel3 = this.A08;
                                if (hel3 != null) {
                                    C3CO c3co = new C3CO(A0r3, hel3, false, false);
                                    InterfaceC60602pj c675132q = new C675132q(this, AbstractC166987dD.A0r(interfaceC09390do), interfaceC60442pS2);
                                    c3co.A01();
                                    AnonymousClass396 anonymousClass396 = this.A0K;
                                    if (anonymousClass396 != null) {
                                        c61372qz.A01(anonymousClass396);
                                    }
                                    C60462pV c60462pV = new C60462pV();
                                    c60462pV.A0E(this.A0K);
                                    c60462pV.A0E(c3co);
                                    c60462pV.A0E(c675132q);
                                    A0a(c60462pV);
                                    C0f9.A09(-1629118300, A02);
                                    return;
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str5);
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewGroup viewGroup2;
        TextView A0e;
        TextPaint paint;
        TextPaint paint2;
        int A02 = C0f9.A02(1431932206);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_feed, viewGroup, false);
        ViewGroup viewGroup3 = null;
        TextView textView = null;
        if ((inflate instanceof ViewGroup) && (viewGroup2 = (ViewGroup) inflate) != null) {
            this.A03 = viewGroup2;
            ViewGroup viewGroup4 = (ViewGroup) viewGroup2.findViewById(R.id.layout_listview_parent_container);
            this.A04 = viewGroup4;
            View inflate2 = layoutInflater.inflate(R.layout.layout_profile_tombstone, viewGroup4, false);
            this.A02 = inflate2;
            if (inflate2 != null) {
                textView = AbstractC166987dD.A0e(inflate2, R.id.tombstone_show_post);
            }
            if (textView != null && (paint2 = textView.getPaint()) != null) {
                paint2.setFakeBoldText(true);
            }
            View view = this.A02;
            if (view != null && (A0e = AbstractC166987dD.A0e(view, R.id.tombstone_header_text)) != null && (paint = A0e.getPaint()) != null) {
                paint.setFakeBoldText(true);
            }
            if (textView != null) {
                ViewOnClickListenerC42032Ik1.A01(textView, 45, this);
            }
            viewGroup3 = this.A03;
            i = -2031277506;
        } else {
            i = 302533539;
        }
        C0f9.A09(i, A02);
        return viewGroup3;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1390205026);
        super.onDestroy();
        C61372qz c61372qz = this.A0P;
        c61372qz.A00.remove(this.A0K);
        this.A0K = null;
        this.A07 = null;
        C0f9.A09(-240367692, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1339973487);
        super.onDestroyView();
        this.A03 = null;
        this.A04 = null;
        this.A02 = null;
        this.A0D = null;
        this.A0C = null;
        C0f9.A09(1758039539, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(-238428632);
        C14360o3.A0B(absListView, 0);
        HEL hel = this.A08;
        if (hel != null) {
            if (hel.A02) {
                if (LJW.A01()) {
                    AbstractC167007dF.A0J().postDelayed(new J3G(this), 0L);
                } else if (LJW.A02(absListView)) {
                    HEL hel2 = this.A08;
                    if (hel2 != null) {
                        hel2.A02 = false;
                    }
                }
                C0f9.A0A(1566644051, A03);
                return;
            }
            this.A0P.onScroll(absListView, i, i2, i3);
            C0f9.A0A(1566644051, A03);
            return;
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, -367900843);
        HEL hel = this.A08;
        if (hel == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (!hel.A02) {
            this.A0P.onScrollStateChanged(absListView, i);
        }
        C0f9.A0A(1717719102, A0N);
    }
}
