package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.IpS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42365IpS implements InterfaceC69513Al {
    public final int A00;
    public final Object A01;

    public C42365IpS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC69513Al
    public final /* bridge */ /* synthetic */ void DLu(View view) {
        switch (this.A00) {
            case 0:
                ImageView imageView = (ImageView) view;
                C14360o3.A0B(imageView, 0);
                imageView.setImageDrawable(new C153406vA((Context) this.A01));
                return;
            case 1:
                C14360o3.A0B(view, 0);
                C38484Gw5 c38484Gw5 = (C38484Gw5) this.A01;
                c38484Gw5.A01 = AbstractC166987dD.A0e(view, R.id.attribution);
                c38484Gw5.A00 = AbstractC166987dD.A0e(view, R.id.attribution_shadow);
                return;
            default:
                C14360o3.A0B(view, 0);
                C38503GwO c38503GwO = (C38503GwO) this.A01;
                c38503GwO.A03 = AbstractC166997dE.A0T(view, R.id.hscroll_header_title);
                c38503GwO.A02 = AbstractC166997dE.A0T(view, R.id.hscroll_header_title_divider);
                c38503GwO.A01 = AbstractC166997dE.A0T(view, R.id.hscroll_header_title_action);
                c38503GwO.A00 = AbstractC166997dE.A0T(view, R.id.hscroll_header_button);
                return;
        }
    }
}
