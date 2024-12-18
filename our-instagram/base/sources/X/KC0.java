package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes8.dex */
public final class KC0 extends AbstractC59962oe implements InterfaceC50489MQr, C88U, C87U {
    public static final String __redex_internal_original_name = "EffectMiniGallerySearchFragment";
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public Jo1 A04;
    public C44545Jmp A05;
    public C87T A06;
    public IgTextView A07;
    public L2V A08;
    public SearchEditText A09;
    public JoQ A0A;
    public String A0D;
    public int A0B = 4;
    public Integer A0C = C05F.A0N;
    public final Handler A0E = AbstractC167007dF.A0J();
    public final InterfaceC09390do A0F = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_camera_mini_gallery_search_page";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // X.C88U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSearchSubmitted(com.instagram.ui.widget.searchedittext.SearchEditText r9, java.lang.String r10) {
        /*
            r8 = this;
            r5 = 1
            X.C14360o3.A0B(r10, r5)
            int r0 = r10.length()
            r7 = 0
            boolean r2 = X.AbstractC167007dF.A1N(r0)
            java.lang.String r0 = "clearButton"
            android.view.View r1 = r8.A01
            if (r2 == 0) goto L3f
            if (r1 == 0) goto L37
            r0 = 8
            r1.setVisibility(r0)
        L1a:
            X.Jo1 r1 = r8.A04
            if (r1 == 0) goto L29
            java.util.List r0 = r1.A06
            r0.clear()
            X.Jo1.A00(r1)
            r1.notifyDataSetChanged()
        L29:
            X.Jmp r3 = r8.A05
            if (r3 == 0) goto L77
            X.87T r0 = r8.A06
            if (r0 == 0) goto L77
            X.JoQ r0 = r8.A0A
            if (r0 != 0) goto L45
            java.lang.String r0 = "paginationScrollListener"
        L37:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3f:
            if (r1 == 0) goto L37
            r1.setVisibility(r7)
            goto L1a
        L45:
            r0.A00 = r5
            java.lang.String r0 = X.AbstractC13670mt.A01(r10)
            r3.A00 = r0
            X.195 r0 = r3.A02
            r4 = 0
            if (r0 == 0) goto L55
            r0.AGH(r4)
        L55:
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L78
            int r0 = r0.length()
            if (r0 == 0) goto L78
            X.6aw r2 = X.AbstractC141776au.A00(r3)
            r1 = 13
            X.MCP r0 = new X.MCP
            r0.<init>(r3, r4, r1)
            X.1Dx r0 = X.AbstractC25226BEj.A1L(r0, r2)
            r3.A02 = r0
        L70:
            X.87T r0 = r8.A06
            if (r0 == 0) goto L77
            r0.A09(r10)
        L77:
            return
        L78:
            X.87T r6 = r3.A07
            X.87k r2 = r6.A02
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L9b
            int r1 = r0.intValue()
            X.2GS r0 = r2.A00
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r0.get(r1)
            X.9CD r0 = (X.C9CD) r0
            if (r0 == 0) goto L9b
            java.lang.String r0 = r0.A02
            r6.A0A(r0)
        L9b:
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            X.L0l r0 = new X.L0l
            r0.<init>(r4, r1, r7)
            java.lang.String r1 = r3.A00
            X.3NX r0 = X.AbstractC25225BEi.A0z(r0)
            X.C44545Jmp.A01(r3, r0, r1, r5)
            X.6aw r1 = X.AbstractC141776au.A00(r3)
            r0 = 48
            X.MCD.A02(r3, r1, r0)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KC0.onSearchSubmitted(com.instagram.ui.widget.searchedittext.SearchEditText, java.lang.String):void");
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(searchEditText, 0);
        onSearchSubmitted(searchEditText, searchEditText.getSearchString());
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.search_bar_container);
        SearchEditText searchEditText = (SearchEditText) A0S.requireViewById(R.id.search_bar);
        searchEditText.A0C = this;
        ViewOnTouchListenerC48084LQj.A01(searchEditText, 2, this);
        this.A09 = searchEditText;
        View requireViewById = A0S.requireViewById(R.id.back_button);
        this.A00 = requireViewById;
        if (requireViewById == null) {
            str = "backButton";
        } else {
            C3P9 A0s = AbstractC166987dD.A0s(requireViewById);
            A0s.A04 = new KKp(this, 0);
            A0s.A07 = true;
            A0s.A0D = true;
            A0s.A00();
            View requireViewById2 = A0S.requireViewById(R.id.clear_button);
            this.A01 = requireViewById2;
            if (requireViewById2 == null) {
                str = "clearButton";
            } else {
                C3P9 A0s2 = AbstractC166987dD.A0s(requireViewById2);
                A0s2.A04 = new KKp(this, 1);
                A0s2.A07 = true;
                A0s2.A0D = true;
                A0s2.A00();
                this.A03 = AbstractC31172DnG.A0G(view, R.id.camera_effect_preview_video_recycler_view);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), this.A0B);
                RecyclerView recyclerView = this.A03;
                str = "gridRecyclerView";
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(gridLayoutManager);
                    JoQ joQ = new JoQ(gridLayoutManager, new C49677Lx8(this), 16);
                    this.A0A = joQ;
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null) {
                        recyclerView2.A14(joQ);
                        RecyclerView recyclerView3 = this.A03;
                        if (recyclerView3 != null) {
                            recyclerView3.setAdapter(this.A04);
                            RecyclerView recyclerView4 = this.A03;
                            if (recyclerView4 != null) {
                                int i = this.A0B;
                                int A06 = AbstractC167017dG.A06(requireContext());
                                Context context = view.getContext();
                                recyclerView4.A10(new JoI(i, A06, false, AbstractC13620mo.A02(context)));
                                C14360o3.A07(context);
                                L2V l2v = new L2V(context, view, AbstractC166987dD.A0r(this.A0F), this);
                                this.A08 = l2v;
                                SearchEditText searchEditText2 = this.A09;
                                if (searchEditText2 != null) {
                                    l2v.A00 = searchEditText2;
                                }
                                this.A02 = view.requireViewById(R.id.effect_search_not_found_container);
                                this.A07 = AbstractC31172DnG.A0X(view, R.id.effect_search_not_found_text);
                                C87T c87t = this.A06;
                                if (c87t != null) {
                                    A01(this, c87t.A02.A03);
                                    return;
                                }
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

    public static final void A00(KC0 kc0) {
        SearchEditText searchEditText = kc0.A09;
        if (searchEditText != null && searchEditText.isFocused()) {
            searchEditText.clearFocus();
            AbstractC13880nE.A0O(searchEditText);
            C87T c87t = kc0.A06;
            if (c87t != null) {
                c87t.A0P.Egh(EnumC1824387i.A02);
            }
            kc0.A0E.postDelayed(new RunnableC49830Lzb(kc0), 100L);
        }
    }

    public static final void A01(KC0 kc0, String str) {
        SearchEditText searchEditText = kc0.A09;
        if (searchEditText != null) {
            int length = str.length();
            if (length == 0) {
                searchEditText.setHint(2131973002);
                SearchEditText searchEditText2 = kc0.A09;
                if (searchEditText2 != null) {
                    AbstractC31171DnF.A14(searchEditText2);
                }
            } else {
                searchEditText.setText(str);
                searchEditText.setSelection(length);
            }
        }
        C87T c87t = kc0.A06;
        if (c87t != null) {
            c87t.A09(str);
        }
    }

    @Override // X.C87U
    public final void DAo(int i) {
        C87T c87t = this.A06;
        if (c87t != null) {
            c87t.DAo(i);
        }
        L2V l2v = this.A08;
        if (l2v == null) {
            C14360o3.A0F("nullStateController");
            throw C00O.createAndThrow();
        }
        Jnq jnq = l2v.A02;
        jnq.notifyItemRemoved(i);
        jnq.A00 = U07.A00(jnq.A01).A00();
        jnq.notifyDataSetChanged();
    }

    @Override // X.InterfaceC50489MQr
    public final void DXZ() {
        String searchString;
        SearchEditText searchEditText = this.A09;
        if (searchEditText == null || (searchString = searchEditText.getSearchString()) == null || searchString.length() == 0) {
            SearchEditText searchEditText2 = this.A09;
            if (searchEditText2 != null) {
                searchEditText2.requestFocus();
            }
            C3DN A01 = C3DN.A00.A01(requireContext());
            if (A01 != null) {
                A01.A0U(C05F.A04);
            }
            this.A0E.postDelayed(new RunnableC49832Lzd(this), 100L);
        }
    }

    @Override // X.C87U
    public final void DdD(int i) {
        SearchEditText searchEditText;
        C87T c87t = this.A06;
        if (c87t != null) {
            c87t.DdD(i);
            String str = c87t.A02.A03;
            if (str.length() > 0 && (searchEditText = this.A09) != null) {
                searchEditText.setText(str);
                searchEditText.setSelection(str.length());
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
    }

    @Override // X.InterfaceC50489MQr
    public final boolean isScrolledToBottom() {
        if (this.A03 == null) {
            C14360o3.A0F("gridRecyclerView");
            throw C00O.createAndThrow();
        }
        return !r1.canScrollVertically(1);
    }

    @Override // X.InterfaceC50489MQr
    public final boolean isScrolledToTop() {
        if (this.A03 == null) {
            C14360o3.A0F("gridRecyclerView");
            throw C00O.createAndThrow();
        }
        return !AbstractC43592JPx.A1X(r0);
    }

    @Override // X.InterfaceC50489MQr
    public final void DXQ() {
        A00(this);
        SearchEditText searchEditText = this.A09;
        if (searchEditText != null) {
            AbstractC31171DnF.A14(searchEditText);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1319139771);
        super.onCreate(bundle);
        requireArguments();
        this.A0D = AbstractC166997dE.A0n();
        this.A0B = 3;
        this.A0C = C05F.A0Y;
        setModuleNameV2("ig_camera_mini_gallery_search_page");
        C0f9.A09(-355403322, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int i;
        C87T c87t;
        InterfaceC09390do interfaceC09390do;
        String str;
        String str2;
        int A02 = C0f9.A02(-1043537491);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentActivity requireActivity = requireActivity();
        try {
            this.A06 = (C87T) new C52942bb(requireActivity).A00(C87T.class);
            c87t = (C87T) new C52942bb(requireActivity).A00(C87T.class);
            C48236LWl c48236LWl = new C48236LWl(this, c87t);
            int A06 = AbstractC167017dG.A06(requireContext());
            Integer num = this.A0C;
            int i2 = this.A0B;
            interfaceC09390do = this.A0F;
            this.A04 = new Jo1(requireActivity, null, c48236LWl, this, AbstractC166987dD.A0r(interfaceC09390do), num, A06, i2, false);
            str = c87t.A06;
        } catch (Exception e) {
            C0w9.A06(__redex_internal_original_name, "Exception retrieving MiniGalleryViewModel", e);
            C87T c87t2 = this.A06;
            boolean z = true;
            if (c87t2 == null || !c87t2.A09) {
                z = false;
            }
            if (z) {
                inflate = JQ0.A0D(layoutInflater, this).inflate(R.layout.effect_mini_gallery_search_page_layout, viewGroup, false);
            } else {
                inflate = layoutInflater.inflate(R.layout.effect_mini_gallery_search_page_layout, viewGroup, false);
            }
            i = 1314344762;
        }
        if (str != null) {
            String str3 = this.A0D;
            if (str3 == null) {
                str2 = "searchSessionId";
            } else {
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                MiniGalleryService miniGalleryService = c87t.A0D;
                AbstractC167017dG.A1R(A0r, miniGalleryService);
                C44545Jmp c44545Jmp = (C44545Jmp) new C52942bb(new C45600KGo(miniGalleryService, c87t, A0r, str, str3, 1), this).A00(C44545Jmp.class);
                this.A05 = c44545Jmp;
                if (c44545Jmp != null) {
                    C4T4.A00(c44545Jmp.A08).Cj4(XkZ.A04, c44545Jmp.A09, c44545Jmp.A0A);
                }
                C44545Jmp c44545Jmp2 = this.A05;
                if (c44545Jmp2 != null) {
                    C2GS c2gs = c44545Jmp2.A04;
                    C14360o3.A0C(c2gs, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.ar.core.discovery.minigallery.viewmodels.PagedData<com.instagram.camera.effect.models.effectpreview.EffectPreviewItem>>");
                    AbstractC43593JPy.A1E(getViewLifecycleOwner(), c2gs, new C50356MLi(this, 38), 9);
                }
                AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC31172DnG.A0E(c87t.A04.A00), new C50356MLi(this, 39), 9);
                C2GS c2gs2 = c87t.A02.A01;
                C14360o3.A0C(c2gs2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.ar.core.discovery.minigallery.viewmodels.MiniGalleryViewModel.SearchState>");
                AbstractC43593JPy.A1E(getViewLifecycleOwner(), c2gs2, new C50356MLi(this, 40), 9);
                C87T c87t3 = this.A06;
                boolean z2 = true;
                if (c87t3 == null || !c87t3.A09) {
                    z2 = false;
                }
                if (z2) {
                    inflate = JQ0.A0D(layoutInflater, this).inflate(R.layout.effect_mini_gallery_search_page_layout, viewGroup, false);
                } else {
                    inflate = layoutInflater.inflate(R.layout.effect_mini_gallery_search_page_layout, viewGroup, false);
                }
                i = -1129216423;
                C0f9.A09(i, A02);
                return inflate;
            }
        } else {
            str2 = "discoverySessionId";
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
