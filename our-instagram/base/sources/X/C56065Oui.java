package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* renamed from: X.Oui, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C56065Oui implements InterfaceC60072op, TextWatcher {
    public static final C7OQ A0C = C7OQ.A05;
    public View A00;
    public View A01;
    public ListView A02;
    public PopupWindow A03;
    public O7Y A04;
    public O2X A05;
    public InterfaceC190488c6 A06;
    public IgAutoCompleteTextView A07;
    public final Context A08;
    public final AbstractC59962oe A09;
    public final UserSession A0A;
    public final C215219fx A0B;

    public C56065Oui(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 3);
        this.A09 = abstractC59962oe;
        this.A0A = userSession;
        Context requireContext = abstractC59962oe.requireContext();
        this.A08 = requireContext;
        this.A0B = new C215219fx(requireContext, interfaceC60442pS, new C61972ry(requireContext, AbstractC018607g.A00(abstractC59962oe), null), userSession, new C24206AoT(this));
    }

    public final void A02(View view, InterfaceC190488c6 interfaceC190488c6, IgAutoCompleteTextView igAutoCompleteTextView) {
        String str;
        boolean A1R = AbstractC167007dF.A1R(0, igAutoCompleteTextView, view);
        this.A07 = igAutoCompleteTextView;
        this.A00 = view;
        this.A06 = interfaceC190488c6;
        igAutoCompleteTextView.addTextChangedListener(this);
        IgAutoCompleteTextView igAutoCompleteTextView2 = this.A07;
        if (igAutoCompleteTextView2 == null) {
            C14360o3.A0F("editText");
        } else {
            igAutoCompleteTextView2.A03 = this;
            O2J o2j = new O2J(this);
            InterfaceC190488c6 interfaceC190488c62 = this.A06;
            if (interfaceC190488c62 != null) {
                igAutoCompleteTextView2.addTextChangedListener(new Oi9(o2j, interfaceC190488c62));
                PopupWindow popupWindow = new PopupWindow(-1, -2);
                popupWindow.setInputMethodMode(A1R ? 1 : 0);
                Context context = this.A08;
                popupWindow.setBackgroundDrawable(context.getDrawable(R.drawable.auto_dropdown_background));
                popupWindow.setOutsideTouchable(A1R);
                popupWindow.setAnimationStyle(0);
                this.A03 = popupWindow;
                View A0C2 = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.suggestions_pop_up);
                this.A01 = A0C2;
                if (A0C2 == null) {
                    str = "contentView";
                } else {
                    ListView listView = (ListView) A0C2.requireViewById(R.id.suggestions_list_view);
                    this.A02 = listView;
                    str = "suggestionsListView";
                    if (listView != null) {
                        listView.setAdapter((ListAdapter) this.A0B);
                        ListView listView2 = this.A02;
                        if (listView2 != null) {
                            listView2.setOnItemClickListener(new C55515Ol8(this, A1R ? 1 : 0));
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        throw C00O.createAndThrow();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final PopupWindow A00() {
        PopupWindow popupWindow = this.A03;
        if (popupWindow != null) {
            return popupWindow;
        }
        C14360o3.A0F("popupWindow");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10, 36315911287869123L) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56065Oui.A01():void");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        InterfaceC169517hR interfaceC169517hR;
        IgAutoCompleteTextView igAutoCompleteTextView = this.A07;
        String str = "editText";
        if (igAutoCompleteTextView != null) {
            C7OQ c7oq = A0C;
            if (C7OR.A04(igAutoCompleteTextView, c7oq, 1, false)) {
                IgAutoCompleteTextView igAutoCompleteTextView2 = this.A07;
                if (igAutoCompleteTextView2 != null) {
                    String A03 = C7OR.A03(igAutoCompleteTextView2, c7oq, false);
                    if (A03 != null) {
                        InterfaceC09390do interfaceC09390do = AbstractC13670mt.A09;
                        if (A03.length() >= 1) {
                            C215219fx c215219fx = this.A0B;
                            char charAt = A03.charAt(0);
                            if (charAt == '#') {
                                if (AbstractC43592JPx.A0z(A03, 1).length() == 0 && C17060sy.A01.A01(c215219fx.A02).A2I()) {
                                    interfaceC169517hR = c215219fx.A04;
                                } else {
                                    interfaceC169517hR = c215219fx.A03;
                                }
                            } else if (charAt == '@') {
                                interfaceC169517hR = c215219fx.A05;
                            } else {
                                interfaceC169517hR = null;
                            }
                            InterfaceC169517hR interfaceC169517hR2 = c215219fx.A05;
                            if (interfaceC169517hR != interfaceC169517hR2) {
                                interfaceC169517hR2.EYJ(null);
                            }
                            InterfaceC169517hR interfaceC169517hR3 = c215219fx.A03;
                            if (interfaceC169517hR != interfaceC169517hR3) {
                                interfaceC169517hR3.EYJ(null);
                            }
                            InterfaceC169517hR interfaceC169517hR4 = c215219fx.A04;
                            if (interfaceC169517hR != interfaceC169517hR4) {
                                interfaceC169517hR4.EYJ(null);
                            }
                            if (interfaceC169517hR != null) {
                                c215219fx.A00 = interfaceC169517hR;
                                interfaceC169517hR.Eby(AbstractC43592JPx.A0z(A03, 1));
                                interfaceC169517hR.EYJ(c215219fx);
                            } else {
                                c215219fx.A00 = null;
                                c215219fx.A06();
                                c215219fx.A07();
                            }
                            if (!A00().isShowing()) {
                                PopupWindow A00 = A00();
                                View view = this.A01;
                                if (view == null) {
                                    str = "contentView";
                                } else {
                                    A00.setContentView(view);
                                    this.A09.requireActivity();
                                    PopupWindow A002 = A00();
                                    View view2 = this.A00;
                                    if (view2 == null) {
                                        str = "anchorView";
                                    } else {
                                        A002.showAsDropDown(view2);
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
            A01();
            A00().dismiss();
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (A00().isShowing()) {
            A01();
            A00().dismiss();
            return true;
        }
        return false;
    }
}
