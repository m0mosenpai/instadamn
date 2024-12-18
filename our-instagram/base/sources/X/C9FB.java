package X;

import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.9FB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FB extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FB(Drawable drawable, C190988cu c190988cu, float f, int i) {
        super(1);
        this.A01 = i;
        this.A03 = c190988cu;
        this.A02 = drawable;
        this.A00 = f;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        float f2;
        int i = this.A01;
        C206189Bb c206189Bb = (C206189Bb) obj;
        C14360o3.A0B(c206189Bb, 0);
        C190988cu c190988cu = (C190988cu) this.A03;
        if (i != 0) {
            Drawable drawable = (Drawable) this.A02;
            float f3 = this.A00;
            float A00 = C190988cu.A00(drawable, c206189Bb, c190988cu);
            float A01 = C190988cu.A01(drawable, c190988cu);
            InteractiveDrawableContainer interactiveDrawableContainer = c190988cu.A02;
            BEd A002 = InteractiveDrawableContainer.A00(drawable, interactiveDrawableContainer);
            if (A002 != null) {
                f2 = ((C9LJ) A002).A03;
            } else {
                f2 = 0.0f;
            }
            double radians = Math.toRadians(f2);
            float centerY = (float) ((drawable.getBounds().centerY() - (((NineSixteenLayoutConfigImpl) c190988cu.A01).A0K.getHeight() / 2.0f)) + f3 + (Math.cos(radians) * A01) + (Math.sin(radians) * A00));
            BEd A003 = InteractiveDrawableContainer.A00((Drawable) c206189Bb.A03, interactiveDrawableContainer);
            if (A003 != null) {
                A003.EZl(centerY);
            }
        } else {
            Drawable drawable2 = (Drawable) this.A02;
            float f4 = this.A00;
            float A004 = C190988cu.A00(drawable2, c206189Bb, c190988cu);
            float A012 = C190988cu.A01(drawable2, c190988cu);
            InteractiveDrawableContainer interactiveDrawableContainer2 = c190988cu.A02;
            BEd A005 = InteractiveDrawableContainer.A00(drawable2, interactiveDrawableContainer2);
            if (A005 != null) {
                f = ((C9LJ) A005).A03;
            } else {
                f = 0.0f;
            }
            double radians2 = Math.toRadians(f);
            float cos = (float) ((f4 + (Math.cos(radians2) * A004)) - (Math.sin(radians2) * A012));
            BEd A006 = InteractiveDrawableContainer.A00((Drawable) c206189Bb.A03, interactiveDrawableContainer2);
            if (A006 != null) {
                A006.EZk(cos);
            }
        }
        return C0eB.A00;
    }
}
