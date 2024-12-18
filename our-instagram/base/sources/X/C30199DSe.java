package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.DSe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30199DSe extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ InterfaceC74963Ym A01;
    public final /* synthetic */ C26145BhW A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30199DSe(InterfaceC74963Ym interfaceC74963Ym, C26145BhW c26145BhW, InterfaceC16660sJ interfaceC16660sJ, float f, boolean z) {
        super(2);
        this.A02 = c26145BhW;
        this.A00 = f;
        this.A01 = interfaceC74963Ym;
        this.A03 = interfaceC16660sJ;
        this.A04 = z;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2033440651, "com.instagram.barcelona.feed.mediaviewer.ui.ImageMediaBox.<anonymous> (ImageMediaBox.kt:49)");
            }
            C26145BhW c26145BhW = this.A02;
            String str = c26145BhW.A07;
            float f = this.A00;
            ImageUrl imageUrl = (ImageUrl) AbstractC001800i.A0J((List) c26145BhW.A03);
            String str2 = c26145BhW.A06;
            MUD mud = (MUD) c26145BhW.A05;
            InterfaceC74963Ym interfaceC74963Ym = this.A01;
            InterfaceC16660sJ interfaceC16660sJ = this.A03;
            c5Tl.Eno(447702512);
            boolean z = this.A04;
            boolean AH5 = c5Tl.AH5(z);
            Object EEc = c5Tl.EEc();
            if (AH5 || EEc == C5UI.A00) {
                EEc = new D86(z, 0);
                c5Tl.FBy(EEc);
            }
            boolean A1W = AbstractC25228BEl.A1W(c5Tl);
            CXZ.A00(c5Tl, interfaceC74963Ym, mud, imageUrl, str, str2, (InterfaceC16820sZ) EEc, interfaceC16660sJ, f, A1W ? 1 : 0, A1W ? 1 : 0);
            if (C0fH.A02()) {
                C0fH.A00(1013286916);
            }
        }
        return C0eB.A00;
    }
}
