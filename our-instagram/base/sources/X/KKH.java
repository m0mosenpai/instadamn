package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* loaded from: classes8.dex */
public final class KKH extends IgFrameLayout {
    public static final C55942hf A06 = C55942hf.A00();
    public Fragment A00;
    public C47958LGu A01;
    public MR9 A02;
    public final View A03;
    public final FrameLayout A04;
    public final FrameLayout A05;

    public KKH(Context context) {
        super(context, null, 0, 0);
        LayoutInflater.from(context).inflate(R.layout.meta_ai_picker_view, this);
        FrameLayout frameLayout = (FrameLayout) requireViewById(R.id.photo_picker_container);
        this.A05 = frameLayout;
        this.A04 = (FrameLayout) requireViewById(R.id.album_overlay_container);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_media_picker_photos, (ViewGroup) frameLayout, false);
        this.A03 = inflate;
        frameLayout.addView(inflate);
    }

    private final InterfaceC193828i3 getAlbumPickerListener() {
        return new C48600Lec(this, 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A062 = C0f9.A06(-1748175145);
        super.onDetachedFromWindow();
        this.A04.animate().cancel();
        this.A02 = null;
        this.A01 = null;
        C0f9.A0D(-1482856009, A062);
    }
}
