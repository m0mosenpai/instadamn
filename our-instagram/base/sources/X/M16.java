package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class M16 implements Runnable {
    public final /* synthetic */ C47956LGs A00;

    public M16(C47956LGs c47956LGs) {
        this.A00 = c47956LGs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47956LGs c47956LGs = this.A00;
        if (c47956LGs.A05.isAdded()) {
            View view = c47956LGs.A04;
            Context context = c47956LGs.A01;
            Resources A0M = AbstractC166997dE.A0M(context);
            String A0q = AbstractC166997dE.A0q(context.getResources(), 2131968717);
            C146106i8 A0j = AbstractC25229BEm.A0j();
            A0j.A0H = "direct_inbox_music_note_unavailable";
            A0j.A0D = A0q;
            A0j.A02 = view.getHeight() + A0M.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            A0j.A0R = true;
            AbstractC25233BEq.A1F(A0j);
        }
    }
}
