package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.8cE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190568cE implements InterfaceC190578cF {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C190398bx A01;

    public C190568cE(AbstractC59962oe abstractC59962oe, C190398bx c190398bx) {
        this.A01 = c190398bx;
        this.A00 = abstractC59962oe;
    }

    @Override // X.InterfaceC190578cF
    public final void DJn() {
        C190398bx c190398bx = this.A01;
        ConstrainedEditText constrainedEditText = c190398bx.A1j;
        String obj = constrainedEditText.getText().toString();
        UserSession userSession = c190398bx.A1J;
        ArrayList A01 = AbstractC209689Pe.A01(userSession, obj);
        ImmutableList of = ImmutableList.of((Object) C17060sy.A01.A01(userSession));
        C14360o3.A0B(of, 5);
        final C217859kI c217859kI = new C217859kI(new StoryGroupMentionTappableData(0, null, "", null, of));
        c217859kI.A06.addAll(A01);
        c190398bx.A0T = new Runnable() { // from class: X.AwB
            @Override // java.lang.Runnable
            public final void run() {
                C190568cE.this.A01.A1W.E4u(new C8VE(c217859kI));
            }
        };
        c190398bx.A0Z();
        constrainedEditText.clearFocus();
    }

    @Override // X.InterfaceC190578cF
    public final void DJp(final C217859kI c217859kI) {
        C190398bx c190398bx = this.A01;
        c190398bx.A0T = new Runnable() { // from class: X.AwA
            @Override // java.lang.Runnable
            public final void run() {
                C190568cE.this.A01.A1W.E4u(new C8VE(c217859kI));
            }
        };
        c190398bx.A0Z();
        c190398bx.A1j.clearFocus();
    }

    @Override // X.InterfaceC190578cF
    public final void DN8() {
        AbstractC59962oe abstractC59962oe;
        C190398bx c190398bx = this.A01;
        Context context = c190398bx.A0q;
        UserSession userSession = c190398bx.A1J;
        if (C54P.A01(context, userSession)) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36325197007106928L);
            EnumC33510Erj enumC33510Erj = EnumC33510Erj.STORY_POST_CAPTURE_FLOW;
            AbstractC35249Fgi.A06(enumC33510Erj, userSession, true);
            abstractC59962oe = this.A00;
            CJA.A00(abstractC59962oe.requireActivity(), enumC33510Erj, userSession, false, A06);
        } else {
            EnumC33510Erj enumC33510Erj2 = EnumC33510Erj.STORY_POST_CAPTURE_FLOW;
            AbstractC35249Fgi.A06(enumC33510Erj2, userSession, false);
            AbstractC35249Fgi.A03(enumC33510Erj2, EnumC33500ErZ.SYSTEM_SHARE_SHEET, userSession, false);
            EnumC33425Epw enumC33425Epw = EnumC33425Epw.A0J;
            abstractC59962oe = this.A00;
            AbstractC31510Dsu.A0T(abstractC59962oe, enumC33510Erj2, abstractC59962oe, userSession, enumC33425Epw, new Runnable() { // from class: X.Ap9
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        View currentFocus = abstractC59962oe.requireActivity().getCurrentFocus();
        if (inputMethodManager != null && inputMethodManager.isActive() && currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // X.InterfaceC190578cF
    public final void DSl(final User user, final int i) {
        final C190398bx c190398bx = this.A01;
        AbstractC59962oe abstractC59962oe = this.A00;
        c190398bx.A0c = true;
        Runnable runnable = new Runnable() { // from class: X.AyA
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String BjQ;
                C190398bx c190398bx2 = C190398bx.this;
                User user2 = user;
                int i2 = i;
                c190398bx2.A0W();
                c190398bx2.A0c = false;
                if (!(C190398bx.A01(c190398bx2) instanceof C128535rM)) {
                    c190398bx2.A1U.A00(c190398bx2.A1j, C05F.A00, AbstractC167007dF.A1X(c190398bx2.A1Q.A02.A01(), EnumC198268pb.A04));
                }
                AbstractC209689Pe.A05(c190398bx2.A1j, user2, user2.getUsername(), '@');
                C150286pc c150286pc = c190398bx2.A1c;
                if (c150286pc.A03) {
                    ACN acn = (ACN) c150286pc.get();
                    acn.A07.post(acn.A08);
                }
                VWS.A00(c190398bx2.A1J).A01(user2);
                String id = user2.getId();
                RecyclerView recyclerView = c190398bx2.A1D;
                if (recyclerView != null) {
                    C2UU c2uu = recyclerView.A0A;
                    c2uu.getClass();
                    InterfaceC169517hR interfaceC169517hR = ((C190588cG) ((AbstractC190598cH) c2uu)).A05;
                    if (interfaceC169517hR != null && (BjQ = interfaceC169517hR.BjQ()) != null && BjQ.length() != 0) {
                        str = AbstractC002300n.A0d(BjQ, "@", "", false);
                        c190398bx2.A1V.A02(id, str, i2);
                    }
                }
                str = "";
                c190398bx2.A1V.A02(id, str, i2);
            }
        };
        if (C190398bx.A01(c190398bx) instanceof C128535rM) {
            int size = C190398bx.A04(c190398bx, true, false).size();
            UserSession userSession = c190398bx.A1J;
            FragmentActivity requireActivity = c190398bx.A1I.requireActivity();
            int intValue = size + c190398bx.A0S.intValue();
            if (intValue > 20) {
                AbstractC50666MYj.A00(userSession).A0E(MSV.A00(1140), intValue, 0, false);
                AbstractC55114ObY.A00(requireActivity);
                return;
            } else if (OQE.A01(userSession, user)) {
                C18920wW A01 = AbstractC12220kQ.A01(null, userSession);
                AbstractC55114ObY.A02(requireActivity, abstractC59962oe, userSession, user, false);
                AbstractC54294NzE.A00(A01, userSession, user);
                return;
            }
        } else {
            Context context = c190398bx.A0q;
            UserSession userSession2 = c190398bx.A1J;
            if (!user.A2D()) {
                C14360o3.A0B(context, 0);
                AbstractC35239FgY.A03(context, userSession2, user, null, "story", null, null);
                FDR.A00(AbstractC12220kQ.A01(null, userSession2), userSession2, user, "story", "click", AbstractC111324zv.A00(67));
                return;
            } else {
                Integer num = C05F.A0C;
                if (IAS.A00(user, num) != null) {
                    ITB.A01(context, IAS.A00(user, num), userSession2, user, runnable);
                    return;
                }
            }
        }
        runnable.run();
    }
}
