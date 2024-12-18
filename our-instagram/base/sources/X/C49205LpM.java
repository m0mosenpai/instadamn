package X;

/* renamed from: X.LpM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49205LpM implements InterfaceC37233Gai {
    public final C45311K3o A00;

    public C49205LpM(C45311K3o c45311K3o) {
        C14360o3.A0B(c45311K3o, 1);
        this.A00 = c45311K3o;
    }

    @Override // X.InterfaceC37233Gai
    public final Integer AgK(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 8);
    }

    @Override // X.InterfaceC37233Gai
    public final Integer AlW(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 9);
    }

    @Override // X.InterfaceC37233Gai
    public final Long AlY(int i) {
        return this.A00.mResultSet.getNullableLong(i, 10);
    }

    @Override // X.InterfaceC37233Gai
    public final Integer Aqe(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 6);
    }

    @Override // X.InterfaceC37233Gai
    public final Integer Aqf(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 13);
    }

    @Override // X.InterfaceC37233Gai
    public final Integer B7O(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 24);
    }

    @Override // X.InterfaceC37233Gai
    public final Integer BAe(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 7);
    }

    @Override // X.InterfaceC37233Gai
    public final String BFh(int i) {
        return this.A00.mResultSet.getString(i, 25);
    }

    @Override // X.InterfaceC37233Gai
    public final boolean BJm(int i) {
        return this.A00.mResultSet.getBoolean(i, 30);
    }

    @Override // X.InterfaceC37233Gai
    public final Long BTD(int i) {
        return this.A00.mResultSet.getNullableLong(i, 1);
    }

    @Override // X.InterfaceC37233Gai
    public final String Bhy(int i) {
        return this.A00.mResultSet.getString(i, 18);
    }

    @Override // X.InterfaceC37233Gai
    public final String Bi0(int i) {
        return this.A00.mResultSet.getString(i, 22);
    }

    @Override // X.InterfaceC37233Gai
    public final Long Bi1(int i) {
        return this.A00.mResultSet.getNullableLong(i, 23);
    }

    @Override // X.InterfaceC37233Gai
    public final String Brb(int i) {
        return this.A00.mResultSet.getString(i, 16);
    }

    @Override // X.InterfaceC37233Gai
    public final Integer CEn(int i) {
        return this.A00.mResultSet.getNullableInteger(i, 26);
    }

    @Override // X.InterfaceC37233Gai
    public final int getCount() {
        return AbstractC43592JPx.A02(this.A00);
    }

    @Override // X.InterfaceC37233Gai
    public final String getName(int i) {
        return this.A00.mResultSet.getString(i, 15);
    }
}
