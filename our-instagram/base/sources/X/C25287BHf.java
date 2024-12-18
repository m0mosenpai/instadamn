package X;

import com.instagram.compose.ui.gradientspinner.BezierControlPoints;
import java.util.List;

/* renamed from: X.BHf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25287BHf {
    public static final C5C7 A0C = C6M5.A00(BIG.A00, C25284BHb.A00);
    public float A00;
    public float A01;
    public Float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final InterfaceC30898DiB A08;
    public final InterfaceC74953Yl A09;
    public final BezierControlPoints A0A;
    public final List A0B;

    public C25287BHf(BezierControlPoints bezierControlPoints, List list, float f, int i, int i2, int i3, int i4) {
        AbstractC25229BEm.A1I(list, 1, bezierControlPoints);
        this.A0B = list;
        this.A07 = i;
        this.A06 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A0A = bezierControlPoints;
        this.A03 = f;
        this.A08 = new C25243BFc(bezierControlPoints.A00, bezierControlPoints.A02, bezierControlPoints.A01, bezierControlPoints.A03);
        this.A09 = AbstractC25230BEn.A0U(AbstractC166997dE.A0a());
    }
}
