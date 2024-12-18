package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Jhf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44289Jhf implements C2n2 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.L8D, X.MO8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.L8D, X.MO8] */
    @Override // X.C2n2
    public final Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                NametagController nametagController = (NametagController) this.A01;
                Context context = nametagController.A07;
                ViewGroup viewGroup = nametagController.mRootView;
                InterfaceC11380iw interfaceC11380iw = nametagController.A0C;
                UserSession userSession = nametagController.A0D;
                boolean z = nametagController.A03;
                C14360o3.A0B(context, 0);
                AbstractC167027dH.A13(viewGroup, interfaceC11380iw, userSession);
                new L8D(context, viewGroup, interfaceC11380iw, userSession, z).FEH();
                AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, userSession.userId, nametagController.A0F, "download_qr_code", (String) obj);
                return null;
            case 1:
                NametagController nametagController2 = (NametagController) this.A01;
                Context context2 = nametagController2.A07;
                ViewGroup viewGroup2 = nametagController2.mRootView;
                InterfaceC11380iw interfaceC11380iw2 = nametagController2.A0C;
                UserSession userSession2 = nametagController2.A0D;
                boolean z2 = nametagController2.A03;
                C14360o3.A0B(context2, 0);
                AbstractC167027dH.A13(viewGroup2, interfaceC11380iw2, userSession2);
                new L8D(context2, viewGroup2, interfaceC11380iw2, userSession2, z2).FEH();
                AbstractC73317Y7a.A0J(interfaceC11380iw2, userSession2, userSession2.userId, nametagController2.A0F, "download_qr_code", (String) obj);
                return null;
            case 2:
                String str = (String) obj;
                NametagController nametagController3 = (NametagController) ((KKj) this.A01).A01;
                Activity activity = nametagController3.A06;
                AbstractC13900nG.A00(activity, str);
                AbstractC34301FAv.A00(activity, null, null, false);
                UserSession userSession3 = nametagController3.A0D;
                AbstractC73317Y7a.A0J(nametagController3.A0C, userSession3, userSession3.userId, nametagController3.A0F, "copy_link", str);
                return null;
            case 3:
                final C44272JhO c44272JhO = (C44272JhO) this.A01;
                if (!AbstractC166987dD.A1a(obj)) {
                    AbstractC12120kG.A01("VideoCaptureController", "external_dir_unavailable_and_failed_to_start_camera");
                    new Handler().post(new Runnable() { // from class: X.M01
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9GR.A0F(AbstractC25225BEi.A0F(C44272JhO.this.A04), "failed_to_create_video_directories", 2131962079);
                        }
                    });
                    return null;
                }
                return null;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 11:
            default:
                return ((InterfaceC16660sJ) this.A01).invoke(obj);
            case 6:
            case 10:
                return ((C50256MHl) ((InterfaceC16660sJ) this.A01)).invoke(obj);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Context context3 = (Context) this.A01;
                AbstractC13900nG.A00(context3, (String) obj);
                C9GR.A07(context3, 2131965226);
                return null;
        }
    }

    public C44289Jhf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
