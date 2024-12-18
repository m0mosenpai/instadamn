package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebookpay.form.view.BaseAutoCompleteTextView;
import com.fbpay.theme.FBPayIcon;

/* renamed from: X.Uvp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C67677Uvp extends AbstractC67779Uxv implements X9f {
    public int A00;
    public int A01;
    public int A02;
    public FrameLayout A03;
    public UvM A04;
    public final TextWatcher A05;
    public final View.OnFocusChangeListener A06;
    public final View.OnKeyListener A07;
    public final InterfaceC58362lv A08;
    public final InterfaceC58362lv A09;
    public final InterfaceC58362lv A0A;
    public final InterfaceC58362lv A0B;
    public final InterfaceC58362lv A0C;
    public final InterfaceC58362lv A0D;
    public final InterfaceC58362lv A0E;
    public final InterfaceC58362lv A0F;
    public final InterfaceC58362lv A0G;

    public static final void A06(C67677Uvp c67677Uvp, C70071W1o c70071W1o) {
        Boolean bool = true;
        UvM uvM = c67677Uvp.A04;
        if (uvM == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        if (!bool.equals(uvM.A06.A02())) {
            if (c70071W1o == null) {
                c67677Uvp.getIcon().setVisibility(8);
                c67677Uvp.setShowLoadingSpinner(false);
                return;
            }
            FBPayIcon fBPayIcon = c70071W1o.A00;
            Integer num = c70071W1o.A01;
            if (fBPayIcon != null) {
                int i = fBPayIcon.A01;
                if (i == 41) {
                    c67677Uvp.setShowLoadingSpinner(true);
                    return;
                }
                c67677Uvp.A0O(C2FP.A0A().A04(AbstractC166997dE.A0L(c67677Uvp), i, fBPayIcon.A00), new WNN(c67677Uvp, 21), null);
                return;
            }
            if (num == null) {
                return;
            }
            Drawable drawable = c67677Uvp.getContext().getDrawable(num.intValue());
            if (drawable != null) {
                c67677Uvp.A0O(drawable, null, Integer.valueOf(R.dimen.asset_search_icon_width));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.X9f
    public void setViewModel(UvM uvM) {
        int i;
        C14360o3.A0B(uvM, 0);
        this.A04 = uvM;
        ((AbstractC67779Uxv) this).A06 = uvM.A0Q;
        setId(View.generateViewId());
        BaseAutoCompleteTextView inputText = getInputText();
        UvM uvM2 = this.A04;
        if (uvM2 != null) {
            inputText.setId(((AbstractC129435t5) uvM2).A03);
            BaseAutoCompleteTextView inputText2 = getInputText();
            UvM uvM3 = this.A04;
            if (uvM3 != null) {
                inputText2.setText((String) ((AbstractC129435t5) uvM3).A05.A02());
                BaseAutoCompleteTextView inputText3 = getInputText();
                UvM uvM4 = this.A04;
                if (uvM4 != null) {
                    switch (uvM4.A0L.intValue()) {
                        case 1:
                            i = 4099;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 1;
                            break;
                        case 4:
                            i = 4097;
                            break;
                        case 5:
                        default:
                            i = 3;
                            break;
                        case 6:
                            i = 33;
                            break;
                    }
                    inputText3.setInputType(i);
                    getInputText().setImeOptions(33554432);
                    UvM uvM5 = this.A04;
                    if (uvM5 != null) {
                        if (uvM5.A0M != null) {
                            BaseAutoCompleteTextView inputText4 = getInputText();
                            UvM uvM6 = this.A04;
                            if (uvM6 != null) {
                                inputText4.setAutofillHints(uvM6.A0M);
                                getInputText().setImportantForAutofill(1);
                            }
                        }
                        getInputText().A02 = new X2x(this, 12);
                        getInputText().A03 = new X2x(this, 13);
                        UvM uvM7 = this.A04;
                        if (uvM7 != null) {
                            setEnabled(((AbstractC129435t5) uvM7).A08);
                            A03(this);
                            UvM uvM8 = this.A04;
                            if (uvM8 != null) {
                                if (uvM8.A0P) {
                                    A04(this);
                                }
                                UvM uvM9 = this.A04;
                                if (uvM9 != null) {
                                    if (uvM9.A0Q) {
                                        A0N();
                                        Context A0L = AbstractC166997dE.A0L(this);
                                        int A00 = (int) W6b.A00(A0L, R.attr.fbpay_condensed_input_field_vertical_padding);
                                        int A002 = (int) W6b.A00(A0L, R.attr.fbpay_condensed_input_field_horizontal_padding);
                                        setPadding(A002, A00, A002, A00);
                                    }
                                    ViewParent parent = getInputText().getParent();
                                    C14360o3.A0C(parent, AbstractC111324zv.A00(1));
                                    this.A03 = (FrameLayout) parent;
                                    this.A01 = getPaddingTop();
                                    this.A00 = getPaddingBottom();
                                    if (this.A03 != null) {
                                        this.A02 = (int) W6b.A00(AbstractC166997dE.A0L(this), R.attr.fbpay_input_field_vertical_adjust_padding);
                                        A05(this);
                                    }
                                    setOnClickListener(new WNN(this, 20));
                                    getInputText().addTextChangedListener(this.A05);
                                    getInputText().setOnFocusChangeListener(this.A06);
                                    getInputText().setOnKeyListener(this.A07);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    private final String getAccessibilityHint() {
        UvM uvM = this.A04;
        if (uvM == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        int i = uvM.A03;
        if (i != 0) {
            String string = getResources().getString(i);
            C14360o3.A0A(string);
            return string;
        }
        return "";
    }

    private final String getAccessibilityLabel() {
        UvM uvM = this.A04;
        if (uvM == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        int i = uvM.A04;
        if (i != 0) {
            return getResources().getString(i);
        }
        return getExistingHint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getExistingHint() {
        UvM uvM = this.A04;
        if (uvM == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        int i = uvM.A05;
        if (i != 0) {
            return getResources().getString(i);
        }
        String str = uvM.A0N;
        if (str != null) {
            return str;
        }
        return "";
    }

    public String getExistingError() {
        UvM uvM = this.A04;
        if (uvM != null) {
            if (uvM.A0J() != 0) {
                Resources resources = getResources();
                UvM uvM2 = this.A04;
                if (uvM2 != null) {
                    return AbstractC166997dE.A0q(resources, uvM2.A0J());
                }
            } else {
                UvM uvM3 = this.A04;
                if (uvM3 != null) {
                    String A0K = uvM3.A0K();
                    if (A0K != null) {
                        return A0K;
                    }
                    return "";
                }
            }
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    public final UvM getViewModel() {
        UvM uvM = this.A04;
        if (uvM == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        return uvM;
    }

    public C67677Uvp(Context context) {
        super(context);
        this.A06 = new WNY(this, 1);
        this.A07 = new ViewOnKeyListenerC70238WNb(this, 2);
        this.A05 = new WKU(this, 0);
        this.A0E = new C70302WQh(this, 47);
        this.A0D = new C70302WQh(this, 46);
        this.A0G = new C70302WQh(this, 49);
        this.A0F = new C70302WQh(this, 48);
        this.A0B = new C70302WQh(this, 44);
        this.A0C = new C70302WQh(this, 45);
        this.A08 = new C70302WQh(this, 41);
        this.A09 = new C70302WQh(this, 42);
        this.A0A = new C63627SqZ(new C70302WQh(this, 43), 44);
    }

    public static final /* synthetic */ String A01(C67677Uvp c67677Uvp) {
        return c67677Uvp.getAccessibilityHintWithError();
    }

    public static final /* synthetic */ String A02(C67677Uvp c67677Uvp) {
        return c67677Uvp.getExistingHint();
    }

    public static final void A03(C67677Uvp c67677Uvp) {
        String accessibilityLabel = c67677Uvp.getAccessibilityLabel();
        Editable text = c67677Uvp.getInputText().getText();
        if (text != null && text.length() != 0) {
            accessibilityLabel = TextUtils.join(", ", new Object[]{accessibilityLabel, c67677Uvp.getInputText().getText()});
        }
        AbstractC69838VwO.A00(c67677Uvp.getInputText(), false, C05F.A0Y, c67677Uvp.getAccessibilityHint(), accessibilityLabel);
    }

    public static final void A04(C67677Uvp c67677Uvp) {
        InputMethodManager inputMethodManager;
        c67677Uvp.getInputText().requestFocus();
        Object systemService = c67677Uvp.getContext().getSystemService("input_method");
        if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null) {
            inputMethodManager.showSoftInput(c67677Uvp.getInputText(), 1);
        }
    }

    public static final void A05(C67677Uvp c67677Uvp) {
        if (!c67677Uvp.getInputText().hasFocus()) {
            Editable text = c67677Uvp.getInputText().getText();
            C14360o3.A07(text);
            if (text.length() <= 0) {
                c67677Uvp.setPadding(c67677Uvp.getPaddingLeft(), c67677Uvp.A01 - c67677Uvp.A02, c67677Uvp.getPaddingRight(), c67677Uvp.A00 + c67677Uvp.A02);
                WFM.A03(c67677Uvp.getIcon(), 0, 0, Integer.valueOf(c67677Uvp.A02), 0);
                return;
            }
        }
        c67677Uvp.setPadding(c67677Uvp.getPaddingLeft(), c67677Uvp.A01, c67677Uvp.getPaddingRight(), c67677Uvp.A00);
        WFM.A03(c67677Uvp.getIcon(), 0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAccessibilityHintWithError() {
        int A0I;
        Object[] objArr;
        String A0R;
        String accessibilityHint = getAccessibilityHint();
        UvM uvM = this.A04;
        if (uvM != null) {
            if (uvM.A0I() != 0) {
                int length = accessibilityHint.length();
                Resources resources = getResources();
                if (length == 0) {
                    UvM uvM2 = this.A04;
                    if (uvM2 != null) {
                        A0I = uvM2.A0I();
                        objArr = new Object[1];
                        A0R = "";
                        objArr[0] = A0R;
                        String string = resources.getString(A0I, objArr);
                        C14360o3.A0A(string);
                        return string;
                    }
                } else {
                    UvM uvM3 = this.A04;
                    if (uvM3 != null) {
                        A0I = uvM3.A0I();
                        objArr = new Object[1];
                        A0R = AnonymousClass001.A0R(", ", accessibilityHint);
                        objArr[0] = A0R;
                        String string2 = resources.getString(A0I, objArr);
                        C14360o3.A0A(string2);
                        return string2;
                    }
                }
            } else {
                return accessibilityHint;
            }
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = C0f9.A06(265752293);
        super.onAttachedToWindow();
        UvM uvM = this.A04;
        if (uvM != null) {
            uvM.A06.A09(this.A0F);
            UvM uvM2 = this.A04;
            if (uvM2 != null) {
                uvM2.A0B.A09(this.A0B);
                UvM uvM3 = this.A04;
                if (uvM3 != null) {
                    uvM3.A09.A09(this.A0C);
                    UvM uvM4 = this.A04;
                    if (uvM4 != null) {
                        uvM4.A0F.A09(this.A0G);
                        UvM uvM5 = this.A04;
                        if (uvM5 != null) {
                            uvM5.A0C.A09(this.A08);
                            UvM uvM6 = this.A04;
                            if (uvM6 != null) {
                                uvM6.A08.A09(this.A09);
                                UvM uvM7 = this.A04;
                                if (uvM7 != null) {
                                    uvM7.A0A.A09(this.A0D);
                                    UvM uvM8 = this.A04;
                                    if (uvM8 != null) {
                                        uvM8.A07.A09(this.A0E);
                                        UvM uvM9 = this.A04;
                                        if (uvM9 != null) {
                                            uvM9.A0D.A09(this.A0A);
                                            C0f9.A0D(1964128704, A06);
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
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = C0f9.A06(1985265656);
        super.onDetachedFromWindow();
        UvM uvM = this.A04;
        if (uvM != null) {
            uvM.A06.A08(this.A0F);
            UvM uvM2 = this.A04;
            if (uvM2 != null) {
                uvM2.A0B.A08(this.A0B);
                UvM uvM3 = this.A04;
                if (uvM3 != null) {
                    uvM3.A09.A08(this.A0C);
                    UvM uvM4 = this.A04;
                    if (uvM4 != null) {
                        uvM4.A0F.A08(this.A0G);
                        UvM uvM5 = this.A04;
                        if (uvM5 != null) {
                            uvM5.A0C.A08(this.A08);
                            UvM uvM6 = this.A04;
                            if (uvM6 != null) {
                                uvM6.A08.A08(this.A09);
                                UvM uvM7 = this.A04;
                                if (uvM7 != null) {
                                    uvM7.A0A.A08(this.A0D);
                                    UvM uvM8 = this.A04;
                                    if (uvM8 != null) {
                                        uvM8.A07.A08(this.A0E);
                                        UvM uvM9 = this.A04;
                                        if (uvM9 != null) {
                                            uvM9.A0D.A08(this.A0A);
                                            C0f9.A0D(-491614000, A06);
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
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }
}
