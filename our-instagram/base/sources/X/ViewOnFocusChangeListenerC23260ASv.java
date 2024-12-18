package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.reels.question.constants.QuestionStickerType;
import java.util.ArrayList;

/* renamed from: X.ASv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23260ASv implements View.OnFocusChangeListener, InterfaceC25184BCh, InterfaceC195198kL, InterfaceC25183BCg {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public EditText A06;
    public ABM A07;
    public AvatarView A08;
    public C221539qI A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Context A0D;
    public final View A0E;
    public final ViewStub A0F;
    public final ImageUrl A0G;
    public final C88W A0H;
    public final QuestionStickerType A0I;
    public final ArrayList A0J;
    public final ArrayList A0K;
    public final UserSession A0L;
    public final C8O8 A0M;
    public final InterfaceC1810081c A0N;
    public final C8NX A0O;

    public ViewOnFocusChangeListenerC23260ASv(View view, UserSession userSession, C3I9 c3i9, C8O8 c8o8, InterfaceC1810081c interfaceC1810081c, C8NX c8nx) {
        C14360o3.A0B(c8o8, 6);
        this.A0L = userSession;
        this.A0N = interfaceC1810081c;
        this.A0O = c8nx;
        this.A0M = c8o8;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A0D = A0L;
        this.A0H = new C88W(A0L, c3i9, this);
        this.A0G = AbstractC166987dD.A10(userSession).Bhu();
        this.A0E = AbstractC166997dE.A0S(view, R.id.text_overlay_edit_text_container);
        this.A0F = AbstractC167007dF.A0M(view, R.id.question_sticker_editor_stub);
        this.A0I = QuestionStickerType.A08;
        ArrayList A1M = AbstractC16960so.A1M(Integer.valueOf(AbstractC166997dE.A03(A0L)), Integer.valueOf(A0L.getColor(R.color.black)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_pink)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_purple)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_orange)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_green)), Integer.valueOf(AbstractC167007dF.A09(A0L, R.attr.igds_color_creation_tools_blue)));
        this.A0K = A1M;
        this.A0J = AbstractC16960so.A1M(AbstractC167027dH.A0P(A0L, 2131977091), AbstractC167027dH.A0P(A0L, 2131953859), AbstractC167027dH.A0P(A0L, 2131969662), AbstractC167027dH.A0P(A0L, 2131971167), AbstractC167027dH.A0P(A0L, 2131969234), AbstractC167027dH.A0P(A0L, 2131963285), AbstractC167027dH.A0P(A0L, 2131953959));
        this.A00 = AbstractC167017dG.A0P(A1M, 0);
    }

    private final void A01(AlD alD) {
        Context context;
        C221539qI c221539qI;
        int i;
        EditText editText;
        if (alD == null) {
            this.A01 = 0;
            context = this.A0D;
            A00(this, AlD.A00(context));
            C221539qI c221539qI2 = this.A09;
            if (c221539qI2 != null) {
                c221539qI2.A01(c221539qI2.A00);
            }
        } else {
            ArrayList arrayList = this.A0K;
            context = this.A0D;
            this.A01 = arrayList.indexOf(Integer.valueOf(alD.A03(context)));
            A00(this, alD.A03(context));
            String A05 = alD.A05();
            if (A05 != null && (c221539qI = this.A09) != null) {
                c221539qI.A01(A05);
            }
        }
        ABM abm = this.A07;
        if (abm != null) {
            abm.A00();
        }
        C221539qI c221539qI3 = this.A09;
        if (c221539qI3 != null) {
            c221539qI3.A00(AbstractC166997dE.A0p(context, 2131971246));
        }
        if (this.A0A || ((editText = this.A06) != null && editText.isFocused())) {
            i = 2131971242;
        } else {
            i = 2131971243;
        }
        String string = context.getString(i);
        C14360o3.A0A(string);
        ABM abm2 = this.A07;
        if (abm2 != null && abm2.A02.CWW()) {
            TextView textView = abm2.A01;
            if (textView != null) {
                textView.setText(string);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        A00(this, this.A00);
        EditText editText2 = this.A06;
        if (editText2 != null) {
            AbstractC167017dG.A18(editText2);
        }
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        View requireViewById;
        EditText editText;
        ABM abm;
        ImageView imageView;
        C14360o3.A0B(obj, 0);
        C187838Ua c187838Ua = (C187838Ua) obj;
        this.A0A = c187838Ua.A01;
        this.A0C = c187838Ua.A03;
        this.A0B = c187838Ua.A02;
        if (this.A05 == null) {
            AvatarView avatarView = null;
            ViewStub viewStub = this.A0F;
            AbstractC13880nE.A0h(viewStub, -1, -1);
            viewStub.setLayoutResource(R.layout.question_sticker_multi_format_editor);
            View inflate = viewStub.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.A05 = viewGroup;
            if (viewGroup != null) {
                View requireViewById2 = viewGroup.requireViewById(R.id.question_sticker_container);
                C88W c88w = this.A0H;
                C14360o3.A0A(requireViewById2);
                c88w.A03(requireViewById2);
                this.A03 = requireViewById2;
                View requireViewById3 = viewGroup.requireViewById(R.id.question_sticker_editor);
                this.A02 = requireViewById3.requireViewById(R.id.question_sticker_card);
                this.A04 = requireViewById3;
            }
            View view = this.A03;
            if (view != null) {
                AbstractC13880nE.A0u(view, new C216009hG(this, 1));
                View view2 = this.A04;
                if (view2 != null) {
                    avatarView = (AvatarView) view2.requireViewById(R.id.question_sticker_avatar);
                }
                this.A08 = avatarView;
                View view3 = this.A04;
                if (view3 != null) {
                    editText = (EditText) view3.requireViewById(R.id.question_sticker_question);
                } else {
                    editText = null;
                }
                this.A06 = editText;
                if (editText != null) {
                    editText.setTypeface(AbstractC167017dG.A0S(AbstractC166997dE.A0L(editText)));
                    editText.setOnFocusChangeListener(this);
                    C221539qI c221539qI = new C221539qI(editText);
                    this.A09 = c221539qI;
                    editText.addTextChangedListener(c221539qI);
                }
                View view4 = this.A04;
                if (view4 != null) {
                    abm = new ABM(view4);
                    abm.A00();
                } else {
                    abm = null;
                }
                this.A07 = abm;
                View view5 = this.A04;
                if (view5 != null) {
                    AbstractC166997dE.A0T(view5, R.id.question_sticker_answer).setTypeface(AbstractC167017dG.A0S(this.A0D));
                }
                ViewGroup viewGroup2 = this.A05;
                if (viewGroup2 != null && (imageView = (ImageView) viewGroup2.requireViewById(R.id.question_sticker_color_button)) != null) {
                    imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
                    C3P9 A0s = AbstractC166987dD.A0s(imageView);
                    A0s.A02(imageView, this.A04);
                    C216559iC.A02(A0s, this, 30);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        boolean z = this.A0A;
        AvatarView avatarView2 = this.A08;
        if (z) {
            AbstractC167007dF.A0x(avatarView2);
        } else {
            if (avatarView2 != null) {
                avatarView2.setVisibility(0);
            }
            AvatarView avatarView3 = this.A08;
            if (avatarView3 != null) {
                avatarView3.setAvatarUrl(this.A0G);
            }
        }
        if (this.A0A) {
            EditText editText2 = this.A06;
            if (editText2 != null) {
                AbstractC13880nE.A0f(editText2, 0);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        ViewGroup viewGroup3 = this.A05;
        if (viewGroup3 != null && (requireViewById = viewGroup3.requireViewById(R.id.question_sticker_info_text)) != null) {
            requireViewById.setVisibility(AbstractC167007dF.A05(this.A0A ? 1 : 0));
        }
        AbstractC125325le.A04(null, new View[]{this.A0E, this.A05, this.A04}, false);
        C88W c88w2 = this.A0H;
        c88w2.A02(c88w2.A01);
        A01(c187838Ua.A00);
        this.A0M.Dom("question_sticker_bundle_id");
    }

    @Override // X.InterfaceC195198kL
    public final /* synthetic */ void E0p(int i, int i2) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C14360o3.A0B(view, 0);
        C88W c88w = this.A0H;
        if (z) {
            c88w.A00();
            AbstractC13880nE.A0S(view);
            return;
        }
        c88w.A01();
        AbstractC13880nE.A0O(view);
        ViewGroup viewGroup = this.A05;
        if (viewGroup == null) {
            return;
        }
        AbstractC125325le.A05(new View[]{this.A0E, viewGroup, this.A04}, false);
    }

    public static final void A00(ViewOnFocusChangeListenerC23260ASv viewOnFocusChangeListenerC23260ASv, int i) {
        Drawable drawable;
        int A08;
        viewOnFocusChangeListenerC23260ASv.A00 = i;
        View view = viewOnFocusChangeListenerC23260ASv.A02;
        if (view != null) {
            drawable = view.getBackground();
        } else {
            drawable = null;
        }
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable).setColor(i);
        AvatarView avatarView = viewOnFocusChangeListenerC23260ASv.A08;
        if (avatarView != null) {
            avatarView.setStrokeColor(i);
        }
        Context context = viewOnFocusChangeListenerC23260ASv.A0D;
        if (i != AbstractC167007dF.A09(context, R.attr.igds_color_sticker_background)) {
            A08 = AbstractC167007dF.A08(context);
        } else {
            A08 = AbstractC13950nL.A08(i, 1.0f);
        }
        int A01 = C6ZB.A01(context, i);
        EditText editText = viewOnFocusChangeListenerC23260ASv.A06;
        if (editText != null) {
            editText.setTextColor(A08);
        }
        ABM abm = viewOnFocusChangeListenerC23260ASv.A07;
        if (abm != null) {
            int A00 = C6ZB.A00(context, i);
            if (abm.A02.CWW()) {
                View view2 = abm.A00;
                if (view2 != null) {
                    Drawable background = view2.getBackground();
                    C14360o3.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    ((GradientDrawable) background).setColor(A01);
                    TextView textView = abm.A01;
                    if (textView != null) {
                        textView.setTextColor(A00);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }

    @Override // X.InterfaceC25183BCg
    public final View B0N() {
        return this.A02;
    }

    @Override // X.InterfaceC25183BCg
    public final Class C0Y() {
        return C221179pf.class;
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        Editable editable;
        int A08;
        C8NX c8nx = this.A0O;
        EditText editText = this.A06;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String obj = AbstractC001900j.A0B(String.valueOf(editable)).toString();
        if (obj == null || obj.length() == 0) {
            C221539qI c221539qI = this.A09;
            if (c221539qI != null) {
                obj = c221539qI.A00;
            } else {
                obj = null;
            }
        }
        QuestionStickerType questionStickerType = this.A0I;
        Context context = this.A0D;
        AlD.A00(context);
        AlD.A01(context);
        ImageUrl imageUrl = this.A0G;
        EditText editText2 = this.A06;
        if (editText2 != null) {
            A08 = editText2.getCurrentTextColor();
        } else {
            int i = this.A00;
            if (i != AbstractC167007dF.A09(context, R.attr.igds_color_sticker_background)) {
                A08 = AbstractC167007dF.A08(context);
            } else {
                A08 = AbstractC13950nL.A08(i, 1.0f);
            }
        }
        c8nx.Dog(new AlD(imageUrl, questionStickerType, null, obj, this.A00, A08, this.A0A, this.A0B, this.A0C), null);
        A01(null);
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            AbstractC125325le.A05(new View[]{this.A0E, viewGroup, this.A04}, false);
        }
        this.A0M.Doh("question_sticker_bundle_id");
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        EditText editText = this.A06;
        if (editText != null) {
            editText.clearFocus();
        }
        InterfaceC1810081c.A00(this.A0N);
    }
}
