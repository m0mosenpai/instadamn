package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Azh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24882Azh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ACW A02;
    public final /* synthetic */ C184628Hd A03;
    public final /* synthetic */ C208619Kv A04;
    public final /* synthetic */ ShutterButton A05;

    public RunnableC24882Azh(ACW acw, C184628Hd c184628Hd, C208619Kv c208619Kv, ShutterButton shutterButton, int i, int i2) {
        this.A05 = shutterButton;
        this.A04 = c208619Kv;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = acw;
        this.A03 = c184628Hd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9LA c9la;
        BC1 c23847Agw;
        ShutterButton shutterButton = this.A05;
        boolean z = shutterButton.A0i.A0A;
        C208619Kv c208619Kv = this.A04;
        if (z) {
            if (C18U.A06(C06090Tz.A05, c208619Kv.A02, 36318548397660472L)) {
                c9la = c208619Kv.A03;
                c23847Agw = new C23846Agv(c208619Kv, shutterButton);
            } else {
                return;
            }
        } else {
            c9la = c208619Kv.A03;
            c23847Agw = new C23847Agw(this.A03, shutterButton);
        }
        c9la.A02 = c23847Agw;
        c208619Kv.A04.set(true);
        int i = this.A01;
        int i2 = this.A00;
        ACW acw = this.A02;
        Rect A0U = AbstractC166987dD.A0U();
        RectF rectF = acw.A00;
        float f = i;
        A0U.left = (int) ((rectF.left / 448.0f) * f);
        float f2 = i2;
        A0U.top = (int) ((rectF.top / 448.0f) * f2);
        A0U.right = (int) ((rectF.right / 448.0f) * f);
        A0U.bottom = (int) ((rectF.bottom / 448.0f) * f2);
        c9la.A01 = (ImageView) c9la.A03.findViewById(R.id.hand_indicator_keyframe_view);
        int width = A0U.width();
        int height = A0U.height();
        if (width < height) {
            width = height;
        }
        int i3 = (int) (width * 1.5f * c9la.A00);
        ImageView imageView = c9la.A01;
        if (imageView != null) {
            AbstractC13880nE.A0g(imageView, i3);
            ImageView imageView2 = c9la.A01;
            if (imageView2 != null) {
                AbstractC13880nE.A0W(imageView2, i3);
                ImageView imageView3 = c9la.A01;
                if (imageView3 != null) {
                    AnonymousClass693 anonymousClass693 = c9la.A04;
                    imageView3.setImageDrawable(anonymousClass693);
                    ImageView imageView4 = c9la.A01;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                        int width2 = (i3 - ((int) (A0U.width() * c9la.A00))) / 2;
                        float height2 = A0U.height();
                        float f3 = c9la.A00;
                        int i4 = (i3 - ((int) (height2 * f3))) / 2;
                        ImageView imageView5 = c9la.A01;
                        if (imageView5 != null) {
                            imageView5.setX(((A0U.left * f3) - width2) + ((int) ((AbstractC166987dD.A07(r11) - (AbstractC166987dD.A07(r11) * c9la.A00)) / 2.0f)));
                            ImageView imageView6 = c9la.A01;
                            if (imageView6 != null) {
                                imageView6.setY((A0U.top * c9la.A00) - i4);
                                ImageView imageView7 = c9la.A01;
                                if (imageView7 != null) {
                                    imageView7.setVisibility(0);
                                    if (anonymousClass693 != null) {
                                        anonymousClass693.E4S();
                                        anonymousClass693.A8x(new AN5(c9la, 2));
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("animationView");
        throw C00O.createAndThrow();
    }
}
