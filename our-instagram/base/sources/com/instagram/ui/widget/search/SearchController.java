package com.instagram.ui.widget.search;

import X.AbstractC13670mt;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31173DnH;
import X.AbstractC53242c7;
import X.AbstractC58319PtB;
import X.AbstractC58662mP;
import X.AbstractC60592pi;
import X.AbstractC65392xb;
import X.AbstractC68606VXh;
import X.AbstractC70163Da;
import X.AbstractC70663Fe;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0fQ;
import X.C0w9;
import X.C18U;
import X.C1I2;
import X.C1I4;
import X.C2UU;
import X.C36303Fzy;
import X.C3I7;
import X.C3I9;
import X.C44225JgV;
import X.C55982hj;
import X.C58652mO;
import X.C66295U7t;
import X.C69476Vnz;
import X.C88U;
import X.GX2;
import X.InterfaceC55932he;
import X.InterfaceC60152ox;
import X.InterfaceC71990XEd;
import X.JYX;
import X.VgK;
import X.ViewOnClickListenerC35687FpM;
import X.WNS;
import X.XBQ;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.search.ImeBackButtonHandlerFrameLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes11.dex */
public class SearchController extends AbstractC60592pi implements View.OnClickListener, InterfaceC55932he, View.OnFocusChangeListener, InterfaceC60152ox, C88U, XBQ, GX2 {
    public float A00;
    public float A01;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public C2UU A09;
    public AbstractC65392xb A0A;
    public final int A0B;
    public final int A0C;
    public final ArgbEvaluator A0D;
    public final Activity A0E;
    public final C36303Fzy A0F;
    public final InterfaceC71990XEd A0G;
    public final boolean A0H;
    public final int A0I;
    public final C55982hj A0J;
    public final C3I9 A0K;
    public C69476Vnz mViewHolder;

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        final C69476Vnz c69476Vnz;
        C36303Fzy c36303Fzy;
        boolean A1O = AbstractC167007dF.A1O(i);
        this.A06 = A1O;
        if (A1O && (c36303Fzy = this.A0F) != null) {
            c36303Fzy.A05(5);
        }
        if (this.A08 && (c69476Vnz = this.mViewHolder) != null) {
            final ViewGroup.LayoutParams layoutParams = c69476Vnz.A0E.getLayoutParams();
            ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout = c69476Vnz.A0E;
            imeBackButtonHandlerFrameLayout.getParent().getClass();
            int height = ((View) imeBackButtonHandlerFrameLayout.getParent()).getHeight() - i;
            layoutParams.height = height;
            layoutParams.height = height + (this.A06 ? this.A0I : 0);
            imeBackButtonHandlerFrameLayout.post(new Runnable() { // from class: X.WvP
                @Override // java.lang.Runnable
                public final void run() {
                    C69476Vnz c69476Vnz2 = c69476Vnz;
                    ViewGroup.LayoutParams layoutParams2 = layoutParams;
                    ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout2 = c69476Vnz2.A0E;
                    if (imeBackButtonHandlerFrameLayout2 != null) {
                        imeBackButtonHandlerFrameLayout2.setLayoutParams(layoutParams2);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public final void A00() {
        C69476Vnz c69476Vnz = this.mViewHolder;
        if (c69476Vnz != null) {
            AbstractC13880nE.A0O(c69476Vnz.A0F);
        }
    }

    public final void A01(Integer num, float f, float f2, boolean z) {
        C55982hj c55982hj = this.A0J;
        if (c55982hj.A0C()) {
            this.A02 = num;
            c55982hj.A08(0.0d, true);
            this.A00 = f;
            this.A01 = f2;
            if (z) {
                c55982hj.A06(1.0d);
            } else {
                c55982hj.A08(1.0d, true);
            }
        }
    }

    public final void A02(boolean z, float f) {
        A01(C05F.A01, f, 0.0f, z);
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        double d;
        double d2;
        float f = (float) c55982hj.A09.A00;
        double d3 = f;
        float A03 = (float) AbstractC70163Da.A03(d3, this.A00, this.A01);
        Integer num = this.A02;
        Integer num2 = C05F.A01;
        if (num == num2) {
            d = 0.0d;
            d2 = 1.0d;
        } else {
            d = 1.0d;
            d2 = 0.0d;
        }
        float A032 = (float) AbstractC70163Da.A03(d3, d, d2);
        int intValue = ((Number) this.A0D.evaluate(f, Integer.valueOf(this.A0B), Integer.valueOf(this.A0C))).intValue();
        C69476Vnz c69476Vnz = this.mViewHolder;
        if (c69476Vnz != null) {
            ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout = c69476Vnz.A0E;
            int i = 0;
            int i2 = 4;
            if (A032 > 0.0f) {
                i2 = 0;
            }
            imeBackButtonHandlerFrameLayout.setVisibility(i2);
            View view = c69476Vnz.A05;
            if (A032 <= 0.0f) {
                i = 4;
            }
            view.setVisibility(i);
            c69476Vnz.A07.setAlpha(A032);
            c69476Vnz.A0D.setAlpha(A032);
            c69476Vnz.A08.setAlpha(1.0f - A032);
            View view2 = c69476Vnz.A03;
            view2.setBackgroundColor(intValue);
            view2.setAlpha(A032);
            view.setAlpha(A032);
            c69476Vnz.A0E.setTranslationY(A03);
            InterfaceC71990XEd interfaceC71990XEd = this.A0G;
            interfaceC71990XEd.Cwf(this, this.A02, f, A03);
            if (f == 1.0f) {
                if (this.A02 == num2) {
                    num2 = C05F.A0C;
                } else {
                    num2 = C05F.A00;
                }
            }
            Integer num3 = this.A03;
            if (num2 != num3) {
                this.A03 = num2;
                int intValue2 = num3.intValue();
                if (intValue2 != 0) {
                    if (intValue2 == 2) {
                        SearchEditText searchEditText = c69476Vnz.A0F;
                        searchEditText.setText("");
                        searchEditText.clearFocus();
                        AbstractC13880nE.A0O(searchEditText);
                    }
                } else {
                    SearchEditText searchEditText2 = c69476Vnz.A0F;
                    searchEditText2.A03();
                    AbstractC13880nE.A0R(searchEditText2);
                }
                interfaceC71990XEd.DoO(this, this.A03, num3);
            }
        }
    }

    @Override // X.XBQ
    public final boolean onBackPressed() {
        InterfaceC71990XEd interfaceC71990XEd = this.A0G;
        interfaceC71990XEd.DEw();
        Integer num = C05F.A00;
        A01(num, 0.0f, interfaceC71990XEd.Aby(this, num), true);
        return true;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
        if (AbstractC68606VXh.A00(AbstractC58319PtB.A08(this.A0E), configuration)) {
            this.A0K.DiY();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        C69476Vnz c69476Vnz = this.mViewHolder;
        if (c69476Vnz != null) {
            c69476Vnz.A0E.A00 = null;
            ListView listView = c69476Vnz.A00;
            if (listView != null) {
                listView.setOnScrollListener(null);
            }
            RecyclerView recyclerView = c69476Vnz.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter(null);
                C1I4 c1i4 = c69476Vnz.A0A;
                if (c1i4 != null) {
                    recyclerView.A15(c1i4);
                }
            }
        } else {
            C0w9.A03("SearchController", "Expected onDestroyView to be called only once");
        }
        AbstractC65392xb abstractC65392xb = this.A0A;
        C2UU c2uu = this.A09;
        if (c2uu != null && abstractC65392xb != null) {
            c2uu.unregisterAdapterDataObserver(abstractC65392xb);
        }
        this.mViewHolder = null;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.A0G.DjB(this, z);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A0J.A0B(this);
        C3I9 c3i9 = this.A0K;
        c3i9.EFx(this);
        c3i9.onStop();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A0J.A0A(this);
        C3I9 c3i9 = this.A0K;
        c3i9.Dnr(this.A0E);
        c3i9.A9e(this);
    }

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        this.A0G.DjP(str, this.A05);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC65392xb abstractC65392xb = this.A0A;
        C2UU c2uu = this.A09;
        if (c2uu != null && abstractC65392xb != null) {
            c2uu.registerAdapterDataObserver(abstractC65392xb);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-2082710107);
        C69476Vnz c69476Vnz = this.mViewHolder;
        if (c69476Vnz != null && view == c69476Vnz.A0D) {
            onBackPressed();
        }
        C0f9.A0C(-1365146296, A05);
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        C69476Vnz c69476Vnz;
        String A01 = AbstractC13670mt.A01(searchEditText.getSearchString());
        String A0g = AbstractC167007dF.A0g(searchEditText);
        if (A01 != null) {
            this.A0G.DjS(A01, A0g);
        }
        C69476Vnz c69476Vnz2 = this.mViewHolder;
        if (this.A07 && c69476Vnz2 != null) {
            ListView listView = c69476Vnz2.A00;
            if (listView != null) {
                listView.setSelectionAfterHeaderView();
            } else {
                RecyclerView recyclerView = c69476Vnz2.A01;
                if (recyclerView != null) {
                    recyclerView.A0o(0);
                }
            }
        }
        if (this.A0H && (c69476Vnz = this.mViewHolder) != null) {
            c69476Vnz.A09.setVisibility(AbstractC167007dF.A05(charSequence.length()));
        }
    }

    public SearchController(Activity activity, ViewGroup viewGroup, UserSession userSession, C36303Fzy c36303Fzy, C1I2 c1i2, VgK vgK, InterfaceC71990XEd interfaceC71990XEd, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        AbstractC58662mP abstractC58662mP;
        IgSimpleImageView igSimpleImageView;
        this.A05 = false;
        this.A04 = false;
        Integer num = C05F.A00;
        this.A03 = num;
        this.A02 = num;
        this.A08 = true;
        this.A0E = activity;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        this.A0J = A0R;
        this.A0G = interfaceC71990XEd;
        this.A0D = new ArgbEvaluator();
        this.A0H = z9;
        this.A0F = c36303Fzy;
        Context context = viewGroup.getContext();
        this.A0B = context.getColor(AbstractC53242c7.A0D(context));
        this.A0C = AbstractC53242c7.A0F(activity, R.attr.actionBarBackgroundColor);
        this.A0K = C3I7.A01(this, false, false);
        ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout = (ImeBackButtonHandlerFrameLayout) LayoutInflater.from(context).inflate(R.layout.search_overlay, viewGroup, false);
        this.A0I = i2;
        C69476Vnz c69476Vnz = new C69476Vnz(c1i2, imeBackButtonHandlerFrameLayout, vgK, z2);
        this.mViewHolder = c69476Vnz;
        ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout2 = c69476Vnz.A0E;
        imeBackButtonHandlerFrameLayout2.A00 = this;
        C0fQ.A00(this, c69476Vnz.A0D);
        SearchEditText searchEditText = c69476Vnz.A0F;
        searchEditText.A0C = this;
        searchEditText.setOnFocusChangeListener(this);
        searchEditText.A0E = this;
        searchEditText.setEllipsize(TextUtils.TruncateAt.END);
        if (z9) {
            C0fQ.A00(new ViewOnClickListenerC35687FpM(68, this, c69476Vnz), c69476Vnz.A09);
        }
        if (z3) {
            IgSimpleImageView igSimpleImageView2 = c69476Vnz.A0B;
            igSimpleImageView2.setScaleX(0.84f);
            igSimpleImageView2.setScaleY(0.84f);
            igSimpleImageView2.setVisibility(0);
            WNS.A00(igSimpleImageView2, 23, this);
            if (z8) {
                AbstractC31173DnH.A0z(c69476Vnz.A04.getContext(), c69476Vnz.A06, R.drawable.elevated_rounded_meta_ai_searchbar_background);
            }
            if (z6 || z7) {
                igSimpleImageView2.setScaleX(2.0f);
                igSimpleImageView2.setScaleY(2.0f);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart(AbstractC166997dE.A04(context, z8 ? R.dimen.ad4ad_button_bottom_margin : R.dimen.accent_edge_thickness));
                layoutParams.setMarginEnd(AbstractC167017dG.A0A(context));
                igSimpleImageView2.setLayoutParams(layoutParams);
                C06090Tz c06090Tz = C06090Tz.A05;
                boolean A06 = C18U.A06(c06090Tz, userSession, 36329985895842411L);
                if (z6) {
                    abstractC58662mP = (AbstractC58662mP) context.getDrawable(A06 ? R.drawable.gen_ai_assets_meta_ai_fast_wink_fade_twist_fade_twist_thick_kf_28dp : R.drawable.meta_ai_animations_conversion_kf_mai_24dp_flip_28px);
                    igSimpleImageView2.setImageDrawable(abstractC58662mP);
                    if (z7) {
                        JYX.A00(context.getResources(), C18U.A06(c06090Tz, userSession, 36329985895842411L) ? R.drawable.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_28dp : R.drawable.meta_ai_animations_conversion_kf_mai_28dp_ambient_spin);
                        C58652mO c58652mO = (C58652mO) context.getDrawable(C18U.A06(c06090Tz, userSession, 36329985895842411L) ? R.drawable.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_28dp : R.drawable.meta_ai_animations_conversion_kf_mai_28dp_ambient_spin);
                        c58652mO.setVisible(true, true);
                        abstractC58662mP.A8x(new C66295U7t(c58652mO, this, j));
                    }
                } else {
                    abstractC58662mP = (AbstractC58662mP) context.getDrawable(A06 ? R.drawable.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_28dp : R.drawable.meta_ai_animations_conversion_kf_mai_28dp_ambient_spin);
                    C69476Vnz c69476Vnz2 = this.mViewHolder;
                    if (c69476Vnz2 != null && (igSimpleImageView = c69476Vnz2.A0B) != null) {
                        igSimpleImageView.setImageDrawable(abstractC58662mP);
                        if (j > 0) {
                            abstractC58662mP.EH0((int) j);
                        } else {
                            abstractC58662mP.EH1();
                        }
                    }
                }
                abstractC58662mP.E4S();
            }
        }
        if (z4) {
            C69476Vnz c69476Vnz3 = this.mViewHolder;
            if (!this.A04 && c69476Vnz3 != null) {
                this.A04 = true;
                if (z5) {
                    Activity activity2 = this.A0E;
                    Drawable drawable = activity2.getDrawable(R.drawable.instagram_direct_gen_ai_pano_filled_24);
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(activity2.getColor(R.color.badge_color), PorterDuff.Mode.SRC_IN);
                    IgSimpleImageView igSimpleImageView3 = c69476Vnz3.A0C;
                    igSimpleImageView3.setColorFilter(porterDuffColorFilter);
                    igSimpleImageView3.setImageDrawable(drawable);
                }
                IgSimpleImageView igSimpleImageView4 = c69476Vnz3.A0C;
                igSimpleImageView4.setVisibility(0);
                WNS.A00(igSimpleImageView4, 22, this);
                C36303Fzy c36303Fzy2 = this.A0F;
                if (c36303Fzy2 != null) {
                    c36303Fzy2.A05(1);
                }
            }
        }
        viewGroup.addView(imeBackButtonHandlerFrameLayout2);
        if (i != -1) {
            AbstractC13880nE.A0f(imeBackButtonHandlerFrameLayout2, i);
        }
        if (z) {
            View view = c69476Vnz.A03;
            AbstractC13880nE.A0c(view, view.getPaddingEnd() + activity.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material));
        }
    }

    public SearchController(Activity activity, ViewGroup viewGroup, C2UU c2uu, AbstractC70663Fe abstractC70663Fe, UserSession userSession, C36303Fzy c36303Fzy, C1I2 c1i2, VgK vgK, InterfaceC71990XEd interfaceC71990XEd, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this(activity, viewGroup, userSession, c36303Fzy, c1i2, vgK, interfaceC71990XEd, -1, i, j, false, true, z, z2, z3, z4, z5, z6, z7);
        RecyclerView recyclerView;
        this.A09 = c2uu;
        C69476Vnz c69476Vnz = this.mViewHolder;
        if (c69476Vnz != null && (recyclerView = c69476Vnz.A01) != null) {
            recyclerView.setLayoutManager(abstractC70663Fe);
            RecyclerView recyclerView2 = c69476Vnz.A01;
            recyclerView2.setAdapter(c2uu);
            recyclerView2.setItemAnimator(null);
            recyclerView2.A0S = true;
        }
        this.A0A = new C44225JgV(2, this, abstractC70663Fe);
    }

    public SearchController(Activity activity, ViewGroup viewGroup, ListAdapter listAdapter, UserSession userSession, C1I2 c1i2, InterfaceC71990XEd interfaceC71990XEd, int i, int i2, boolean z) {
        this(activity, viewGroup, userSession, null, c1i2, null, interfaceC71990XEd, i, i2, 0L, z, false, false, false, false, false, false, false, false);
        ListView listView;
        C69476Vnz c69476Vnz = this.mViewHolder;
        if (c69476Vnz == null || (listView = c69476Vnz.A00) == null) {
            return;
        }
        listView.setAdapter(listAdapter);
    }
}
