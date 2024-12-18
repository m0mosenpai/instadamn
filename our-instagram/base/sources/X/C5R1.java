package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.5R1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5R1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC116925Qy A01;
    public final /* synthetic */ ClipsViewerConfig A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AbstractC39459Hbl A04;
    public final /* synthetic */ C5Qu A05;
    public final /* synthetic */ C37671Gi4 A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5R1(Context context, InterfaceC116925Qy interfaceC116925Qy, ClipsViewerConfig clipsViewerConfig, UserSession userSession, AbstractC39459Hbl abstractC39459Hbl, C5Qu c5Qu, C37671Gi4 c37671Gi4, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        super(0);
        this.A03 = userSession;
        this.A07 = str;
        this.A06 = c37671Gi4;
        this.A05 = c5Qu;
        this.A08 = str2;
        this.A01 = interfaceC116925Qy;
        this.A02 = clipsViewerConfig;
        this.A0A = z;
        this.A0B = z2;
        this.A04 = abstractC39459Hbl;
        this.A00 = context;
        this.A09 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean A06 = C18U.A06(C06090Tz.A05, this.A03, 36319746693537418L);
        String str = this.A07;
        C37671Gi4 c37671Gi4 = this.A06;
        C5Qu c5Qu = this.A05;
        String str2 = this.A08;
        InterfaceC116925Qy interfaceC116925Qy = this.A01;
        ClipsViewerConfig clipsViewerConfig = this.A02;
        Integer num = clipsViewerConfig.A0c;
        boolean z = this.A0A;
        boolean z2 = this.A0B;
        AbstractC39459Hbl abstractC39459Hbl = this.A04;
        Context context = this.A00;
        String str3 = clipsViewerConfig.A0w;
        InterfaceC16820sZ interfaceC16820sZ = this.A09;
        if (A06) {
            return new C5R3(context, interfaceC116925Qy, abstractC39459Hbl, c5Qu, c37671Gi4, num, str, str2, str3, interfaceC16820sZ, z, z2);
        }
        return new C5R3(context, interfaceC116925Qy, abstractC39459Hbl, c5Qu, c37671Gi4, num, str, str2, str3, interfaceC16820sZ, z, z2);
    }
}
