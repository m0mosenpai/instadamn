package com.instagram.direct.msys.mailbox.core.mutation;

import X.AbstractC09560e7;
import X.AbstractC133285zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23611Dp;
import X.AbstractC25230BEn;
import X.AnonymousClass442;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C47392Kwh;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.L33;
import X.LEA;
import X.LFD;
import X.LIu;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.msys.mailbox.core.mutation.MsysVoiceMessageSender$sendSecureVoiceMessage$1", f = "MsysVoiceMessageSender.kt", i = {}, l = {35, 60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class MsysVoiceMessageSender$sendSecureVoiceMessage$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass442 A02;
    public final /* synthetic */ C47392Kwh A03;
    public final /* synthetic */ L33 A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysVoiceMessageSender$sendSecureVoiceMessage$1(AnonymousClass442 anonymousClass442, C47392Kwh c47392Kwh, L33 l33, Long l, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A03 = c47392Kwh;
        this.A04 = l33;
        this.A07 = str;
        this.A01 = j;
        this.A02 = anonymousClass442;
        this.A08 = str2;
        this.A06 = str3;
        this.A05 = l;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C47392Kwh c47392Kwh = this.A03;
        L33 l33 = this.A04;
        String str = this.A07;
        long j = this.A01;
        return new MsysVoiceMessageSender$sendSecureVoiceMessage$1(this.A02, c47392Kwh, l33, this.A05, str, this.A08, this.A06, interfaceC23621Ds, j);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Long l;
        String str;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj2);
                return C0eB.A00;
            }
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            UserSession userSession = this.A03.A00;
            String str2 = this.A04.A01;
            String str3 = this.A07;
            AbstractC25230BEn.A15(1, userSession, str2);
            MailboxFutureImpl A00 = LIu.A00(userSession, str2, str3);
            this.A00 = 1;
            obj2 = AbstractC133285zv.A01(A00, this);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        String str4 = (String) obj2;
        LFD lfd = LEA.A01;
        UserSession userSession2 = this.A03.A00;
        long j = this.A01;
        L33 l33 = this.A04;
        String name = AbstractC166987dD.A11(l33.A01).getName();
        C14360o3.A07(name);
        long length = AbstractC166987dD.A11(l33.A01).length();
        int i2 = l33.A00;
        AnonymousClass442 anonymousClass442 = this.A02;
        if (anonymousClass442 != null && (str = anonymousClass442.A0T) != null) {
            l = AbstractC166997dE.A0j(str);
        } else {
            l = null;
        }
        MailboxFutureImpl A01 = lfd.A01(userSession2, null, null, null, null, null, l, this.A05, "audio/mp4", "audio/mp4", name, null, str4, this.A08, this.A07, this.A06, 5, i2, j, length, false);
        this.A00 = 2;
        if (AbstractC133285zv.A01(A01, this) == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MsysVoiceMessageSender$sendSecureVoiceMessage$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
