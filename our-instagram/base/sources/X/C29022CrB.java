package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.CrB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29022CrB implements InterfaceC51522Ya {
    public static final C29022CrB A00 = new C29022CrB();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.clips_viewer_multi_media_card_gradient, (ViewGroup) roundedCornerFrameLayout, true);
        return roundedCornerFrameLayout;
    }
}
