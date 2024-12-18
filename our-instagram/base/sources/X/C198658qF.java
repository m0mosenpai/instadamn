package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.8qF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198658qF extends AbstractC198678qH {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC199548s4 A03;
    public boolean A04;
    public final C198708qO A05;
    public final C198688qJ A06;
    public final C198718qR A07;
    public final AbstractC179397xp A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;

    public C198658qF(InterfaceC198588q7 interfaceC198588q7, C198548q3 c198548q3, AbstractC179397xp abstractC179397xp, C198508pz c198508pz, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(null);
        this.A00 = -1;
        this.A02 = -1;
        this.A01 = -1;
        this.A04 = true;
        this.A0B = z4;
        this.A0A = z;
        this.A08 = abstractC179397xp;
        this.A00 = i;
        C198688qJ c198688qJ = new C198688qJ();
        this.A06 = c198688qJ;
        C198708qO c198708qO = new C198708qO();
        this.A05 = c198708qO;
        this.A09 = Arrays.asList(c198688qJ, c198708qO);
        this.A07 = new C198718qR(interfaceC198588q7, c198548q3, c198508pz, z2, z5, z3);
    }
}
