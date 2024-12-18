package X;

import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import com.facebook.wearable.datax.RemoteChannel;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* loaded from: classes12.dex */
public final class XM9 extends C03E implements InterfaceC16660sJ {
    public final int A00;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public XM9(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L16;
                case 2: goto L19;
                case 3: goto L21;
                case 4: goto L21;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L21;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.XVb> r3 = X.XVb.class
        L8:
            r1 = 1
            java.lang.String r4 = "getBoundedLithoMediaViewHolder"
            java.lang.String r5 = "getBoundedLithoMediaViewHolder(Lcom/instagram/common/ui/widget/zoomcontainer/SimpleZoomableViewContainer;)Lcom/instagram/feed/ui/rows/mediaview/ui/litho/LithoMediaViewHolder;"
        Ld:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.Xh8> r3 = X.Xh8.class
            goto L1b
        L16:
            java.lang.Class<X.XhB> r3 = X.C72573XhB.class
            goto L1b
        L19:
            java.lang.Class<X.XhC> r3 = X.C72574XhC.class
        L1b:
            r1 = 1
            java.lang.String r4 = "deallocateNative"
            java.lang.String r5 = "deallocateNative(J)V"
            goto Ld
        L21:
            java.lang.Class<X.XVc> r3 = X.XVc.class
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XM9.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                Connection.deallocateNative(AbstractC166987dD.A0N(obj));
                break;
            case 1:
                LocalChannel.deallocateNative(AbstractC166987dD.A0N(obj));
                break;
            case 2:
                RemoteChannel.deallocateNative(AbstractC166987dD.A0N(obj));
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) obj;
                return XVc.A04(simpleZoomableViewContainer, (XVc) AbstractC25229BEm.A0o(simpleZoomableViewContainer, this));
            default:
                SimpleZoomableViewContainer simpleZoomableViewContainer2 = (SimpleZoomableViewContainer) obj;
                return XVb.A04(simpleZoomableViewContainer2, (XVb) AbstractC25229BEm.A0o(simpleZoomableViewContainer2, this));
        }
        return C0eB.A00;
    }
}
