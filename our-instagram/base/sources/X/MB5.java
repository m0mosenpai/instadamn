package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.File;

/* loaded from: classes8.dex */
public final class MB5 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MB5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = z;
        this.A09 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i;
        if (this.A00 != 0) {
            obj3 = this.A01;
            obj4 = this.A05;
            obj5 = this.A03;
            obj6 = this.A04;
            str = this.A06;
            str2 = this.A07;
            z = this.A08;
            z2 = this.A09;
            obj2 = this.A02;
            i = 1;
        } else {
            obj2 = this.A02;
            obj3 = this.A01;
            obj4 = this.A05;
            obj5 = this.A03;
            obj6 = this.A04;
            str = this.A06;
            str2 = this.A07;
            z = this.A08;
            z2 = this.A09;
            i = 0;
        }
        return new MB5(obj2, obj3, obj4, obj5, obj6, str, str2, interfaceC23621Ds, i, z, z2);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C41761wQ c41761wQ;
        C42221xC A0A;
        C49720Lxp c49720Lxp;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
            C38321qM c38321qM = (C38321qM) this.A01;
            String A2a = c38321qM.A2a();
            if (A2a != null) {
                File file = (File) this.A02;
                UserSession userSession = ((C36287Fzh) this.A05).A01;
                File A08 = AbstractC50633MWu.A08(userSession, file, A2a, -1L);
                if (A08 != null) {
                    ClipInfo A03 = MY3.A03(userSession, AbstractC43592JPx.A0x(A08), c38321qM.A1C(), c38321qM.A1C());
                    A03.A00 = A03.A09 / A03.A06;
                    C7TM c7tm = (C7TM) this.A03;
                    if (c7tm instanceof C49296Lqq) {
                        C49296Lqq c49296Lqq = (C49296Lqq) c7tm;
                        DirectShareTarget directShareTarget = (DirectShareTarget) this.A04;
                        String str = this.A06;
                        String str2 = this.A07;
                        boolean z = this.A09;
                        AbstractC25233BEq.A0v(0, directShareTarget, str, str2);
                        InterfaceC2056098k A0X = JQ0.A0X(directShareTarget);
                        C6JY c6jy = c49296Lqq.A01.A00;
                        c41761wQ = c49296Lqq.A00;
                        A0A = AbstractC43593JPy.A0M(new C48377Lar(c6jy, A03, null, null, null, str2, z), C6JY.A01(c6jy, A0X));
                        c49720Lxp = new C49720Lxp(c6jy, c49296Lqq, A0X, str, str2, 1);
                    } else {
                        throw AbstractC166987dD.A14(AbstractC167017dG.A0n(c7tm, "Unknown SendShareManager type ", AbstractC166987dD.A1C()));
                    }
                }
            }
            throw AbstractC166997dE.A0g();
        }
        AbstractC09560e7.A00(obj);
        ExtendedImageUrl A1q = ((C38321qM) this.A02).A1q((Context) this.A01);
        if (A1q != null) {
            C36287Fzh c36287Fzh = (C36287Fzh) this.A05;
            C7TM c7tm2 = (C7TM) this.A03;
            DirectShareTarget directShareTarget2 = (DirectShareTarget) this.A04;
            String str3 = this.A06;
            String str4 = this.A07;
            boolean z2 = this.A09;
            Bitmap A0H = C25821No.A00().A0H(A1q, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
            if (A0H != null) {
                if (c7tm2 instanceof C49296Lqq) {
                    C49296Lqq c49296Lqq2 = (C49296Lqq) c7tm2;
                    C183978Ee A032 = AbstractC209669Pc.A03(A0H, null, c36287Fzh.A01, C50472Tr.A01(), AbstractC917048o.A04("direct_temp_photo", ".jpg"), 0, false);
                    AbstractC25233BEq.A0v(0, directShareTarget2, str3, str4);
                    InterfaceC2056098k A0X2 = JQ0.A0X(directShareTarget2);
                    C6JY c6jy2 = c49296Lqq2.A01.A00;
                    c41761wQ = c49296Lqq2.A00;
                    A0A = c6jy2.A0A(A0X2, A032, null, null, str4, z2);
                    c49720Lxp = new C49720Lxp(c6jy2, c49296Lqq2, A0X2, str3, str4, 0);
                } else {
                    throw AbstractC166987dD.A14(AbstractC167017dG.A0n(c7tm2, "Unknown SendShareManager type ", AbstractC166987dD.A1C()));
                }
            } else {
                throw AbstractC166987dD.A14("Failed to get bitmap.");
            }
        }
        return C0eB.A00;
        c41761wQ.A02(A0A, c49720Lxp);
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MB5) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
