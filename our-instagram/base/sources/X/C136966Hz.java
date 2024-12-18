package X;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.6Hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136966Hz extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ EnumC136916Hu A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16610sE A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C136966Hz(EnumC136916Hu enumC136916Hu, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16610sE interfaceC16610sE, float f, int i, boolean z) {
        super(3);
        this.A06 = z;
        this.A01 = i;
        this.A02 = enumC136916Hu;
        this.A00 = f;
        this.A03 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A05 = interfaceC16610sE;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC16820sZ interfaceC16820sZ;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C5Tl c5Tl = (C5Tl) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            int i = 2;
            if (c5Tl.AH5(booleanValue)) {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1610017027, "com.instagram.barcelona.feed.post.ui.SingleMedia.<anonymous> (PostSingleMedia.kt:513)");
            }
            boolean z = this.A06;
            int i2 = 450;
            if (!z) {
                i2 = 520;
            }
            float f = i2;
            int i3 = this.A01;
            if (i3 > 0) {
                float f2 = i3;
                if (f > f2) {
                    f = f2;
                }
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) C5UT.A01(AbstractC117935Vd.A00, C117505Tk.A04(c117505Tk));
            c5Tl.Eno(1695192028);
            Modifier modifier = Modifier.A00;
            int i4 = 100;
            float f3 = 100.0f;
            if (!z) {
                f3 = 116.0f;
            }
            if (this.A02 != EnumC136916Hu.A04) {
                i4 = 60;
            }
            Modifier Eq3 = AbstractC118185Wd.A0I(modifier, f3, i4, Float.NaN, f).Eq3(new C6I5(C5XU.A00, this.A00));
            long j = C5XL.A00(c5Tl).A0d;
            C5XL.A02(c5Tl);
            Modifier A03 = C6L7.A03(Eq3, C5WE.A01, 0.0f, j);
            if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36327593599318737L)) {
                A03 = A03.Eq3(new DraggableElement(BG5.A00(c5Tl, B9A.A00), C6M3.Horizontal, null, BG5.A00, BG5.A01, true, false));
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(1695205327);
            if (!booleanValue && (interfaceC16820sZ = this.A03) != null) {
                InterfaceC16820sZ interfaceC16820sZ2 = this.A04;
                if (interfaceC16820sZ2 != null) {
                    c5Tl.Eno(1011838869);
                    modifier = C6I6.A01(c5Tl, modifier, interfaceC16820sZ2, interfaceC16820sZ);
                } else {
                    c5Tl.Eno(1012065014);
                    modifier = C6I6.A00(c5Tl, modifier, interfaceC16820sZ);
                }
                C117505Tk.A0L(c117505Tk, false);
            }
            C117505Tk.A0L(c117505Tk, false);
            Modifier Eq32 = A03.Eq3(modifier);
            InterfaceC16610sE interfaceC16610sE = this.A05;
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0E, false);
            int A002 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, Eq32);
            InterfaceC16820sZ interfaceC16820sZ3 = C5X8.A00;
            c5Tl.Ent();
            if (c117505Tk.A0K) {
                c5Tl.AMd(interfaceC16820sZ3);
            } else {
                c5Tl.FDO();
            }
            C5XJ.A00(c5Tl, A00, C5X8.A03);
            C5XJ.A00(c5Tl, A04, C5X8.A05);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A002))) {
                Integer valueOf = Integer.valueOf(A002);
                c5Tl.FBy(valueOf);
                c5Tl.ABx(valueOf, interfaceC16620sF);
            }
            C5XJ.A00(c5Tl, A01, C5X8.A04);
            interfaceC16610sE.invoke(C119645bN.A00, c5Tl, 6);
            C117505Tk.A0L(c117505Tk, true);
            if (C0fH.A02()) {
                C0fH.A00(1618336568);
            }
        }
        return C0eB.A00;
    }
}
