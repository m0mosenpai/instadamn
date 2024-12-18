package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C53730NpJ;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes9.dex */
public final class LLMResponse extends C0T6 {
    public static final C53730NpJ Companion = new Object();

    @SerializedName("genaiViewModels")
    public final GenAIViewModels genAIViewModels;

    public final GenAIViewModels component1() {
        return this.genAIViewModels;
    }

    public final LLMResponse copy(GenAIViewModels genAIViewModels) {
        return new LLMResponse(genAIViewModels);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LLMResponse) && C14360o3.A0K(this.genAIViewModels, ((LLMResponse) obj).genAIViewModels));
    }

    public static /* synthetic */ LLMResponse copy$default(LLMResponse lLMResponse, GenAIViewModels genAIViewModels, int i, Object obj) {
        if ((i & 1) != 0) {
            genAIViewModels = lLMResponse.genAIViewModels;
        }
        return new LLMResponse(genAIViewModels);
    }

    public final GenAIViewModels getGenAIViewModels() {
        return this.genAIViewModels;
    }

    public int hashCode() {
        return AbstractC167017dG.A0M(this.genAIViewModels);
    }

    public LLMResponse(GenAIViewModels genAIViewModels) {
        this.genAIViewModels = genAIViewModels;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LLMResponse(genAIViewModels=");
        return AbstractC167017dG.A0o(this.genAIViewModels, A1C);
    }
}
