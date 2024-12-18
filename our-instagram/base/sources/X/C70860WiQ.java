package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.StoryPollColorType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WiQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70860WiQ implements InterfaceC25184BCh, InterfaceC25183BCg {
    public int A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public EditText A04;
    public IgTextView A05;
    public EnumC209229Ne A06;
    public Wm4 A07;
    public final Context A08;
    public final Drawable A09;
    public final Drawable A0A;
    public final View.OnFocusChangeListener A0B;
    public final UserSession A0C;
    public final InterfaceC1810081c A0D;
    public final InterfaceC195198kL A0E;
    public final String A0F;
    public final String A0G;
    public final ArrayList A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final Resources A0L;
    public final TextView.OnEditorActionListener A0M;
    public final C8NX A0N;

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        String str;
        String str2;
        String A00;
        Object obj2;
        C14360o3.A0B(obj, 0);
        Wm4 wm4 = ((C188098Va) obj).A00;
        if (wm4 == null) {
            C16930sl c16930sl = C16930sl.A00;
            ArrayList arrayList = A4H.A03;
            if (arrayList.size() > 0) {
                obj2 = arrayList.get(0);
            } else {
                obj2 = EnumC209229Ne.A0B;
            }
            wm4 = new Wm4((EnumC209229Ne) obj2, null, "", null, "", c16930sl, null, false, false);
        }
        this.A07 = wm4;
        InterfaceC09390do interfaceC09390do = this.A0K;
        if (!((InterfaceC56392iX) interfaceC09390do.getValue()).CWW()) {
            ViewGroup viewGroup = (ViewGroup) ((InterfaceC56392iX) interfaceC09390do.getValue()).getView();
            this.A03 = viewGroup;
            if (viewGroup != null) {
                View requireViewById = viewGroup.requireViewById(R.id.poll_sticker_v2);
                requireViewById.setOnTouchListener(WO3.A00);
                this.A01 = requireViewById;
                C88W c88w = (C88W) this.A0J.getValue();
                View view = this.A01;
                if (view != null) {
                    c88w.A03(view);
                    C195208kM c195208kM = c88w.A03;
                    c195208kM.A04 = true;
                    c195208kM.A03 = true;
                    ViewGroup viewGroup2 = this.A03;
                    if (viewGroup2 != null) {
                        EditText editText = (EditText) viewGroup2.requireViewById(R.id.poll_sticker_v2_question);
                        editText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                        editText.setOnFocusChangeListener(this.A0B);
                        editText.addTextChangedListener(new C221549qJ(editText, 2));
                        C6QV.A00(editText);
                        this.A04 = editText;
                        ViewGroup viewGroup3 = this.A03;
                        if (viewGroup3 != null) {
                            this.A02 = (ViewGroup) viewGroup3.requireViewById(R.id.poll_sticker_v2_option_list);
                            int i = 1;
                            loop0: while (true) {
                                boolean z = true;
                                do {
                                    ViewGroup viewGroup4 = this.A02;
                                    if (viewGroup4 == null) {
                                        str2 = "optionsContainer";
                                        break loop0;
                                    }
                                    viewGroup4.addView(A00(this, z));
                                    i++;
                                    if (i < 4) {
                                        z = false;
                                    } else {
                                        ViewGroup viewGroup5 = this.A02;
                                        str = "optionsContainer";
                                        if (viewGroup5 != null) {
                                            View childAt = viewGroup5.getChildAt(0);
                                            String A002 = AbstractC111324zv.A00(239);
                                            C14360o3.A0C(childAt, A002);
                                            TextView textView = (TextView) childAt;
                                            ViewGroup viewGroup6 = this.A02;
                                            if (viewGroup6 != null) {
                                                View childAt2 = viewGroup6.getChildAt(1);
                                                C14360o3.A0C(childAt2, A002);
                                                TextView textView2 = (TextView) childAt2;
                                                textView.setHint(this.A0F);
                                                Context context = this.A08;
                                                textView.setHintTextColor(context.getColor(R.color.poll_v2_sticker_option_hint_text));
                                                textView2.setHint(this.A0G);
                                                textView2.setHintTextColor(context.getColor(R.color.poll_v2_sticker_option_hint_text));
                                                ViewGroup viewGroup7 = this.A03;
                                                if (viewGroup7 != null) {
                                                    ImageView imageView = (ImageView) viewGroup7.requireViewById(R.id.poll_sticker_v2_color_button);
                                                    imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
                                                    C3P9 c3p9 = new C3P9(imageView);
                                                    View view2 = this.A01;
                                                    if (view2 != null) {
                                                        c3p9.A02(imageView, view2);
                                                        c3p9.A04 = new C68003V5v(this, 4);
                                                        c3p9.A00();
                                                        ViewGroup viewGroup8 = this.A03;
                                                        if (viewGroup8 == null) {
                                                            str = "stickerEditorContainer";
                                                        } else {
                                                            this.A05 = (IgTextView) viewGroup8.requireViewById(R.id.poll_sticker_v2_internal_warning_text);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (i > 2);
                            }
                        }
                    }
                }
                str2 = "stickerView";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            str2 = "stickerEditorContainer";
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        EditText editText2 = this.A04;
        if (editText2 == null) {
            str2 = "questionView";
        } else {
            Wm4 wm42 = this.A07;
            str = "model";
            if (wm42 != null) {
                String str3 = wm42.A04;
                if (str3 == null) {
                    str3 = "";
                }
                editText2.setText(str3);
                Wm4 wm43 = this.A07;
                if (wm43 != null) {
                    A03(this, wm43.A00);
                    ArrayList arrayList2 = this.A0H;
                    Wm4 wm44 = this.A07;
                    if (wm44 != null) {
                        this.A00 = arrayList2.indexOf(wm44.A00);
                        ViewGroup viewGroup9 = this.A02;
                        str2 = "optionsContainer";
                        if (viewGroup9 != null) {
                            int childCount = viewGroup9.getChildCount();
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                                A00 = AbstractC111324zv.A00(239);
                                if (i3 < childCount) {
                                    ViewGroup viewGroup10 = this.A02;
                                    if (viewGroup10 != null) {
                                        if (i3 >= viewGroup10.getChildCount()) {
                                            break;
                                        }
                                        ViewGroup viewGroup11 = this.A02;
                                        if (viewGroup11 == null) {
                                            break;
                                        }
                                        View childAt3 = viewGroup11.getChildAt(i3);
                                        C14360o3.A0C(childAt3, A00);
                                        ((TextView) childAt3).setText("");
                                        i3++;
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            Wm4 wm45 = this.A07;
                            if (wm45 != null) {
                                int size = wm45.A06.size();
                                while (true) {
                                    if (i2 < size) {
                                        ViewGroup viewGroup12 = this.A02;
                                        if (viewGroup12 == null) {
                                            break;
                                        }
                                        View childAt4 = viewGroup12.getChildAt(i2);
                                        C14360o3.A0C(childAt4, A00);
                                        TextView textView3 = (TextView) childAt4;
                                        Wm4 wm46 = this.A07;
                                        if (wm46 == null) {
                                            break;
                                        }
                                        textView3.setText(((C101374gu) wm46.A06.get(i2)).A02);
                                        i2++;
                                    } else {
                                        IgTextView igTextView = this.A05;
                                        if (igTextView == null) {
                                            str = "internalWarningText";
                                        } else {
                                            igTextView.setVisibility(AbstractC167007dF.A05(C18U.A06(C06090Tz.A06, this.A0C, 36313205458536259L) ? 1 : 0));
                                            AbstractC125325le.A07(new View[]{(View) this.A0I.getValue(), ((InterfaceC56392iX) interfaceC09390do.getValue()).getView()}, !C18U.A06(C06090Tz.A05, r3, 36323238501952604L));
                                            C88W c88w2 = (C88W) this.A0J.getValue();
                                            c88w2.A02(c88w2.A01);
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
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final EditText A00(C70860WiQ c70860WiQ, boolean z) {
        TextWatcher textWatcher;
        LayoutInflater from = LayoutInflater.from(c70860WiQ.A08);
        ViewGroup viewGroup = c70860WiQ.A02;
        if (viewGroup == null) {
            C14360o3.A0F("optionsContainer");
            throw C00O.createAndThrow();
        }
        View A0A = AbstractC31172DnG.A0A(from, viewGroup, R.layout.poll_sticker_v2_option_row);
        C14360o3.A0C(A0A, AbstractC111324zv.A00(239));
        EditText editText = (EditText) A0A;
        if (!z) {
            editText.setBackground(c70860WiQ.A0A);
            editText.setHint(editText.getContext().getString(2131969728));
        }
        editText.setOnFocusChangeListener(c70860WiQ.A0B);
        editText.setOnEditorActionListener(c70860WiQ.A0M);
        if (z) {
            textWatcher = new C221549qJ(editText, 2);
        } else {
            VBA vba = new VBA();
            C221549qJ c221549qJ = new C221549qJ(editText, 2);
            List list = vba.A00;
            list.add(c221549qJ);
            list.add(new VBB(1, editText, c70860WiQ));
            textWatcher = vba;
        }
        editText.addTextChangedListener(textWatcher);
        return editText;
    }

    public static final void A01(C70860WiQ c70860WiQ) {
        EditText editText = c70860WiQ.A04;
        String str = "questionView";
        if (editText != null) {
            if (editText.hasFocus()) {
                EditText editText2 = c70860WiQ.A04;
                if (editText2 != null) {
                    editText2.clearFocus();
                    return;
                }
            } else {
                ViewGroup viewGroup = c70860WiQ.A02;
                if (viewGroup == null) {
                    str = "optionsContainer";
                } else {
                    C12500ku c12500ku = new C12500ku(viewGroup);
                    while (c12500ku.hasNext()) {
                        View view = (View) c12500ku.next();
                        if (view.hasFocus()) {
                            view.clearFocus();
                            return;
                        }
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(C70860WiQ c70860WiQ) {
        InterfaceC09390do interfaceC09390do = c70860WiQ.A0K;
        if (((InterfaceC56392iX) interfaceC09390do.getValue()).CWW()) {
            AbstractC125325le.A05(new View[]{(View) c70860WiQ.A0I.getValue(), ((InterfaceC56392iX) interfaceC09390do.getValue()).getView()}, true);
            A01(c70860WiQ);
        }
    }

    public static final void A03(C70860WiQ c70860WiQ, EnumC209229Ne enumC209229Ne) {
        c70860WiQ.A06 = enumC209229Ne;
        EditText editText = c70860WiQ.A04;
        if (editText == null) {
            C14360o3.A0F("questionView");
            throw C00O.createAndThrow();
        }
        Drawable mutate = editText.getBackground().mutate();
        C14360o3.A0C(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) mutate).setColors(AbstractC209259Nh.A02(enumC209229Ne));
    }

    @Override // X.InterfaceC25183BCg
    public final View B0N() {
        View view = null;
        if (C18U.A06(C06090Tz.A06, this.A0C, 36323238502083678L) && (view = this.A01) == null) {
            C14360o3.A0F("stickerView");
            throw C00O.createAndThrow();
        }
        return view;
    }

    @Override // X.InterfaceC25183BCg
    public final Class C0Y() {
        return C202468xQ.class;
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        String A0g;
        StoryPollColorType storyPollColorType;
        A02(this);
        C8NX c8nx = this.A0N;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C101374gu(null, null, this.A0F));
        arrayList.add(new C101374gu(null, null, this.A0G));
        ViewGroup viewGroup = this.A02;
        String str = "optionsContainer";
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    ViewGroup viewGroup2 = this.A02;
                    if (viewGroup2 == null) {
                        break;
                    }
                    View childAt = viewGroup2.getChildAt(i);
                    if (childAt instanceof EditText) {
                        EditText editText = (EditText) childAt;
                        if (AbstractC65702TsY.A0Z(editText).length() > 0) {
                            String A0Z = AbstractC65702TsY.A0Z(editText);
                            if (i < 2) {
                                C101374gu c101374gu = (C101374gu) arrayList.get(i);
                                arrayList.set(i, new C101374gu(c101374gu.A00, c101374gu.A01, A0Z));
                            } else {
                                arrayList.add(new C101374gu(null, null, A0Z));
                            }
                        }
                    }
                    i++;
                } else {
                    EditText editText2 = this.A04;
                    str = "questionView";
                    if (editText2 != null) {
                        if (AbstractC167007dF.A0g(editText2).length() == 0) {
                            A0g = null;
                        } else {
                            EditText editText3 = this.A04;
                            if (editText3 != null) {
                                A0g = AbstractC167007dF.A0g(editText3);
                            }
                        }
                        EnumC209229Ne enumC209229Ne = this.A06;
                        switch (enumC209229Ne.ordinal()) {
                            case 8:
                                storyPollColorType = StoryPollColorType.A04;
                                break;
                            case 9:
                            case 10:
                            case 11:
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            case 14:
                            case Process.SIGTERM /* 15 */:
                            case 16:
                            default:
                                throw AbstractC43594JPz.A0o(enumC209229Ne, "Unknown poll V2 sticker color: ", new StringBuilder());
                            case 17:
                                storyPollColorType = StoryPollColorType.A0A;
                                break;
                            case 18:
                                storyPollColorType = StoryPollColorType.A08;
                                break;
                            case Process.SIGSTOP /* 19 */:
                                storyPollColorType = StoryPollColorType.A0B;
                                break;
                            case 20:
                                storyPollColorType = StoryPollColorType.A09;
                                break;
                            case 21:
                                storyPollColorType = StoryPollColorType.A07;
                                break;
                            case 22:
                                storyPollColorType = StoryPollColorType.A05;
                                break;
                        }
                        c8nx.Dog(new Wm4(enumC209229Ne, null, "", A0g, storyPollColorType.A00, arrayList, null, false, false), AbstractC111324zv.A00(2882));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C70860WiQ(View view, UserSession userSession, C3I9 c3i9, InterfaceC1810081c interfaceC1810081c, C8NX c8nx) {
        this.A0C = userSession;
        this.A0N = c8nx;
        this.A0D = interfaceC1810081c;
        Context context = view.getContext();
        this.A08 = context;
        Resources resources = view.getResources();
        this.A0L = resources;
        this.A0F = AbstractC166997dE.A0q(resources, 2131969725);
        this.A0G = AbstractC166997dE.A0q(resources, 2131969726);
        ArrayList arrayList = A4H.A03;
        this.A0H = arrayList;
        this.A06 = (EnumC209229Ne) AbstractC31173DnH.A0i(arrayList, 0);
        this.A0E = new C24161Ank(this, 2);
        this.A0B = new WNY(this, 6);
        this.A0M = new WPC(this, 2);
        this.A0I = AbstractC09440dt.A01(new B8R(view, 41));
        this.A0K = AbstractC09440dt.A01(new B8R(view, 42));
        this.A0J = AbstractC09440dt.A01(new B61(35, c3i9, this));
        Drawable drawable = context.getDrawable(R.drawable.poll_v2_sticker_option_background);
        if (drawable != null) {
            this.A09 = drawable;
            Drawable drawable2 = context.getDrawable(R.drawable.poll_sticker_v2_option_row_hint_background);
            if (drawable2 != null) {
                this.A0A = drawable2;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
