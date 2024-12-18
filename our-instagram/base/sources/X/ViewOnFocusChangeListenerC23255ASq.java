package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.ASq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23255ASq implements View.OnFocusChangeListener, InterfaceC25184BCh, InterfaceC195198kL {
    public View A00;
    public ViewGroup A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public CircularImageView A05;
    public final Context A06;
    public final View A07;
    public final ViewStub A08;
    public final C88W A09;
    public final InterfaceC1810081c A0A;
    public final C8NX A0B;

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        C14360o3.A0B(obj, 0);
        if (this.A01 == null) {
            ViewStub viewStub = this.A08;
            AbstractC13880nE.A0h(viewStub, -1, -1);
            viewStub.setLayoutResource(R.layout.i_take_care_full_screen_editor);
            View inflate = viewStub.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.A01 = viewGroup;
            if (viewGroup != null) {
                View requireViewById = viewGroup.requireViewById(R.id.i_take_care_sticker);
                this.A00 = requireViewById;
                C14360o3.A07(requireViewById);
                this.A09.A03(requireViewById);
                AbstractC13880nE.A0u(requireViewById, new C216009hG(this, 0));
                View view = this.A00;
                if (view != null) {
                    CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.i_take_care_sticker_icon);
                    this.A05 = circularImageView;
                    if (circularImageView != null) {
                        Context context = this.A06;
                        circularImageView.A0H(AbstractC166997dE.A0D(context.getResources()), AbstractC166997dE.A01(context));
                        AbstractC166997dE.A19(context, circularImageView, R.drawable.instagram_icons_exceptions_circle_heart_purple_filled_88);
                    }
                    View view2 = this.A00;
                    if (view2 != null) {
                        TextView A0T = AbstractC166997dE.A0T(view2, R.id.i_take_care_sticker_prompt);
                        this.A04 = A0T;
                        if (A0T != null) {
                            C6QV.A00(A0T);
                        }
                        View view3 = this.A00;
                        if (view3 != null) {
                            EditText editText = (EditText) view3.requireViewById(R.id.i_take_care_sticker_response);
                            this.A02 = editText;
                            if (editText != null) {
                                editText.setOnFocusChangeListener(this);
                                editText.addTextChangedListener(new C221539qI(editText));
                            }
                            View view4 = this.A00;
                            if (view4 != null) {
                                TextView A0T2 = AbstractC166997dE.A0T(view4, R.id.i_take_care_sticker_help_text);
                                this.A03 = A0T2;
                                if (A0T2 != null) {
                                    AEZ.A01(A0T2);
                                }
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        View view5 = this.A07;
        ViewGroup viewGroup2 = this.A01;
        if (viewGroup2 != null) {
            AbstractC125325le.A04(null, new View[]{view5, viewGroup2, this.A00}, false);
            C88W c88w = this.A09;
            c88w.A02(c88w.A01);
            AlA alA = ((C188028Ut) obj).A00;
            if (alA != null) {
                Context context2 = this.A06;
                int color = context2.getColor(R.color.i_take_care_sticker_gradient_start);
                int color2 = context2.getColor(R.color.i_take_care_sticker_gradient_end);
                TextView textView = this.A04;
                if (textView != null) {
                    textView.setText(alA.A02);
                    textView.setTextColor(color);
                    textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC23273ATi(textView, color, color2));
                    EditText editText2 = this.A02;
                    if (editText2 != null) {
                        editText2.setText(alA.A03);
                        editText2.setHint(alA.A01);
                        TextView textView2 = this.A03;
                        if (textView2 != null) {
                            textView2.setText(alA.A00);
                            return;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                    throw AbstractC166987dD.A15("responseView is null");
                }
                throw AbstractC166987dD.A15("promptView is null");
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C14360o3.A0B(view, 0);
        C88W c88w = this.A09;
        if (z) {
            c88w.A00();
            AbstractC13880nE.A0S(view);
            return;
        }
        c88w.A01();
        AbstractC13880nE.A0O(view);
        ViewGroup viewGroup = this.A01;
        if (viewGroup == null) {
            return;
        }
        AbstractC125325le.A05(new View[]{this.A07, viewGroup, this.A00}, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.5NL, java.lang.Object, X.AlA] */
    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        C8NX c8nx = this.A0B;
        String str = "";
        TextView textView = this.A04;
        if (textView != null) {
            String obj = textView.getText().toString();
            EditText editText = this.A02;
            if (editText != null) {
                String A0g = AbstractC167007dF.A0g(editText);
                EditText editText2 = this.A02;
                if (editText2 != null) {
                    CharSequence hint = editText2.getHint();
                    if (hint != null) {
                        String obj2 = hint.toString();
                        TextView textView2 = this.A03;
                        if (textView2 != null) {
                            String obj3 = textView2.getText().toString();
                            if (obj3 != null) {
                                str = obj3;
                            }
                            ?? obj4 = new Object();
                            obj4.A02 = obj;
                            obj4.A01 = obj2;
                            obj4.A00 = str;
                            obj4.A03 = A0g;
                            c8nx.Dog(obj4, null);
                            ViewGroup viewGroup = this.A01;
                            if (viewGroup != null) {
                                AbstractC125325le.A05(new View[]{this.A07, viewGroup, this.A00}, false);
                                return;
                            }
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        EditText editText = this.A02;
        if (editText != null) {
            editText.clearFocus();
            InterfaceC1810081c.A00(this.A0A);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public ViewOnFocusChangeListenerC23255ASq(View view, C3I9 c3i9, InterfaceC1810081c interfaceC1810081c, C8NX c8nx) {
        this.A0A = interfaceC1810081c;
        this.A0B = c8nx;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A06 = A0L;
        this.A09 = new C88W(A0L, c3i9, this);
        this.A07 = AbstractC166997dE.A0S(view, R.id.text_overlay_edit_text_container);
        this.A08 = AbstractC167007dF.A0M(view, R.id.i_take_care_sticker_editor_stub);
    }
}
