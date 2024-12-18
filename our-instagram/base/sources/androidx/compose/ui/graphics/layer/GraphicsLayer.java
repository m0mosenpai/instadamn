package androidx.compose.ui.graphics.layer;

import X.AbstractC004901o;
import X.AbstractC119215ad;
import X.AbstractC119385av;
import X.AbstractC137636Lj;
import X.AbstractC137666Lm;
import X.AbstractC224329vJ;
import X.AnonymousClass581;
import X.AnonymousClass583;
import X.C114205Dh;
import X.C119305an;
import X.C119325ap;
import X.C119335aq;
import X.C119365at;
import X.C119375au;
import X.C119405ax;
import X.C18570vk;
import X.C5AO;
import X.C5YC;
import X.C60X;
import X.C60Y;
import X.C6Ln;
import X.InterfaceC1128957x;
import X.InterfaceC119295al;
import X.InterfaceC119315ao;
import X.InterfaceC16660sJ;
import android.graphics.Outline;
import android.os.Build;

/* loaded from: classes3.dex */
public final class GraphicsLayer {
    public static final InterfaceC119315ao A0K = C119305an.A00;
    public float A00;
    public int A01;
    public long A02;
    public long A05;
    public long A06;
    public Outline A07;
    public C5AO A08;
    public C60Y A09;
    public C60Y A0A;
    public boolean A0E;
    public boolean A0G;
    public AbstractC119385av A0H;
    public final InterfaceC119295al A0J;
    public InterfaceC1128957x A0B = AnonymousClass581.A00;
    public AnonymousClass583 A0C = AnonymousClass583.Ltr;
    public InterfaceC16660sJ A0D = C119325ap.A00;
    public boolean A0F = true;
    public long A04 = 0;
    public long A03 = 9205357640488583168L;
    public final C119335aq A0I = new Object();

    public static final void A03(GraphicsLayer graphicsLayer) {
        graphicsLayer.A0H = null;
        graphicsLayer.A09 = null;
        graphicsLayer.A03 = 9205357640488583168L;
        graphicsLayer.A04 = 0L;
        graphicsLayer.A00 = 0.0f;
        graphicsLayer.A0F = true;
        graphicsLayer.A0G = false;
    }

