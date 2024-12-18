package X;

import com.instagram.barcelona.weblink.WebLinkUseCase;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.weblink.WebLinkUseCase", f = "WebLinkUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {98, 132}, m = "processWebLink", n = {"this", "url", "sourceModule", "urlSource", "shimmedUrl", "postId", "this", "sourceModule", "urlSource", "postId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes8.dex */
public final class MAA extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ WebLinkUseCase A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAA(WebLinkUseCase webLinkUseCase, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = webLinkUseCase;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A08.A00(null, null, null, null, null, this, 0L);
    }
}
