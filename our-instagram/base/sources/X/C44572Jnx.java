package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igtv.widget.ExpandableTextView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jnx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44572Jnx extends C2UU {
    public User A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final UserSession A06;
    public final List A07;
    public final Context A08;
    public final InterfaceC11380iw A09;
    public final C47674L3h A0A;
    public final C45504KCt A0B;
    public final C45504KCt A0C;
    public final C45504KCt A0D;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        View view;
        int i2;
        Object[] A1Z;
        Integer num;
        C42376Ipd c42376Ipd;
        Drawable drawable;
        View view2;
        int i3;
        int i4;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C44753Jra) {
            C44753Jra c44753Jra = (C44753Jra) c3oo;
            User user = this.A00;
            String str = this.A02;
            boolean z = this.A04;
            boolean z2 = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A09;
            if (user != null) {
                FollowButton followButton = c44753Jra.A09;
                ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
                UserSession userSession = c44753Jra.A05;
                viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw, userSession, user);
                AbstractC31173DnH.A1T(interfaceC11380iw, c44753Jra.A06, user);
                TextView textView = c44753Jra.A04;
                AbstractC31173DnH.A1F(textView, user);
                c44753Jra.A03.setText(user.getFullName());
                if (user.isVerified()) {
                    drawable = AbstractC166987dD.A0a(c44753Jra.A0A);
                } else {
                    drawable = null;
                }
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                if (z) {
                    if (ViewOnAttachStateChangeListenerC110564yT.A00(userSession, user) == FollowStatus.A05) {
                        i4 = c44753Jra.A01;
                    } else {
                        i4 = c44753Jra.A00;
                    }
                    followButton.setTextColor(i4);
                    view2 = c44753Jra.A02;
                    i3 = 0;
                } else {
                    view2 = c44753Jra.A02;
                    i3 = 8;
                }
                view2.setVisibility(i3);
                followButton.setVisibility(i3);
            }
            if (str != null) {
                interfaceC11380iw.getModuleName();
                if (AbstractC001900j.A0T(str)) {
                    c44753Jra.A08.setVisibility(8);
                    return;
                }
                ExpandableTextView expandableTextView = c44753Jra.A08;
                if (z2) {
                    expandableTextView.setText(str);
                } else {
                    expandableTextView.setExpandableText(str, c44753Jra.A05, null);
                }
                expandableTextView.setVisibility(0);
                return;
            }
            return;
        }
        if (c3oo instanceof C44754Jrb) {
            C49379LsD c49379LsD = (C49379LsD) this.A07.get(i - 1);
            C44754Jrb c44754Jrb = (C44754Jrb) c3oo;
            InterfaceC11380iw interfaceC11380iw2 = this.A09;
            C14360o3.A0B(c49379LsD, 0);
            c44754Jrb.A00 = c49379LsD.A07;
            ImageUrl imageUrl = c49379LsD.A03;
            IgImageView igImageView = c44754Jrb.A0A;
            if (imageUrl != null) {
                igImageView.setUrl(imageUrl, interfaceC11380iw2);
            } else {
                igImageView.A09();
            }
            TextView textView2 = c44754Jrb.A05;
            long j = c49379LsD.A02;
            textView2.setText(C23831Eq.A02(j));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int minutes = (int) timeUnit.toMinutes(j);
            int seconds = ((int) timeUnit.toSeconds(j)) % 60;
            Resources resources = textView2.getResources();
            if (seconds == 0) {
                i2 = R.plurals.igtv_video_seconds_duration_description_one_min;
                A1Z = AbstractC25228BEl.A1Y(seconds);
            } else {
                i2 = R.plurals.igtv_video_minute_duration_description;
                A1Z = AbstractC25228BEl.A1Z(Integer.valueOf(minutes), seconds);
            }
            String quantityString = resources.getQuantityString(i2, seconds, A1Z);
            C14360o3.A0A(quantityString);
            textView2.setContentDescription(quantityString);
            c44754Jrb.A06.setText(c49379LsD.A06);
            c44754Jrb.A04.setText(c49379LsD.A05);
            int i5 = c49379LsD.A00;
            TextView textView3 = c44754Jrb.A08;
            if (i5 > 0) {
                Resources resources2 = textView3.getResources();
                C14360o3.A07(resources2);
                Integer valueOf = Integer.valueOf(i5);
                textView3.setText(AbstractC74053Tw.A01(resources2, valueOf));
                textView3.setContentDescription(AbstractC31175DnJ.A0W(resources2, valueOf, R.plurals.number_of_views, i5));
                textView3.setVisibility(0);
                c44754Jrb.A02.setVisibility(0);
            } else {
                textView3.setVisibility(8);
                c44754Jrb.A02.setVisibility(8);
            }
            TextView textView4 = c44754Jrb.A07;
            long j2 = c49379LsD.A01;
            Context A0L = AbstractC166997dE.A0L(textView4);
            textView4.setText(C23831Eq.A07(A0L, j2));
            textView4.setContentDescription(C23831Eq.A03(A0L, j2));
            C38321qM c38321qM = c49379LsD.A04;
            if (C3YS.A00(c44754Jrb.A09).A05(c38321qM)) {
                num = C05F.A00;
            } else {
                num = C05F.A0C;
            }
            Integer num2 = C05F.A0C;
            View view3 = c44754Jrb.A01;
            if (num == num2) {
                view3.setVisibility(8);
                view3 = c44754Jrb.A03;
            } else {
                C14360o3.A0B(view3, 0);
                ImageUrl A1S = c38321qM.A1S();
                MLG mlg = MLG.A00;
                C14360o3.A0B(mlg, 5);
                if (A1S != null) {
                    C1OG A0J = C25821No.A00().A0J(A1S, "IGTVEpisodeViewHolder");
                    A0J.A08 = c38321qM;
                    A0J.A02(new C23601Acv(3, view3, c38321qM, mlg));
                    A0J.A01();
                }
                AbstractC31171DnF.A08(view3, R.id.hidden_item_icon).setImageResource(R.drawable.instagram_eye_off_pano_outline_24);
                AbstractC43592JPx.A1I(view3, R.id.hidden_item_title, 8);
                AbstractC43592JPx.A1I(view3, R.id.hidden_item_description, 8);
                AbstractC43592JPx.A1I(view3, R.id.hidden_item_button, 8);
                AbstractC43592JPx.A1I(view3, R.id.hidden_item_see_why, 8);
                c44754Jrb.A03.setVisibility(8);
            }
            view3.setVisibility(0);
            C47674L3h c47674L3h = this.A0A;
            View A06 = AbstractC31171DnF.A06(c3oo);
            C59072n8 A00 = C59062n7.A00(c49379LsD, new CPC(i), AnonymousClass001.A0T(c49379LsD.A08, c38321qM.getId(), '_'));
            A00.A00(c47674L3h.A01);
            boolean CdW = c38321qM.CdW();
            C41591Iae c41591Iae = c47674L3h.A02;
            if (CdW && AbstractC75423a9.A02(c49379LsD, c41591Iae.A00)) {
                c42376Ipd = c41591Iae.A02;
            } else {
                c42376Ipd = c41591Iae.A01;
            }
            A00.A00(c42376Ipd);
            AbstractC25227BEk.A10(A06, A00, c47674L3h.A00);
            return;
        }
        if (!(c3oo instanceof C44678JqN)) {
            return;
        }
        C44678JqN c44678JqN = (C44678JqN) c3oo;
        boolean z3 = this.A05;
        int i6 = 0;
        AnonymousClass710 anonymousClass710 = c44678JqN.A00;
        if (z3) {
            if (anonymousClass710 != null) {
                anonymousClass710.A02(true);
                anonymousClass710.A01(1.0f);
                view = c44678JqN.A01;
                view.setVisibility(i6);
                return;
            }
            C14360o3.A0F("spinnerDrawable");
            throw C00O.createAndThrow();
        }
        if (anonymousClass710 != null) {
            anonymousClass710.A02(false);
            view = c44678JqN.A01;
            i6 = 8;
            view.setVisibility(i6);
            return;
        }
        C14360o3.A0F("spinnerDrawable");
        throw C00O.createAndThrow();
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                            C45504KCt c45504KCt = this.A0C;
                            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.igtv_error_state, false);
                            C3OO c3oo = new C3OO(A0C);
                            AbstractC166997dE.A0T(A0C, R.id.message).setText(2131964237);
                            ViewOnClickListenerC48073LPy.A00(A0C.requireViewById(R.id.retry), 0, c45504KCt);
                            return c3oo;
                        }
                        throw AbstractC166987dD.A12(AnonymousClass001.A0c("View type ", " is not supported", i));
                    }
                    int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    View A0C2 = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.igtv_empty_state, false);
                    C3OO c3oo2 = new C3OO(A0C2);
                    View requireViewById = A0C2.requireViewById(R.id.message);
                    C14360o3.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
                    ((TextView) requireViewById).setText(2131964236);
                    return c3oo2;
                }
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C44678JqN(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.igtv_loading_spinner, false));
            }
            int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C44754Jrb(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.igtv_series_episode, false), this.A06, this.A0B);
        }
        int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44753Jra(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.igtv_series_info, false), this.A06, this.A0D);
    }

    public final void A00(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            int size = this.A07.size() + 1;
            if (this.A05) {
                notifyItemInserted(size);
            } else {
                notifyItemRemoved(size);
            }
        }
    }

    public C44572Jnx(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47674L3h c47674L3h, C45504KCt c45504KCt, C45504KCt c45504KCt2, C45504KCt c45504KCt3) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A08 = context;
        this.A06 = userSession;
        this.A09 = interfaceC11380iw;
        this.A0D = c45504KCt;
        this.A0B = c45504KCt2;
        this.A0C = c45504KCt3;
        this.A0A = c47674L3h;
        this.A07 = AbstractC166987dD.A1E();
        this.A01 = C05F.A00;
        this.A05 = A1V;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(771008764);
        int size = this.A07.size() + 1 + 1;
        C0f9.A0A(-298091399, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(1027014002);
        int i2 = 1;
        if (i == getItemCount() - 1) {
            switch (this.A01.intValue()) {
                case 1:
                    i2 = 3;
                    break;
                case 2:
                default:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 4;
                    break;
            }
        } else if (i == 0) {
            i2 = 0;
        }
        C0f9.A0A(1369182579, A03);
        return i2;
    }
}
