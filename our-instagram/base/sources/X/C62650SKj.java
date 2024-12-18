package X;

import java.nio.charset.Charset;

/* renamed from: X.SKj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62650SKj {
    public final C60802RTn A00;

    public final void A00(InterfaceC65595Tne fieldNumber, Object value, int schema) {
        C60802RTn c60802RTn = this.A00;
        AbstractC58532Px0 abstractC58532Px0 = (AbstractC58532Px0) value;
        AbstractC63351Si8.A04(c60802RTn, schema);
        c60802RTn.A04(abstractC58532Px0.A0C(fieldNumber));
        fieldNumber.FEp(c60802RTn.A01, abstractC58532Px0);
    }

    public C62650SKj(C60802RTn output) {
        Charset charset = AbstractC62398S9x.A04;
        this.A00 = output;
        output.A01 = this;
    }
}
