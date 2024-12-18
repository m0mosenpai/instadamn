package X;

/* renamed from: X.48l, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48l extends AbstractC28901aT {
    public C48l() {
        super(2);
    }

    @Override // X.AbstractC28901aT
    public final void A04(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        interfaceC37481ol.ATG("create table if not exists file_registry (_id integer primary key autoincrement, file_path text not null, owner_json text not null)");
    }

    @Override // X.AbstractC28901aT
    public final void A06(InterfaceC37481ol interfaceC37481ol, int i, int i2) {
    }
}
