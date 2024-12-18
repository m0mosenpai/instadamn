package com.instagram.direct.send.msys.sharesender;

import X.AbstractC09560e7;
import X.AbstractC140946Yw;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25228BEl;
import X.AbstractC31180DnO;
import X.AbstractC43592JPx;
import X.C09530e4;
import X.C0eB;
import X.C38321qM;
import X.C41761wQ;
import X.C48389Lb4;
import X.C49788Lyv;
import X.C6JW;
import X.C6JY;
import X.InterfaceC16620sF;
import X.InterfaceC2056098k;
import X.InterfaceC23621Ds;
import X.InterfaceC83713oG;
import X.LLU;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryMention$1", f = "XmaShareSenderHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class XmaShareSenderHelper$sendXmaStoryMention$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C41761wQ A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C38321qM A04;
    public final /* synthetic */ InterfaceC83713oG A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XmaShareSenderHelper$sendXmaStoryMention$1(C41761wQ c41761wQ, UserSession userSession, C38321qM c38321qM, InterfaceC83713oG interfaceC83713oG, User user, User user2, String str, String str2, String str3, String str4, String str5, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = c38321qM;
        this.A0C = str;
        this.A02 = c41761wQ;
        this.A03 = userSession;
        this.A05 = interfaceC83713oG;
        this.A01 = i;
        this.A06 = user;
        this.A08 = str2;
        this.A09 = str3;
        this.A0D = z;
        this.A0A = str4;
        this.A07 = user2;
        this.A00 = i2;
        this.A0B = str5;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C38321qM c38321qM = this.A04;
        String str = this.A0C;
        C41761wQ c41761wQ = this.A02;
        UserSession userSession = this.A03;
        InterfaceC83713oG interfaceC83713oG = this.A05;
        int i = this.A01;
        User user = this.A06;
        String str2 = this.A08;
        String str3 = this.A09;
        boolean z = this.A0D;
        String str4 = this.A0A;
        return new XmaShareSenderHelper$sendXmaStoryMention$1(c41761wQ, userSession, c38321qM, interfaceC83713oG, user, this.A07, str, str2, str3, str4, this.A0B, interfaceC23621Ds, i, this.A00, z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((XmaShareSenderHelper$sendXmaStoryMention$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Long l;
        String str;
        String str2;
        AbstractC09560e7.A00(obj);
        C38321qM c38321qM = this.A04;
        C09530e4 A04 = LLU.A04(c38321qM, this.A0C, false);
        if (A04 != null) {
            ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) A04.A00;
            Bitmap bitmap = (Bitmap) A04.A01;
            C41761wQ c41761wQ = this.A02;
            C6JY c6jy = C6JW.A00(this.A03, "XmaShareSenderHelper").A00;
            InterfaceC2056098k A03 = AbstractC140946Yw.A03(this.A05);
            int i = this.A01;
            String username = this.A06.getUsername();
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                String str3 = this.A08;
                long A18 = c38321qM.A18();
                if (A18 != Long.MAX_VALUE) {
                    l = Long.valueOf(A18);
                } else {
                    l = null;
                }
                String str4 = this.A09;
                Boolean valueOf = Boolean.valueOf(this.A0D);
                String str5 = this.A0A;
                int A0y = c38321qM.A0y();
                int A0z = c38321qM.A0z();
                User user = this.A07;
                String str6 = null;
                if (user != null) {
                    str6 = user.getUsername();
                    str = AbstractC25228BEl.A19(user);
                    str2 = user.getId();
                } else {
                    str = null;
                    str2 = null;
                }
                int i2 = this.A00;
                c41761wQ.A02(AbstractC31180DnO.A0I(C6JY.A01(c6jy, A03).A0L(new C48389Lb4(LLU.A07(bitmap), valueOf, AbstractC43592JPx.A0r(extendedImageUrl.getHeight()), AbstractC43592JPx.A0r(extendedImageUrl.getWidth()), l, c6jy, username, A2u, str3, str4, str5, str6, str, str2, LLU.A02(extendedImageUrl.A0A), this.A0B, i, A0y, A0z, i2, 0)), "instagram_xma_client_send"), C49788Lyv.A00);
                return C0eB.A00;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
