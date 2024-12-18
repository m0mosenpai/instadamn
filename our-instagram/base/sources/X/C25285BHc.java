package X;

import com.instagram.compose.ui.gradientspinner.Segment;
import java.util.List;

/* renamed from: X.BHc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25285BHc extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ float A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25285BHc(float f) {
        super(3);
        this.A00 = f;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        float F8E;
        InterfaceC1128857w interfaceC1128857w = (InterfaceC1128857w) obj;
        C25287BHf c25287BHf = (C25287BHf) obj2;
        C6L5 c6l5 = (C6L5) obj3;
        AbstractC167027dH.A12(interfaceC1128857w, c25287BHf, c6l5);
        float EqT = interfaceC1128857w.EqT(this.A00);
        List<Segment> list = c25287BHf.A0B;
        int size = list.size();
        for (Segment segment : list) {
            float f = c25287BHf.A01 + 270.0f;
            InterfaceC30898DiB interfaceC30898DiB = c25287BHf.A08;
            C14360o3.A0B(segment, 1);
            float f2 = segment.A00;
            float f3 = f2 * 2.0f;
            if (f2 < 0.5f) {
                F8E = interfaceC30898DiB.F8E(1.0f - f3);
            } else {
                F8E = 1.0f - interfaceC30898DiB.F8E(1.0f - (f3 - 1.0f));
            }
            float f4 = 360.0f / size;
            float f5 = F8E * f4;
            interfaceC1128857w.AQZ(c6l5, null, new C62V(null, Math.min(((float) ((C5YC.A02(r0) / 2.0f) * 6.283185307179586d)) * (f5 / 360.0f), EqT), 4.0f, 1, 1), (f + ((segment.A03 * f4) - (f4 / 2.0f))) - (f5 / 2.0f), f5, 1.0f, 3, 0L, C62U.A00(interfaceC1128857w.Bxc(), 0L), false);
        }
        return C0eB.A00;
    }
}
