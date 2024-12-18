package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gw0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38479Gw0 extends C3OO {
    public final int A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final C38515Gwb A04;

    public C38479Gw0(View view) {
        super(view);
        Context context = view.getContext();
        Resources resources = context.getResources();
        C38515Gwb c38515Gwb = new C38515Gwb(view, R.layout.question_response_item_music);
        this.A04 = c38515Gwb;
        View view2 = c38515Gwb.A05;
        ImageView A0I = AbstractC31173DnH.A0I(view2, R.id.album_art);
        this.A01 = A0I;
        this.A03 = AbstractC166987dD.A0e(view2, R.id.track_title);
        this.A02 = AbstractC166987dD.A0e(view2, R.id.artist_name);
        A0I.setImageDrawable(new BOM(context, null, resources.getDimensionPixelSize(R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0, 0, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 1, false));
        this.A00 = context.getColor(R.color.countdown_sticker_title_text_color);
    }
}
