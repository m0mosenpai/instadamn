package X;

import android.content.Context;
import android.view.TextureView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.C2l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27286C2l extends RoundedCornerFrameLayout {
    public final TextureView A00;
    public final IgImageView A01;

    public C27286C2l(Context context) {
        super(context);
        IgImageView igImageView = new IgImageView(context);
        this.A01 = igImageView;
        TextureView textureView = new TextureView(context);
        this.A00 = textureView;
        setWillNotDraw(false);
        AbstractC25234BEr.A0t(textureView, igImageView, this);
    }

    public final IgImageView getImagePlaceHolder() {
        return this.A01;
    }

    public final TextureView getVideoPlaceHolder() {
        return this.A00;
    }
}
