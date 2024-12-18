package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.stories.draft.migrators.StoryDraftMigrator$onUserSessionStart$1", f = "StoryDraftMigrator.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class B5E extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ C2Q3 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5E(C2Q3 c2q3, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = c2q3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new B5E(this.A01, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new B5E(this.A01, (InterfaceC23621Ds) obj2).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C2Q3 c2q3 = this.A01;
            this.A00 = 1;
            if (C2Q3.A00(c2q3, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
