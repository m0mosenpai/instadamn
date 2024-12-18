package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BPN implements InterfaceC51522Ya {
    public static final BPN A00 = new BPN();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.clips_attached_scrubber_layout, (ViewGroup) frameLayout, true);
        return frameLayout;
    }
}
