package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BOF implements InterfaceC51522Ya {
    public static final BOF A00 = new BOF();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.layout_clips_viewer_interactive_items, (ViewGroup) frameLayout, true);
        frameLayout.findViewById(R.id.interactive_sticker_container).setTag(new BOG(frameLayout));
        return frameLayout;
    }
}
