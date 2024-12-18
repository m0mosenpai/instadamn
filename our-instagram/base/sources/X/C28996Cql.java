package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.Cql, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28996Cql implements InterfaceC51522Ya {
    public static final C28996Cql A00 = new C28996Cql();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.layout_reel_live_badge_small, (ViewGroup) frameLayout, true);
        return frameLayout;
    }
}
