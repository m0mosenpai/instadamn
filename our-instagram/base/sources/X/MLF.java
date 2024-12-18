package X;

import com.instagram.igsignals.core.IgSignalsFeature;

/* loaded from: classes8.dex */
public final class MLF extends C0YY implements InterfaceC16660sJ {
    public static final MLF A00 = new MLF();

    public MLF() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IgSignalsFeature igSignalsFeature = (IgSignalsFeature) obj;
        StringBuilder A0x = AbstractC43594JPz.A0x(igSignalsFeature);
        A0x.append(igSignalsFeature.A02);
        A0x.append(':');
        A0x.append(igSignalsFeature.A00);
        return A0x.toString();
    }
}
