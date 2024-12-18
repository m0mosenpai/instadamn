package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gqy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38193Gqy implements InterfaceC61432r6 {
    public boolean A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC60442pS A05;
    public final C1M6 A06;
    public final C61412r4 A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.3ry, java.lang.Object] */
    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        Map AUS;
        LinkedHashMap A0i = AbstractC37302Gc3.A0i(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.A0A && (this.A08 || this.A09)) {
            AbstractC37302Gc3.A1X(str, A0i, this.A03);
            if (this.A09) {
                AUS = AbstractC37302Gc3.A0k(str, this.A02);
            }
            this.A06.EIH(new Object(), this.A05.getModuleName(), str, AbstractC001800i.A0a(A0i.keySet()), AbstractC06930Yk.A0B(A0i), AbstractC37300Gc1.A00(currentTimeMillis));
            return A0i;
        }
        if (this.A00) {
            AbstractC37303Gc4.A1P(str, A0i, this.A04);
        }
        A0i.putAll(AbstractC37302Gc3.A0k(str, this.A02));
        AUS = ((InterfaceC61432r6) this.A01.getValue()).AUS(str);
        A0i.putAll(AUS);
        this.A06.EIH(new Object(), this.A05.getModuleName(), str, AbstractC001800i.A0a(A0i.keySet()), AbstractC06930Yk.A0B(A0i), AbstractC37300Gc1.A00(currentTimeMillis));
        return A0i;
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass317, 0);
        AbstractC25233BEq.A0v(1, obj, obj2, c6t6);
        this.A00 = true;
        switch (anonymousClass317.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 27:
            case 28:
                return;
            case 10:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                throw AbstractC37303Gc4.A0M(anonymousClass317, AbstractC111324zv.A00(1865), AbstractC166987dD.A1C());
            case 16:
                ((InterfaceC61432r6) this.A04.getValue()).DVi(c6t6, anonymousClass317, obj, obj2);
                return;
        }
    }

    public C38193Gqy(InterfaceC60442pS interfaceC60442pS, C1M6 c1m6, C61412r4 c61412r4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, boolean z, boolean z2, boolean z3) {
        this.A08 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A06 = c1m6;
        this.A05 = interfaceC60442pS;
        this.A07 = c61412r4;
        this.A04 = AbstractC37301Gc2.A0s(interfaceC16820sZ, 25);
        this.A02 = AbstractC37301Gc2.A0s(interfaceC16820sZ3, 23);
        this.A03 = AbstractC37301Gc2.A0s(interfaceC16820sZ4, 24);
        this.A01 = AbstractC37301Gc2.A0s(interfaceC16820sZ2, 22);
    }

    @Override // X.InterfaceC61432r6
    public final void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
        AbstractC167017dG.A1N(collection, enumC74603Ws);
        this.A07.A00(enumC74603Ws, collection);
    }
}
