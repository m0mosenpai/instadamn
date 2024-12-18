package X;

import com.facebook.smartcapture.docauth.DocAuthManager;

/* loaded from: classes12.dex */
public final class XW0 extends AbstractC184688Hj {
    public final int A00;
    public final Object A01;

    public XW0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC184688Hj
    public final void A01(Exception exc) {
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        XQ2 xq2;
        switch (this.A00) {
            case 0:
                C209049Mm c209049Mm = ((C208789Lm) this.A01).A0I;
                C209049Mm.A00(null, c209049Mm.A02, c209049Mm, C05F.A0j);
                return;
            case 1:
                C14360o3.A0B(exc, 0);
                XQ2 xq22 = (XQ2) this.A01;
                interfaceC16530ry = xq22.A05;
                c0yrArr = XQ2.A06;
                xq2 = xq22;
                break;
            case 2:
                C14360o3.A0B(exc, 0);
                XQ3 xq3 = (XQ3) this.A01;
                interfaceC16530ry = xq3.A09;
                c0yrArr = XQ3.A0B;
                xq2 = xq3;
                break;
            default:
                String A00 = AbstractC111324zv.A00(1560);
                AbstractC12120kG.A0B("BoomerangCaptureController", A00, exc);
                C0K8.A0F("BoomerangCaptureController", A00, exc);
                return;
        }
        InterfaceC1814282u interfaceC1814282u = (InterfaceC1814282u) AbstractC31171DnF.A0Y(xq2, interfaceC16530ry, c0yrArr, 1);
        if (interfaceC1814282u == null) {
            return;
        }
        interfaceC1814282u.DEf(exc);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC184688Hj
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        String str;
        C177447ue c177447ue;
        InterfaceC1814282u interfaceC1814282u;
        DocAuthManager docAuthManager;
        DocAuthManager docAuthManager2;
        switch (this.A00) {
            case 1:
                XQ2 xq2 = (XQ2) this.A01;
                C176807tc c176807tc = AbstractC176797tb.A0q;
                C14360o3.A08(c176807tc);
                C176877tj c176877tj = (C176877tj) XQ2.A00(c176807tc, xq2);
                str = "cameraPreview";
                if (c176877tj != null && (docAuthManager = (DocAuthManager) AbstractC31171DnF.A0Y(xq2, xq2.A04, XQ2.A06, 0)) != null) {
                    int i = c176877tj.A02;
                    int i2 = c176877tj.A01;
                    C9TO c9to = xq2.A02;
                    if (c9to != null) {
                        int width = c9to.getWidth();
                        C9TO c9to2 = xq2.A02;
                        if (c9to2 != null) {
                            docAuthManager.onPreviewSizeChanged(i, i2, width, c9to2.getHeight());
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (xq2.A03) {
                    C9TO c9to3 = xq2.A02;
                    if (c9to3 != null) {
                        c9to3.A0U.A9g(xq2);
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c177447ue = xq2.A01;
                if (c177447ue == null || (interfaceC1814282u = (InterfaceC1814282u) AbstractC31171DnF.A0Y(xq2, xq2.A05, XQ2.A06, 1)) == null) {
                    return;
                }
                interfaceC1814282u.DM7(c177447ue);
                return;
            case 2:
                XQ3 xq3 = (XQ3) this.A01;
                C176807tc c176807tc2 = AbstractC176797tb.A0q;
                C14360o3.A08(c176807tc2);
                C176877tj c176877tj2 = (C176877tj) XQ3.A00(c176807tc2, xq3);
                str = "cameraPreview";
                if (c176877tj2 != null && (docAuthManager2 = (DocAuthManager) AbstractC31171DnF.A0Y(xq3, xq3.A08, XQ3.A0B, 0)) != null) {
                    int i3 = c176877tj2.A02;
                    int i4 = c176877tj2.A01;
                    C9TO c9to4 = xq3.A02;
                    if (c9to4 != null) {
                        int width2 = c9to4.getWidth();
                        C9TO c9to5 = xq3.A02;
                        if (c9to5 != null) {
                            docAuthManager2.onPreviewSizeChanged(i3, i4, width2, c9to5.getHeight());
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (xq3.A05) {
                    C9TO c9to6 = xq3.A02;
                    if (c9to6 != null) {
                        c9to6.A0U.A9g(xq3);
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c177447ue = xq3.A01;
                if (c177447ue == null || (interfaceC1814282u = (InterfaceC1814282u) AbstractC31171DnF.A0Y(xq3, xq3.A09, XQ3.A0B, 1)) == null) {
                    return;
                }
                interfaceC1814282u.DM7(c177447ue);
                return;
            default:
                return;
        }
    }
}
