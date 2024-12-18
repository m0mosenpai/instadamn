package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.meta.foa.session.FoaUserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Pbn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57265Pbn extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57265Pbn(Object obj, Object obj2, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.PlK, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        long j;
        Long A0j;
        switch (this.A00) {
            case 0:
                new C28484Chc((UserSession) this.A02).A0C(this.A03, "welcome_message");
                ((InterfaceC16620sF) this.A01).invoke("welcome_message", this.A04);
                return C0eB.A00;
            case 1:
                int ordinal = ((EnumC27374C6d) this.A01).ordinal();
                if (ordinal != 1) {
                    if (ordinal != 0) {
                        if (ordinal != 2 && ordinal != 3) {
                            throw B4Z.A00();
                        }
                    } else {
                        ((InterfaceC16620sF) this.A02).invoke(this.A04, this.A03);
                    }
                } else {
                    ((InterfaceC16620sF) this.A02).invoke(null, null);
                }
                return C0eB.A00;
            case 2:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                String str = this.A04;
                String str2 = this.A03;
                AbstractC167017dG.A1N(abstractC12990ll, interfaceC11380iw);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "barcelona_follow_button_tap_prompt_cancel");
                if (A0f.isSampled()) {
                    long j2 = 0;
                    if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    A0f.A9K("target_id", Long.valueOf(j));
                    AbstractC37301Gc2.A15(A0f, interfaceC11380iw);
                    if (str2 != null) {
                        AtomicBoolean atomicBoolean = C38321qM.A0i;
                        j2 = AbstractC50522MSa.A0C(C38801rC.A06(str2));
                    }
                    AbstractC37300Gc1.A0h(A0f, Long.valueOf(j2));
                    AbstractC167017dG.A1C(A0f);
                }
                return C0eB.A00;
            case 3:
                C25814BbV c25814BbV = (C25814BbV) this.A02;
                c25814BbV.A0B.A00(new C50371MLy(c25814BbV, (User) this.A01, this.A03, this.A04, 18));
                ((C28212CcA) c25814BbV.A0L.getValue()).A01(c25814BbV.A0C, AbstractC141776au.A00(c25814BbV), c25814BbV.A0N);
                return C0eB.A00;
            case 4:
                C25814BbV c25814BbV2 = (C25814BbV) this.A02;
                c25814BbV2.A0B.A00(new C50371MLy(c25814BbV2, (User) this.A01, this.A03, this.A04, 19));
                c25814BbV2.A0A.A0D();
                return C0eB.A00;
            case 5:
                String str3 = this.A03;
                GBV gbv = (GBV) this.A02;
                AbstractC35105Fe7.A01(gbv.A04.requireContext(), (InterfaceC11380iw) this.A01, gbv.A02, str3, this.A04);
                return C0eB.A00;
            case 6:
                PJF pjf = (PJF) this.A02;
                pjf.A04 = false;
                PJF.A0K = (AbstractC53633Nne) this.A01;
                C56139Ovz c56139Ovz = pjf.A08;
                c56139Ovz.A0A.A7P(new Object());
                String str4 = this.A04;
                InterfaceC174767qC interfaceC174767qC = pjf.A07;
                O6B o6b = pjf.A02;
                String str5 = this.A03;
                OL3 ol3 = pjf.A09;
                AbstractC25233BEq.A0v(0, str4, o6b, str5);
                OW9 ow9 = c56139Ovz.A09;
                C55207OeK c55207OeK = ow9.A0Z;
                c55207OeK.A01 = interfaceC174767qC;
                c55207OeK.A04 = o6b;
                c55207OeK.A03 = ol3;
                boolean z = true;
                if (C18U.A01(C06090Tz.A05, c55207OeK.A0C, 36600616079855560L) != 2) {
                    z = false;
                }
                C55207OeK.A04(c55207OeK, new C57559PgX(str4, str5), z, false);
                ow9.A0T.A08.put(str4, str5);
                return C0eB.A00;
            default:
                AbstractC167007dF.A0J().post(new D2Q((Context) this.A01, (FoaUserSession) this.A02, this.A03, this.A04));
                return C0eB.A00;
        }
    }
}
