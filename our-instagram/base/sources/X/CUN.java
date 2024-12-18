package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes5.dex */
public final class CUN {
    public final UserSession A00;
    public final C27957CUb A01;
    public final InterfaceC06180Ui A02;
    public final InterfaceC06180Ui A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC06180Ui A05;
    public final InterfaceC15070pN A06;
    public final InterfaceC15070pN A07;
    public final InterfaceC15070pN A08;
    public final InterfaceC15070pN A09;

    public /* synthetic */ CUN(UserSession userSession) {
        C27957CUb c27957CUb = new C27957CUb(userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c27957CUb;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A04 = A00;
        this.A08 = new C06160Ug(null, A00);
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A05 = A002;
        this.A09 = new C06160Ug(null, A002);
        AnonymousClass057 A003 = C10M.A00(num, 0, 0);
        this.A03 = A003;
        this.A07 = new C06160Ug(null, A003);
        AnonymousClass057 A004 = C10M.A00(num, 0, 0);
        this.A02 = A004;
        this.A06 = new C06160Ug(null, A004);
    }

    public final Object A00(String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        C27957CUb c27957CUb = this.A01;
        C14360o3.A0B(str, 0);
        C25621Ms A0q = AbstractC25228BEl.A0q(c27957CUb.A00);
        A0q.A06();
        A0q.A03();
        String A11 = AnonymousClass001.A11("api/", "v1/", "creators/", "achievements/", "info/");
        C14360o3.A07(A11);
        A0q.A0E = A11;
        A0q.A0P(null, N2N.class, ONK.class, false);
        A0q.A9s("achievement_id", str);
        if (str2 != null) {
            A0q.A9s("media_id", str2);
        }
        if (str3 != null) {
            A0q.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        }
        Object collect = new C172887n0(new MBo(4, null), A0q.A0N().A04(1525447983, 3)).collect(new BU4(this, 5), interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }
}
