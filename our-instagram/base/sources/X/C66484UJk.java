package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.UJk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66484UJk extends C3OO {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final IgImageView A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC56392iX A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66484UJk(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A00 = AbstractC166987dD.A0c(view, R.id.comment_container);
        this.A03 = AbstractC37302Gc3.A0K(view, R.id.circular_image_view);
        this.A06 = AbstractC56372iV.A00(view.findViewById(R.id.circular_image_emoji_stub));
        this.A05 = AbstractC56372iV.A00(view.findViewById(R.id.circular_image_emoji_animated_stub));
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.comment_message);
        this.A04 = AbstractC56372iV.A00(view.findViewById(R.id.comment_action_button_stub));
        this.A07 = AbstractC56372iV.A00(view.findViewById(R.id.comment_featured_image_stub));
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66484UJk) && C14360o3.A0K(this.A01, ((C66484UJk) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
