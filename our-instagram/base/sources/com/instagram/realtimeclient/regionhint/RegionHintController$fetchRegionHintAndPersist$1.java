package com.instagram.realtimeclient.regionhint;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.C06840Yb;
import X.C0eB;
import X.C19L;
import X.C1JX;
import X.InterfaceC09250da;
import X.InterfaceC14180ni;
import X.InterfaceC16620sF;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.realtimeclient.regionhint.RegionHintController$fetchRegionHintAndPersist$1", f = "RegionHintController.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class RegionHintController$fetchRegionHintAndPersist$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ RegionHintController this$0;

    /* renamed from: com.instagram.realtimeclient.regionhint.RegionHintController$fetchRegionHintAndPersist$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class AnonymousClass1 implements InterfaceC19960yQ, InterfaceC14180ni {
        public final /* synthetic */ RegionHintController $tmp0;

        public AnonymousClass1(RegionHintController regionHintController) {
            this.$tmp0 = regionHintController;
        }

        @Override // X.InterfaceC14180ni
        public final InterfaceC09250da getFunctionDelegate() {
            return new C06840Yb(2, this.$tmp0, RegionHintController.class, "handleRegionHint", "handleRegionHint(Ljava/lang/String;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // X.InterfaceC19960yQ
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            this.$tmp0.handleRegionHint((String) obj);
            return C0eB.A00;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof InterfaceC19960yQ) || !(obj instanceof InterfaceC14180ni)) {
                return false;
            }
            return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
        }

        public final Object emit(String str, InterfaceC23621Ds interfaceC23621Ds) {
            this.$tmp0.handleRegionHint(str);
            return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionHintController$fetchRegionHintAndPersist$1(RegionHintController regionHintController, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = regionHintController;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new RegionHintController$fetchRegionHintAndPersist$1(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return new RegionHintController$fetchRegionHintAndPersist$1(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC19390xP regionHintFlow;
        C1JX c1jx = C1JX.A02;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC09560e7.A00(obj);
            } else {
                throw AbstractC166987dD.A13();
            }
        } else {
            AbstractC09560e7.A00(obj);
            regionHintFlow = this.this$0.regionHintFlow();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (regionHintFlow.collect(anonymousClass1, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    public static final /* synthetic */ Object access$invokeSuspend$handleRegionHint(RegionHintController regionHintController, String str, InterfaceC23621Ds interfaceC23621Ds) {
        regionHintController.handleRegionHint(str);
        return C0eB.A00;
    }

    public static final /* synthetic */ Object invokeSuspend$handleRegionHint(RegionHintController regionHintController, String str, InterfaceC23621Ds interfaceC23621Ds) {
        regionHintController.handleRegionHint(str);
        return C0eB.A00;
    }
}
