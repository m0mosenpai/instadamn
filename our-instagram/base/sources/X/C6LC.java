package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6LC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LC extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6KV A02;
    public final /* synthetic */ InterfaceC118075Vr A03;
    public final /* synthetic */ C5XO A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C5AH A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16620sF A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6LC(C6KV c6kv, InterfaceC118075Vr interfaceC118075Vr, C5XO c5xo, Modifier modifier, C5AH c5ah, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, float f, long j, boolean z) {
        super(2);
        this.A05 = modifier;
        this.A00 = f;
        this.A06 = c5ah;
        this.A02 = c6kv;
        this.A01 = j;
        this.A07 = interfaceC16820sZ;
        this.A04 = c5xo;
        this.A03 = interfaceC118075Vr;
        this.A0A = z;
        this.A08 = interfaceC16820sZ2;
        this.A09 = interfaceC16620sF;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Modifier modifier;
        Modifier A00;
        C5Tl c5Tl = (C5Tl) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(273755864, "com.meta.compose.material.surface.Surface.<anonymous> (Surface.kt:118)");
            }
            Modifier modifier2 = this.A05;
            float f = this.A00;
            int compare = Float.compare(f, 0.0f);
            Modifier modifier3 = Modifier.A00;
            if (compare > 0) {
                C5AH c5ah = this.A06;
                long j = AbstractC1132259k.A00;
                modifier3 = AbstractC28015CWn.A01(modifier3, c5ah, f, j, j, false);
            }
            Modifier Eq3 = modifier2.Eq3(modifier3);
            C6KV c6kv = this.A02;
            if (c6kv != null) {
                modifier = C6L7.A01(c6kv, modifier3, this.A06);
            } else {
                modifier = modifier3;
            }
            Modifier Eq32 = Eq3.Eq3(modifier);
            long j2 = this.A01;
            C5AH c5ah2 = this.A06;
            Modifier A01 = C6L2.A01(AnonymousClass598.A00(C6L3.A01(Eq32, c5ah2, j2), C6LD.A00, false), c5ah2);
            InterfaceC16820sZ interfaceC16820sZ = this.A07;
            if (interfaceC16820sZ != null) {
                Modifier A002 = AnonymousClass598.A00(modifier3, DQ8.A00, true);
                C5XO c5xo = this.A04;
                A00 = C5XR.A01(this.A03, c5xo, A002, new C5XQ(0), this.A08, null, interfaceC16820sZ, this.A0A);
            } else {
                A00 = C6KX.A00(AnonymousClass598.A00(modifier3, C6LE.A00, false), C0eB.A00, new C206579Co(2, null));
            }
            Modifier Eq33 = A01.Eq3(A00);
            InterfaceC16620sF interfaceC16620sF = this.A09;
            InterfaceC1127857k A003 = C5XX.A00(C118195Wf.A0E, true);
            int A004 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, Eq33);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            c5Tl.Ent();
            if (c117505Tk.A0K) {
                c5Tl.AMd(interfaceC16820sZ2);
            } else {
                c5Tl.FDO();
            }
            C5XJ.A00(c5Tl, A003, C5X8.A03);
            C5XJ.A00(c5Tl, A04, C5X8.A05);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A004))) {
                Integer valueOf = Integer.valueOf(A004);
                c5Tl.FBy(valueOf);
                c5Tl.ABx(valueOf, interfaceC16620sF2);
            }
            C5XJ.A00(c5Tl, A012, C5X8.A04);
            interfaceC16620sF.invoke(c5Tl, 0);
            C117505Tk.A0L(c117505Tk, true);
            if (C0fH.A02()) {
                C0fH.A00(1187602791);
            }
        }
        return C0eB.A00;
    }
}
