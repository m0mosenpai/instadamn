package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Lhn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48780Lhn implements MRR {
    public final /* synthetic */ LLB A00;
    public final /* synthetic */ C45842KQx A01;

    @Override // X.MRR
    public final DirectShareTarget BuH() {
        return null;
    }

    @Override // X.MRR
    public final void Cu8(C148286ly c148286ly, EnumC46186KcO enumC46186KcO, int i) {
    }

    @Override // X.MRR
    public final void Cvn() {
    }

    @Override // X.MRR
    public final void D96(C148286ly c148286ly) {
    }

    @Override // X.MRR
    public final void DP2(C45058Jwn c45058Jwn, String str) {
    }

    @Override // X.MRR
    public final void DQH() {
    }

    @Override // X.MRR
    public final void DUW(JIN jin) {
    }

    @Override // X.MRR
    public final void Dp9(C45058Jwn c45058Jwn, DirectStoreSticker directStoreSticker, String str) {
    }

    @Override // X.MRR
    public final void Dvf() {
    }

    @Override // X.MRR
    public final void DwN(String str) {
    }

    @Override // X.MRR
    public final void DwO(String str) {
    }

    @Override // X.MRR
    public final void Ekm() {
    }

    public C48780Lhn(LLB llb, C45842KQx c45842KQx) {
        this.A00 = llb;
        this.A01 = c45842KQx;
    }

    @Override // X.MRR
    public final void Cyi(C148286ly c148286ly, C45058Jwn c45058Jwn, String str) {
        C3DN bottomSheetNavigator;
        ExtendedImageUrl extendedImageUrl;
        LLB llb = this.A00;
        C18A c18a = llb.A0Y;
        C45842KQx c45842KQx = this.A01;
        User A02 = c18a.A02(c45842KQx.A08);
        if (A02 != null) {
            DirectShareTarget directShareTarget = new DirectShareTarget(A02);
            if (c148286ly != null) {
                LLB.A02(llb, c45842KQx);
                Jn3 jn3 = llb.A0U;
                String str2 = c45842KQx.A09;
                String str3 = c45842KQx.A0B;
                ImageUrl imageUrl = c45842KQx.A04;
                String str4 = c45842KQx.A0E;
                AbstractC167017dG.A1R(str2, str3);
                UserSession userSession = jn3.A02;
                Long valueOf = Long.valueOf(jn3.A00);
                if (imageUrl != null) {
                    extendedImageUrl = new ExtendedImageUrl(imageUrl);
                } else {
                    extendedImageUrl = null;
                }
                long longValue = valueOf.longValue();
                C14360o3.A0B(userSession, 0);
                if (directShareTarget.A01() instanceof InterfaceC83703oF) {
                    C7YG A00 = C7YF.A00(userSession);
                    InterfaceC83713oG A01 = directShareTarget.A01();
                    C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadTarget");
                    A00.A02((InterfaceC83703oF) A01, AbstractC31175DnJ.A0f(directShareTarget), new C50280MIj(directShareTarget, userSession, c148286ly, extendedImageUrl, str2, str3, str4, 1, longValue), true);
                }
            }
        }
        BaseFragmentActivity baseFragmentActivity = llb.A0O;
        if (baseFragmentActivity != null && (bottomSheetNavigator = baseFragmentActivity.getBottomSheetNavigator()) != null) {
            bottomSheetNavigator.A0B();
        }
    }

    @Override // X.MRR
    public final void DJV(C45058Jwn c45058Jwn, C45026JwH c45026JwH, String str) {
        DirectShareTarget directShareTarget;
        DirectAnimatedMedia directAnimatedMedia;
        C3DN bottomSheetNavigator;
        LLB llb = this.A00;
        C18A c18a = llb.A0Y;
        C45842KQx c45842KQx = this.A01;
        User A02 = c18a.A02(c45842KQx.A08);
        ExtendedImageUrl extendedImageUrl = null;
        if (A02 != null) {
            directShareTarget = new DirectShareTarget(A02);
        } else {
            directShareTarget = null;
        }
        LLB.A02(llb, c45842KQx);
        UserSession userSession = llb.A0Q;
        if (directShareTarget != null) {
            Long valueOf = Long.valueOf(llb.A00);
            if (c45026JwH != null && (directAnimatedMedia = c45026JwH.A00) != null) {
                String str2 = c45842KQx.A09;
                String str3 = c45842KQx.A0B;
                ImageUrl imageUrl = c45842KQx.A04;
                if (imageUrl != null) {
                    extendedImageUrl = new ExtendedImageUrl(imageUrl);
                }
                String str4 = c45842KQx.A0E;
                long longValue = valueOf.longValue();
                AbstractC167017dG.A1S(str2, str3);
                if (directShareTarget.A01() instanceof InterfaceC83703oF) {
                    C7YG A00 = C7YF.A00(userSession);
                    InterfaceC83713oG A01 = directShareTarget.A01();
                    C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadTarget");
                    A00.A02((InterfaceC83703oF) A01, AbstractC31175DnJ.A0f(directShareTarget), new C50280MIj(directShareTarget, userSession, extendedImageUrl, directAnimatedMedia, str2, str3, str4, 0, longValue), true);
                }
                BaseFragmentActivity baseFragmentActivity = llb.A0O;
                if (baseFragmentActivity != null && (bottomSheetNavigator = baseFragmentActivity.getBottomSheetNavigator()) != null) {
                    bottomSheetNavigator.A0B();
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
