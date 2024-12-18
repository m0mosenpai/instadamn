package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.List;

/* renamed from: X.Gty, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38362Gty extends C2UU {
    public List A00 = C16930sl.A00;
    public final /* synthetic */ HMW A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C38500GwL(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.music_playlist_spotlight_banner_item, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        JIN A00 = ((C38061Goo) this.A00.get(c3oo.getAbsoluteAdapterPosition())).A00();
        if (A00 != null) {
            HMW hmw = this.A01;
            JHE jhe = hmw.A07;
            int absoluteAdapterPosition = c3oo.getAbsoluteAdapterPosition();
            MusicSearchPlaylist musicSearchPlaylist = hmw.A02;
            if (musicSearchPlaylist == null) {
                C14360o3.A0F("musicSearchPlaylist");
                throw C00O.createAndThrow();
            }
            jhe.Dni(hmw, A00, musicSearchPlaylist, absoluteAdapterPosition);
        }
    }

    public C38362Gty(HMW hmw) {
        this.A01 = hmw;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        TrackMetadata trackMetadata;
        List AyW;
        AudioMetadataLabels audioMetadataLabels;
        Resources resources;
        int i2;
        C38500GwL c38500GwL = (C38500GwL) c3oo;
        C14360o3.A0B(c38500GwL, 0);
        IgTextView igTextView = c38500GwL.A03;
        igTextView.setVisibility(8);
        JIN A00 = ((C38061Goo) this.A00.get(i)).A00();
        if (A00 != null) {
            HMW hmw = this.A01;
            C38061Goo c38061Goo = (C38061Goo) this.A00.get(i);
            c38500GwL.A04.setText(A00.getTitle());
            IgTextView igTextView2 = c38500GwL.A02;
            igTextView2.setText(A00.getDisplayArtist());
            Context A03 = AbstractC37301Gc2.A03(hmw);
            Resources A05 = AbstractC37302Gc3.A05(hmw);
            boolean z = hmw.A0B;
            int i3 = R.dimen.abc_text_size_menu_header_material;
            if (z) {
                i3 = R.dimen.add_payment_bottom_sheet_row_subtitle_size;
            }
            igTextView2.setTextSize(AbstractC13880nE.A02(A03, A05.getDimension(i3)));
            c38500GwL.A06.setUrl(A00.AsR(), hmw);
            ViewOnClickListenerC42028Ijx.A00(c38500GwL.A00, A00, hmw, i, 1);
            if (A00.isExplicit()) {
                c38500GwL.A05.setVisibility(0);
            }
            if (!z && (((trackMetadata = c38061Goo.A0A) != null || (trackMetadata = c38061Goo.A09) != null) && (AyW = trackMetadata.AyW()) != null && (audioMetadataLabels = (AudioMetadataLabels) AbstractC001800i.A0J(AyW)) != null)) {
                int ordinal = audioMetadataLabels.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        resources = igTextView.getResources();
                        i2 = 2131968043;
                    }
                } else {
                    resources = igTextView.getResources();
                    i2 = 2131968044;
                }
                String string = resources.getString(i2);
                if (string != null) {
                    igTextView.setVisibility(0);
                    igTextView.setText(string);
                }
            }
            c38500GwL.A01.setForeground(new ColorDrawable(AbstractC37301Gc2.A03(hmw).getColor(R.color.black_40_transparent)));
            return;
        }
        throw AbstractC166987dD.A12("MusicSearchTrack cannot be null");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1727338598);
        int size = this.A00.size();
        C0f9.A0A(2110847433, A03);
        return size;
    }
}
