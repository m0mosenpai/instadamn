package X;

import android.content.Context;
import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Btz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26898Btz extends C3r5 {
    public final C26884Btl A00;
    public final C26885Btm A01;
    public final C26896Btx A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C26898Btz() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3r5, X.Btx] */
    public /* synthetic */ C26898Btz(AbstractC26878Btf abstractC26878Btf, AbstractC26879Btg abstractC26879Btg, AbstractC26880Bth abstractC26880Bth, C26884Btl c26884Btl, C26885Btm c26885Btm, C26896Btx c26896Btx, DefaultConstructorMarker defaultConstructorMarker, int i) {
        ?? c3r5 = new C3r5();
        C26884Btl c26884Btl2 = new C26884Btl(c3r5);
        C26885Btm c26885Btm2 = new C26885Btm(c3r5);
        this.A02 = c3r5;
        this.A00 = c26884Btl2;
        this.A01 = c26885Btm2;
    }

    public final InterfaceC30894Di7 A05(Context context, MidCardOverlayType midCardOverlayType, C38321qM c38321qM, String str) {
        InterfaceC30894Di7 c29552D0e;
        InterfaceC30890Di3 interfaceC30890Di3;
        InterfaceC30887Di0 interfaceC30887Di0;
        InterfaceC30889Di2 c26254BjN;
        InterfaceC30888Di1 interfaceC30888Di1;
        InterfaceC88553xD c117235Si;
        InterfaceC30885Dhy interfaceC30885Dhy;
        MusicInfo BVc;
        TrackData BVV;
        if (midCardOverlayType != null) {
            switch (midCardOverlayType.ordinal()) {
                case 1:
                    C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
                    if (A0u != null && (BVc = A0u.BVc()) != null && (BVV = BVc.BVV()) != null) {
                        interfaceC30885Dhy = new C26249BjI(BVV.getDisplayArtist(), BVV.getTitle());
                    } else {
                        interfaceC30885Dhy = D0O.A00;
                    }
                    c29552D0e = new C29551D0d(interfaceC30885Dhy);
                    break;
                case 5:
                    if (str != null) {
                        interfaceC30887Di0 = new C26252BjL(str);
                    } else {
                        interfaceC30887Di0 = D0Q.A00;
                    }
                    c29552D0e = new C29553D0f(interfaceC30887Di0);
                    break;
                case 6:
                    C3x9 A0u2 = AbstractC25226BEj.A0u(c38321qM);
                    if (A0u2 != null) {
                        MusicInfo BVc2 = A0u2.BVc();
                        if (BVc2 != null) {
                            c117235Si = new C88543xC(BVc2);
                        } else {
                            OriginalSoundDataIntf BZw = A0u2.BZw();
                            if (BZw != null) {
                                c117235Si = new C117235Si(BZw);
                            }
                        }
                        interfaceC30888Di1 = new C26253BjM(c117235Si.Adk(), c117235Si.AD3(context), c117235Si.Ach(), c117235Si.Ceq());
                        c29552D0e = new C29554D0g(interfaceC30888Di1);
                        break;
                    }
                    interfaceC30888Di1 = D0R.A00;
                    c29552D0e = new C29554D0g(interfaceC30888Di1);
                case 7:
                    c29552D0e = new C29555D0h(C26896Btx.A00(c38321qM));
                    break;
                case 8:
                case 10:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    User A14 = AbstractC25226BEj.A14(c38321qM);
                    if (A14 == null) {
                        c26254BjN = D0S.A00;
                    } else {
                        String username = A14.getUsername();
                        c26254BjN = new C26254BjN(A14.Bhu(), C26896Btx.A00(c38321qM), c38321qM.A0C.Bdm(), username, c38321qM.A0w(), c38321qM.A12(), c38321qM.A0s(), A14.isVerified());
                    }
                    c29552D0e = new C29557D0j(midCardOverlayType, c26254BjN);
                    break;
                case 9:
                    if (str == null) {
                        C0w9.A01(EnumC12410kj.A06, "MultiMediaVideoCardUseCase", "follower count not provided by server");
                    }
                    User A142 = AbstractC25226BEj.A14(c38321qM);
                    if (A142 != null) {
                        interfaceC30890Di3 = new C26255BjO(A142.Bhu(), C26896Btx.A00(c38321qM), A142.getUsername(), str, A142.isVerified());
                    } else {
                        interfaceC30890Di3 = D0T.A00;
                    }
                    c29552D0e = new C29556D0i(interfaceC30890Di3);
                    break;
            }
            return c29552D0e;
        }
        c29552D0e = new C29552D0e(C26896Btx.A00(c38321qM));
        return c29552D0e;
    }
}
