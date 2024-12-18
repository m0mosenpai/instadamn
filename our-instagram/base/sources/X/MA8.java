package X;

import com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.avatars.suggestions.ContextualSuggestionsPerIntentRepository", f = "ContextualSuggestionsPerIntentRepository.kt", i = {0, 0, 0, 0, 1, 1}, l = {213, 231}, m = "tryFetchStickersInternal", n = {"this", "intents", "isPrefetch", "forceNetwork", "this", "instanceKey"}, s = {"L$0", "L$1", "Z$0", "Z$1", "L$0", "I$0"})
/* loaded from: classes8.dex */
public final class MA8 extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ ContextualSuggestionsPerIntentRepository A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MA8(ContextualSuggestionsPerIntentRepository contextualSuggestionsPerIntentRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A07 = contextualSuggestionsPerIntentRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return ContextualSuggestionsPerIntentRepository.A03(this.A07, null, this, false, false);
    }
}
