package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.M3y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49957M3y implements Runnable {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ C45487KCc A01;

    public RunnableC49957M3y(CommentGiphyMediaInfo commentGiphyMediaInfo, C45487KCc c45487KCc) {
        this.A01 = c45487KCc;
        this.A00 = commentGiphyMediaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float A04;
        float A042;
        C45487KCc c45487KCc = this.A01;
        InterfaceC56392iX interfaceC56392iX = c45487KCc.A0M;
        if (interfaceC56392iX != null) {
            View view = interfaceC56392iX.getView();
            UserSession A0r = AbstractC166987dD.A0r(c45487KCc.A0i);
            CommentGiphyMediaInfo commentGiphyMediaInfo = this.A00;
            C74P A00 = AbstractC47851LBu.A00(view, commentGiphyMediaInfo, A0r);
            if (A00 != null) {
                Float A01 = AbstractC47851LBu.A01(commentGiphyMediaInfo);
                if (A01 != null) {
                    float floatValue = A01.floatValue();
                    InterfaceC56392iX interfaceC56392iX2 = c45487KCc.A0M;
                    if (interfaceC56392iX2 != null) {
                        ViewGroup.LayoutParams layoutParams = interfaceC56392iX2.getView().getLayoutParams();
                        if (floatValue > 1.0f) {
                            layoutParams.width = AbstractC166987dD.A0C(c45487KCc.requireContext(), 160);
                            A042 = AbstractC13880nE.A04(c45487KCc.requireContext(), HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                        } else {
                            Context requireContext = c45487KCc.requireContext();
                            if (floatValue < 1.0f) {
                                A04 = AbstractC13880nE.A04(requireContext, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                            } else {
                                A04 = AbstractC13880nE.A04(requireContext, 160);
                            }
                            layoutParams.width = (int) A04;
                            A042 = AbstractC13880nE.A04(c45487KCc.requireContext(), 160);
                        }
                        layoutParams.height = (int) A042;
                        InterfaceC56392iX interfaceC56392iX3 = c45487KCc.A0M;
                        if (interfaceC56392iX3 != null) {
                            interfaceC56392iX3.getView().setLayoutParams(layoutParams);
                        }
                    }
                }
                InterfaceC56392iX interfaceC56392iX4 = c45487KCc.A0M;
                if (interfaceC56392iX4 != null) {
                    ((ImageView) interfaceC56392iX4.getView()).setImageDrawable(A00);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("gifSquareViewStub");
        throw C00O.createAndThrow();
    }
}
