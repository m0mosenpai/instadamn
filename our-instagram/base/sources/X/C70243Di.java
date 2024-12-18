package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.3Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70243Di implements InterfaceC12870lZ, InterfaceC13000lm {
    public long A00;
    public AbstractC10360h2 A01;
    public InterfaceC53842dO A02;
    public WeakReference A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C006802i A09;
    public final UserSession A0A;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public Runnable A03 = RunnableC70253Dj.A00;

    public final void A00() {
        UserSession userSession = this.A0A;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36330720335250410L)) {
            this.A04 = null;
            this.A01 = null;
            this.A02 = null;
        }
    }

    public C70243Di(UserSession userSession) {
        this.A0A = userSession;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A09 = c006802i;
        if (C18U.A06(C06090Tz.A05, userSession, 36323852682473109L)) {
            C218914p.A04(EnumC220415e.A02, this, true, false);
        } else {
            C218914p.A03(EnumC220415e.A03, this);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1287486064);
        C23031Ai A00 = AbstractC23021Ah.A00(this.A0A);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A00.A01.ARD();
        ARD.E7G("reset_to_main_feed_background_time", currentTimeMillis);
        ARD.apply();
        this.A07 = true;
        C0f9.A0A(1157651327, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int i;
        Bundle bundle;
        int A03 = C0f9.A03(-75182378);
        this.A00 = System.currentTimeMillis();
        UserSession userSession = this.A0A;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36320489724846656L)) {
            if (!this.A07) {
                i = -1414931127;
            } else if (this.A02 != null && (bundle = InstagramMainActivity.A0t) != null && !bundle.isEmpty()) {
                i = -1530371187;
            } else {
                long j = this.A00 - AbstractC23021Ah.A00(userSession).A01.getLong("reset_to_main_feed_background_time", 0L);
                String string = AbstractC23021Ah.A00(userSession).A01.getString("app_entry_last_interacted_fragment", "");
                C14360o3.A07(string);
                if (C18U.A06(c06090Tz, userSession, 36320489725108804L)) {
                    if (C55080Oaa.A01.A02(this.A01, userSession, string, this.A04, j / 1000)) {
                        C006802i c006802i = this.A09;
                        c006802i.markerStart(728433975);
                        c006802i.markerAnnotate(728433975, MSV.A00(682), string);
                        c006802i.markerEnd(728433975, (short) 2);
                    }
                }
                if (C18U.A06(c06090Tz, userSession, 36320489725764170L)) {
                    try {
                        C55080Oaa.A01.A01(this.A01, userSession, this.A02, string, this.A04, j / 1000);
                    } catch (Exception e) {
                        C006802i c006802i2 = this.A09;
                        c006802i2.markerAnnotate(728433975, MSV.A00(684), e.toString());
                        c006802i2.markerAnnotate(728433975, MSV.A00(683), string);
                        c006802i2.markerEnd(728433975, (short) 3);
                    }
                }
            }
            C0f9.A0A(i, A03);
        }
        i = 5431646;
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        if (AbstractC201688vy.A01(this.A0A, C05F.A0j)) {
            C218914p.A07(this);
        }
        this.A08.removeCallbacks(this.A03);
    }
}
