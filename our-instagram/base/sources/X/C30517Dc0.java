package X;

import android.view.View;
import androidx.compose.ui.Modifier;

/* renamed from: X.Dc0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30517Dc0 extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final int A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl;
        int i;
        switch (this.A00) {
            case 0:
                View view = (View) obj2;
                int A06 = AbstractC167007dF.A06(1, view, obj3);
                int layerType = view.getLayerType();
                int i2 = this.A01;
                int i3 = 1;
                if (i2 != 1) {
                    i3 = 0;
                    if (i2 == A06) {
                        i3 = 2;
                    }
                }
                if (view.getLayerType() != i3) {
                    view.setLayerType(i3, null);
                }
                return AbstractC25225BEi.A0q(new C57249PbX(layerType, 3, view));
            case 1:
                c5Tl = (C5Tl) obj2;
                if ((AbstractC25232BEp.A0p(obj3, obj) & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-804885666, "com.instagram.aistudio.editor.sectionHeaderItems.<anonymous> (AiConversationScreen.kt:126)");
                    }
                    String A00 = C5YD.A00(c5Tl, this.A01);
                    C5WR.A0Y(c5Tl, AbstractC118175Wb.A0D(AbstractC25228BEl.A0W(), 16.0f, 0.0f, 16.0f), AbstractC25226BEj.A0c(c5Tl), A00, AbstractC25226BEj.A0M(c5Tl));
                    if (C0fH.A02()) {
                        i = 882537690;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 2:
                c5Tl = (C5Tl) obj2;
                if ((AbstractC25232BEp.A0p(obj3, obj) & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(853354496, "com.instagram.aistudio.editor.sectionHeaderItems.<anonymous> (AiKnowledgeScreen.kt:170)");
                    }
                    String A002 = C5YD.A00(c5Tl, this.A01);
                    C5WR.A0Y(c5Tl, AbstractC118175Wb.A0D(AbstractC25228BEl.A0W(), 16.0f, 0.0f, 16.0f), AbstractC25226BEj.A0c(c5Tl), A002, AbstractC25226BEj.A0M(c5Tl));
                    if (C0fH.A02()) {
                        i = -2078084063;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                c5Tl = (C5Tl) obj2;
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-682516089, "com.instagram.creator.agent.exampledialog.getExamplesSection.<anonymous> (ExampleDialogComponent.kt:53)");
                    }
                    BY1.A02(c5Tl, AbstractC25227BEk.A0J(Modifier.A00, 30.0f), AbstractC136736Hc.A00(c5Tl, this.A01));
                    if (C0fH.A02()) {
                        i = 395755389;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30517Dc0(int i, int i2) {
        super(3);
        this.A00 = i2;
        this.A01 = i;
    }
}
