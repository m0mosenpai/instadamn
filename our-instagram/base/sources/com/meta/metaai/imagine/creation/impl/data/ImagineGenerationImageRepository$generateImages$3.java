package com.meta.metaai.imagine.creation.impl.data;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC25231BEo;
import X.AnonymousClass191;
import X.C05F;
import X.C0eB;
import X.C19L;
import X.C50112Sa;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC50122Sb;
import X.PXZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3", f = "ImagineGenerationImageRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ImagineGenerationImageRepository$generateImages$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImagineGenerationImageRepository A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    @DebugMetadata(c = "com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3$1", f = "ImagineGenerationImageRepository.kt", i = {1, 1, 1, 1, 1, 1}, l = {160, 179}, m = "invokeSuspend", n = {"imageGeneratedImageResponse", "$this$update$iv", "prevValue$iv", "oldResponse", "oldImages", "firstAvailableIndex"}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "I$0"})
    /* renamed from: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int A00;
        public int A01;
        public Object A02;
        public Object A03;
        public Object A04;
        public Object A05;
        public Object A06;
        public Object A07;
        public Object A08;
        public boolean A09;
        public final /* synthetic */ int A0A;
        public final /* synthetic */ ImagineGenerationImageRepository A0B;
        public final /* synthetic */ String A0C;
        public final /* synthetic */ String A0D;
        public final /* synthetic */ String A0E;
        public final /* synthetic */ InterfaceC50122Sb A0F;
        public final /* synthetic */ boolean A0G;
        public final /* synthetic */ boolean A0H;
        public final /* synthetic */ boolean A0I;
        public final /* synthetic */ boolean A0J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImagineGenerationImageRepository imagineGenerationImageRepository, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, InterfaceC50122Sb interfaceC50122Sb, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            super(2, interfaceC23621Ds);
            this.A0C = str;
            this.A0D = str2;
            this.A0B = imagineGenerationImageRepository;
            this.A0H = z;
            this.A0G = z2;
            this.A0A = i;
            this.A0I = z3;
            this.A0E = str3;
            this.A0J = z4;
            this.A0F = interfaceC50122Sb;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            String str = this.A0C;
            String str2 = this.A0D;
            ImagineGenerationImageRepository imagineGenerationImageRepository = this.A0B;
            boolean z = this.A0H;
            boolean z2 = this.A0G;
            int i = this.A0A;
            boolean z3 = this.A0I;
            return new AnonymousClass1(imagineGenerationImageRepository, str, str2, this.A0E, interfaceC23621Ds, this.A0F, i, z, z2, z3, this.A0J);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0135 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x014a -> B:15:0x01a3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x016a -> B:5:0x002e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x016f -> B:15:0x01a3). Please report as a decompilation issue!!! */
        @Override // X.C1Dr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instructions count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateImages$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.InterfaceC16620sF
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagineGenerationImageRepository$generateImages$3(ImagineGenerationImageRepository imagineGenerationImageRepository, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A08 = z;
        this.A02 = imagineGenerationImageRepository;
        this.A04 = str;
        this.A03 = str2;
        this.A06 = z2;
        this.A05 = z3;
        this.A07 = z4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ImagineGenerationImageRepository$generateImages$3 imagineGenerationImageRepository$generateImages$3 = new ImagineGenerationImageRepository$generateImages$3(this.A02, this.A04, this.A03, interfaceC23621Ds, this.A01, this.A08, this.A06, this.A05, this.A07);
        imagineGenerationImageRepository$generateImages$3.A00 = obj;
        return imagineGenerationImageRepository$generateImages$3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ImagineGenerationImageRepository$generateImages$3) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        C19L c19l = (C19L) this.A00;
        String A0p = AbstractC25231BEo.A0p();
        boolean z = this.A08;
        ImagineGenerationImageRepository imagineGenerationImageRepository = this.A02;
        String str = this.A04;
        PXZ pxz = new PXZ(imagineGenerationImageRepository, str, null, 18, z);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        C50112Sa A01 = AbstractC23641Du.A01(num, anonymousClass191, pxz, c19l);
        int i = this.A01;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                AbstractC23641Du.A03(num, anonymousClass191, new AnonymousClass1(imagineGenerationImageRepository, this.A03, str, A0p, null, A01, i2, this.A06, this.A05, this.A07, z), c19l);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return C0eB.A00;
    }
}
