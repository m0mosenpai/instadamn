package com.instagram.direct.messagethread;

import X.AbstractC09560e7;
import X.AbstractC13330mJ;
import X.AbstractC1581477z;
import X.AbstractC23611Dp;
import X.AnonymousClass541;
import X.C0eB;
import X.C115955Ml;
import X.C14360o3;
import X.C1581077u;
import X.C160787Im;
import X.C7IJ;
import X.C7ST;
import X.C7SU;
import X.C83403nh;
import X.C98K;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.RunnableC24687AwT;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.messagethread.DirectMessageLinkifyHelper$linkifyAsync$1", f = "DirectMessageLinkifyHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DirectMessageLinkifyHelper$linkifyAsync$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass541 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C1581077u A03;
    public final /* synthetic */ C98K A04;
    public final /* synthetic */ C7IJ A05;
    public final /* synthetic */ C115955Ml A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectMessageLinkifyHelper$linkifyAsync$1(Context context, AnonymousClass541 anonymousClass541, UserSession userSession, C1581077u c1581077u, C98K c98k, C7IJ c7ij, C115955Ml c115955Ml, String str, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2, boolean z3) {
        super(1, interfaceC23621Ds);
        this.A00 = context;
        this.A02 = userSession;
        this.A07 = str;
        this.A05 = c7ij;
        this.A06 = c115955Ml;
        this.A08 = list;
        this.A09 = z;
        this.A01 = anonymousClass541;
        this.A0A = z2;
        this.A0B = z3;
        this.A04 = c98k;
        this.A03 = c1581077u;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        Context context = this.A00;
        UserSession userSession = this.A02;
        String str = this.A07;
        C7IJ c7ij = this.A05;
        C115955Ml c115955Ml = this.A06;
        List list = this.A08;
        boolean z = this.A09;
        AnonymousClass541 anonymousClass541 = this.A01;
        boolean z2 = this.A0A;
        boolean z3 = this.A0B;
        return new DirectMessageLinkifyHelper$linkifyAsync$1(context, anonymousClass541, userSession, this.A03, this.A04, c7ij, c115955Ml, str, list, interfaceC23621Ds, z, z2, z3);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((DirectMessageLinkifyHelper$linkifyAsync$1) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        C83403nh c83403nh;
        C7SU c7su;
        Context context;
        Activity A01;
        AbstractC09560e7.A00(obj);
        Context context2 = this.A00;
        UserSession userSession = this.A02;
        String str = this.A07;
        C7IJ c7ij = this.A05;
        C115955Ml c115955Ml = this.A06;
        boolean z = this.A09;
        AnonymousClass541 anonymousClass541 = this.A01;
        boolean z2 = this.A0B;
        C98K c98k = this.A04;
        C1581077u c1581077u = this.A03;
        SpannableStringBuilder A00 = AbstractC1581477z.A00(context2, anonymousClass541, userSession, c98k, c7ij, c115955Ml, str, z, z2);
        C160787Im c160787Im = c1581077u.A00;
        if (A00 == null) {
            charSequence = "";
        } else {
            charSequence = A00;
        }
        String str2 = c1581077u.A01;
        c160787Im.A0L = charSequence;
        c160787Im.A0M = str2;
        if (A00 != null && A00.length() != 0) {
            Object[] spans = A00.getSpans(0, A00.length(), ClickableSpan.class);
            C14360o3.A07(spans);
            if (spans.length != 0 && (c7su = (c83403nh = c160787Im.A0e).A0L) != null) {
                String A0i = c83403nh.A0i();
                C7ST c7st = c7su.A00;
                View view = c7st.A00;
                if (view != null && (context = view.getContext()) != null && (A01 = AbstractC13330mJ.A01(context)) != null && !A01.isFinishing()) {
                    view.post(new RunnableC24687AwT(c7st, A0i));
                }
            }
        }
        return C0eB.A00;
    }
}
