package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.4Zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97474Zh {
    public static final void A00(UserSession userSession, InterfaceC97454Zf interfaceC97454Zf, C4ZU c4zu, InterfaceC41201vU interfaceC41201vU) {
        String str;
        String str2;
        List list;
        String str3;
        InterfaceC43519JKf interfaceC43519JKf;
        C14360o3.A0B(c4zu, 1);
        List<C84823qW> BlY = interfaceC41201vU.BlY(EnumC75383a5.A0L);
        if (BlY != null && !BlY.isEmpty()) {
            InterfaceC56392iX interfaceC56392iX = c4zu.A07;
            interfaceC56392iX.setVisibility(0);
            String str4 = c4zu.A00;
            C38321qM BQN = interfaceC41201vU.BQN();
            if (BQN != null) {
                str = BQN.getId();
            } else {
                str = null;
            }
            if (!C14360o3.A0K(str4, str)) {
                c4zu.A04 = false;
                c4zu.A05 = AbstractC75373a4.A07(userSession);
            }
            C38321qM BQN2 = interfaceC41201vU.BQN();
            if (BQN2 != null) {
                str2 = BQN2.getId();
            } else {
                str2 = null;
            }
            c4zu.A00 = str2;
            C4ZU.A00(c4zu).removeAllViews();
            float Ack = interfaceC41201vU.Ack(userSession);
            c4zu.A03 = new DT0(20, c4zu, interfaceC41201vU, userSession, interfaceC97454Zf);
            c4zu.A01 = new C29900DGo(18, interfaceC41201vU, c4zu, interfaceC97454Zf);
            c4zu.A02 = new C50362MLo(18, userSession, c4zu);
            for (C84823qW c84823qW : BlY) {
                C38798H6n c38798H6n = c84823qW.A0g;
                if (c38798H6n != null && (((list = c38798H6n.A09) != null && (interfaceC43519JKf = (InterfaceC43519JKf) AbstractC001800i.A0J(list)) != null && (str3 = interfaceC43519JKf.CAg()) != null) || (str3 = c38798H6n.A05) != null)) {
                    if (str3.length() != 0) {
                        LayoutInflater from = LayoutInflater.from(interfaceC56392iX.getView().getContext());
                        View inflate = from.inflate(R.layout.translated_text_sticker_image_view, (ViewGroup) null, false);
                        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                        ImageView imageView = (ImageView) inflate;
                        imageView.setTag(new C41107IHy(c38798H6n, c84823qW.A1L, c84823qW.A1K, str3));
                        View inflate2 = from.inflate(R.layout.translated_text_sticker_touch_lauout, (ViewGroup) null, false);
                        inflate2.setTag(new C41107IHy(null, c84823qW.A1L, c84823qW.A1K, null));
                        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC23278ATn(inflate2, imageView, c4zu, c84823qW, Ack));
                        C4ZU.A03(userSession, c4zu, Boolean.valueOf(c4zu.A05), Float.valueOf(0.0f), new C0eE(new View[]{imageView, inflate2}));
                        C4ZU.A02(imageView, inflate2, C4ZU.A01(c4zu), c84823qW, Ack);
                        if (!C18U.A06(C06090Tz.A05, userSession, 36322860545223368L)) {
                            C0fQ.A00(new ViewOnClickListenerC28633Ckh(interfaceC97454Zf, c4zu, interfaceC41201vU), inflate2);
                        }
                        C4ZU.A00(c4zu).addView(imageView);
                        C4ZU.A00(c4zu).addView(inflate2);
                    }
                }
            }
            return;
        }
        InterfaceC56392iX interfaceC56392iX2 = c4zu.A07;
        if (interfaceC56392iX2.CWW()) {
            C4ZU.A00(c4zu).removeAllViews();
        }
        interfaceC56392iX2.setVisibility(8);
    }

    public static final void A01(C4ZU c4zu) {
        C14360o3.A0B(c4zu, 0);
        InterfaceC56392iX interfaceC56392iX = c4zu.A07;
        if (interfaceC56392iX.CWW()) {
            C4ZU.A00(c4zu).removeAllViews();
        }
        interfaceC56392iX.setVisibility(8);
    }
}
