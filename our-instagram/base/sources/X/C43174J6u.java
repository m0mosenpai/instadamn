package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.AudioPageViewModel$viewState$1", f = "AudioPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.J6u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43174J6u extends AbstractC23611Dp implements InterfaceC16570sA {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ C38335GtV A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43174J6u(C38335GtV c38335GtV, InterfaceC23621Ds interfaceC23621Ds) {
        super(6, interfaceC23621Ds);
        this.A05 = c38335GtV;
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AbstractC166987dD.A1a(obj2);
        boolean A1a2 = AbstractC166987dD.A1a(obj3);
        boolean A1a3 = AbstractC166987dD.A1a(obj4);
        C43174J6u c43174J6u = new C43174J6u(this.A05, (InterfaceC23621Ds) obj6);
        c43174J6u.A00 = obj;
        c43174J6u.A02 = A1a;
        c43174J6u.A03 = A1a2;
        c43174J6u.A04 = A1a3;
        c43174J6u.A01 = obj5;
        return c43174J6u.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.AbstractC09560e7.A00(r16)
            java.lang.Object r10 = r15.A00
            java.util.List r10 = (java.util.List) r10
            boolean r11 = r15.A02
            boolean r12 = r15.A03
            boolean r13 = r15.A04
            java.lang.Object r2 = r15.A01
            X.HDl r2 = (X.C38959HDl) r2
            if (r2 == 0) goto L19
            X.3xD r7 = r2.A01()
            if (r7 != 0) goto L23
        L19:
            X.GtV r0 = r15.A05
            X.0do r0 = r0.A0F
            java.lang.Object r7 = r0.getValue()
            X.3xD r7 = (X.InterfaceC88553xD) r7
        L23:
            r0 = 0
            if (r2 == 0) goto L50
            java.lang.String r9 = r2.A07
            boolean r14 = r2.A0E
            X.Jxl r4 = r2.A03
            X.IGL r1 = r2.A05
            if (r1 == 0) goto L53
            X.3om r6 = r1.A02
        L32:
            X.GtV r1 = r15.A05
            com.instagram.api.schemas.MusicPageTabType r5 = r1.A08
            if (r2 == 0) goto L4e
            X.MtK r3 = r2.A00
            X.IGL r1 = r2.A05
            if (r1 == 0) goto L44
            com.instagram.api.schemas.MusicInfoImpl r1 = r1.A00
            if (r1 == 0) goto L44
            com.instagram.api.schemas.TrackData r0 = r1.A00
        L44:
            com.instagram.music.common.model.MusicAssetModel r8 = X.AbstractC37941Gme.A00(r0)
            X.Gyu r2 = new X.Gyu
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r2
        L4e:
            r3 = r0
            goto L44
        L50:
            r9 = r0
            r14 = 0
            r4 = r0
        L53:
            r6 = r0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43174J6u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
