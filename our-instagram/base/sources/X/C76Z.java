package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayDeque;

/* renamed from: X.76Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C76Z extends AbstractC66422zJ {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC165647ar A02;
    public final C7IM A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.thread_new_message_separator, viewGroup, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new C44695Jqe(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        SpannableString spannableString;
        String str;
        JUY juy = (JUY) interfaceC66482zP;
        C44695Jqe c44695Jqe = (C44695Jqe) c3oo;
        C14360o3.A0B(juy, 0);
        C14360o3.A0B(c44695Jqe, 1);
        View view = c44695Jqe.A00;
        int i = juy.A00;
        view.setBackgroundColor(i);
        c44695Jqe.A01.setBackgroundColor(i);
        TextView textView = c44695Jqe.A02;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        Context context = this.A00;
        String string = context.getString(2131968460);
        C14360o3.A07(string);
        if (C18U.A06(C06090Tz.A05, this.A01, 36331111177012386L) && (str = juy.A02) != null) {
            context.getResources();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayDeque arrayDeque = new ArrayDeque();
            String string2 = context.getString(2131968461);
            C14360o3.A07(string2);
            String string3 = context.getString(2131968462, string, string2);
            C14360o3.A07(string3);
            spannableStringBuilder.append((CharSequence) string3);
            AbstractC31423DrT.A00(spannableStringBuilder, string2, string2, arrayDeque, new Object[]{new C44387JjQ(this, str, juy.A01)}, 33);
            spannableString = new SpannableString(spannableStringBuilder);
        } else {
            spannableString = new SpannableString(string);
        }
        textView.setText(spannableString);
        textView.setTextColor(i);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return JUY.class;
    }

    public C76Z(Context context, UserSession userSession, InterfaceC165647ar interfaceC165647ar, C7IM c7im) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = c7im;
        this.A02 = interfaceC165647ar;
    }
}
