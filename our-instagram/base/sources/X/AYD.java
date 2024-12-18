package X;

/* loaded from: classes4.dex */
public final class AYD implements InterfaceC40501uJ {
    public final String A00;
    public final String A01;

    public AYD(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.InterfaceC40501uJ
    public final String clientDocIdForQuery(String str) {
        C14360o3.A0B(str, 0);
        return null;
    }

    @Override // X.InterfaceC40501uJ
    public final String persistIdForQuery(String str) {
        String str2 = this.A00;
        if (str2 == null || !C14360o3.A0K(this.A01, str)) {
            return null;
        }
        return str2;
    }

    @Override // X.InterfaceC40501uJ
    public final String schemaForQuery(String str) {
        return null;
    }
}
