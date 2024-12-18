package androidx.compose.foundation.gestures;

import X.C137786Mb;
import X.C57B;
import X.C6MC;
import X.C6Me;
import X.InterfaceC1128957x;
import X.InterfaceC16660sJ;

/* loaded from: classes3.dex */
public abstract class ScrollableKt {
    public static final InterfaceC16660sJ A03 = C137786Mb.A00;
    public static final C6MC A00 = new C6MC() { // from class: X.6Mc
        @Override // X.C6MC
        public final float EMD(float f) {
            return f;
        }
    };
    public static final C57B A02 = new C57B() { // from class: X.6Md
        @Override // X.C57B
        public final float BqR() {
            return 1.0f;
        }

        @Override // X.C12W
        public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
            C14360o3.A0B(interfaceC16620sF, 2);
            return interfaceC16620sF.invoke(obj, this);
        }

        @Override // X.C12V
        public final /* synthetic */ InterfaceC212412b getKey() {
            return C57B.A00;
        }

        @Override // X.C12V, X.C12W
        public final C12V get(InterfaceC212412b interfaceC212412b) {
            return AnonymousClass190.A00(this, interfaceC212412b);
        }

        @Override // X.C12W
        public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
            return AnonymousClass190.A01(this, interfaceC212412b);
        }

        @Override // X.C12W
        public final C12W plus(C12W c12w) {
            return AnonymousClass190.A02(this, c12w);
        }
    };
    public static final C6Me A01 = new InterfaceC1128957x() { // from class: X.6Me
        @Override // X.InterfaceC1128957x
        public final float Awk() {
            return 1.0f;
        }

        @Override // X.C57y
        public final float B7e() {
            return 1.0f;
        }

        @Override // X.InterfaceC1128957x
        public final /* synthetic */ int EL8(float f) {
            return AbstractC119105aS.A01(this, f);
        }

        @Override // X.C57y
        public final /* synthetic */ float EqG(long j) {
            return AbstractC122655h0.A00(this, j);
        }

        @Override // X.InterfaceC1128957x
        public final /* synthetic */ float EqI(int i) {
            return i / 1.0f;
        }

        @Override // X.InterfaceC1128957x
        public final /* synthetic */ long EqJ(long j) {
            return AbstractC119105aS.A03(this, j);
        }

        @Override // X.InterfaceC1128957x
        public final /* synthetic */ float EqS(long j) {
            return AbstractC119105aS.A00(this, j);
        }

        @Override // X.InterfaceC1128957x
        public final /* synthetic */ long F7k(long j) {
            return AbstractC119105aS.A04(this, j);
        }

        @Override // X.C57y
        public final /* synthetic */ long F7l(float f) {
            return AbstractC122655h0.A01(this, f);
        }

        @Override // X.InterfaceC1128957x
        public final /* synthetic */ float EqH(float f) {
            return f / 1.0f;
        }

        @Override // X.InterfaceC1128957x
        public final /* synthetic */ float EqT(float f) {
            return f * 1.0f;
        }

        @Override // X.InterfaceC1128957x
        public final /* synthetic */ long F7m(float f) {
            return F7l(EqH(f));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(androidx.compose.foundation.gestures.ScrollingLogic r9, X.InterfaceC23621Ds r10, long r11) {
        /*
            r5 = r9
            r4 = 6
            boolean r0 = X.MAN.A02(r10, r4)
            if (r0 == 0) goto L56
            r3 = r10
            X.MAN r3 = (X.MAN) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r2 = r3.A03
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r8 = 1
            if (r0 == 0) goto L38
            if (r0 != r8) goto L5c
            java.lang.Object r6 = r3.A02
            X.0pO r6 = (X.C15080pO) r6
            java.lang.Object r5 = r3.A01
            androidx.compose.foundation.gestures.ScrollingLogic r5 = (androidx.compose.foundation.gestures.ScrollingLogic) r5
            X.AbstractC09560e7.A00(r2)
        L2c:
            float r0 = r6.A00
            long r1 = r5.A02(r0)
            X.5at r0 = new X.5at
            r0.<init>(r1)
            return r0
        L38:
            X.AbstractC09560e7.A00(r2)
            X.0pO r6 = new X.0pO
            r6.<init>()
            X.C5d r0 = X.EnumC27348C5d.Default
            r7 = 0
            X.BSy r4 = new X.BSy
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A01 = r5
            r3.A02 = r6
            r3.A00 = r8
            java.lang.Object r0 = r5.A03(r0, r3, r4)
            if (r0 != r1) goto L2c
            return r1
        L56:
            X.MAN r3 = new X.MAN
            r3.<init>(r4, r10)
            goto L16
        L5c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.A00(androidx.compose.foundation.gestures.ScrollingLogic, X.1Ds, long):java.lang.Object");
    }
}
