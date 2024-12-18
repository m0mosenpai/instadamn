package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.GwK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38499GwK extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final View A04;
    public final View A05;
    public final /* synthetic */ HI5 A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38499GwK(View view, HI5 hi5) {
        super(view);
        this.A06 = hi5;
        View A0S = AbstractC166997dE.A0S(view, R.id.original_text);
        this.A04 = A0S;
        this.A00 = AbstractC167007dF.A0N(A0S, R.id.translation_title);
        this.A01 = AbstractC167007dF.A0N(A0S, R.id.translation_subtitle);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.translated_text);
        this.A05 = A0S2;
        this.A03 = AbstractC167007dF.A0N(A0S2, R.id.translation_title);
        this.A02 = AbstractC167007dF.A0N(A0S2, R.id.translation_subtitle);
    }
}
