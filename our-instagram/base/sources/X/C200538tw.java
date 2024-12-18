package X;

import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.stickersearch.AvatarStickerPreRenderInteractor", f = "AvatarStickerPreRenderInteractor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {71, 90}, m = "refreshStickerPackGraphQL", n = {"this", "surface", "stickerPackType", "isVersioningEnabled", "shouldUpdateAvatarVersion", "this", "surface", "stickerPackType", "instanceKey", "isVersioningEnabled", "shouldUpdateAvatarVersion"}, s = {"L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
/* renamed from: X.8tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200538tw extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ AvatarStickerPreRenderInteractor A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C200538tw(AvatarStickerPreRenderInteractor avatarStickerPreRenderInteractor, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = avatarStickerPreRenderInteractor;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A08.A04(null, null, this, false, false);
    }
}
