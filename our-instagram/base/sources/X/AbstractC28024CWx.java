package X;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CWx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28024CWx {
    public static final InterfaceC30789DgQ A01(C6FG c6fg, C102884kP c102884kP, long j) {
        InterfaceC30924Dib c26090Bga;
        InterfaceC30789DgQ c26102Bgm;
        int i = c102884kP.A05;
        if (AbstractC167007dF.A1P(i, 16591)) {
            C102884kP A08 = c102884kP.A08(35);
            if (A08 != null) {
                c26102Bgm = new C26103Bgn(C6BK.A00(c6fg, A08, 0));
            } else {
                throw AbstractC166987dD.A12("Color shading must specify the themed color");
            }
        } else {
            if (AbstractC167007dF.A1P(i, 16616)) {
                C102884kP A082 = c102884kP.A08(38);
                if (A082 != null) {
                    C50627MWo A00 = A00(c6fg, A082);
                    String A0F = c102884kP.A0F();
                    float A002 = AbstractC25231BEo.A00(j);
                    float A003 = AbstractC68291VLd.A00(A0F, 0.0f, A002);
                    String A0J = c102884kP.A0J();
                    float A004 = AbstractC25232BEp.A00(j);
                    c26090Bga = new C26089BgZ(Shader.TileMode.CLAMP, A00, CXD.A01(A0J, A004, A003), CXD.A01(c102884kP.A0G(), A004, AbstractC25235BEs.A00(c102884kP, A002, 35)));
                } else {
                    throw AbstractC166987dD.A12("Radial gradient shading must specify the gradient");
                }
            } else if (i == 16615) {
                C102884kP A083 = c102884kP.A08(38);
                if (A083 != null) {
                    C50627MWo A005 = A00(c6fg, A083);
                    long A01 = CXD.A01(c102884kP.A0G(), AbstractC25232BEp.A00(j), AbstractC68291VLd.A00(c102884kP.A0L(35), 0.0f, AbstractC25231BEo.A00(j)));
                    String A0F2 = c102884kP.A0F();
                    float f = 0.0f;
                    if (A0F2 != null) {
                        f = C6BE.A01(A0F2);
                    }
                    c26090Bga = new C26090Bga(Shader.TileMode.CLAMP, A005, f, A01);
                } else {
                    throw AbstractC166987dD.A12("Radial gradient shading must specify the gradient");
                }
            } else {
                throw AbstractC166987dD.A12("Unknown canvas shading.");
            }
            c26102Bgm = new C26102Bgm(c26090Bga);
        }
        return c26102Bgm;
    }

    public static final C50627MWo A00(C6FG c6fg, C102884kP c102884kP) {
        float[] A0w;
        if (c102884kP.A05 == 16594) {
            List A0N = c102884kP.A0N(36);
            C14360o3.A07(A0N);
            ArrayList A0q = AbstractC167017dG.A0q(A0N);
            Iterator it = A0N.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1W(A0q, C6BK.A00(c6fg, (C102884kP) it.next(), 0));
            }
            int[] A0x = AbstractC001800i.A0x(A0q);
            List A0O = c102884kP.A0O(35);
            C14360o3.A07(A0O);
            if (A0O.isEmpty()) {
                A0w = null;
            } else {
                List A0O2 = c102884kP.A0O(35);
                C14360o3.A07(A0O2);
                A0w = AbstractC001800i.A0w(A0O2);
            }
            return new C50627MWo(5, A0w, A0x);
        }
        throw AbstractC166987dD.A12("Expected canvas gradient model.");
    }
}
