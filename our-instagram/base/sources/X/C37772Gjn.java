package X;

import com.instagram.clips.intf.ClipsViewerSource;

/* renamed from: X.Gjn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37772Gjn extends C03E implements InterfaceC16570sA {
    public C37772Gjn(Object obj) {
        super(6, obj, C37543Gfz.class, "launchAdsOverflowMenu", "launchAdsOverflowMenu(Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/viewer/ui/state/ClipsItemState;Ljava/lang/String;ZZZ)V", 0);
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        String str = (String) obj3;
        boolean A1a = AbstractC166987dD.A1a(obj4);
        boolean A1a2 = AbstractC166987dD.A1a(obj5);
        boolean A1a3 = AbstractC166987dD.A1a(obj6);
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, c37644Ghd);
        C37543Gfz c37543Gfz = (C37543Gfz) this.receiver;
        String str2 = null;
        boolean A1X = AbstractC167007dF.A1X(c37543Gfz.A02, ClipsViewerSource.A0s);
        if (str != null) {
            str2 = str;
        }
        InterfaceC16600sD interfaceC16600sD = c37543Gfz.A01;
        if (interfaceC16600sD == null) {
            C14360o3.A0F("displayAdsOverflowMenu");
            throw C00O.createAndThrow();
        }
        interfaceC16600sD.invoke(c120985dq, new HLE(c37644Ghd, c37543Gfz.A03, c120985dq.A06()), new C41173IKm(str2, null, null, A1X, A1R, A1R, A1a3, false, A1R, false, false, false, false, false, A1a, A1a2, false), Integer.valueOf(c37644Ghd.A06()));
        return C0eB.A00;
    }
}
