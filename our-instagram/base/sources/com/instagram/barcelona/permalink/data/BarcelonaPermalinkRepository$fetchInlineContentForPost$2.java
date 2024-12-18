package com.instagram.barcelona.permalink.data;

import X.AbstractC09560e7;
import X.AbstractC12960li;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC31171DnF;
import X.AbstractC31177DnL;
import X.AbstractC46633KkA;
import X.B4Z;
import X.C00O;
import X.C05A;
import X.C0eB;
import X.C16930sl;
import X.C194848jk;
import X.C1JX;
import X.C226218q;
import X.C25621Ms;
import X.C38321qM;
import X.C38634Gyb;
import X.C38801rC;
import X.C3NX;
import X.C3NY;
import X.C45118Jxn;
import X.C45147Jyn;
import X.C47830LAq;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC50501MRe;
import X.InterfaceC50504MRh;
import X.K7x;
import X.KZX;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$fetchInlineContentForPost$2", f = "BarcelonaPermalinkRepository.kt", i = {}, l = {545}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class BarcelonaPermalinkRepository$fetchInlineContentForPost$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ KZX A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcelonaPermalinkRepository$fetchInlineContentForPost$2(KZX kzx, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A01 = kzx;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new BarcelonaPermalinkRepository$fetchInlineContentForPost$2(this.A01, this.A02, this.A03, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BarcelonaPermalinkRepository$fetchInlineContentForPost$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object value;
        C45118Jxn A00;
        Object value2;
        C45118Jxn A002;
        List list;
        Object value3;
        C45118Jxn A003;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            KZX kzx = this.A01;
            C05A c05a = kzx.A07;
            String str = this.A02;
            do {
                value = c05a.getValue();
                A00 = C45118Jxn.A00(null, (C45118Jxn) value, null, null, KZX.A00(kzx, str, C16930sl.A00, true), 2015, false, false, false, false);
            } while (!c05a.AIi(value, A00));
            UserSession userSession = kzx.A02;
            String str2 = this.A03;
            boolean A1W = AbstractC167007dF.A1W(C226218q.A01(AbstractC12960li.A00).A05);
            this.A00 = 1;
            C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
            A0M.A0B("text_feed/{post_id}/inline_replies/");
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            A0M.A9s("post_id", C38801rC.A06(str));
            A0M.A9s("permalink_post_id", C38801rC.A06(str2));
            A0M.A0I("is_app_start", A1W);
            A0M.A0P(null, K7x.class, C47830LAq.class, false);
            A0M.A0A = "text_feed/{post_id}/inline_replies/";
            A0M.A04();
            A0M.A0G("X-IG-App-ID", "871865944585275");
            obj = A0M.A0N().A00(104842234, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        C3NY c3ny = (C3NY) obj;
        if (c3ny instanceof C3NX) {
            InterfaceC50501MRe interfaceC50501MRe = ((K7x) ((C3NX) c3ny).A00).A00;
            if (interfaceC50501MRe == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            C38634Gyb c38634Gyb = ((C45147Jyn) interfaceC50501MRe).A00;
            if (c38634Gyb != null && (list = c38634Gyb.A05) != null) {
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(AbstractC46633KkA.A00((InterfaceC50504MRh) it.next()));
                }
                if (!A0q.isEmpty()) {
                    KZX kzx2 = this.A01;
                    C05A c05a2 = kzx2.A07;
                    String str3 = this.A02;
                    do {
                        value3 = c05a2.getValue();
                        A003 = C45118Jxn.A00(null, (C45118Jxn) value3, null, null, KZX.A00(kzx2, str3, A0q, false), 2015, false, false, false, false);
                    } while (!c05a2.AIi(value3, A003));
                    return C0eB.A00;
                }
            }
        } else if (!(c3ny instanceof C194848jk)) {
            throw B4Z.A00();
        }
        KZX kzx3 = this.A01;
        String str4 = this.A02;
        C05A c05a3 = kzx3.A07;
        do {
            value2 = c05a3.getValue();
            A002 = C45118Jxn.A00(null, (C45118Jxn) value2, null, null, KZX.A00(kzx3, str4, C16930sl.A00, false), 2015, false, false, false, false);
        } while (!c05a3.AIi(value2, A002));
        return C0eB.A00;
    }
}
