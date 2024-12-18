package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.List;

/* renamed from: X.CcV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28225CcV {
    public Paint A00;
    public Paint A01;
    public Paint A02;
    public C26091Bgb A03;
    public C26093Bgd A04;
    public C26094Bge A05;
    public final C003701c A06;
    public final C18140uy A07;

    public final Path A00(C26104Bgo c26104Bgo, C26112Bgw c26112Bgw) {
        Path.FillType fillType;
        C14360o3.A0B(c26104Bgo, 0);
        C003701c c003701c = this.A06;
        Path path = (Path) c003701c.A02(AbstractC166987dD.A1L(c26104Bgo, c26112Bgw));
        if (path == null) {
            path = AbstractC166987dD.A0T();
            if (c26104Bgo.A00 == 0) {
                fillType = Path.FillType.WINDING;
            } else {
                fillType = Path.FillType.EVEN_ODD;
            }
            if (path.getFillType() != fillType) {
                path.setFillType(fillType);
            }
            List list = c26104Bgo.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC30926Did) list.get(i)).ACE(path, this);
            }
            c003701c.A05(AbstractC166987dD.A1L(c26104Bgo, c26112Bgw), path);
        }
        return path;
    }

    public final void A01(C26112Bgw c26112Bgw, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c26112Bgw, 0);
        C18140uy c18140uy = this.A07;
        Matrix matrix = (Matrix) c18140uy.A7H();
        if (matrix == null) {
            matrix = new Matrix();
        }
        c26112Bgw.ACD(matrix);
        interfaceC16660sJ.invoke(matrix);
        matrix.reset();
        c18140uy.EE6(matrix);
    }

    public C28225CcV(int i, int i2) {
        this.A07 = new C18140uy(i);
        this.A06 = new C003701c(i2);
    }

    public C28225CcV() {
        this(5, 10);
    }
}
