package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EPR extends AbstractC85223rD {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC37184GZv A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    public EPR(Context context, C012804r c012804r, InterfaceC37184GZv interfaceC37184GZv, User user, Integer num, String str, boolean z) {
        this.A01 = interfaceC37184GZv;
        this.A02 = user;
        this.A03 = z;
        this.A00 = context;
        super.A02 = str;
        super.A01 = num;
        super.A00 = c012804r;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A01.DKa(this.A02, !this.A03);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
        Context context = this.A00;
        AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A09(context));
    }
}
