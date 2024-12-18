package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;

/* loaded from: classes6.dex */
public final class EJK extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MultipleLinksReorderingFragment";
    public RecyclerView A00;
    public ActionButton A01;
    public C32416EPr A02;
    public CardView A03;
    public final C8SB A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        boolean A00 = FAF.A00(AbstractC166987dD.A0r(this.A05), true);
        ?? obj = new Object();
        C35197Ffp.A02(AbstractC166997dE.A0N(this), obj, 2131970206);
        ActionButton A002 = C31722DwR.A00(new ViewOnClickListenerC35669Fp4(8, this, A00), interfaceC56362iU, obj);
        A002.setEnabled(false);
        this.A01 = A002;
        AbstractC31176DnK.A1C(new ViewOnClickListenerC35669Fp4(9, this, A00), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "multiple_links_reordering";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C33052EiB c33052EiB;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = new C32416EPr(new C30189DRu(this, 19));
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.links_list);
        this.A00 = A0G;
        if (A0G != null) {
            C32416EPr c32416EPr = this.A02;
            if (c32416EPr == null) {
                str = "adapter";
            } else {
                A0G.setAdapter(c32416EPr);
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new C31863DzV(requireContext(), this));
                    C8SB c8sb = this.A04;
                    RecyclerView recyclerView2 = this.A00;
                    if (recyclerView2 != null) {
                        c8sb.A0A(recyclerView2);
                        InterfaceC09390do interfaceC09390do = this.A06;
                        C05A c05a = ((C31793DyD) interfaceC09390do.getValue()).A03;
                        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                        FMH fmh = (FMH) AbstractC58232lf.A00(anonymousClass191, c05a).A02();
                        if (fmh != null && (c33052EiB = fmh.A00) != null) {
                            View inflate = AbstractC31171DnF.A07(view, R.id.pinned_link_stub).inflate();
                            C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                            CardView cardView = (CardView) inflate;
                            this.A03 = cardView;
                            str = "pinnedLinkView";
                            if (cardView != null) {
                                cardView.setCardElevation(0.0f);
                                CardView cardView2 = this.A03;
                                if (cardView2 != null) {
                                    AbstractC166987dD.A0e(cardView2, R.id.link_title).setText(c33052EiB.A03);
                                    CardView cardView3 = this.A03;
                                    if (cardView3 != null) {
                                        int i = 1;
                                        AbstractC166987dD.A0e(cardView3, R.id.link_title).setTypeface(Typeface.defaultFromStyle(1));
                                        CardView cardView4 = this.A03;
                                        if (cardView4 != null) {
                                            TextView A0e = AbstractC166987dD.A0e(cardView4, R.id.link_sub_title);
                                            String str2 = c33052EiB.A02;
                                            A0e.setText(str2);
                                            CardView cardView5 = this.A03;
                                            if (cardView5 != null) {
                                                View findViewById = cardView5.findViewById(R.id.link_sub_title);
                                                if (str2 != null && str2.length() != 0) {
                                                    i = 0;
                                                }
                                                findViewById.setVisibility(AbstractC31175DnJ.A01(i));
                                                CardView cardView6 = this.A03;
                                                if (cardView6 != null) {
                                                    ImageView A08 = AbstractC31171DnF.A08(cardView6, R.id.link_icon);
                                                    CardView cardView7 = this.A03;
                                                    if (cardView7 != null) {
                                                        AbstractC166997dE.A19(cardView7.getContext(), A08, c33052EiB.A00);
                                                        CardView cardView8 = this.A03;
                                                        if (cardView8 != null) {
                                                            cardView8.findViewById(R.id.is_pinned_text).setVisibility(0);
                                                            CardView cardView9 = this.A03;
                                                            if (cardView9 != null) {
                                                                cardView9.findViewById(R.id.chevron_icon).setVisibility(8);
                                                                RecyclerView recyclerView3 = this.A00;
                                                                if (recyclerView3 != null) {
                                                                    ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
                                                                    C14360o3.A0C(layoutParams, AbstractC111324zv.A00(0));
                                                                    C56302iJ c56302iJ = (C56302iJ) layoutParams;
                                                                    CardView cardView10 = this.A03;
                                                                    if (cardView10 != null) {
                                                                        c56302iJ.A0t = cardView10.getId();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        AbstractC58232lf.A00(anonymousClass191, ((C31793DyD) interfaceC09390do.getValue()).A03).A06(this, new C31421DrQ(0, new C57748Pjb(this, 30)));
                        AbstractC58232lf.A00(anonymousClass191, ((C31793DyD) interfaceC09390do.getValue()).A02).A06(this, new C31421DrQ(0, new C57748Pjb(this, 31)));
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public EJK() {
        GSv gSv = new GSv(this, 43);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new GSv(new GSv(this, 40), 41));
        this.A06 = AbstractC25225BEi.A0a(new GSv(A00, 42), gSv, new C57257Pbf(9, null, A00), AbstractC25225BEi.A1D(C31793DyD.class));
        this.A04 = new C8SB(new C31860DzS(this));
        this.A05 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2081840045);
        super.onCreate(bundle);
        EVO.A00(this);
        C0f9.A09(-532092475, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1954102618);
        C14360o3.A0B(layoutInflater, 0);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.multiple_links_reordering, false);
        C0f9.A09(30210866, A02);
        return A07;
    }
}
