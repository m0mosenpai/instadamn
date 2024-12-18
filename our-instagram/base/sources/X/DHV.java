package X;

import android.graphics.Path;
import android.graphics.Shader;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DHV extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final int A01;
    public final long A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHV(Object obj, float f, int i, long j) {
        super(1);
        this.A01 = i;
        this.A00 = f;
        this.A02 = j;
        this.A03 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        switch (this.A01) {
            case 0:
                InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
                C28739CmX c28739CmX = (C28739CmX) ((InterfaceC31141Dmg) this.A03);
                InterfaceC1128957x interfaceC1128957x = c28739CmX.A01;
                long j = c28739CmX.A00;
                if (Constraints.A07(j)) {
                    f = interfaceC1128957x.EqI(Constraints.A01(j));
                } else {
                    f = Float.POSITIVE_INFINITY;
                }
                long A00 = AbstractC119395aw.A00(A0c.EqT(f * 0.55f), this.A00 - 6.0f);
                float A01 = C119365at.A01(A00);
                float A002 = AbstractC25226BEj.A00(A0c, 4.0f, A01);
                float A02 = C119365at.A02(A00);
                long A003 = AbstractC119395aw.A00(A002, AbstractC25226BEj.A00(A0c, 4.0f, A02));
                float A012 = C119365at.A01(A003);
                float A022 = C119365at.A02(A003);
                long A004 = AbstractC119395aw.A00(A012, AbstractC25226BEj.A00(A0c, 7.0f, A022));
                float A013 = C119365at.A01(A004);
                float A005 = AbstractC25226BEj.A00(A0c, 5.5f, A013);
                float A023 = C119365at.A02(A004);
                long A006 = AbstractC119395aw.A00(A005, AbstractC25226BEj.A00(A0c, 1.0f, A023));
                long A007 = AbstractC119395aw.A00(AbstractC25226BEj.A00(A0c, 16.0f, A012), AbstractC25226BEj.A00(A0c, 1.0f, A02));
                float A014 = C119365at.A01(A007);
                long A008 = AbstractC119395aw.A00(AbstractC25226BEj.A00(A0c, 2.0f, A014), A02);
                C60X A009 = C60W.A00();
                Path path = A009.A03;
                path.moveTo(A01, A02);
                path.quadTo(AbstractC25226BEj.A00(A0c, 4.0f, A01), A02, A012, A022);
                path.lineTo(A013, A023);
                path.quadTo(AbstractC25226BEj.A00(A0c, 2.0f, A013), AbstractC25226BEj.A00(A0c, 3.0f, A023), C119365at.A01(A006), C119365at.A02(A006));
                float A024 = C119365at.A02(A007);
                path.lineTo(A014, A024);
                path.quadTo(AbstractC25226BEj.A00(A0c, 1.0f, A014), A024, C119365at.A01(A008), C119365at.A02(A008));
                path.close();
                A0c.AQw(null, A009, C119815bf.A00, 1.0f, 3, this.A02);
                break;
            case 1:
                InterfaceC1128857w A0c2 = AbstractC25228BEl.A0c(obj);
                float EqT = A0c2.EqT(this.A00);
                A0c2.AR4(null, (AbstractC119825bg) this.A03, 0.4f, 3, this.A02, 0L, AbstractC25228BEl.A0H(A0c2), AbstractC137636Lj.A00(EqT, EqT));
                break;
            case 2:
                COV cov = (COV) obj;
                C14360o3.A0B(cov, 0);
                long j2 = this.A02;
                float f2 = this.A00;
                C26105Bgp c26105Bgp = new C26105Bgp(j2, f2);
                C50627MWo c50627MWo = ((C26349Bku) this.A03).A00;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                C14360o3.A0B(c50627MWo, 0);
                ((List) cov.A00.A01).add(new C26091Bgb(null, new C26102Bgm(new C26090Bga(tileMode, c50627MWo, f2, j2)), c26105Bgp, 3));
                break;
            default:
                CPT cpt = (CPT) obj;
                C14360o3.A0B(cpt, 0);
                C6Y c6y = C6Y.A04;
                float f3 = this.A00;
                Float valueOf = Float.valueOf(f3);
                Map map = cpt.A00;
                map.put(c6y, valueOf);
                C27964CUk c27964CUk = (C27964CUk) this.A03;
                Float f4 = c27964CUk.A00;
                if (f4 != null) {
                    float A05 = (f3 - AbstractC25231BEo.A05(c27964CUk.A01)) * (1.0f - f4.floatValue());
                    if (C119055aN.A00(this.A02) > f3 - A05) {
                        map.put(C6Y.A03, Float.valueOf(A05));
                    }
                }
                int A0010 = C119055aN.A00(this.A02);
                if (A0010 != 0) {
                    map.put(C6Y.A02, Float.valueOf(Math.max(0.0f, f3 - A0010)));
                    break;
                }
                break;
        }
        return C0eB.A00;
    }
}
