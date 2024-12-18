package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.Uxu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67778Uxu extends UEH {
    public final /* synthetic */ C67777Uxt A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67778Uxu(C67777Uxt c67777Uxt, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.A00 = c67777Uxt;
    }

    @Override // X.C02V
    public final void A0T(View view, AccessibilityEvent accessibilityEvent) {
        super.A0T(view, accessibilityEvent);
        C67777Uxt c67777Uxt = this.A00;
        TextInputLayout textInputLayout = ((AbstractC69084Vha) c67777Uxt).A02;
        EditText editText = textInputLayout.A0F;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (accessibilityEvent.getEventType() == 1 && c67777Uxt.A04.isTouchExplorationEnabled() && textInputLayout.A0F.getKeyListener() == null) {
                C67777Uxt.A01(autoCompleteTextView, c67777Uxt);
                return;
            }
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // X.UEH, X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0Y(view, accessibilityNodeInfoCompat);
        if (((AbstractC69084Vha) this.A00).A02.A0F.getKeyListener() == null) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.mInfo.isShowingHintText()) {
            accessibilityNodeInfoCompat.mInfo.setHintText(null);
        }
    }
}
