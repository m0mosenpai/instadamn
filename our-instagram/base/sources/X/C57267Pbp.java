package X;

import java.util.List;

/* renamed from: X.Pbp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57267Pbp extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ N6J A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57267Pbp(N6J n6j, String str, String str2, String str3, List list, boolean z) {
        super(0);
        this.A00 = n6j;
        this.A05 = z;
        this.A01 = str;
        this.A04 = list;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        N6J n6j = this.A00;
        boolean z = this.A05;
        N6J.A0O(n6j, this.A01, this.A02, this.A03, this.A04, z);
        return C0eB.A00;
    }
}
