package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class IGS {
    public C6T7 A00;
    public final FrameLayout A01;
    public final C126545np A02;

    public IGS(ViewGroup viewGroup, View view) {
        Context context = viewGroup.getContext();
        C14360o3.A0B(context, 1);
        C126545np c126545np = new C126545np(context);
        this.A02 = c126545np;
        FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.netego_bloks_view);
        this.A01 = frameLayout;
        frameLayout.addView(c126545np);
    }
}
