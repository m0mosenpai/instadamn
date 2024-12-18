package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.soundsync.viewmodel.ClipsSoundSyncViewModel$3", f = "ClipsSoundSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.PZy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57175PZy extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ double A00;
    public /* synthetic */ double A01;
    public final /* synthetic */ C50870Me1 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57175PZy(C50870Me1 c50870Me1, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = c50870Me1;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        double A00 = MSW.A00(obj);
        double A002 = MSW.A00(obj2);
        C57175PZy c57175PZy = new C57175PZy(this.A02, (InterfaceC23621Ds) obj3);
        c57175PZy.A00 = A00;
        c57175PZy.A01 = A002;
        return c57175PZy.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        double d = this.A00;
        double d2 = this.A01;
        if (this.A02.A0H.A01) {
            d2 = (d2 * 0.2d) + (d * 0.8d);
        }
        return new Double(d2);
    }
}
