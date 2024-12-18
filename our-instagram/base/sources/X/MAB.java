package X;

import com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel", f = "MagicMediaRemixViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {157, 164}, m = "getSmartAlbumSuggestions", n = {"this", "magicMediaRemixRepository", "contentCompositor", "bitmapSaver", "experimentHelper", "magicMediaDraftsDirectoryProvider", "screenWidth"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
/* loaded from: classes8.dex */
public final class MAB extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ MagicMediaRemixViewModel A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MAB(MagicMediaRemixViewModel magicMediaRemixViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A09 = magicMediaRemixViewModel;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A08 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return MagicMediaRemixViewModel.A00(null, null, null, null, null, this.A09, null, null, this, 0);
    }
}
