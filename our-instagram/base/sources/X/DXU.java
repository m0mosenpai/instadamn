package X;

import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import com.instagram.profilecard.domain.ProfileCardViewModel;

/* loaded from: classes5.dex */
public final class DXU extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXU(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A06 = obj2;
        this.A07 = obj3;
        this.A08 = obj4;
        this.A0C = z;
        this.A0B = z2;
        this.A09 = obj5;
        this.A04 = obj6;
        this.A05 = obj7;
        this.A0A = z3;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
            boolean z = this.A0A;
            ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A09;
            C26081BgA c26081BgA = (C26081BgA) this.A08;
            C5Hc c5Hc = (C5Hc) this.A07;
            View view = (View) this.A05;
            Modifier modifier = (Modifier) this.A06;
            O7E o7e = (O7E) this.A04;
            AbstractC28509Ci3.A01((Bitmap) this.A03, view, A0S, modifier, o7e, c26081BgA, profileCardViewModel, c5Hc, AbstractC25225BEi.A04(this.A01), this.A02, z, this.A0C, this.A0B);
        } else {
            C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
            InterfaceC137546La interfaceC137546La = (InterfaceC137546La) this.A03;
            InterfaceC137546La interfaceC137546La2 = (InterfaceC137546La) this.A06;
            C27866CQd c27866CQd = (C27866CQd) this.A07;
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A08;
            boolean z2 = this.A0C;
            boolean z3 = this.A0B;
            CHB.A00(A0S2, interfaceC137546La, interfaceC137546La2, (InterfaceC137546La) this.A09, (C9G) this.A04, (MagicModPostCaptureTransform) this.A05, c27866CQd, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A02, z2, z3, this.A0A);
        }
        return C0eB.A00;
    }
}
