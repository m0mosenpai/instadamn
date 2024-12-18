package X;

import com.instagram.igsignals.core.IgSignalsFeature;

/* loaded from: classes8.dex */
public final class MLE extends C0YY implements InterfaceC16660sJ {
    public static final MLE A00 = new MLE();

    public MLE() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IgSignalsFeature igSignalsFeature = (IgSignalsFeature) obj;
        StringBuilder A0x = AbstractC43594JPz.A0x(igSignalsFeature);
        A0x.append('(');
        A0x.append(igSignalsFeature.A01);
        A0x.append(')');
        A0x.append(igSignalsFeature.A02);
        A0x.append(": ");
        A0x.append(igSignalsFeature.A00);
        return A0x.toString();
    }
}
