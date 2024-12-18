package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes5.dex */
public final class DL9 extends C0YY implements InterfaceC16660sJ {
    public static final DL9 A00 = new DL9();

    public DL9() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View A0R = AbstractC25228BEl.A0R(obj);
        Object tag = A0R.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.archive.adapter.HighlightButtonRowViewBinder.Holder");
        Context context = A0R.getContext();
        AbstractC152296tF.A00((C152266tC) tag, context.getColor(AbstractC53242c7.A08(context)));
        return C0eB.A00;
    }
}
