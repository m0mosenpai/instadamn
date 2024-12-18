package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Io7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42283Io7 implements InterfaceC12870lZ {
    public long A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final String A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;

    public C42283Io7(FragmentActivity fragmentActivity, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(str, 5);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A03 = str;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-454722141);
        this.A00 = System.currentTimeMillis();
        C0f9.A0A(-637837355, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C3DN A00;
        int A03 = C0f9.A03(1489043476);
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36320253500268761L) && !AbstractC70233Dh.A00(userSession).A05) {
            long currentTimeMillis = System.currentTimeMillis() - this.A00;
            String str = this.A03;
            if (C14360o3.A0K(str, "clips_viewer_clips_media_notes_stack") && currentTimeMillis > C18U.A01(c06090Tz, userSession, 36609639806539718L)) {
                this.A01.finish();
            }
            if (C14360o3.A0K(C55772hI.A00(userSession).A03(), str) && ((A00 = C3DN.A00.A00(this.A01)) == null || !((C3DP) A00).A0h)) {
                long A01 = C18U.A01(c06090Tz, userSession, 36601728476582232L);
                long A012 = C18U.A01(c06090Tz, userSession, 36601728476385623L);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (currentTimeMillis >= timeUnit.toMillis(A01) && currentTimeMillis < timeUnit.toMillis(A012)) {
                    boolean A06 = C18U.A06(c06090Tz, userSession, 36320253499941078L);
                    boolean A062 = C18U.A06(c06090Tz, userSession, 36320253500137687L);
                    boolean A063 = C18U.A06(c06090Tz, userSession, 36320253500203224L);
                    InterfaceC16820sZ interfaceC16820sZ = this.A04;
                    interfaceC16820sZ.invoke();
                    C37556GgC A17 = AbstractC25226BEj.A17(interfaceC16820sZ);
                    if (A17 != null && A17.A03() < A17.A05()) {
                        InterfaceC16820sZ interfaceC16820sZ2 = this.A05;
                        EnumC129395t1 enumC129395t1 = ((C37546Gg2) interfaceC16820sZ2.invoke()).A0A.A0F(A17.A03() + 1).A01;
                        EnumC129395t1 enumC129395t12 = EnumC129395t1.A0G;
                        if (enumC129395t1 != enumC129395t12) {
                            if (!A062) {
                                if (A063) {
                                    int A032 = A17.A03() + 1;
                                    int A05 = A17.A05();
                                    while (true) {
                                        if (A032 > A05) {
                                            break;
                                        }
                                        if (C37546Gg2.A03(interfaceC16820sZ2).A0F(A032).A01 == enumC129395t12) {
                                            if (A032 != A17.A03() && A032 >= 0 && A032 <= A17.A05()) {
                                                A17.A0F(A032, A06);
                                            }
                                        } else {
                                            A032++;
                                        }
                                    }
                                }
                            }
                        }
                        A17.A0I(A06);
                    }
                }
            }
        }
        C0f9.A0A(-237439164, A03);
    }
}
