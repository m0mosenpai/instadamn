package X;

import android.content.Context;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.SsZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63719SsZ implements InterfaceC65569Tn2 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final boolean A07;

    public final void A02(Context context, InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637) {
        C14360o3.A0B(anonymousClass637, 1);
        A00(context, interfaceC65469Tkm, anonymousClass637, true);
    }

    @Override // X.InterfaceC65569Tn2
    public final void E2V(Context context, InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637) {
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(anonymousClass637, interfaceC65469Tkm);
        A00(context, interfaceC65469Tkm, anonymousClass637, false);
    }

    private final void A00(Context context, InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637, boolean z) {
        int Bql = interfaceC65469Tkm.Bql();
        C1LN.A01("BloksScreenQuery.parallelFetch");
        String str = this.A02;
        Map map = this.A06;
        long j = this.A01;
        boolean z2 = this.A07;
        Integer valueOf = Integer.valueOf(Bql);
        LinkedHashMap A04 = AbstractC06930Yk.A04(map, AbstractC167007dF.A0n("__infra__container_config_id", valueOf));
        C1339263a A00 = AnonymousClass638.A00(anonymousClass637);
        java.util.Set singleton = Collections.singleton("__infra__container_config_id");
        C14360o3.A07(singleton);
        A00.A03(EnumC58683Pzw.A04, null, str, A04, singleton, j, z2, true);
        C1LN.A00();
        C1LN.A01("BloksScreenQuery.loadPrebundledRoot");
        C1338462s A002 = ST9.A00(context, interfaceC65469Tkm.BfI());
        C1LN.A00();
        WTT wtt = new WTT(interfaceC65469Tkm, A002, null, this.A03, AbstractC06930Yk.A04(AbstractC06930Yk.A04(this.A05, A01()), AbstractC167007dF.A0n("__infra__container_config_id", valueOf)), null);
        C1LN.A01("BloksScreenQuery.openScreen");
        AbstractC86593tX.A0O(context, wtt, anonymousClass637, Bql, z);
        C1LN.A00();
    }

    public final Map A01() {
        C06860Yd c06860Yd = new C06860Yd();
        c06860Yd.put("__infra__app_id", this.A02);
        String str = this.A04;
        if (str == null) {
            str = String.valueOf(new SecureRandom().nextInt());
        }
        c06860Yd.put("__infra__screen_id", str);
        c06860Yd.put("__infra__cache_ttl", Long.valueOf(this.A01));
        c06860Yd.put("__infra__enable_disk_cache", Boolean.valueOf(this.A07));
        c06860Yd.put("__infra__preloaded_params", this.A06);
        c06860Yd.put("__infra__ttrc_marker_id", Integer.valueOf(this.A00));
        return AbstractC16850sd.A0N(c06860Yd);
    }

    @Override // X.InterfaceC65569Tn2
    public final String Bqk() {
        return this.A04;
    }

    public C63719SsZ(String str, String str2, String str3, Map map, Map map2, int i, long j, boolean z) {
        AbstractC167017dG.A1R(map, map2);
        this.A02 = str;
        this.A05 = map;
        this.A06 = map2;
        this.A01 = j;
        this.A07 = z;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = str3;
    }

    @Override // X.InterfaceC65569Tn2
    public final java.util.Set Ajb(InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637) {
        AbstractC167017dG.A1N(interfaceC65469Tkm, anonymousClass637);
        String str = this.A02;
        int Bql = interfaceC65469Tkm.Bql();
        long j = this.A01;
        C1339263a A00 = AnonymousClass638.A00(anonymousClass637);
        Map A0n = AbstractC167007dF.A0n("__infra__container_config_id", Integer.valueOf(Bql));
        EnumC61117RfX enumC61117RfX = EnumC61117RfX.A04;
        java.util.Set singleton = Collections.singleton(enumC61117RfX);
        C14360o3.A07(singleton);
        boolean A05 = A00.A05(str, A0n, singleton, j);
        EnumC61117RfX enumC61117RfX2 = EnumC61117RfX.A03;
        java.util.Set singleton2 = Collections.singleton(enumC61117RfX2);
        C14360o3.A07(singleton2);
        boolean A052 = A00.A05(str, A0n, singleton2, j);
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        if (A05) {
            A0l.add(enumC61117RfX);
        }
        if (A052) {
            A0l.add(enumC61117RfX2);
        }
        return A0l;
    }

    @Override // X.InterfaceC65569Tn2
    public final void COy(InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637) {
        AbstractC167017dG.A1N(interfaceC65469Tkm, anonymousClass637);
        AnonymousClass638.A00(anonymousClass637).A04(this.A02, AbstractC167007dF.A0n("__infra__container_config_id", Integer.valueOf(interfaceC65469Tkm.Bql())), EnumC61117RfX.A00);
    }

    @Override // X.InterfaceC65569Tn2
    public final void E5D(InterfaceC65469Tkm interfaceC65469Tkm, AnonymousClass637 anonymousClass637, MPY mpy, boolean z) {
        AbstractC167017dG.A1O(interfaceC65469Tkm, anonymousClass637);
        String str = this.A02;
        int Bql = interfaceC65469Tkm.Bql();
        Map map = this.A06;
        long j = this.A01;
        boolean z2 = this.A07;
        LinkedHashMap A04 = AbstractC06930Yk.A04(map, AbstractC167007dF.A0n("__infra__container_config_id", Integer.valueOf(Bql)));
        C1339263a A00 = AnonymousClass638.A00(anonymousClass637);
        java.util.Set singleton = Collections.singleton("__infra__container_config_id");
        C14360o3.A07(singleton);
        A00.A03(EnumC58683Pzw.A05, mpy, str, A04, singleton, j, z2, z);
    }
}
