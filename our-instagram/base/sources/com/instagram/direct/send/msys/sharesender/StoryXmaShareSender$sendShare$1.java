package com.instagram.direct.send.msys.sharesender;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23611Dp;
import X.AbstractC31180DnO;
import X.AbstractC43592JPx;
import X.C09530e4;
import X.C0eB;
import X.C38321qM;
import X.C41761wQ;
import X.C49306Lr0;
import X.C49782Lyp;
import X.C6JW;
import X.C6JY;
import X.InterfaceC16620sF;
import X.InterfaceC2056098k;
import X.InterfaceC23621Ds;
import X.JQ0;
import X.L4I;
import X.LLU;
import X.Lb1;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.msys.sharesender.StoryXmaShareSender$sendShare$1", f = "StoryXmaShareSender.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class StoryXmaShareSender$sendShare$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ C49306Lr0 A03;
    public final /* synthetic */ L4I A04;
    public final /* synthetic */ C38321qM A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryXmaShareSender$sendShare$1(ImageUrl imageUrl, C49306Lr0 c49306Lr0, L4I l4i, C38321qM c38321qM, User user, String str, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A05 = c38321qM;
        this.A03 = c49306Lr0;
        this.A04 = l4i;
        this.A00 = i;
        this.A06 = user;
        this.A07 = str;
        this.A01 = i2;
        this.A02 = imageUrl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C38321qM c38321qM = this.A05;
        C49306Lr0 c49306Lr0 = this.A03;
        L4I l4i = this.A04;
        int i = this.A00;
        return new StoryXmaShareSender$sendShare$1(this.A02, c49306Lr0, l4i, c38321qM, this.A06, this.A07, interfaceC23621Ds, i, this.A01);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryXmaShareSender$sendShare$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        String str;
        int i;
        int i2;
        AbstractC09560e7.A00(obj);
        C38321qM c38321qM = this.A05;
        C09530e4 A04 = LLU.A04(c38321qM, "StoryXmaShareSender", true);
        if (A04 == null) {
            A04 = new C09530e4(null, null);
        }
        ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) A04.A00;
        Bitmap bitmap = (Bitmap) A04.A01;
        C49306Lr0 c49306Lr0 = this.A03;
        C41761wQ c41761wQ = c49306Lr0.A00;
        UserSession userSession = c49306Lr0.A01;
        C6JY c6jy = C6JW.A00(userSession, "StoryXmaShareSender").A00;
        L4I l4i = this.A04;
        InterfaceC2056098k A0X = JQ0.A0X(l4i.A00);
        String str2 = l4i.A03;
        int i3 = this.A00;
        User user = this.A06;
        String username = user.getUsername();
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            Long l = new Long(c38321qM.A18());
            String str3 = this.A07;
            LLU llu = LLU.A00;
            String A01 = LLU.A01(userSession, c38321qM, c38321qM.A0C.B7K(), user);
            int i4 = this.A01;
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
                str = "image/heic";
                i = 0;
                i2 = 0;
            }
            String str4 = l4i.A04;
            ImageUrl imageUrl = this.A02;
            byte[] A09 = llu.A09(imageUrl, "StoryXmaShareSender");
            String A02 = LLU.A02(AbstractC43592JPx.A0w(imageUrl));
            c41761wQ.A02(AbstractC31180DnO.A0I(C6JY.A01(c6jy, A0X).A0L(new Lb1(l, c6jy, AbstractC43592JPx.A0r(imageUrl.getHeight()), AbstractC43592JPx.A0r(imageUrl.getWidth()), bArr, A09, username, A2u, str2, str, A01, A02, str4, str3, i3, i4, i, i2, 1)), "instagram_xma_story_share_client_send"), C49782Lyp.A00);
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
