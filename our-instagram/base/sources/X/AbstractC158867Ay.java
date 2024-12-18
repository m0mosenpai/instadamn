package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7Ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC158867Ay {
    public static final C7B0 A03 = new C7B0() { // from class: X.7Az
        @Override // X.C7B0
        public final Bitmap E51(Bitmap bitmap) {
            return BlurUtil.blur(bitmap, 0.3f, 20);
        }
    };
    public static final C7B0 A02 = new C7B0() { // from class: X.7B1
        @Override // X.C7B0
        public final Bitmap E51(Bitmap bitmap) {
            return BlurUtil.blur(bitmap, 0.15f, 25);
        }
    };
    public static final InterfaceC65702y7 A01 = C7B2.A00;
    public static final InterfaceC65702y7 A00 = C7B3.A00;

    public static final void A00(IgImageView igImageView, int i) {
        InterfaceC65702y7 interfaceC65702y7;
        C7B0 c7b0;
        InterfaceC59152nG interfaceC59152nG = igImageView.A0I;
        if (interfaceC59152nG instanceof AnonymousClass791) {
            AnonymousClass791 anonymousClass791 = (AnonymousClass791) interfaceC59152nG;
            if (i != 0) {
                if (i != 1) {
                    c7b0 = A02;
                } else {
                    c7b0 = A03;
                }
            } else {
                c7b0 = null;
            }
            anonymousClass791.A01 = c7b0;
            return;
        }
        if (i != 0) {
            if (i != 1) {
                interfaceC65702y7 = A00;
            } else {
                interfaceC65702y7 = A01;
            }
        } else {
            interfaceC65702y7 = null;
        }
        igImageView.A0I = interfaceC65702y7;
    }
}
