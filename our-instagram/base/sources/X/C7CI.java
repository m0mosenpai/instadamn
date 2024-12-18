package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7CI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7CI implements InterfaceC41501vz {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C159737El A01;

    public C7CI(FragmentActivity fragmentActivity, C159737El c159737El) {
        this.A01 = c159737El;
        this.A00 = fragmentActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        EnumC33420Epr enumC33420Epr;
        int A01;
        int A00;
        EnumC33364Eox enumC33364Eox;
        E6W e6w;
        Long l;
        String str;
        int A03 = C0f9.A03(-1436715513);
        int A032 = C0f9.A03(554696502);
        C159737El c159737El = this.A01;
        c159737El.A0W.getClass();
        EnumC33318EoD enumC33318EoD = ((C7I1) obj).A00;
        String str2 = enumC33318EoD.A02;
        UserSession userSession = c159737El.A1Z;
        C142846ck A002 = AbstractC147806l5.A00(userSession);
        int A003 = C159737El.A00(c159737El);
        String C7I = c159737El.A0W.C7I();
        String C7q = c159737El.A0W.C7q();
        boolean z = !C159187Ce.A04(userSession, c159737El.A0W);
        C25531Mh A0E = C25531Mh.A0E(A002.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(A002.A02));
            A0E.A0k("first_message_pill_option_rendered");
            A0E.A0j("tap");
            A0E.A0o("first_message_banner");
            A0E.A0p("thread_view");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(A003)));
            A0E.A0r(C7I);
            if (C7q != null) {
                l = AbstractC003100w.A0k(10, C7q);
            } else {
                l = null;
            }
            A0E.A0h(l);
            C09530e4 c09530e4 = new C09530e4("entrypoint", str2);
            if (z) {
                str = "True";
            } else {
                str = "False";
            }
            A0E.A0v(AbstractC06930Yk.A06(c09530e4, new C09530e4("has_sent_first_message", str)));
            A0E.Cht();
        }
        DirectThreadKey A0A = C159737El.A0A(c159737El);
        InterfaceC08830cm interfaceC08830cm = c159737El.A22;
        C2EC c2ec = (C2EC) interfaceC08830cm.get();
        FRX frx = c159737El.A0m;
        switch (AbstractC34383FDz.A00[enumC33318EoD.ordinal()]) {
            case 1:
                C49317LrB A07 = C159737El.A07(this.A00, c159737El, C05F.A00);
                c159737El.A1t.A00((C7GY) c159737El.A1s.A00.get(C7GX.A0I));
                AbstractC161537Lo.A02(null, A07);
                break;
            case 2:
                if (c159737El.A14) {
                    AbstractC34189F6n.A00(this.A00, userSession);
                    break;
                }
                break;
            case 3:
                if (A0A != null && frx != null) {
                    enumC33420Epr = EnumC33420Epr.A06;
                    A01 = C159737El.A01(c159737El);
                    A00 = C159737El.A00(c159737El);
                    e6w = c159737El.A0W.BLR();
                    enumC33364Eox = EnumC33364Eox.A04;
                    frx.A01(enumC33364Eox, enumC33420Epr, e6w, A0A, A01, A00);
                    break;
                }
                break;
            case 4:
                FragmentActivity fragmentActivity = this.A00;
                Bundle bundle = new Bundle();
                bundle.putString("ARG_THREAD_ID", C159737El.A0H(c159737El));
                C189478aR A004 = new C189448aO(userSession).A00();
                FVI.A01().A00();
                C38910HBh c38910HBh = new C38910HBh();
                c38910HBh.setArguments(bundle);
                A004.A02(fragmentActivity, c38910HBh);
                break;
            case 5:
                FragmentActivity fragmentActivity2 = this.A00;
                C2EC c2ec2 = (C2EC) interfaceC08830cm.get();
                C14360o3.A0B(userSession, 0);
                if (c2ec2 != null) {
                    AbstractC34835FWs.A00(fragmentActivity2, userSession, new InviteLinkShareInfo(null, (ImageUrl) C4GQ.A00(userSession, c2ec2).A00, c2ec2.BAY(), c2ec2.C7I(), c2ec2.C7q(), c2ec2.Asv(), c2ec2.C7l(), null, c2ec2.C7g(), c2ec2.AdZ(), c2ec2.BSB(), C14360o3.A0K(userSession.userId, c2ec2.Asv()), true));
                    break;
                }
                break;
            case 7:
                if (A0A != null && frx != null) {
                    C2EE c2ee = c159737El.A0W;
                    if (c2ee != null && c2ee.An6() != null && !AbstractC159197Cf.A01(c2ee)) {
                        C14360o3.A0B(userSession, 0);
                        if (C18U.A06(C06090Tz.A05, userSession, 36328070340492441L)) {
                            C2EE c2ee2 = c159737El.A0W;
                            frx.A00(null, EnumC33420Epr.A07, c2ee2.An6(), c2ee2, A0A);
                            new C36297Fzr(userSession).A03(c159737El.A0W.C7I(), c159737El.A0W.C7q(), c159737El.A0W.AdZ());
                            break;
                        }
                    }
                    enumC33420Epr = EnumC33420Epr.A07;
                    A01 = C159737El.A01(c159737El);
                    A00 = C159737El.A00(c159737El);
                    enumC33364Eox = null;
                    e6w = null;
                    frx.A01(enumC33364Eox, enumC33420Epr, e6w, A0A, A01, A00);
                    break;
                }
                break;
            case 8:
                if (A0A != null && frx != null) {
                    frx.A02(EnumC33364Eox.A04, EnumC33420Epr.A08, A0A, C159737El.A01(c159737El), C159737El.A00(c159737El));
                    break;
                }
                break;
            case 9:
                if (A0A != null) {
                    F3C.A00(c159737El.A1R, this.A00, userSession, new C23923Aiq(this), AbstractC34894FZg.A00(c2ec.C72()), A0A, "conversation_starters", c2ec.C7g(), c2ec.BI1(), c2ec.CX1(), c2ec.CWO(), c2ec.CWl());
                    break;
                }
                break;
            case 10:
                if (A0A != null) {
                    FragmentActivity fragmentActivity3 = this.A00;
                    List emptyList = Collections.emptyList();
                    Parcelable.Creator creator = Capabilities.CREATOR;
                    AbstractC34377FDt.A00.A01(fragmentActivity3, userSession, AbstractC2054797v.A00(emptyList), new AiZ(this), c2ec, A0A, "direct_broadcast_channel_conversation_starters");
                    break;
                }
                break;
            case 11:
                AbstractC25651Mw.A00(userSession).E4s(new Object());
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C7GN c7gn = c159737El.A0u;
                c7gn.A0F = str2;
                c7gn.A0H = false;
                C7GN.A05(c7gn);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C160007Fm c160007Fm = c159737El.A0b;
                if (c160007Fm != null) {
                    c159737El.A1i.A03(AbstractC13880nE.A0G(c160007Fm.A0T.Ajw()), C159737El.A05(c159737El), str2, C159737El.A01(c159737El));
                    break;
                }
                break;
            case 14:
                C7I0 c7i0 = c159737El.A0Q;
                C2EE c2ee3 = c159737El.A0W;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(c2ee3, 1);
                Integer num = c7i0.A00;
                if (num == null) {
                    C7I0.A00(userSession, c7i0, c2ee3);
                    break;
                } else if (num.intValue() == 11) {
                    C159187Ce.A00(c7i0.A04, userSession, c7i0.A07, c2ee3);
                    break;
                }
                break;
        }
        C0f9.A0A(-718086447, A032);
        C0f9.A0A(-1159024588, A03);
    }
}
