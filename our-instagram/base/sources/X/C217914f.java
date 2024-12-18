package X;

import android.content.Context;

/* renamed from: X.14f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C217914f extends AbstractC211911v {
    public final C211211o A00;
    public final C17090t4 A01;
    public final Context A02;

    public C217914f(Context context, C211211o c211211o, C17090t4 c17090t4) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c17090t4, 3);
        this.A02 = context;
        this.A00 = c211211o;
        this.A01 = c17090t4;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "ProxyServiceInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        String str;
        C0K8.A0D("proxy_service", "Initialize proxy service.");
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        if (!C06580Wl.A01(C20150ym.A03(AbstractC20070ye.A00(18863741177233566L)), C06580Wl.A00(context))) {
            C0K8.A0D("proxy_service", "User not in allowed region.");
            return;
        }
        C211211o c211211o = this.A00;
        ((AnonymousClass122) c211211o.A00()).A08();
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerStart(79499422);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C1AD.A06(c06090Tz, 2324143800437836897L)) {
            C0K8.A0D("proxy_service", "Proxy service disabled by init killswitch.");
            str = "init_killswitch";
        } else {
            if (C1AD.A06(c06090Tz, 2324143800438230117L)) {
                C0K8.A0D("proxy_service", "Initialize MetaConnectivityProber.");
                C27929CSo c27929CSo = new C27929CSo(this.A02, c006802i);
                P6x p6x = new P6x(c006802i);
                C0K8.A0D("connectivity_prober", "Begin connectivity probe.");
                C006802i c006802i2 = c27929CSo.A04;
                c006802i2.markerStart(79501264);
                c006802i2.markerAnnotate(79501264, "has_vpn", C0Wm.A00(c27929CSo.A03));
                C14270nr.A00().A01(new C27089BxE(new BFI(0, 23, c27929CSo, new C29349Cwi(p6x, c27929CSo))), 0L);
            }
            C09530e4 A00 = C19870yH.A00();
            boolean booleanValue = ((Boolean) A00.A00).booleanValue();
            str = (String) A00.A01;
            if (!booleanValue) {
                C0K8.A0D("proxy_service", "Proxy service disabled.");
            } else {
                C0K8.A0D("proxy_service", "Downloading ProxyService via Voltron.");
                c006802i.markerPoint(79499422, "download_service");
                c006802i.markerAnnotate(79499422, "init_reason", str);
                P4O p4o = new P4O(c006802i, this);
                MTC mtc = new MTC(EnumC27091Ti.A1C);
                mtc.A03 = C05F.A00;
                mtc.A02 = p4o;
                MTD mtd = new MTD(mtc);
                C1RQ.A00().A03(((AnonymousClass122) c211211o.A00()).A08(), mtd);
                return;
            }
        }
        c006802i.markerAnnotate(79499422, "cancel_reason", str);
        c006802i.markerEnd(79499422, (short) 4);
    }
}
