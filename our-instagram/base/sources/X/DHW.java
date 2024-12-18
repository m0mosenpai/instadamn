package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Picture;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.instagram.genai.imageutils.MaskUtilsKt;

/* loaded from: classes5.dex */
public final class DHW extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHW(Object obj, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5AW c5aw;
        C59W c59w;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                ((C5AW) obj).A0B((C59W) this.A03, C5AS.A01, this.A01, this.A02);
                return C0eB.A00;
            case 1:
                c5aw = (C5AW) obj;
                c59w = (C59W) this.A03;
                i = this.A01;
                i2 = this.A02;
                c5aw.A05(c59w, 0.0f, i, i2);
                return C0eB.A00;
            case 2:
                throw AbstractC166987dD.A15("setName");
            case 3:
                c5aw = (C5AW) obj;
                c59w = (C59W) this.A03;
                i = -this.A01;
                i2 = -this.A02;
                c5aw.A05(c59w, 0.0f, i, i2);
                return C0eB.A00;
            case 4:
                C82713mZ c82713mZ = (C82713mZ) obj;
                C14360o3.A0B(c82713mZ, 0);
                C32U.A0Z(c82713mZ, ((C120985dq) this.A03).A06(), this.A01);
                c82713mZ.A3I = Integer.valueOf(this.A02);
                return C0eB.A00;
            case 5:
                InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
                C14360o3.A0B(interfaceC1129057z, 0);
                Picture picture = (Picture) this.A03;
                Canvas beginRecording = picture.beginRecording(this.A02, this.A01);
                C14360o3.A07(beginRecording);
                Canvas canvas = AnonymousClass597.A00;
                AnonymousClass596 anonymousClass596 = new AnonymousClass596();
                anonymousClass596.A00 = beginRecording;
                AnonymousClass583 layoutDirection = interfaceC1129057z.getLayoutDirection();
                long Bxc = interfaceC1129057z.Bxc();
                AnonymousClass588 AzL = interfaceC1129057z.AzL();
                AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
                AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
                InterfaceC1128957x interfaceC1128957x = anonymousClass586.A02;
                AnonymousClass583 anonymousClass583 = anonymousClass586.A03;
                AnonymousClass585 anonymousClass585 = anonymousClass586.A01;
                long j = anonymousClass586.A00;
                GraphicsLayer graphicsLayer = anonymousClass587.A00;
                AzL.ETE(interfaceC1129057z);
                AzL.EY4(layoutDirection);
                AzL.ERA(anonymousClass596);
                AzL.EeS(Bxc);
                anonymousClass587.A00 = null;
                anonymousClass596.ELZ();
                try {
                    interfaceC1129057z.AQf();
                    AbstractC25232BEp.A1I(anonymousClass596, anonymousClass585, AzL, interfaceC1128957x, anonymousClass583);
                    AzL.EeS(j);
                    anonymousClass587.A00 = graphicsLayer;
                    picture.endRecording();
                    AnonymousClass597.A00(anonymousClass586.A01).drawPicture(picture);
                    return C0eB.A00;
                } catch (Throwable th) {
                    AbstractC25232BEp.A1I(anonymousClass596, anonymousClass585, AzL, interfaceC1128957x, anonymousClass583);
                    AzL.EeS(j);
                    anonymousClass587.A00 = graphicsLayer;
                    throw th;
                }
            case 6:
                int A0H = AbstractC166987dD.A0H(obj);
                for (int i3 = 0; i3 < this.A01; i3++) {
                    int i4 = (this.A02 * i3) + A0H;
                    int[] iArr = (int[]) this.A03;
                    int i5 = 0;
                    if (iArr[i4] == MaskUtilsKt.A01) {
                        i5 = -1;
                    }
                    iArr[i4] = i5;
                }
                return C0eB.A00;
            default:
                int A0H2 = AbstractC166987dD.A0H(obj);
                for (int i6 = 0; i6 < this.A01; i6++) {
                    int i7 = (this.A02 * i6) + A0H2;
                    int[] iArr2 = (int[]) this.A03;
                    int i8 = (iArr2[i7] >> 16) & 255;
                    int i9 = MaskUtilsKt.A00;
                    iArr2[i7] = Color.argb(i8, 0, 0, 0);
                }
                return C0eB.A00;
        }
    }
}
