package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KNb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45748KNb extends AbstractC44608JpE {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final InterfaceC193828i3 A04;

    public C45748KNb(ViewGroup viewGroup, InterfaceC193828i3 interfaceC193828i3) {
        super(AbstractC31176DnK.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.filter_media_type_layout), null);
        this.A04 = interfaceC193828i3;
        this.A01 = AbstractC31171DnF.A08(this.itemView, R.id.album_filter_icon);
        this.A03 = AbstractC166987dD.A0e(this.itemView, R.id.album_filter_title);
        this.A02 = AbstractC166987dD.A0e(this.itemView, R.id.filter_media_count_view);
    }
}
