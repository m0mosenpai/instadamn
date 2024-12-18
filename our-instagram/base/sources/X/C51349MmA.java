package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.MmA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51349MmA extends C3OO {
    public final TextView A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final IgImageView A04;
    public final IgImageView A05;
    public final IgImageView A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51349MmA(View view, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super(view);
        AbstractC167027dH.A0a(1, view, userSession, fragmentActivity, interfaceC11380iw);
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A02 = interfaceC11380iw;
        this.A04 = (IgImageView) view.findViewById(R.id.spotlight_tray_cover_image_bottom);
        this.A05 = (IgImageView) view.findViewById(R.id.spotlight_tray_cover_image_middle);
        this.A06 = (IgImageView) view.findViewById(R.id.spotlight_tray_cover_image_top);
        this.A00 = AbstractC166987dD.A0e(view, R.id.spotlight_tray_item_label);
    }
}
