package X;

import com.instagram.pendingmedia.service.impl.ShareVideoHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.pendingmedia.service.impl.ShareVideoHelper", f = "ShareVideoHelper.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {40, 49, 57}, m = "tryNextStep$fbandroid_java_com_instagram_pendingmedia_service_impl_impl", n = {"uploadAttempt", "userSession", "reliabilityLogger", "targetStatus", "triedSomething", "uploadAttempt", "reliabilityLogger", "targetStatus", "triedSomething", "uploadAttempt", "reliabilityLogger", "targetStatus", "triedSomething"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes9.dex */
public final class PWZ extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ ShareVideoHelper A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWZ(ShareVideoHelper shareVideoHelper, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0A = shareVideoHelper;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A09 = obj;
        this.A03 |= Integer.MIN_VALUE;
        return this.A0A.A00(null, this);
    }
}
