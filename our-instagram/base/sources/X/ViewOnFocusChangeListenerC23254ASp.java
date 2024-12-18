package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ASp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23254ASp implements View.OnFocusChangeListener, InterfaceC60152ox, InterfaceC25184BCh {
    public ViewGroup A00;
    public EditText A01;
    public EditText A02;
    public EditText A03;
    public int A04;
    public final float A05;
    public final float A06;
    public final Context A07;
    public final View A08;
    public final ViewStub A09;
    public final C3I9 A0A;
    public final C8NX A0B;
    public final String A0C;
    public final String A0D;
    public final UserSession A0E;
    public final C8O8 A0F;

    private void A00() {
        EditText editText;
        EditText editText2 = this.A02;
        editText2.getClass();
        if (editText2.hasFocus()) {
            editText = this.A02;
        } else {
            EditText editText3 = this.A01;
            editText3.getClass();
            if (editText3.hasFocus()) {
                editText = this.A01;
            } else {
                EditText editText4 = this.A03;
                editText4.getClass();
                if (!editText4.hasFocus()) {
                    return;
                } else {
                    editText = this.A03;
                }
            }
        }
        editText.clearFocus();
    }

    public static void A01(EditText editText, CharSequence charSequence) {
        if (charSequence != null) {
            Editable text = editText.getText();
            text.replace(0, text.length(), charSequence);
        }
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        String str;
        C220789p2 c220789p2 = ((C8UW) obj).A00;
        if (this.A00 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A09.inflate();
            this.A00 = viewGroup;
            this.A02 = (EditText) viewGroup.findViewById(R.id.polling_question_edit);
            this.A01 = (EditText) this.A00.requireViewById(R.id.polling_first_option_edit);
            this.A03 = (EditText) this.A00.requireViewById(R.id.polling_second_option_edit);
            EditText editText = this.A02;
            editText.getClass();
            editText.setOnFocusChangeListener(this);
            EditText editText2 = this.A01;
            editText2.getClass();
            editText2.setOnFocusChangeListener(this);
            EditText editText3 = this.A03;
            editText3.getClass();
            editText3.setOnFocusChangeListener(this);
            EditText editText4 = this.A02;
            editText4.addTextChangedListener(new C221519qG(editText4));
            C6QV.A01(this.A02);
            EditText editText5 = this.A01;
            int i = 0;
            C14360o3.A0B(editText5, 0);
            C6QV.A02(editText5);
            EditText editText6 = this.A03;
            C14360o3.A0B(editText6, 0);
            C6QV.A02(editText6);
            InputFilter[] inputFilterArr = {new InputFilter.AllCaps()};
            this.A01.setFilters(inputFilterArr);
            this.A03.setFilters(inputFilterArr);
            final EditText editText7 = this.A01;
            editText7.addTextChangedListener(new WKa(editText7, this) { // from class: X.9qH
                public Spannable A00;
                public final int A01;
                public final DynamicLayout A02;
                public final SpannableStringBuilder A03;
                public final TextPaint A04;
                public final EditText A05;
                public final /* synthetic */ ViewOnFocusChangeListenerC23254ASp A06;

                @Override // X.WKa, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    int i2;
                    CharSequence charSequence = editable;
                    if (TextUtils.isEmpty(editable)) {
                        charSequence = this.A05.getHint();
                    }
                    charSequence.getClass();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    SpannableStringBuilder spannableStringBuilder2 = this.A03;
                    spannableStringBuilder2.replace(0, spannableStringBuilder2.length(), (CharSequence) spannableStringBuilder);
                    ViewOnFocusChangeListenerC23254ASp viewOnFocusChangeListenerC23254ASp = this.A06;
                    float f = viewOnFocusChangeListenerC23254ASp.A05;
                    float f2 = f * 0.05f;
                    DynamicLayout dynamicLayout = this.A02;
                    if (dynamicLayout != null) {
                        i2 = dynamicLayout.getHeight();
                    } else {
                        i2 = 0;
                    }
                    int i3 = this.A01;
                    if (i2 <= i3 && dynamicLayout.getLineCount() <= 2) {
                        TextPaint textPaint = this.A04;
                        float textSize = textPaint.getTextSize();
                        while (true) {
                            textSize += f2;
                            if (textSize > f) {
                                break;
                            }
                            textPaint.setTextSize(textSize);
                            spannableStringBuilder2.replace(0, spannableStringBuilder2.length(), (CharSequence) spannableStringBuilder);
                            if (dynamicLayout.getHeight() > i3 || dynamicLayout.getLineCount() > 2) {
                                break;
                            } else {
                                this.A05.setTextSize(0, textSize);
                            }
                        }
                        textPaint.setTextSize(this.A05.getTextSize());
                    } else {
                        TextPaint textPaint2 = this.A04;
                        float textSize2 = textPaint2.getTextSize();
                        while (true) {
                            textSize2 -= f2;
                            if (textSize2 >= viewOnFocusChangeListenerC23254ASp.A06) {
                                textPaint2.setTextSize(textSize2);
                                int i4 = 0;
                                spannableStringBuilder2.replace(0, spannableStringBuilder2.length(), (CharSequence) spannableStringBuilder);
                                if (dynamicLayout != null) {
                                    i4 = dynamicLayout.getHeight();
                                }
                                if (i4 <= i3 && dynamicLayout.getLineCount() <= 2) {
                                    this.A05.setTextSize(0, textSize2);
                                    break;
                                }
                            } else {
                                EditText editText8 = this.A05;
                                Spannable spannable = this.A00;
                                spannable.getClass();
                                ViewOnFocusChangeListenerC23254ASp.A01(editText8, spannable);
                                break;
                            }
                        }
                    }
                    this.A00 = new SpannableStringBuilder(editable);
                }

                {
                    this.A06 = this;
                    this.A05 = editText7;
                    TextPaint textPaint = new TextPaint(editText7.getPaint());
                    this.A04 = textPaint;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    this.A03 = spannableStringBuilder;
                    Resources resources = editText7.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.avatar_sticker_max_height) - (AbstractC166997dE.A09(resources) * 2);
                    textPaint.density = resources.getDisplayMetrics().density;
                    this.A02 = new DynamicLayout(spannableStringBuilder, textPaint, dimensionPixelSize, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    this.A01 = resources.getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size) - (resources.getDimensionPixelSize(R.dimen.accent_edge_thickness) * 2);
                }
            });
            final EditText editText8 = this.A03;
            editText8.addTextChangedListener(new WKa(editText8, this) { // from class: X.9qH
                public Spannable A00;
                public final int A01;
                public final DynamicLayout A02;
                public final SpannableStringBuilder A03;
                public final TextPaint A04;
                public final EditText A05;
                public final /* synthetic */ ViewOnFocusChangeListenerC23254ASp A06;

                @Override // X.WKa, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    int i2;
                    CharSequence charSequence = editable;
                    if (TextUtils.isEmpty(editable)) {
                        charSequence = this.A05.getHint();
                    }
                    charSequence.getClass();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    SpannableStringBuilder spannableStringBuilder2 = this.A03;
                    spannableStringBuilder2.replace(0, spannableStringBuilder2.length(), (CharSequence) spannableStringBuilder);
                    ViewOnFocusChangeListenerC23254ASp viewOnFocusChangeListenerC23254ASp = this.A06;
                    float f = viewOnFocusChangeListenerC23254ASp.A05;
                    float f2 = f * 0.05f;
                    DynamicLayout dynamicLayout = this.A02;
                    if (dynamicLayout != null) {
                        i2 = dynamicLayout.getHeight();
                    } else {
                        i2 = 0;
                    }
                    int i3 = this.A01;
                    if (i2 <= i3 && dynamicLayout.getLineCount() <= 2) {
                        TextPaint textPaint = this.A04;
                        float textSize = textPaint.getTextSize();
                        while (true) {
                            textSize += f2;
                            if (textSize > f) {
                                break;
                            }
                            textPaint.setTextSize(textSize);
                            spannableStringBuilder2.replace(0, spannableStringBuilder2.length(), (CharSequence) spannableStringBuilder);
                            if (dynamicLayout.getHeight() > i3 || dynamicLayout.getLineCount() > 2) {
                                break;
                            } else {
                                this.A05.setTextSize(0, textSize);
                            }
                        }
                        textPaint.setTextSize(this.A05.getTextSize());
                    } else {
                        TextPaint textPaint2 = this.A04;
                        float textSize2 = textPaint2.getTextSize();
                        while (true) {
                            textSize2 -= f2;
                            if (textSize2 >= viewOnFocusChangeListenerC23254ASp.A06) {
                                textPaint2.setTextSize(textSize2);
                                int i4 = 0;
                                spannableStringBuilder2.replace(0, spannableStringBuilder2.length(), (CharSequence) spannableStringBuilder);
                                if (dynamicLayout != null) {
                                    i4 = dynamicLayout.getHeight();
                                }
                                if (i4 <= i3 && dynamicLayout.getLineCount() <= 2) {
                                    this.A05.setTextSize(0, textSize2);
                                    break;
                                }
                            } else {
                                EditText editText82 = this.A05;
                                Spannable spannable = this.A00;
                                spannable.getClass();
                                ViewOnFocusChangeListenerC23254ASp.A01(editText82, spannable);
                                break;
                            }
                        }
                    }
                    this.A00 = new SpannableStringBuilder(editable);
                }

                {
                    this.A06 = this;
                    this.A05 = editText8;
                    TextPaint textPaint = new TextPaint(editText8.getPaint());
                    this.A04 = textPaint;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    this.A03 = spannableStringBuilder;
                    Resources resources = editText8.getResources();
                    int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.avatar_sticker_max_height) - (AbstractC166997dE.A09(resources) * 2);
                    textPaint.density = resources.getDisplayMetrics().density;
                    this.A02 = new DynamicLayout(spannableStringBuilder, textPaint, dimensionPixelSize, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    this.A01 = resources.getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size) - (resources.getDimensionPixelSize(R.dimen.accent_edge_thickness) * 2);
                }
            });
            Context context = this.A07;
            int[] A1B = AbstractC167027dH.A1B(context, R.attr.igds_color_creation_tools_blue);
            int[] A1B2 = AbstractC167027dH.A1B(context, R.attr.igds_color_creation_tools_pink);
            EditText editText9 = this.A01;
            String str2 = this.A0C;
            int A0A = AbstractC166987dD.A0A(0.5f, 255.0f);
            int[] iArr = new int[5];
            do {
                iArr[i] = AbstractC167017dG.A02(A1B[i], A0A);
                i++;
            } while (i < 5);
            SpannableString spannableString = new SpannableString(str2);
            float[] fArr = C6QG.A00;
            spannableString.setSpan(new C9T8(spannableString, fArr, iArr), 0, spannableString.length(), 33);
            editText9.setHint(new SpannedString(spannableString));
            EditText editText10 = this.A03;
            String str3 = this.A0D;
            int[] iArr2 = new int[5];
            int i2 = 0;
            do {
                iArr2[i2] = AbstractC167017dG.A02(A1B2[i2], A0A);
                i2++;
            } while (i2 < 5);
            SpannableString spannableString2 = new SpannableString(str3);
            spannableString2.setSpan(new C9T8(spannableString2, fArr, iArr2), 0, spannableString2.length(), 33);
            editText10.setHint(new SpannedString(spannableString2));
            EditText editText11 = this.A01;
            APp aPp = new APp(fArr, A1B);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            spannableStringBuilder.setSpan(aPp, 0, spannableStringBuilder.length(), 18);
            editText11.setText(spannableStringBuilder);
            EditText editText12 = this.A03;
            APp aPp2 = new APp(fArr, A1B2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            spannableStringBuilder2.setSpan(aPp2, 0, spannableStringBuilder2.length(), 18);
            editText12.setText(spannableStringBuilder2);
            AbstractC13880nE.A0u(this.A08, new CallableC24924B0x(this, 6));
        }
        View[] viewArr = {this.A08};
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le.A04(null, viewArr, false);
        ViewGroup viewGroup2 = this.A00;
        viewGroup2.getClass();
        viewGroup2.setVisibility(0);
        EditText editText13 = this.A02;
        editText13.getClass();
        editText13.requestFocus();
        if (c220789p2 != null) {
            EditText editText14 = this.A02;
            C22914A8k c22914A8k = c220789p2.A0j;
            if (c22914A8k != null) {
                str = c22914A8k.A03;
            } else {
                str = null;
            }
            A01(editText14, str);
            EditText editText15 = this.A01;
            if (editText15 != null) {
                A01(editText15, c220789p2.A0k.A0F.toString());
            }
            EditText editText16 = this.A03;
            if (editText16 != null) {
                A01(editText16, c220789p2.A0l.A0F.toString());
            }
        }
        C8O8 c8o8 = this.A0F;
        C148276lx c148276lx = C148276lx.A0a;
        c8o8.Dom("poll_sticker_bundle_id");
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (this.A04 > i) {
            A00();
            this.A0B.DOI();
        }
        this.A04 = i;
        int height = this.A08.getHeight() - this.A04;
        this.A00.getClass();
        this.A00.setTranslationY((height - r0.getHeight()) / 2);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.A0A.A9e(this);
            AbstractC13880nE.A0R(view);
            return;
        }
        EditText editText = this.A02;
        editText.getClass();
        if (editText.hasFocus()) {
            return;
        }
        EditText editText2 = this.A01;
        editText2.getClass();
        if (editText2.hasFocus()) {
            return;
        }
        EditText editText3 = this.A03;
        editText3.getClass();
        if (editText3.hasFocus()) {
            return;
        }
        this.A0A.EFx(null);
        AbstractC13880nE.A0O(view);
        EditText editText4 = this.A01;
        editText4.getClass();
        String trim = AbstractC167007dF.A0g(editText4).trim();
        if (TextUtils.isEmpty(trim)) {
            trim = this.A0C;
        }
        EditText editText5 = this.A03;
        editText5.getClass();
        String trim2 = AbstractC167007dF.A0g(editText5).trim();
        if (TextUtils.isEmpty(trim2)) {
            trim2 = this.A0D;
        }
        float textSize = this.A01.getTextSize();
        float textSize2 = this.A03.getTextSize();
        EditText editText6 = this.A02;
        editText6.getClass();
        String A0g = AbstractC167007dF.A0g(editText6);
        float textSize3 = this.A02.getTextSize();
        int width = (this.A02.getWidth() - this.A02.getPaddingLeft()) - this.A02.getPaddingRight();
        int paddingBottom = this.A02.getPaddingBottom();
        AbstractC167017dG.A1P(trim, trim2);
        Al7 al7 = new Al7();
        al7.A05 = trim;
        al7.A07 = trim2;
        al7.A00 = textSize;
        al7.A02 = textSize2;
        al7.A06 = A0g;
        al7.A01 = textSize3;
        al7.A03 = width;
        al7.A04 = paddingBottom;
        C150956qv.A08(new View[]{this.A08}, false);
        A01(this.A02, "");
        A01(this.A01, "");
        A01(this.A03, "");
        ViewGroup viewGroup = this.A00;
        viewGroup.getClass();
        viewGroup.setVisibility(8);
        this.A0B.Dog(al7, null);
    }

    public ViewOnFocusChangeListenerC23254ASp(Context context, View view, UserSession userSession, C3I9 c3i9, C8O8 c8o8, C8NX c8nx) {
        this.A0E = userSession;
        this.A07 = context;
        this.A0A = c3i9;
        this.A0B = c8nx;
        this.A0F = c8o8;
        this.A08 = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A09 = (ViewStub) view.requireViewById(R.id.polling_edit_stub);
        Resources resources = view.getResources();
        float A04 = AbstractC166987dD.A04(resources, R.dimen.audition_flow_picker_subtitle_margin_bottom);
        this.A05 = A04;
        this.A06 = A04 * 0.5f;
        this.A0C = resources.getString(2131969738);
        this.A0D = resources.getString(2131969740);
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        A00();
        C8O8 c8o8 = this.A0F;
        C148276lx c148276lx = C148276lx.A0a;
        c8o8.Doh("poll_sticker_bundle_id");
    }
}
