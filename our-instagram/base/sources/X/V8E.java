package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;
import kotlin.Deprecated;

@Deprecated(message = "You should NOT use this directly and should only use [IgdsBottomButtonLayout] instead.")
/* loaded from: classes11.dex */
public final class V8E extends C64P {
    public View A00;
    public TextView A01;
    public TextView A02;
    public IgdsButton A03;
    public IgdsButton A04;

    public static final void A00(Context context, TypedArray typedArray, V8E v8e, IgdsButton igdsButton, int i) {
        String str;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            CharSequence text = context.getText(resourceId);
            if (text instanceof String) {
                str = (String) text;
            } else {
                str = null;
            }
            igdsButton.setText(str);
            igdsButton.setVisibility(0);
        } else {
            v8e.A03(igdsButton, typedArray.getText(i));
        }
        A02(v8e);
    }

    public static final void A01(TextView textView, V8E v8e, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        A02(v8e);
    }

    private final void A03(IgdsButton igdsButton, CharSequence charSequence) {
        String str;
        if (charSequence != null && charSequence.length() != 0) {
            if (charSequence instanceof String) {
                str = (String) charSequence;
            } else {
                str = null;
            }
            igdsButton.setText(str);
            igdsButton.setVisibility(0);
        } else {
            igdsButton.setVisibility(8);
        }
        A02(this);
    }

    @Override // X.C64P
    public final void A04(CharSequence charSequence, int i) {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "footer";
        } else {
            C18C.A0I(AbstractC167007dF.A1P(textView.getVisibility(), 8), "You can only have a footer above OR below, not both", new Object[0]);
            TextView textView2 = this.A02;
            str = "footerAboveAction";
            if (textView2 != null) {
                A01(textView2, this, charSequence);
                TextView textView3 = this.A02;
                if (textView3 != null) {
                    textView3.setBreakStrategy(0);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C64P
    public void setButtonType(C64R c64r) {
        C14360o3.A0B(c64r, 0);
    }

    public static final void A02(V8E v8e) {
        String str;
        IgdsButton igdsButton = v8e.A03;
        if (igdsButton == null) {
            str = "primaryActionButton";
        } else {
            CharSequence text = igdsButton.A0A.getText();
            int i = 0;
            if (text == null || text.length() == 0) {
                IgdsButton igdsButton2 = v8e.A04;
                if (igdsButton2 == null) {
                    str = "secondaryActionButton";
                } else {
                    CharSequence text2 = igdsButton2.A0A.getText();
                    if (text2 == null || text2.length() == 0) {
                        TextView textView = v8e.A01;
                        if (textView == null) {
                            str = "footer";
                        } else {
                            CharSequence text3 = textView.getText();
                            if (text3 == null || text3.length() == 0) {
                                i = 8;
                            }
                        }
                    }
                }
            }
            v8e.setVisibility(i);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C64P
    public final void A05(CharSequence charSequence, int i) {
        String str;
        TextView textView = this.A02;
        if (textView == null) {
            str = "footerAboveAction";
        } else {
            C18C.A0I(AbstractC167007dF.A1P(textView.getVisibility(), 8), "You can only have a footer above OR below, not both", new Object[0]);
            TextView textView2 = this.A01;
            str = "footer";
            if (textView2 != null) {
                A01(textView2, this, charSequence);
                TextView textView3 = this.A01;
                if (textView3 != null) {
                    textView3.setBreakStrategy(i);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C64P
    public final boolean A06() {
        IgdsButton igdsButton = this.A03;
        if (igdsButton == null) {
            C14360o3.A0F("primaryActionButton");
            throw C00O.createAndThrow();
        }
        return igdsButton.isEnabled();
    }

    @Override // X.C64P
    public void setDividerVisible(boolean z) {
        View view = this.A00;
        if (view == null) {
            C14360o3.A0F("divider");
            throw C00O.createAndThrow();
        }
        view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    @Override // X.C64P
    public void setPrimaryActionIsLoading(boolean z) {
        IgdsButton igdsButton = this.A03;
        if (igdsButton == null) {
            C14360o3.A0F("primaryActionButton");
            throw C00O.createAndThrow();
        }
        igdsButton.setLoading(z);
    }

    @Override // X.C64P
    public void setPrimaryActionOnClickListener(View.OnClickListener onClickListener) {
        IgdsButton igdsButton = this.A03;
        if (igdsButton == null) {
            C14360o3.A0F("primaryActionButton");
            throw C00O.createAndThrow();
        }
        igdsButton.setOnClickListener(onClickListener);
    }

    @Override // X.C64P
    public void setPrimaryActionText(CharSequence charSequence) {
        IgdsButton igdsButton = this.A03;
        if (igdsButton == null) {
            C14360o3.A0F("primaryActionButton");
            throw C00O.createAndThrow();
        }
        A03(igdsButton, charSequence);
    }

    @Override // X.C64P
    public void setPrimaryButtonEnabled(boolean z) {
        IgdsButton igdsButton = this.A03;
        if (igdsButton == null) {
            C14360o3.A0F("primaryActionButton");
            throw C00O.createAndThrow();
        }
        igdsButton.setEnabled(z);
    }

    @Override // X.C64P
    public void setSecondaryActionOnClickListener(View.OnClickListener onClickListener) {
        IgdsButton igdsButton = this.A04;
        if (igdsButton == null) {
            C14360o3.A0F("secondaryActionButton");
            throw C00O.createAndThrow();
        }
        igdsButton.setOnClickListener(onClickListener);
    }

    @Override // X.C64P
    public void setSecondaryActionText(CharSequence charSequence) {
        IgdsButton igdsButton = this.A04;
        if (igdsButton == null) {
            C14360o3.A0F("secondaryActionButton");
            throw C00O.createAndThrow();
        }
        A03(igdsButton, charSequence);
    }

    @Override // X.C64P
    public void setSecondaryButtonEnabled(boolean z) {
        IgdsButton igdsButton = this.A04;
        if (igdsButton == null) {
            C14360o3.A0F("secondaryActionButton");
            throw C00O.createAndThrow();
        }
        igdsButton.setEnabled(z);
    }

    private final void setButtonTypeInternal(C64R c64r) {
    }
}
