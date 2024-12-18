package X;

import android.app.Dialog;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;

/* renamed from: X.U9b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66327U9b extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public C66327U9b(W55 w55, int i) {
        this.A00 = i;
        this.A01 = w55;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C68660VZw c68660VZw;
        Intent intent;
        String str;
        int i = this.A00;
        Dialog dialog = AbstractC68220VIg.A00;
        if (i != 0) {
            if (dialog != null) {
                dialog.dismiss();
            }
            c68660VZw = ((W55) this.A01).A01;
            intent = new Intent("android.intent.action.VIEW");
            str = "https://www.openstreetmap.org/copyright/";
        } else {
            if (dialog != null) {
                dialog.dismiss();
            }
            c68660VZw = ((W55) this.A01).A01;
            intent = new Intent("android.intent.action.VIEW");
            str = "https://www.facebook.com/maps/attribution_terms/";
        }
        c68660VZw.A00.A00.startActivity(intent.setData(android.net.Uri.parse(str)).setFlags(268435456));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC166987dD.A1N(((W55) this.A01).A00, textPaint, R.color.info_dialog_link_color);
        textPaint.setUnderlineText(false);
    }
}
