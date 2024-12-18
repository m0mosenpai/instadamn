package X;

import com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel", f = "MagicMediaRemixViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {340}, m = "maybeGenerateNewComposition", n = {"$this$maybeGenerateNewComposition", "suggestionModel", "layoutsByType", "draftPreviews", "contentCompositor", "bitmapSaver", "magicMediaDraftsDirectoryProvider", "albumWithoutVideos", "destination$iv$iv", "screenWidth"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0"})
/* loaded from: classes8.dex */
public final class MAC extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public /* synthetic */ Object A0C;
    public final /* synthetic */ MagicMediaRemixViewModel A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAC(MagicMediaRemixViewModel magicMediaRemixViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0D = magicMediaRemixViewModel;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A0C = obj;
        this.A01 |= Integer.MIN_VALUE;
        return MagicMediaRemixViewModel.A02(null, null, null, null, this.A0D, null, null, null, null, this, 0);
    }
}
