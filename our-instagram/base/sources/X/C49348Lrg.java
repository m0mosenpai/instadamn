package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Lrg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49348Lrg implements C7GL {
    public final /* synthetic */ LLB A00;
    public final /* synthetic */ C45842KQx A01;

    @Override // X.C7GL
    public final void E1P(Exception exc) {
    }

    @Override // X.C7GL
    public final /* synthetic */ void E1S() {
    }

    @Override // X.C7GL
    public final /* synthetic */ void E1T() {
    }

    public C49348Lrg(LLB llb, C45842KQx c45842KQx) {
        this.A00 = llb;
        this.A01 = c45842KQx;
    }

    @Override // X.C7GL
    public final void E1O(int i) {
        AbstractC135966Db.A01(this.A00.A0Q).A0D(EnumC46303KeZ.A0R);
    }

    @Override // X.C7GL
    public final void E1Q(boolean z, int i) {
        LLB llb = this.A00;
        if (llb.A0H && !AbstractC167007dF.A1Z(llb.A0b)) {
            AbstractC167007dF.A0w(llb.A0D);
        }
    }

    @Override // X.C7GL
    public final void E1R(boolean z) {
        LLB llb = this.A00;
        InterfaceC678133v interfaceC678133v = llb.A0X;
        if (interfaceC678133v != null && interfaceC678133v.isPlaying()) {
            interfaceC678133v.pause();
        }
        if (llb.A0H) {
            AbstractC167007dF.A0x(llb.A0D);
        }
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [X.Jvj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.1ae, X.1id, X.1OW] */
    @Override // X.C7GL
    public final void EOo(L33 l33, String str) {
        Boolean bool;
        String str2;
        String str3;
        LLB llb = this.A00;
        C18A c18a = llb.A0Y;
        C45842KQx c45842KQx = this.A01;
        User A02 = c18a.A02(c45842KQx.A08);
        C2DS c2ds = llb.A0W;
        Parcelable.Creator creator = PendingRecipient.CREATOR;
        C14360o3.A0A(A02);
        ExtendedImageUrl extendedImageUrl = null;
        DirectThreadKey BKb = c2ds.BZR(null, null, null, AbstractC31177DnL.A0j(A02)).BKb();
        C7TG c7tg = llb.A0V;
        long j = llb.A00;
        String str4 = c45842KQx.A09;
        String str5 = c45842KQx.A0B;
        ImageUrl imageUrl = c45842KQx.A04;
        if (imageUrl != null) {
            extendedImageUrl = new ExtendedImageUrl(imageUrl);
        }
        String str6 = c45842KQx.A0E;
        AbstractC37302Gc3.A1U(str4, str5);
        DirectThreadKey A01 = JRE.A01(BKb);
        UserSession userSession = c7tg.A03;
        L1W A00 = LCT.A00(userSession, A01);
        if (A00 != null) {
            bool = Boolean.valueOf(AbstractC46831KnQ.A00(A00));
        } else {
            bool = null;
        }
        EnumC159397Cz A022 = AbstractC159387Cy.A02(userSession, BKb, bool, C05F.A1F, false);
        boolean A012 = A022.A01();
        String A03 = C7TG.A03(c7tg, A012);
        JTa A023 = AbstractC31277Doz.A02(userSession, A00, C33771id.class);
        String str7 = A023.A03;
        C7TG.A08(c7tg, A01, str7, A03, null, 5, 1, false, A012);
        Long A013 = LCT.A01(userSession, BKb);
        long A05 = AbstractC31177DnL.A05();
        C4G2 A002 = LLY.A00(c7tg.A02, userSession, A022, BKb, l33, AbstractC43593JPy.A0r(str7), A03);
        C14360o3.A0B(A01, 2);
        ?? abstractC29011ae = new AbstractC29011ae(A023, A01, A013, A05);
        abstractC29011ae.A00 = new C4G2();
        String valueOf = String.valueOf(j);
        List A032 = A002.A03();
        if (A032 != null) {
            str2 = A032.toString();
        } else {
            str2 = null;
        }
        Integer A014 = A002.A01();
        if (A014 != null) {
            str3 = A014.toString();
        } else {
            str3 = null;
        }
        C14360o3.A0B(valueOf, 1);
        ?? obj = new Object();
        obj.A03 = valueOf;
        obj.A06 = str4;
        obj.A05 = str5;
        obj.A00 = extendedImageUrl;
        obj.A01 = null;
        obj.A07 = str2;
        obj.A04 = str3;
        obj.A02 = "voice_media";
        abstractC29011ae.A01 = obj;
        abstractC29011ae.A00 = A002;
        abstractC29011ae.A02 = extendedImageUrl;
        abstractC29011ae.A03 = str6;
        C7TG.A0B(c7tg, A03, abstractC29011ae.A06(), A01.A00, 5, false, A012);
        AbstractC31173DnH.A1U(userSession, abstractC29011ae);
        AbstractC135966Db.A01(llb.A0Q).A0D(EnumC46303KeZ.A0V);
        LLB.A01(null, llb, c45842KQx);
    }
}
