package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.instagram.genai.imageutils.MaskUtilsKt;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DRe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30174DRe extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30174DRe(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        switch (i3) {
            case 5:
            case 7:
                this.A04 = iArr;
                this.A02 = i2;
                this.A03 = iArr2;
                break;
            case 6:
            default:
                this.A03 = iArr;
                this.A02 = i2;
                this.A04 = iArr2;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C51747MtW A00;
        switch (this.A00) {
            case 0:
                C5AW c5aw = (C5AW) obj;
                C59W[] c59wArr = (C59W[]) this.A03;
                C28821Cnr c28821Cnr = (C28821Cnr) this.A04;
                int i = this.A02;
                int i2 = this.A01;
                for (C59W c59w : c59wArr) {
                    if (c59w != null) {
                        long AB9 = c28821Cnr.A00.A01.AB9(AnonymousClass583.Ltr, AbstractC119215ad.A00(c59w.A01, c59w.A00), AbstractC119215ad.A00(i, i2));
                        c5aw.A05(c59w, 0.0f, AbstractC25225BEi.A06(AB9), AbstractC25228BEl.A02(AB9));
                    }
                }
                return C0eB.A00;
            case 1:
                C5AW c5aw2 = (C5AW) obj;
                C14360o3.A0B(c5aw2, 0);
                C59W[] c59wArr2 = (C59W[]) this.A03;
                int i3 = this.A02;
                int i4 = this.A01;
                Object obj2 = this.A04;
                for (C59W c59w2 : c59wArr2) {
                    C14360o3.A0C(c59w2, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    c5aw2.A09(c59w2, new C50262MHr(obj2, 32), 0.0f, (i3 - c59w2.A0G()) / 2, (i4 - c59w2.A0F()) / 2);
                }
                return C0eB.A00;
            case 2:
                C5AW c5aw3 = (C5AW) obj;
                C14360o3.A0B(c5aw3, 0);
                float A01 = AbstractC25232BEp.A01((C5Y1) this.A03);
                int i5 = this.A01;
                int i6 = (int) (A01 * i5);
                List<C59W> list = (List) this.A04;
                int i7 = this.A02;
                for (C59W c59w3 : list) {
                    c5aw3.A07(c59w3, (i7 - c59w3.A01) / 2, ((i5 - c59w3.A00) / 2) + i6);
                    i6 += i5;
                }
                return C0eB.A00;
            case 3:
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
                    C73163Pr c73163Pr = (C73163Pr) this.A04;
                    AnonymousClass597.A00(anonymousClass586.A01).drawPicture(picture);
                    c73163Pr.A0W(C0eB.A00);
                    return C0eB.A00;
                } catch (Throwable th) {
                    AbstractC25232BEp.A1I(anonymousClass596, anonymousClass585, AzL, interfaceC1128957x, anonymousClass583);
                    AzL.EeS(j);
                    anonymousClass587.A00 = graphicsLayer;
                    throw th;
                }
            case 4:
                long j2 = ((C119365at) obj).A00;
                long j3 = ((C6KL) ((C6KN) this.A03)).A00;
                int A06 = AbstractC25225BEi.A06(j3);
                int A002 = C119055aN.A00(j3);
                if (A06 != 0 && A002 != 0) {
                    float A012 = C119365at.A01(j2);
                    int i8 = this.A02;
                    float f = i8;
                    float A02 = C119365at.A02(j2);
                    int i9 = this.A01;
                    float f2 = i9;
                    AbstractC25225BEi.A1U(this.A04, new C51760Mtj(17, new PointF(r3.x / f, r3.y / f2), new Point(C17s.A03(C1H4.A01((A012 / A06) * f), 0, i8 - 1), C17s.A03(C1H4.A01((A02 / A002) * f2), 0, i9 - 1)), new Point(C17s.A03(C1H4.A01(A012), 0, A06 - 1), C17s.A03(C1H4.A01(A02), 0, A002 - 1))));
                }
                return C0eB.A00;
            case 5:
                int A0H = AbstractC166987dD.A0H(obj);
                for (int i10 = 0; i10 < this.A01; i10++) {
                    int[] iArr = (int[]) this.A04;
                    int i11 = this.A02;
                    if (iArr[(i11 * i10) + A0H] != MaskUtilsKt.A00) {
                        int[] iArr2 = (int[]) this.A03;
                        int i12 = MaskUtilsKt.A01;
                        iArr2[(i11 * i10) + A0H] = i12;
                        if (A0H > 1) {
                            iArr2[(A0H - 1) + (i11 * i10)] = i12;
                        }
                        if (A0H < i11 - 1) {
                            iArr2[A0H + 1 + (i11 * i10)] = i12;
                        }
                    }
                }
                return C0eB.A00;
            case 6:
                int A0H2 = AbstractC166987dD.A0H(obj);
                int i13 = 0;
                while (true) {
                    int i14 = this.A01;
                    if (i13 >= i14) {
                        return C0eB.A00;
                    }
                    int[] iArr3 = (int[]) this.A03;
                    int i15 = this.A02;
                    if (iArr3[(i15 * i13) + A0H2] != MaskUtilsKt.A00) {
                        int[] iArr4 = (int[]) this.A04;
                        int i16 = MaskUtilsKt.A01;
                        iArr4[(i15 * i13) + A0H2] = i16;
                        if (i13 > 0) {
                            iArr4[((i13 - 1) * i15) + A0H2] = i16;
                        }
                        if (i13 < i14 - 1) {
                            iArr4[((i13 + 1) * i15) + A0H2] = i16;
                        }
                    }
                    i13++;
                }
            case 7:
                int A0H3 = AbstractC166987dD.A0H(obj);
                int i17 = 0;
                while (true) {
                    int i18 = this.A01;
                    if (i17 >= i18) {
                        return C0eB.A00;
                    }
                    int[] iArr5 = (int[]) this.A04;
                    int i19 = this.A02;
                    int i20 = iArr5[(i19 * i17) + A0H3];
                    int i21 = MaskUtilsKt.A00;
                    if (i20 != i21) {
                        int i22 = -1;
                        while (true) {
                            if (i22 < 2) {
                                int i23 = -1;
                                do {
                                    int i24 = i22 + A0H3;
                                    int i25 = i17 + i23;
                                    if (i24 >= 0 && i24 < i19 && i25 >= 0 && i25 < i18 && iArr5[i24 + (i25 * i19)] == i21) {
                                        ((int[]) this.A03)[(i19 * i17) + A0H3] = i21;
                                    } else {
                                        i23++;
                                    }
                                } while (i23 < 2);
                                i22++;
                            }
                        }
                    }
                    i17++;
                }
                break;
            case 8:
                C51747MtW c51747MtW = (C51747MtW) this.A04;
                C128005qU c128005qU = (C128005qU) this.A03;
                int i26 = this.A02;
                int i27 = this.A01;
                AbstractC167017dG.A1N(c51747MtW, c128005qU);
                ArrayList A0U = AbstractC001800i.A0U(c51747MtW.A0H);
                A0U.add(i26, c128005qU);
                C38321qM c38321qM = c51747MtW.A08;
                Integer num = c51747MtW.A0B;
                Map map = c51747MtW.A0I;
                List<AbstractC127945qN> list2 = c128005qU.A02;
                boolean z = false;
                for (AbstractC127945qN abstractC127945qN : list2) {
                    if (abstractC127945qN instanceof C37931GmT) {
                        C37931GmT c37931GmT = (C37931GmT) abstractC127945qN;
                        c37931GmT.A00.A0D(i26);
                        num = Integer.valueOf(i26);
                        c38321qM = c37931GmT.BQN();
                        z = true;
                    }
                }
                if (!z) {
                    map.remove(Integer.valueOf(i26));
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AbstractC25234BEr.A1S(A1E, it);
                }
                ArrayList A0q = AbstractC167017dG.A0q(A1E);
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    AbstractC166997dE.A1R(it2.next(), Integer.valueOf(i27), A0q);
                }
                A00 = C51747MtW.A00(null, null, null, c38321qM, null, null, c51747MtW, null, num, null, null, null, null, null, AbstractC001800i.A0a(A0U), AbstractC06930Yk.A04(c51747MtW.A0J, AbstractC06930Yk.A08(A0q)), map, 0, 0, 32636670, false, false, false, false, false, false);
                return A00;
            default:
                Product A022 = ((ProductFeedItem) this.A04).A02();
                if (A022 != null) {
                    ((JII) this.A03).DbC(A022, this.A02, this.A01);
                }
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30174DRe(Object obj, int i, Object obj2, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = obj2;
    }
}
