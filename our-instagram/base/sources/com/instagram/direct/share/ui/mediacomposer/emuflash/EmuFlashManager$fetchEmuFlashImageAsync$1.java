package com.instagram.direct.share.ui.mediacomposer.emuflash;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C160587Hs;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.share.ui.mediacomposer.emuflash.EmuFlashManager$fetchEmuFlashImageAsync$1", f = "EmuFlashManager.kt", i = {1}, l = {265, 275}, m = "invokeSuspend", n = {"qplMarkerId"}, s = {"I$0"})
/* loaded from: classes8.dex */
public final class EmuFlashManager$fetchEmuFlashImageAsync$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C160587Hs A03;
    public final /* synthetic */ DirectThreadKey A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmuFlashManager$fetchEmuFlashImageAsync$1(UserSession userSession, C160587Hs c160587Hs, DirectThreadKey directThreadKey, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = c160587Hs;
        this.A05 = str;
        this.A02 = userSession;
        this.A04 = directThreadKey;
        this.A06 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new EmuFlashManager$fetchEmuFlashImageAsync$1(this.A02, this.A03, this.A04, this.A05, interfaceC23621Ds, this.A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.ui.mediacomposer.emuflash.EmuFlashManager$fetchEmuFlashImageAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmuFlashManager$fetchEmuFlashImageAsync$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
