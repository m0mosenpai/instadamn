package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;

/* renamed from: X.NFc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52364NFc extends IgLinearLayout {
    public View A00;
    public RecyclerView A01;
    public C54672OCy A02;
    public View A03;
    public Reel A04;
    public final C50965MfY A05;
    public final AbstractC59962oe A06;
    public final UserSession A07;
    public final C51149Mis A08;
    public final C54525O7c A09;
    public final Reel A0A;

    public static final void A00(C52364NFc c52364NFc) {
        String str;
        RecyclerView recyclerView = c52364NFc.A01;
        if (recyclerView == null) {
            str = "highlightSuggestionsRecyclerView";
        } else {
            View view = c52364NFc.A00;
            if (view == null) {
                str = "addHighlightView";
            } else {
                Reel reel = c52364NFc.A0A;
                Reel reel2 = c52364NFc.A04;
                C54397O2d c54397O2d = new C54397O2d(c52364NFc);
                View A0c = AbstractC166987dD.A0c(view, R.id.highlight_row_icon);
                View A0c2 = AbstractC166987dD.A0c(view, R.id.highlight_row_title);
                View A0c3 = AbstractC166987dD.A0c(view, R.id.selected_highlight);
                TextView A0Q = AbstractC25230BEn.A0Q(view, R.id.selected_highlight_title);
                View A0c4 = AbstractC166987dD.A0c(view, R.id.unselect_highlight);
                IgdsSwitch igdsSwitch = (IgdsSwitch) AbstractC166987dD.A0c(view, R.id.unselect_highlight_toggle);
                View A0c5 = AbstractC166987dD.A0c(view, R.id.highlight_row_chevron);
                if (reel2 == null) {
                    if (reel != null) {
                        reel2 = reel;
                    } else {
                        A0c2.setVisibility(0);
                        A0c3.setVisibility(8);
                        recyclerView.setVisibility(0);
                        A0c.setVisibility(0);
                        AbstractC31177DnL.A0x(A0c2, AbstractC167017dG.A0E(view.getContext()), A0c2.getPaddingTop());
                        A0c5.setVisibility(0);
                        ViewOnClickListenerC55460OkF.A00(view, 68, c54397O2d);
                        AbstractC56952jT.A01(view);
                        return;
                    }
                }
                A0c2.setVisibility(8);
                A0c3.setVisibility(0);
                A0Q.setText(reel2.A0r);
                A0c.setVisibility(8);
                A0c5.setVisibility(8);
                recyclerView.setVisibility(8);
                view.setOnClickListener(null);
                if (reel == null) {
                    ViewOnClickListenerC55460OkF.A00(A0c4, 67, c54397O2d);
                    A0c4.setVisibility(0);
                    igdsSwitch.setVisibility(8);
                    return;
                } else {
                    igdsSwitch.setVisibility(0);
                    A0c4.setVisibility(8);
                    igdsSwitch.setChecked(true);
                    igdsSwitch.A07 = new P3X(1, c54397O2d, reel2);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A01(String str, ArrayList arrayList) {
        Reel reel;
        String str2;
        if (str != null) {
            reel = MSY.A0R(this.A07, str);
        } else {
            reel = null;
        }
        this.A04 = reel;
        C56356P0r c56356P0r = this.A09.A01;
        AnonymousClass229.A01(c56356P0r.A03).A1Y(c56356P0r.A01);
        C52469NJn c52469NJn = c56356P0r.A05;
        String str3 = null;
        if (reel != null) {
            str2 = reel.getId();
        } else {
            str2 = null;
        }
        if (arrayList != null) {
            str3 = (String) arrayList.get(0);
        }
        c52469NJn.A07(C51754Mtd.A01(new C9C9(str3, str2, 10), null, null, c52469NJn.A04(), 262135));
        if (this.A0A == null) {
            A00(this);
        }
    }

    public final C54672OCy getHighlightSuggestionsViewController() {
        return this.A02;
    }

    public final Reel getLinkedHighlight() {
        return this.A04;
    }

    public C52364NFc(Context context, C50965MfY c50965MfY, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C54525O7c c54525O7c, Reel reel) {
        super(context);
        this.A09 = c54525O7c;
        this.A07 = userSession;
        this.A06 = abstractC59962oe;
        this.A05 = c50965MfY;
        this.A0A = reel;
        this.A08 = new C51149Mis(interfaceC11380iw, c54525O7c, new C57228PbC(this, 8));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1162655981);
        super.onAttachedToWindow();
        if (this.A03 == null) {
            View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.layout_add_highlight_row, (ViewGroup) this, false);
            this.A00 = AbstractC167017dG.A0U(inflate, R.id.add_highlight_stub);
            RecyclerView A0G = AbstractC31172DnG.A0G(AbstractC167017dG.A0U(inflate, R.id.add_highlight_suggestions_stub), R.id.highlight_suggestions_recyclerview);
            this.A01 = A0G;
            if (A0G != null) {
                C51149Mis c51149Mis = this.A08;
                A0G.setAdapter(c51149Mis);
                RecyclerView recyclerView = this.A01;
                if (recyclerView != null) {
                    AbstractC31174DnI.A17(recyclerView.getContext(), A0G, false);
                    if (A0G.A12.size() == 0) {
                        AbstractC59962oe abstractC59962oe = this.A06;
                        AbstractC37304Gc5.A0z(A0G, AbstractC167017dG.A03(abstractC59962oe.requireContext()), AbstractC167017dG.A06(abstractC59962oe.requireContext()));
                    }
                    if (this.A0A == null) {
                        UserSession userSession = this.A07;
                        C54672OCy c54672OCy = new C54672OCy(this.A05, this.A06, userSession, c51149Mis, new C54398O2e(this));
                        this.A02 = c54672OCy;
                        c54672OCy.A00.A00(c54672OCy.A01.requireContext(), c54672OCy.A02.userId);
                    }
                    A00(this);
                    addView(inflate);
                    this.A03 = inflate;
                }
            }
            C14360o3.A0F("highlightSuggestionsRecyclerView");
            throw C00O.createAndThrow();
        }
        C0f9.A0D(-1438485210, A06);
    }

    public final void setHighlightSuggestionsViewController(C54672OCy c54672OCy) {
        this.A02 = c54672OCy;
    }

    public final void setLinkedHighlight(Reel reel) {
        this.A04 = reel;
    }
}
