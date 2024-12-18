package com.facebook.commonavatarliveediting.prefetch;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.C0K8;
import X.C0eB;
import X.C15370ps;
import X.C19L;
import X.C1JX;
import X.C24891Jo;
import X.C50112Sa;
import X.C51653Mrk;
import X.C51687MsI;
import X.C51737MtK;
import X.C54775OIo;
import X.C55069OaP;
import X.C55598Omc;
import X.C57170PZo;
import X.C6FQ;
import X.C902540k;
import X.EnumC53208Ng6;
import X.InterfaceC103384lE;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.JQ0;
import X.JTH;
import X.LHL;
import X.OMg;
import X.PYo;
import android.content.Context;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1", f = "CommonBloksActionHelper.kt", i = {0}, l = {433, 481}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ double A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C51687MsI A04;
    public final /* synthetic */ C55069OaP A05;
    public final /* synthetic */ OMg A06;
    public final /* synthetic */ C54775OIo A07;
    public final /* synthetic */ C51737MtK A08;
    public final /* synthetic */ C6FQ A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ Map A0D;
    public final /* synthetic */ C15370ps A0E;
    public final /* synthetic */ C15370ps A0F;
    public final /* synthetic */ C19L A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1(Context context, C51687MsI c51687MsI, C55069OaP c55069OaP, OMg oMg, C54775OIo c54775OIo, C51737MtK c51737MtK, C6FQ c6fq, String str, String str2, String str3, Map map, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps, C15370ps c15370ps2, C19L c19l, double d, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC23621Ds);
        this.A0E = c15370ps;
        this.A0C = str;
        this.A0A = str2;
        this.A04 = c51687MsI;
        this.A08 = c51737MtK;
        this.A0J = z;
        this.A05 = c55069OaP;
        this.A0G = c19l;
        this.A06 = oMg;
        this.A0I = z2;
        this.A02 = d;
        this.A0F = c15370ps2;
        this.A09 = c6fq;
        this.A0D = map;
        this.A0B = str3;
        this.A0H = z3;
        this.A07 = c54775OIo;
        this.A03 = context;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C15370ps c15370ps = this.A0E;
        String str = this.A0C;
        String str2 = this.A0A;
        C51687MsI c51687MsI = this.A04;
        C51737MtK c51737MtK = this.A08;
        boolean z = this.A0J;
        C55069OaP c55069OaP = this.A05;
        C19L c19l = this.A0G;
        OMg oMg = this.A06;
        boolean z2 = this.A0I;
        double d = this.A02;
        C15370ps c15370ps2 = this.A0F;
        C6FQ c6fq = this.A09;
        Map map = this.A0D;
        String str3 = this.A0B;
        boolean z3 = this.A0H;
        CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1 commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1 = new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1(this.A03, c51687MsI, c55069OaP, oMg, this.A07, c51737MtK, c6fq, str, str2, str3, map, interfaceC23621Ds, c15370ps, c15370ps2, c19l, d, z, z2, z3);
        commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1.A01 = obj;
        return commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C19L c19l;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        try {
        } catch (C902540k e) {
            C0K8.A0D("CommonBloksActionHelper", AbstractC167017dG.A0n(e, "Timeout in executing LoadLiveEditor. Error: ", AbstractC166987dD.A1C()));
            this.A06.A04("LOAD_ACTION_TIMEOUT", (short) 3);
            C55069OaP.A01(this.A05, this.A09, (InterfaceC103384lE) this.A0F.A00, "load_timeout");
        }
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj2);
                return C0eB.A00;
            }
            c19l = (C19L) this.A01;
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            c19l = (C19L) this.A01;
            String str = (String) this.A0E.A00;
            String str2 = this.A0C;
            if (str2 != null) {
                String str3 = this.A0A;
                if (str3 != null) {
                    C51653Mrk c51653Mrk = new C51653Mrk(EnumC53208Ng6.A05, this.A04, this.A08, null, null, null, null, null, null, null, str, str2, str3, null, null, null, false, false, false, this.A0J, false, false);
                    C55069OaP c55069OaP = this.A05;
                    C19L c19l2 = this.A0G;
                    OMg oMg = this.A06;
                    boolean z = this.A0I;
                    this.A01 = c19l;
                    this.A00 = 1;
                    C24891Jo A0s = JQ0.A0s(this);
                    if (oMg != null) {
                        oMg.A02("INIT_PREFETCH");
                    }
                    AbstractC23641Du.A05(new CommonBloksActionHelper$initPrefetch$lambda$12$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, A0s), new PYo(c51653Mrk, c55069OaP, oMg, null, A0s, z, true), c19l2);
                    obj2 = A0s.A0E();
                    if (obj2 == c1jx) {
                        return c1jx;
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        Map map = this.A0D;
        String str4 = this.A0B;
        OMg oMg2 = this.A06;
        CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1 commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1 = new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1((C55598Omc) obj2, oMg2, str4, map, null, this.A0J, this.A0H);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C50112Sa A02 = AbstractC23641Du.A02(anonymousClass191, commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1, c19l);
        C50112Sa A022 = AbstractC23641Du.A02(anonymousClass191, new JTH(this.A03, this.A07, this.A0E, oMg2, (InterfaceC23621Ds) null, 9), c19l);
        long j = (long) (this.A02 * 1000.0d);
        C57170PZo c57170PZo = new C57170PZo((InterfaceC23621Ds) null, (Object) this.A05, (Object) this.A0F, (Object) oMg2, (Object) A02, (Object) this.A09, (Object) A022, 1);
        this.A01 = null;
        this.A00 = 2;
        if (LHL.A00(this, c57170PZo, j) == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
