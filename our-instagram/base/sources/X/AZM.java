package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.common.math.matrix.Matrix4;
import java.util.HashMap;
import java.util.NavigableSet;

/* loaded from: classes4.dex */
public final class AZM implements InterfaceC179077xJ {
    public AA3 A01;
    public final C178747wm A02;
    public final C198658qF A03;
    public final A8J A04;
    public C199758sR A00 = new C199758sR(0, 0);
    public final HashMap A05 = AbstractC166987dD.A1G();

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        return interfaceC179467xw;
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
        C14360o3.A0B(obj, 1);
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        this.A03.detach();
    }

    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        return true;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        return false;
    }

    @Override // X.InterfaceC179077xJ
    public final void EGd(InterfaceC179037xF interfaceC179037xF, Long l) {
        C14360o3.A0B(interfaceC179037xF, 0);
        InterfaceC179437xt interfaceC179437xt = (InterfaceC179437xt) interfaceC179037xF.B9z(0).get(0);
        C178747wm c178747wm = this.A02;
        C179027xE c179027xE = new C179027xE(c178747wm, null, ((C179027xE) interfaceC179037xF).A05);
        c179027xE.A8h(interfaceC179437xt, 0);
        AA3 aa3 = this.A01;
        if (aa3 != null) {
            int size = aa3.A04.size();
            for (int i = 0; i < size; i++) {
                AA3 aa32 = this.A01;
                if (aa32 != null) {
                    String str = (String) aa32.A04.get(i);
                    A8J a8j = aa32.A02;
                    C14360o3.A0B(str, 0);
                    try {
                        InterfaceC197718oi A01 = C209089Mq.A01(a8j.A00, str, 2, AbstractC002300n.A0f(AbstractC167007dF.A0h(str), ".pkm", false), true);
                        HashMap hashMap = a8j.A02;
                        if (A01 != null) {
                            hashMap.put(str, A01);
                            Object obj = hashMap.get(str);
                            if (obj != null) {
                                InterfaceC197718oi interfaceC197718oi = (InterfaceC197718oi) obj;
                                SparseArray sparseArray = aa32.A00;
                                C9RO c9ro = (C9RO) sparseArray.get(i);
                                if (c9ro == null) {
                                    c9ro = new C9RO(new C179387xo());
                                    sparseArray.put(i, c9ro);
                                }
                                c9ro.A00 = false;
                                int width = interfaceC197718oi.getWidth();
                                int height = interfaceC197718oi.getHeight();
                                c9ro.FBE(width, height, width, height, 0, 0, 0, false);
                                c9ro.A00(interfaceC197718oi.getTexture());
                                AA3 aa33 = this.A01;
                                if (aa33 != null) {
                                    AbstractC199818si abstractC199818si = (AbstractC199818si) aa33.A06.getValue();
                                    FilterModel filterModel = abstractC199818si.A00;
                                    AA3 aa34 = this.A01;
                                    if (aa34 != null) {
                                        C199758sR c199758sR = this.A00;
                                        C5NO c5no = (C5NO) ((NavigableSet) aa34.A05.get(i)).floor(aa34.A03);
                                        SparseArray sparseArray2 = aa34.A01;
                                        Matrix4 matrix4 = (Matrix4) sparseArray2.get(i);
                                        if (matrix4 == null) {
                                            matrix4 = new Matrix4();
                                            sparseArray2.put(i, matrix4);
                                            C14360o3.A0A(c5no);
                                            AbstractC23049AEf.A00(c199758sR, c199758sR, matrix4, c5no);
                                        }
                                        AbstractC199788sU.A00(filterModel, matrix4.A01);
                                        C198658qF c198658qF = this.A03;
                                        c198658qF.A03 = abstractC199818si;
                                        HashMap hashMap2 = this.A05;
                                        C1809380v c1809380v = (C1809380v) hashMap2.get(c9ro);
                                        if (c1809380v == null) {
                                            c1809380v = new C1809380v(c178747wm, c9ro, true);
                                            hashMap2.put(c9ro, c1809380v);
                                        }
                                        c179027xE.EWA(c1809380v, 0);
                                        c198658qF.A04 = false;
                                        c198658qF.EGd(c179027xE, l);
                                    }
                                }
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } catch (Exception e) {
                        AbstractC166987dD.A0t(a8j.A01).A03();
                        AbstractC167007dF.A15(C18950wb.A01.AEp("null_texture", 817894439), "path", str, e);
                        throw e;
                    }
                }
            }
            return;
        }
        C14360o3.A0F("photoRenderOverlayController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC179077xJ
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A00 = new C199758sR(i4, i5);
        this.A03.FBm(i, i2, i3, z, i4, i5);
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    public AZM(C178747wm c178747wm, C198658qF c198658qF, A8J a8j) {
        this.A03 = c198658qF;
        this.A02 = c178747wm;
        this.A04 = a8j;
    }
}
