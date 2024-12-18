package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190988cu {
    public final Context A00;
    public final TargetViewSizeProvider A01;
    public final InteractiveDrawableContainer A02;
    public final Map A03;
    public final InterfaceC1829489p A04;

    public C190988cu(Context context, TargetViewSizeProvider targetViewSizeProvider, InteractiveDrawableContainer interactiveDrawableContainer) {
        C14360o3.A0B(context, 2);
        this.A02 = interactiveDrawableContainer;
        this.A00 = context;
        this.A01 = targetViewSizeProvider;
        this.A03 = new LinkedHashMap();
        this.A04 = new InterfaceC1829489p() { // from class: X.8cv
            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Cud(Drawable drawable) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Cuq() {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Cur() {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Cvp(Drawable drawable, int i) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void DCJ(Drawable drawable, int i) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void DCK(float f, float f2) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void DCL(Drawable drawable) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void DQk() {
            }

            @Override // X.InterfaceC1829489p
            public final void Dep(Drawable drawable, int i, boolean z) {
                C14360o3.A0B(drawable, 1);
                C190988cu c190988cu = C190988cu.this;
                C206189Bb c206189Bb = (C206189Bb) c190988cu.A03.get(drawable);
                if (c206189Bb != null) {
                    c190988cu.A02.post(new RunnableC24779Ay1(drawable, c206189Bb, c190988cu));
                }
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Din(Drawable drawable, float f, float f2, float f3, float f4) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Dmk(Drawable drawable, int i, float f, float f2) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void DuD() {
            }
        };
    }

    public static final float A00(Drawable drawable, C206189Bb c206189Bb, C190988cu c190988cu) {
        float f;
        int width;
        Float A0P = c190988cu.A02.A0P(drawable);
        if (A0P != null) {
            f = A0P.floatValue();
        } else {
            f = 1.0f;
        }
        int dimensionPixelSize = c190988cu.A00.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        Drawable drawable2 = (Drawable) c206189Bb.A03;
        int intrinsicWidth = (dimensionPixelSize * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight();
        int intValue = ((Number) c206189Bb.A00).intValue();
        if (intValue != 2) {
            if (intValue != 0) {
                return 0.0f;
            }
            width = intrinsicWidth - drawable.getBounds().width();
        } else {
            width = drawable.getBounds().width() - intrinsicWidth;
        }
        return (f * width) / 2.0f;
    }

    public static final float A01(Drawable drawable, C190988cu c190988cu) {
        float f;
        Context context = c190988cu.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        Float A0P = c190988cu.A02.A0P(drawable);
        if (A0P != null) {
            f = A0P.floatValue();
        } else {
            f = 1.0f;
        }
        return f * ((drawable.getBounds().height() / 2.0f) + (dimensionPixelSize / 2.0f) + context.getResources().getDimension(R.dimen.abc_control_corner_material));
    }

    public static final void A02(Drawable drawable, C190988cu c190988cu, InterfaceC16660sJ interfaceC16660sJ) {
        C206189Bb c206189Bb = (C206189Bb) c190988cu.A03.get(drawable);
        if (c206189Bb != null) {
            c206189Bb.A01 = false;
            interfaceC16660sJ.invoke(c206189Bb);
            c206189Bb.A01 = true;
        }
    }

    public final void A03(Drawable drawable, Drawable drawable2) {
        C206189Bb c206189Bb = new C206189Bb(drawable2);
        this.A03.put(drawable, c206189Bb);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A02;
        interactiveDrawableContainer.setPropertyListener(drawable, new C24158Anh(drawable, this));
        interactiveDrawableContainer.setPropertyListener(drawable2, new C24160Anj(drawable, drawable2, c206189Bb, this));
        interactiveDrawableContainer.A0v(this.A04);
    }

    public final void A04(Drawable drawable, Drawable drawable2) {
        C15500q5.A04(this.A03).remove(drawable);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A02;
        interactiveDrawableContainer.setPropertyListener(drawable, new C24154And());
        interactiveDrawableContainer.setPropertyListener(drawable2, new C24155Ane());
    }
}
