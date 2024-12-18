package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.Cfb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28373Cfb {
    public static final long A0G = AbstractC113765Bo.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
    public long A00;
    public long A01;
    public long A02;
    public C5Y5 A03;
    public GraphicsLayer A04;
    public boolean A05;
    public final C5Y1 A06;
    public final C5Y1 A07;
    public final InterfaceC74953Yl A08;
    public final InterfaceC74953Yl A09;
    public final InterfaceC74953Yl A0A;
    public final InterfaceC74953Yl A0B;
    public final InterfaceC74953Yl A0C;
    public final InterfaceC16820sZ A0D;
    public final C19L A0E;
    public final C5BH A0F;

    public static final void A00(C28373Cfb c28373Cfb, long j) {
        c28373Cfb.A0C.Egh(new C119235af(j));
    }

    public final void A01() {
        GraphicsLayer graphicsLayer = this.A04;
        this.A08.getValue();
        if (AbstractC25230BEn.A1X(this.A0A)) {
            if (graphicsLayer != null) {
                graphicsLayer.A05(1.0f);
            }
            AbstractC25231BEo.A1I(this, this.A0E, 10);
        }
    }

    public final void A02() {
        if (AbstractC25230BEn.A1X(this.A0B)) {
            AbstractC25231BEo.A1I(this, this.A0E, 11);
        }
    }

    public final void A03() {
        C5BH c5bh;
        InterfaceC74953Yl interfaceC74953Yl = this.A0B;
        if (AbstractC25230BEn.A1X(interfaceC74953Yl)) {
            AbstractC25227BEk.A1A(interfaceC74953Yl, false);
            AbstractC25231BEo.A1I(this, this.A0E, 12);
        }
        InterfaceC74953Yl interfaceC74953Yl2 = this.A08;
        if (AbstractC25230BEn.A1X(interfaceC74953Yl2)) {
            AbstractC25227BEk.A1A(interfaceC74953Yl2, false);
            AbstractC25231BEo.A1I(this, this.A0E, 13);
        }
        InterfaceC74953Yl interfaceC74953Yl3 = this.A0A;
        if (AbstractC25230BEn.A1X(interfaceC74953Yl3)) {
            AbstractC25227BEk.A1A(interfaceC74953Yl3, false);
            AbstractC25231BEo.A1I(this, this.A0E, 14);
        }
        this.A05 = false;
        A00(this, 0L);
        this.A02 = A0G;
        GraphicsLayer graphicsLayer = this.A04;
        if (graphicsLayer != null && (c5bh = this.A0F) != null) {
            c5bh.EEH(graphicsLayer);
        }
        this.A04 = null;
        this.A03 = null;
    }

    public final boolean A04() {
        return AbstractC25230BEn.A1X(this.A0A);
    }

    public C28373Cfb(C5BH c5bh, InterfaceC16820sZ interfaceC16820sZ, C19L c19l) {
        GraphicsLayer graphicsLayer;
        this.A0E = c19l;
        this.A0F = c5bh;
        this.A0D = interfaceC16820sZ;
        Boolean A0a = AbstractC166997dE.A0a();
        this.A0B = AbstractC25230BEn.A0U(A0a);
        this.A08 = AbstractC25229BEm.A0R(A0a);
        this.A0A = AbstractC25229BEm.A0R(A0a);
        this.A09 = AbstractC25229BEm.A0R(A0a);
        long j = A0G;
        this.A02 = j;
        this.A00 = 0L;
        if (c5bh != null) {
            graphicsLayer = c5bh.AMJ();
        } else {
            graphicsLayer = null;
        }
        this.A04 = graphicsLayer;
        this.A06 = new C5Y1(AbstractC118445Xg.A03, new C119235af(0L), null);
        this.A07 = new C5Y1(AbstractC118445Xg.A02, AbstractC25227BEk.A0m(), null);
        this.A0C = AbstractC25229BEm.A0R(new C119235af(0L));
        this.A01 = j;
    }
}
