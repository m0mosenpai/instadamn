package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes10.dex */
public final class QoE extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0i = AbstractC166987dD.A0i(C94754Oe.A01(), "days");
        C94894Ou c94894Ou = C94894Ou.A00;
        return AbstractC58320PtC.A0U(c94894Ou, A0i, AbstractC166987dD.A0i(c94894Ou, "end_time"), AbstractC166987dD.A0i(c94754Oe, "label"), TraceFieldType.StartTime);
    }

    public QoE(int i) {
        super(i);
    }

    public QoE() {
        super(1190652765);
    }
}
