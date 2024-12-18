package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KCg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45491KCg extends AbstractC59962oe implements InterfaceC60152ox {
    public static final String __redex_internal_original_name = "DictionaryManagerFragment";
    public RecyclerView A00;
    public C56352iT A01;
    public C44534Jme A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public ViewGroup A07;
    public C3I9 A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "muted_words_dictionary_editor";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = C56342iS.A01(null, AbstractC31176DnK.A0C(view, R.id.dictionary_manager_action_bar));
        C44534Jme c44534Jme = this.A02;
        String str = "viewModel";
        if (c44534Jme != null) {
            AbstractC43593JPy.A1E(this, c44534Jme.A01, new C50268MHx(5, view, this), 41);
            C44534Jme c44534Jme2 = this.A02;
            if (c44534Jme2 != null) {
                c44534Jme2.A02.A06(this, new C151846sU(new C44145JfA(this, 7)));
                TextView A0N = AbstractC167007dF.A0N(view, R.id.dictionary_manager_new_words_input_field);
                View A0S = AbstractC166997dE.A0S(view, R.id.dictionary_manager_new_words_add_button);
                View A0S2 = AbstractC166997dE.A0S(view, R.id.dictionary_manager_new_words_divider);
                Integer num = this.A03;
                if (num != null) {
                    Integer num2 = C05F.A01;
                    int i = 0;
                    if (num == num2) {
                        i = 8;
                    }
                    A0S.setVisibility(i);
                    A0N.setImeOptions(6);
                    A0N.setRawInputType(1);
                    A0N.setOnFocusChangeListener(new LQ4(0, A0S2, this));
                    LO2.A00(A0N, A0S, 14);
                    A0N.setOnEditorActionListener(new WPE(1, this, A0N));
                    LQ1.A00(A0S, 44, this, A0N);
                    C44534Jme c44534Jme3 = this.A02;
                    if (c44534Jme3 != null) {
                        AbstractC43593JPy.A1E(this, c44534Jme3.A01, new C50364MLq(22, A0N, A0S, this), 41);
                        C66392zG A0R = AbstractC31174DnI.A0R(this);
                        A0R.A01(new C45615KHe(new C50261MHq(this, 37)));
                        A0R.A01(new KI1(new C50261MHq(this, 38), new C50261MHq(this, 39)));
                        C66362zD A0R2 = AbstractC31173DnH.A0R(A0R, new C45616KHf(new C50261MHq(this, 40)));
                        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.dictionary_manager_words_list);
                        this.A00 = A0G;
                        str = "wordsList";
                        if (A0G != null) {
                            A0G.setAdapter(A0R2);
                            RecyclerView recyclerView = this.A00;
                            if (recyclerView != null) {
                                AbstractC31177DnL.A17(this, recyclerView);
                                RecyclerView recyclerView2 = this.A00;
                                if (recyclerView2 != null) {
                                    recyclerView2.A0S = true;
                                    C44534Jme c44534Jme4 = this.A02;
                                    if (c44534Jme4 != null) {
                                        AbstractC43593JPy.A1E(this, c44534Jme4.A03, new C50268MHx(6, A0R2, this), 41);
                                        View A0S3 = AbstractC166997dE.A0S(view, R.id.dictionary_manager_upsell_description);
                                        View A0S4 = AbstractC166997dE.A0S(view, R.id.dictionary_manager_description);
                                        String str2 = this.A04;
                                        str = "entryPoint";
                                        if (str2 != null) {
                                            int i2 = 0;
                                            A0S3.setVisibility(AbstractC167007dF.A05(str2.equals("upsell") ? 1 : 0));
                                            String str3 = this.A04;
                                            if (str3 != null) {
                                                if (str3.equals("upsell")) {
                                                    i2 = 8;
                                                }
                                                A0S4.setVisibility(i2);
                                                View A0S5 = AbstractC166997dE.A0S(view, R.id.dictionary_manager_banner_description);
                                                Integer num3 = this.A03;
                                                if (num3 != null) {
                                                    int i3 = 8;
                                                    if (num3 == num2) {
                                                        i3 = 0;
                                                    }
                                                    A0S5.setVisibility(i3);
                                                    C3I9 c3i9 = this.A08;
                                                    if (c3i9 == null) {
                                                        str = "keyboardHeightChangeDetector";
                                                    } else {
                                                        c3i9.A9e(this);
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
                    str = "viewModel";
                }
                str = "surfaceType";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        ViewGroup viewGroup = this.A07;
        if (viewGroup == null) {
            C14360o3.A0F("wordsListViewGroup");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0Y(viewGroup, i);
    }

    @Override // X.AbstractC59972of
    public final void beforeOnPause() {
        if (!this.A05 && !this.A06) {
            C44534Jme c44534Jme = this.A02;
            if (c44534Jme == null) {
                C14360o3.A0F("viewModel");
                throw C00O.createAndThrow();
            }
            MCO.A04(c44534Jme, c44534Jme.A07, 49);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    public static final void A00(EditText editText, C45491KCg c45491KCg) {
        String str;
        String A0g = AbstractC167007dF.A0g(editText);
        if (A0g.length() > 0) {
            C44534Jme c44534Jme = c45491KCg.A02;
            if (c44534Jme == null) {
                str = "viewModel";
            } else {
                AbstractC23641Du.A05(c44534Jme.A06, new MCF(c44534Jme, A0g, null, 27), AbstractC141776au.A00(c44534Jme));
                RecyclerView recyclerView = c45491KCg.A00;
                if (recyclerView == null) {
                    str = "wordsList";
                } else {
                    recyclerView.A0n(0);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        AbstractC31171DnF.A14(editText);
        editText.clearFocus();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Integer num;
        String string;
        String str2;
        int A02 = C0f9.A02(461919448);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("dictionary_manager_entrypoint")) == null) {
            str = "bloks";
        }
        this.A04 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string = bundle3.getString("dictionary_manager_surface_name")) != null) {
            Integer[] A00 = C05F.A00(2);
            int length = A00.length;
            for (int i = 0; i < length; i++) {
                num = A00[i];
                if (1 - num.intValue() != 0) {
                    str2 = "ig_muted_words_comments_and_messages";
                } else {
                    str2 = "ig_muted_words_posts";
                }
                if (str2.equals(string)) {
                    break;
                }
            }
        }
        num = AbstractC47179KtE.A00;
        this.A03 = num;
        InterfaceC09390do interfaceC09390do = this.A09;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C19270xB A0D = AbstractC31171DnF.A0D("muted_words_dictionary_editor");
        Integer num2 = this.A03;
        String str3 = "surfaceType";
        if (num2 != null) {
            this.A02 = (C44534Jme) new C52942bb(new KGR(A0D, A0r, num2), this).A00(C44534Jme.class);
            Integer num3 = this.A03;
            if (num3 != null) {
                if (num3 == C05F.A01) {
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                    String str4 = this.A04;
                    if (str4 == null) {
                        str3 = "entryPoint";
                    } else {
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(this, A0o), "words_and_phrases_page");
                        if (A0f.isSampled()) {
                            A0f.AAP("event_source", str4);
                            AbstractC31171DnF.A1D(A0f, "muted_words_dictionary_editor");
                            A0f.Cht();
                        }
                    }
                }
                C0f9.A09(-900454421, A02);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C3I9 A01;
        int A02 = C0f9.A02(1192969018);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.dictionary_manager_fragment_layout, viewGroup, false);
        this.A07 = (ViewGroup) inflate.findViewById(R.id.dictionary_manager_words_list);
        if (Build.VERSION.SDK_INT >= 30) {
            A01 = C3I7.A00(inflate);
        } else {
            A01 = C3I7.A01(this, false, false);
        }
        this.A08 = A01;
        C0f9.A09(302879630, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1184004162);
        super.onDestroyView();
        C3I9 c3i9 = this.A08;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this);
        C0f9.A09(1813984164, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1606408682);
        super.onStart();
        C3I9 c3i9 = this.A08;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(requireActivity());
        C0f9.A09(1578214522, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1624798163);
        super.onStop();
        C3I9 c3i9 = this.A08;
        if (c3i9 == null) {
            C14360o3.A0F("keyboardHeightChangeDetector");
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        C0f9.A09(32756376, A02);
    }
}
