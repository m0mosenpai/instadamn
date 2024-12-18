package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository", f = "ClipsDraftRepository.kt", i = {0, 0, 0, 0, 0}, l = {510, 518}, m = "onDraftUpdated", n = {"this", "draft", "listener", "validUpdate", "isDuplicate"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0"})
/* loaded from: classes4.dex */
public final class B55 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ ClipsDraftRepository A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B55(ClipsDraftRepository clipsDraftRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = clipsDraftRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A06.A0A(null, null, this);
    }
}
