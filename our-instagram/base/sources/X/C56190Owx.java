package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Owx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56190Owx implements InterfaceC69513Al {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C6e7 A02;

    public C56190Owx(UserSession userSession, C41181vS c41181vS, C6e7 c6e7) {
        this.A02 = c6e7;
        this.A01 = c41181vS;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        ImageView imageView;
        int i;
        C14360o3.A0B(view, 0);
        C6e7 c6e7 = this.A02;
        c6e7.A0R = view;
        String str = this.A01.A0j;
        C14360o3.A07(str);
        boolean contains = MSY.A0m(AbstractC23021Ah.A00(this.A00).A0H()).contains(str);
        View findViewById = view.findViewById(R.id.whatsapp_share_icon);
        boolean z = findViewById instanceof IgSimpleImageView;
        if (contains) {
            if (z && (imageView = (ImageView) findViewById) != null) {
                i = R.drawable.instagram_app_whatsapp_filled_24;
                imageView.setImageResource(i);
            }
        } else if (z && (imageView = (ImageView) findViewById) != null) {
            i = R.drawable.instagram_app_whatsapp_pano_outline_24;
            imageView.setImageResource(i);
        }
        c6e7.A0g = AbstractC166987dD.A0e(view, R.id.whatsapp_share_label);
    }
}
