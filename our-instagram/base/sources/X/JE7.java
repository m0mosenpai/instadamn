package X;

/* loaded from: classes7.dex */
public final class JE7 extends C0YY implements InterfaceC16660sJ {
    public static final JE7 A00 = new JE7();

    public JE7() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        JLC jlc = (JLC) obj;
        C14360o3.A0B(jlc, 0);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoHighlight(startTs=");
        A1C.append(jlc.Bzr());
        A1C.append(", endTs=");
        A1C.append(jlc.B2B());
        A1C.append(", highlightText=");
        return AbstractC25236BEt.A0Y(jlc.BE7(), A1C);
    }
}
