package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.drafts.model.migrations.mediadraft.impl.MediaDraftMigrator", f = "MediaDraftMigrator.kt", i = {0, 0, 1}, l = {31, 49}, m = "migrateMediaDrafts", n = {"this", "targetVersion", "this"}, s = {"L$0", "I$0", "L$0"})
/* renamed from: X.48T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48T extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C49222Od A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48T(C49222Od c49222Od, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A04 = c49222Od;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return this.A04.A00(this);
    }
}
