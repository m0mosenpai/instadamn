package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.OTg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54974OTg {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final ODA A02;

    public static final void A00(C54974OTg c54974OTg, Integer num, String str, boolean z) {
        ODA oda = c54974OTg.A02;
        IgTextView igTextView = oda.A03;
        int i = 0;
        if (num != null) {
            str = AbstractC167007dF.A0f(c54974OTg.A00, str, num.intValue());
        }
        igTextView.setText(str);
        View A0c = AbstractC166987dD.A0c(oda.A01, R.id.footer_subtitle_verified_badge);
        if (!z) {
            i = 8;
        }
        A0c.setVisibility(i);
    }

    public C54974OTg(ViewStub viewStub, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167027dH.A13(fragmentActivity, viewStub, interfaceC11380iw);
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        View A0E = AbstractC31173DnH.A0E(viewStub, R.layout.ig_basic_metadata_footer);
        C14360o3.A0A(A0E);
        this.A02 = new ODA(A0E);
    }
}
