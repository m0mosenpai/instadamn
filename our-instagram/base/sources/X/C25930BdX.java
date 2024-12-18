package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.BdX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25930BdX extends C3OO {
    public final TextView A00;
    public final Integer A01;
    public final InterfaceC16660sJ A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25930BdX(View view, Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        AbstractC167017dG.A1R(num, interfaceC16660sJ);
        this.A01 = num;
        this.A02 = interfaceC16660sJ;
        this.A00 = AbstractC166987dD.A0e(this.itemView, R.id.creator_inspiration_hub_pill_text);
    }
}
