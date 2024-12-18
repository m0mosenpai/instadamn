package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OxF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56206OxF implements InterfaceC58203Pr9 {
    public int A00;
    public C51202Mjm A01;
    public C54391O1x A02;
    public final C51109MiE A03;
    public final RecyclerView A04;
    public final UserSession A05;
    public final float A06;
    public final C51166MjA A07;
    public final C51118MiN A08;

    @Override // X.InterfaceC58203Pr9
    public final void AAl(View view) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void COM(C54390O1w c54390O1w, List list, int i, int i2, boolean z) {
        C14360o3.A0B(list, 0);
        C51166MjA c51166MjA = this.A07;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new NHB(MSW.A0R(it)));
        }
        c51166MjA.A03 = c54390O1w;
        C51166MjA.A00(c51166MjA, A0q);
        c51166MjA.A02 = i;
        c51166MjA.A00 = i2;
        if (z) {
            this.A04.setAdapter(c51166MjA);
        }
    }

    @Override // X.InterfaceC58203Pr9
    public final void EFd(C51202Mjm c51202Mjm) {
        C14360o3.A0B(c51202Mjm, 0);
        this.A01 = null;
        this.A04.A15(c51202Mjm);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EJ4(C54393O1z c54393O1z) {
        A00(c54393O1z, this, 0);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EJI(InterfaceC58195Pr1 interfaceC58195Pr1) {
        C51224Mk9 c51224Mk9;
        InterfaceC58195Pr1 interfaceC58195Pr12;
        C14360o3.A0B(interfaceC58195Pr1, 0);
        RecyclerView recyclerView = this.A04;
        LinearLayoutManager A0J = AbstractC31177DnL.A0J(recyclerView);
        int A1a = A0J.A1a();
        int A1b = A0J.A1b();
        if (A1a > A1b) {
            return;
        }
        while (true) {
            C3OO A0V = recyclerView.A0V(A1a);
            if (A0V != null && (A0V instanceof C51224Mk9) && (interfaceC58195Pr12 = (c51224Mk9 = (C51224Mk9) A0V).A00) != null && interfaceC58195Pr12.isVisible() && C14360o3.A0K(c51224Mk9.A00, interfaceC58195Pr1)) {
                InterfaceC58195Pr1 interfaceC58195Pr13 = c51224Mk9.A00;
                if (interfaceC58195Pr13 != null) {
                    interfaceC58195Pr13.EZa();
                }
                InterfaceC58195Pr1 interfaceC58195Pr14 = c51224Mk9.A00;
                if (interfaceC58195Pr14 != null) {
                    interfaceC58195Pr14.CoJ();
                }
            }
            if (A1a != A1b) {
                A1a++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC58203Pr9
    public final void ET3(float f) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void Ed2(boolean z) {
        this.A04.setSaveEnabled(true);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EdC(C55942hf c55942hf) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void EeY(boolean z) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void EeZ(C55942hf c55942hf) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void addView(View view, int i) {
    }

    @Override // X.InterfaceC58203Pr9
    public final int indexOfChild(View view) {
        C14360o3.A0B(view, 0);
        return RecyclerView.A02(view);
    }

    @Override // X.InterfaceC58203Pr9
    public final void removeView(View view) {
    }

    @Override // X.InterfaceC58203Pr9
    public final void A9C(C51202Mjm c51202Mjm) {
        this.A01 = c51202Mjm;
        this.A04.A14(c51202Mjm);
    }

    @Override // X.InterfaceC58203Pr9
    public final View AnU(int i) {
        C3OO A0V = this.A04.A0V(i);
        if (A0V != null) {
            return A0V.itemView;
        }
        return null;
    }

    @Override // X.InterfaceC58203Pr9
    public final int AnZ() {
        C51166MjA c51166MjA = this.A07;
        boolean z = c51166MjA.A05;
        int itemCount = c51166MjA.getItemCount();
        if (z) {
            return itemCount - 1;
        }
        return itemCount;
    }

    @Override // X.InterfaceC58203Pr9
    public final int AuK() {
        return this.A00;
    }

    @Override // X.InterfaceC58203Pr9
    public final InterfaceC58195Pr1 AuV() {
        boolean z;
        C51224Mk9 c51224Mk9;
        C3OO A0V = this.A04.A0V(this.A00);
        if (A0V == null) {
            z = true;
        } else {
            z = A0V instanceof C51224Mk9;
        }
        if (!z || (c51224Mk9 = (C51224Mk9) A0V) == null) {
            return null;
        }
        return c51224Mk9.A00;
    }

    @Override // X.InterfaceC58203Pr9
    public final ViewGroup.LayoutParams BMZ() {
        ViewGroup.LayoutParams layoutParams = this.A04.getLayoutParams();
        C14360o3.A07(layoutParams);
        return layoutParams;
    }

    @Override // X.InterfaceC58203Pr9
    public final /* bridge */ /* synthetic */ View Br3() {
        return this.A04;
    }

    @Override // X.InterfaceC58203Pr9
    public final float CEh() {
        return this.A06;
    }

    @Override // X.InterfaceC58203Pr9
    public final ViewTreeObserver CFv() {
        ViewTreeObserver viewTreeObserver = this.A04.getViewTreeObserver();
        C14360o3.A07(viewTreeObserver);
        return viewTreeObserver;
    }

    @Override // X.InterfaceC58203Pr9
    public final void EF0() {
        C51166MjA c51166MjA = this.A07;
        c51166MjA.A01 = 0;
        AbstractC31175DnJ.A0x(c51166MjA, C16930sl.A00, c51166MjA.A06);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EGv() {
        C51224Mk9 c51224Mk9;
        InterfaceC58195Pr1 interfaceC58195Pr1;
        RecyclerView recyclerView = this.A04;
        LinearLayoutManager A0J = AbstractC31177DnL.A0J(recyclerView);
        int A1a = A0J.A1a();
        int A1b = A0J.A1b();
        if (A1a > A1b) {
            return;
        }
        while (true) {
            C3OO A0V = recyclerView.A0V(A1a);
            if (A0V != null && (A0V instanceof C51224Mk9) && (interfaceC58195Pr1 = (c51224Mk9 = (C51224Mk9) A0V).A00) != null && interfaceC58195Pr1.isVisible()) {
                InterfaceC58195Pr1 interfaceC58195Pr12 = c51224Mk9.A00;
                if (interfaceC58195Pr12 != null) {
                    interfaceC58195Pr12.EZa();
                }
                InterfaceC58195Pr1 interfaceC58195Pr13 = c51224Mk9.A00;
                if (interfaceC58195Pr13 != null) {
                    interfaceC58195Pr13.CoJ();
                }
            }
            if (A1a != A1b) {
                A1a++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC58203Pr9
    public final void EML(float f) {
        EMN(this.A00 + 1);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EMN(int i) {
        this.A00 = i;
        this.A04.post(new RunnableC56978PPt(this, i));
    }

    @Override // X.InterfaceC58203Pr9
    public final void EMS(float f) {
        EMN(this.A00 - 1);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EWk(C54391O1x c54391O1x) {
        this.A02 = c54391O1x;
        this.A07.A04 = c54391O1x;
    }

    @Override // X.InterfaceC58203Pr9
    public final void EY5(ViewGroup.LayoutParams layoutParams) {
        this.A04.setLayoutParams(layoutParams);
    }

    @Override // X.InterfaceC58203Pr9
    public final void EkJ() {
        C51166MjA c51166MjA = this.A07;
        if (!c51166MjA.A05) {
            c51166MjA.A05 = true;
            C51166MjA.A00(c51166MjA, c51166MjA.A06);
        }
    }

    @Override // X.InterfaceC58203Pr9
    public final void Epb(int i, int i2) {
        C51166MjA c51166MjA = this.A07;
        ArrayList A0U = AbstractC001800i.A0U(c51166MjA.A06);
        Collections.swap(A0U, i, i2);
        C51166MjA.A00(c51166MjA, A0U);
    }

    @Override // X.InterfaceC58203Pr9
    public final int getWidth() {
        return this.A04.getWidth();
    }

    @Override // X.InterfaceC58203Pr9
    public final void removeItem(int i) {
        InterfaceC58195Pr1 interfaceC58195Pr1;
        C51224Mk9 c51224Mk9 = (C51224Mk9) this.A04.A0V(i);
        if (c51224Mk9 != null && (interfaceC58195Pr1 = c51224Mk9.A00) != null) {
            interfaceC58195Pr1.cleanup();
        }
        C51166MjA c51166MjA = this.A07;
        ArrayList A0U = AbstractC001800i.A0U(c51166MjA.A06);
        A0U.remove(i);
        C51166MjA.A00(c51166MjA, A0U);
    }

    @Override // X.InterfaceC58203Pr9
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.A04.requestDisallowInterceptTouchEvent(z);
    }

    @Override // X.InterfaceC58203Pr9
    public final void requestLayout() {
        this.A04.requestLayout();
    }

    @Override // X.InterfaceC58203Pr9
    public final void setVisibility(int i) {
        this.A04.setVisibility(i);
    }

    public C56206OxF(RecyclerView recyclerView, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, recyclerView);
        this.A05 = userSession;
        this.A04 = recyclerView;
        C51166MjA c51166MjA = new C51166MjA(C18U.A06(C06090Tz.A05, userSession, 36324015891033929L));
        this.A07 = c51166MjA;
        C51118MiN c51118MiN = new C51118MiN(new C50260MHp(this, 21));
        this.A08 = c51118MiN;
        this.A03 = new C51109MiE(this.A04.getContext(), 0);
        this.A06 = 1.0f;
        RecyclerView recyclerView2 = this.A04;
        AbstractC31174DnI.A17(recyclerView2.getContext(), recyclerView2, false);
        this.A04.setAdapter(c51166MjA);
        c51118MiN.A07(this.A04);
        this.A04.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55496Okp(this, 1));
    }

    public static final void A00(C54393O1z c54393O1z, C56206OxF c56206OxF, int i) {
        if (i >= c56206OxF.AnZ()) {
            c54393O1z.A00.A0U.A0N();
        } else {
            c56206OxF.A04.A0n(i);
            c56206OxF.CFv().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55499Oks(i, 3, c56206OxF, c54393O1z));
        }
    }

    @Override // X.InterfaceC58203Pr9
    public final void EMH(int i, float f) {
        EMN(i);
    }
}
