package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Pgp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57577Pgp extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C55207OeK A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57577Pgp(C55207OeK c55207OeK, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.A00 = c55207OeK;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = list;
        this.A04 = str4;
        this.A09 = z3;
        this.A0A = z4;
        this.A08 = z5;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        boolean z;
        C51759Mti c51759Mti = (C51759Mti) obj;
        C14360o3.A0B(c51759Mti, 0);
        UserSession userSession = this.A00.A0C;
        AbstractC54148Nwk.A00(userSession).A01(8);
        String str = this.A02;
        String str2 = this.A03;
        boolean z2 = !C14360o3.A0K(str, str2);
        String str3 = this.A01;
        boolean A0K = C14360o3.A0K(str3, "video_call_business_profile");
        boolean contains = AbstractC43592JPx.A13("video_call_creator_ai_sandbox_thread", "video_call_creator_ai_embodiment_canonical_thread").contains(str3);
        boolean A0K2 = C14360o3.A0K(str3, "call_user_created_ai_thread");
        if (A0K) {
            i = 3;
        } else if (contains) {
            i = 5;
        } else {
            i = 0;
            if (A0K2) {
                i = 6;
            }
        }
        boolean z3 = this.A06;
        if (z3 && (!this.A07 || C18U.A06(C06090Tz.A05, userSession, 36320919219807225L))) {
            z = true;
        } else {
            z = false;
        }
        List list = this.A05;
        if (list.isEmpty()) {
            OXh.A02(AbstractC28057CYl.A01(userSession), "ig_outbound_failure_empty_callee_list", this.A04, null, AbstractC166987dD.A1J("error"), AbstractC25233BEq.A0p("is_e2ee", String.valueOf(z3), AbstractC166987dD.A1L("trigger", str3)), true);
            if (C18U.A06(C06090Tz.A05, userSession, 36323603575418275L)) {
                OXE.A00.A02("RtcRsysInteractor", "startCall() with empty callee list", null);
                return C0eB.A00;
            }
        }
        C54739OFq c54739OFq = (C54739OFq) c51759Mti.A00;
        String str4 = this.A04;
        if (z3) {
            str2 = str;
        }
        String startCallCopyId = c54739OFq.A0A.startCallCopyId(str4, str, str2, AbstractC166987dD.A1F(list), z2, this.A09, str3, i, this.A0A, z3, z, this.A08, "meta_ai_thread_view_button".equals(str3), new C52002Myu(c54739OFq, new DHP(22, c54739OFq, z3)), null, null);
        C14360o3.A07(startCallCopyId);
        OXE.A00.A01("RtcRsysInteractor", AnonymousClass001.A0R("startCall() with localCallId ", startCallCopyId));
        return C0eB.A00;
    }
}
