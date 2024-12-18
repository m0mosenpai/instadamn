package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.Aru, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24413Aru implements Runnable {
    public final /* synthetic */ C191478dz A00;

    public RunnableC24413Aru(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C191478dz c191478dz = this.A00;
        View view = c191478dz.A0V;
        c191478dz.A0x.A00().A01(view, AbstractC166997dE.A0S(view, R.id.add_text_button), EnumC199188rL.A06);
        c191478dz.A0K = true;
    }
}
