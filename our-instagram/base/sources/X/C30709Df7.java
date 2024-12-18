package X;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: X.Df7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30709Df7 extends C0YY implements InterfaceC16610sE {
    public static final C30709Df7 A00 = new C30709Df7();

    public C30709Df7() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass418 anonymousClass418 = (AnonymousClass418) obj;
        C27079Bx3 c27079Bx3 = (C27079Bx3) obj2;
        float A09 = AbstractC166987dD.A09(obj3);
        boolean A1a = AbstractC167017dG.A1a(anonymousClass418, c27079Bx3);
        if (A09 >= 0.0f) {
            float f = c27079Bx3.A00;
            if (A09 >= f) {
                c27079Bx3.setBackground(c27079Bx3.A04);
                c27079Bx3.A03.reset();
            } else {
                float f2 = A09 / f;
                Path path = c27079Bx3.A03;
                path.reset();
                PathMeasure pathMeasure = c27079Bx3.A01;
                if (pathMeasure != null) {
                    pathMeasure.getSegment(0.0f, pathMeasure.getLength() * f2, path, A1a);
                }
                c27079Bx3.invalidate();
                c27079Bx3.setBackground(null);
            }
        }
        return anonymousClass418.A00(DFF.A00);
    }
}