    public static final void A00(GraphicsLayer graphicsLayer) {
        Outline outline;
        if (graphicsLayer.A0F) {
            InterfaceC119295al interfaceC119295al = graphicsLayer.A0J;
            if (!interfaceC119295al.Ao4() && interfaceC119295al.Bu4() <= 0.0f) {
                outline = null;
            } else {
                C60Y c60y = graphicsLayer.A09;
                if (c60y != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i <= 28 && !((C60X) c60y).A03.isConvex()) {
                        Outline outline2 = graphicsLayer.A07;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        outline = null;
                        graphicsLayer.A0G = true;
                    } else {
                        outline = graphicsLayer.A07;
                        if (outline == null) {
                            outline = new Outline();
                            graphicsLayer.A07 = outline;
                        }
                        if (i >= 30) {
                            AbstractC224329vJ.A00(outline, c60y);
                        } else if (c60y instanceof C60X) {
                            outline.setConvexPath(((C60X) c60y).A03);
                        } else {
                            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                        }
                        graphicsLayer.A0G = !outline.canClip();
                    }
                    graphicsLayer.A09 = c60y;
                    graphicsLayer.A05(interfaceC119295al.AbP());
                } else {
                    outline = graphicsLayer.A07;
                    if (outline == null) {
                        outline = new Outline();
                        graphicsLayer.A07 = outline;
                    }
                    long A01 = AbstractC119215ad.A01(graphicsLayer.A05);
                    long j = graphicsLayer.A04;
                    long j2 = graphicsLayer.A03;
                    if (j2 != 9205357640488583168L) {
                        A01 = j2;
                    }
                    float A012 = C119365at.A01(j);
                    int round = Math.round(A012);
                    float A02 = C119365at.A02(j);
                    outline.setRoundRect(round, Math.round(A02), Math.round(A012 + C5YC.A02(A01)), Math.round(A02 + C5YC.A00(A01)), graphicsLayer.A00);
                    outline.setAlpha(interfaceC119295al.AbP());
                }
            }
            interfaceC119295al.EaL(outline);
        }
        graphicsLayer.A0F = false;
    }

    public static final void A01(GraphicsLayer graphicsLayer) {
        if (graphicsLayer.A0E && graphicsLayer.A01 == 0) {
            C119335aq c119335aq = graphicsLayer.A0I;
            GraphicsLayer graphicsLayer2 = c119335aq.A02;
            if (graphicsLayer2 != null) {
                graphicsLayer2.A01--;
                A01(graphicsLayer2);
                c119335aq.A02 = null;
            }
            C18570vk c18570vk = c119335aq.A00;
            if (c18570vk != null) {
                Object[] objArr = c18570vk.A03;
                long[] jArr = c18570vk.A02;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r1.A01--;
                                    A01((GraphicsLayer) objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                c18570vk.A05();
            }
            graphicsLayer.A0J.APb();
        }
    }

    public static final void A02(GraphicsLayer graphicsLayer) {
        C119335aq c119335aq = graphicsLayer.A0I;
        c119335aq.A03 = c119335aq.A02;
        C18570vk c18570vk = c119335aq.A00;
        if (c18570vk != null && c18570vk.A01 != 0) {
            C18570vk c18570vk2 = c119335aq.A01;
            if (c18570vk2 == null) {
                C18570vk c18570vk3 = AbstractC004901o.A00;
                c18570vk2 = new C18570vk(6);
                c119335aq.A01 = c18570vk2;
            }
            c18570vk2.A07(c18570vk);
            c18570vk.A05();
        }
        c119335aq.A04 = true;
        graphicsLayer.A0J.ECN(graphicsLayer.A0B, graphicsLayer.A0C, graphicsLayer, graphicsLayer.A0D);
        c119335aq.A04 = false;
        GraphicsLayer graphicsLayer2 = c119335aq.A03;
        if (graphicsLayer2 != null) {
            graphicsLayer2.A01--;
            A01(graphicsLayer2);
        }
        C18570vk c18570vk4 = c119335aq.A01;
        if (c18570vk4 != null && c18570vk4.A01 != 0) {
            Object[] objArr = c18570vk4.A03;
            long[] jArr = c18570vk4.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                r1.A01--;
                                A01((GraphicsLayer) objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            c18570vk4.A05();
        }
    }

    public final AbstractC119385av A04() {
        AbstractC119385av abstractC119385av = this.A0H;
        C60Y c60y = this.A09;
        if (abstractC119385av == null) {
            if (c60y != null) {
                abstractC119385av = new C119405ax(c60y);
            } else {
                long A01 = AbstractC119215ad.A01(this.A05);
                long j = this.A04;
                long j2 = this.A03;
                if (j2 != 9205357640488583168L) {
                    A01 = j2;
                }
                float A012 = C119365at.A01(j);
                float A02 = C119365at.A02(j);
                float A022 = A012 + C5YC.A02(A01);
                float A00 = A02 + C5YC.A00(A01);
                float f = this.A00;
                if (f > 0.0f) {
                    abstractC119385av = new C6Ln(AbstractC137666Lm.A00(A012, A02, A022, A00, AbstractC137636Lj.A00(f, f)));
                } else {
                    abstractC119385av = new C119375au(new C114205Dh(A012, A02, A022, A00));
                }
            }
            this.A0H = abstractC119385av;
        }
        return abstractC119385av;
    }

    public final void A05(float f) {
        InterfaceC119295al interfaceC119295al = this.A0J;
        if (interfaceC119295al.AbP() != f) {
            interfaceC119295al.EPa(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.5aq, java.lang.Object] */
    public GraphicsLayer(InterfaceC119295al interfaceC119295al) {
        this.A0J = interfaceC119295al;
        interfaceC119295al.ERU(false);
        this.A06 = 0L;
        this.A05 = 0L;
        this.A02 = 9205357640488583168L;
    }
}
