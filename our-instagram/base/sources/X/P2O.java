package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes9.dex */
public final class P2O implements GZ7 {
    public final int A00;
    public final Object A01;

    public P2O(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        Context requireContext;
        int i;
        ImageUrl A1S;
        RoundedCornerImageView roundedCornerImageView;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c38321qM, 0);
                N5O n5o = (N5O) this.A01;
                n5o.A04 = c38321qM;
                N5O.A00(n5o, false);
                RoundedCornerImageView roundedCornerImageView2 = n5o.A03;
                if (roundedCornerImageView2 != null) {
                    roundedCornerImageView2.setBitmapShaderScaleType(C3OB.A02);
                }
                C38321qM c38321qM2 = n5o.A04;
                if (c38321qM2 != null && (A1S = c38321qM2.A1S()) != null && (roundedCornerImageView = n5o.A03) != null) {
                    roundedCornerImageView.setUrl(A1S, n5o);
                }
                TextView textView = n5o.A01;
                if (textView != null) {
                    AbstractC166987dD.A1P(n5o.requireContext(), textView, 2131952252);
                }
                TextView textView2 = n5o.A00;
                if (textView2 != null) {
                    Context requireContext2 = n5o.requireContext();
                    C38321qM c38321qM3 = n5o.A04;
                    if (c38321qM3 != null && c38321qM3.A5P()) {
                        requireContext = n5o.requireContext();
                        i = 2131954072;
                    } else {
                        requireContext = n5o.requireContext();
                        i = 2131954071;
                    }
                    AbstractC31177DnL.A0r(requireContext2, textView2, AbstractC25227BEk.A0u(requireContext, i), 2131952251);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = n5o.A05;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryActionText(n5o.requireContext().getString(2131970322));
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = n5o.A05;
                if (igdsBottomButtonLayout2 != null) {
                    igdsBottomButtonLayout2.setPrimaryActionOnClickListener(new ViewOnClickListenerC55467OkM(n5o, 69));
                }
                TextView textView3 = n5o.A02;
                if (textView3 != null) {
                    AbstractC166987dD.A1P(n5o.requireContext(), textView3, 2131976849);
                }
                TextView textView4 = n5o.A02;
                if (textView4 != null) {
                    ViewOnClickListenerC55467OkM.A00(textView4, 70, n5o);
                }
                ((C70399WUb) AbstractC166987dD.A17(n5o.A09)).A0I(VG4.A1N, "reshared_media_ad_not_delivering");
                return;
            case 1:
            case 3:
            default:
                C14360o3.A0B(c38321qM, 0);
                ((InterfaceC23621Ds) this.A01).resumeWith(c38321qM);
                return;
            case 2:
                C14360o3.A0B(c38321qM, 0);
                ((OAR) this.A01).A02.Egh(c38321qM);
                return;
            case 4:
                C14360o3.A0B(c38321qM, 0);
                C37675GiC c37675GiC = (C37675GiC) this.A01;
                UserSession userSession = c37675GiC.A0C;
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0b, userSession);
                c116875Qr.A1D = c38321qM.getId();
                c116875Qr.A1I = "";
                c116875Qr.A09 = EnumC120785dO.QUESTION_REPLY;
                AbstractC86593tX.A0X(c37675GiC.A07, c116875Qr.A00(), userSession);
                return;
        }
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        InterfaceC23621Ds interfaceC23621Ds;
        C09540e5 A0d;
        switch (this.A00) {
            case 0:
                N5O.A00((N5O) this.A01, false);
                throw new C141786av(AnonymousClass001.A0R(AbstractC58317Pt9.A00(32), AbstractC111324zv.A00(322)));
            case 1:
                interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                A0d = AbstractC50523MSb.A0d(MSW.A0y(str));
                break;
            case 2:
                return;
            case 3:
                interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                A0d = null;
                break;
            default:
                C0f5 AEp = C18950wb.A01.AEp("ClipsMediaItemViewBinderDelegateKt", 817902720);
                AEp.ABW(DialogModule.KEY_MESSAGE, "Failed to fetch q&a response sticker original media: $errorMessage");
                AEp.report();
                return;
        }
        interfaceC23621Ds.resumeWith(A0d);
    }
}
