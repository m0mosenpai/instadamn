package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.Cqp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29000Cqp implements InterfaceC51522Ya {
    public static final C29000Cqp A00 = new C29000Cqp();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.video_scrubber_layout, (ViewGroup) frameLayout, true);
        return frameLayout;
    }
}