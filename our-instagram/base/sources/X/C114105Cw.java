package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Deprecated;

@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* renamed from: X.5Cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114105Cw {
    public C114205Dh A00;
    public C114205Dh A01;
    public C127055oj A02;
    public InterfaceC31114Dlw A03;
    public C5C3 A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC1128557s A0F;
    public final InterfaceC113865By A0G;
    public final Object A0C = new Object();
    public InterfaceC16660sJ A05 = C114115Cx.A00;
    public final CursorAnchorInfo.Builder A0E = new CursorAnchorInfo.Builder();
    public final float[] A0H = C5AJ.A06();
    public final Matrix A0D = new Matrix();

    public static final void A00(C114105Cw c114105Cw) {
        C113855Bx c113855Bx = (C113855Bx) c114105Cw.A0G;
        InterfaceC09390do interfaceC09390do = c113855Bx.A02;
        InputMethodManager inputMethodManager = (InputMethodManager) interfaceC09390do.getValue();
        View view = c113855Bx.A00;
        if (inputMethodManager.isActive(view)) {
            InterfaceC16660sJ interfaceC16660sJ = c114105Cw.A05;
            float[] fArr = c114105Cw.A0H;
            interfaceC16660sJ.invoke(new C5AJ(fArr));
            AndroidComposeView androidComposeView = (AndroidComposeView) c114105Cw.A0F;
            AndroidComposeView.A0C(androidComposeView);
            C5AJ.A05(fArr, androidComposeView.A0p);
            long j = androidComposeView.A02;
            float A01 = C119365at.A01(j);
            float A02 = C119365at.A02(j);
            float[] fArr2 = androidComposeView.A0o;
            C5AJ.A02(fArr2);
            C5AJ.A04(fArr2, A01, A02);
            C5BB.A01(fArr, fArr2);
            Matrix matrix = c114105Cw.A0D;
            AbstractC130975vl.A00(matrix, fArr);
            CursorAnchorInfo.Builder builder = c114105Cw.A0E;
            C5C3 c5c3 = c114105Cw.A04;
            C14360o3.A0A(c5c3);
            InterfaceC31114Dlw interfaceC31114Dlw = c114105Cw.A03;
            C14360o3.A0A(interfaceC31114Dlw);
            C127055oj c127055oj = c114105Cw.A02;
            C14360o3.A0A(c127055oj);
            C114205Dh c114205Dh = c114105Cw.A01;
            C14360o3.A0A(c114205Dh);
            C114205Dh c114205Dh2 = c114105Cw.A00;
            C14360o3.A0A(c114205Dh2);
            ((InputMethodManager) interfaceC09390do.getValue()).updateCursorAnchorInfo(view, AbstractC28017CWp.A00(matrix, builder, c114205Dh, c114205Dh2, c127055oj, interfaceC31114Dlw, c5c3, c114105Cw.A09, c114105Cw.A07, c114105Cw.A08, c114105Cw.A0A));
            c114105Cw.A06 = false;
        }
    }

    public C114105Cw(InterfaceC1128557s interfaceC1128557s, InterfaceC113865By interfaceC113865By) {
        this.A0F = interfaceC1128557s;
        this.A0G = interfaceC113865By;
    }
}
