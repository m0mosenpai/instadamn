package X;

import android.graphics.ColorFilter;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.5xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC131765xC {
    public static final void A00(final ColorFilter colorFilter, final ImageView.ScaleType scaleType, final ImageView imageView, final C6FG c6fg, final C102884kP c102884kP, final InterfaceC103384lE interfaceC103384lE, final String str, final boolean z) {
        C14360o3.A0B(imageView, 1);
        C14360o3.A0B(c6fg, 2);
        C1NJ c1nj = new C1NJ() { // from class: X.5xD
            /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
            @Override // X.C1NJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Cza(X.InterfaceC59502nt r12, X.C73033Pe r13) {
                /*
                    Method dump skipped, instructions count: 333
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C131775xD.Cza(X.2nt, X.3Pe):void");
            }

            @Override // X.C1NJ
            public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
            }

            @Override // X.C1NJ
            public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
                AbstractC131765xC.A02(c6fg, c102884kP, interfaceC103384lE, "ImageFailed");
            }
        };
        C1LZ.A00();
        if (str != null) {
            C1OG A0J = C25821No.A00().A0J(new SimpleImageUrl(str), "bloks");
            A0J.A02(c1nj);
            InterfaceC59502nt A00 = A0J.A00();
            imageView.setTag(R.id.image_request_callback, c1nj);
            A00.E7X();
            A02(c6fg, c102884kP, interfaceC103384lE, "ImageRequested");
            return;
        }
        imageView.setImageDrawable(null);
    }

    public static final void A01(ImageView imageView) {
        C14360o3.A0B(imageView, 0);
        imageView.setImageDrawable(null);
        imageView.setTag(R.id.image_request_callback, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setColorFilter((ColorFilter) null);
        imageView.setImageAlpha(255);
        imageView.setScaleX(1.0f);
    }

    public static final void A02(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, String str) {
        if (interfaceC103384lE != null) {
            C6FX c6fx = new C6FX();
            c6fx.A01(str);
            c6fx.A02(Long.valueOf(System.currentTimeMillis()));
            C6FP.A03(c6fg, c102884kP, new C6FW(c6fx.A00), interfaceC103384lE);
        }
    }
}
