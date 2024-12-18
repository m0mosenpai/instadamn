package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;

/* renamed from: X.Abi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23528Abi implements C2n2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C23728Af1 A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public C23528Abi(C23728Af1 c23728Af1, List list, List list2, int i, boolean z, boolean z2) {
        this.A01 = c23728Af1;
        this.A00 = i;
        this.A02 = list;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = list2;
    }

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Drawable drawable;
        Number number = (Number) obj;
        if (number != null) {
            C23728Af1 c23728Af1 = this.A01;
            int i = this.A00;
            List list = this.A02;
            boolean z = this.A04;
            boolean z2 = this.A05;
            List list2 = this.A03;
            InteractiveDrawableContainer interactiveDrawableContainer = c23728Af1.A00;
            int intValue = number.intValue();
            BEd A02 = InteractiveDrawableContainer.A02(interactiveDrawableContainer, intValue);
            if (A02 != null) {
                drawable = ((C9LJ) A02).A0B;
            } else {
                drawable = null;
            }
            AbstractC23126AKl.A00(drawable);
            if (i >= 0) {
                C5RQ A022 = AbstractC209069Mo.A02(drawable);
                if (A022 != null) {
                    A022.EUp(i, A022.getDurationInMs());
                }
                C74T A00 = AbstractC209069Mo.A00(drawable);
                if (A00 instanceof C74P) {
                    C74P c74p = (C74P) A00;
                    long Azf = c74p.Azf();
                    XEC xec = c74p.A0A;
                    if (xec != null) {
                        xec.EMm((int) (i % Azf), C74P.A02(c74p, xec));
                    }
                }
            }
            if ((drawable instanceof C220919pF) && ((C220919pF) drawable).A03) {
                C14360o3.A0C(drawable, "null cannot be cast to non-null type com.instagram.reels.countdown.view.CountdownStickerDrawable");
                list.add(drawable);
            }
            if (!AbstractC23126AKl.A02(drawable, z, z2)) {
                interactiveDrawableContainer.A0f(intValue, false);
                list2.add(number);
                return null;
            }
            return null;
        }
        return null;
    }
}
