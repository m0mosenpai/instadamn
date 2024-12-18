package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class MBD extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBD(C41761wQ c41761wQ, UserSession userSession, ImageUrl imageUrl, C38321qM c38321qM, InterfaceC83713oG interfaceC83713oG, User user, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A00 = i3;
        this.A05 = c38321qM;
        this.A0B = str;
        this.A06 = c41761wQ;
        this.A08 = userSession;
        this.A07 = interfaceC83713oG;
        this.A09 = str2;
        this.A01 = i;
        this.A03 = user;
        this.A02 = i2;
        this.A0A = str3;
        this.A04 = imageUrl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A00;
        C38321qM c38321qM = (C38321qM) this.A05;
        String str = this.A0B;
        C41761wQ c41761wQ = (C41761wQ) this.A06;
        UserSession userSession = (UserSession) this.A08;
        InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) this.A07;
        String str2 = this.A09;
        int i3 = this.A01;
        User user = (User) this.A03;
        int i4 = this.A02;
        String str3 = this.A0A;
        ImageUrl imageUrl = (ImageUrl) this.A04;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new MBD(c41761wQ, userSession, imageUrl, c38321qM, interfaceC83713oG, user, str, str2, str3, interfaceC23621Ds, i3, i4, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C41761wQ c41761wQ;
        byte[] bArr;
        String str;
        int i;
        int i2;
        C42221xC A0I;
        InterfaceC42241xE interfaceC42241xE;
        int i3 = this.A00;
        AbstractC09560e7.A00(obj);
        C38321qM c38321qM = (C38321qM) this.A05;
        String str2 = this.A0B;
        C09530e4 A03 = LLU.A03(c38321qM, str2);
        if (i3 != 0) {
            if (A03 != null) {
                ImageUrl imageUrl = (ImageUrl) A03.A00;
                Bitmap bitmap = (Bitmap) A03.A01;
                c41761wQ = (C41761wQ) this.A06;
                UserSession userSession = (UserSession) this.A08;
                C6JY c6jy = C6JW.A00(userSession, "XmaShareSenderHelper").A00;
                InterfaceC2056098k A032 = AbstractC140946Yw.A03((InterfaceC83713oG) this.A07);
                String str3 = this.A09;
                int i4 = this.A01;
                User user = (User) this.A03;
                String username = user.getUsername();
                String id = c38321qM.getId();
                if (id != null) {
                    String valueOf = String.valueOf(c38321qM.A2f());
                    LLU llu = LLU.A00;
                    String A01 = LLU.A01(userSession, c38321qM, c38321qM.A0C.B7K(), user);
                    int i5 = this.A02;
                    byte[] A07 = LLU.A07(bitmap);
                    String A02 = LLU.A02(AbstractC43592JPx.A0w(imageUrl));
                    int height = imageUrl.getHeight();
                    int width = imageUrl.getWidth();
                    String str4 = this.A0A;
                    ImageUrl imageUrl2 = (ImageUrl) this.A04;
                    byte[] A09 = llu.A09(imageUrl2, str2);
                    String A022 = LLU.A02(AbstractC43592JPx.A0w(imageUrl2));
                    A0I = AbstractC31180DnO.A0I(C6JY.A01(c6jy, A032).A0L(new C48434Lbn(c6jy, JQ0.A0e(imageUrl2.getHeight(), -1), JQ0.A0e(imageUrl2.getWidth(), -1), str3, username, id, valueOf, A01, A02, A022, str4, A07, A09, i4, i5, height, width, 0)), "instagram_xma_igtv_share_client_send");
                    interfaceC42241xE = C49785Lys.A00;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            if (A03 == null) {
                A03 = new C09530e4(null, null);
            }
            ImageUrl imageUrl3 = (ImageUrl) A03.A00;
            Bitmap bitmap2 = (Bitmap) A03.A01;
            String valueOf2 = String.valueOf(c38321qM.A2f());
            if (valueOf2 == null || valueOf2.length() == 0) {
                C0w9.A04(str2, "Media code is null or empty", 1);
            }
            c41761wQ = (C41761wQ) this.A06;
            UserSession userSession2 = (UserSession) this.A08;
            C6JY c6jy2 = C6JW.A00(userSession2, "XmaShareSenderHelper").A00;
            InterfaceC2056098k A033 = AbstractC140946Yw.A03((InterfaceC83713oG) this.A07);
            String str5 = this.A09;
            int i6 = this.A01;
            User user2 = (User) this.A03;
            String username2 = user2.getUsername();
            String id2 = c38321qM.getId();
            if (id2 != null) {
                LLU llu2 = LLU.A00;
                String A012 = LLU.A01(userSession2, c38321qM, c38321qM.A0C.B7K(), user2);
                int i7 = this.A02;
                if (bitmap2 != null) {
                    bArr = LLU.A07(bitmap2);
                } else {
                    bArr = null;
                }
                if (imageUrl3 != null) {
                    str = LLU.A02(AbstractC43592JPx.A0w(imageUrl3));
                    i = imageUrl3.getHeight();
                    i2 = imageUrl3.getWidth();
                } else {
                    str = "image/jpeg";
                    i = 0;
                    i2 = 0;
                }
                String str6 = this.A0A;
                ImageUrl imageUrl4 = (ImageUrl) this.A04;
                byte[] A092 = llu2.A09(imageUrl4, str2);
                String A023 = LLU.A02(AbstractC43592JPx.A0w(imageUrl4));
                A0I = AbstractC31180DnO.A0I(C6JY.A01(c6jy2, A033).A0L(new C48434Lbn(c6jy2, JQ0.A0e(imageUrl4.getHeight(), -1), JQ0.A0e(imageUrl4.getWidth(), -1), str5, username2, id2, valueOf2, A012, str, A023, str6, bArr, A092, i6, i7, i, i2, 2)), "instagram_xma_clips_share_client_send");
                interfaceC42241xE = C49783Lyq.A00;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        c41761wQ.A02(A0I, interfaceC42241xE);
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBD) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
