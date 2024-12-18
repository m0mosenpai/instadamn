package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.TwP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65918TwP extends AbstractC65919TwQ implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SingleSearchTypeaheadTabFragment";
    public int A00;
    public InterfaceC56362iU A02;
    public C31349DqE A03;
    public U1Z A04;
    public AnimatedHintsTextLayout A05;
    public SearchEditText A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public C66155U1w A0Q;
    public Boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public String A0A = "";
    public final InterfaceC09390do A0f = AbstractC09440dt.A01(new X2z(this, 11));
    public final InterfaceC09390do A0h = AbstractC09440dt.A01(new X2z(this, 13));
    public final InterfaceC09390do A0i = AbstractC09440dt.A01(new X2z(this, 14));
    public final InterfaceC09390do A0g = AbstractC09440dt.A01(new X2z(this, 12));
    public final U28 A0c = new U28(this);
    public final U2Q A0a = new U2Q();
    public long A01 = 750;
    public boolean A0P = true;
    public final InterfaceC09390do A0j = AbstractC09440dt.A01(new X2z(this, 15));
    public final InterfaceC60152ox A0m = new U31(this, 4);
    public final C31703Dw8 A0l = new C31703Dw8(this, 7);
    public final C49664Lwv A0k = new C49664Lwv(this, 2);
    public final String A0e = "search_top";
    public final Integer A0d = C05F.A00;
    public final C65918TwP A0b = this;

    public static final void A06(C65918TwP c65918TwP, String str, String str2) {
        boolean z;
        Integer num;
        Boolean valueOf;
        A02(c65918TwP);
        SearchEditText searchEditText = c65918TwP.A06;
        boolean z2 = false;
        if (searchEditText != null) {
            searchEditText.setEndEmojiButtonEnabled(false);
        }
        Keyword keyword = new Keyword(null, str);
        String E6d = ((AbstractC65919TwQ) c65918TwP).A0i.E6d();
        String A0j = AbstractC167017dG.A0j();
        AnonymousClass729.A00(c65918TwP.A0E()).A00 = new SearchContext(c65918TwP.A09, E6d, str, null, null, A0j, null, null);
        U2H u2h = c65918TwP.A0n;
        C14360o3.A0B(str, 0);
        C65960TxC c65960TxC = u2h.A00.A07;
        if (c65960TxC == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        C9JQ BjO = c65960TxC.A05.BjO(new UQE(str, "fbsearch/keyword_typeahead/", 10));
        if (BjO.A06 == null || (valueOf = Boolean.valueOf(BjO.A09)) == null ? !c65918TwP.A0Z || !((AbstractC65919TwQ) c65918TwP).A0J : !valueOf.equals(true)) {
            z = false;
        } else {
            z = true;
        }
        if (str2.equals("keyboard") && c65918TwP.A0Y && z) {
            z2 = true;
            c65918TwP.A07(c65918TwP.A0A);
            ((C66151U1s) c65918TwP.A0h.getValue()).A05(null, AbstractC111324zv.A00(2194), ((AbstractC65919TwQ) c65918TwP).A01.A01, str, null);
        } else {
            AbstractC152536tg.A00(c65918TwP.A0E(), null, str, 8);
            AbstractC66132U0y.A00(c65918TwP.A0E()).A00(keyword);
            c65918TwP.A08(str, AbstractC111324zv.A00(4625));
        }
        InterfaceC190488c6 A0F = c65918TwP.A0F();
        if (z2) {
            num = C05F.A0K;
        } else {
            num = c65918TwP.A0d;
        }
        A0F.Ciy(num, str2, E6d, str, A0j);
        AnonymousClass747 A00 = AnonymousClass746.A00(c65918TwP.A0E());
        String str3 = c65918TwP.A09;
        if (str3 != null) {
            A00.A02(str3);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0136  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r27) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65918TwP.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "search_typeahead";
    }

    @Override // X.AbstractC65919TwQ, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0M && (this.A0F || this.A0T)) {
            UserSession A0E = A0E();
            C14360o3.A0B(A0E, 0);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, A0E, 36327950082325499L)) {
                UserSession A0E2 = A0E();
                C14360o3.A0B(A0E2, 0);
                if (!C18U.A06(c06090Tz, A0E2, 36320403825893848L)) {
                    AbstractC35257Fgr.A05(requireContext(), A0E(), new WjC(this));
                }
            }
        }
        if (this.A0O) {
            View A0U = AbstractC167017dG.A0U(view, R.id.layout_typeahead_bottom_searchbar);
            C14360o3.A0C(A0U, "null cannot be cast to non-null type com.instagram.ui.widget.edittext.AnimatedHintsTextLayout");
            this.A05 = (AnimatedHintsTextLayout) A0U;
        }
    }

    public static final void A02(C65918TwP c65918TwP) {
        C31349DqE c31349DqE = c65918TwP.A03;
        if (c31349DqE != null) {
            C41451vu.A01.E4s(new C3KF(c31349DqE));
        }
    }

    public static final void A03(C65918TwP c65918TwP) {
        boolean z;
        int i;
        SearchEditText searchEditText = c65918TwP.A06;
        if (searchEditText != null) {
            boolean z2 = true;
            if (c65918TwP.A0F) {
                searchEditText.A08(true);
                z = true;
            } else {
                z = false;
            }
            if (AbstractC167007dF.A1Z(c65918TwP.A0r) && c65918TwP.A0M) {
                if (!c65918TwP.A0W && !c65918TwP.A0E) {
                    if (c65918TwP.A0B) {
                        searchEditText.A0P = false;
                        SearchEditText.A02(searchEditText, false, false);
                    } else {
                        boolean z3 = c65918TwP.A0V;
                        boolean z4 = c65918TwP.A0N;
                        if (z3) {
                            searchEditText.A0O = true;
                            SearchEditText.A02(searchEditText, true, z4);
                            LayerDrawable layerDrawable = searchEditText.A04;
                            if (layerDrawable == null) {
                                layerDrawable = SearchEditText.A00(searchEditText, false);
                                searchEditText.A04 = layerDrawable;
                            }
                            Drawable drawable = searchEditText.A00;
                            Drawable drawable2 = searchEditText.A02;
                            if (drawable2 != null && drawable != null && layerDrawable != null) {
                                int intrinsicWidth = drawable2.getIntrinsicWidth() + drawable.getIntrinsicWidth() + searchEditText.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                                int intrinsicHeight = drawable2.getIntrinsicHeight();
                                if (searchEditText.getSearchString().length() == 0) {
                                    drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), intrinsicHeight);
                                } else {
                                    layerDrawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                                }
                            }
                            LayerDrawable layerDrawable2 = searchEditText.A03;
                            if (layerDrawable2 == null) {
                                layerDrawable2 = SearchEditText.A00(searchEditText, true);
                                searchEditText.A03 = layerDrawable2;
                            }
                            Drawable drawable3 = searchEditText.A01;
                            if (drawable3 != null && drawable != null && layerDrawable2 != null) {
                                int intrinsicWidth2 = drawable3.getIntrinsicWidth() + drawable.getIntrinsicWidth() + searchEditText.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                                int intrinsicHeight2 = drawable3.getIntrinsicHeight();
                                if (searchEditText.getSearchString().length() == 0) {
                                    drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), intrinsicHeight2);
                                } else {
                                    layerDrawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
                                }
                            }
                        } else {
                            searchEditText.A0P = true;
                            SearchEditText.A02(searchEditText, true, z4);
                        }
                    }
                    SearchEditText.A01(searchEditText);
                    searchEditText.setMetaAIClearButtonEnabled(false);
                } else {
                    searchEditText.A0P = false;
                    SearchEditText.A02(searchEditText, false, false);
                    SearchEditText.A01(searchEditText);
                    searchEditText.setMetaAIClearButtonEnabled(true);
                }
            } else {
                if (c65918TwP.A0A.length() <= 0) {
                    z2 = false;
                }
                searchEditText.setClearButtonEnabled(z2);
                z2 = z;
            }
            searchEditText.A0B = c65918TwP.A0k;
            if (z2) {
                if (!c65918TwP.A0E && !c65918TwP.A0B) {
                    searchEditText.setDisableButtonsForIntegrity(c65918TwP.A0S);
                } else {
                    Context requireContext = c65918TwP.requireContext();
                    InterfaceC56362iU interfaceC56362iU = c65918TwP.A02;
                    boolean z5 = c65918TwP.A0S;
                    WNW wnw = new WNW(11, searchEditText, c65918TwP);
                    boolean z6 = c65918TwP.A0N;
                    if (z5) {
                        i = R.drawable.instagram_search_meta_ai_send_icon_disabled_20;
                        if (z6) {
                            i = R.drawable.instagram_search_meta_ai_sparkle_send_icon_disabled_20;
                        }
                    } else {
                        i = R.drawable.instagram_search_meta_ai_send_icon_20;
                        if (z6) {
                            i = R.drawable.instagram_search_meta_ai_sparkle_send_icon_20;
                        }
                    }
                    Drawable drawable4 = requireContext.getDrawable(i);
                    if (z5) {
                        wnw = null;
                    }
                    if (interfaceC56362iU != null) {
                        C56352iT c56352iT = (C56352iT) interfaceC56362iU;
                        ViewGroup viewGroup = c56352iT.A0O;
                        View childAt = viewGroup.getChildAt(viewGroup.indexOfChild(c56352iT.A0Q) + 2);
                        if (childAt instanceof ImageView) {
                            ImageView imageView = (ImageView) childAt;
                            imageView.setImageDrawable(drawable4);
                            C0fQ.A00(wnw, imageView);
                        }
                    }
                }
                if (AbstractC166997dE.A1Z(c65918TwP.A0R, false) && c65918TwP.A0S) {
                    C18920wW c18920wW = (C18920wW) c65918TwP.A0j.getValue();
                    String A0b = AbstractC31178DnM.A0b();
                    String str = c65918TwP.A09;
                    if (str != null) {
                        String str2 = c65918TwP.A0A;
                        AbstractC167007dF.A1E(c18920wW, 0, str2);
                        AbstractC65702TsY.A1P(c18920wW, "instagram_search_meta_ai_airplane_disabled_impression", str, str2, A0b);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
        }
    }

    public static final void A04(C65918TwP c65918TwP) {
        if (!c65918TwP.A0X && !AbstractC167007dF.A1Z(c65918TwP.A0r)) {
            return;
        }
        Boolean CYf = ((AbstractC65919TwQ) c65918TwP).A0g.CYf(c65918TwP.A0A);
        c65918TwP.A0R = Boolean.valueOf(c65918TwP.A0S);
        String str = c65918TwP.A0A;
        Pattern pattern = AbstractC13670mt.A00;
        int A0A = AbstractC167007dF.A0A(str);
        boolean z = false;
        if (A0A > 2 && (CYf == null ? !((AbstractC65919TwQ) c65918TwP).A0I : CYf.equals(false))) {
            z = true;
        }
        c65918TwP.A0S = z;
    }

    public static final void A05(C65918TwP c65918TwP, String str) {
        int length;
        int i;
        C18920wW c18920wW = (C18920wW) c65918TwP.A0j.getValue();
        String str2 = C1QM.A00.A02.A00;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = c65918TwP.A09;
        if (str4 != null) {
            str3 = str4;
        }
        AbstractC167007dF.A1E(c18920wW, 0, str);
        AbstractC65702TsY.A1P(c18920wW, "instagram_search_meta_ai_airplane_tapped", str3, str, str2);
        if (c65918TwP.A0U) {
            length = str.length();
            if (length > 0) {
                c65918TwP.A08(str, AbstractC111324zv.A00(4624));
            }
        } else {
            C66151U1s c66151U1s = (C66151U1s) c65918TwP.A0h.getValue();
            length = str.length();
            if (length == 0) {
                i = 2192;
            } else {
                i = 2195;
            }
            c66151U1s.A05(FVU.A00(EnumC33443EqF.USER_INPUT_PROMPT, null, c65918TwP.A0E(), null, null), AbstractC111324zv.A00(i), ((AbstractC65919TwQ) c65918TwP).A01.A01, str, null);
        }
        if (length > 0) {
            c65918TwP.A07(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r17.A07 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A08(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r3 = r17
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r3.A06
            if (r0 == 0) goto L9
            r0.A04()
        L9:
            com.instagram.common.session.UserSession r0 = r3.A0E()
            X.U2U r7 = X.AbstractC65920TwR.A00(r0)
            X.U2X r6 = X.U2X.A03
            r8 = 0
            long r1 = r6.A00
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L23
            X.1QT r0 = r7.A00
            r0.flowEndSuccess(r1)
            r6.A00 = r4
        L23:
            java.lang.String r0 = r3.A0F
            r7 = r18
            boolean r0 = r7.equals(r0)
            r15 = 0
            r4 = 1
            if (r0 != 0) goto L34
            java.lang.String r0 = r3.A07
            r6 = 1
            if (r0 == 0) goto L35
        L34:
            r6 = 0
        L35:
            com.instagram.common.session.UserSession r2 = r3.A0E()
            X.C14360o3.A0B(r2, r15)
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36317431706162335(0x8106830000149f, double:3.0306282773120624E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            if (r0 == 0) goto L7e
            r0 = 36317431706227872(0x810683000114a0, double:3.030628277353508E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            if (r0 == 0) goto L7e
            if (r6 == 0) goto L7e
            java.lang.String r0 = ""
            r3.A0A = r0
        L5a:
            r3.A0P = r4
        L5c:
            java.lang.String r0 = r3.A0F
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L7d
            X.0do r0 = r3.A0h
            java.lang.Object r6 = r0.getValue()
            X.U1s r6 = (X.C66151U1s) r6
            java.lang.String r9 = "search_typeahead"
            java.lang.String r10 = r3.A07
            java.lang.String r11 = r3.A0F
            java.lang.String r13 = "typeahead"
            java.lang.String r12 = "0"
            r14 = r19
            r16 = r15
            r6.A0B(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L7d:
            return
        L7e:
            com.instagram.common.session.UserSession r2 = r3.A0E()
            X.C14360o3.A0B(r2, r15)
            r0 = 36317431706162335(0x8106830000149f, double:3.0306282773120624E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            if (r0 == 0) goto L9e
            r0 = 36317431706227872(0x810683000114a0, double:3.030628277353508E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            if (r0 != 0) goto L9e
            if (r6 == 0) goto L9e
            goto L5a
        L9e:
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.common.session.UserSession r1 = r3.A0E()
            X.6Yy r0 = new X.6Yy
            r0.<init>(r2, r1)
            r0.A0G(r8, r15)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65918TwP.A08(java.lang.String, java.lang.String):void");
    }

    @Override // X.AbstractC65919TwQ
    public final void A0J(C51621MrE c51621MrE) {
        int i;
        C66155U1w c66155U1w = this.A0Q;
        if (c66155U1w == null) {
            C14360o3.A0F("userBootstrapProvider");
            throw C00O.createAndThrow();
        }
        if (c51621MrE.A03) {
            i = c51621MrE.A00;
        } else {
            i = c66155U1w.A01;
        }
        c66155U1w.A00 = i;
        super.A0J(c51621MrE);
    }

    public final void A0M() {
        A0L(this.A0A, "fbsearch/keyword_typeahead/");
        A04(this);
        A0L(this.A0A, "fbsearch/ig_typeahead/");
        A03(this);
    }

    private final SearchEditText A00(AnimatedHintsTextLayout animatedHintsTextLayout) {
        EditText editText = animatedHintsTextLayout.getEditText();
        C14360o3.A0C(editText, "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText");
        SearchEditText searchEditText = (SearchEditText) editText;
        searchEditText.setHint(AbstractC66179U2u.A00(A0E()));
        UserSession A0E = A0E();
        if (!C18U.A06(AbstractC166997dE.A0U(A0E), A0E, 36328220664151382L)) {
            searchEditText.A07 = new C71097Wnt(this, searchEditText);
        }
        if (this.A0K) {
            searchEditText.A09 = new C71099Wnv(this);
        }
        U1Z u1z = this.A04;
        if (u1z == null) {
            C14360o3.A0F("metaSearchViewpointHelper");
            throw C00O.createAndThrow();
        }
        Integer num = C05F.A00;
        String str = this.A09;
        if (str != null) {
            u1z.A01(searchEditText, num, str, searchEditText.getSearchString());
            return searchEditText;
        }
        throw AbstractC166997dE.A0g();
    }

    private final SearchEditText A01(AnimatedHintsTextLayout animatedHintsTextLayout) {
        LinkedHashMap A00 = U2Y.A00(requireContext(), A0E());
        ((U21) this.A0g.getValue()).A05.putAll(A00);
        this.A05 = animatedHintsTextLayout;
        animatedHintsTextLayout.A0A = new U2Z(this, A00);
        UserSession A0E = A0E();
        Context requireContext = requireContext();
        C14360o3.A0B(A0E, 0);
        List A0a = AbstractC001800i.A0a(U2Y.A00(requireContext, A0E).keySet());
        if (A0a.isEmpty()) {
            A0a = AbstractC166987dD.A1J(requireContext.getString(2131973011));
        }
        animatedHintsTextLayout.setHints(A0a);
        EditText editText = animatedHintsTextLayout.getEditText();
        C14360o3.A0C(editText, "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText");
        return (SearchEditText) editText;
    }

    private final void A07(String str) {
        AbstractC152536tg.A00(A0E(), null, str, 13);
        AbstractC66132U0y.A00(A0E()).A00(new Keyword(null, null, str, null, null, null, null, "meta_ai_suggestion", 0L, false, false));
    }

    @Override // X.AbstractC65919TwQ
    public final C66158U1z A0G() {
        UserSession A0E = A0E();
        C14360o3.A0B(A0E, 0);
        U2V u2v = U2V.A00;
        U2W u2w = (U2W) A0E.A01(U2W.class, u2v);
        String str = this.A09;
        if (str != null) {
            C66158U1z c66158U1z = (C66158U1z) u2w.A00.get(str);
            if (c66158U1z == null) {
                c66158U1z = super.A0G();
            }
            C14360o3.A0C(c66158U1z, "null cannot be cast to non-null type com.instagram.search.common.store.SearchResultsProviderStore.ProviderGroup<com.instagram.search.common.model.BaseSearchEntry>");
            UserSession A0E2 = A0E();
            C14360o3.A0B(A0E2, 0);
            U2W u2w2 = (U2W) A0E2.A01(U2W.class, u2v);
            String str2 = this.A09;
            if (str2 != null) {
                C14360o3.A0B(c66158U1z, 1);
                u2w2.A00.put(str2, c66158U1z);
                return c66158U1z;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return A0E();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A02(this);
        AbstractC65920TwR.A00(A0E()).A00.flowEndCancel(U2X.A03.A00, "TYPEAHEAD_CANCEL");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0187, code lost:
    
        if (r7.A0B == false) goto L17;
     */
    @Override // X.AbstractC65919TwQ, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65918TwP.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC65919TwQ, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1960272918);
        super.onDestroy();
        U1Z u1z = this.A04;
        if (u1z == null) {
            C14360o3.A0F("metaSearchViewpointHelper");
            throw C00O.createAndThrow();
        }
        u1z.A00();
        C0f9.A09(421260163, A02);
    }

    @Override // X.AbstractC65919TwQ, androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1126661141);
        super.onPause();
        SearchEditText searchEditText = this.A06;
        if (searchEditText != null) {
            searchEditText.A04();
        }
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A05;
        if (animatedHintsTextLayout != null) {
            animatedHintsTextLayout.A04();
        }
        C0f9.A09(1244559130, A02);
    }

    @Override // X.AbstractC65919TwQ, X.AbstractC114495Et, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(928085822);
        super.onResume();
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A05;
        if (animatedHintsTextLayout != null) {
            animatedHintsTextLayout.A03();
        }
        A03(this);
        C0f9.A09(-1354646503, A02);
    }

    @Override // X.AbstractC65919TwQ, androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1847680326);
        super.onStart();
        U28 u28 = this.A0c;
        FragmentActivity requireActivity = requireActivity();
        C3I9 c3i9 = u28.A02;
        c3i9.A9e(u28.A01);
        c3i9.Dnr(requireActivity);
        C0f9.A09(778770055, A02);
    }

    @Override // X.AbstractC65919TwQ, androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(2108533762);
        super.onStop();
        U28 u28 = this.A0c;
        C3I9 c3i9 = u28.A02;
        c3i9.EFx(u28.A01);
        c3i9.onStop();
        A02(this);
        C0f9.A09(-1446185899, A02);
    }
}
