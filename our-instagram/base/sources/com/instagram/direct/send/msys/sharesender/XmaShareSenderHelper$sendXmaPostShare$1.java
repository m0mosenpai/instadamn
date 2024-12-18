package com.instagram.direct.send.msys.sharesender;

import X.AbstractC09560e7;
import X.AbstractC140946Yw;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC31180DnO;
import X.AbstractC43592JPx;
import X.C09530e4;
import X.C0eB;
import X.C38321qM;
import X.C41761wQ;
import X.C48390Lb5;
import X.C49786Lyt;
import X.C6JW;
import X.C6JY;
import X.InterfaceC16620sF;
import X.InterfaceC2056098k;
import X.InterfaceC23621Ds;
import X.InterfaceC83713oG;
import X.JQ0;
import X.LLU;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaPostShare$1", f = "XmaShareSenderHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class XmaShareSenderHelper$sendXmaPostShare$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C41761wQ A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ C38321qM A05;
    public final /* synthetic */ C38321qM A06;
    public final /* synthetic */ InterfaceC83713oG A07;
    public final /* synthetic */ User A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XmaShareSenderHelper$sendXmaPostShare$1(C41761wQ c41761wQ, UserSession userSession, ImageUrl imageUrl, C38321qM c38321qM, C38321qM c38321qM2, InterfaceC83713oG interfaceC83713oG, User user, String str, String str2, String str3, String str4, String str5, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A05 = c38321qM;
        this.A0C = str;
        this.A06 = c38321qM2;
        this.A02 = c41761wQ;
        this.A03 = userSession;
        this.A07 = interfaceC83713oG;
        this.A0A = str2;
        this.A01 = i;
        this.A08 = user;
        this.A09 = str3;
        this.A0D = str4;
        this.A00 = i2;
        this.A0B = str5;
        this.A04 = imageUrl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C38321qM c38321qM = this.A05;
        String str = this.A0C;
        C38321qM c38321qM2 = this.A06;
        C41761wQ c41761wQ = this.A02;
        UserSession userSession = this.A03;
        InterfaceC83713oG interfaceC83713oG = this.A07;
        String str2 = this.A0A;
        int i = this.A01;
        User user = this.A08;
        String str3 = this.A09;
        String str4 = this.A0D;
        int i2 = this.A00;
        return new XmaShareSenderHelper$sendXmaPostShare$1(c41761wQ, userSession, this.A04, c38321qM, c38321qM2, interfaceC83713oG, user, str, str2, str3, str4, this.A0B, interfaceC23621Ds, i, i2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((XmaShareSenderHelper$sendXmaPostShare$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String A2f;
        byte[] bArr;
        String str;
        int i;
        int i2;
        AbstractC09560e7.A00(obj);
        C38321qM c38321qM = this.A05;
        String str2 = this.A0C;
        C09530e4 A04 = LLU.A04(c38321qM, str2, true);
        if (A04 == null) {
            A04 = new C09530e4(null, null);
        }
        ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) A04.A00;
        Bitmap bitmap = (Bitmap) A04.A01;
        C38321qM c38321qM2 = this.A06;
        String id = c38321qM2.getId();
        if (id != null && (A2f = c38321qM2.A2f()) != null) {
            C41761wQ c41761wQ = this.A02;
            UserSession userSession = this.A03;
            C6JY c6jy = C6JW.A00(userSession, "XmaShareSenderHelper").A00;
            InterfaceC2056098k A03 = AbstractC140946Yw.A03(this.A07);
            String str3 = this.A0A;
            int i3 = this.A01;
            User user = this.A08;
            String username = user.getUsername();
            String id2 = user.getId();
            String str4 = this.A09;
            LLU llu = LLU.A00;
            String A01 = LLU.A01(userSession, c38321qM2, c38321qM2.A0C.B7K(), user);
            String str5 = this.A0D;
            int i4 = this.A00;
            if (bitmap != null) {
                bArr = LLU.A07(bitmap);
            } else {
                bArr = null;
            }
            if (extendedImageUrl != null) {
                str = LLU.A02(extendedImageUrl.A0A);
                i = extendedImageUrl.getHeight();
                i2 = extendedImageUrl.getWidth();
            } else {
                str = "image/jpeg";
                i = 0;
                i2 = 0;
            }
            String str6 = this.A0B;
            ImageUrl imageUrl = this.A04;
            c41761wQ.A02(AbstractC31180DnO.A0I(C6JY.A01(c6jy, A03).A0L(new C48390Lb5(llu.A09(imageUrl, str2), JQ0.A0e(imageUrl.getHeight(), -1), JQ0.A0e(imageUrl.getWidth(), -1), c6jy, bArr, str3, username, id, id2, A2f, str4, A01, str5, str, LLU.A02(AbstractC43592JPx.A0w(imageUrl)), str6, i3, i4, i, i2, 0)), "instagram_xma_client_send"), C49786Lyt.A00);
        }
        return C0eB.A00;
    }
}
