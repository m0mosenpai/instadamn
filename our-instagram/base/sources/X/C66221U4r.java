package X;

import java.util.List;

/* renamed from: X.U4r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66221U4r implements C2W5 {
    public final int A00;
    public final int A01;
    public final C2WC A02;
    public final List A03;

    @Override // X.C2W5
    public final Object BMS() {
        return null;
    }

    @Override // X.C2W5
    public final int Bat() {
        return 0;
    }

    @Override // X.C2W5
    public final int Bau() {
        return 0;
    }

    @Override // X.C2W5
    public final int Baw() {
        return 0;
    }

    @Override // X.C2W5
    public final int Bax() {
        return 0;
    }

    @Override // X.C2W5
    public final int CI4(int i) {
        return 0;
    }

    @Override // X.C2W5
    public final int CIb(int i) {
        return 0;
    }

    @Override // X.C2W5
    public final C2W5 AnV(int i) {
        return (C2W5) this.A03.get(i);
    }

    @Override // X.C2W5
    public final int Ang() {
        return this.A03.size();
    }

    @Override // X.C2W5
    public final C2WC Bmi() {
        return this.A02;
    }

    @Override // X.C2W5
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.C2W5
    public final int getWidth() {
        return this.A01;
    }

    public C66221U4r(C2WC c2wc, List list, int i, int i2) {
        this.A03 = list;
        this.A02 = c2wc;
        this.A01 = i;
        this.A00 = i2;
    }
}
