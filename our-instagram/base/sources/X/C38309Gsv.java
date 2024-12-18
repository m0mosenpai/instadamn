package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* renamed from: X.Gsv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38309Gsv extends BaseAdapter {
    public C38321qM A00;
    public EnumC39541HdD A01;
    public List A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final INQ A05;
    public final HCB A06;
    public final C4ZF A07;
    public final C41045IFo A08;

    public C38309Gsv(InterfaceC11380iw interfaceC11380iw, UserSession userSession, INQ inq, HCB hcb, C41045IFo c41045IFo, C4ZF c4zf) {
        AbstractC167027dH.A0a(1, interfaceC11380iw, userSession, c41045IFo, c4zf);
        C14360o3.A0B(inq, 5);
        this.A03 = interfaceC11380iw;
        this.A04 = userSession;
        this.A08 = c41045IFo;
        this.A07 = c4zf;
        this.A05 = inq;
        this.A06 = hcb;
        this.A02 = C16930sl.A00;
        this.A01 = EnumC39541HdD.A02;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        EnumC39541HdD enumC39541HdD;
        EnumC39541HdD enumC39541HdD2;
        EnumC39541HdD enumC39541HdD3;
        Object c41071IGo;
        C14360o3.A0B(viewGroup, 2);
        int itemViewType = getItemViewType(i);
        if (view == null) {
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        if (itemViewType != 3) {
                            LayoutInflater from = LayoutInflater.from(AbstractC166997dE.A0L(viewGroup));
                            if (itemViewType != 4) {
                                view = AbstractC31173DnH.A0C(from, viewGroup, R.layout.lightbox_story_video, false);
                                c41071IGo = new C42799Iwb(view);
                            } else {
                                view = AbstractC31173DnH.A0C(from, viewGroup, R.layout.lightbox_story_photo, false);
                                c41071IGo = new C42798Iwa(view);
                            }
                        } else {
                            view = AbstractC31173DnH.A0C(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.lightbox_feed_video, false);
                            c41071IGo = new C41070IGn(view);
                        }
                    } else {
                        view = AbstractC31173DnH.A0C(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.lightbox_feed_photo, false);
                        c41071IGo = new C41069IGm(view);
                    }
                } else {
                    view = AbstractC31173DnH.A0C(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.lightbox_product_video, false);
                    c41071IGo = new IIF(view);
                }
            } else {
                view = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.lightbox_product_image, false);
                c41071IGo = new C41071IGo(view);
            }
            view.setTag(c41071IGo);
        }
        IN1 in1 = (IN1) this.A02.get(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType != 3) {
                        if (itemViewType != 4) {
                            C14360o3.A0C(in1, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselReelModel");
                            C39352HZr c39352HZr = (C39352HZr) in1;
                            Object tag = view.getTag();
                            if (tag != null) {
                                C42799Iwb c42799Iwb = (C42799Iwb) tag;
                                UserSession userSession = this.A04;
                                if (c39352HZr.A00 == this.A00) {
                                    enumC39541HdD3 = this.A01;
                                } else {
                                    enumC39541HdD3 = EnumC39541HdD.A02;
                                }
                                C4ZF c4zf = this.A07;
                                I6D.A00(this.A03, userSession, this.A06, c42799Iwb, this.A05, enumC39541HdD3, c39352HZr, c4zf);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            InterfaceC11380iw interfaceC11380iw = this.A03;
                            UserSession userSession2 = this.A04;
                            Object tag2 = view.getTag();
                            if (tag2 != null) {
                                C14360o3.A0C(in1, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselReelModel");
                                I6C.A00(interfaceC11380iw, userSession2, this.A06, (C42798Iwa) tag2, (C39352HZr) in1);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    } else {
                        C14360o3.A0C(in1, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselFeedMediaModel");
                        C39350HZp c39350HZp = (C39350HZp) in1;
                        UserSession userSession3 = this.A04;
                        Object tag3 = view.getTag();
                        if (tag3 != null) {
                            C41070IGn c41070IGn = (C41070IGn) tag3;
                            if (c39350HZp.A00 == this.A00) {
                                enumC39541HdD2 = this.A01;
                            } else {
                                enumC39541HdD2 = EnumC39541HdD.A02;
                            }
                            C4ZF c4zf2 = this.A07;
                            INQ inq = this.A05;
                            InterfaceC11380iw interfaceC11380iw2 = this.A03;
                            HCB hcb = this.A06;
                            AbstractC167017dG.A1N(userSession3, c41070IGn);
                            AbstractC25234BEr.A1R(c39350HZp, enumC39541HdD2, c4zf2, inq, interfaceC11380iw2);
                            C14360o3.A0B(hcb, 7);
                            I68.A00(userSession3, hcb, c41070IGn.A00, c39350HZp);
                            I67.A00(userSession3, hcb, c41070IGn.A01, c39350HZp);
                            I6E.A00(interfaceC11380iw2, hcb, c41070IGn.A02, inq, enumC39541HdD2, c39350HZp, c4zf2, ((IN1) c39350HZp).A00);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                } else {
                    InterfaceC11380iw interfaceC11380iw3 = this.A03;
                    UserSession userSession4 = this.A04;
                    Object tag4 = view.getTag();
                    if (tag4 != null) {
                        C41069IGm c41069IGm = (C41069IGm) tag4;
                        C14360o3.A0C(in1, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselFeedMediaModel");
                        C39350HZp c39350HZp2 = (C39350HZp) in1;
                        HCB hcb2 = this.A06;
                        AbstractC25230BEn.A15(1, interfaceC11380iw3, userSession4);
                        AbstractC25233BEq.A0w(2, c41069IGm, c39350HZp2, hcb2);
                        I68.A00(userSession4, hcb2, c41069IGm.A01, c39350HZp2);
                        I67.A00(userSession4, hcb2, c41069IGm.A02, c39350HZp2);
                        C80113i0 c80113i0 = new C80113i0(userSession4);
                        C38321qM c38321qM = c39350HZp2.A00;
                        IgProgressImageView igProgressImageView = c41069IGm.A00;
                        AbstractC80683ix.A00(interfaceC11380iw3, c80113i0.A00(AbstractC166997dE.A0L(igProgressImageView), c38321qM), igProgressImageView);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            } else {
                C14360o3.A0C(in1, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselProductVideoModel");
                C39349HZo c39349HZo = (C39349HZo) in1;
                Object tag5 = view.getTag();
                if (tag5 != null) {
                    IIF iif = (IIF) tag5;
                    if (c39349HZo.A00 == this.A00) {
                        enumC39541HdD = this.A01;
                    } else {
                        enumC39541HdD = EnumC39541HdD.A02;
                    }
                    I6A.A00(this.A03, this.A04, this.A06, iif, this.A05, enumC39541HdD, c39349HZo);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        } else {
            Object tag6 = view.getTag();
            if (tag6 != null) {
                C41071IGo c41071IGo2 = (C41071IGo) tag6;
                HCB hcb3 = this.A06;
                UserSession userSession5 = this.A04;
                InterfaceC11380iw interfaceC11380iw4 = this.A03;
                AbstractC167017dG.A1N(c41071IGo2, in1);
                AbstractC25233BEq.A0w(2, hcb3, userSession5, interfaceC11380iw4);
                I68.A00(userSession5, hcb3, c41071IGo2.A02, in1);
                ExtendedImageUrl A00 = in1.A00(c41071IGo2.A00);
                if (A00 != null) {
                    c41071IGo2.A01.setUrl(A00, interfaceC11380iw4);
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        C41045IFo c41045IFo = this.A08;
        C14360o3.A0B(in1, 1);
        C57112jm c57112jm = c41045IFo.A00;
        C59072n8 A002 = C59062n7.A00(in1, null, AnonymousClass001.A0R("lightbox_", in1.A01()));
        A002.A00(c41045IFo.A01);
        AbstractC25227BEk.A10(view, A002, c57112jm);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 6;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A02.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        IN1 in1 = (IN1) this.A02.get(i);
        Integer num = in1.A02;
        int intValue = num.intValue();
        if (intValue != 3) {
            if (intValue != 4) {
                if (intValue != 1) {
                    if (intValue == 5) {
                        if (!((C39352HZr) in1).A00.Cff()) {
                            return 4;
                        }
                        return 5;
                    }
                    throw AbstractC31175DnJ.A0V("Unexpected item type: ", AbstractC41360ISn.A01(num));
                }
                if (!((C39350HZp) in1).A00.Cff()) {
                    return 2;
                }
                return 3;
            }
            return 1;
        }
        return 0;
    }
}
