package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.64P, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C64P extends LinearLayout {
    public abstract void setButtonType(C64R c64r);

    public abstract void setDividerVisible(boolean z);

    public abstract void setPrimaryActionIsLoading(boolean z);

    public abstract void setPrimaryActionOnClickListener(View.OnClickListener onClickListener);

    public abstract void setPrimaryActionText(CharSequence charSequence);

    public abstract void setPrimaryButtonEnabled(boolean z);

    public abstract void setSecondaryActionOnClickListener(View.OnClickListener onClickListener);

    public abstract void setSecondaryActionText(CharSequence charSequence);

    public abstract void setSecondaryButtonEnabled(boolean z);

    public void A04(CharSequence charSequence, int i) {
        if (this instanceof C64Q) {
            C64Q c64q = (C64Q) this;
            TextView textView = c64q.A04;
            if (textView != null) {
                C64Q.A02(textView, textView, c64q, charSequence);
                textView.setBreakStrategy(0);
                c64q.A07();
                return;
            }
            return;
        }
        ((IgdsBottomButtonLayout) this).A00.A04(charSequence, 0);
    }

    public void A05(CharSequence charSequence, int i) {
        if (this instanceof C64Q) {
            C64Q c64q = (C64Q) this;
            TextView textView = c64q.A03;
            if (textView != null) {
                C64Q.A02(textView, textView, c64q, charSequence);
                textView.setBreakStrategy(i);
                c64q.A07();
                return;
            }
            return;
        }
        ((IgdsBottomButtonLayout) this).A00.A05(charSequence, i);
    }

    public boolean A06() {
        if (this instanceof C64Q) {
            View view = ((C64Q) this).A02;
            if (view == null) {
                C14360o3.A0F("primaryActionContainer");
                throw C00O.createAndThrow();
            }
            return view.isEnabled();
        }
        return ((IgdsBottomButtonLayout) this).A00.A06();
    }

    public void setPrimaryAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        setPrimaryActionText(charSequence);
        setPrimaryActionOnClickListener(onClickListener);
    }

    public void setSecondaryAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        setSecondaryActionText(charSequence);
        setSecondaryActionOnClickListener(onClickListener);
    }
}
