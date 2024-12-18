package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.522, reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass522 extends ClickableSpan {
    public final Integer color;

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        Integer num = this.color;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public AnonymousClass522(Integer num) {
        this.color = num;
    }

    public /* synthetic */ AnonymousClass522(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }

    public AnonymousClass522() {
        this(null);
    }
}
