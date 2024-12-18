package X;

import android.content.Intent;
import android.graphics.Path;

/* renamed from: X.9Ep, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207109Ep extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207109Ep(Object obj, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C7VM c7vm = (C7VM) obj;
            C14360o3.A0B(c7vm, 0);
            c7vm.onActivityResult(this.A01, this.A02, (Intent) this.A03);
        } else {
            C127045oi c127045oi = (C127045oi) obj;
            C60Y c60y = (C60Y) this.A03;
            int i = this.A02;
            int i2 = this.A01;
            InterfaceC122825hI interfaceC122825hI = c127045oi.A06;
            int i3 = c127045oi.A05;
            int i4 = c127045oi.A04;
            int A03 = C17s.A03(i, i3, i4) - i3;
            int A032 = C17s.A03(i2, i3, i4) - i3;
            C122815hH c122815hH = (C122815hH) interfaceC122825hI;
            if (A03 >= 0 && A03 <= A032 && A032 <= c122815hH.A03.length()) {
                Path path = new Path();
                C122845hK c122845hK = c122815hH.A01;
                c122845hK.A09.getSelectionPath(A03, A032, path);
                int i5 = c122845hK.A07;
                if (i5 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i5);
                }
                C60X c60x = new C60X(path);
                c60x.A00(AbstractC119395aw.A00(0.0f, c127045oi.A01));
                ((C60X) c60y).A03.addPath(c60x.A03, C119365at.A01(0L), Float.intBitsToFloat(0));
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0z("start(", ") or end(", AbstractC111324zv.A00(3345), "], or start > end!", A03, A032, c122815hH.A03.length()));
            }
        }
        return C0eB.A00;
    }
}
