package X;

/* renamed from: X.Rin, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61226Rin implements InterfaceC65410Tjh {
    /* JADX INFO: Fake field, exist only in values array */
    RS256(-257),
    /* JADX INFO: Fake field, exist only in values array */
    RS384(-258),
    /* JADX INFO: Fake field, exist only in values array */
    RS512(-259),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY_RS1(-262),
    /* JADX INFO: Fake field, exist only in values array */
    PS256(-37),
    /* JADX INFO: Fake field, exist only in values array */
    PS384(-38),
    /* JADX INFO: Fake field, exist only in values array */
    PS512(-39),
    RS1(-65535);

    public final int A00;

    @Override // X.InterfaceC65410Tjh
    public final int Aap() {
        return this.A00;
    }

    EnumC61226Rin(int i) {
        this.A00 = i;
    }
}
