package X;

import java.util.List;

/* renamed from: X.AYf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23381AYf implements C3S9 {
    public final C3RU A00;
    public final C0JM A01;
    public final C2047794l A02;
    public final Integer A03;

    @Override // X.C3S9
    public final void EEt() {
    }

    @Override // X.C3S9
    public final void Eos(List list) {
        C2047794l c2047794l = this.A02;
        C3RU c3ru = this.A00;
        String CDV = c3ru.CDV();
        String CDY = c3ru.CDY();
        Integer num = this.A03;
        long now = this.A01.now();
        C14360o3.A0B(CDV, 0);
        AbstractC167017dG.A1P(CDY, num);
        C14360o3.A07(c2047794l.A00(num, CDV, CDY, list, null, null, now).get());
    }

    @Override // X.C3S9
    public final List Aay() {
        return C16930sl.A00;
    }

    public C23381AYf(C0JM c0jm, C2047794l c2047794l, C3RU c3ru, Integer num) {
        AbstractC167027dH.A13(c2047794l, c3ru, c0jm);
        this.A02 = c2047794l;
        this.A00 = c3ru;
        this.A01 = c0jm;
        this.A03 = num;
    }
}
