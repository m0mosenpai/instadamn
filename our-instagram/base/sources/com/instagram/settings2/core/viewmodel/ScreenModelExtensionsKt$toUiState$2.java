package com.instagram.settings2.core.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC27446C9o;
import X.AnonymousClass194;
import X.C0eB;
import X.C1JX;
import X.C45119Jxo;
import X.C47979LIr;
import X.C51750MtZ;
import X.C51752Mtb;
import X.C51759Mti;
import X.EnumC72365Xc1;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC57864PlU;
import X.O5Y;
import com.instagram.settings2.core.session.SettingsSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2", f = "ScreenModelExtensions.kt", i = {}, l = {134, 203}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ScreenModelExtensionsKt$toUiState$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final /* synthetic */ C51752Mtb A02;
    public final /* synthetic */ C51759Mti A03;
    public final /* synthetic */ InterfaceC57864PlU A04;
    public final /* synthetic */ SettingsSession A05;
    public final /* synthetic */ O5Y A06;
    public final /* synthetic */ SettingsScreenViewModel A07;
    public final /* synthetic */ EnumC72365Xc1 A08;
    public final /* synthetic */ C47979LIr A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ List A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    @DebugMetadata(c = "com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2$1", f = "ScreenModelExtensions.kt", i = {0, 1}, l = {149, 155, 190}, m = "invokeSuspend", n = {"$this$coroutineScope", "navigationRows"}, s = {"L$0", "L$0"})
    /* renamed from: com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int A00;
        public Object A01;
        public /* synthetic */ Object A02;
        public final /* synthetic */ InterfaceC57864PlU A03;
        public final /* synthetic */ SettingsSession A04;
        public final /* synthetic */ O5Y A05;
        public final /* synthetic */ SettingsScreenViewModel A06;
        public final /* synthetic */ EnumC72365Xc1 A07;
        public final /* synthetic */ C47979LIr A08;
        public final /* synthetic */ String A09;
        public final /* synthetic */ List A0A;
        public final /* synthetic */ boolean A0B;
        public final /* synthetic */ boolean A0C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC57864PlU interfaceC57864PlU, SettingsSession settingsSession, O5Y o5y, SettingsScreenViewModel settingsScreenViewModel, EnumC72365Xc1 enumC72365Xc1, C47979LIr c47979LIr, String str, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
            super(2, interfaceC23621Ds);
            this.A06 = settingsScreenViewModel;
            this.A07 = enumC72365Xc1;
            this.A0C = z;
            this.A09 = str;
            this.A03 = interfaceC57864PlU;
            this.A08 = c47979LIr;
            this.A0A = list;
            this.A04 = settingsSession;
            this.A0B = z2;
            this.A05 = o5y;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            SettingsScreenViewModel settingsScreenViewModel = this.A06;
            EnumC72365Xc1 enumC72365Xc1 = this.A07;
            boolean z = this.A0C;
            String str = this.A09;
            InterfaceC57864PlU interfaceC57864PlU = this.A03;
            C47979LIr c47979LIr = this.A08;
            List list = this.A0A;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC57864PlU, this.A04, this.A05, settingsScreenViewModel, enumC72365Xc1, c47979LIr, str, list, interfaceC23621Ds, z, this.A0B);
            anonymousClass1.A02 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00f8 A[Catch: CancellationException -> 0x01a0, TryCatch #0 {CancellationException -> 0x01a0, blocks: (B:7:0x00da, B:8:0x00dd, B:9:0x00f2, B:11:0x00f8, B:13:0x0113, B:14:0x011b, B:17:0x0129, B:21:0x012d, B:23:0x0131, B:25:0x013a, B:26:0x013e, B:29:0x013f, B:31:0x0147, B:34:0x018d, B:35:0x0190, B:37:0x009a, B:38:0x009d, B:39:0x00b3, B:41:0x00b9, B:43:0x00c1, B:45:0x00cc, B:49:0x0033, B:51:0x003b, B:53:0x0041, B:54:0x0073, B:56:0x0079, B:58:0x0081, B:60:0x008f, B:63:0x014d, B:64:0x0157, B:65:0x0167, B:67:0x016d, B:69:0x0175, B:71:0x0184), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b9 A[Catch: CancellationException -> 0x01a0, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01a0, blocks: (B:7:0x00da, B:8:0x00dd, B:9:0x00f2, B:11:0x00f8, B:13:0x0113, B:14:0x011b, B:17:0x0129, B:21:0x012d, B:23:0x0131, B:25:0x013a, B:26:0x013e, B:29:0x013f, B:31:0x0147, B:34:0x018d, B:35:0x0190, B:37:0x009a, B:38:0x009d, B:39:0x00b3, B:41:0x00b9, B:43:0x00c1, B:45:0x00cc, B:49:0x0033, B:51:0x003b, B:53:0x0041, B:54:0x0073, B:56:0x0079, B:58:0x0081, B:60:0x008f, B:63:0x014d, B:64:0x0157, B:65:0x0167, B:67:0x016d, B:69:0x0175, B:71:0x0184), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
        /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Iterable] */
        @Override // X.C1Dr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.ScreenModelExtensionsKt$toUiState$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.InterfaceC16620sF
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenModelExtensionsKt$toUiState$2(C51752Mtb c51752Mtb, C51759Mti c51759Mti, InterfaceC57864PlU interfaceC57864PlU, SettingsSession settingsSession, O5Y o5y, SettingsScreenViewModel settingsScreenViewModel, EnumC72365Xc1 enumC72365Xc1, C47979LIr c47979LIr, String str, List list, List list2, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC23621Ds);
        this.A02 = c51752Mtb;
        this.A03 = c51759Mti;
        this.A0B = list;
        this.A08 = enumC72365Xc1;
        this.A0F = z;
        this.A0A = str;
        this.A07 = settingsScreenViewModel;
        this.A0E = z2;
        this.A04 = interfaceC57864PlU;
        this.A09 = c47979LIr;
        this.A0C = list2;
        this.A05 = settingsSession;
        this.A0D = z3;
        this.A06 = o5y;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C51752Mtb c51752Mtb = this.A02;
        C51759Mti c51759Mti = this.A03;
        List list = this.A0B;
        EnumC72365Xc1 enumC72365Xc1 = this.A08;
        boolean z = this.A0F;
        String str = this.A0A;
        SettingsScreenViewModel settingsScreenViewModel = this.A07;
        boolean z2 = this.A0E;
        InterfaceC57864PlU interfaceC57864PlU = this.A04;
        C47979LIr c47979LIr = this.A09;
        List list2 = this.A0C;
        return new ScreenModelExtensionsKt$toUiState$2(c51752Mtb, c51759Mti, interfaceC57864PlU, this.A05, this.A06, settingsScreenViewModel, enumC72365Xc1, c47979LIr, str, list, list2, interfaceC23621Ds, z, z2, this.A0D);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC27446C9o abstractC27446C9o;
        C51752Mtb c51752Mtb;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                abstractC27446C9o = (AbstractC27446C9o) this.A01;
                AbstractC09560e7.A00(obj2);
                c51752Mtb = (C51752Mtb) obj2;
                C51759Mti c51759Mti = this.A03;
                List list = this.A0B;
                return new C45119Jxo(c51752Mtb, c51759Mti, abstractC27446C9o, this.A08, this.A0A, list, this.A0F);
            }
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            SettingsScreenViewModel settingsScreenViewModel = this.A07;
            EnumC72365Xc1 enumC72365Xc1 = this.A08;
            boolean z = this.A0E;
            String str = this.A0A;
            InterfaceC57864PlU interfaceC57864PlU = this.A04;
            C47979LIr c47979LIr = this.A09;
            List list2 = this.A0C;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC57864PlU, this.A05, this.A06, settingsScreenViewModel, enumC72365Xc1, c47979LIr, str, list2, null, z, this.A0D);
            this.A00 = 1;
            obj2 = AnonymousClass194.A00(this, anonymousClass1);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        abstractC27446C9o = (AbstractC27446C9o) obj2;
        C51752Mtb c51752Mtb2 = this.A02;
        if (c51752Mtb2 != null) {
            this.A01 = abstractC27446C9o;
            this.A00 = 2;
            obj2 = new C51752Mtb((C51750MtZ) c51752Mtb2.A02, c51752Mtb2.A01, c51752Mtb2.A00, 13);
            if (obj2 == c1jx) {
                return c1jx;
            }
            c51752Mtb = (C51752Mtb) obj2;
            C51759Mti c51759Mti2 = this.A03;
            List list3 = this.A0B;
            return new C45119Jxo(c51752Mtb, c51759Mti2, abstractC27446C9o, this.A08, this.A0A, list3, this.A0F);
        }
        c51752Mtb = null;
        C51759Mti c51759Mti22 = this.A03;
        List list32 = this.A0B;
        return new C45119Jxo(c51752Mtb, c51759Mti22, abstractC27446C9o, this.A08, this.A0A, list32, this.A0F);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScreenModelExtensionsKt$toUiState$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
