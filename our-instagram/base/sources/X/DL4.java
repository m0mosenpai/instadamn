package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class DL4 extends C0YY implements InterfaceC16660sJ {
    public static final DL4 A00 = new DL4();

    public DL4() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C14360o3.A0B(context, 0);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), null, R.layout.reel_item_story_unit, false);
        C72943Ou c72943Ou = new C72943Ou(A0D);
        A0D.setTag(c72943Ou);
        return c72943Ou.itemView;
    }
}
