package X;

import java.util.List;

/* renamed from: X.LhQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48758LhQ implements C4F7 {
    public final /* synthetic */ C70F A00;

    @Override // X.C4F7
    public final void Cn6(String str) {
    }

    @Override // X.C4F7
    public final void Cn7(String str, String str2) {
    }

    @Override // X.C4F7
    public final void D5l(String str, String str2, List list, List list2, int i, long j) {
    }

    @Override // X.C4F7
    public final void D5m(String str, String str2, List list, List list2, int i, long j) {
    }

    @Override // X.C4F7
    public final void DVz(String str, String str2) {
    }

    @Override // X.C4F7
    public final void DcD() {
    }

    @Override // X.C4F7
    public final void DcE(long j) {
    }

    @Override // X.C4F7
    public final void ECp(Integer num) {
        C14360o3.A0B(num, 0);
        ((C92874Ed) this.A00.A07.getValue()).A05(num, null, true);
    }

    public C48758LhQ(C70F c70f) {
        this.A00 = c70f;
    }

    @Override // X.C4F7
    public final void AMe(long j, String str) {
        C14360o3.A0B("❤️", 1);
        ((C92874Ed) this.A00.A07.getValue()).A02(j);
    }

    @Override // X.C4F7
    public final void AOh(long j) {
        C92874Ed c92874Ed = (C92874Ed) this.A00.A07.getValue();
        if (j != 0) {
            c92874Ed.A03.A0F(j, null);
        }
    }

    @Override // X.C4F7
    public final int BXK() {
        C92874Ed c92874Ed = (C92874Ed) this.A00.A07.getValue();
        return c92874Ed.A03.A05(c92874Ed.A01.userId);
    }
}
