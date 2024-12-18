package com.instagram.creation.genai.themes.domain;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C25870BcR;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.genai.themes.domain.AiThemesViewModel$onExamplePromptClicked$1", f = "AiThemesViewModel.kt", i = {0, 0, 0, 0}, l = {216}, m = "invokeSuspend", n = {"$this$launch", "promptTrimmed", "stringBuffer", "i"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes5.dex */
public final class AiThemesViewModel$onExamplePromptClicked$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ C25870BcR A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiThemesViewModel$onExamplePromptClicked$1(C25870BcR c25870BcR, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A07 = str;
        this.A06 = c25870BcR;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        AiThemesViewModel$onExamplePromptClicked$1 aiThemesViewModel$onExamplePromptClicked$1 = new AiThemesViewModel$onExamplePromptClicked$1(this.A06, this.A07, interfaceC23621Ds);
        aiThemesViewModel$onExamplePromptClicked$1.A05 = obj;
        return aiThemesViewModel$onExamplePromptClicked$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a0 A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:5:0x0016, B:7:0x00a0, B:8:0x0066, B:13:0x00a4, B:23:0x002e, B:24:0x0032, B:27:0x004b), top: B:2:0x0004 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x009b -> B:6:0x009e). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.themes.domain.AiThemesViewModel$onExamplePromptClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiThemesViewModel$onExamplePromptClicked$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
