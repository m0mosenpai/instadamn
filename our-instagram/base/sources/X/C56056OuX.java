package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.util.startup.appwarmer.KeepWarmReceiver;
import com.instagram.zero.main.IgZeroMain;

/* renamed from: X.OuX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56056OuX implements InterfaceC12870lZ {
    public final int A00;
    public final Object A01;

    public C56056OuX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1807636899);
                i = 667500561;
                break;
            case 1:
                A03 = C0f9.A03(-702009467);
                C2NX c2nx = (C2NX) this.A01;
                CallerContext callerContext = C2NX.A08;
                Context context = c2nx.A01;
                Intent A08 = MSW.A08(context, KeepWarmReceiver.class);
                A08.putExtra(AbstractC58317Pt9.A00(178), C18U.A06(C06090Tz.A05, c2nx.A04, 36324260704366635L));
                context.sendBroadcast(A08);
                i = -1985798280;
                break;
            case 2:
                A03 = C0f9.A03(1654981421);
                C55039OZl c55039OZl = (C55039OZl) this.A01;
                if (c55039OZl.A06) {
                    OXE.A00.A00("ForegroundEligibilityStatus", AnonymousClass001.A0R("Application backgrounded.", ""));
                    c55039OZl.A08 = false;
                    c55039OZl.A02.run();
                }
                i = -92253730;
                break;
            default:
                A03 = C0f9.A03(1659507907);
                i = -1466567905;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1576049527);
                ((InterfaceC57908PmD) this.A01).onComplete();
                i = -1835746686;
                break;
            case 1:
                A03 = C0f9.A03(-1529905153);
                i = -400501763;
                break;
            case 2:
                A03 = C0f9.A03(1861258239);
                C55039OZl c55039OZl = (C55039OZl) this.A01;
                if (c55039OZl.A06) {
                    OXE.A00.A00("ForegroundEligibilityStatus", "Application foregrounded. Safe to start foreground service.");
                    InterfaceC09390do interfaceC09390do = c55039OZl.A04;
                    MSW.A09(interfaceC09390do).removeCallbacks(c55039OZl.A02);
                    c55039OZl.A08 = true;
                    c55039OZl.A00 = true;
                    if (C55039OZl.A01(c55039OZl)) {
                        c55039OZl.A01.run();
                    } else {
                        MSW.A09(interfaceC09390do).post(c55039OZl.A01);
                    }
                }
                i = -125716089;
                break;
            default:
                A03 = C0f9.A03(-1345210407);
                IgZeroMain igZeroMain = (IgZeroMain) this.A01;
                igZeroMain.A06(C05F.A01);
                PZ1.A01(igZeroMain, AbstractC167007dF.A0h("APP_FOREGROUNDED"), AbstractC24771Iv.A02(197189788, 3), 49);
                i = -1169984744;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
