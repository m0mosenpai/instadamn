package com.instagram.uxlogging.navigation;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C00O;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C2ZD;
import X.InterfaceC16620sF;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.uxlogging.navigation.NavigationObserver$start$1", f = "NavigationObserver.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class NavigationObserver$start$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;

    /* renamed from: com.instagram.uxlogging.navigation.NavigationObserver$start$1$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 implements InterfaceC19960yQ {
        public static final AnonymousClass2 A00 = new AnonymousClass2();

        /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
        
            if (r2 == true) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
        
            if (X.C15500q5.A00(X.C2ZD.A0A).remove(r1.A02) != false) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:129:0x017f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0178 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
        @Override // X.InterfaceC19960yQ
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final X.C0eB emit(X.C1KP r26, X.InterfaceC23621Ds r27) {
            /*
                Method dump skipped, instructions count: 540
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.uxlogging.navigation.NavigationObserver$start$1.AnonymousClass2.emit(X.1KP, X.1Ds):X.0eB");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationObserver$start$1(InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A01 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new NavigationObserver$start$1(interfaceC23621Ds, this.A01);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NavigationObserver$start$1((InterfaceC23621Ds) obj2, this.A01).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19390xP interfaceC19390xP = C2ZD.A07;
            if (interfaceC19390xP == null) {
                C14360o3.A0F("eventFlow");
                throw C00O.createAndThrow();
            }
            long j = this.A01;
            AnonymousClass2 anonymousClass2 = AnonymousClass2.A00;
            this.A00 = 1;
            if (interfaceC19390xP.collect(new NavigationObserver$start$1$invokeSuspend$$inlined$filter$1$2(anonymousClass2, j), this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
