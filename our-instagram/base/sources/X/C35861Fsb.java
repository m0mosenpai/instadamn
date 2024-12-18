package X;

import java.util.Map;

/* renamed from: X.Fsb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35861Fsb implements InterfaceC65345TiS {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC24901Jp A01;

    public C35861Fsb(String str, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = str;
        this.A01 = interfaceC24901Jp;
    }

    @Override // X.InterfaceC65345TiS
    public final void Dgd(SYG syg, EnumC61185Rgl enumC61185Rgl, Map map) {
        String str;
        InterfaceC24901Jp interfaceC24901Jp;
        Object obj;
        AbstractC61609RqY abstractC61609RqY = (AbstractC61609RqY) map.get(this.A00);
        if (abstractC61609RqY != null) {
            str = abstractC61609RqY.A03();
        } else {
            str = null;
        }
        if (syg.A00 == 0 && str != null) {
            interfaceC24901Jp = this.A01;
            obj = new C32928Ee9(str);
        } else {
            interfaceC24901Jp = this.A01;
            obj = C32930EeB.A00;
        }
        interfaceC24901Jp.resumeWith(obj);
    }
}
