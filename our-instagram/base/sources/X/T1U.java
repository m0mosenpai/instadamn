package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T1U implements InterfaceC65498TlM {
    public final /* synthetic */ FbnsServiceDelegate A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public T1U(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, Map map) {
        this.A00 = fbnsServiceDelegate;
        this.A02 = str;
        this.A03 = map;
        this.A01 = str2;
    }

    @Override // X.InterfaceC65498TlM
    public final void DG6(Integer num) {
        FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0E;
        FbnsServiceDelegate.A02(this.A00, "reg_sent_fail", this.A02, this.A01, AbstractC62804SRy.A01(num), this.A03);
    }

    @Override // X.InterfaceC65498TlM
    public final void Dpi(long j) {
        FbnsServiceDelegate.A02(this.A00, "reg_sent_success", this.A02, this.A01, null, this.A03);
    }
}
