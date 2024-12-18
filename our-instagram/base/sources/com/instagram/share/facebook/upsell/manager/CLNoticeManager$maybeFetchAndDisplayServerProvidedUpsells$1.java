package com.instagram.share.facebook.upsell.manager;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC200098tE;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC25231BEo;
import X.AbstractC54218Nxw;
import X.AbstractC54219Nxx;
import X.AnonymousClass001;
import X.B5c;
import X.C06090Tz;
import X.C0K8;
import X.C0eB;
import X.C12L;
import X.C12T;
import X.C14360o3;
import X.C15370ps;
import X.C18U;
import X.C1JX;
import X.C200018t5;
import X.C200028t6;
import X.C201848wH;
import X.C201858wI;
import X.C201868wJ;
import X.C206319Bo;
import X.C2JS;
import X.C50124MBy;
import X.C54804OJy;
import X.C82G;
import X.C902540k;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC57992Pnc;
import X.LHL;
import X.MSX;
import X.OMW;
import X.PYs;
import android.app.Activity;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1", f = "CLNoticeManager.kt", i = {0}, l = {236, 256, 264, 285, 294, 306}, m = "invokeSuspend", n = {"results"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ C82G A03;
    public final /* synthetic */ C206319Bo A04;
    public final /* synthetic */ ImmutableList A05;
    public final /* synthetic */ C54804OJy A06;
    public final /* synthetic */ InterfaceC57992Pnc A07;
    public final /* synthetic */ C200018t5 A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1(Activity activity, C82G c82g, C206319Bo c206319Bo, ImmutableList immutableList, C54804OJy c54804OJy, InterfaceC57992Pnc interfaceC57992Pnc, C200018t5 c200018t5, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A08 = c200018t5;
        this.A09 = str;
        this.A06 = c54804OJy;
        this.A03 = c82g;
        this.A04 = c206319Bo;
        this.A05 = immutableList;
        this.A02 = activity;
        this.A0A = z;
        this.A07 = interfaceC57992Pnc;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C200018t5 c200018t5 = this.A08;
        String str = this.A09;
        C54804OJy c54804OJy = this.A06;
        C82G c82g = this.A03;
        C206319Bo c206319Bo = this.A04;
        ImmutableList immutableList = this.A05;
        return new CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1(this.A02, c82g, c206319Bo, immutableList, c54804OJy, this.A07, c200018t5, str, interfaceC23621Ds, this.A0A);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, X.OFa] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C15370ps c15370ps;
        C201848wH c201848wH;
        C12T c12t;
        InterfaceC16620sF pYs;
        int i;
        C1JX c1jx = C1JX.A02;
        try {
        } catch (C902540k unused) {
            C0K8.A0C("CLNoticeManager", AnonymousClass001.A0R("Timeout exception: Failed to fetch notice eligibility for ", this.A09));
            this.A08.A02.A03((short) 113);
            C12T c12t2 = C12L.A00.A04;
            PYs pYs2 = new PYs(this.A07, null, 28);
            this.A01 = null;
            this.A00 = 2;
            if (AbstractC23641Du.A00(this, c12t2, pYs2) == c1jx) {
                return c1jx;
            }
        }
        switch (this.A00) {
            case 0:
                AbstractC09560e7.A00(obj);
                String A0p = AbstractC25231BEo.A0p();
                c15370ps = AbstractC25225BEi.A1F();
                C200018t5 c200018t5 = this.A08;
                long A01 = C18U.A01(C06090Tz.A05, c200018t5.A00, 36599916000382625L);
                B5c b5c = new B5c(this.A02, this.A05, c200018t5, A0p, null, c15370ps, this.A0A);
                this.A01 = c15370ps;
                this.A00 = 1;
                if (LHL.A00(this, b5c, A01) == c1jx) {
                    return c1jx;
                }
                break;
            case 1:
                c15370ps = (C15370ps) this.A01;
                AbstractC09560e7.A00(obj);
                break;
            default:
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
        }
        Map map = (Map) c15370ps.A00;
        if (map != null) {
            c201848wH = (C201848wH) map.get(this.A09);
        } else {
            c201848wH = null;
        }
        if (c201848wH == null) {
            i = 3;
            this.A08.A02.A03((short) 3);
            c12t = C12L.A00.A04;
            pYs = new PYs(this.A07, null, 29);
            this.A01 = null;
        } else {
            C200018t5 c200018t52 = this.A08;
            UserSession userSession = c200018t52.A00;
            AbstractC54218Nxw.A00(userSession, c201848wH);
            C54804OJy c54804OJy = this.A06;
            AbstractC54219Nxx.A00(userSession, c201848wH, c54804OJy);
            C14360o3.A0B(c54804OJy, 1);
            ?? obj2 = new Object();
            obj2.A0B = null;
            obj2.A00 = null;
            obj2.A03 = null;
            obj2.A06 = null;
            obj2.A01 = null;
            obj2.A04 = null;
            obj2.A07 = null;
            obj2.A02 = null;
            obj2.A05 = null;
            obj2.A08 = null;
            obj2.A09 = null;
            obj2.A0A = null;
            Iterator<E> it = MSX.A0D(c201848wH, C201868wJ.class, "client_params", 7, 1311672120).iterator();
            while (it.hasNext()) {
                C2JS A0l = AbstractC25225BEi.A0l(it);
                String A07 = A0l.A07("key");
                if (C14360o3.A0K(A07, DialogModule.KEY_TITLE)) {
                    obj2.A0B = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "body_icon_name_1")) {
                    obj2.A00 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "body_icon_variant_1")) {
                    obj2.A03 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "body_markdown_text_1")) {
                    obj2.A06 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "body_icon_name_2")) {
                    obj2.A01 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "body_icon_variant_2")) {
                    obj2.A04 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "body_markdown_text_2")) {
                    obj2.A07 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "body_icon_name_3")) {
                    obj2.A02 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "body_icon_variant_3")) {
                    obj2.A05 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "body_markdown_text_3")) {
                    obj2.A08 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, AbstractC111324zv.A00(73))) {
                    obj2.A09 = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (C14360o3.A0K(A07, "secondary_button_text")) {
                    obj2.A0A = A0l.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                }
            }
            c54804OJy.A07 = obj2;
            ImmutableList A06 = c201848wH.A06(C201858wI.class, "native_auth_response", -1212312527);
            C14360o3.A07(A06);
            ArrayList A0q = AbstractC167017dG.A0q(A06);
            Iterator<E> it2 = A06.iterator();
            while (it2.hasNext()) {
                String A0A = AbstractC25225BEi.A0l(it2).A0A("opaque_target_account_encrypted_string");
                if (A0A == null) {
                    A0A = "";
                }
                A0q.add(A0A);
            }
            c54804OJy.A0B = AbstractC001800i.A0a(A0q);
            String str = this.A09;
            C200028t6 c200028t6 = c200018t52.A02;
            OMW A012 = AbstractC200098tE.A01(userSession, c201848wH, c200028t6, str);
            if (A012 == null) {
                c12t = C12L.A00.A04;
                pYs = new PYs(this.A07, null, 30);
                this.A01 = null;
                i = 4;
            } else {
                String optionalStringField = c201848wH.getOptionalStringField(6, "client_session_id");
                if (optionalStringField == null) {
                    optionalStringField = "";
                }
                C82G c82g = this.A03;
                boolean A02 = AbstractC200098tE.A02(c82g, this.A04, userSession, c200028t6, A012, optionalStringField);
                c12t = C12L.A00.A04;
                if (A02) {
                    pYs = new C50124MBy(c200018t52, c82g, c54804OJy, this.A07, A012, null, 11);
                    this.A01 = null;
                    i = 5;
                } else {
                    pYs = new PYs(this.A07, null, 31);
                    this.A01 = null;
                    i = 6;
                }
            }
        }
        this.A00 = i;
        if (AbstractC23641Du.A00(this, c12t, pYs) == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
