package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;

/* renamed from: X.AvL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24625AvL implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C88R A01;

    public RunnableC24625AvL(View view, C88R c88r) {
        this.A01 = c88r;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Resources resources = this.A01.A06.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        AbstractC13880nE.A0Y(this.A00, (resources.getDimensionPixelSize(R.dimen.album_music_sticker_circular_album_art_size) - dimensionPixelSize) + resources.getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height));
    }
}
