package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.5dL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120755dL implements InterfaceC51522Ya {
    public static final C120755dL A00 = new C120755dL();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.feed_media_preview, (ViewGroup) null);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.View");
        return inflate;
    }
}
