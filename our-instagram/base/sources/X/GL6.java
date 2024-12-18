package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class GL6 implements Runnable {
    public final /* synthetic */ C163047Rp A00;

    public GL6(C163047Rp c163047Rp) {
        this.A00 = c163047Rp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View findViewById = this.A00.A04.findViewById(R.id.message_comments_pill_container);
        if (findViewById != null) {
            C69553VrI A00 = VSN.A00(findViewById);
            A00.A01.A05 = new C55942hf(80.0d, 10.0d);
            A00.A00(5.0f);
        }
    }
}
