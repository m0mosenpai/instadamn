package X;

import android.graphics.ImageFormat;
import com.facebook.smartcapture.docauth.DocAuthManager;

/* renamed from: X.YBp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73403YBp implements InterfaceC1814282u {
    public final int A00;
    public final Object A01;

    public C73403YBp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1814282u
    public final void DEf(Exception exc) {
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        XQ2 xq2;
        int i = this.A00;
        C14360o3.A0B(exc, 0);
        Object obj = this.A01;
        if (i != 0) {
            XQ3 xq3 = (XQ3) obj;
            interfaceC16530ry = xq3.A09;
            c0yrArr = XQ3.A0B;
            xq2 = xq3;
        } else {
            XQ2 xq22 = (XQ2) obj;
            interfaceC16530ry = xq22.A05;
            c0yrArr = XQ2.A06;
            xq2 = xq22;
        }
        InterfaceC1814282u interfaceC1814282u = (InterfaceC1814282u) AbstractC31171DnF.A0Y(xq2, interfaceC16530ry, c0yrArr, 1);
        if (interfaceC1814282u != null) {
            interfaceC1814282u.DEf(exc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1814282u
    public final void DM7(C177447ue c177447ue) {
        InterfaceC175067qg interfaceC175067qg;
        C177007tw A00;
        int i;
        XQ2 xq2;
        int i2 = this.A00;
        C14360o3.A0B(c177447ue, 0);
        Object obj = this.A01;
        if (i2 != 0) {
            XQ3 xq3 = (XQ3) obj;
            xq3.A01 = c177447ue;
            int bitsPerPixel = ImageFormat.getBitsPerPixel(17);
            DocAuthManager docAuthManager = (DocAuthManager) AbstractC31171DnF.A0Y(xq3, xq3.A08, XQ3.A0B, 0);
            if (docAuthManager != null) {
                docAuthManager.bytesPerPixel = bitsPerPixel / 8;
            }
            C176837tf c176837tf = new C176837tf();
            c176837tf.A01(AbstractC176797tb.A0m, 17);
            C9TO c9to = xq3.A02;
            if (c9to != null) {
                interfaceC175067qg = c9to.A0U;
                A00 = c176837tf.A00();
                i = 2;
                xq2 = xq3;
                interfaceC175067qg.Cpo(new XW0(xq2, i), A00);
                return;
            }
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        XQ2 xq22 = (XQ2) obj;
        xq22.A01 = c177447ue;
        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(17);
        DocAuthManager docAuthManager2 = (DocAuthManager) AbstractC31171DnF.A0Y(xq22, xq22.A04, XQ2.A06, 0);
        if (docAuthManager2 != null) {
            docAuthManager2.bytesPerPixel = bitsPerPixel2 / 8;
        }
        C176837tf c176837tf2 = new C176837tf();
        c176837tf2.A01(AbstractC176797tb.A0m, 17);
        C9TO c9to2 = xq22.A02;
        if (c9to2 != null) {
            interfaceC175067qg = c9to2.A0U;
            A00 = c176837tf2.A00();
            i = 1;
            xq2 = xq22;
            interfaceC175067qg.Cpo(new XW0(xq2, i), A00);
            return;
        }
        C14360o3.A0F("cameraPreview");
        throw C00O.createAndThrow();
    }
}
