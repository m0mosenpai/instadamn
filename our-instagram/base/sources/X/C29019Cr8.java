package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.Cr8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29019Cr8 implements InterfaceC51522Ya {
    public static final C29019Cr8 A00 = new C29019Cr8();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = new RoundedCornerConstraintLayout(context);
        LayoutInflater.from(context).inflate(R.layout.clips_viewer_multi_ad_card_layout, (ViewGroup) roundedCornerConstraintLayout, true);
        return roundedCornerConstraintLayout;
    }
}
