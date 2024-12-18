package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;

/* loaded from: classes6.dex */
public final class GI4 implements GYV {
    public final /* synthetic */ C36473G6x A00;

    @Override // X.GYV
    public final void D9k(View view) {
        DirectShareTarget directShareTarget;
        C14360o3.A0B(view, 0);
        C36473G6x c36473G6x = this.A00;
        SearchWithDeleteEditText searchWithDeleteEditText = c36473G6x.A07;
        searchWithDeleteEditText.requestFocus();
        AbstractC13880nE.A0R(searchWithDeleteEditText);
        Object tag = view.getTag();
        if ((tag instanceof DirectShareTarget) && (directShareTarget = (DirectShareTarget) tag) != null) {
            ((C35151Fet) c36473G6x.A06.A01).A05.DdL(directShareTarget);
            c36473G6x.A09.remove(directShareTarget.A09());
            C36473G6x.A01(c36473G6x);
        }
    }

    public GI4(C36473G6x c36473G6x) {
        this.A00 = c36473G6x;
    }
}
