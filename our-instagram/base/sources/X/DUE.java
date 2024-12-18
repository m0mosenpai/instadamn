package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* loaded from: classes5.dex */
public final class DUE extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUE(Object obj, Object obj2, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                boolean z = this.A06;
                LineType lineType = (LineType) this.A04;
                CEB.A00(A0S, (Modifier) this.A03, lineType, AbstractC25225BEi.A04(this.A01), this.A02, z, this.A05);
                break;
            case 1:
                CEV.A00(A0S, (Modifier) this.A03, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, this.A06, this.A05);
                break;
            case 2:
                AbstractC27629CHa.A00(A0S, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, this.A06, this.A05);
                break;
            default:
                CZ7.A01(A0S, (AudioOverlayTrack) this.A04, (List) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A05, this.A06);
                break;
        }
        return C0eB.A00;
    }
}
