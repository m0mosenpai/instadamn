package X;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9R5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9R5 {
    public InterfaceC16820sZ A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final View A04;
    public final View A05;
    public final C174757qB A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final float A0B;
    public final int A0C;
    public final int A0D;

    public C9R5(View view, View view2, ViewGroup viewGroup, C174757qB c174757qB, float f, int i, int i2, int i3) {
        AbstractC167017dG.A1U(view, view2);
        this.A06 = c174757qB;
        this.A03 = i;
        this.A0D = i2;
        this.A0C = i3;
        this.A0B = f;
        this.A05 = view;
        this.A04 = view2;
        this.A0A = B8Q.A01(viewGroup, 3);
        this.A09 = B8Q.A01(this, 2);
        this.A07 = B8Q.A01(this, 0);
        this.A08 = B8Q.A01(this, 1);
        view2.setCameraDistance(AbstractC13880nE.A04(AbstractC166997dE.A0L(view2), 5000));
    }

    public final void A01(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        if (this.A01) {
            this.A00 = new B61(46, interfaceC16820sZ, this);
            return;
        }
        if (!this.A02) {
            interfaceC16820sZ.invoke();
            return;
        }
        this.A02 = false;
        InterfaceC09390do interfaceC09390do = this.A08;
        ((Animator) interfaceC09390do.getValue()).addListener(new AN5(interfaceC16820sZ, 1));
        ((Animator) interfaceC09390do.getValue()).start();
    }

    public static final void A00(Bitmap bitmap, C9R5 c9r5) {
        InterfaceC09390do interfaceC09390do = c9r5.A09;
        ((IgImageView) AbstractC166987dD.A17(interfaceC09390do)).setVisibility(0);
        ((IgImageView) AbstractC166987dD.A17(interfaceC09390do)).setScaleX(1.0f);
        ((IgImageView) AbstractC166987dD.A17(interfaceC09390do)).setScaleY(1.0f);
        ((IgImageView) AbstractC166987dD.A17(interfaceC09390do)).setAlpha(1.0f);
        ((IgImageView) AbstractC166987dD.A17(interfaceC09390do)).setImageBitmap(bitmap);
        IgImageView igImageView = (IgImageView) AbstractC166987dD.A17(interfaceC09390do);
        int i = c9r5.A0D;
        int i2 = c9r5.A03;
        igImageView.setX((i - i2) / 2.0f);
        ((IgImageView) AbstractC166987dD.A17(interfaceC09390do)).setY((c9r5.A0C - i2) / 2.0f);
        AbstractC185998Mt.A01((IgImageView) AbstractC166987dD.A17(interfaceC09390do), c9r5.A0B, 0);
    }
}
