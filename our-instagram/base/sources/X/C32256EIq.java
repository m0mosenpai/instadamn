package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.EIq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32256EIq extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectTextCardViewerFragment";
    public ViewGroup A00;
    public IgTextView A01;
    public C3I9 A02;
    public C32716Eah A03;
    public C31835Dyu A04;
    public C35011Fbi A05;
    public InterfaceC37230Gaf A06;
    public FOK A07;
    public AnonymousClass988 A08;
    public C7IM A09;
    public C2EC A0A;
    public C7TG A0B;
    public DirectThreadKey A0C;
    public User A0D;
    public String A0E;
    public final InterfaceC09390do A0H = C1XM.A00(C37051GUh.A00(this, 38));
    public final InterfaceC09390do A0I = AbstractC60492pY.A02(this);
    public final C36346G1y A0G = new C36346G1y(this);
    public final C36345G1x A0F = new C36345G1x(this);
    public final InterfaceC41501vz A0J = C31650DvG.A00(this, 18);
    public final InterfaceC60152ox A0K = new G0M(this, 1);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_text_card_viewer_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        IgTextView igTextView;
        int i;
        String A0w;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31173DnH.A0F(view, R.id.media_viewer_content_view);
        this.A01 = AbstractC31172DnG.A0X(view, R.id.disclaimer_text);
        FOK fok = this.A07;
        String str2 = null;
        if (fok == null) {
            str = "reactionManager";
        } else {
            G1d g1d = fok.A08;
            C14360o3.A0B(g1d, 1);
            fok.A03 = new C32871EdD(AbstractC31177DnL.A0V(view, R.id.card_reactions_pill_stub), g1d);
            fok.A00 = (TouchInterceptorFrameLayout) view.requireViewById(R.id.card);
            C3I8 A01 = C3I7.A01(this, false, false);
            this.A02 = A01;
            A01.A9e(this.A0K);
            C31835Dyu c31835Dyu = this.A04;
            str = "viewModel";
            if (c31835Dyu != null) {
                AbstractC31174DnI.A1E(this, c31835Dyu.A00, new C50370MLx(42, view, this), 15);
                Bundle bundle2 = this.mArguments;
                if (bundle2 != null) {
                    str2 = bundle2.getString(AbstractC43591JPw.A00(134));
                }
                this.A0E = str2;
                if (str2 != null) {
                    C31835Dyu c31835Dyu2 = this.A04;
                    if (c31835Dyu2 != null) {
                        c31835Dyu2.A08.Egh(str2);
                    }
                }
                InterfaceC09390do interfaceC09390do = this.A0I;
                String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
                C2EC c2ec = this.A0A;
                String str3 = null;
                if (c2ec != null) {
                    C81543kP A0g = AbstractC31172DnG.A0g(c2ec);
                    if (A0g != null) {
                        str3 = A0g.A07;
                    }
                    String str4 = null;
                    if (C14360o3.A0K(A0t, str3)) {
                        View inflate = AbstractC167007dF.A0M(view, R.id.intermediate_viewer_reply_bar).inflate();
                        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) inflate;
                        View A0S = AbstractC166997dE.A0S(viewGroup, R.id.row_thread_composer_edittext);
                        A0S.requestFocus();
                        AbstractC13880nE.A0T(A0S);
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        C36346G1y c36346G1y = this.A0G;
                        C3I9 c3i9 = this.A02;
                        if (c3i9 == null) {
                            str = "keyboardHeightChangeDetector";
                        } else {
                            WjH wjH = new WjH(viewGroup, A0r, c3i9, c36346G1y);
                            this.A06 = wjH;
                            wjH.A06.setVisibility(8);
                            C7IM c7im = this.A09;
                            if (c7im == null) {
                                str = "threadTheme";
                            } else {
                                wjH.ADn(c7im.A07);
                                boolean A06 = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36319377332182385L);
                                C7TG c7tg = this.A0B;
                                if (c7tg == null) {
                                    str = "sendMessageManager";
                                } else {
                                    wjH.EgT(c7tg, A06);
                                    igTextView = this.A01;
                                    if (igTextView != null) {
                                        i = 2131960218;
                                        A0w = getString(i);
                                    }
                                    ViewStub A0M = AbstractC167007dF.A0M(view, R.id.intermediate_viewer_action_bar);
                                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                                    View inflate2 = A0M.inflate();
                                    C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                                    C35011Fbi c35011Fbi = new C35011Fbi((ViewGroup) inflate2, A0r2, this.A0F);
                                    this.A05 = c35011Fbi;
                                    c35011Fbi.A02.setVisibility(0);
                                    A00(view, this);
                                    return;
                                }
                            }
                        }
                    } else {
                        C2EC c2ec2 = this.A0A;
                        if (c2ec2 != null) {
                            C81543kP A0g2 = AbstractC31172DnG.A0g(c2ec2);
                            if (A0g2 != null) {
                                str4 = A0g2.A08;
                            }
                            igTextView = this.A01;
                            if (igTextView != null) {
                                if (str4 != null) {
                                    A0w = AbstractC31174DnI.A0w(this, str4, 2131960216);
                                } else {
                                    i = 2131960217;
                                    A0w = getString(i);
                                }
                            }
                            ViewStub A0M2 = AbstractC167007dF.A0M(view, R.id.intermediate_viewer_action_bar);
                            UserSession A0r22 = AbstractC166987dD.A0r(interfaceC09390do);
                            View inflate22 = A0M2.inflate();
                            C14360o3.A0C(inflate22, "null cannot be cast to non-null type android.view.ViewGroup");
                            C35011Fbi c35011Fbi2 = new C35011Fbi((ViewGroup) inflate22, A0r22, this.A0F);
                            this.A05 = c35011Fbi2;
                            c35011Fbi2.A02.setVisibility(0);
                            A00(view, this);
                            return;
                        }
                    }
                    igTextView.setText(A0w);
                    ViewStub A0M22 = AbstractC167007dF.A0M(view, R.id.intermediate_viewer_action_bar);
                    UserSession A0r222 = AbstractC166987dD.A0r(interfaceC09390do);
                    View inflate222 = A0M22.inflate();
                    C14360o3.A0C(inflate222, "null cannot be cast to non-null type android.view.ViewGroup");
                    C35011Fbi c35011Fbi22 = new C35011Fbi((ViewGroup) inflate222, A0r222, this.A0F);
                    this.A05 = c35011Fbi22;
                    c35011Fbi22.A02.setVisibility(0);
                    A00(view, this);
                    return;
                }
                str = "thread";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(View view, C32256EIq c32256EIq) {
        EnumC33362Eov enumC33362Eov;
        String str;
        int A07;
        String string;
        int i;
        C32716Eah c32716Eah = c32256EIq.A03;
        if (c32716Eah != null) {
            C32050E6c c32050E6c = c32716Eah.A01;
            User user = c32256EIq.A0D;
            Integer num = c32050E6c.A04;
            if (user != null) {
                AbstractC31173DnH.A1T(c32256EIq, AbstractC167007dF.A0T(view, R.id.profile_picture), user);
            }
            TextView A0N = AbstractC167007dF.A0N(view, R.id.card_timestamp);
            if (num != null) {
                Context A0L = AbstractC166997dE.A0L(A0N);
                double intValue = num.intValue();
                i = 0;
                A0N.setText(C23831Eq.A05(A0L, intValue, false));
            } else {
                i = 8;
            }
            A0N.setVisibility(i);
            AbstractC167007dF.A0N(view, R.id.response).setText(c32050E6c.A06);
            FOK fok = c32256EIq.A07;
            if (fok == null) {
                str = "reactionManager";
            } else {
                fok.A01 = c32716Eah;
                C32871EdD c32871EdD = fok.A03;
                str = "reactionsPillViewHolder";
                if (c32871EdD != null) {
                    C32869EdB c32869EdB = c32716Eah.A03;
                    AbstractC59962oe abstractC59962oe = fok.A05;
                    c32871EdD.A03(abstractC59962oe, c32869EdB);
                    C32871EdD c32871EdD2 = fok.A03;
                    if (c32871EdD2 != null) {
                        c32871EdD2.BKF().setElevation(2.1311653E9f);
                        if (fok.A02 == null) {
                            C36416G4r c36416G4r = new C36416G4r(fok);
                            C36399G4a c36399G4a = new C36399G4a(abstractC59962oe);
                            TouchInterceptorFrameLayout touchInterceptorFrameLayout = fok.A00;
                            if (touchInterceptorFrameLayout != null) {
                                C32829EcX c32829EcX = new C32829EcX(touchInterceptorFrameLayout, c36399G4a, c36416G4r);
                                fok.A02 = c32829EcX;
                                c32829EcX.A00 = fok.A01;
                                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = fok.A00;
                                if (touchInterceptorFrameLayout2 != null) {
                                    touchInterceptorFrameLayout2.setOnTouchListener(c32829EcX);
                                }
                            }
                            str = "cardView";
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        TextView A0e = AbstractC166987dD.A0e(view, R.id.row_thread_composer_edittext);
        if (A0e != null) {
            User user2 = c32256EIq.A0D;
            if (user2 != null) {
                string = AbstractC31174DnI.A0w(c32256EIq, user2.B8y(), 2131960656);
            } else {
                string = c32256EIq.getString(2131960655);
            }
            A0e.setHint(string);
        }
        User user3 = c32256EIq.A0D;
        if (user3 != null) {
            String id = user3.getId();
            InterfaceC09390do interfaceC09390do = c32256EIq.A0I;
            boolean A0K = C14360o3.A0K(id, AbstractC31173DnH.A0t(interfaceC09390do));
            ArrayList A1E = AbstractC166987dD.A1E();
            if (A0K) {
                enumC33362Eov = EnumC33362Eov.A02;
            } else {
                C98R A00 = C98Q.A00(AbstractC166987dD.A0r(interfaceC09390do));
                C2EC c2ec = c32256EIq.A0A;
                C83693oE c83693oE = null;
                if (c2ec != null) {
                    String C7I = c2ec.C7I();
                    if (C7I != null) {
                        c83693oE = AbstractC31171DnF.A0N(C7I);
                    }
                    if (A00.A00(c83693oE, 7)) {
                        A1E.add(EnumC33362Eov.A04);
                    }
                    enumC33362Eov = EnumC33362Eov.A05;
                }
                str = "thread";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A1E.add(enumC33362Eov);
            C35011Fbi c35011Fbi = c32256EIq.A05;
            str = "actionBarConfigurer";
            Long l = null;
            if (c35011Fbi != null) {
                c35011Fbi.A01(A1E);
                C35011Fbi c35011Fbi2 = c32256EIq.A05;
                if (c35011Fbi2 != null) {
                    MessagingUser A002 = MessagingUser.A00(user3);
                    ImageUrl Bhu = user3.Bhu();
                    String B8y = user3.B8y();
                    C32716Eah c32716Eah2 = c32256EIq.A03;
                    if (c32716Eah2 != null) {
                        l = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(((G49) c32716Eah2).A00));
                    }
                    C2EC c2ec2 = c32256EIq.A0A;
                    if (c2ec2 != null) {
                        boolean CWO = c2ec2.CWO();
                        c35011Fbi2.A00 = A002;
                        CircularImageView circularImageView = c35011Fbi2.A07;
                        circularImageView.setUrl(Bhu, c32256EIq);
                        circularImageView.setVisibility(0);
                        IgTextView igTextView = c35011Fbi2.A06;
                        if (A0K) {
                            B8y = circularImageView.getContext().getString(2131976903);
                        }
                        igTextView.setText(B8y);
                        igTextView.setVisibility(0);
                        if (l != null) {
                            IgTextView igTextView2 = c35011Fbi2.A05;
                            igTextView2.setVisibility(0);
                            igTextView2.setText(C23831Eq.A05(AbstractC166997dE.A0L(igTextView2), l.longValue() / 1000000, false));
                        } else {
                            c35011Fbi2.A05.setVisibility(4);
                        }
                        if (CWO) {
                            A07 = R.color.grey_0;
                        } else {
                            A07 = AbstractC53242c7.A07(c35011Fbi2.A02.getContext());
                        }
                        Context context = c35011Fbi2.A02.getContext();
                        int color = context.getColor(A07);
                        C56352iT c56352iT = c35011Fbi2.A03;
                        c56352iT.A0V(color);
                        igTextView.setTextColor(color);
                        c56352iT.EPD(context.getDrawable(R.color.fds_transparent));
                        return;
                    }
                    str = "thread";
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0I);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C3o9 c3o9;
        Throwable A0t;
        int i;
        Integer num;
        String A0b;
        int A02 = C0f9.A02(-1643733105);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            c3o9 = AbstractC43826JZo.A00(bundle2, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        } else {
            c3o9 = null;
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) c3o9;
        if (directThreadKey != null) {
            this.A0C = directThreadKey;
            InterfaceC09390do interfaceC09390do = this.A0I;
            C2DS A00 = AbstractC28761aE.A00(AbstractC166987dD.A0r(interfaceC09390do));
            DirectThreadKey directThreadKey2 = this.A0C;
            if (directThreadKey2 != null) {
                C81663kb A03 = C2DU.A03((C2DU) A00, directThreadKey2);
                if (A03 != null) {
                    this.A0A = A03;
                    AnonymousClass989 anonymousClass989 = AnonymousClass988.A1Z;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    Parcelable.Creator creator = Capabilities.CREATOR;
                    C16930sl c16930sl = C16930sl.A00;
                    this.A08 = anonymousClass989.A00(A0r, AbstractC2054797v.A00(c16930sl));
                    Context requireContext = requireContext();
                    AnonymousClass988 A002 = anonymousClass989.A00(AbstractC166987dD.A0r(interfaceC09390do), AbstractC2054797v.A00(c16930sl));
                    C2EC c2ec = this.A0A;
                    if (c2ec != null) {
                        if (c2ec.CWO()) {
                            num = C05F.A0N;
                        } else {
                            num = C05F.A00;
                        }
                        C2EC c2ec2 = this.A0A;
                        if (c2ec2 != null) {
                            this.A09 = C7ID.A00.A01(requireContext, A002, c2ec2.C72(), num);
                            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                            DirectThreadKey directThreadKey3 = this.A0C;
                            if (directThreadKey3 != null) {
                                C2EC c2ec3 = this.A0A;
                                if (c2ec3 != null) {
                                    this.A07 = new FOK(this, A0r2, directThreadKey3, c2ec3.C7g());
                                    this.A0B = AbstractC165967bO.A00(AbstractC166987dD.A0r(interfaceC09390do));
                                    UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                                    DirectThreadKey directThreadKey4 = this.A0C;
                                    if (directThreadKey4 != null) {
                                        Bundle bundle3 = this.mArguments;
                                        if (bundle3 != null && (A0b = AbstractC31171DnF.A0b(bundle3)) != null) {
                                            Bundle bundle4 = this.mArguments;
                                            if (bundle4 != null) {
                                                str = bundle4.getString("message_id");
                                            }
                                            this.A04 = (C31835Dyu) new EWV(A0r3, directThreadKey4, A0b, str).create(C31835Dyu.class);
                                            C0f9.A09(-1310996034, A02);
                                            return;
                                        }
                                        A0t = AbstractC166987dD.A14("Required value was null.");
                                        i = 1724811491;
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("thread");
                    throw C00O.createAndThrow();
                }
                A0t = AbstractC166987dD.A14("Required value was null.");
                i = 1005591701;
            }
            C14360o3.A0F("threadKey");
            throw C00O.createAndThrow();
        }
        A0t = AbstractC31172DnG.A0t();
        i = -631003165;
        C0f9.A09(i, A02);
        throw A0t;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1949198457);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.intermediate_card_viewer, viewGroup, false);
        C0f9.A09(658556358, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1435249335);
        super.onDestroy();
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this.A0K);
        C0f9.A09(1391905972, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-151903950);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        C0f9.A09(-1276497441, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1296903597);
        super.onPause();
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        InterfaceC37230Gaf interfaceC37230Gaf = this.A06;
        if (interfaceC37230Gaf != null) {
            interfaceC37230Gaf.EGP();
        }
        AbstractC31176DnK.A0Q(this.A0I).A02(this.A0J, C36078FwE.class);
        C0f9.A09(-1085930531, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(37755745);
        super.onResume();
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(getActivity());
        InterfaceC37230Gaf interfaceC37230Gaf = this.A06;
        if (interfaceC37230Gaf != null) {
            interfaceC37230Gaf.AAV();
        }
        AbstractC31176DnK.A0Q(this.A0I).A01(this.A0J, C36078FwE.class);
        C0f9.A09(-1124682832, A02);
    }
}
