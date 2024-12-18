package X;

import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.soundsync.viewmodel.ClipsSoundSyncViewModel$4", f = "ClipsSoundSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.PaP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57186PaP extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ double A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ C50870Me1 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57186PaP(C50870Me1 c50870Me1, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A04 = c50870Me1;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        double A00 = MSW.A00(obj3);
        boolean A1a = AbstractC166987dD.A1a(obj4);
        C57186PaP c57186PaP = new C57186PaP(this.A04, (InterfaceC23621Ds) obj5);
        c57186PaP.A01 = obj;
        c57186PaP.A02 = obj2;
        c57186PaP.A00 = A00;
        c57186PaP.A03 = A1a;
        return c57186PaP.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AbstractC09560e7.A00(obj);
        EnumC53101NeE enumC53101NeE = (EnumC53101NeE) this.A01;
        Bitmap bitmap = (Bitmap) this.A02;
        double d = this.A00;
        if (!this.A03) {
            switch (AbstractC54352O0k.A00[enumC53101NeE.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 7:
                    z = false;
                    break;
                default:
                    throw B4Z.A00();
            }
            return new C51663Mru(bitmap, enumC53101NeE, d, z);
        }
        z = true;
        return new C51663Mru(bitmap, enumC53101NeE, d, z);
    }
}
