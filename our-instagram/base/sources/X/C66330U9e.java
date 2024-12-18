package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.uimanager.UIManagerHelper;

/* renamed from: X.U9e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66330U9e extends ClickableSpan implements InterfaceC71843X7b {
    public final int A00;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        Context context = view.getContext();
        C14360o3.A0C(context, AbstractC58317Pt9.A00(318));
        Q21 q21 = (Q21) context;
        int i = this.A00;
        X9J A05 = UIManagerHelper.A05(q21, i);
        if (A05 != null) {
            A05.APn(new Sb5(UIManagerHelper.A00(q21), i));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    public C66330U9e(int i) {
        this.A00 = i;
    }
}
