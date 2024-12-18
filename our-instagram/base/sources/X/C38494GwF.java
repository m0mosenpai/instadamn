package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GwF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38494GwF extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;
    public final Context A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38494GwF(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A05 = AbstractC166997dE.A0L(view);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.title_text);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.subtitle_text);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.button_text);
        this.A04 = AbstractC37302Gc3.A0K(view, R.id.chevron);
    }
}
