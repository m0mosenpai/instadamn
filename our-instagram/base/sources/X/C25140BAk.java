package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.Arrays;

/* renamed from: X.BAk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25140BAk extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C8NJ A02;
    public final /* synthetic */ float[] A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25140BAk(C8NJ c8nj, float[] fArr, float f, float f2) {
        super(4);
        this.A02 = c8nj;
        this.A03 = fArr;
        this.A01 = f;
        this.A00 = f2;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float A09 = AbstractC166987dD.A09(obj);
        float A092 = AbstractC166987dD.A09(obj2);
        float A093 = AbstractC166987dD.A09(obj3);
        float A094 = AbstractC166987dD.A09(obj4);
        Path path = this.A02.A06;
        float[] copyOf = Arrays.copyOf(this.A03, 8);
        C14360o3.A07(copyOf);
        float f = this.A01;
        float f2 = this.A00;
        C14360o3.A0B(path, 1);
        Matrix A0Q = AbstractC166987dD.A0Q();
        A0Q.preTranslate(0.0f, 0.5f - ((0.5625f / f) / 2.0f));
        float f3 = A09 * 3.0f;
        float f4 = 0.5625f / 2.0f;
        A0Q.postScale(f3, f3, f4, 0.5f);
        A0Q.postRotate(A092, f4, 0.5f);
        A0Q.postTranslate(A093 * f2 * 0.5625f, A094 * f2);
        A0Q.mapPoints(copyOf);
        Path A0T = AbstractC166987dD.A0T();
        A0T.moveTo(copyOf[0], copyOf[1]);
        A0T.lineTo(copyOf[2], copyOf[3]);
        A0T.lineTo(copyOf[4], copyOf[5]);
        A0T.lineTo(copyOf[6], copyOf[7]);
        A0T.lineTo(copyOf[0], copyOf[1]);
        AbstractC166987dD.A0T().op(path, A0T, Path.Op.INTERSECT);
        return Boolean.valueOf(!r1.isEmpty());
    }
}
