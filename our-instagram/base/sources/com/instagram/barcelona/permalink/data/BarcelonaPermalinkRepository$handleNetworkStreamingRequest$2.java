package com.instagram.barcelona.permalink.data;

import X.AbstractC09560e7;
import X.AbstractC12960li;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC31175DnJ;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C07510aQ;
import X.C0eB;
import X.C18U;
import X.C1GJ;
import X.C226218q;
import X.C23711Eb;
import X.C23751Eh;
import X.C24531Hw;
import X.C25611Mr;
import X.C38321qM;
import X.C38801rC;
import X.C45118Jxn;
import X.C47831LAr;
import X.C48264LXn;
import X.C55702hA;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.KZX;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2", f = "BarcelonaPermalinkRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public final /* synthetic */ KZX A00;
    public final /* synthetic */ List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2(KZX kzx, List list, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A00 = kzx;
        this.A01 = list;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2(this.A00, this.A01, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        AbstractC09560e7.A00(obj);
        KZX kzx = this.A00;
        C05A c05a = kzx.A07;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C45118Jxn.A00(null, (C45118Jxn) value, null, C05F.A01, null, 1023, false, false, false, false)));
        UserSession userSession = kzx.A02;
        String str2 = kzx.A05;
        List list = this.A01;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323938581622479L);
        boolean A1W = AbstractC167007dF.A1W(C226218q.A01(AbstractC12960li.A00).A05);
        boolean z = ((C45118Jxn) c05a.getValue()).A07;
        C23711Eb c23711Eb = new C23711Eb(userSession, -2, 2, false);
        c23711Eb.A06();
        c23711Eb.A0B("text_feed/{post_id}/replies_streaming/");
        c23711Eb.A01 = new C23751Eh(new C07510aQ(userSession), new C25611Mr(null), C47831LAr.class, true, true);
        c23711Eb.A00 = new C23751Eh(new C07510aQ(userSession), new C25611Mr(null), C55702hA.class, true, true);
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        c23711Eb.A9s("post_id", C38801rC.A06(str2));
        Boolean bool = true;
        if (list != null && AbstractC166987dD.A1b(list)) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(C38801rC.A06(AbstractC166987dD.A1B(it)));
            }
            str = AbstractC31175DnJ.A0b(A0q);
        } else {
            str = null;
        }
        c23711Eb.A0H("prioritized_reply_ids", str);
        Boolean bool2 = null;
        if (A06) {
            bool2 = bool;
        }
        c23711Eb.A0F("check_for_unavailable_replies", bool2);
        if (!z) {
            bool = null;
        }
        c23711Eb.A0F("media_archived", bool);
        c23711Eb.A0I("is_app_start", A1W);
        c23711Eb.A0A = "text_feed/{post_id}/replies_streaming/";
        c23711Eb.A04();
        C24531Hw A0N = c23711Eb.A0N();
        A0N.A02(new C48264LXn(kzx, 0));
        C1GJ.A06(A0N, 1340669765, 2, true, false);
        return C0eB.A00;
    }
}
