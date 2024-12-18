package X;

import android.content.ContentResolver;
import android.content.Context;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;

/* renamed from: X.9DV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DV extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07 = 0;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DV(C5Y3 c5y3, Integer num, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        super(2, interfaceC23621Ds);
        this.A01 = num;
        this.A06 = c5y3;
        this.A08 = interfaceC16660sJ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        switch (this.A07) {
            case 0:
                C9DV c9dv = new C9DV((C5Y3) this.A06, (Integer) this.A01, interfaceC23621Ds, (InterfaceC16660sJ) this.A08);
                c9dv.A02 = obj;
                return c9dv;
            case 1:
                C9DV c9dv2 = new C9DV((ContentResolver) this.A04, (Context) this.A01, (android.net.Uri) this.A08, (C57X) this.A03, interfaceC23621Ds, (InterfaceC24731Iq) this.A02);
                c9dv2.A05 = obj;
                return c9dv2;
            default:
                return new C9DV((ContentFilterDictionaryRegistrar) this.A06, (InterfaceC2043492k) this.A08, interfaceC23621Ds);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DV) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r2 != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0027, code lost:
    
        if (1 == 0) goto L10;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x01c5: INVOKE (r5 I:X.139), (r3 I:java.lang.Object) VIRTUAL call: X.139.A04(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:453), block:B:98:0x01c5 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0229 A[Catch: all -> 0x027e, TryCatch #4 {all -> 0x027e, blocks: (B:106:0x01dd, B:107:0x0211, B:111:0x0221, B:113:0x0229, B:122:0x021e, B:124:0x0209), top: B:101:0x01cf }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0254 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:15:0x0070, B:17:0x007a, B:18:0x007d, B:20:0x0085, B:23:0x008f, B:27:0x00a5, B:51:0x00a2), top: B:50:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:15:0x0070, B:17:0x007a, B:18:0x007d, B:20:0x0085, B:23:0x008f, B:27:0x00a5, B:51:0x00a2), top: B:50:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:15:0x0070, B:17:0x007a, B:18:0x007d, B:20:0x0085, B:23:0x008f, B:27:0x00a5, B:51:0x00a2), top: B:50:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x024f -> B:103:0x0211). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00dc -> B:8:0x0022). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DV(ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar, InterfaceC2043492k interfaceC2043492k, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = contentFilterDictionaryRegistrar;
        this.A08 = interfaceC2043492k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DV(ContentResolver contentResolver, Context context, android.net.Uri uri, C57X c57x, InterfaceC23621Ds interfaceC23621Ds, InterfaceC24731Iq interfaceC24731Iq) {
        super(2, interfaceC23621Ds);
        this.A04 = contentResolver;
        this.A08 = uri;
        this.A03 = c57x;
        this.A02 = interfaceC24731Iq;
        this.A01 = context;
    }
}
