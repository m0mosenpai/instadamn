package X;

/* renamed from: X.5b6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC119495b6 {
    public static final C114205Dh A00(InterfaceC1131459c interfaceC1131459c) {
        InterfaceC1131459c BbN = interfaceC1131459c.BbN();
        if (BbN != null) {
            return BbN.Chk(interfaceC1131459c, true);
        }
        long Bxd = interfaceC1131459c.Bxd();
        return new C114205Dh(0.0f, 0.0f, (int) (Bxd >> 32), C119055aN.A00(Bxd));
    }

    public static final C114205Dh A01(InterfaceC1131459c interfaceC1131459c) {
        InterfaceC1131459c A02 = A02(interfaceC1131459c);
        long Bxd = A02.Bxd();
        float f = (int) (Bxd >> 32);
        float A00 = C119055aN.A00(Bxd);
        C114205Dh Chk = A02(interfaceC1131459c).Chk(interfaceC1131459c, true);
        float f2 = Chk.A01;
        float f3 = 0.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > f) {
            f2 = f;
        }
        float f4 = Chk.A03;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > A00) {
            f4 = A00;
        }
        float f5 = Chk.A02;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 <= f) {
            f = f5;
        }
        float f6 = Chk.A00;
        if (f6 >= 0.0f) {
            f3 = f6;
        }
        if (f3 <= A00) {
            A00 = f3;
        }
        if (f2 != f && f4 != A00) {
            long Chp = A02.Chp(AbstractC119395aw.A00(f2, f4));
            long Chp2 = A02.Chp(AbstractC119395aw.A00(f, f4));
            long Chp3 = A02.Chp(AbstractC119395aw.A00(f, A00));
            long Chp4 = A02.Chp(AbstractC119395aw.A00(f2, A00));
            float A01 = C119365at.A01(Chp);
            float A012 = C119365at.A01(Chp2);
            float A013 = C119365at.A01(Chp4);
            float A014 = C119365at.A01(Chp3);
            float min = Math.min(A01, Math.min(A012, Math.min(A013, A014)));
            float max = Math.max(A01, Math.max(A012, Math.max(A013, A014)));
            float A022 = C119365at.A02(Chp);
            float A023 = C119365at.A02(Chp2);
            float A024 = C119365at.A02(Chp4);
            float A025 = C119365at.A02(Chp3);
            return new C114205Dh(min, Math.min(A022, Math.min(A023, Math.min(A024, A025))), max, Math.max(A022, Math.max(A023, Math.max(A024, A025))));
        }
        return C114205Dh.A04;
    }

    public static final InterfaceC1131459c A02(InterfaceC1131459c interfaceC1131459c) {
        InterfaceC1131459c interfaceC1131459c2;
        C59U c59u;
        InterfaceC1131459c BbN = interfaceC1131459c.BbN();
        while (true) {
            interfaceC1131459c2 = interfaceC1131459c;
            interfaceC1131459c = BbN;
            if (BbN == null) {
                break;
            }
            BbN = BbN.BbN();
        }
        if ((interfaceC1131459c2 instanceof C59U) && (c59u = (C59U) interfaceC1131459c2) != null) {
            C59U c59u2 = c59u.A07;
            while (true) {
                interfaceC1131459c2 = c59u;
                c59u = c59u2;
                if (c59u2 == null) {
                    break;
                }
                c59u2 = c59u2.A07;
            }
        }
        return interfaceC1131459c2;
    }
}
