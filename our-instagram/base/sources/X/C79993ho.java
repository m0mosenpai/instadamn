package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.3ho, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79993ho {
    public PopupWindow A00;
    public String A01;

    public final void A00(Rect rect, ViewParent viewParent, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C2EY c2ey, Integer num, int i, long j) {
        String str;
        AbstractC31781Dxr c32880EdM;
        if (this.A00 == null) {
            if (c38321qM != null) {
                str = c38321qM.getId();
            } else {
                str = null;
            }
            this.A01 = str;
            if (C18U.A06(C06090Tz.A05, userSession, 36326756080171120L)) {
                c32880EdM = new C32881EdN(rect, viewParent, fragmentActivity, abstractC59962oe, interfaceC11380iw, userSession, c38321qM, interfaceC60442pS, c2ey, num, i, j);
            } else {
                c32880EdM = new C32880EdM(fragmentActivity, rect, viewParent, interfaceC11380iw, userSession, c38321qM, num, i, j);
            }
            c32880EdM.A00();
            c32880EdM.setOnDismissListener(new C55521OlF(this));
            this.A00 = c32880EdM;
        }
    }

    public final void A01(MotionEvent motionEvent, String str) {
        PopupWindow popupWindow;
        AbstractC31781Dxr abstractC31781Dxr;
        C17v c17u;
        int i;
        int i2;
        AbstractC31781Dxr abstractC31781Dxr2;
        if (C14360o3.A0K(this.A01, str) && (popupWindow = this.A00) != null && popupWindow.isShowing()) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    PopupWindow popupWindow2 = this.A00;
                    if (!(popupWindow2 instanceof AbstractC31781Dxr) || (abstractC31781Dxr2 = (AbstractC31781Dxr) popupWindow2) == null) {
                        return;
                    }
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY() - abstractC31781Dxr2.A0E;
                    for (FQC fqc : abstractC31781Dxr2.A0R) {
                        AbstractC35127FeU abstractC35127FeU = fqc.A02;
                        PointF pointF = new PointF(abstractC35127FeU.A00, abstractC35127FeU.A01);
                        float f = pointF.x;
                        if (rawX > f - abstractC31781Dxr2.A0A && rawX < f + abstractC31781Dxr2.A0B) {
                            float f2 = pointF.y;
                            if (rawY > f2 - abstractC31781Dxr2.A0C && rawY < f2 + abstractC31781Dxr2.A09) {
                                if (!fqc.A00) {
                                    fqc.A00 = true;
                                    float f3 = abstractC35127FeU.A05;
                                    Context context = abstractC35127FeU.A06;
                                    float dimension = context.getResources().getDimension(R.dimen.abc_select_dialog_padding_start_material);
                                    IgTextView igTextView = abstractC35127FeU.A09;
                                    abstractC35127FeU.A04 = igTextView.getY();
                                    AbstractC35127FeU.A00(abstractC35127FeU, 1.38f, 1.38f);
                                    igTextView.setTextSize(context.getResources().getDimension(R.dimen.group_mention_sticker_title_text_size_step));
                                    AbstractC35127FeU.A01(abstractC35127FeU, 5.0f, 5.0f, (abstractC35127FeU.A04 - ((1.38f * f3) - f3)) - dimension);
                                    C2UY.A01.A03();
                                }
                            }
                        }
                        if (fqc.A00) {
                            fqc.A00 = false;
                            AbstractC35127FeU.A00(abstractC35127FeU, 1.0f, 1.0f);
                            AbstractC35127FeU.A01(abstractC35127FeU, 0.0f, 0.0f, abstractC35127FeU.A04);
                        }
                    }
                    return;
                }
            }
            PopupWindow popupWindow3 = this.A00;
            if (!(popupWindow3 instanceof AbstractC31781Dxr) || (abstractC31781Dxr = (AbstractC31781Dxr) popupWindow3) == null) {
                return;
            }
            abstractC31781Dxr.A02(System.currentTimeMillis() - abstractC31781Dxr.A0F);
            abstractC31781Dxr.A07 = true;
            boolean A00 = AbstractC34190F6o.A00(abstractC31781Dxr.A0P);
            List list = abstractC31781Dxr.A0R;
            if (A00) {
                c17u = new C17v(list.size(), 1, -1);
            } else {
                c17u = new C17u(1, list.size());
            }
            int i3 = c17u.A00;
            int i4 = c17u.A01;
            int i5 = c17u.A02;
            if (i5 <= 0 ? !(i5 >= 0 || i4 > i3) : i3 <= i4) {
                while (true) {
                    if (A00) {
                        i2 = i3 - 1;
                        i = Math.abs(list.size() - i2);
                    } else {
                        i = i3 - 1;
                        i2 = i;
                    }
                    long j = i * 10;
                    FQC fqc2 = (FQC) list.get(i2);
                    if (fqc2.A00) {
                        AbstractC35127FeU abstractC35127FeU2 = fqc2.A02;
                        AbstractC35127FeU.A00(abstractC35127FeU2, 1.0f, 1.0f);
                        AbstractC35127FeU.A01(abstractC35127FeU2, 0.0f, 0.0f, abstractC35127FeU2.A04);
                    }
                    fqc2.A02.A07.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setStartDelay(j).setDuration(200L).start();
                    if (i3 == i4) {
                        break;
                    } else {
                        i3 += i5;
                    }
                }
            }
            C2UY.A01.A03();
            C55982hj c55982hj = abstractC31781Dxr.A05;
            if (c55982hj != null) {
                c55982hj.A06(0.0d);
                C55982hj c55982hj2 = abstractC31781Dxr.A05;
                if (c55982hj2 != null) {
                    if (c55982hj2.A09.A00 != 0.0d) {
                        return;
                    }
                    abstractC31781Dxr.Dnk(c55982hj2);
                    return;
                }
            }
            C14360o3.A0F("spring");
            throw C00O.createAndThrow();
        }
    }
}
