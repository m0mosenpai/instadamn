package X;

import com.facebook.react.common.mapbuffer.ReadableMapBuffer;

/* loaded from: classes10.dex */
public final class T0L implements InterfaceC65584TnN {
    public final int A00;
    public final /* synthetic */ ReadableMapBuffer A01;

    public T0L(ReadableMapBuffer readableMapBuffer, int i) {
        this.A01 = readableMapBuffer;
        this.A00 = i;
    }

    @Override // X.InterfaceC65584TnN
    public final boolean AhD() {
        A00(EnumC61135Rfp.A02);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        C62156S0d c62156S0d = ReadableMapBuffer.Companion;
        return AbstractC43593JPy.A1Y(readableMapBuffer.buffer.getInt(i));
    }

    @Override // X.InterfaceC65584TnN
    public final double Az9() {
        A00(EnumC61135Rfp.A03);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        C62156S0d c62156S0d = ReadableMapBuffer.Companion;
        return readableMapBuffer.buffer.getDouble(i);
    }

    @Override // X.InterfaceC65584TnN
    public final int BIi() {
        A00(EnumC61135Rfp.A04);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        C62156S0d c62156S0d = ReadableMapBuffer.Companion;
        return readableMapBuffer.buffer.getInt(i);
    }

    @Override // X.InterfaceC65584TnN
    public final int BKS() {
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00;
        C62156S0d c62156S0d = ReadableMapBuffer.Companion;
        return readableMapBuffer.buffer.getShort(i) & 65535;
    }

    @Override // X.InterfaceC65584TnN
    public final long BPC() {
        A00(EnumC61135Rfp.A05);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        C62156S0d c62156S0d = ReadableMapBuffer.Companion;
        return readableMapBuffer.buffer.getLong(i);
    }

    @Override // X.InterfaceC65584TnN
    public final InterfaceC72045XLb BPd() {
        A00(EnumC61135Rfp.A06);
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 4;
        C62156S0d c62156S0d = ReadableMapBuffer.Companion;
        return new ReadableMapBuffer(readableMapBuffer.buffer, readableMapBuffer.offsetToMapBuffer + 8 + (readableMapBuffer.count * 12) + readableMapBuffer.buffer.getInt(i) + 4);
    }

    @Override // X.InterfaceC65584TnN
    public final String C2w() {
        String readStringValue;
        A00(EnumC61135Rfp.A07);
        readStringValue = this.A01.readStringValue(this.A00 + 4);
        return readStringValue;
    }

    private final void A00(EnumC61135Rfp enumC61135Rfp) {
        EnumC61135Rfp CBL = CBL();
        if (enumC61135Rfp == CBL) {
            return;
        }
        StringBuilder A0t = AbstractC58322PtE.A0t();
        A0t.append(enumC61135Rfp);
        A0t.append(" for key: ");
        A0t.append(BKS());
        A0t.append(" found ");
        A0t.append(CBL);
        throw AbstractC58320PtC.A0o(" instead.", A0t);
    }

    @Override // X.InterfaceC65584TnN
    public final EnumC61135Rfp CBL() {
        EnumC61135Rfp[] values = EnumC61135Rfp.values();
        ReadableMapBuffer readableMapBuffer = this.A01;
        int i = this.A00 + 2;
        C62156S0d c62156S0d = ReadableMapBuffer.Companion;
        return values[readableMapBuffer.buffer.getShort(i) & 65535];
    }
}
