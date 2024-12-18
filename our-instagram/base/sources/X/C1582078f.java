package X;

/* renamed from: X.78f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1582078f extends AbstractC1582178g {
    public final C1585879t A00;
    public final C7QY A01;
    public final AnonymousClass781 A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1582078f(C1585879t c1585879t, C7QY c7qy, AnonymousClass781 anonymousClass781, String str) {
        super(c1585879t, c7qy, anonymousClass781);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(anonymousClass781, 2);
        C14360o3.A0B(c1585879t, 4);
        this.A03 = str;
        this.A02 = anonymousClass781;
        this.A01 = c7qy;
        this.A00 = c1585879t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1582078f) {
                C1582078f c1582078f = (C1582078f) obj;
                if (!C14360o3.A0K(this.A03, c1582078f.A03) || !C14360o3.A0K(this.A02, c1582078f.A02) || !C14360o3.A0K(this.A01, c1582078f.A01) || !C14360o3.A0K(this.A00, c1582078f.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31;
        C7QY c7qy = this.A01;
        return ((hashCode + (c7qy == null ? 0 : c7qy.hashCode())) * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Simple(id=");
        sb.append(this.A03);
        sb.append(", replyContentViewModel=");
        sb.append(this.A02);
        sb.append(", contextContentViewModel=");
        sb.append(this.A01);
        sb.append(", contextReplyMessageDecorationsViewModel=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArH() {
        return this.A01;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC162787Qp ArQ() {
        return this.A00;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK Bn9() {
        return this.A02;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
