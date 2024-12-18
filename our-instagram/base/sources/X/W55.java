package X;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* loaded from: classes11.dex */
public class W55 {
    public static final android.net.Uri A05 = android.net.Uri.parse("https://www.facebook.com/maps/report/?");
    public final Context A00;
    public final C68660VZw A01;
    public final InterfaceC71892X8z A02;
    public final CharSequence A03;
    public final CharSequence A04;

    public final Dialog A00(Dialog dialog) {
        C66328U9c c66328U9c = new C66328U9c(0, dialog, this);
        C66327U9b c66327U9b = new C66327U9b(this, 0);
        C66327U9b c66327U9b2 = new C66327U9b(this, 1);
        Context context = this.A00;
        String string = context.getResources().getString(2131966035);
        String string2 = context.getResources().getString(2131966033);
        String string3 = context.getResources().getString(2131969221);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(c66328U9c, 0, AbstractC58322PtE.A0A(string), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
        spannableStringBuilder2.setSpan(c66327U9b, 0, AbstractC58322PtE.A0A(string2), 33);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string3);
        spannableStringBuilder3.setSpan(c66327U9b2, 0, AbstractC58322PtE.A0A(string3), 33);
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) spannableStringBuilder2).append((CharSequence) "\n").append((CharSequence) spannableStringBuilder3);
        XE5 AL6 = this.A02.AL6();
        AL6.Efs(context.getResources().getString(2131966032));
        AL6.EZ3(append);
        AL6.EbB(null, context.getResources().getString(R.string.ok));
        Dialog AL1 = AL6.AL1();
        C0fJ.A00(AL1);
        AbstractC68220VIg.A00 = AL1;
        return AL1;
    }

    public final void A01(Context context, android.net.Uri uri) {
        if (this instanceof ULZ) {
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            XE5 AL6 = this.A02.AL6();
            AL6.EZ3(this.A03);
            AL6.EbB(new DialogInterfaceOnClickListenerC70206WHe(0, this, uri), this.A04);
            AL6.EZb(null, this.A00.getResources().getString(R.string.cancel));
            Dialog AL1 = AL6.AL1();
            AL1.setOnCancelListener(new DialogInterfaceOnCancelListenerC55247OfL(0, uri, this));
            A00(AL1);
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        XE5 AL62 = this.A02.AL6();
        AL62.EZ3(this.A03);
        AL62.EbB(new DialogInterfaceOnClickListenerC70206WHe(0, this, uri), this.A04);
        Dialog AL12 = AL62.AL1();
        AL12.setOnCancelListener(new DialogInterfaceOnCancelListenerC55247OfL(0, uri, this));
        TextView textView = (TextView) A00(AL12).findViewById(R.id.message);
        if (textView == null) {
            return;
        }
        AbstractC25227BEk.A11(textView);
        textView.setLineSpacing(0.0f, 1.4f);
    }

    public W55(Context context, InterfaceC71892X8z interfaceC71892X8z, CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = context;
        this.A04 = charSequence;
        this.A03 = charSequence2;
        this.A02 = interfaceC71892X8z == null ? new C70386WTo(context) : interfaceC71892X8z;
        this.A01 = new C68660VZw(this);
    }
}
