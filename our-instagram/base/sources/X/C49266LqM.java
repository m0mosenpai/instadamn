package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.LqM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49266LqM implements MR4 {
    public final /* synthetic */ C47988LJq A00;

    @Override // X.MR4
    public final void DDI(String str, int i) {
        String str2;
        C47988LJq c47988LJq = this.A00;
        if (c47988LJq.A0B) {
            LKK lkk = c47988LJq.A08;
            if (lkk == null) {
                C14360o3.A0F("reactionsTrayController");
                throw C00O.createAndThrow();
            }
            lkk.A06(i);
            IgTextView igTextView = c47988LJq.A06;
            if (i == 0) {
                if (igTextView != null) {
                    igTextView.setVisibility(0);
                }
                C47988LJq.A02(c47988LJq, str);
            } else {
                AbstractC167007dF.A0x(igTextView);
            }
            DirectThreadKey A02 = JRE.A02(c47988LJq.A0T);
            if (c47988LJq.A0H == 29 && A02 != null) {
                C142846ck A00 = AbstractC147806l5.A00(c47988LJq.A0Q);
                int i2 = c47988LJq.A0E;
                String str3 = A02.A00;
                String str4 = A02.A01;
                boolean A1N = AbstractC167007dF.A1N(i);
                C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, A00);
                    AbstractC31174DnI.A1I(A0I, "reaction_selected");
                    A0I.A0o("reaction_list");
                    A0I.A0h(AbstractC31179DnN.A0a(A0I, "reaction_sheet", str3, str4, i2));
                    if (A1N) {
                        str2 = "True";
                    } else {
                        str2 = "False";
                    }
                    A0I.A0v(AbstractC167007dF.A0n("is_double_tap", str2));
                    A0I.A0u(A00.A01);
                    A0I.Cht();
                    return;
                }
                return;
            }
            return;
        }
        c47988LJq.A0S.A00(str, NetInfoModule.CONNECTION_TYPE_NONE, "emoji_tray");
    }

    @Override // X.MR4
    public final void Du5(View view) {
        C47988LJq c47988LJq = this.A00;
        if (c47988LJq.A0C) {
            c47988LJq.A0C = false;
            AnimatorSet animatorSet = c47988LJq.A03;
            if (animatorSet != null) {
                animatorSet.cancel();
                c47988LJq.A0K.cancel();
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationY", 0.0f).setDuration(200L);
                C14360o3.A07(duration);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), 1.0f);
                ofFloat.setDuration(200L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f);
                ofFloat2.setDuration(200L);
                view.setRotation(0.0f);
                animatorSet2.playTogether(duration, ofFloat2, ofFloat);
                animatorSet2.start();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.MR4
    public final void DuH(String str, View view) {
        C47988LJq c47988LJq = this.A00;
        if (!c47988LJq.A0C && !c47988LJq.A0B) {
            if (view.getParent() != null) {
                AbstractC46900Koh.A00(AbstractC124845kp.A00(view));
            }
            c47988LJq.A03 = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationY", -c47988LJq.A0N.requireViewById(R.id.emoji_reaction_container).getHeight()).setDuration(200L);
            C14360o3.A07(duration);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", -4.0f, 4.0f);
            ofFloat.setStartDelay(200L);
            ofFloat.setDuration(100L);
            int i = c47988LJq.A0F;
            ofFloat.setRepeatCount(i / 100);
            ofFloat.setRepeatMode(2);
            ofFloat.addListener(new LLp(view, c47988LJq, str, 1));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.2f);
            ofFloat2.setDuration(200L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.2f);
            ofFloat3.setDuration(200L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 1.2f, 1.5f);
            ofFloat4.setStartDelay(200L);
            long j = i;
            ofFloat4.setDuration(j);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleX", 1.2f, 1.5f);
            ofFloat5.setStartDelay(200L);
            ofFloat5.setDuration(j);
            AnimatorSet animatorSet = c47988LJq.A03;
            if (animatorSet != null) {
                animatorSet.playTogether(duration, ofFloat3, ofFloat2, ofFloat, ofFloat5, ofFloat4);
            }
            AnimatorSet animatorSet2 = c47988LJq.A03;
            if (animatorSet2 != null) {
                animatorSet2.setStartDelay(200L);
            }
            AnimatorSet animatorSet3 = c47988LJq.A03;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            c47988LJq.A0C = true;
        }
    }

    public C49266LqM(C47988LJq c47988LJq) {
        this.A00 = c47988LJq;
    }

    @Override // X.MR4
    public final void D8z() {
        int A08;
        String str;
        C47988LJq c47988LJq = this.A00;
        FrameLayout frameLayout = c47988LJq.A0N;
        c47988LJq.A00 = frameLayout.getTranslationY();
        UserSession userSession = c47988LJq.A0Q;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36326738900301886L);
        float f = 0.2f;
        if (A06) {
            f = 0.15f;
        }
        FrameLayout frameLayout2 = c47988LJq.A0M;
        c47988LJq.A01 = (frameLayout2.getHeight() - C30D.A00) * f;
        View view = c47988LJq.A04;
        if (view == null) {
            view = LayoutInflater.from(c47988LJq.A0I).inflate(R.layout.customize_reactions_label_container, (ViewGroup) frameLayout2, false);
            c47988LJq.A06 = AbstractC31172DnG.A0X(view, R.id.double_tap_label);
            frameLayout2.addView(view);
            c47988LJq.A04 = view;
        }
        view.setAlpha(0.0f);
        IgTextView igTextView = c47988LJq.A06;
        if (igTextView != null) {
            igTextView.setVisibility(0);
        }
        LKK lkk = c47988LJq.A08;
        if (lkk == null) {
            C14360o3.A0F("reactionsTrayController");
            throw C00O.createAndThrow();
        }
        C47988LJq.A02(c47988LJq, AbstractC25226BEj.A1I(lkk.A03(), 0));
        InterfaceC56392iX interfaceC56392iX = c47988LJq.A0R;
        boolean CWW = interfaceC56392iX.CWW();
        View view2 = interfaceC56392iX.getView();
        interfaceC56392iX.setVisibility(0);
        if (!CWW) {
            ImageView A0D = AbstractC31176DnK.A0D(view2, R.id.reset_icon);
            Context context = c47988LJq.A0I;
            A0D.setColorFilter(AbstractC53242c7.A0F(context, R.attr.textColorOnMedia));
            ViewOnClickListenerC48062LPn.A00(A0D, 52, c47988LJq);
            ImageView A0D2 = AbstractC31176DnK.A0D(view2, R.id.save_icon);
            A0D2.setColorFilter(AbstractC53242c7.A0F(context, R.attr.textColorOnMedia));
            ViewOnClickListenerC48062LPn.A00(A0D2, 53, c47988LJq);
        }
        View view3 = c47988LJq.A0L;
        view3.setVisibility(0);
        c47988LJq.A0D = false;
        ViewGroup viewGroup = c47988LJq.A05;
        if (viewGroup != null) {
            C47988LJq.A01(viewGroup, c47988LJq, 0);
        }
        String str2 = null;
        lkk.A06(0);
        C48259LXi c48259LXi = c47988LJq.A0S.A00;
        MRL mrl = c48259LXi.A0E;
        if (mrl != null) {
            mrl.DDn();
            PopupWindow popupWindow = c48259LXi.A0C;
            if (popupWindow != null && popupWindow.getContentView() != null) {
                popupWindow.getContentView().setVisibility(4);
                popupWindow.setTouchable(false);
                popupWindow.update();
            }
        }
        DirectThreadKey A02 = JRE.A02(c47988LJq.A0T);
        if (A06) {
            A08 = -2;
        } else {
            A08 = ((int) (AbstractC166987dD.A08(frameLayout2) * 0.55f)) - C30D.A00;
        }
        int i = c47988LJq.A0G;
        int i2 = c47988LJq.A0H;
        if (A02 != null) {
            str = A02.A00;
            str2 = A02.A01;
        } else {
            str = null;
        }
        int i3 = c47988LJq.A0E;
        List list = c47988LJq.A0V;
        if (list == null) {
            list = AbstractC166987dD.A1E();
        }
        KDS A00 = AbstractC46899Kog.A00(userSession, str, str2, list, A08, i, i2, i3, false, false);
        View view4 = c47988LJq.A04;
        if (view4 != null) {
            view4.setVisibility(8);
            interfaceC56392iX.setVisibility(8);
            C189448aO A0X = AbstractC31177DnL.A0X(userSession, A06);
            A0X.A1O = false;
            A0X.A0k = false;
            A0X.A0q = true;
            A0X.A0X = new C46045KZt(c47988LJq, 1);
            A0X.A0T = new C49614Lw7(c47988LJq, A00);
            Context context2 = c47988LJq.A0I;
            A0X.A06 = AbstractC53242c7.A0F(context2, R.attr.igds_color_elevated_background);
            if (A06) {
                A0X.A03 = 0.65f;
            }
            c47988LJq.A09 = A0X.A00();
            A00.A01 = new C49262LqI(c47988LJq, 2);
            view3.setAlpha(1.0f);
            ViewOnClickListenerC48062LPn.A00(view3, 54, c47988LJq);
            C189478aR c189478aR = c47988LJq.A09;
            if (c189478aR != null) {
                C189478aR.A00(context2, context2, A00, c189478aR, c47988LJq.A0U);
            }
            if (mrl != null) {
                mrl.DXN();
            }
            frameLayout.setVisibility(8);
            if (i2 == 29 && A02 != null) {
                AbstractC147806l5.A00(userSession).A0B(i3, A02.A00, A02.A01);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.MR4
    public final void onDismiss() {
        C48259LXi.A03(this.A00.A0S.A00);
    }
}
