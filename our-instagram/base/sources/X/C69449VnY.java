package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.VnY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69449VnY {
    public View A00;
    public ImageView A01;
    public C41059IGc A02;
    public C8G6 A03;
    public C38064Gos A04;
    public boolean A05;
    public final View A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;
    public final C57012jc A0A;

    public C69449VnY(View view) {
        this.A06 = view;
        View requireViewById = view.requireViewById(R.id.song_title);
        TextView textView = (TextView) requireViewById;
        AbstractC37300Gc1.A0d(textView, true);
        C14360o3.A07(requireViewById);
        this.A09 = textView;
        this.A07 = AbstractC31176DnK.A0D(view, R.id.album_art);
        this.A08 = AbstractC31176DnK.A0D(view, R.id.search_row_camera_button);
        this.A0A = AbstractC31177DnL.A0U(view, R.id.dismiss_button_stub);
    }
}
