package X;

import java.io.DataInput;
import java.io.DataOutput;

/* loaded from: classes10.dex */
public final class SHs {
    public C02950Bt A00;
    public C0RQ A01;
    public final C2AG A03 = new C60940Rbu(this, 0);
    public C24261Gv A02 = C24251Gu.A00(841047303).A01();

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0CF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0CF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0CF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0CF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0CF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0CF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0CF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0CF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0RQ] */
    public SHs(C02950Bt c02950Bt) {
        this.A00 = c02950Bt;
        ?? r2 = new C0CF() { // from class: X.0RQ
            public final C005001p A02 = new C005001p(0);
            public final C005001p A01 = new C005001p(0);
            public final C005001p A00 = new C005001p(0);

            @Override // X.C0CF
            public final long A00() {
                return -3137023965338009377L;
            }

            @Override // X.C0CF
            public final /* bridge */ /* synthetic */ void A01(AbstractC02960Bu abstractC02960Bu, DataOutput dataOutput) {
                C0XO c0xo = (C0XO) abstractC02960Bu;
                C005001p c005001p = this.A02;
                int size = c005001p.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    if (c0xo.A08((Class) c005001p.A05(i2))) {
                        i++;
                    }
                }
                dataOutput.writeInt(i);
                for (int i3 = 0; i3 < size; i3++) {
                    Class cls = (Class) c005001p.A05(i3);
                    if (c0xo.A08(cls)) {
                        C0CF c0cf = (C0CF) c005001p.A06(i3);
                        dataOutput.writeLong(c0cf.A00());
                        c0cf.A01(c0xo.A04(cls), dataOutput);
                    }
                }
            }

            @Override // X.C0CF
            public final /* bridge */ /* synthetic */ boolean A02(AbstractC02960Bu abstractC02960Bu, DataInput dataInput) {
                C0XO c0xo = (C0XO) abstractC02960Bu;
                C005001p c005001p = c0xo.A00;
                int size = c005001p.size();
                for (int i = 0; i < size; i++) {
                    c0xo.A07((Class) c005001p.A05(i), false);
                }
                int readInt = dataInput.readInt();
                for (int i2 = 0; i2 < readInt; i2++) {
                    long readLong = dataInput.readLong();
                    C005001p c005001p2 = this.A01;
                    Long valueOf = Long.valueOf(readLong);
                    C0CF c0cf = (C0CF) c005001p2.get(valueOf);
                    Class cls = (Class) this.A00.get(valueOf);
                    if (c0cf != null && cls != null && c0cf.A02(c0xo.A04(cls), dataInput)) {
                        c0xo.A07(cls, true);
                    } else {
                        return false;
                    }
                }
                return true;
            }

            public final void A03(C0CF c0cf, Class cls) {
                C005001p c005001p = this.A00;
                long A00 = c0cf.A00();
                Long valueOf = Long.valueOf(A00);
                Class cls2 = (Class) c005001p.get(valueOf);
                if (cls2 != null && cls2 != cls) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Serializers ");
                    sb.append(cls2.getCanonicalName());
                    sb.append(" and ");
                    sb.append(cls.getCanonicalName());
                    sb.append(" have a conflicting tag: `");
                    sb.append(A00);
                    sb.append("`.");
                    throw new RuntimeException(sb.toString());
                }
                this.A02.put(cls, c0cf);
                this.A01.put(valueOf, c0cf);
                c005001p.put(valueOf, cls);
            }
        };
        r2.A03(new Object(), C0YK.class);
        r2.A03(new Object(), C0WB.class);
        r2.A03(new Object(), C0VK.class);
        r2.A03(new Object(), C06130Ud.class);
        r2.A03(new Object(), C05660Rq.class);
        r2.A03(new Object(), C05680Rs.class);
        r2.A03(new Object(), C0SO.class);
        r2.A03(new Object(), C06340Va.class);
        this.A01 = r2;
    }
}
