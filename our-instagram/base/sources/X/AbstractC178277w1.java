package X;

/* renamed from: X.7w1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC178277w1 implements InterfaceC178287w2 {
    public InterfaceC178207vu A00;
    public boolean A01;

    public final Object A06(C178037vc c178037vc) {
        Object AqG = this.A00.AqG(c178037vc);
        if (AqG != null) {
            return AqG;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Configuration is not available: ");
        sb.append(c178037vc);
        throw new IllegalArgumentException(sb.toString());
    }
}
