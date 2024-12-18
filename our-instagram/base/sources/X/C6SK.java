package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6SK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SK {
    public final View A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final C126545np A03;

    public C6SK(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        View inflate = viewStub.inflate();
        C14360o3.A07(inflate);
        this.A00 = inflate;
        View requireViewById = inflate.requireViewById(R.id.netego_bloks_title);
        C14360o3.A07(requireViewById);
        this.A02 = (TextView) requireViewById;
        View requireViewById2 = inflate.requireViewById(R.id.netego_bloks_view);
        C14360o3.A07(requireViewById2);
        FrameLayout frameLayout = (FrameLayout) requireViewById2;
        this.A01 = frameLayout;
        Context context = frameLayout.getContext();
        C14360o3.A07(context);
        C126545np c126545np = new C126545np(context);
        this.A03 = c126545np;
        frameLayout.addView(c126545np);
    }
}
