package X;

import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DSv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30216DSv extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30216DSv(long j, Object obj, Object obj2, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = j;
        this.A04 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AbstractC27552CDx.A00(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                return C0eB.A00;
            case 1:
                AbstractC28027CXb.A01(AbstractC25226BEj.A0S(obj, obj2), (User) this.A04, (InterfaceC16660sJ) this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                return C0eB.A00;
            default:
                C5Tl c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(989080545, "com.instagram.compose.igds.components.segmentedtabs.IgdsSegmentedTabLayout.<anonymous> (IgdsSegmentedTabLayout.kt:57)");
                    }
                    List list = (List) this.A04;
                    Object obj3 = this.A03;
                    int i = this.A01;
                    long j = this.A02;
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    int i2 = 0;
                    for (Object obj4 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C26038BfR c26038BfR = (C26038BfR) obj4;
                        C1130158n c1130158n = Modifier.A00;
                        C5XQ A0W = AbstractC25225BEi.A0W(4);
                        boolean A1Z = AbstractC25232BEp.A1Z(c5Tl, obj3, c26038BfR, 1053692043);
                        Object EEc = c5Tl.EEc();
                        if (A1Z || EEc == C5UI.A00) {
                            EEc = C29899DGn.A00(c26038BfR, obj3, 26);
                            c5Tl.FBy(EEc);
                        }
                        AbstractC25225BEi.A1V(c5Tl, false);
                        AbstractC28387Cfq.A01(c5Tl, C5XR.A05(c1130158n, A0W, null, (InterfaceC16820sZ) EEc, true), c26038BfR, 0, 0, j, AbstractC167007dF.A1P(i, i2));
                        A0q.add(C0eB.A00);
                        i2 = i3;
                    }
                    if (C0fH.A02()) {
                        C0fH.A00(1380175793);
                    }
                }
                return C0eB.A00;
        }
    }
}
