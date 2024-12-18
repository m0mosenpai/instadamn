package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.MmB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51350MmB extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgImageView A05;
    public final IgImageView A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51350MmB(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A06 = AbstractC37302Gc3.A0K(view, R.id.background_imageview);
        this.A05 = AbstractC37302Gc3.A0K(view, R.id.avatar_imageview);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.event_date_text);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.event_owner_text);
        this.A03 = AbstractC25230BEn.A0Q(view, R.id.event_title_text);
        this.A04 = AbstractC25230BEn.A0Q(view, R.id.remind_me_button);
    }
}
