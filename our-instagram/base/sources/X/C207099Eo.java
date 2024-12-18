package X;

/* renamed from: X.9Eo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207099Eo extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207099Eo(C160747Ii c160747Ii, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A03 = c160747Ii;
        switch (i3) {
            case 0:
            case 1:
            case 3:
                this.A02 = i;
                this.A01 = i2;
                break;
            case 2:
            default:
                this.A01 = i;
                this.A02 = i2;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((C160747Ii) this.A03).A01.notifyItemRangeChanged(this.A02, this.A01);
                return C0eB.A00;
            case 1:
                ((C160747Ii) this.A03).A01.notifyItemRangeInserted(this.A02, this.A01);
                return C0eB.A00;
            case 2:
                ((C160747Ii) this.A03).A01.notifyItemMoved(this.A01, this.A02);
                return C0eB.A00;
            case 3:
                ((C160747Ii) this.A03).A01.notifyItemRangeRemoved(this.A02, this.A01);
                return C0eB.A00;
            case 4:
                EnumC54222eY enumC54222eY = EnumC54222eY.A09;
                int i = this.A02;
                C54432ex c54432ex = new C54432ex(enumC54222eY, null, i, i);
                EnumC54222eY enumC54222eY2 = EnumC54222eY.A0I;
                int i2 = this.A01;
                return C54412ev.A00(AbstractC16960so.A1Q(c54432ex, new C54432ex(enumC54222eY2, null, i2, i2)), C126835oN.A00);
            default:
                C4QT c4qt = ((AbstractC97724aA) this.A03).A00;
                C4SE c4se = c4qt.A0O;
                if (c4se != null && c4qt.A0M == C3Q0.PLAYING) {
                    C95264Qm c95264Qm = c4qt.A0o;
                    C4S7 c4s7 = c4se.A0B;
                    c95264Qm.EIq(C4QT.A00(c4s7, c4qt), c4s7.A03);
                }
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207099Eo(Object obj, int i, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
    }
}
