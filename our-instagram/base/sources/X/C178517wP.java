package X;

/* renamed from: X.7wP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178517wP implements InterfaceC178527wQ {
    public final C178537wR A02 = new C178537wR();
    public final C178537wR A01 = new C178537wR();
    public final C178537wR A00 = new C178537wR();
    public volatile String A03 = null;
    public volatile boolean A04 = false;

    /* JADX WARN: Type inference failed for: r5v0, types: [X.8mf, java.lang.Object] */
    public static C196498mf A00(C178517wP c178517wP) {
        ?? obj = new Object();
        obj.A0F = c178517wP.A03;
        obj.A0G = c178517wP.A04;
        C178537wR c178537wR = c178517wP.A02;
        double[] A01 = c178537wR.A01.A01();
        double[] A012 = c178537wR.A03.A01();
        obj.A0D = (long) A01[2];
        obj.A0B = ((int) A01[3]) + ((int) A012[3]);
        obj.A01 = (float) A01[0];
        obj.A09 = (float) A01[1];
        obj.A00 = (float) A012[0];
        obj.A08 = (float) A012[1];
        C178537wR c178537wR2 = c178517wP.A01;
        double[] A013 = c178537wR2.A01.A01();
        double[] A014 = c178537wR2.A03.A01();
        obj.A0E = (long) A013[2];
        obj.A0A = ((int) A013[3]) + ((int) A014[3]);
        obj.A05 = (float) A013[0];
        obj.A07 = (float) A013[1];
        obj.A04 = (float) A014[0];
        obj.A06 = (float) A014[1];
        double[] A015 = c178517wP.A00.A02.A01();
        obj.A0C = (long) A015[2];
        obj.A02 = (float) A015[0];
        obj.A03 = (float) A015[1];
        return obj;
    }

    @Override // X.InterfaceC178527wQ
    public final C196498mf ARI() {
        C196498mf A00 = A00(this);
        this.A02.A00();
        this.A01.A00();
        this.A00.A00();
        this.A03 = null;
        return A00;
    }

    @Override // X.InterfaceC178527wQ
    public final C196498mf ARJ(String str) {
        C196498mf A00 = A00(this);
        this.A02.A00();
        this.A01.A00();
        this.A00.A00();
        this.A03 = str;
        return A00;
    }
}
