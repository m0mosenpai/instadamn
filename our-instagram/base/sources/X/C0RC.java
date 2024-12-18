package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.0RC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RC extends C0CF {
    @Override // X.C0CF
    public final long A00() {
        return -153197510099727452L;
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ void A01(AbstractC02960Bu abstractC02960Bu, DataOutput dataOutput) {
        C05660Rq c05660Rq = (C05660Rq) abstractC02960Bu;
        C14360o3.A0B(c05660Rq, 0);
        C14360o3.A0B(dataOutput, 1);
        dataOutput.writeLong(c05660Rq.A01);
        dataOutput.writeLong(c05660Rq.A00);
        dataOutput.writeBoolean(c05660Rq.A02);
        if (c05660Rq.A02) {
            C005001p c005001p = c05660Rq.A03;
            int size = c005001p.size();
            dataOutput.writeInt(size);
            for (int i = 0; i < size; i++) {
                String str = (String) c005001p.A05(i);
                Number number = (Number) c005001p.A06(i);
                dataOutput.writeInt(str.length());
                dataOutput.writeChars(str);
                C14360o3.A0A(number);
                dataOutput.writeLong(number.longValue());
            }
        }
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ boolean A02(AbstractC02960Bu abstractC02960Bu, DataInput dataInput) {
        C05660Rq c05660Rq = (C05660Rq) abstractC02960Bu;
        C14360o3.A0B(c05660Rq, 0);
        C14360o3.A0B(dataInput, 1);
        C005001p c005001p = c05660Rq.A03;
        c005001p.clear();
        c05660Rq.A01 = dataInput.readLong();
        c05660Rq.A00 = dataInput.readLong();
        boolean readBoolean = dataInput.readBoolean();
        c05660Rq.A02 = readBoolean;
        if (readBoolean) {
            int readInt = dataInput.readInt();
            for (int i = 0; i < readInt; i++) {
                int readInt2 = dataInput.readInt();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < readInt2; i2++) {
                    sb.append(dataInput.readChar());
                }
                c005001p.put(sb.toString(), Long.valueOf(dataInput.readLong()));
            }
        }
        return true;
    }
}
