package X;

import androidx.compose.ui.Modifier;
import com.instagram.wonderwall.model.WallPostInfo;

/* renamed from: X.DUy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30271DUy extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ WallPostInfo A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30271DUy(Modifier modifier, WallPostInfo wallPostInfo, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A03 = wallPostInfo;
        this.A02 = modifier;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A04 = interfaceC16820sZ;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        WallPostInfo wallPostInfo = this.A03;
        CKY.A00(A0S, this.A02, wallPostInfo, this.A04, AbstractC25225BEi.A04(this.A00), this.A01, this.A05, this.A07, this.A06);
        return C0eB.A00;
    }
}
