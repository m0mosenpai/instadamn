package X;

import android.content.Context;
import android.view.ActionMode;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LrG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49322LrG implements AnonymousClass761 {
    public final TextView A00;
    public final java.util.Set A01 = AbstractC31171DnF.A0l();
    public final L00 A02;
    public final L00 A03;
    public final L00 A04;

    public static final void A00(C49322LrG c49322LrG, C6T c6t) {
        Iterator it = c49322LrG.A01.iterator();
        while (it.hasNext()) {
            C159947Fg c159947Fg = ((C47418Kx9) it.next()).A00.A0k;
            if (c159947Fg != null) {
                c159947Fg.A07.add(c6t);
            }
        }
    }

    @Override // X.AnonymousClass761
    public final List D7x(ActionMode actionMode) {
        return AbstractC16960so.A1Q(this.A02, this.A03, this.A04);
    }

    public C49322LrG(TextView textView) {
        this.A00 = textView;
        Context context = textView.getContext();
        this.A02 = new L00(AbstractC166997dE.A0q(context.getResources(), 2131972598), new C50261MHq(this, 11));
        this.A03 = new L00(AbstractC166997dE.A0q(context.getResources(), 2131972599), new C50261MHq(this, 12));
        this.A04 = new L00(AbstractC166997dE.A0q(context.getResources(), 2131972600), new C50261MHq(this, 13));
    }
}
