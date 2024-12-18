package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;

/* renamed from: X.9Up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210929Up extends C3OO {
    public final Context A00;
    public final RoundedCornerImageView A01;
    public final MagicMediaRemixEditController A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210929Up(Context context, View view, MagicMediaRemixEditController magicMediaRemixEditController) {
        super(view);
        AbstractC167017dG.A1R(view, magicMediaRemixEditController);
        this.A00 = context;
        this.A02 = magicMediaRemixEditController;
        this.A01 = (RoundedCornerImageView) AbstractC166987dD.A0c(view, R.id.magic_media_remix_media_selector_content_item);
    }
}
