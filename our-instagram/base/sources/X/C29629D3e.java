package X;

import com.instagram.wonderwall.repository.WallPostRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wonderwall.repository.WallPostRepository", f = "WallPostRepository.kt", i = {0, 0, 0, 0}, l = {60}, m = "reactToWallPost", n = {"this", "wallPostItem", "currentReactionCount", "currentReaction"}, s = {"L$0", "L$1", "I$0", "Z$0"})
/* renamed from: X.D3e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29629D3e extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ WallPostRepository A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29629D3e(WallPostRepository wallPostRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = wallPostRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return this.A06.A01(null, null, this);
    }
}
