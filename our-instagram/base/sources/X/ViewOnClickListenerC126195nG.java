package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.UpdatableButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5nG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC126195nG implements View.OnClickListener {
    public User A00;
    public Integer A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C1GL A05;
    public final UpdatableButton A06;

    public static final void A00(ViewOnClickListenerC126195nG viewOnClickListenerC126195nG) {
        User user = viewOnClickListenerC126195nG.A00;
        if (user != null) {
            C1GL c1gl = viewOnClickListenerC126195nG.A05;
            C34974Faz c34974Faz = AbstractC34375FDr.A00;
            UserSession userSession = viewOnClickListenerC126195nG.A04;
            InterfaceC11380iw interfaceC11380iw = viewOnClickListenerC126195nG.A03;
            Integer num = C05F.A0N;
            List singletonList = Collections.singletonList(user.getId());
            C14360o3.A07(singletonList);
            C1ON A01 = c34974Faz.A01(interfaceC11380iw, userSession, num, singletonList, new ArrayList());
            A01.A00 = new ET7(viewOnClickListenerC126195nG, user);
            c1gl.schedule(A01);
            viewOnClickListenerC126195nG.A01 = C05F.A0C;
            A01(viewOnClickListenerC126195nG);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(ViewOnClickListenerC126195nG viewOnClickListenerC126195nG) {
        UpdatableButton updatableButton;
        int i;
        Integer num = viewOnClickListenerC126195nG.A01;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            updatableButton = viewOnClickListenerC126195nG.A06;
                            updatableButton.setIsBlueButton(true);
                            updatableButton.setEnabled(false);
                        } else {
                            return;
                        }
                    } else {
                        updatableButton = viewOnClickListenerC126195nG.A06;
                        updatableButton.setIsBlueButton(false);
                        updatableButton.setEnabled(false);
                    }
                } else {
                    updatableButton = viewOnClickListenerC126195nG.A06;
                    updatableButton.setIsBlueButton(true);
                    updatableButton.setEnabled(true);
                }
                i = 2131956249;
                updatableButton.setText(i);
            }
            updatableButton = viewOnClickListenerC126195nG.A06;
            updatableButton.setIsBlueButton(false);
            updatableButton.setEnabled(true);
            i = 2131956250;
            updatableButton.setText(i);
        }
    }

    public ViewOnClickListenerC126195nG(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl, UpdatableButton updatableButton) {
        this.A02 = context;
        this.A03 = interfaceC11380iw;
        this.A05 = c1gl;
        this.A04 = userSession;
        this.A06 = updatableButton;
        C0fQ.A00(this, updatableButton);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C193328hC c193328hC;
        int A05 = C0f9.A05(44176275);
        Integer num = this.A01;
        if (num == C05F.A00) {
            User user = this.A00;
            if (user != null) {
                UpdatableButton updatableButton = this.A06;
                Context context = updatableButton.getContext();
                Resources resources = updatableButton.getResources();
                String username = user.getUsername();
                String string = resources.getString(2131956251, username);
                C14360o3.A07(string);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new StyleSpan(1), AbstractC001900j.A08(string, username, 0, false), AbstractC001900j.A08(string, username, 0, false) + username.length(), 33);
                c193328hC = new C193328hC(context);
                c193328hC.A0o(user.Bhu(), this.A03);
                c193328hC.A0r(spannableStringBuilder);
                c193328hC.A0J(new DialogInterfaceOnClickListenerC35315Fhq(this), 2131972171);
                c193328hC.A06();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (num == C05F.A01) {
                if (this.A00 != null) {
                    UserSession userSession = this.A04;
                    if (!AbstractC23021Ah.A00(userSession).A01.getBoolean("has_seen_favorites_change_confirmation_dialog", false) && C17060sy.A01.A01(userSession).A1j()) {
                        Context context2 = this.A02;
                        DialogInterfaceOnClickListenerC35314Fhp dialogInterfaceOnClickListenerC35314Fhp = new DialogInterfaceOnClickListenerC35314Fhp(this);
                        c193328hC = new C193328hC(context2);
                        c193328hC.A0A(2131956254);
                        c193328hC.A09(2131956253);
                        c193328hC.A04();
                        c193328hC.A0F(dialogInterfaceOnClickListenerC35314Fhp);
                        c193328hC.A0D(dialogInterfaceOnClickListenerC35314Fhp);
                    } else {
                        A00(this);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C0f9.A0C(-609182515, A05);
        }
        C0fJ.A00(c193328hC.A02());
        C0f9.A0C(-609182515, A05);
    }
}
