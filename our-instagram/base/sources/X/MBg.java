package X;

import com.facebook.commonavatarliveediting.CdlProviderImpl;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MBg extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 1;
    public final Object A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBg(CdlProviderImpl cdlProviderImpl, Boolean bool, Integer num, String str, String str2, Map map, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        super(2, interfaceC23621Ds);
        this.A06 = cdlProviderImpl;
        this.A08 = str;
        this.A01 = interfaceC16620sF;
        this.A02 = map;
        this.A03 = bool;
        this.A04 = num;
        this.A07 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A05 != 0) {
            return new MBg((C164417Xe) this.A06, this.A07, this.A08, interfaceC23621Ds);
        }
        CdlProviderImpl cdlProviderImpl = (CdlProviderImpl) this.A06;
        String str = this.A08;
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A01;
        return new MBg(cdlProviderImpl, (Boolean) this.A03, (Integer) this.A04, str, this.A07, (Map) this.A02, interfaceC23621Ds, interfaceC16620sF);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBg) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBg(C164417Xe c164417Xe, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = c164417Xe;
        this.A07 = str;
        this.A08 = str2;
    }
}
