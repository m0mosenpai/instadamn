package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dvd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31672Dvd implements InterfaceC169327h6 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public C31672Dvd(UserSession userSession, String str, String str2, String str3, int i, int i2, int i3, int i4, boolean z) {
        this.A04 = userSession;
        this.A08 = z;
        this.A05 = str;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A06 = str2;
        this.A07 = str3;
    }

    @Override // X.InterfaceC169327h6
    public final C1ON AN3(String str) {
        UserSession userSession = this.A04;
        boolean z = this.A08;
        return AbstractC34779FUd.A00(userSession, str, this.A05, this.A06, this.A07, this.A03, this.A02, this.A01, this.A00, z);
    }
}
