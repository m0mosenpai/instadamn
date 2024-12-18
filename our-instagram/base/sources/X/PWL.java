package X;

import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository", f = "CreatorAiSettingsRepository.kt", i = {0}, l = {85}, m = "setAutoRepliesEnabled", n = {"enabled"}, s = {"Z$0"})
/* loaded from: classes9.dex */
public final class PWL extends C1Dq {
    public int A00;
    public boolean A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ CreatorAiSettingsRepository A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWL(CreatorAiSettingsRepository creatorAiSettingsRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A03 = creatorAiSettingsRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A02 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A03.A01(null, this, false);
    }
}
