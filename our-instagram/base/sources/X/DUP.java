package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class DUP extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUP(Object obj, Object obj2, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A05 = str;
        this.A04 = obj;
        this.A06 = z;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A05;
        if (i != 0) {
            boolean z = this.A06;
            CEO.A00(A0S, (Modifier) this.A03, str, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, z);
        } else {
            AbstractC25638BVa.A00(A0S, (UserSession) this.A04, str, (InterfaceC16620sF) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, this.A06);
        }
        return C0eB.A00;
    }
}
