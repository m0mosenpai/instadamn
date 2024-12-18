package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.7SD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SD implements C7QD {
    public final C57012jc A00;
    public final InterfaceC165507ad A01;

    public final void A00(final C76C c76c) {
        View A01 = this.A00.A01();
        C14360o3.A07(A01);
        C0fQ.A00(new View.OnClickListener() { // from class: X.76H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(533714214);
                InterfaceC165507ad interfaceC165507ad = C7SD.this.A01;
                if (!interfaceC165507ad.CQu()) {
                    ((InterfaceC165817b8) interfaceC165507ad).Cgl(c76c);
                }
                C0f9.A0C(1013563467, A05);
            }
        }, A01);
        ImageView imageView = (ImageView) A01.requireViewById(R.id.save_to_collection_shortcut_button);
        Context context = A01.getContext();
        int i = c76c.A00;
        int i2 = R.drawable.instagram_save_pano_outline_16;
        if (i == 1) {
            i2 = R.drawable.instagram_save_pano_filled_16;
        }
        imageView.setImageDrawable(context.getDrawable(i2));
        int i3 = 8;
        if (!c76c.A09) {
            i3 = 0;
        }
        A01.setVisibility(i3);
    }

    @Override // X.C7QD
    public final View BKF() {
        C57012jc c57012jc = this.A00;
        if (c57012jc.A00 != null) {
            View A01 = c57012jc.A01();
            C14360o3.A0A(A01);
            return A01;
        }
        ViewStub viewStub = c57012jc.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7SD(C57012jc c57012jc, InterfaceC165507ad interfaceC165507ad) {
        this.A00 = c57012jc;
        this.A01 = interfaceC165507ad;
    }
}
