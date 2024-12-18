package X;

import android.R;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ncx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53025Ncx extends PJX {
    public final /* synthetic */ C55907Ory A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C53025Ncx(C55907Ory c55907Ory, String str, boolean z) {
        this.A00 = c55907Ory;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // X.PJX, X.MRA
    public final void Czw(boolean z) {
        InterfaceC149856oe interfaceC149856oe = this.A00.A0E;
        if (interfaceC149856oe != null) {
            interfaceC149856oe.Dfd();
        }
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        C9GR.A0F(this.A00.A05, "reporting_options_fail", 2131972418);
    }

    @Override // X.PJX, X.MRA
    public final void DpY(String str, String str2, String str3) {
        C55907Ory c55907Ory = this.A00;
        String str4 = this.A01;
        if (c55907Ory.A0C.A04) {
            str4 = "";
        }
        C006802i c006802i = C006802i.A0p;
        c006802i.markerAnnotate(R.bool.lockscreen_isPortrait, "effect_id", str4);
        if (str == null) {
            str = "unknown";
        }
        MSY.A1D(c006802i, "report_tag", str, R.bool.lockscreen_isPortrait);
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        C55907Ory c55907Ory = this.A00;
        String str2 = this.A01;
        String str3 = str2;
        if (c55907Ory.A0C.A04) {
            str3 = "";
        }
        C006802i c006802i = C006802i.A0p;
        c006802i.markerAnnotate(R.bool.lockscreen_isPortrait, "effect_id", str3);
        if (str == null) {
            str = "unknown";
        }
        c006802i.markerAnnotate(R.bool.lockscreen_isPortrait, "report_tag", str);
        c006802i.markerEnd(R.bool.lockscreen_isPortrait, (short) 2);
        boolean z = this.A02;
        InterfaceC149856oe interfaceC149856oe = c55907Ory.A0E;
        if (interfaceC149856oe != null && !z) {
            interfaceC149856oe.Dfc(str2);
            UserSession userSession = c55907Ory.A0B;
            C14360o3.A0B(userSession, 0);
            AbstractC53861Nrp.A00(new C55812OqN(userSession, str2), userSession, str2);
        }
        Context context = c55907Ory.A0D.getContext();
        if (context != null) {
            C9GR.A08(context, 2131972410, 1);
        }
    }
}
