package X;

/* renamed from: X.0pM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15060pM extends AnonymousClass109 {
    public long A00 = -1;
    public InterfaceC23621Ds A01;

    @Override // X.AnonymousClass109
    public final /* bridge */ /* synthetic */ boolean A00(Object obj) {
        AnonymousClass057 anonymousClass057 = (AnonymousClass057) obj;
        if (this.A00 >= 0) {
            return false;
        }
        long j = anonymousClass057.A03;
        if (j < anonymousClass057.A02) {
            anonymousClass057.A02 = j;
        }
        this.A00 = j;
        return true;
    }

    @Override // X.AnonymousClass109
    public final /* bridge */ /* synthetic */ InterfaceC23621Ds[] A01(Object obj) {
        long j = this.A00;
        this.A00 = -1L;
        this.A01 = null;
        return ((AnonymousClass057) obj).A0C(j);
    }
}
