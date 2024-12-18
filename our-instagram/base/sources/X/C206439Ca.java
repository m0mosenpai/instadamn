package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository;
import com.instagram.compose.ui.gradientspinner.GradientSpinnerNode;

/* renamed from: X.9Ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206439Ca extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206439Ca(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A04 = i;
        this.A05 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C206439Ca) && ((C206439Ca) obj).A04 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return ((AndroidEdgeEffectOverscrollEffect) this.A05).ACG(this, null, 0L);
            case 1:
                return ((NestedScrollNode) this.A05).Da5(this, 0L);
            case 2:
                return ((MiniGalleryCategoriesRepository) this.A05).A00(null, this, 0L);
            default:
                return GradientSpinnerNode.A00((GradientSpinnerNode) this.A05, this);
        }
    }
}
