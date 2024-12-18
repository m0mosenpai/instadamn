package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.Cbe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28190Cbe {
    public C114205Dh A00;
    public C114205Dh A01;
    public C127055oj A02;
    public InterfaceC31114Dlw A03;
    public C5C3 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC30907DiK A0E;
    public final InterfaceC16660sJ A0F;
    public final Object A0B = new Object();
    public final CursorAnchorInfo.Builder A0D = new CursorAnchorInfo.Builder();
    public final float[] A0G = C5AJ.A06();
    public final Matrix A0C = new Matrix();

    public static final void A00(C28190Cbe c28190Cbe) {
        C28780CnC c28780CnC = (C28780CnC) c28190Cbe.A0E;
        InterfaceC09390do interfaceC09390do = c28780CnC.A01;
        InputMethodManager inputMethodManager = (InputMethodManager) interfaceC09390do.getValue();
        View view = c28780CnC.A00;
        if (inputMethodManager.isActive(view)) {
            float[] fArr = c28190Cbe.A0G;
            C5AJ.A02(fArr);
            c28190Cbe.A0F.invoke(new C5AJ(fArr));
            C114205Dh c114205Dh = c28190Cbe.A00;
            C14360o3.A0A(c114205Dh);
            float f = -c114205Dh.A01;
            C114205Dh c114205Dh2 = c28190Cbe.A00;
            C14360o3.A0A(c114205Dh2);
            C5AJ.A04(fArr, f, -c114205Dh2.A03);
            Matrix matrix = c28190Cbe.A0C;
            AbstractC130975vl.A00(matrix, fArr);
            CursorAnchorInfo.Builder builder = c28190Cbe.A0D;
            C5C3 c5c3 = c28190Cbe.A04;
            C14360o3.A0A(c5c3);
            InterfaceC31114Dlw interfaceC31114Dlw = c28190Cbe.A03;
            C14360o3.A0A(interfaceC31114Dlw);
            C127055oj c127055oj = c28190Cbe.A02;
            C14360o3.A0A(c127055oj);
            C114205Dh c114205Dh3 = c28190Cbe.A01;
            C14360o3.A0A(c114205Dh3);
            C114205Dh c114205Dh4 = c28190Cbe.A00;
            C14360o3.A0A(c114205Dh4);
            ((InputMethodManager) interfaceC09390do.getValue()).updateCursorAnchorInfo(view, AbstractC28012CWk.A00(matrix, builder, c114205Dh3, c114205Dh4, c127055oj, interfaceC31114Dlw, c5c3, c28190Cbe.A08, c28190Cbe.A06, c28190Cbe.A07, c28190Cbe.A09));
            c28190Cbe.A05 = false;
        }
    }

    public C28190Cbe(InterfaceC30907DiK interfaceC30907DiK, InterfaceC16660sJ interfaceC16660sJ) {
        this.A0F = interfaceC16660sJ;
        this.A0E = interfaceC30907DiK;
    }
}
