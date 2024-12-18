package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GH2 implements InterfaceC1119153d {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C163867Va A02;
    public final /* synthetic */ EnumC33384EpH A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public GH2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C163867Va c163867Va, EnumC33384EpH enumC33384EpH, String str, String str2, boolean z) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = enumC33384EpH;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A02 = c163867Va;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        String str;
        boolean z = C35113FeF.A00;
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        if (z) {
            Integer num = C05F.A0Y;
            Integer num2 = C05F.A0C;
            EnumC33384EpH enumC33384EpH = this.A03;
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "INVALID_STICKER_ID";
            }
            LJM.A00(null, interfaceC11380iw, userSession, enumC33384EpH, Boolean.valueOf(this.A06), num, num2, null, str2, this.A04);
            C163867Va c163867Va = this.A02;
            int A05 = AbstractC25227BEk.A05(enumC33384EpH, 0);
            if (A05 != 0) {
                if (A05 != 1) {
                    str = "null";
                } else {
                    str = "ai_sticker_preview";
                }
            } else {
                str = "ai_sticker_nux";
            }
            C159737El A06 = AnonymousClass983.A06(c163867Va.A00);
            if (AbstractC167007dF.A1Z(A06.A0Z.A0G)) {
                UserSession userSession2 = A06.A1Z;
                C14360o3.A0B(userSession2, 0);
                ((C35999Fux) userSession2.A01(C35999Fux.class, new MHS(userSession2, 0))).A00(str);
                A06.A1O(EnumC46186KcO.A02, "stickers", "");
                return;
            }
            return;
        }
        Integer num3 = C05F.A0N;
        Integer num4 = C05F.A0C;
        EnumC33384EpH enumC33384EpH2 = this.A03;
        String str3 = this.A05;
        if (str3 == null) {
            str3 = "INVALID_STICKER_ID";
        }
        LJM.A00(null, interfaceC11380iw, userSession, enumC33384EpH2, Boolean.valueOf(this.A06), num3, num4, null, str3, this.A04);
    }
}
