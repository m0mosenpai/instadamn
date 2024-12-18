package X;

import android.content.Context;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.C2k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27285C2k extends RoundedCornerFrameLayout {
    public final IgImageView A00;
    public final SimpleVideoLayout A01;

    public C27285C2k(Context context) {
        super(context);
        IgImageView igImageView = new IgImageView(context);
        this.A00 = igImageView;
        SimpleVideoLayout simpleVideoLayout = new SimpleVideoLayout(context, null, 0);
        this.A01 = simpleVideoLayout;
        AbstractC25234BEr.A0t(simpleVideoLayout, igImageView, this);
    }

    public final IgImageView getImagePlaceHolder() {
        return this.A00;
    }

    public final SimpleVideoLayout getVideoPlaceHolder() {
        return this.A01;
    }
}
