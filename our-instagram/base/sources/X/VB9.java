package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.text.fittingtextview.FittingTextView;

/* loaded from: classes11.dex */
public final class VB9 extends WKa {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final /* synthetic */ ViewOnFocusChangeListenerC70880Wil A05;

    public VB9(Context context, ViewOnFocusChangeListenerC70880Wil viewOnFocusChangeListenerC70880Wil) {
        this.A05 = viewOnFocusChangeListenerC70880Wil;
        Resources resources = context.getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A03 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A02 = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }

    @Override // X.WKa, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText;
        int i;
        ViewOnFocusChangeListenerC70880Wil viewOnFocusChangeListenerC70880Wil = this.A05;
        EditText editText2 = viewOnFocusChangeListenerC70880Wil.A07;
        String str = "stickerTitleView";
        if (editText2 != null) {
            int lineCount = editText2.getLineCount();
            if (lineCount != this.A00) {
                EditText editText3 = viewOnFocusChangeListenerC70880Wil.A07;
                if (lineCount == 2) {
                    if (editText3 != null) {
                        AbstractC13880nE.A0d(editText3, this.A02);
                        editText = viewOnFocusChangeListenerC70880Wil.A07;
                        if (editText != null) {
                            i = this.A01;
                            AbstractC13880nE.A0Y(editText, i);
                            this.A00 = lineCount;
                        }
                    }
                } else if (editText3 != null) {
                    AbstractC13880nE.A0d(editText3, this.A04);
                    editText = viewOnFocusChangeListenerC70880Wil.A07;
                    if (editText != null) {
                        i = this.A03;
                        AbstractC13880nE.A0Y(editText, i);
                        this.A00 = lineCount;
                    }
                }
            }
            boolean A04 = ViewOnFocusChangeListenerC70880Wil.A04(viewOnFocusChangeListenerC70880Wil);
            FittingTextView fittingTextView = viewOnFocusChangeListenerC70880Wil.A0O;
            fittingTextView.setEnabled(A04);
            AJq.A01(fittingTextView, A04);
            ViewOnFocusChangeListenerC70880Wil.A02(viewOnFocusChangeListenerC70880Wil, true);
            TextView textView = viewOnFocusChangeListenerC70880Wil.A08;
            if (textView == null) {
                str = "incompleteStickerErrorView";
            } else {
                C150956qv.A08(new View[]{textView}, true);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
