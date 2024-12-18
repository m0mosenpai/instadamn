package X;

import android.content.Context;
import android.widget.TextSwitcher;
import com.facebook.R;

/* renamed from: X.GOl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36916GOl implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextSwitcher A01;

    public RunnableC36916GOl(Context context, TextSwitcher textSwitcher) {
        this.A01 = textSwitcher;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextSwitcher textSwitcher = this.A01;
        Context context = this.A00;
        textSwitcher.setInAnimation(context, R.anim.text_slide_in);
        textSwitcher.setOutAnimation(context, R.anim.text_slide_out_up);
        textSwitcher.setText(context.getResources().getString(2131971750));
    }
}
