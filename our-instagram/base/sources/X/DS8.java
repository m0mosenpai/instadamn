package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.ImageView;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes5.dex */
public final class DS8 extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: Type inference failed for: r7v1, types: [X.0oO, java.lang.Object] */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A01 != 0) {
            C27079Bx3 c27079Bx3 = (C27079Bx3) obj2;
            C14360o3.A0B(c27079Bx3, 1);
            C26640Bpb c26640Bpb = (C26640Bpb) this.A02;
            float f = this.A00;
            C29291Cvm c29291Cvm = new C29291Cvm(c26640Bpb, c27079Bx3, new Object(), f, c26640Bpb.A06.A03() - 1);
            c26640Bpb.A04.A0L(c29291Cvm, null, true);
            Context A0L = AbstractC166997dE.A0L(c27079Bx3);
            c27079Bx3.setMinimumHeight(AbstractC13690mv.A01(A0L, 24));
            c27079Bx3.setMaxWidth(AbstractC13690mv.A01(A0L, 24));
            c27079Bx3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            c27079Bx3.A00 = f;
            Drawable drawable = A0L.getDrawable(R.drawable.instagram_link_pano_outline_24);
            if (drawable != null) {
                AbstractC25231BEo.A0x(A0L, drawable, R.color.audio_bar_action_color_enabled);
            }
            c27079Bx3.setImageDrawable(drawable);
            ShapeDrawable shapeDrawable = c27079Bx3.A04;
            AbstractC166987dD.A1N(A0L, shapeDrawable.getPaint(), R.color.gallery_item_selection_circle_default_color);
            shapeDrawable.setBounds(0, 0, c27079Bx3.getMeasuredWidth(), c27079Bx3.getMeasuredWidth());
            return AbstractC25225BEi.A0q(new C29893DGh(11, c29291Cvm, c26640Bpb));
        }
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-839146347, "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MediaViewerScreen.kt:320)");
            }
            C26144BhV c26144BhV = (C26144BhV) ((InterfaceC31033DkX) this.A02);
            String str = c26144BhV.A01;
            GifUrlImpl gifUrlImpl = c26144BhV.A00;
            CGR.A00(c5Tl, AbstractC27468CAo.A00(Modifier.A00, this.A00, false), gifUrlImpl, str, C5YD.A00(c5Tl, 2131953718), AbstractC46673Kkq.A00(gifUrlImpl), 0, 0, 32);
            if (C0fH.A02()) {
                C0fH.A00(866045722);
            }
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DS8(Object obj, float f, int i) {
        super(2);
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }
}
