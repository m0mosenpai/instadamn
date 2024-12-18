package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.GQl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC36968GQl implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SpannableStringBuilder A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ E40 A03;
    public final /* synthetic */ DirectShareTarget A04;

    public /* synthetic */ RunnableC36968GQl(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, E40 e40, DirectShareTarget directShareTarget) {
        this.A03 = e40;
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = spannableStringBuilder;
        this.A04 = directShareTarget;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E40 e40 = this.A03;
        Context context = this.A00;
        SpannableStringBuilder spannableStringBuilder = this.A01;
        DirectShareTarget directShareTarget = this.A04;
        TextView textView = e40.A0A;
        textView.setText(FV9.A00(context, spannableStringBuilder, textView, AbstractC101904i3.A04((AnonymousClass172) AbstractC31172DnG.A18(directShareTarget).get(0)), e40.A01.getWidth(), directShareTarget.A0Q.size()));
        textView.setVisibility(0);
    }
}
