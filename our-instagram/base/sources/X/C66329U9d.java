package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.common.accessibility.AccessibleTextView;

/* renamed from: X.U9d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66329U9d extends ClickableSpan {
    public final /* synthetic */ AccessibleTextView A00;
    public final /* synthetic */ C65789Tu7 A01;
    public final /* synthetic */ boolean A02;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i;
        C14360o3.A0B(textPaint, 0);
        textPaint.setUnderlineText(false);
        boolean z = this.A02;
        Context context = this.A00.getContext();
        if (z) {
            i = AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text);
        } else {
            i = R.color.igds_pill_active_text;
        }
        AbstractC166987dD.A1N(context, textPaint, i);
    }

    public C66329U9d(AccessibleTextView accessibleTextView, C65789Tu7 c65789Tu7, boolean z) {
        this.A02 = z;
        this.A00 = accessibleTextView;
        this.A01 = c65789Tu7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ((InterfaceC16820sZ) this.A01.A01.A00).invoke();
    }
}
