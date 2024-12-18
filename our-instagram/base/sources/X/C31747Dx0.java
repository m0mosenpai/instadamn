package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Dx0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31747Dx0 extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        int color = this.A00.getColor(R.color.design_dark_default_color_on_background);
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(color);
    }

    public C31747Dx0(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C35133Fea c35133Fea = SimpleWebViewActivity.A02;
        Context context = this.A00;
        c35133Fea.A02(context, this.A01, new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, context.getString(2131965056), AbstractC63260SgI.A01(context, "https://help.instagram.com/227486307449481")));
    }
}
