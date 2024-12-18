package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import java.util.Map;

/* renamed from: X.9DW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DW extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DW(ContentFilterDictionaryImpl contentFilterDictionaryImpl, ContentFilterDictionaryRegistrar contentFilterDictionaryRegistrar, InterfaceC2043492k interfaceC2043492k, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A07 = 2;
        this.A0A = contentFilterDictionaryRegistrar;
        this.A09 = contentFilterDictionaryImpl;
        this.A08 = interfaceC2043492k;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        switch (this.A07) {
            case 0:
                C9DW c9dw = new C9DW(this.A09, this.A0A, this.A08, this.A01, interfaceC23621Ds, 0);
                c9dw.A02 = obj;
                return c9dw;
            case 1:
                return new C9DW(this.A09, this.A0A, this.A08, this.A01, interfaceC23621Ds, 1);
            case 2:
                return new C9DW((ContentFilterDictionaryImpl) this.A09, (ContentFilterDictionaryRegistrar) this.A0A, (InterfaceC2043492k) this.A08, interfaceC23621Ds);
            default:
                InterfaceC55322gX interfaceC55322gX = (InterfaceC55322gX) this.A03;
                InstagramQpSdkModule instagramQpSdkModule = (InstagramQpSdkModule) this.A0A;
                UserSession userSession = (UserSession) this.A06;
                Context context = (Context) this.A09;
                Map map = (Map) this.A04;
                return new C9DW(context, (C12L) this.A02, userSession, interfaceC55322gX, (C55732hE) this.A05, (C61102qY) this.A08, instagramQpSdkModule, map, interfaceC23621Ds, (C19L) this.A01);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DW) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0286: INVOKE (r3 I:X.139), (r4 I:java.lang.Object) VIRTUAL call: X.139.A04(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:646), block:B:113:0x0286 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00fb: INVOKE (r6 I:X.139), (r5 I:java.lang.Object) VIRTUAL call: X.139.A04(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:251), block:B:43:0x00fb */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d A[Catch: all -> 0x0285, TryCatch #2 {all -> 0x0285, blocks: (B:76:0x026a, B:77:0x026d, B:78:0x027f, B:82:0x0234, B:83:0x0237, B:85:0x023d, B:88:0x0252, B:90:0x0256, B:91:0x025b, B:93:0x01ec, B:95:0x01f4, B:98:0x0200, B:100:0x020a, B:103:0x0216, B:105:0x021e, B:108:0x025c), top: B:70:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0252 A[Catch: all -> 0x0285, TryCatch #2 {all -> 0x0285, blocks: (B:76:0x026a, B:77:0x026d, B:78:0x027f, B:82:0x0234, B:83:0x0237, B:85:0x023d, B:88:0x0252, B:90:0x0256, B:91:0x025b, B:93:0x01ec, B:95:0x01f4, B:98:0x0200, B:100:0x020a, B:103:0x0216, B:105:0x021e, B:108:0x025c), top: B:70:0x017f }] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DW(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A09 = obj;
        this.A0A = obj2;
        this.A08 = obj3;
        this.A01 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DW(Context context, C12L c12l, UserSession userSession, InterfaceC55322gX interfaceC55322gX, C55732hE c55732hE, C61102qY c61102qY, InstagramQpSdkModule instagramQpSdkModule, Map map, InterfaceC23621Ds interfaceC23621Ds, C19L c19l) {
        super(2, interfaceC23621Ds);
        this.A07 = 3;
        this.A03 = interfaceC55322gX;
        this.A0A = instagramQpSdkModule;
        this.A06 = userSession;
        this.A09 = context;
        this.A04 = map;
        this.A05 = c55732hE;
        this.A08 = c61102qY;
        this.A01 = c19l;
        this.A02 = c12l;
    }
}
