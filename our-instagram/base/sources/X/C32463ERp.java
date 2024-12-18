package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

/* renamed from: X.ERp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32463ERp extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final C38321qM A01;
    public final C70N A02;
    public final User A03;
    public final boolean A04 = true;

    public C32463ERp(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C70N c70n, User user) {
        this.A02 = c70n;
        this.A03 = user;
        this.A00 = interfaceC11380iw;
        this.A01 = c38321qM;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C32070E6w c32070E6w;
        User user;
        C70N c70n;
        InterfaceC11380iw interfaceC11380iw;
        C38321qM c38321qM;
        View view2;
        int i2;
        int A03 = C0f9.A03(-208388260);
        AbstractC167017dG.A1P(view, obj);
        if (view.getTag() instanceof FJV) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.ProfileLinkViewBinder.Holder");
            FJV fjv = (FJV) tag;
            c32070E6w = (C32070E6w) obj;
            user = this.A03;
            c70n = this.A02;
            interfaceC11380iw = this.A00;
            c38321qM = this.A01;
            AbstractC167017dG.A1N(fjv, c32070E6w);
            C14360o3.A0B(interfaceC11380iw, 4);
            if (user != null) {
                IgdsListCell igdsListCell = fjv.A01;
                igdsListCell.A0I(c32070E6w.A03);
                String str = c32070E6w.A05;
                if (str != null && str.length() != 0) {
                    igdsListCell.A0H(str);
                }
                view2 = fjv.A00;
                Drawable drawable = view2.getContext().getDrawable(c32070E6w.A01);
                if (drawable != null) {
                    igdsListCell.A09(drawable);
                }
                if (c70n != null) {
                    i2 = 6;
                    C0fQ.A00(new ViewOnClickListenerC35675FpA(i2, interfaceC11380iw, c38321qM, c32070E6w, user, c70n), view2);
                }
                C0f9.A0A(1142640530, A03);
            }
            throw AbstractC166987dD.A14("Cannot bind links options with a Null User.");
        }
        if (view.getTag() instanceof FN2) {
            Object tag2 = view.getTag();
            C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.profile.bindergroup.ProfileLinkViewBinder.MultipleLinkHolder");
            FN2 fn2 = (FN2) tag2;
            c32070E6w = (C32070E6w) obj;
            user = this.A03;
            c70n = this.A02;
            interfaceC11380iw = this.A00;
            c38321qM = this.A01;
            C14360o3.A0B(fn2, 0);
            AbstractC167007dF.A1F(c32070E6w, 1, interfaceC11380iw);
            if (user != null) {
                TextView textView = fn2.A04;
                textView.setText(c32070E6w.A03);
                textView.setTypeface(Typeface.defaultFromStyle(1));
                String str2 = c32070E6w.A05;
                if (str2 != null && str2.length() != 0) {
                    TextView textView2 = fn2.A03;
                    textView2.setText(str2);
                    textView2.setVisibility(0);
                }
                view2 = fn2.A00;
                Drawable drawable2 = view2.getContext().getDrawable(c32070E6w.A01);
                if (drawable2 != null) {
                    fn2.A01.setImageDrawable(drawable2);
                }
                fn2.A02.setVisibility(8);
                if (c70n != null) {
                    i2 = 7;
                    C0fQ.A00(new ViewOnClickListenerC35675FpA(i2, interfaceC11380iw, c38321qM, c32070E6w, user, c70n), view2);
                }
            } else {
                throw AbstractC166987dD.A14("Cannot bind links options with a Null User.");
            }
        }
        C0f9.A0A(1142640530, A03);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        Object fjv;
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1151578932);
        boolean z = this.A04;
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        int i2 = R.layout.layout_edit_link_row;
        if (!z) {
            i2 = R.layout.layout_profile_link_row;
        }
        View inflate = A0P.inflate(i2, viewGroup, false);
        if (z) {
            C14360o3.A0A(inflate);
            fjv = new FN2(inflate);
        } else {
            C14360o3.A0A(inflate);
            fjv = new FJV(inflate);
        }
        inflate.setTag(fjv);
        C0f9.A0A(-1989085833, A0G);
        return inflate;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
