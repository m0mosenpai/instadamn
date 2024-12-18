package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import com.instagram.user.model.User;

/* renamed from: X.Ftc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35918Ftc implements C97X {
    public final int A00;
    public final Object A01;

    public C35918Ftc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C97X
    public final void onError(Throwable th) {
        if (this.A00 == 0) {
            C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
            TextView textView = c31721DwQ.A0F;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = c31721DwQ.A02;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    @Override // X.C97X
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String string;
        C31590DuI c31590DuI;
        C31590DuI c31590DuI2 = (C31590DuI) obj;
        switch (this.A00) {
            case 0:
                C31721DwQ c31721DwQ = (C31721DwQ) this.A01;
                c31721DwQ.A0U = c31590DuI2;
                if (!c31721DwQ.A0s.A2H() && (c31590DuI = c31721DwQ.A0U) != null && !TextUtils.isEmpty(c31590DuI.A01)) {
                    String str = c31721DwQ.A0U.A01;
                    c31721DwQ.A02.setVisibility(0);
                    TextView A0e = AbstractC166987dD.A0e(c31721DwQ.A03, R.id.page_text);
                    if (A0e != null) {
                        A0e.setText(str);
                        ViewOnClickListenerC31724DwT.A01(A0e, c31721DwQ, 65);
                    }
                } else {
                    c31721DwQ.A02.setVisibility(8);
                }
                if (!C2E7.A01(c31721DwQ.A0s) && !C4K3.A00(c31721DwQ.A0V)) {
                    c31721DwQ.A0F.setVisibility(8);
                    return;
                }
                int i = 0;
                c31721DwQ.A07.setVisibility(0);
                TextView A0T = AbstractC166997dE.A0T(c31721DwQ.A03, R.id.connect_business_page_text);
                c31721DwQ.A0G = A0T;
                if (A0T != null) {
                    AbstractC56952jT.A01(A0T);
                }
                c31721DwQ.A0r = (ImageWithTitleTextView) c31721DwQ.A03.findViewById(R.id.confirm_your_page);
                User user = c31721DwQ.A0s;
                if (user != null && c31721DwQ.mView != null) {
                    TextView textView = c31721DwQ.A0G;
                    if (textView != null) {
                        C31590DuI c31590DuI3 = c31721DwQ.A0U;
                        if (c31590DuI3 != null && !c31590DuI3.A04) {
                            string = c31590DuI3.A02;
                            String str2 = c31590DuI3.A01;
                            if (TextUtils.isEmpty(string)) {
                                string = str2;
                            }
                        } else if (!user.A1K() && !C31721DwQ.A0Q(c31721DwQ)) {
                            C31590DuI c31590DuI4 = c31721DwQ.A0U;
                            if (c31590DuI4 == null) {
                                string = null;
                            } else {
                                string = c31590DuI4.A02;
                            }
                        } else {
                            boolean A0Q = C31721DwQ.A0Q(c31721DwQ);
                            CallerContext callerContext = C35793FrV.A00;
                            int i2 = 2131955175;
                            if (A0Q) {
                                i2 = 2131956620;
                            }
                            string = c31721DwQ.getString(i2);
                        }
                        textView.setText(string);
                    }
                    ImageWithTitleTextView imageWithTitleTextView = c31721DwQ.A0r;
                    if (imageWithTitleTextView != null) {
                        C31590DuI c31590DuI5 = c31721DwQ.A0U;
                        if (c31590DuI5 == null || c31590DuI5.A04) {
                            i = 8;
                        }
                        imageWithTitleTextView.setVisibility(i);
                    }
                }
                View requireViewById = c31721DwQ.A03.requireViewById(R.id.business_page);
                C31721DwQ.A05(requireViewById, c31721DwQ);
                ViewOnClickListenerC31724DwT.A01(requireViewById, c31721DwQ, 64);
                return;
            case 1:
                C14360o3.A0B(c31590DuI2, 0);
                C33227ElJ c33227ElJ = (C33227ElJ) this.A01;
                c33227ElJ.A01 = c31590DuI2;
                c33227ElJ.setItems(C33227ElJ.A00(c33227ElJ));
                return;
            default:
                DialogInterfaceOnCancelListenerC32263EIy dialogInterfaceOnCancelListenerC32263EIy = (DialogInterfaceOnCancelListenerC32263EIy) this.A01;
                String str3 = c31590DuI2.A02;
                if (str3 != null) {
                    ShareLaterMedia shareLaterMedia = dialogInterfaceOnCancelListenerC32263EIy.A01;
                    if (shareLaterMedia != null) {
                        EnumC53382NjX.A05.A08(shareLaterMedia, true);
                        if (AbstractC31178DnM.A1X(C06090Tz.A05, dialogInterfaceOnCancelListenerC32263EIy.A00, 36328852024213325L)) {
                            AbstractC25651Mw.A00(dialogInterfaceOnCancelListenerC32263EIy.A00).E4s(new C55999OtW(true));
                        }
                    }
                    dialogInterfaceOnCancelListenerC32263EIy.A02 = true;
                    AbstractC25651Mw.A00(dialogInterfaceOnCancelListenerC32263EIy.A00).E4s(new C36111Fwl(str3, true, true));
                    return;
                }
                return;
        }
    }
}
