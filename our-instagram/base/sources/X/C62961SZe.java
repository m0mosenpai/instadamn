package X;

import android.graphics.PointF;

/* renamed from: X.SZe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C62961SZe {
    public AbstractC63308ShE A00;
    public Object A01;
    public final C62611SIt A02;

    public Object A00(C62611SIt c62611SIt) {
        Object obj;
        if (this instanceof C58813QAw) {
            C58813QAw c58813QAw = (C58813QAw) this;
            C62611SIt c62611SIt2 = c58813QAw.A02;
            float f = c62611SIt.A04;
            float f2 = c62611SIt.A00;
            String str = ((SN0) c62611SIt.A06).A0B;
            String str2 = ((SN0) c62611SIt.A05).A0B;
            float f3 = c62611SIt.A02;
            float f4 = c62611SIt.A01;
            float f5 = c62611SIt.A03;
            c62611SIt2.A04 = f;
            c62611SIt2.A00 = f2;
            c62611SIt2.A06 = str;
            c62611SIt2.A05 = str2;
            c62611SIt2.A02 = f3;
            c62611SIt2.A01 = f4;
            c62611SIt2.A03 = f5;
            String str3 = (String) c58813QAw.A03.A00(c62611SIt2);
            if (c62611SIt.A01 == 1.0f) {
                obj = c62611SIt.A05;
            } else {
                obj = c62611SIt.A06;
            }
            SN0 sn0 = (SN0) obj;
            SN0 sn02 = c58813QAw.A01;
            String str4 = sn0.A0A;
            float f6 = sn0.A02;
            Integer num = sn0.A09;
            int i = sn0.A06;
            float f7 = sn0.A01;
            float f8 = sn0.A00;
            int i2 = sn0.A04;
            int i3 = sn0.A05;
            float f9 = sn0.A03;
            boolean z = sn0.A0C;
            PointF pointF = sn0.A07;
            PointF pointF2 = sn0.A08;
            sn02.A0B = str3;
            sn02.A0A = str4;
            sn02.A02 = f6;
            sn02.A09 = num;
            sn02.A06 = i;
            sn02.A01 = f7;
            sn02.A00 = f8;
            sn02.A04 = i2;
            sn02.A05 = i3;
            sn02.A03 = f9;
            sn02.A0C = z;
            sn02.A07 = pointF;
            sn02.A08 = pointF2;
            return sn02;
        }
        if (this instanceof C58812QAv) {
            Number number = (Number) ((C58812QAv) this).A01.A00(c62611SIt);
            if (number == null) {
                return null;
            }
            return Float.valueOf(number.floatValue() * 2.55f);
        }
        return this.A01;
    }

    public final Object A01(Object obj, Object obj2, float f, float f2, float f3, float f4, float f5) {
        C62611SIt c62611SIt = this.A02;
        c62611SIt.A04 = f;
        c62611SIt.A00 = f2;
        c62611SIt.A06 = obj;
        c62611SIt.A05 = obj2;
        c62611SIt.A02 = f3;
        c62611SIt.A01 = f4;
        c62611SIt.A03 = f5;
        return A00(c62611SIt);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SIt, java.lang.Object] */
    public C62961SZe(Object obj) {
        this.A02 = new Object();
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SIt, java.lang.Object] */
    public C62961SZe() {
        this.A02 = new Object();
        this.A01 = null;
    }
}
