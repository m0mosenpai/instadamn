package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DxC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31759DxC extends ClickableSpan {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C2Fb A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;

    public C31759DxC(FragmentActivity fragmentActivity, UserSession userSession, C2Fb c2Fb, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        this.A05 = interfaceC16820sZ;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = c2Fb;
        this.A04 = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        InterfaceC16820sZ interfaceC16820sZ = this.A05;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        C63397SjR A0y = AbstractC25228BEl.A0y(this.A00, this.A01, this.A02, this.A03);
        A0y.A0S = this.A04;
        A0y.A0A();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        FragmentActivity fragmentActivity = this.A00;
        AbstractC166987dD.A1N(fragmentActivity, textPaint, AbstractC53242c7.A06(fragmentActivity));
    }
}
