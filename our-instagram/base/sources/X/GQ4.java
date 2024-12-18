package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class GQ4 implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ boolean A03;

    public GQ4(Fragment fragment, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        this.A00 = fragment;
        this.A03 = z;
        this.A02 = imageUrl;
        this.A01 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.getContext();
        if (context != null) {
            boolean z = this.A03;
            ImageUrl imageUrl = this.A02;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131970827);
            int i = 2131970824;
            if (z) {
                i = 2131970825;
            }
            A0I.A09(i);
            A0I.A07();
            if (!z) {
                imageUrl = null;
            }
            A0I.A0i(null, interfaceC11380iw, imageUrl);
            AbstractC166987dD.A1W(A0I);
        }
    }
}
