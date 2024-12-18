package X;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SIb {
    public final AssetManager A02;
    public final SOS A03 = new Object();
    public final Map A05 = AbstractC166987dD.A1G();
    public final Map A04 = AbstractC166987dD.A1G();
    public String A01 = ".ttf";
    public AbstractC61274Rkk A00 = null;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.SOS] */
    public SIb(Drawable.Callback callback) {
        AssetManager assets;
        if (!(callback instanceof View)) {
            SQZ.A00("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.A02 = assets;
    }
}
