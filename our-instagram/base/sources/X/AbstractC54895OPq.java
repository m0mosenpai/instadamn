package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.OPq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54895OPq {
    public static final ViewGroup A00(ViewGroup viewGroup, UserSession userSession) {
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, userSession);
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(context), viewGroup, R.layout.layout_story_interstitial_reel_item, false);
        MSZ.A13(viewGroup2);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(context);
        NSJ nsj = new NSJ(context, viewGroup2, userSession);
        nsj.A04.setLayerType(A1R ? 1 : 0, null);
        viewGroup2.setTag(nsj);
        return viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C3G2 c3g2, C146346iX c146346iX, InterfaceC146296iS interfaceC146296iS, InterfaceC144586fe interfaceC144586fe, NSJ nsj, InterfaceC145696hS interfaceC145696hS) {
        EnumC41231vY enumC41231vY;
        View view;
        View.OnClickListener A00;
        ImageUrl imageUrl;
        String str;
        String str2;
        String str3;
        InterfaceC57981PnR interfaceC57981PnR;
        int i;
        C14360o3.A0B(nsj, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c41181vS, 2);
        AbstractC167007dF.A1F(interfaceC145696hS, 3, interfaceC144586fe);
        C14360o3.A0B(c3g2, 8);
        C14360o3.A0B(interfaceC11380iw, 9);
        C141596ac C00 = interfaceC146296iS.C00(c41181vS);
        ImageButton imageButton = nsj.A01;
        Ok3.A00(imageButton, 9, interfaceC145696hS);
        imageButton.setVisibility(0);
        Ok3.A00(imageButton, 10, interfaceC145696hS);
        C00.A03(nsj);
        ReelViewGroup reelViewGroup = nsj.A09;
        reelViewGroup.A97(interfaceC144586fe);
        C3G4 c3g4 = null;
        reelViewGroup.A02 = null;
        SegmentedProgressBar segmentedProgressBar = nsj.A04;
        segmentedProgressBar.setSegments(1);
        segmentedProgressBar.A06(0, false);
        segmentedProgressBar.setVisibility(0);
        nsj.A03 = c41181vS;
        Reel reel = c41551w4.A0H;
        if (reel.getId().equals(AbstractC111324zv.A00(4359))) {
            enumC41231vY = EnumC41231vY.A0Q;
        } else {
            enumC41231vY = c41181vS.A0e;
            C14360o3.A0A(enumC41231vY);
        }
        int ordinal = enumC41231vY.ordinal();
        if (ordinal != 21) {
            if (ordinal != 22) {
                if (ordinal == 23) {
                    nsj.A03 = null;
                    interfaceC146296iS.C00(c41181vS).A03(nsj);
                    OFT oft = nsj.A05;
                    C14360o3.A0B(oft, 1);
                    C70843Fw A002 = AbstractC70833Fv.A00(userSession);
                    C19270xB A0D = AbstractC31171DnF.A0D("ROLL_CALL_INTERSTITIAL");
                    if (!reel.A16(userSession)) {
                        View A0d = AbstractC166987dD.A0d(oft.A01);
                        ImageUrl A07 = c41551w4.A07(userSession);
                        C14360o3.A0B(A0d, 0);
                        Context A0L = AbstractC166997dE.A0L(A0d);
                        AbstractC28066CYu.A01(A0L, userSession, A07, reel, new C57754Pjh(A0d, 8));
                        A0d.setBackgroundResource(AbstractC53242c7.A0H(A0L, R.attr.igds_color_stories_loading_background));
                    } else {
                        AbstractC54138Nwa.A00((CircularImageView) oft.A01.getValue());
                    }
                    InterfaceC56392iX interfaceC56392iX = oft.A00;
                    Context context = interfaceC56392iX.getView().getContext();
                    if (A002.A01() && (context instanceof C07X)) {
                        AbstractC43593JPy.A1W(oft.A08, 0);
                        C07X c07x = (C07X) context;
                        AbstractC166987dD.A1Z(new PZR(oft, A002, c07x, C07S.RESUMED, context, null, 0), C07Y.A00(c07x));
                    } else {
                        AbstractC43593JPy.A1W(oft.A08, 8);
                    }
                    TextView A0D2 = MSW.A0D(oft.A0A);
                    CharSequence charSequence = reel.A0r;
                    if (charSequence == null) {
                        charSequence = context.getResources().getText(2131972617);
                        C14360o3.A07(charSequence);
                    }
                    A0D2.setText(charSequence);
                    InterfaceC09390do interfaceC09390do = oft.A09;
                    TextView A0D3 = MSW.A0D(interfaceC09390do);
                    Long l = A002.A01;
                    if (l != null) {
                        long longValue = l.longValue();
                        Resources resources = AbstractC166987dD.A0d(interfaceC09390do).getResources();
                        C14360o3.A07(resources);
                        str3 = C23831Eq.A09(resources, longValue);
                    } else {
                        str3 = null;
                    }
                    A0D3.setText(str3);
                    C0fQ.A00(new ViewOnClickListenerC42033Ik2(interfaceC144586fe, 3), AbstractC166987dD.A0d(oft.A02));
                    List A003 = C41551w4.A00(userSession, c41551w4);
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    for (Object obj : A003) {
                        ((List) JQ0.A0h(((C41181vS) obj).A0i, A1I)).add(obj);
                    }
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator A14 = AbstractC166997dE.A14(A1I);
                    while (A14.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A14);
                        User user = (User) A1K.getKey();
                        List A19 = MSW.A19(A1K);
                        if (user != null) {
                            Reel reel2 = new Reel((C1NB) new C1N9(user), user.getId(), false);
                            ArrayList A0i = AbstractC167007dF.A0i(A19);
                            Iterator it = A19.iterator();
                            while (it.hasNext()) {
                                A0i.add(((C41181vS) it.next()).A0b);
                            }
                            reel2.A0X(A0i);
                            A1E.add(reel2);
                        }
                    }
                    ArrayList A0i2 = AbstractC167007dF.A0i(A1E);
                    Iterator it2 = A1E.iterator();
                    while (it2.hasNext()) {
                        A0i2.add(new C3G4(null, (Reel) it2.next(), C3G2.A1H));
                    }
                    ArrayList A0i3 = AbstractC167007dF.A0i(A0i2);
                    Iterator it3 = A0i2.iterator();
                    while (it3.hasNext()) {
                        A0i3.add(new C56086Ov3((C3G4) it3.next()));
                    }
                    boolean isEmpty = A0i3.isEmpty();
                    TextView A0D4 = MSW.A0D(oft.A07);
                    Resources resources2 = context.getResources();
                    if (isEmpty) {
                        AbstractC31173DnH.A19(resources2, A0D4, 2131972609);
                        AbstractC31173DnH.A19(context.getResources(), MSW.A0D(oft.A06), 2131972608);
                    } else {
                        AbstractC31173DnH.A19(resources2, A0D4, 2131972616);
                        AbstractC31173DnH.A19(context.getResources(), MSW.A0D(oft.A06), 2131972615);
                    }
                    C60962qK A01 = AbstractC60952qJ.A01("ROLL_CALL_INTERSTITIAL", false, false);
                    C3G2 c3g22 = C3G2.A1H;
                    C145836hg c145836hg = new C145836hg(A01, c3g22);
                    if (c146346iX != null) {
                        interfaceC57981PnR = new P9A(userSession, c41551w4, c145836hg, c146346iX, interfaceC146296iS);
                    } else {
                        interfaceC57981PnR = P9B.A00;
                    }
                    if (A0i3.isEmpty()) {
                        O4J o4j = (O4J) oft.A03.getValue();
                        C14360o3.A0B(o4j, 0);
                        ImageUrl Bhu = AbstractC166997dE.A0Y(userSession).Bhu();
                        InterfaceC09390do interfaceC09390do2 = o4j.A00;
                        AbstractC43592JPx.A0V(interfaceC09390do2).setUrl(Bhu, A0D);
                        interfaceC57981PnR.E0Q(AbstractC166987dD.A0d(interfaceC09390do2), new C3G4(null, reel, c3g22));
                    } else if (A0i3.size() <= 3) {
                        NSI nsi = (NSI) oft.A05.getValue();
                        C14360o3.A0B(nsi, 0);
                        if (A0i3.size() <= 1) {
                            i = 1;
                            AbstractC43592JPx.A0V(((O4J) nsi).A00).setUrl(AbstractC166997dE.A0Y(userSession).Bhu(), A0D);
                        } else {
                            i = 0;
                            AbstractC43593JPy.A1W(nsi.A01, 8);
                        }
                        InterfaceC09390do interfaceC09390do3 = nsi.A00;
                        int i2 = 0;
                        for (Object obj2 : AbstractC001800i.A0d(A0i3, AbstractC31171DnF.A0n(interfaceC09390do3).size())) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC16960so.A1U();
                                throw C00O.createAndThrow();
                            }
                            C51333Mlu c51333Mlu = (C51333Mlu) AbstractC37302Gc3.A0Y(interfaceC09390do3, i2 + i);
                            C3G4 c3g42 = ((C56086Ov3) obj2).A00;
                            AbstractC54141Nwd.A00(A0D, userSession, c3g42, c3g4, interfaceC144586fe, interfaceC57981PnR, c51333Mlu, i2);
                            c3g4 = c3g42;
                            i2 = i3;
                        }
                    } else {
                        O4I o4i = (O4I) oft.A04.getValue();
                        C14360o3.A0B(o4i, 0);
                        InterfaceC09390do interfaceC09390do4 = o4i.A00;
                        if (((RecyclerView) AbstractC166987dD.A17(interfaceC09390do4)).A0A == null) {
                            ((RecyclerView) AbstractC166987dD.A17(interfaceC09390do4)).setAdapter(AbstractC31173DnH.A0R(C66362zD.A00(AbstractC167007dF.A0L(interfaceC09390do4).getContext()), new NFF(A0D, userSession, interfaceC144586fe, interfaceC57981PnR)));
                        }
                        ViewModelListUpdate A0L2 = AbstractC43593JPy.A0L(A0i3);
                        C2UU c2uu = ((RecyclerView) AbstractC166987dD.A17(interfaceC09390do4)).A0A;
                        C14360o3.A0C(c2uu, "null cannot be cast to non-null type com.instagram.common.recyclerview.IgRecyclerViewAdapter");
                        ((C66362zD) c2uu).A05(A0L2);
                    }
                    View view2 = interfaceC56392iX.getView();
                    C14360o3.A0B(view2, 0);
                    view = AbstractC166997dE.A0S(view2, R.id.roll_call_interstitial_add_item);
                    A00 = new ViewOnClickListenerC42033Ik2(interfaceC144586fe, 2);
                    C0fQ.A00(A00, view);
                } else {
                    throw AbstractC166987dD.A12(AbstractC111324zv.A00(3810));
                }
            } else {
                View view3 = nsj.itemView;
                Context context2 = nsj.A00;
                AbstractC31172DnG.A1B(context2, view3, AbstractC53242c7.A0H(context2, R.attr.igds_color_media_background));
                ODH odh = nsj.A07;
                List list = c41181vS.A0L;
                odh.A04.setVisibility(0);
                nsj.A03 = c41181vS;
                TextView textView = odh.A02;
                if (textView != null) {
                    AbstractC166987dD.A1P(odh.A00, textView, 2131974571);
                }
                if (list != null && list.size() >= 3) {
                    TextView textView2 = odh.A01;
                    if (textView2 != null) {
                        Context context3 = odh.A00;
                        C1NB c1nb = ((Reel) list.get(0)).A0W;
                        if (c1nb != null) {
                            str = c1nb.getName();
                        } else {
                            str = null;
                        }
                        C1NB c1nb2 = ((Reel) list.get(1)).A0W;
                        if (c1nb2 != null) {
                            str2 = c1nb2.getName();
                        } else {
                            str2 = null;
                        }
                        textView2.setText(context3.getString(2131974570, str, str2, Integer.valueOf(AbstractC31172DnG.A03(list, 2))));
                    }
                    int size = list.size();
                    GradientSpinnerAvatarView[] gradientSpinnerAvatarViewArr = odh.A03;
                    if (size > 9) {
                        size = 9;
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        Reel reel3 = (Reel) list.get(i4);
                        GradientSpinnerAvatarView gradientSpinnerAvatarView = gradientSpinnerAvatarViewArr[i4];
                        if (gradientSpinnerAvatarView != null) {
                            gradientSpinnerAvatarView.setVisibility(0);
                            C1NB c1nb3 = reel3.A0W;
                            if (c1nb3 != null) {
                                imageUrl = c1nb3.AsM();
                            } else {
                                imageUrl = null;
                            }
                            gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, imageUrl);
                            gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
                            gradientSpinnerAvatarView.setGradientColor(C3PP.A00(userSession, reel3));
                            gradientSpinnerAvatarView.setGradientSpinnerActivated(!reel3.A16(userSession));
                            gradientSpinnerAvatarView.A07();
                            ViewOnClickListenerC55468OkN.A00(gradientSpinnerAvatarView, 10, interfaceC145696hS, reel3);
                        }
                    }
                }
            }
            interfaceC145696hS.DpO(c41181vS, c41551w4, nsj, false);
        }
        C54697ODz c54697ODz = nsj.A06;
        c54697ODz.A05.A03(0);
        nsj.A03 = c41181vS;
        List list2 = c41181vS.A0K;
        TextView textView3 = c54697ODz.A03;
        if (textView3 != null) {
            AbstractC166987dD.A1P(c54697ODz.A00, textView3, 2131976213);
        }
        TextView textView4 = c54697ODz.A02;
        if (textView4 != null) {
            MSX.A0x(c54697ODz.A00.getResources(), textView4, new Object[]{AbstractC54142Nwe.A00(list2, 0), AbstractC54142Nwe.A00(list2, 1), AbstractC54142Nwe.A00(list2, 2)}, 2131976212);
        }
        IgImageView igImageView = c54697ODz.A04;
        if (igImageView != null) {
            Context context4 = c54697ODz.A00;
            if (list2 == null) {
                list2 = Collections.emptyList();
                C14360o3.A07(list2);
            }
            igImageView.setImageDrawable(AbstractC89513yr.A00(context4, null, Float.valueOf(0.3f), C05F.A00, null, AbstractC37301Gc2.A0T(context4.getResources(), R.dimen.audience_lists_text_in_badge_horizontal_margin_right), null, null, "story_interstitial", list2, context4.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material), true, false, false, true, false));
        }
        TextView textView5 = c54697ODz.A01;
        if (textView5 != null) {
            AbstractC166987dD.A1P(c54697ODz.A00, textView5, 2131976211);
            view = c54697ODz.A01;
            C14360o3.A0A(view);
            A00 = ViewOnClickListenerC55459OkE.A00(interfaceC145696hS, c54697ODz, c41181vS, 28);
            C0fQ.A00(A00, view);
        }
        interfaceC145696hS.DpO(c41181vS, c41551w4, nsj, false);
    }
}
