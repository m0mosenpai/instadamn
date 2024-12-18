package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LMK implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public LMK(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String A0c;
        int i2;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                String[] strArr = (String[]) this.A01;
                if (C14360o3.A0K(strArr[i], this.A04)) {
                    ((AGO) this.A03).A07.Czh((User) this.A02);
                    return;
                }
                if (C14360o3.A0K(strArr[i], this.A05)) {
                    User user = (User) this.A02;
                    if (user != null) {
                        ((AGO) this.A03).A07.Dfb(user.getId());
                        return;
                    }
                    return;
                }
                C0w9.A03("DirectPermissionsButtonsThreadViewController", AnonymousClass001.A0c("the dialog option index ", " is not supported", i));
                return;
            case 1:
                AbstractC41356ISb.A01((FragmentActivity) this.A02, (UserSession) this.A03, this.A04, ((InterfaceC11380iw) this.A01).getModuleName(), "checkout_awareness_dialog_learn_more", this.A05);
                return;
            default:
                C3KX c3kx = (C3KX) this.A03;
                Context context = (Context) this.A02;
                Reel reel = (Reel) this.A01;
                String str3 = this.A05;
                String str4 = this.A04;
                FragmentActivity A00 = C3KW.A00();
                C105824pt c105824pt = reel.A0H;
                if (c105824pt != null && A00 != null) {
                    View rootView = AbstractC43592JPx.A08(A00).getRootView();
                    AbstractC13880nE.A0O(rootView);
                    Window window = A00.getWindow();
                    C14360o3.A07(window);
                    C14360o3.A0A(rootView);
                    boolean A0B = AbstractC56402iY.A0B(rootView, window);
                    Window window2 = A00.getWindow();
                    C14360o3.A07(window2);
                    AbstractC56402iY.A07(rootView, window2, false);
                    Context context2 = rootView.getContext();
                    C47982LJb c47982LJb = new C47982LJb(context2);
                    User A03 = c105824pt.A03();
                    C3PO c3po = c105824pt.A0A;
                    if (c3po == null) {
                        c3po = C3PO.A08;
                    }
                    String str5 = null;
                    if (c3po == C3PO.A07) {
                        A0c = AbstractC31178DnM.A0c(context, A03, 2131965418);
                        str5 = AbstractC31178DnM.A0c(context, A03, 2131965417);
                        i2 = 2131965416;
                    } else {
                        A0c = AbstractC31178DnM.A0c(context, A03, 2131965419);
                        i2 = 2131965413;
                    }
                    String string = context.getString(i2);
                    if (A0c == null) {
                        str2 = "invitationTitle";
                    } else {
                        AbstractC37302Gc3.A06(c47982LJb.A08).setText(A0c);
                        if (str5 != null && AbstractC25228BEl.A1A(str5).length() != 0) {
                            InterfaceC09390do interfaceC09390do = c47982LJb.A07;
                            AbstractC167007dF.A0L(interfaceC09390do).setVisibility(0);
                            AbstractC37302Gc3.A06(interfaceC09390do).setText(str5);
                        } else {
                            AbstractC167007dF.A0L(c47982LJb.A07).setVisibility(8);
                        }
                        AbstractC167007dF.A0L(c47982LJb.A0B).requestLayout();
                        String A04 = C84963qk.A04(AbstractC166997dE.A0M(context), Integer.valueOf(c105824pt.A00()), 10000, false, false);
                        if (c105824pt.A00() == 1) {
                            str = " viewer";
                        } else {
                            str = " viewers";
                        }
                        String A0R = AnonymousClass001.A0R(A04, str);
                        C14360o3.A0B(A0R, 0);
                        AbstractC37302Gc3.A06(c47982LJb.A09).setText(A0R);
                        if (string == null) {
                            str2 = "invitationButton";
                        } else {
                            InterfaceC09390do interfaceC09390do2 = c47982LJb.A06;
                            AbstractC37302Gc3.A06(interfaceC09390do2).setText(string);
                            InterfaceC11380iw interfaceC11380iw = C3KX.A08;
                            LRI lri = new LRI(rootView, A00, reel, c47982LJb, c3kx, str3, str4, A0B);
                            C14360o3.A0B(interfaceC11380iw, 2);
                            c47982LJb.A00 = false;
                            AbstractC31173DnH.A1T(interfaceC11380iw, (IgImageView) AbstractC166987dD.A17(c47982LJb.A03), A03);
                            ViewOnClickListenerC48073LPy.A00(AbstractC167007dF.A0L(interfaceC09390do2), 58, c47982LJb);
                            ViewOnClickListenerC48073LPy.A00(AbstractC167007dF.A0L(c47982LJb.A05), 59, c47982LJb);
                            PopupWindow popupWindow = c47982LJb.A01;
                            popupWindow.setOnDismissListener(lri);
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.setSoftInputMode(16);
                            popupWindow.setTouchInterceptor(ViewOnTouchListenerC48083LQi.A00);
                            popupWindow.setAnimationStyle(R.style.PopupAnimationStyle);
                            popupWindow.showAtLocation(rootView, 80, 0, 0);
                            InterfaceC174767qC A002 = AbstractC174697q4.A00(context2, c3kx.A01, "live_with_join_flow");
                            ScalingTextureView scalingTextureView = c47982LJb.A02;
                            scalingTextureView.setVisibility(0);
                            if (scalingTextureView.isAvailable() && scalingTextureView.getSurfaceTexture() != null) {
                                C47982LJb.A02(A002, c47982LJb, scalingTextureView.getWidth(), scalingTextureView.getHeight());
                            } else {
                                scalingTextureView.A02(new LO6(A002, c47982LJb));
                            }
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                InterfaceC147726kx interfaceC147726kx = c3kx.A02;
                if (interfaceC147726kx != null) {
                    interfaceC147726kx.Ch6();
                    return;
                }
                return;
        }
    }
}
