package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mkx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51274Mkx extends C3OO {
    public final IgLinearLayout A00;
    public final IgImageView A01;

    public C51274Mkx(View view, InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(view);
        this.A00 = (IgLinearLayout) view.findViewById(R.id.clips_editor_video_original_audio_volume_toggle_button);
        this.A01 = AbstractC31172DnG.A0a(view, R.id.clips_editor_video_original_audio_volume_toggle_button_image);
        ViewOnClickListenerC55460OkF.A00(view, 20, interfaceC16820sZ);
        AbstractC13880nE.A0g(view, i);
        view.setImportantForAccessibility(2);
    }
}
