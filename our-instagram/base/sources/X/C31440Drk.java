package X;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Drk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31440Drk extends C2UU {
    public RecyclerView A00;
    public C19260xA A01;
    public C147036jf A02;
    public AbstractC31433Drd A03;
    public final Context A05;
    public final FragmentActivity A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final C38E A0A;
    public final User A0B;
    public final Runnable A0C;
    public final C31443Drn A0E;
    public C31363DqS A04 = new C31363DqS(AbstractC166987dD.A1E());
    public final C3G2 A09 = C3G2.A1v;
    public final String A0D = AbstractC167017dG.A0j();

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 5) {
                            View A0A = AbstractC31176DnK.A0A(LayoutInflater.from(this.A05), viewGroup, R.layout.contact_import_card);
                            InterfaceC11380iw interfaceC11380iw = this.A07;
                            if (!C14360o3.A0K(interfaceC11380iw.getModuleName(), "profile")) {
                                interfaceC11380iw = AbstractC31171DnF.A0D("self_profile_su");
                            }
                            C147036jf c147036jf = this.A02;
                            if (c147036jf == null) {
                                c147036jf = new C147036jf(interfaceC11380iw, this.A08);
                            }
                            if (this.A02 == null) {
                                this.A02 = c147036jf;
                            }
                            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                            return new C31996E3y(A0A, this.A08, c147036jf, new C34438FGc(this));
                        }
                        throw AbstractC31175DnJ.A0U("viewType invalid and unrecognized: ", i);
                    }
                    View A0A2 = AbstractC31176DnK.A0A(LayoutInflater.from(this.A05), viewGroup, R.layout.find_more_card);
                    AbstractC31433Drd abstractC31433Drd = this.A03;
                    if (abstractC31433Drd != null) {
                        C123835ix c123835ix = abstractC31433Drd.A02;
                        if (c123835ix.A04) {
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c123835ix.A06, "suggestions_see_all_impression");
                            A0f.AAP("view_module", "see_all_card");
                            A0f.Cht();
                        }
                    }
                    int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    return new E3O(A0A2, this.A08, new C34439FGd(this), this.A0B);
                }
                View A0A3 = AbstractC31176DnK.A0A(LayoutInflater.from(this.A05), viewGroup, R.layout.card_recommend_accounts_header);
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new E2U(A0A3, new C34441FGf(this));
            }
            View A0A4 = AbstractC31176DnK.A0A(LayoutInflater.from(this.A05), viewGroup, R.layout.suggested_entity_card);
            int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C31985E3n(A0A4, new C34440FGe(this));
        }
        View A0A5 = AbstractC31176DnK.A0A(LayoutInflater.from(this.A05), viewGroup, R.layout.suggested_entity_card);
        int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31441Drl(A0A5, this.A08, new C31481DsQ(this));
    }

    @Override // X.C2UU
    public final void onViewAttachedToWindow(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        int bindingAdapterPosition = c3oo.getBindingAdapterPosition();
        int itemViewType = getItemViewType(bindingAdapterPosition);
        Object obj = this.A04.A00.get(bindingAdapterPosition);
        if (itemViewType != 0) {
            if (itemViewType != 1 && itemViewType != 2 && itemViewType == 3) {
                C19280xC A01 = C19280xC.A01("ig_ra_chaining_unit_impression", "recommend_accounts");
                A01.A08(Integer.valueOf(bindingAdapterPosition), "pos");
                UserSession userSession = this.A08;
                A01.A0C("recommender_id", userSession.userId);
                C31363DqS c31363DqS = this.A04;
                if (c31363DqS.A00()) {
                    Object obj2 = c31363DqS.A00.get(0);
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.follow.chaining.RecommendAccountsHeader");
                    A01.A0C("receiver_id", ((C36480G7e) obj2).A00.getId());
                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.User");
                    A01.A0C("target_id", AbstractC31171DnF.A0g(obj));
                    AbstractC31173DnH.A1S(A01, userSession);
                    return;
                }
                throw AbstractC31172DnG.A0u();
            }
            return;
        }
        GradientSpinner gradientSpinner = ((C31441Drl) c3oo).A03.A0O;
        User user = this.A0B;
        if (user == null || gradientSpinner.getVisibility() != 0) {
            return;
        }
        C123835ix c123835ix = new C123835ix(this.A07, this.A08);
        String id = user.getId();
        Integer valueOf = Integer.valueOf(bindingAdapterPosition);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.User");
        String A0g = AbstractC31171DnF.A0g(obj);
        Boolean valueOf2 = Boolean.valueOf(user.A1I());
        String moduleName = c123835ix.A00.getModuleName();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c123835ix.A06, "similar_user_story_ring_impression");
        A0f.AAP("target_id", id);
        A0f.AAP("view_module", "user_profile");
        AbstractC25225BEi.A1O(A0f, moduleName);
        A0f.A8p("position", valueOf);
        A0f.AAP("chaining_profile_id", A0g);
        A0f.AAP("algorithm", "business_profile_chaining_nebula");
        A0f.A7v("is_auto_expand", valueOf2);
        A0f.Cht();
    }

    public static final void A00(C31440Drk c31440Drk, int i) {
        AbstractC31433Drd abstractC31433Drd;
        c31440Drk.A04.A00.remove(i);
        if (c31440Drk.A04.A00.isEmpty() && (abstractC31433Drd = c31440Drk.A03) != null) {
            abstractC31433Drd.A03();
        }
        c31440Drk.notifyItemRemoved(i);
    }

    public final Object A01(int i) {
        Object obj = this.A04.A00.get(i);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        Class<?> cls;
        C31441Drl c31441Drl;
        User user;
        User user2;
        View view;
        int i2;
        View.OnClickListener onClickListener;
        E2U e2u;
        User user3;
        EnumC33444EqG enumC33444EqG;
        C14360o3.A0B(c3oo, 0);
        int itemViewType = getItemViewType(i);
        Object obj = this.A04.A00.get(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType != 4) {
                        if (itemViewType == 5) {
                            C31996E3y c31996E3y = (C31996E3y) c3oo;
                            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.follow.chaining.ContactImportCardType");
                            XG8 xg8 = ((C34437FGb) obj).A00;
                            C15370ps A1F = AbstractC25225BEi.A1F();
                            if (xg8 != 0) {
                                c31996E3y.A02.setText(xg8.CDM());
                                c31996E3y.A01.setText(xg8.CDL());
                                c31996E3y.A00.setText(xg8.CDI());
                                c31996E3y.A05.setVisibility(8);
                                c31996E3y.A06.setVisibility(0);
                                enumC33444EqG = EnumC33444EqG.A0E;
                            } else {
                                enumC33444EqG = EnumC33444EqG.A0G;
                            }
                            A1F.A00 = enumC33444EqG;
                            C147036jf c147036jf = c31996E3y.A07;
                            if (!c147036jf.A00) {
                                c147036jf.A00();
                                c147036jf.A01(false, null, null);
                            }
                            ViewOnClickListenerC31591DuJ.A00(c31996E3y.A03, 9, c31996E3y, A1F);
                            view = c31996E3y.A04;
                            i2 = 10;
                            user3 = xg8;
                            e2u = c31996E3y;
                        } else {
                            throw AbstractC31175DnJ.A0U("viewType invalid and unrecognized: ", itemViewType);
                        }
                    } else {
                        E3O e3o = (E3O) c3oo;
                        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.follow.chaining.FindMorePeopleUpsellData");
                        C51761Mtk c51761Mtk = (C51761Mtk) obj;
                        InterfaceC11380iw interfaceC11380iw = this.A07;
                        C14360o3.A0B(c51761Mtk, 0);
                        e3o.A02.setUrls((ImageUrl) c51761Mtk.A02, (ImageUrl) c51761Mtk.A00, interfaceC11380iw);
                        ViewOnClickListenerC35685FpK.A01(e3o.itemView, 23, e3o);
                        view = e3o.A01;
                        onClickListener = ViewOnClickListenerC35685FpK.A00(e3o, 24);
                        C0fQ.A00(onClickListener, view);
                        return;
                    }
                } else {
                    E2U e2u2 = (E2U) c3oo;
                    Object obj2 = this.A04.A00.get(i);
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.follow.chaining.RecommendAccountsHeader");
                    User user4 = ((C36480G7e) obj2).A00;
                    Spanned A0B = AbstractC31173DnH.A0B(e2u2.itemView.getResources(), user4.getUsername(), 2131971599);
                    C14360o3.A07(A0B);
                    e2u2.A01.setText(A0B);
                    view = e2u2.A00;
                    i2 = 13;
                    user3 = user4;
                    e2u = e2u2;
                }
                onClickListener = new ViewOnClickListenerC31591DuJ(i2, e2u, user3);
                C0fQ.A00(onClickListener, view);
                return;
            }
            C31985E3n c31985E3n = (C31985E3n) c3oo;
            Object obj3 = this.A04.A00.get(i);
            C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.interestrecs.model.InterestRecommendationWrapper");
            FOC foc = (FOC) obj3;
            InterfaceC11380iw interfaceC11380iw2 = this.A07;
            C14360o3.A0B(foc, 0);
            Hashtag hashtag = foc.A00;
            if (hashtag != null) {
                String str2 = foc.A06;
                String str3 = foc.A05;
                ViewOnClickListenerC31591DuJ.A00(c31985E3n.A00, 11, c31985E3n, hashtag);
                if (hashtag.Bhu() != null) {
                    CircularImageView circularImageView = c31985E3n.A04;
                    ImageUrl Bhu = hashtag.Bhu();
                    if (Bhu != null) {
                        circularImageView.setUrl(Bhu, interfaceC11380iw2);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                ReelBrandingBadgeView reelBrandingBadgeView = c31985E3n.A07;
                reelBrandingBadgeView.setIconDrawable(R.drawable.reel_hash_branding_icon_large);
                reelBrandingBadgeView.setVisibility(0);
                c31985E3n.A03.setText(str2);
                TextView textView = c31985E3n.A02;
                if (textView instanceof TightTextView) {
                    ((TightTextView) textView).A00 = true;
                }
                if (str3.length() == 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setLines(2);
                    textView.setText(str3);
                }
                ViewOnClickListenerC31591DuJ.A00(c31985E3n.A01, 12, c31985E3n, hashtag);
                HashtagFollowButton hashtagFollowButton = c31985E3n.A06;
                hashtagFollowButton.setVisibility(0);
                hashtagFollowButton.A01(interfaceC11380iw2, new C70930WkZ(c31985E3n, 0), hashtag);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (obj instanceof User) {
            C31443Drn c31443Drn = this.A0E;
            if (c31443Drn != null) {
                C31363DqS c31363DqS = this.A04;
                User user5 = (User) obj;
                C14360o3.A0B(user5, 1);
                List list = c31363DqS.A00;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj4 = list.get(i3);
                        if ((obj4 instanceof User) && C14360o3.A0K(user5.getId(), ((User) obj4).getId())) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                C63622uj c63622uj = c31443Drn.A01;
                if (C14360o3.A0K(c63622uj.A00(user5.getId()), C59062n7.A07)) {
                    AbstractC31176DnK.A1V(c31443Drn.A02, C59062n7.A00(AbstractC166987dD.A1L(c31363DqS, user5), Integer.valueOf(i3), user5.getId()), c63622uj, user5.getId());
                }
                c31443Drn.A00.A05(AbstractC31171DnF.A06(c3oo), c63622uj.A00(user5.getId()));
            }
            c31441Drl = (C31441Drl) c3oo;
            user = this.A0B;
            user2 = (User) obj;
        } else if (obj instanceof FOC) {
            c31441Drl = (C31441Drl) c3oo;
            user = this.A0B;
            user2 = ((FOC) obj).A02;
            if (user2 == null) {
                throw AbstractC166997dE.A0g();
            }
        } else {
            if (obj instanceof C47O) {
                C31443Drn c31443Drn2 = this.A0E;
                if (c31443Drn2 != null) {
                    C31363DqS c31363DqS2 = this.A04;
                    C47O c47o = (C47O) obj;
                    C14360o3.A0B(c47o, 1);
                    if (c31443Drn2.A04) {
                        List list2 = c31363DqS2.A00;
                        int size2 = list2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size2) {
                                Object obj5 = list2.get(i4);
                                if ((obj5 instanceof C47O) && C14360o3.A0K(c47o.getId(), ((C47O) obj5).getId())) {
                                    break;
                                } else {
                                    i4++;
                                }
                            } else {
                                i4 = -1;
                                break;
                            }
                        }
                        C63622uj c63622uj2 = c31443Drn2.A01;
                        if (C14360o3.A0K(c63622uj2.A00(c47o.getId()), C59062n7.A07)) {
                            AbstractC31176DnK.A1V(c31443Drn2.A03, C59062n7.A00(AbstractC166987dD.A1L(c31363DqS2, c47o), Integer.valueOf(i4), c47o.getId()), c63622uj2, c47o.getId());
                        }
                    }
                    c31443Drn2.A00.A05(AbstractC31171DnF.A06(c3oo), c31443Drn2.A01.A00(c47o.getId()));
                }
                C47O c47o2 = (C47O) obj;
                ((C31441Drl) c3oo).A00(this.A07, this.A01, this.A0B, c47o2.A03, c47o2.A05);
                return;
            }
            if (obj != null && (cls = obj.getClass()) != null) {
                str = cls.getCanonicalName();
            } else {
                str = null;
            }
            throw AbstractC31175DnJ.A0V("viewType invalid and unrecognized: ", str);
        }
        InterfaceC11380iw interfaceC11380iw3 = this.A07;
        C19260xA c19260xA = this.A01;
        C14360o3.A0B(user2, 1);
        c31441Drl.A00(interfaceC11380iw3, c19260xA, user, user2, null);
    }

    public C31440Drk(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C31443Drn c31443Drn, User user, Runnable runnable) {
        this.A05 = context;
        this.A08 = userSession;
        this.A0B = user;
        this.A06 = fragmentActivity;
        this.A07 = interfaceC11380iw;
        this.A0C = runnable;
        this.A0E = c31443Drn;
        if (fragmentActivity != null) {
            this.A0A = new C38E(interfaceC11380iw, userSession, new C31479DsO(context, fragmentActivity));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1481282531);
        int size = this.A04.A00.size();
        C0f9.A0A(1701536777, A03);
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r5.A04.A00() == false) goto L11;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r6) {
        /*
            r5 = this;
            r0 = 943861722(0x38422fda, float:4.629777E-5)
            int r2 = X.C0f9.A03(r0)
            X.DqS r0 = r5.A04
            java.util.List r0 = r0.A00
            java.lang.Object r3 = r0.get(r6)
            boolean r0 = r3 instanceof X.C36480G7e
            r4 = 1
            r1 = 0
            if (r0 == 0) goto L1d
            r4 = 2
        L16:
            r0 = -982291749(0xffffffffc5736adb, float:-3894.6785)
            X.C0f9.A0A(r0, r2)
            return r4
        L1d:
            boolean r0 = r3 instanceof com.instagram.user.model.User
            if (r0 == 0) goto L2c
            X.DqS r0 = r5.A04
            boolean r0 = r0.A00()
            r4 = 3
            if (r0 != 0) goto L16
        L2a:
            r4 = 0
            goto L16
        L2c:
            boolean r0 = r3 instanceof X.C47O
            if (r0 != 0) goto L2a
            boolean r0 = r3 instanceof X.FOC
            if (r0 == 0) goto L65
            X.FOC r3 = (X.FOC) r3
            java.lang.Integer r3 = X.FVZ.A00(r3)
            if (r3 == 0) goto L5a
            int r0 = r3.intValue()
            if (r0 == r4) goto L2a
            if (r0 == r1) goto L16
            java.lang.String r1 = "Invalid recommendationType "
            java.lang.String r0 = X.F8P.A00(r3)
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -288190053(0xffffffffeed2919b, float:-3.258394E28)
        L56:
            X.C0f9.A0A(r0, r2)
            throw r1
        L5a:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 704529704(0x29fe4528, float:1.12918626E-13)
            goto L56
        L65:
            r0 = 33
            boolean r0 = X.C51761Mtk.A02(r3, r0)
            if (r0 == 0) goto L6f
            r4 = 4
            goto L16
        L6f:
            boolean r0 = r3 instanceof X.C34437FGb
            if (r0 == 0) goto L75
            r4 = 5
            goto L16
        L75:
            java.lang.String r1 = "FollowChainingAdapter does not currently process: "
            if (r3 == 0) goto L90
            java.lang.Class r0 = r3.getClass()
            if (r0 == 0) goto L90
            java.lang.String r0 = r0.getCanonicalName()
        L83:
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -2046926489(0xffffffff85fe6167, float:-2.3921825E-35)
            goto L56
        L90:
            r0 = 0
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31440Drk.getItemViewType(int):int");
    }
}
