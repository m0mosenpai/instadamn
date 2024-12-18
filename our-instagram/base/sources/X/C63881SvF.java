package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;

/* renamed from: X.SvF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63881SvF implements InterfaceC65328Ti9 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65328Ti9
    public final /* bridge */ /* synthetic */ boolean F8U(InterfaceC65197Tff interfaceC65197Tff, Object obj) {
        ImageView imageView = (ImageView) ((AbstractC58820QBd) interfaceC65197Tff).A00;
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, (Drawable) obj});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }
}
