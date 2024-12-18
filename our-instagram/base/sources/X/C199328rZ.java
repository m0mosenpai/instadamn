package X;

import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.stickersearch.AvatarStickerPreRenderInteractor", f = "AvatarStickerPreRenderInteractor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {140, 150}, m = "refreshStickerPack", n = {"this", "surface", "stickerPackType", "instanceKey", "joinId", "isVersioningEnabled", "shouldUpdateAvatarVersion", "this", "surface", "stickerPackType", "instanceKey", "isVersioningEnabled", "shouldUpdateAvatarVersion"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
/* renamed from: X.8rZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199328rZ extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public boolean A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ AvatarStickerPreRenderInteractor A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199328rZ(AvatarStickerPreRenderInteractor avatarStickerPreRenderInteractor, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A09 = avatarStickerPreRenderInteractor;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A08 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A09.A03(null, null, this, false, false);
    }
}
