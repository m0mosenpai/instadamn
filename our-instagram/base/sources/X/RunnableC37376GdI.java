package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.GdI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37376GdI implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ InterfaceC41201vU A02;
    public final /* synthetic */ C97674a2 A03;
    public final /* synthetic */ boolean A04;

    public RunnableC37376GdI(UserSession userSession, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU, C97674a2 c97674a2, boolean z) {
        this.A03 = c97674a2;
        this.A00 = userSession;
        this.A02 = interfaceC41201vU;
        this.A01 = c84823qW;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C97674a2 c97674a2 = this.A03;
        UserSession userSession = this.A00;
        InterfaceC41201vU interfaceC41201vU = this.A02;
        C84823qW c84823qW = this.A01;
        boolean z = this.A04;
        PromptStickerModel promptStickerModel = c97674a2.A0B;
        if (promptStickerModel == null) {
            str = "model";
        } else {
            C8P8 c8p8 = c97674a2.A0A;
            if (c8p8 == null) {
                str = "sticker";
            } else {
                C97674a2.A00(userSession, c84823qW, interfaceC41201vU, c97674a2, c8p8, promptStickerModel, z);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
