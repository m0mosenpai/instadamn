package X;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.BYe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25719BYe extends ClickableSpan {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C37251oO A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        AbstractC13880nE.A0O(view);
        Activity activity = this.A00;
        C189448aO A0y = AbstractC25225BEi.A0y(this.A01);
        A0y.A1C = false;
        A0y.A00().A02(activity, new C26858BtK());
        this.A03.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setFakeBoldText(true);
        textPaint.setUnderlineText(false);
    }

    public C25719BYe(Activity activity, UserSession userSession, C37251oO c37251oO, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = c37251oO;
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = interfaceC16820sZ;
    }
}
