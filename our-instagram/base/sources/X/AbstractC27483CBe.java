package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.CBe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27483CBe {
    public static final void A00(C6L5 c6l5, AnonymousClass585 anonymousClass585, C122215gH c122215gH, AbstractC119825bg abstractC119825bg, C127035oh c127035oh, C122205gG c122205gG, float f) {
        anonymousClass585.ELZ();
        List list = c127035oh.A04;
        if (list.size() > 1 && !(c6l5 instanceof C6L4)) {
            if (c6l5 instanceof C62Y) {
                int size = list.size();
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (int i = 0; i < size; i++) {
                    f3 += ((C127045oi) list.get(i)).A06.BDQ();
                    f2 = Math.max(f2, Constraints.A01(((C122815hH) r1).A00));
                }
                Shader A01 = ((C62Y) c6l5).A01(C5YB.A00(f2, f3));
                Matrix matrix = new Matrix();
                A01.getLocalMatrix(matrix);
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    InterfaceC122825hI interfaceC122825hI = ((C127045oi) list.get(i2)).A06;
                    interfaceC122825hI.E3G(new C25760BZz(A01, 0), anonymousClass585, c122215gH, abstractC119825bg, c122205gG, f, 3);
                    anonymousClass585.F8X(0.0f, interfaceC122825hI.BDQ());
                    matrix.setTranslate(0.0f, -interfaceC122825hI.BDQ());
                    A01.setLocalMatrix(matrix);
                }
            }
        } else {
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                InterfaceC122825hI interfaceC122825hI2 = ((C127045oi) list.get(i3)).A06;
                interfaceC122825hI2.E3G(c6l5, anonymousClass585, c122215gH, abstractC119825bg, c122205gG, f, 3);
                anonymousClass585.F8X(0.0f, interfaceC122825hI2.BDQ());
            }
        }
        anonymousClass585.EKS();
    }
}
