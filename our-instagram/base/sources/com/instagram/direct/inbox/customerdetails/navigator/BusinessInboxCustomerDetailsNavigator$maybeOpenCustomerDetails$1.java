package com.instagram.direct.inbox.customerdetails.navigator;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C11T;
import X.C1JX;
import X.C33090Eip;
import X.C50537MSq;
import X.C92694De;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.RunnableC36966GQj;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1", f = "BusinessInboxCustomerDetailsNavigator.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final /* synthetic */ Context A06;
    public final /* synthetic */ FragmentActivity A07;
    public final /* synthetic */ UserSession A08;
    public final /* synthetic */ C33090Eip A09;
    public final /* synthetic */ String A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1(Context context, FragmentActivity fragmentActivity, UserSession userSession, C33090Eip c33090Eip, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A09 = c33090Eip;
        this.A08 = userSession;
        this.A06 = context;
        this.A07 = fragmentActivity;
        this.A0A = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        C33090Eip c33090Eip = this.A09;
        return new BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1(this.A06, this.A07, this.A08, c33090Eip, this.A0A, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((BusinessInboxCustomerDetailsNavigator$maybeOpenCustomerDetails$1) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C33090Eip c33090Eip;
        UserSession userSession;
        Context context;
        FragmentActivity fragmentActivity;
        String str;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            str = (String) this.A05;
            fragmentActivity = (FragmentActivity) this.A04;
            context = (Context) this.A03;
            userSession = (UserSession) this.A02;
            c33090Eip = (C33090Eip) this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            c33090Eip = this.A09;
            userSession = this.A08;
            context = this.A06;
            fragmentActivity = this.A07;
            str = this.A0A;
            this.A01 = c33090Eip;
            this.A02 = userSession;
            this.A03 = context;
            this.A04 = fragmentActivity;
            this.A05 = str;
            this.A00 = 1;
            C92694De c92694De = c33090Eip.A00;
            C50537MSq c50537MSq = new C50537MSq(c33090Eip, null, 9);
            C0eB c0eB = C0eB.A00;
            Object A00 = c92694De.A00(c0eB, this, c50537MSq);
            if (A00 != c1jx) {
                A00 = c0eB;
            }
            if (A00 == c1jx) {
                return c1jx;
            }
        }
        C11T.A02(new RunnableC36966GQj(context, fragmentActivity, userSession, c33090Eip, str));
        return C0eB.A00;
    }
}
