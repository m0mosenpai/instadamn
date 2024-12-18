package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.PbY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57250PbY extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57250PbY(Object obj, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((C8FP) ((C52692NTd) this.A02).A0U.getValue()).EMs(null, this.A01, true);
                break;
            case 1:
                return AbstractC166997dE.A0S((View) this.A02, this.A01);
            case 2:
                J27.A00((J27) this.A02, this.A01);
                break;
            case 3:
            case 4:
            default:
                C111034zF c111034zF = (C111034zF) AbstractC001800i.A0O(((C26136BhN) this.A02).A06.A08, this.A01);
                if (c111034zF != null) {
                    return c111034zF.A00;
                }
                return null;
            case 5:
                ((ReboundViewPager) this.A02).A0L(this.A01, 0.0f);
                break;
        }
        return C0eB.A00;
    }
}
