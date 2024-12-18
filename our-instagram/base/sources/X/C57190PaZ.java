package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.soundsync.viewmodel.ClipsSoundSyncViewModel$2", f = "ClipsSoundSyncViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.PaZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57190PaZ extends AbstractC23611Dp implements C0s9 {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;
    public /* synthetic */ boolean A05;
    public final /* synthetic */ C50870Me1 A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57190PaZ(C50870Me1 c50870Me1, InterfaceC23621Ds interfaceC23621Ds) {
        super(7, interfaceC23621Ds);
        this.A06 = c50870Me1;
    }

    @Override // X.C0s9
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        boolean A1a3 = AbstractC166987dD.A1a(obj3);
        boolean A1a4 = AbstractC166987dD.A1a(obj4);
        boolean A1a5 = AbstractC166987dD.A1a(obj5);
        boolean A1a6 = AbstractC166987dD.A1a(obj6);
        C57190PaZ c57190PaZ = new C57190PaZ(this.A06, (InterfaceC23621Ds) obj7);
        c57190PaZ.A00 = A1a;
        c57190PaZ.A01 = A1a2;
        c57190PaZ.A02 = A1a3;
        c57190PaZ.A03 = A1a4;
        c57190PaZ.A04 = A1a5;
        c57190PaZ.A05 = A1a6;
        return c57190PaZ.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        boolean z = this.A00;
        boolean z2 = this.A01;
        boolean z3 = this.A02;
        boolean z4 = this.A03;
        boolean z5 = this.A04;
        boolean z6 = this.A05;
        if (!z5 && !this.A06.A0E.A08) {
            return EnumC53101NeE.A08;
        }
        if (z6) {
            return EnumC53101NeE.A06;
        }
        if (z) {
            return EnumC53101NeE.A07;
        }
        if (z4) {
            return EnumC53101NeE.A03;
        }
        if (z2) {
            return EnumC53101NeE.A04;
        }
        if (z3) {
            return EnumC53101NeE.A05;
        }
        C183348Bh c183348Bh = this.A06.A0D;
        C1QT c1qt = c183348Bh.A0J;
        long j = c183348Bh.A09;
        AHF ahf = new AHF(c1qt);
        ahf.A01 = j;
        ahf.A02();
        return EnumC53101NeE.A02;
    }
}
