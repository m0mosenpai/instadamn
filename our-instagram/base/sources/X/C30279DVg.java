package X;

import androidx.compose.ui.Modifier;
import com.instagram.wonderwall.model.WallPostItem;

/* renamed from: X.DVg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30279DVg extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ WallPostItem A03;
    public final /* synthetic */ InterfaceC31065Dl7 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30279DVg(Modifier modifier, WallPostItem wallPostItem, InterfaceC31065Dl7 interfaceC31065Dl7, String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A03 = wallPostItem;
        this.A02 = modifier;
        this.A05 = str;
        this.A04 = interfaceC31065Dl7;
        this.A08 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        WallPostItem wallPostItem = this.A03;
        Modifier modifier = this.A02;
        String str = this.A05;
        AbstractC28404CgA.A00(A0S, modifier, wallPostItem, this.A04, str, AbstractC25225BEi.A04(this.A00), this.A01, this.A08, this.A06, this.A07);
        return C0eB.A00;
    }
}
