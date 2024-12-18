package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.music.common.model.MusicSearchArtist;

/* loaded from: classes7.dex */
public final class HMU extends AbstractC38513GwY {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final C41060IGd A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMU(View view, JGJ jgj) {
        super(view);
        C14360o3.A0B(jgj, 2);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.artist_image);
        this.A00 = A0D;
        this.A02 = AbstractC167007dF.A0N(view, R.id.artist_title_text);
        this.A01 = AbstractC167007dF.A0N(view, R.id.artist_subtitle_text);
        this.A03 = new C41060IGd(view, jgj);
        Context context = view.getContext();
        int A04 = AbstractC25235BEs.A04(context);
        A0D.setImageDrawable(new BOM(context, null, A04, A04 / 2, 0, 0, 0, -1, false));
    }

    public final void A03(MusicSearchArtist musicSearchArtist, int i) {
        TextView textView = this.A02;
        H2I h2i = (H2I) musicSearchArtist.A01;
        textView.setText(h2i.A01);
        this.A01.setText(h2i.A02);
        C41060IGd c41060IGd = this.A03;
        c41060IGd.A01 = musicSearchArtist;
        c41060IGd.A00 = i;
        AbstractC38055Goi.A00(this.A00, h2i.A00, null);
    }
}
