package com.instagram.tagging.activity;

import X.AbstractC001800i;
import X.AbstractC06950Ym;
import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.AbstractC125325le;
import X.AbstractC12990ll;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC25230BEn;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC38048Gob;
import X.AbstractC40634Hzs;
import X.AbstractC40900I9y;
import X.AbstractC41193ILh;
import X.AbstractC41710Idg;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.AbstractC50522MSa;
import X.AbstractC50523MSb;
import X.AbstractC50524MSc;
import X.AbstractC54344O0c;
import X.AbstractC55114ObY;
import X.AbstractC55216Oef;
import X.AbstractC55225Oes;
import X.AbstractC55229Oez;
import X.AbstractC76433bn;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C08730cb;
import X.C0f9;
import X.C0fA;
import X.C0w9;
import X.C14360o3;
import X.C150956qv;
import X.C16930sl;
import X.C17060sy;
import X.C18U;
import X.C193328hC;
import X.C1GJ;
import X.C1LC;
import X.C1QI;
import X.C1XJ;
import X.C25621Ms;
import X.C25671My;
import X.C25A;
import X.C2d4;
import X.C3KD;
import X.C3LO;
import X.C3O0;
import X.C40781ul;
import X.C41451vu;
import X.C42346Ip8;
import X.C44435Jko;
import X.C47673L3g;
import X.C47Z;
import X.C4SX;
import X.C50699MZu;
import X.C50803McK;
import X.C51415MnN;
import X.C52174N7f;
import X.C52253NAt;
import X.C54480O5i;
import X.C54565O8r;
import X.C54966OSw;
import X.C55067OaN;
import X.C55136Oc4;
import X.C55702hA;
import X.C55772hI;
import X.C55942hf;
import X.C56141Ow2;
import X.C56352iT;
import X.C57012jc;
import X.C57239PbN;
import X.C6WI;
import X.C81373k7;
import X.C8PB;
import X.C92474Ce;
import X.C92524Cj;
import X.C9GR;
import X.C9I3;
import X.EnumC39584Hdu;
import X.EnumC40111tc;
import X.EnumC53230NgS;
import X.EnumC53319Nhv;
import X.GYN;
import X.I6K;
import X.IQU;
import X.InterfaceC02590Ai;
import X.InterfaceC09390do;
import X.InterfaceC30955DjC;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC57880Plk;
import X.InterfaceC57881Pll;
import X.InterfaceC58080Pp5;
import X.InterfaceC58084Pp9;
import X.InterfaceC58159PqO;
import X.InterfaceC58305Psx;
import X.InterfaceC58306Psy;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.MSW;
import X.MSX;
import X.MSY;
import X.MSZ;
import X.NX4;
import X.NX5;
import X.NX7;
import X.NYA;
import X.NYB;
import X.O2Z;
import X.OGb;
import X.OUL;
import X.OWJ;
import X.OXN;
import X.Ok3;
import X.P2M;
import X.PHA;
import X.PHM;
import X.ViewOnClickListenerC55455Ok9;
import X.ViewOnClickListenerC55465OkK;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.model.shopping.ProductTag;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.SourceType;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.widget.PhotoScrollView;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class TaggingActivity extends IgFragmentActivity implements InterfaceC60442pS, C2d4, InterfaceC58159PqO, InterfaceC60122ou, InterfaceC58306Psy, InterfaceC58084Pp9, GYN, InterfaceC58080Pp5, InterfaceC58305Psx, InterfaceC30955DjC, InterfaceC57880Plk, InterfaceC57881Pll {
    public int A00;
    public View A01;
    public InterfaceC56362iU A02;
    public InterfaceC41501vz A03;
    public InterfaceC41501vz A04;
    public ReboundViewPager A05;
    public C50699MZu A06;
    public C9I3 A07;
    public IgSegmentedTabLayout A08;
    public C44435Jko A09;
    public C44435Jko A0A;
    public C3O0 A0B;
    public C54565O8r A0C;
    public OXN A0D;
    public ProductCollectionFeedTaggingMeta A0E;
    public C55136Oc4 A0F;
    public NX7 A0G;
    public OUL A0H;
    public EnumC53319Nhv A0I;
    public PhotoScrollView A0J;
    public Integer A0K;
    public String A0L;
    public String A0M;
    public ArrayList A0N;
    public List A0O;
    public List A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public View A0W;
    public TextView A0X;
    public C56352iT A0Y;
    public InterfaceC41501vz A0Z;
    public InterfaceC41501vz A0a;
    public C92474Ce A0b;
    public C52253NAt A0c;
    public C50803McK A0d;
    public PHA A0e;
    public AbstractC41193ILh A0f;
    public String A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public final InterfaceC09390do A0o = AbstractC09440dt.A01(new C57239PbN(this, 6));
    public final Map A0m = AbstractC166987dD.A1I();
    public final Set A0n = AbstractC166987dD.A1H();

    private final void A09() {
        String str;
        if (CLc()) {
            Elk();
            return;
        }
        C55136Oc4 c55136Oc4 = this.A0F;
        if (c55136Oc4 == null) {
            str = "helpTextController";
        } else {
            c55136Oc4.A0D.setVisibility(8);
            ListView listView = c55136Oc4.A02;
            if (listView != null) {
                listView.setVisibility(8);
            }
            A0B(this);
            TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) this.A0m.get(A0X());
            if (tagsInteractiveLayout != null) {
                C52174N7f.A0M.A00(this, AbstractC166987dD.A0r(this.A0o), tagsInteractiveLayout, this.A0g, BcJ(), true);
                tagsInteractiveLayout.A08(new PointF(0.5f, 0.5f));
                return;
            }
            PHA pha = this.A0e;
            if (pha == null) {
                str = "tagSearchController";
            } else {
                String str2 = this.A0g;
                C52174N7f.A0M.A00(this, pha.A00, pha, str2, AbstractC166987dD.A1F(pha.A01.BcJ()), true);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A0A(TaggingActivity taggingActivity) {
        C92474Ce c92474Ce;
        View view = taggingActivity.A01;
        if (view != null) {
            if (taggingActivity.A0b == null) {
                taggingActivity.A0b = new C92474Ce(AbstractC166987dD.A0O(taggingActivity), AbstractC166987dD.A0r(taggingActivity.A0o), new P2M(), taggingActivity, false);
            }
            C81373k7 c81373k7 = (C81373k7) view.getTag();
            if (c81373k7 != null && (c92474Ce = taggingActivity.A0b) != null) {
                ViewGroup viewGroup = c81373k7.A0J;
                viewGroup.setVisibility(0);
                ColorFilterAlphaImageView colorFilterAlphaImageView = c81373k7.A0P;
                colorFilterAlphaImageView.setVisibility(0);
                c81373k7.A0O.setVisibility(8);
                TextView textView = c81373k7.A01;
                textView.setText(AbstractC166997dE.A0p(c92474Ce.A00, 2131976886));
                C92524Cj c92524Cj = c81373k7.A0S;
                colorFilterAlphaImageView.setNormalColor(c92524Cj.A03);
                textView.setTextColor(c92524Cj.A09);
                viewGroup.setBackgroundColor(c92524Cj.A01);
                c81373k7.A0H.setBackgroundColor(c92524Cj.A04);
                c81373k7.A0Q.A01().setVisibility(8);
                c81373k7.A06.setVisibility(8);
                viewGroup.setClickable(false);
            }
        }
    }

    public static final void A0E(TaggingActivity taggingActivity) {
        String str;
        String str2;
        if (taggingActivity.A0V) {
            List list = taggingActivity.A0P;
            if (list != null) {
                if (list.isEmpty()) {
                    List list2 = taggingActivity.A0O;
                    if (list2 != null) {
                        if (list2.isEmpty()) {
                            return;
                        }
                    }
                    str = "mentionedSellerIds";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A0I(taggingActivity);
                InterfaceC09390do interfaceC09390do = taggingActivity.A0o;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                ArrayList arrayList = taggingActivity.A0N;
                if (arrayList == null) {
                    str = "mediaTaggingInfos";
                } else {
                    ArrayList A12 = AbstractC166997dE.A12(A0r, 0);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) it.next();
                        C14360o3.A0B(mediaTaggingInfo, 1);
                        C47Z A03 = C25A.A00(A0r).A03(mediaTaggingInfo.A06);
                        if (A03 != null && A03.A0p() && (str2 = A03.A33) != null) {
                            A12.add(str2);
                        }
                    }
                    ArrayList A05 = AbstractC55229Oez.A05(A12);
                    C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                    List list3 = taggingActivity.A0O;
                    if (list3 != null) {
                        List list4 = taggingActivity.A0P;
                        if (list4 != null) {
                            ArrayList A1F = AbstractC166987dD.A1F(list4);
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                MSZ.A1P(it2.next(), A1F);
                            }
                            ArrayList A1F2 = AbstractC166987dD.A1F(A1F);
                            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                            String str3 = taggingActivity.A0L;
                            if (str3 == null) {
                                str = "_shoppingCreationSessionId";
                            } else {
                                new C55067OaN(taggingActivity, A0r2, str3, "feed", A05, A1F2).A01();
                                return;
                            }
                        }
                    }
                    str = "mentionedSellerIds";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            str = "taggedSellerIds";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A0F(TaggingActivity taggingActivity) {
        String str;
        String str2;
        if (A0W(taggingActivity, taggingActivity.A00)) {
            UserSession A0r = AbstractC166987dD.A0r(taggingActivity.A0o);
            String str3 = taggingActivity.A0L;
            if (str3 == null) {
                str2 = "_shoppingCreationSessionId";
            } else {
                boolean z = !A0U(taggingActivity);
                ArrayList arrayList = taggingActivity.A0N;
                if (arrayList == null) {
                    str2 = "mediaTaggingInfos";
                } else {
                    int i = taggingActivity.A00;
                    List list = MSW.A0t(arrayList, i).A0D;
                    if (list == null) {
                        list = C16930sl.A00;
                    }
                    C51415MnN A02 = A02(taggingActivity);
                    if (A0S(taggingActivity)) {
                        str = "opt";
                    } else {
                        str = "seller";
                    }
                    C14360o3.A0B(A0r, 0);
                    HashMap A04 = AbstractC55216Oef.A04(list);
                    long j = 0;
                    long A05 = AbstractC50523MSb.A05(AbstractC31171DnF.A0W("high_confidence_count", A04));
                    long A052 = AbstractC50523MSb.A05(AbstractC31171DnF.A0W("medium_confidence_count", A04));
                    Number A0W = AbstractC31171DnF.A0W("low_confidence_count", A04);
                    if (A0W != null) {
                        j = A0W.intValue();
                    }
                    InterfaceC02590Ai A01 = AbstractC55216Oef.A01(AbstractC12220kQ.A01(taggingActivity, A0r), A0r, "ig_suggested_tags_view_tags", str3);
                    AbstractC50522MSa.A1D(A01, AbstractC50523MSb.A0T(A01, A0r, str3));
                    A01.AAP("user_tag_type", str);
                    MSY.A18(A01, z);
                    A01.A9K("high_confidence_suggestions_count", Long.valueOf(A05));
                    AbstractC50523MSb.A0v(A01, A052, j);
                    A01.AAQ(A02, "suggested_tags_info");
                    AbstractC25230BEn.A1C(A01, i);
                    A01.AAP("media_format", "feed");
                    A01.Cht();
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    public static final boolean A0S(TaggingActivity taggingActivity) {
        InterfaceC09390do interfaceC09390do = taggingActivity.A0o;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        ArrayList BcJ = taggingActivity.BcJ();
        AbstractC167007dF.A1K(A0r, BcJ);
        if ((AbstractC55229Oez.A0M(BcJ) && AbstractC55229Oez.A0J(A0r, false)) || AbstractC55229Oez.A0K(AbstractC166987dD.A0r(interfaceC09390do), false)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[SYNTHETIC] */
    @Override // X.InterfaceC58159PqO, X.InterfaceC58306Psy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A89(com.instagram.user.model.User r10) {
        /*
            r9 = this;
            r5 = 0
            java.util.ArrayList r0 = r9.A0N
            r4 = 0
            if (r0 != 0) goto L10
            java.lang.String r0 = "mediaTaggingInfos"
        L8:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L10:
            java.util.Iterator r8 = X.AbstractC166997dE.A13(r0)
        L14:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r7 = X.AbstractC166997dE.A0l(r8)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r7 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r7
            boolean r0 = r9.A0R
            if (r0 != 0) goto L39
            X.0do r0 = r9.A0o
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r0)
            X.0Tz r2 = X.AbstractC25225BEi.A0j(r3, r5)
            r0 = 36324277885153350(0x810cbd00113046, double:3.0349578284733304E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L58
        L39:
            java.util.ArrayList r0 = r7.A0B
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L43:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L51
            java.lang.String r0 = X.MSZ.A0v(r1)
            r2.add(r0)
            goto L43
        L51:
            boolean r0 = X.AbstractC31175DnJ.A1X(r10, r2)
            if (r0 != 0) goto L58
            goto L14
        L58:
            X.0do r0 = r9.A0o
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            boolean r0 = r9.A0S
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AbstractC55229Oez.A0F(r4, r1, r0)
            java.lang.String r6 = r10.getId()
            if (r0 == 0) goto La0
            java.util.ArrayList r0 = r7.A0E
            r0.add(r5, r6)
            java.util.ArrayList r3 = r7.A0B
            java.util.Iterator r1 = X.AbstractC166997dE.A13(r3)
        L79:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r2 = X.AbstractC166997dE.A0l(r1)
            com.instagram.tagging.model.Tag r2 = (com.instagram.tagging.model.Tag) r2
            java.lang.String r0 = r2.getId()
            boolean r0 = X.C14360o3.A0K(r0, r6)
            if (r0 == 0) goto L79
            r3.remove(r2)
            r3.add(r2)
            java.util.ArrayList r1 = r7.A09
            java.lang.String r0 = r2.getId()
            r1.add(r0)
            goto L14
        La0:
            r7.A05 = r6
            java.util.ArrayList r3 = r7.A0B
            java.util.Iterator r2 = X.AbstractC166997dE.A13(r3)
        La8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r1 = X.AbstractC166997dE.A0l(r2)
            com.instagram.tagging.model.Tag r1 = (com.instagram.tagging.model.Tag) r1
            java.lang.String r0 = r1.getId()
            boolean r0 = X.C14360o3.A0K(r0, r6)
            if (r0 == 0) goto La8
            r3.remove(r1)
            r3.add(r5, r1)
            goto L14
        Lc6:
            X.MZu r4 = r9.A06
            if (r4 != 0) goto Lce
            java.lang.String r0 = "creationLogger"
            goto L8
        Lce:
            java.lang.String r3 = r4.A02
            if (r3 == 0) goto Le1
            com.instagram.common.session.UserSession r0 = r4.A05
            X.22C r0 = X.AnonymousClass229.A01(r0)
            X.24q r2 = r0.A0E
            java.lang.String r1 = "ig_creation_client_events"
            X.22P r0 = r4.A00
            r2.A0R(r0, r3, r1)
        Le1:
            A0H(r9)
            A0D(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A89(com.instagram.user.model.User):void");
    }

    @Override // X.InterfaceC58159PqO
    public final boolean Cow(TagsInteractiveLayout tagsInteractiveLayout, ArrayList arrayList, ArrayList arrayList2) {
        OGb oGb;
        UserSession A0r;
        TagsInteractiveLayout tagsInteractiveLayout2;
        String str;
        ArrayList arrayList3;
        boolean z;
        String str2;
        SourceType sourceType;
        int intValue;
        List list;
        String str3;
        long j;
        C4SX A00;
        Long A0j;
        int A06 = AbstractC167007dF.A06(1, arrayList, arrayList2);
        EnumC53319Nhv enumC53319Nhv = this.A0I;
        String str4 = null;
        if (enumC53319Nhv == null) {
            str2 = "tagType";
        } else {
            int ordinal = enumC53319Nhv.ordinal();
            if (ordinal != 1) {
                if (ordinal == A06) {
                    Integer num = this.A0K;
                    if (num == null || ((intValue = num.intValue()) != 3 && intValue != 4 && intValue != A06)) {
                        C6WI.A01().A0V = true;
                        this.A0m.put(A0X(), tagsInteractiveLayout);
                        A06();
                        String moduleName = getModuleName();
                        Integer num2 = C05F.A01;
                        EnumC39584Hdu enumC39584Hdu = EnumC39584Hdu.A06;
                        String str5 = this.A0L;
                        if (str5 != null) {
                            ArrayList arrayList4 = null;
                            String str6 = null;
                            String str7 = null;
                            AbstractC167007dF.A1E(num2, A06, enumC39584Hdu);
                            C16930sl c16930sl = C16930sl.A00;
                            ShoppingTaggingFeedClientState shoppingTaggingFeedClientState = new ShoppingTaggingFeedClientState(c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl);
                            String A0X = A0X();
                            AbstractC41710Idg.A03(shoppingTaggingFeedClientState, arrayList2, Ab2());
                            ArrayList arrayList5 = this.A0N;
                            if (arrayList5 == null) {
                                AbstractC50522MSa.A0t();
                                throw C00O.createAndThrow();
                            }
                            List list2 = AbstractC50523MSb.A0J(this, arrayList5).A0G;
                            if (list2 != null) {
                                List A0W = AbstractC001800i.A0W(AbstractC001800i.A0X(list2));
                                C14360o3.A0B(A0W, 0);
                                shoppingTaggingFeedClientState.A00 = A0W;
                            }
                            ArrayList A1E = AbstractC166987dD.A1E();
                            ArrayList arrayList6 = this.A0N;
                            if (arrayList6 != null) {
                                Iterator A13 = AbstractC166997dE.A13(arrayList6);
                                while (A13.hasNext()) {
                                    Iterator it = ((MediaTaggingInfo) AbstractC166997dE.A0l(A13)).A0F.iterator();
                                    while (it.hasNext()) {
                                        AbstractC50522MSa.A1Z(A1E, it);
                                    }
                                }
                                List A0W2 = AbstractC001800i.A0W(AbstractC06950Ym.A1F(AbstractC16960so.A1Q(shoppingTaggingFeedClientState.A06, A1E)));
                                C14360o3.A0B(A0W2, 0);
                                shoppingTaggingFeedClientState.A06 = A0W2;
                                ArrayList A05 = A05();
                                C14360o3.A0B(A05, 0);
                                shoppingTaggingFeedClientState.A02 = A05;
                                boolean A0S = A0S(this);
                                TaggingFeedMultiSelectState A052 = AbstractC54344O0c.A00.A05(this.A0E, arrayList2);
                                AbstractC50524MSc.A0K(shoppingTaggingFeedClientState, AbstractC50524MSc.A0A(shoppingTaggingFeedClientState, A052));
                                InterfaceC09390do interfaceC09390do = this.A0o;
                                if (C18U.A06(C06090Tz.A06, AbstractC166987dD.A0r(interfaceC09390do), 36318037296551780L)) {
                                    List list3 = this.A0O;
                                    if (list3 == null) {
                                        str2 = "mentionedSellerIds";
                                    } else {
                                        shoppingTaggingFeedClientState.A01 = list3;
                                    }
                                }
                                if (A05().isEmpty()) {
                                    LinkedHashSet A0l = AbstractC31171DnF.A0l();
                                    ArrayList arrayList7 = this.A0N;
                                    if (arrayList7 != null) {
                                        ArrayList arrayList8 = AbstractC50523MSb.A0K(this, arrayList7).A0D;
                                        if (arrayList8 != null) {
                                            Iterator it2 = arrayList8.iterator();
                                            while (it2.hasNext()) {
                                                C1LC A0I = AbstractC43592JPx.A0I(ImmutableList.copyOf((Collection) ((MediaSuggestedProductTag) it2.next()).A02));
                                                while (A0I.hasNext()) {
                                                    A0l.add(AbstractC38048Gob.A01(((MediaSuggestedProductTagProductItemContainer) A0I.next()).A01).A0H);
                                                }
                                            }
                                        }
                                        arrayList4 = AbstractC166987dD.A1F(A0l);
                                    }
                                }
                                ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = this.A0E;
                                if (productCollectionFeedTaggingMeta != null) {
                                    if (!productCollectionFeedTaggingMeta.A05) {
                                        if (productCollectionFeedTaggingMeta.A00 == ProductCollectionV2Type.A05) {
                                            sourceType = SourceType.A0C;
                                        } else {
                                            sourceType = SourceType.A0B;
                                        }
                                        str7 = sourceType.toString();
                                        str6 = productCollectionFeedTaggingMeta.A01;
                                    }
                                    AbstractC50524MSc.A0K(shoppingTaggingFeedClientState, productCollectionFeedTaggingMeta.A01);
                                }
                                ShoppingTaggingFeedArguments A01 = AbstractC41710Idg.A01(null, enumC39584Hdu, shoppingTaggingFeedClientState, A052, num2, null, null, null, moduleName, str6, str7, A0X, str5, arrayList4, A0S);
                                C42346Ip8 A002 = I6K.A00(AbstractC166987dD.A0r(interfaceC09390do));
                                String str8 = this.A0L;
                                if (str8 != null) {
                                    A002.A05(str8, getModuleName(), C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do)).A1u(), "feed");
                                    C1XJ.A00.A0j(null, this, this, AbstractC166987dD.A0r(interfaceC09390do), A01, null, false, false);
                                    return true;
                                }
                            }
                            str2 = "mediaTaggingInfos";
                        }
                        str2 = "_shoppingCreationSessionId";
                    } else {
                        List A0h = AbstractC31175DnJ.A0h(A0X(), "_");
                        if (!A0h.isEmpty()) {
                            ListIterator A14 = AbstractC43592JPx.A14(A0h);
                            while (A14.hasPrevious()) {
                                if (AbstractC31176DnK.A02(A14) != 0) {
                                    list = AbstractC31177DnL.A0k(A0h, A14);
                                    break;
                                }
                            }
                        }
                        list = C16930sl.A00;
                        String[] A1b = AbstractC31173DnH.A1b(list, 0);
                        UserSession A0r2 = AbstractC166987dD.A0r(this.A0o);
                        String str9 = A1b[0];
                        Integer num3 = this.A0K;
                        if (num3 != null) {
                            str3 = AbstractC40900I9y.A00(num3);
                        } else {
                            str3 = null;
                        }
                        if (A1b.length > 1) {
                            str4 = A1b[1];
                        }
                        C14360o3.A0B(A0r2, 1);
                        if (str9 != null && (A0j = AbstractC166997dE.A0j(str9)) != null) {
                            j = A0j.longValue();
                        } else {
                            j = -1;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str4 != null) {
                            A00 = C4SX.A00(str4);
                        } else {
                            A00 = C4SX.A00("-1");
                        }
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, A0r2), "instagram_shopping_commerce_media_untagging_interaction");
                        if (A0f.isSampled()) {
                            A0f.A9K("ig_media_id", Long.valueOf(j));
                            AbstractC50523MSb.A0u(A00, A0f, "product_tags_edit_blocked", str3);
                            return false;
                        }
                    }
                }
                return false;
            }
            if (A0T(this)) {
                C50699MZu c50699MZu = this.A06;
                if (c50699MZu == null) {
                    str2 = "creationLogger";
                } else {
                    c50699MZu.A0D(getModuleName());
                    if (AbstractC55229Oez.A0L(this)) {
                        AbstractC55114ObY.A01(this, C52().size());
                        return false;
                    }
                    oGb = C52174N7f.A0M;
                    A0r = AbstractC166987dD.A0r(this.A0o);
                    tagsInteractiveLayout2 = tagsInteractiveLayout;
                    str = this.A0g;
                    arrayList3 = arrayList;
                    z = true;
                }
            } else {
                if (A0S(this)) {
                    tagsInteractiveLayout.A06();
                }
                oGb = C52174N7f.A0M;
                A0r = AbstractC166987dD.A0r(this.A0o);
                tagsInteractiveLayout2 = tagsInteractiveLayout;
                str = this.A0g;
                arrayList3 = arrayList;
                z = false;
            }
            oGb.A00(this, A0r, tagsInteractiveLayout2, str, arrayList3, z);
            return true;
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58080Pp5
    public final void CvY() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        this.A02 = interfaceC56362iU;
        interfaceC56362iU.Efu(A01(this.A0V));
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_check_pano_outline_24;
        A0B.A0P = true;
        A0B.A02 = C1QI.A04(AbstractC166987dD.A0O(this));
        A0B.A05 = 2131961124;
        MSX.A12(AbstractC31177DnL.A0F(new Ok3(this, 62), A0B, interfaceC56362iU), 8);
        AbstractC31176DnK.A1C(new Ok3(this, 61), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        ArrayList<? extends Parcelable> arrayList = this.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        bundle.putParcelableArrayList("media_tagging_info_list", arrayList);
    }

    public static final int A00(TaggingActivity taggingActivity) {
        String str;
        int size;
        int size2;
        EnumC53319Nhv enumC53319Nhv = taggingActivity.A0I;
        if (enumC53319Nhv == null) {
            str = "tagType";
        } else {
            int ordinal = enumC53319Nhv.ordinal();
            str = "mediaTaggingInfos";
            if (ordinal != 1) {
                if (ordinal == 2) {
                    boolean A0W = A0W(taggingActivity, taggingActivity.A00);
                    ArrayList arrayList = taggingActivity.A0N;
                    if (A0W) {
                        if (arrayList != null) {
                            int i = taggingActivity.A00;
                            size = MSW.A0t(arrayList, i).A0C.size();
                            ArrayList arrayList2 = taggingActivity.A0N;
                            if (arrayList2 != null) {
                                size2 = 0;
                                Iterator A13 = AbstractC166997dE.A13(MSW.A0t(arrayList2, i).A0D);
                                while (A13.hasNext()) {
                                    int i2 = 0;
                                    if (((MediaSuggestedProductTag) AbstractC166997dE.A0l(A13)).A01 == EnumC53230NgS.A04) {
                                        i2 = 1;
                                    }
                                    size2 += i2;
                                }
                                return size + size2;
                            }
                        }
                    } else if (arrayList != null) {
                        return AbstractC50523MSb.A0J(taggingActivity, arrayList).A0C.size();
                    }
                } else {
                    throw AbstractC166987dD.A1D("Unsupported tag type");
                }
            } else {
                ArrayList BcJ = taggingActivity.BcJ();
                ArrayList A04 = taggingActivity.A04();
                if (A0T(taggingActivity)) {
                    size = A04.size();
                } else {
                    boolean z = taggingActivity.A0T;
                    size = BcJ.size();
                    if (!z) {
                        size -= A04.size();
                    }
                }
                OWJ owj = OWJ.A00;
                UserSession A0r = AbstractC166987dD.A0r(taggingActivity.A0o);
                ArrayList arrayList3 = taggingActivity.A0N;
                if (arrayList3 == null) {
                    AbstractC50522MSa.A0t();
                } else if (owj.A01(A0r, AbstractC50523MSb.A0J(taggingActivity, arrayList3).A07, false)) {
                    ArrayList arrayList4 = taggingActivity.A0N;
                    if (arrayList4 != null) {
                        int i3 = taggingActivity.A00;
                        if (!MSW.A0t(arrayList4, i3).A0A.isEmpty() && taggingActivity.A0U) {
                            size2 = MSW.A0t(arrayList4, i3).A0A.size();
                            return size + size2;
                        }
                        return size;
                    }
                } else {
                    return size;
                }
            }
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final int A01(boolean z) {
        if (z) {
            return 2131970050;
        }
        EnumC53319Nhv enumC53319Nhv = this.A0I;
        if (enumC53319Nhv == null) {
            C14360o3.A0F("tagType");
            throw C00O.createAndThrow();
        }
        int ordinal = enumC53319Nhv.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                C0w9.A03("TaggingActivity", "Unsupported tag type");
                return 0;
            }
            return 2131970046;
        }
        if (!A0T(this)) {
            return 2131969519;
        }
        return 2131952292;
    }

    public static final C51415MnN A02(TaggingActivity taggingActivity) {
        String str;
        C56141Ow2 A00 = C56141Ow2.A04.A00(AbstractC166987dD.A0r(taggingActivity.A0o));
        String str2 = taggingActivity.A0L;
        if (str2 == null) {
            str = "_shoppingCreationSessionId";
        } else {
            ArrayList arrayList = taggingActivity.A0N;
            if (arrayList == null) {
                str = "mediaTaggingInfos";
            } else {
                return A00.A00(str2, AbstractC50523MSb.A0J(taggingActivity, arrayList).A06);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final UserSession A03(TaggingActivity taggingActivity) {
        return AbstractC166987dD.A0r(taggingActivity.A0o);
    }

    private final void A06() {
        if (this.A0Z == null) {
            this.A0Z = new NX4(this);
        }
        if (this.A0a == null) {
            this.A0a = new NX5(this);
        }
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0o));
        InterfaceC41501vz interfaceC41501vz = this.A0Z;
        if (interfaceC41501vz != null) {
            A00.A01(interfaceC41501vz, NYB.class);
            InterfaceC41501vz interfaceC41501vz2 = this.A0a;
            if (interfaceC41501vz2 != null) {
                A00.A01(interfaceC41501vz2, NYA.class);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A0B(TaggingActivity taggingActivity) {
        IgSegmentedTabLayout igSegmentedTabLayout = taggingActivity.A08;
        if (igSegmentedTabLayout != null) {
            igSegmentedTabLayout.setVisibility(8);
            PhotoScrollView photoScrollView = taggingActivity.A0J;
            if (photoScrollView != null) {
                AbstractC13880nE.A0U(photoScrollView, 0);
            }
        }
        View view = taggingActivity.A0W;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
    
        if (r4 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0C(com.instagram.tagging.activity.TaggingActivity r31) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0C(com.instagram.tagging.activity.TaggingActivity):void");
    }

    public static final void A0D(TaggingActivity taggingActivity) {
        String str;
        C55136Oc4 c55136Oc4;
        EnumC40111tc enumC40111tc;
        EnumC53319Nhv enumC53319Nhv;
        ArrayList arrayList = taggingActivity.A0N;
        if (arrayList == null) {
            str = "mediaTaggingInfos";
        } else {
            MediaTaggingInfo A0K = AbstractC50523MSb.A0K(taggingActivity, arrayList);
            int A00 = A00(taggingActivity);
            EnumC53319Nhv enumC53319Nhv2 = taggingActivity.A0I;
            if (enumC53319Nhv2 == null) {
                str = "tagType";
            } else {
                int ordinal = enumC53319Nhv2.ordinal();
                str = "helpTextController";
                boolean z = false;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        TextView textView = taggingActivity.A0X;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                        c55136Oc4 = taggingActivity.A0F;
                        if (c55136Oc4 != null) {
                            enumC40111tc = A0K.A03;
                            if (taggingActivity.A0E != null) {
                                z = true;
                            }
                            enumC53319Nhv = EnumC53319Nhv.A08;
                            C55136Oc4.A00(enumC40111tc, c55136Oc4, enumC53319Nhv, A00, z);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    TextView textView2 = taggingActivity.A0X;
                    if (taggingActivity.A0U && !taggingActivity.A0T && AbstractC25226BEj.A1b(taggingActivity.A04())) {
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        }
                    } else if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    c55136Oc4 = taggingActivity.A0F;
                    if (c55136Oc4 != null) {
                        enumC40111tc = A0K.A03;
                        enumC53319Nhv = EnumC53319Nhv.A07;
                        C55136Oc4.A00(enumC40111tc, c55136Oc4, enumC53319Nhv, A00, z);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A0G(TaggingActivity taggingActivity) {
        View A0D;
        ArrayList arrayList = taggingActivity.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        if (AbstractC50523MSb.A0J(taggingActivity, arrayList).A03 == EnumC40111tc.A0a) {
            ReboundViewPager reboundViewPager = taggingActivity.A05;
            if (reboundViewPager != null && (A0D = reboundViewPager.A0D(taggingActivity.A00)) != null) {
                taggingActivity.A0f = (AbstractC41193ILh) A0D.getTag();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r11.A0T == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0H(com.instagram.tagging.activity.TaggingActivity r11) {
        /*
            android.view.View r8 = r11.A0W
            if (r8 == 0) goto Lcb
            X.0do r4 = r11.A0o
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r4)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.C25A.A00(r0)
            java.lang.String r0 = r11.A0X()
            X.47Z r0 = r1.A03(r0)
            r2 = 0
            if (r0 == 0) goto L32
            X.H2v r0 = r0.A0v
            if (r0 == 0) goto L32
            java.lang.Integer r0 = r0.A00
        L1f:
            r5 = 0
            boolean r3 = X.AbstractC167007dF.A1W(r0)
            X.Nhv r1 = r11.A0I
            if (r1 != 0) goto L34
            java.lang.String r0 = "tagType"
        L2a:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L32:
            r0 = r2
            goto L1f
        L34:
            X.Nhv r0 = X.EnumC53319Nhv.A07
            if (r1 != r0) goto Ld5
            if (r3 != 0) goto Ld5
            boolean r0 = A0T(r11)
            if (r0 != 0) goto L45
            boolean r0 = r11.A0T
            r10 = 0
            if (r0 != 0) goto L46
        L45:
            r10 = 1
        L46:
            r8.setVisibility(r5)
            r0 = 2131427739(0x7f0b019b, float:1.8477103E38)
            r8.findViewById(r0)
            r0 = 2131435059(0x7f0b1e33, float:1.849195E38)
            android.widget.TextView r7 = X.AbstractC166987dD.A0e(r8, r0)
            r0 = 2131427740(0x7f0b019c, float:1.8477105E38)
            android.view.View r9 = r8.findViewById(r0)
            r0 = 2131435060(0x7f0b1e34, float:1.8491952E38)
            android.view.View r6 = r8.findViewById(r0)
            java.util.ArrayList r3 = r11.A0N
            java.lang.String r0 = "mediaTaggingInfos"
            if (r3 == 0) goto L2a
            int r1 = r11.A00
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.MSW.A0t(r3, r1)
            java.lang.String r0 = r0.A05
            if (r0 != 0) goto L84
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r0 = X.MSW.A0t(r3, r1)
            java.util.ArrayList r0 = r0.A0E
            java.util.ArrayList r0 = X.AbstractC166987dD.A1F(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L85
        L84:
            r5 = 1
        L85:
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r4)
            boolean r0 = r11.A0S
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r4 = X.AbstractC55229Oez.A0F(r2, r1, r0)
            r0 = r10 ^ 1
            if (r6 == 0) goto Lcb
            if (r9 == 0) goto Lcb
            android.content.Context r3 = r6.getContext()
            r2 = 17
            r10 = 8
            r9.setVisibility(r10)
            r1 = 0
            if (r0 == 0) goto Ld8
            r7.getClass()
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.gravity = r2
            if (r4 == 0) goto Lcc
            r0 = 2131952291(0x7f1302a3, float:1.954102E38)
        Lb7:
            r7.setText(r0)
            X.AbstractC166997dE.A18(r3, r7, r0)
            r0 = 59
            X.Ok3.A00(r6, r0, r11)
            X.C1QI.A0H(r6, r7)
            r6.setVisibility(r1)
            r8.setVisibility(r1)
        Lcb:
            return
        Lcc:
            r0 = 2131964645(0x7f1332e5, float:1.9566077E38)
            if (r5 == 0) goto Lb7
            r0 = 2131961577(0x7f1326e9, float:1.9559855E38)
            goto Lb7
        Ld5:
            r10 = 8
            goto Ldb
        Ld8:
            r6.setVisibility(r10)
        Ldb:
            r8.setVisibility(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0H(com.instagram.tagging.activity.TaggingActivity):void");
    }

    public static final void A0I(TaggingActivity taggingActivity) {
        ArrayList arrayList = taggingActivity.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) AbstractC166997dE.A0l(A13);
            mediaTaggingInfo.A0D = AbstractC166987dD.A1E();
            TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) taggingActivity.A0m.get(mediaTaggingInfo.A06);
            if (tagsInteractiveLayout != null) {
                ArrayList arrayList2 = tagsInteractiveLayout.A0C;
                if (!arrayList2.isEmpty()) {
                    tagsInteractiveLayout.A0A(arrayList2);
                }
            }
        }
    }

    public static final void A0J(TaggingActivity taggingActivity) {
        AbstractC41193ILh abstractC41193ILh = taggingActivity.A0f;
        if (abstractC41193ILh != null) {
            ArrayList arrayList = taggingActivity.A0N;
            if (arrayList == null) {
                AbstractC50522MSa.A0t();
                throw C00O.createAndThrow();
            }
            MediaTaggingInfo A0K = AbstractC50523MSb.A0K(taggingActivity, arrayList);
            OWJ owj = OWJ.A00;
            UserSession A0r = AbstractC166987dD.A0r(taggingActivity.A0o);
            ArrayList arrayList2 = taggingActivity.A0N;
            if (arrayList2 == null) {
                AbstractC50522MSa.A0t();
                throw C00O.createAndThrow();
            }
            abstractC41193ILh.A00(AbstractC55229Oez.A02(A0K, owj.A01(A0r, AbstractC50523MSb.A0J(taggingActivity, arrayList2).A07, false)));
        }
    }

    public static final void A0K(TaggingActivity taggingActivity, Tag tag) {
        TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) taggingActivity.A0m.get(taggingActivity.A0X());
        if (tagsInteractiveLayout != null) {
            tagsInteractiveLayout.A09(tag);
        }
        A0J(taggingActivity);
        A0D(taggingActivity);
        taggingActivity.A07();
    }

    public static final void A0L(TaggingActivity taggingActivity, EnumC53319Nhv enumC53319Nhv, boolean z) {
        String str;
        ImageView imageView;
        int i;
        C44435Jko c44435Jko;
        Resources resources;
        int i2;
        if (taggingActivity.A08 != null) {
            taggingActivity.A0I = enumC53319Nhv;
            A0H(taggingActivity);
            C44435Jko c44435Jko2 = taggingActivity.A09;
            if (c44435Jko2 != null && taggingActivity.A0A != null) {
                EnumC53319Nhv enumC53319Nhv2 = taggingActivity.A0I;
                if (enumC53319Nhv2 != null) {
                    int ordinal = enumC53319Nhv2.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            AbstractC31172DnG.A1E(taggingActivity.getResources(), c44435Jko2, 2131975158);
                            c44435Jko = taggingActivity.A0A;
                            if (c44435Jko != null) {
                                resources = taggingActivity.getResources();
                                i2 = 2131975162;
                                AbstractC31172DnG.A1E(resources, c44435Jko, i2);
                            }
                        }
                    } else {
                        AbstractC31172DnG.A1E(taggingActivity.getResources(), c44435Jko2, 2131975159);
                        c44435Jko = taggingActivity.A0A;
                        if (c44435Jko != null) {
                            resources = taggingActivity.getResources();
                            i2 = 2131975161;
                            AbstractC31172DnG.A1E(resources, c44435Jko, i2);
                        }
                    }
                }
                str = "tagType";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            IgSegmentedTabLayout igSegmentedTabLayout = taggingActivity.A08;
            boolean z2 = true;
            if (igSegmentedTabLayout != null) {
                EnumC53319Nhv enumC53319Nhv3 = taggingActivity.A0I;
                if (enumC53319Nhv3 != null) {
                    int ordinal2 = enumC53319Nhv3.ordinal();
                    int i3 = 1;
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            throw AbstractC166987dD.A1D("Unsupported tag type");
                        }
                    } else {
                        i3 = 0;
                    }
                    igSegmentedTabLayout.A00(i3, true);
                }
                str = "tagType";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C55136Oc4 c55136Oc4 = taggingActivity.A0F;
            if (c55136Oc4 == null) {
                str = "helpTextController";
            } else {
                ArrayList arrayList = taggingActivity.A0N;
                if (arrayList == null) {
                    str = "mediaTaggingInfos";
                } else {
                    EnumC40111tc enumC40111tc = AbstractC50523MSb.A0J(taggingActivity, arrayList).A03;
                    EnumC53319Nhv enumC53319Nhv4 = taggingActivity.A0I;
                    str = "tagType";
                    if (enumC53319Nhv4 != null) {
                        int A00 = A00(taggingActivity);
                        if (taggingActivity.A0E == null) {
                            z2 = false;
                        }
                        c55136Oc4.A05 = enumC53319Nhv4;
                        c55136Oc4.A00 = A00;
                        C55136Oc4.A00(enumC40111tc, c55136Oc4, enumC53319Nhv4, A00, z2);
                        if (c55136Oc4.A0N) {
                            ViewStub viewStub = c55136Oc4.A0F;
                            int i4 = 8;
                            if (c55136Oc4.A05 == EnumC53319Nhv.A08) {
                                i4 = 0;
                            }
                            viewStub.setVisibility(i4);
                        }
                        C55136Oc4.A02(c55136Oc4);
                        C55136Oc4.A01(c55136Oc4);
                        NX7 nx7 = taggingActivity.A0G;
                        if (nx7 != null) {
                            EnumC53319Nhv enumC53319Nhv5 = taggingActivity.A0I;
                            if (enumC53319Nhv5 != null) {
                                nx7.A01.setEditingTagType(enumC53319Nhv5);
                            }
                        }
                        C50803McK c50803McK = taggingActivity.A0d;
                        if (c50803McK != null) {
                            EnumC53319Nhv enumC53319Nhv6 = taggingActivity.A0I;
                            if (enumC53319Nhv6 != null) {
                                c50803McK.A00 = enumC53319Nhv6;
                                C0fA.A00(c50803McK, -1751941621);
                            }
                        }
                        if (z) {
                            OUL oul = taggingActivity.A0H;
                            if (oul == null) {
                                str = "taggingTypeIndicatorController";
                            } else {
                                EnumC53319Nhv enumC53319Nhv7 = taggingActivity.A0I;
                                if (enumC53319Nhv7 != null) {
                                    int ordinal3 = enumC53319Nhv7.ordinal();
                                    if (ordinal3 != 1) {
                                        if (ordinal3 == 2) {
                                            imageView = oul.A03;
                                            i = R.drawable.product_tagging_type_indicator_icon;
                                        } else {
                                            throw AbstractC166987dD.A1D("Unsupported tag type");
                                        }
                                    } else {
                                        imageView = oul.A03;
                                        i = R.drawable.people_tagging_type_indicator_icon;
                                    }
                                    imageView.setImageResource(i);
                                    oul.A01.setVisibility(0);
                                    oul.A02.setVisibility(8);
                                    oul.A00.removeCallbacks(oul.A05);
                                    C55942hf c55942hf = C150956qv.A02;
                                    AbstractC125325le A0F = AbstractC125325le.A00(imageView).A0E(OUL.A06).A0F(true);
                                    A0F.A0U(0.9f, 1.0f, -1.0f);
                                    A0F.A0V(0.9f, 1.0f, -1.0f);
                                    A0F.A0M(0.0f, 1.0f);
                                    PHM.A00(A0F, oul, 6);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A0M(TaggingActivity taggingActivity, Product product) {
        String str = null;
        C25621Ms A0c = AbstractC167017dG.A0c(AbstractC166987dD.A0r(taggingActivity.A0o));
        A0c.A0L("commerce/products/%s/on_tag/", product.A0H);
        A0c.A0P(null, C40781ul.class, C55702hA.class, false);
        User user = product.A0B;
        if (user != null) {
            str = AbstractC76433bn.A00(user);
        }
        A0c.A0H("merchant_id", str);
        C1GJ.A03(AbstractC31172DnG.A0U(A0c, true));
    }

    public static final void A0N(TaggingActivity taggingActivity, Product product, String str) {
        Map map = taggingActivity.A0m;
        if (map.containsKey(str)) {
            TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) map.get(str);
            if (tagsInteractiveLayout != null) {
                TagsInteractiveLayout.A01(tagsInteractiveLayout, product, true);
            }
        } else if (taggingActivity.A0n.contains(str)) {
            PHA pha = taggingActivity.A0e;
            if (pha == null) {
                C14360o3.A0F("tagSearchController");
                throw C00O.createAndThrow();
            }
            InterfaceC58306Psy interfaceC58306Psy = pha.A01;
            Iterator it = interfaceC58306Psy.BhN().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (MSZ.A0v(it).equals(product.A0H)) {
                        break;
                    }
                } else {
                    interfaceC58306Psy.BhN().add(new ProductTag(product));
                    break;
                }
            }
            pha.AVh();
        }
        A0M(taggingActivity, product);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (X.C18U.A06(X.AbstractC166997dE.A0U(r3), r3, 36324277885153350L) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0O(com.instagram.tagging.activity.TaggingActivity r10, com.instagram.user.model.User r11) {
        /*
            java.util.ArrayList r0 = r10.A0N
            r4 = 0
            if (r0 != 0) goto Lf
            java.lang.String r9 = "mediaTaggingInfos"
        L7:
            X.C14360o3.A0F(r9)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lf:
            java.util.Iterator r8 = X.AbstractC166997dE.A13(r0)
        L13:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r6 = X.AbstractC166997dE.A0l(r8)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r6 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r6
            java.util.ArrayList r0 = r6.A0E
            java.util.ArrayList r0 = X.AbstractC166987dD.A1F(r0)
            boolean r0 = r0.isEmpty()
            java.lang.String r9 = "creationLogger"
            if (r0 != 0) goto L93
            java.util.ArrayList r0 = r6.A0E
            java.util.ArrayList r1 = X.AbstractC166987dD.A1F(r0)
            java.lang.String r0 = r11.getId()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L93
            java.lang.String r7 = r11.getId()
            boolean r0 = r10.A0R
            if (r0 != 0) goto L5b
            X.0do r0 = r10.A0o
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r0)
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36324277885153350(0x810cbd00113046, double:3.0349578284733304E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r5 = 0
            if (r0 == 0) goto L5c
        L5b:
            r5 = 1
        L5c:
            java.util.ArrayList r3 = r6.A0B
            java.util.Iterator r1 = X.AbstractC166997dE.A13(r3)
        L62:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r2 = X.AbstractC166997dE.A0l(r1)
            com.instagram.tagging.model.Tag r2 = (com.instagram.tagging.model.Tag) r2
            java.lang.String r0 = r2.getId()
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 == 0) goto L62
            if (r5 == 0) goto L7d
            r3.remove(r2)
        L7d:
            java.util.ArrayList r1 = r6.A09
            java.lang.String r0 = r2.getId()
            r1.remove(r0)
        L86:
            java.util.ArrayList r0 = r6.A0E
            r0.remove(r7)
            X.MZu r0 = r10.A06
            if (r0 == 0) goto L7
            r0.A05()
            goto L13
        L93:
            java.lang.String r1 = r6.A05
            if (r1 == 0) goto L13
            java.lang.String r0 = r11.getId()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L13
            r6.A05 = r4
            X.MZu r0 = r10.A06
            if (r0 == 0) goto L7
            r0.A05()
            goto L13
        Lac:
            A0H(r10)
            A0D(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0O(com.instagram.tagging.activity.TaggingActivity, com.instagram.user.model.User):void");
    }

    public static final void A0P(TaggingActivity taggingActivity, String str) {
        Map map = taggingActivity.A0m;
        if (map.containsKey(str)) {
            TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) map.get(str);
            if (tagsInteractiveLayout != null) {
                tagsInteractiveLayout.AVh();
                return;
            }
            return;
        }
        if (!taggingActivity.A0n.contains(str)) {
            return;
        }
        PHA pha = taggingActivity.A0e;
        if (pha == null) {
            C14360o3.A0F("tagSearchController");
            throw C00O.createAndThrow();
        }
        pha.AVh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.3cT, java.lang.Object] */
    public static final void A0Q(TaggingActivity taggingActivity, boolean z) {
        CharSequence A0p;
        if (taggingActivity.A01 == null) {
            View findViewById = taggingActivity.findViewById(R.id.row_feed_cta_stub);
            C14360o3.A0C(findViewById, AbstractC111324zv.A00(13));
            taggingActivity.A01 = ((ViewStub) findViewById).inflate();
        }
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = taggingActivity.A0o;
        if (c08730cb.A01(AbstractC166987dD.A0r(interfaceC09390do)).A1u()) {
            View view = taggingActivity.A01;
            if (view != null) {
                C9I3 c9i3 = taggingActivity.A07;
                C9I3 c9i32 = c9i3;
                if (c9i3 == null) {
                    C9I3 c9i33 = new C9I3(AbstractC166987dD.A0O(taggingActivity), AbstractC166987dD.A0r(interfaceC09390do), null, taggingActivity, new C54480O5i(taggingActivity), false);
                    view.setTag(c9i33.A01(AbstractC166987dD.A0O(taggingActivity), view, null, AbstractC166987dD.A0r(interfaceC09390do), new Object(), taggingActivity));
                    taggingActivity.A07 = c9i33;
                    c9i32 = c9i33;
                }
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.adapter.row.mediacta.MediaCTABarViewBinder.Holder");
                C81373k7 c81373k7 = (C81373k7) tag;
                ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = taggingActivity.A0E;
                C14360o3.A0B(c81373k7, 0);
                if (productCollectionFeedTaggingMeta != null) {
                    ViewGroup viewGroup = c81373k7.A0J;
                    viewGroup.setVisibility(0);
                    if (z) {
                        c81373k7.A0P.setVisibility(0);
                        c81373k7.A0O.setVisibility(8);
                    }
                    C92524Cj c92524Cj = c81373k7.A0S;
                    ColorFilterAlphaImageView colorFilterAlphaImageView = c81373k7.A0P;
                    int i = c92524Cj.A03;
                    colorFilterAlphaImageView.setNormalColor(i);
                    IgSimpleImageView igSimpleImageView = c81373k7.A0O;
                    igSimpleImageView.setColorFilter(i);
                    TextView textView = c81373k7.A01;
                    Context context = ((C92474Ce) c9i32).A00;
                    if (productCollectionFeedTaggingMeta.A00.ordinal() == 2) {
                        A0p = AbstractC40634Hzs.A00(context, productCollectionFeedTaggingMeta.A02, null, productCollectionFeedTaggingMeta.A03);
                    } else {
                        A0p = AbstractC166997dE.A0p(context, 2131976835);
                    }
                    textView.setText(A0p);
                    String str = productCollectionFeedTaggingMeta.A02;
                    C57012jc c57012jc = c81373k7.A0Q;
                    View A01 = c57012jc.A01();
                    if (str != null) {
                        A01.setVisibility(0);
                        IgTextView igTextView = c81373k7.A06;
                        igTextView.setVisibility(0);
                        ((TextView) c57012jc.A01()).setText("•");
                        igTextView.setText(str);
                        igTextView.setTextColor(c92524Cj.A09);
                    } else {
                        A01.setVisibility(8);
                        c81373k7.A06.setVisibility(8);
                    }
                    textView.setTextColor(c92524Cj.A09);
                    viewGroup.setBackgroundColor(c92524Cj.A01);
                    c81373k7.A0H.setBackgroundColor(c92524Cj.A04);
                    ViewOnClickListenerC55465OkK.A01(viewGroup, 29, c81373k7, c9i32);
                    ViewOnClickListenerC55455Ok9.A01(igSimpleImageView, 5, c9i32);
                } else {
                    c81373k7.A0J.setVisibility(8);
                }
            }
            if (taggingActivity.A0E == null && taggingActivity.A0R()) {
                A0A(taggingActivity);
            }
        }
    }

    public static final boolean A0T(TaggingActivity taggingActivity) {
        if (taggingActivity.A0T && !taggingActivity.A0U) {
            return true;
        }
        return false;
    }

    public static final boolean A0U(TaggingActivity taggingActivity) {
        ArrayList arrayList = taggingActivity.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC43593JPy.A1Y(arrayList.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (X.C18U.A06(r5, r2, 36312999300957793L) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (X.C18U.A06(r5, r2, 2342156008514979427L) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0V(com.instagram.tagging.activity.TaggingActivity r7) {
        /*
            X.0do r6 = r7.A0o
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r6)
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36312999299909204(0x81027b00000654, double:3.027825205749715E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            r3 = 0
            if (r0 == 0) goto L75
            boolean r0 = r7.A0R
            if (r0 == 0) goto L36
            java.util.ArrayList r0 = r7.A0N
            if (r0 == 0) goto L76
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L36
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r6)
            X.C14360o3.A0B(r2, r3)
            r0 = 36312999300957793(0x81027b00100661, double:3.027825206412847E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            r4 = 1
            if (r0 != 0) goto L37
        L36:
            r4 = 0
        L37:
            boolean r0 = r7.A0R
            if (r0 == 0) goto L6b
            java.util.ArrayList r0 = r7.A0N
            if (r0 == 0) goto L76
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L6b
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r6)
            X.C14360o3.A0B(r2, r3)
            r0 = 36312999300826720(0x81027b000e0660, double:3.027825206329956E-306)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            if (r0 == 0) goto L6b
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r6)
            X.C14360o3.A0B(r2, r3)
            r0 = 2342156008514979427(0x2081027b00150663, double:4.0596498815800714E-152)
            boolean r0 = X.C18U.A06(r5, r2, r0)
            r1 = 1
            if (r0 == 0) goto L6c
        L6b:
            r1 = 0
        L6c:
            boolean r0 = r7.A0R
            if (r0 == 0) goto L74
            if (r4 != 0) goto L74
            if (r1 == 0) goto L75
        L74:
            r3 = 1
        L75:
            return r3
        L76:
            X.AbstractC50522MSa.A0t()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.A0V(com.instagram.tagging.activity.TaggingActivity):boolean");
    }

    public static final boolean A0W(TaggingActivity taggingActivity, int i) {
        ArrayList arrayList = taggingActivity.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC25226BEj.A1b(MSW.A0t(arrayList, i).A0D);
    }

    public final String A0X() {
        ArrayList arrayList = this.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC50523MSb.A0J(this, arrayList).A06;
    }

    @Override // X.C2d4
    public final C56352iT AYT() {
        C56352iT c56352iT = this.A0Y;
        if (c56352iT == null) {
            C14360o3.A0F("_actionBarService");
            throw C00O.createAndThrow();
        }
        return c56352iT;
    }

    @Override // X.InterfaceC58081Pp6
    public final ArrayList BcJ() {
        ArrayList arrayList = this.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC50523MSb.A0K(this, arrayList).A0B;
    }

    @Override // X.InterfaceC58081Pp6
    public final ArrayList BhN() {
        ArrayList arrayList = this.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC50523MSb.A0K(this, arrayList).A0C;
    }

    @Override // X.InterfaceC58305Psx
    public final ArrayList C52() {
        ArrayList arrayList = this.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        return AbstractC166987dD.A1F(AbstractC50523MSb.A0K(this, arrayList).A0E);
    }

    @Override // X.InterfaceC58084Pp9
    public final boolean CLc() {
        ArrayList arrayList = this.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        int i = 0;
        while (A13.hasNext()) {
            MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) AbstractC166997dE.A0l(A13);
            i = i + mediaTaggingInfo.A0C.size() + mediaTaggingInfo.A0B.size();
        }
        return AbstractC43593JPy.A1Z(i, 20);
    }

    @Override // X.InterfaceC58080Pp5
    public final void DN6() {
        O2Z o2z;
        int i;
        int i2;
        C50699MZu c50699MZu = this.A06;
        if (c50699MZu == null) {
            C14360o3.A0F("creationLogger");
            throw C00O.createAndThrow();
        }
        c50699MZu.A0D(getModuleName());
        if (this.A0i) {
            C54966OSw.A00(new C54966OSw(this), 2131961965, 2131961937);
            return;
        }
        if (this.A0j) {
            IQU.A00(this, 2131969161);
            return;
        }
        if (this.A0h) {
            o2z = new O2Z(this);
            i = 2131953262;
            i2 = 2131953260;
        } else if (this.A0l) {
            o2z = new O2Z(this);
            i = 2131953263;
            i2 = 2131953261;
        } else if (AbstractC55229Oez.A0L(this)) {
            AbstractC55114ObY.A01(this, C52().size());
            return;
        } else {
            if (AbstractC55229Oez.A0E(this, AbstractC166987dD.A0r(this.A0o), this, Boolean.valueOf(this.A0S))) {
                return;
            }
            A09();
            return;
        }
        C193328hC A0I = AbstractC31171DnF.A0I(o2z.A00);
        A0I.A0A(i);
        A0I.A09(i2);
        AbstractC31176DnK.A1W(A0I);
    }

    @Override // X.InterfaceC58159PqO
    public final void Dqi(MediaSuggestedProductTag mediaSuggestedProductTag, Product product, boolean z) {
        String str;
        String str2;
        String str3;
        C1LC A0I = AbstractC43592JPx.A0I(ImmutableList.copyOf((Collection) mediaSuggestedProductTag.A02));
        String str4 = null;
        Integer num = null;
        Float f = null;
        while (A0I.hasNext()) {
            MediaSuggestedProductTagProductItemContainer mediaSuggestedProductTagProductItemContainer = (MediaSuggestedProductTagProductItemContainer) A0I.next();
            if (C14360o3.A0K(AbstractC38048Gob.A01(mediaSuggestedProductTagProductItemContainer.A01).A0H, product.A0H)) {
                num = Integer.valueOf(ImmutableList.copyOf((Collection) mediaSuggestedProductTag.A02).indexOf(mediaSuggestedProductTagProductItemContainer));
                f = Float.valueOf(mediaSuggestedProductTagProductItemContainer.A00);
            }
        }
        EnumC53230NgS enumC53230NgS = mediaSuggestedProductTag.A01;
        EnumC53230NgS enumC53230NgS2 = EnumC53230NgS.A04;
        boolean z2 = false;
        if (enumC53230NgS == enumC53230NgS2) {
            z2 = true;
        }
        UserSession A0r = AbstractC166987dD.A0r(this.A0o);
        String str5 = this.A0L;
        if (str5 == null) {
            str3 = "_shoppingCreationSessionId";
        } else {
            boolean z3 = !A0U(this);
            int i = this.A00;
            A03(this);
            if (mediaSuggestedProductTag.A01 == enumC53230NgS2 && z) {
                str = "change";
            } else {
                str = "add";
            }
            if (z2) {
                str4 = MSW.A13(mediaSuggestedProductTag);
            }
            String str6 = product.A0H;
            PointF pointF = mediaSuggestedProductTag.A00;
            C51415MnN A02 = A02(this);
            EnumC53230NgS enumC53230NgS3 = mediaSuggestedProductTag.A01;
            C14360o3.A07(enumC53230NgS3);
            String str7 = this.A0M;
            if (str7 == null) {
                str3 = "priorSubmodule";
            } else {
                if (A0S(this)) {
                    str2 = "opt";
                } else {
                    str2 = "seller";
                }
                AbstractC55216Oef.A05(pointF, A02, this, A0r, enumC53230NgS3, f, num, str5, str, str4, str6, str7, "feed", str2, i, z3);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58084Pp9
    public final void Elk() {
        String str;
        String str2;
        C50699MZu c50699MZu = this.A06;
        if (c50699MZu == null) {
            str2 = "creationLogger";
        } else {
            if (this.A0R) {
                str = "edit_media_info";
            } else {
                str = "followers_share";
            }
            ArrayList arrayList = this.A0N;
            if (arrayList != null) {
                Iterator A13 = AbstractC166997dE.A13(arrayList);
                int i = 0;
                while (A13.hasNext()) {
                    i += ((MediaTaggingInfo) AbstractC166997dE.A0l(A13)).A0B.size();
                }
                ArrayList arrayList2 = this.A0N;
                if (arrayList2 != null) {
                    Iterator A132 = AbstractC166997dE.A13(arrayList2);
                    int i2 = 0;
                    while (A132.hasNext()) {
                        i2 += ((MediaTaggingInfo) AbstractC166997dE.A0l(A132)).A0C.size();
                    }
                    c50699MZu.A0E(str, i, i2, A0S(this));
                    if (A0T(this)) {
                        AbstractC55114ObY.A00(this);
                        return;
                    } else {
                        C9GR.A07(this, 2131969843);
                        return;
                    }
                }
            }
            str2 = "mediaTaggingInfos";
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        EnumC53319Nhv enumC53319Nhv = this.A0I;
        if (enumC53319Nhv == null) {
            C14360o3.A0F("tagType");
            throw C00O.createAndThrow();
        }
        int ordinal = enumC53319Nhv.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return "";
            }
            return AbstractC111324zv.A00(5108);
        }
        if (A0T(this)) {
            return "collab_tagging";
        }
        return "people_tagging";
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC166987dD.A0r(this.A0o);
    }

    private final ArrayList A04() {
        ArrayList BcJ = BcJ();
        ArrayList arrayList = this.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC50523MSb.A0J(this, arrayList).A0E);
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = BcJ.size();
        for (int i = 0; i < size; i++) {
            Tag tag = (Tag) BcJ.get(i);
            if (A1F.contains(tag.getId())) {
                A1E.add(tag);
            }
        }
        return A1E;
    }

    private final ArrayList A05() {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList arrayList = this.A0N;
        if (arrayList == null) {
            AbstractC50522MSa.A0t();
            throw C00O.createAndThrow();
        }
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            ArrayList arrayList2 = ((MediaTaggingInfo) AbstractC166997dE.A0l(A13)).A0D;
            if (arrayList2 != null) {
                A1E.addAll(arrayList2);
            }
        }
        return AbstractC166987dD.A1F(AbstractC55225Oes.A0A(A1E));
    }

    private final void A07() {
        C81373k7 c81373k7;
        if (!A0R()) {
            this.A0E = null;
            View view = this.A01;
            if (view != null && (c81373k7 = (C81373k7) view.getTag()) != null) {
                c81373k7.A0J.setVisibility(8);
            }
        }
    }

    private final void A08() {
        String str;
        String str2;
        View findViewById = findViewById(R.id.tagging_tab_bar_view_stub);
        C14360o3.A0C(findViewById, AbstractC111324zv.A00(13));
        View inflate = ((ViewStub) findViewById).inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout");
        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) inflate;
        this.A08 = igSegmentedTabLayout;
        if (igSegmentedTabLayout != null) {
            A03(this);
        }
        C44435Jko c44435Jko = new C44435Jko(AbstractC166987dD.A0O(this), new C47673L3g(getApplicationContext().getDrawable(R.drawable.instagram_tag_down_pano_outline_24), null, null, -1, true));
        this.A09 = c44435Jko;
        IgSegmentedTabLayout igSegmentedTabLayout2 = this.A08;
        if (igSegmentedTabLayout2 != null) {
            igSegmentedTabLayout2.addView(c44435Jko);
        }
        C44435Jko c44435Jko2 = this.A09;
        if (c44435Jko2 != null) {
            Ok3.A00(c44435Jko2, 64, this);
        }
        if (this.A0V) {
            C44435Jko c44435Jko3 = new C44435Jko(AbstractC166987dD.A0O(this), new C47673L3g(getApplicationContext().getDrawable(R.drawable.instagram_shopping_bag_pano_outline_24), null, null, -1, true));
            this.A0A = c44435Jko3;
            IgSegmentedTabLayout igSegmentedTabLayout3 = this.A08;
            if (igSegmentedTabLayout3 != null) {
                igSegmentedTabLayout3.addView(c44435Jko3);
            }
            C50699MZu c50699MZu = this.A06;
            str = "creationLogger";
            if (c50699MZu != null) {
                if (this.A0R) {
                    str2 = "edit_media_info";
                } else {
                    str2 = "followers_share";
                }
                boolean A0S = A0S(this);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c50699MZu.A04, "instagram_shopping_product_tagging_tab_impression");
                A0f.AAP("waterfall_id", C50699MZu.A02(A0f, c50699MZu, "session_instance_id", C50699MZu.A02(A0f, c50699MZu, "prior_module", str2)));
                A0f.A7v("is_organic_product_tagging", AbstractC31173DnH.A0e(A0f, "usage", "feed_sharing", A0S));
                A0f.AAP("prior_submodule", null);
                A0f.Cht();
                C44435Jko c44435Jko4 = this.A0A;
                if (c44435Jko4 != null) {
                    Ok3.A00(c44435Jko4, 65, this);
                }
                if (!this.A0Q) {
                    UserSession A0r = AbstractC166987dD.A0r(this.A0o);
                    ArrayList BcJ = BcJ();
                    C14360o3.A0B(A0r, 0);
                    C14360o3.A0B(BcJ, 1);
                    if (AbstractC55229Oez.A0M(BcJ) && AbstractC55229Oez.A0J(A0r, false)) {
                        C52253NAt c52253NAt = this.A0c;
                        if (c52253NAt != null) {
                            Integer num = C05F.A0j;
                            if (c52253NAt.A01(num)) {
                                C52253NAt c52253NAt2 = this.A0c;
                                if (c52253NAt2 != null) {
                                    IgSegmentedTabLayout igSegmentedTabLayout4 = this.A08;
                                    String A00 = AbstractC111324zv.A00(2);
                                    C14360o3.A0C(igSegmentedTabLayout4, A00);
                                    C44435Jko c44435Jko5 = this.A0A;
                                    C14360o3.A0C(c44435Jko5, A00);
                                    c52253NAt2.A00(this, igSegmentedTabLayout4, c44435Jko5, num);
                                    C50699MZu c50699MZu2 = this.A06;
                                    if (c50699MZu2 != null) {
                                        String moduleName = getModuleName();
                                        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c50699MZu2.A04, "instagram_shopping_product_tagging_tab_tooltip_impression");
                                        A0f2.AAP("waterfall_id", C50699MZu.A02(A0f2, c50699MZu2, "session_instance_id", C50699MZu.A02(A0f2, c50699MZu2, "prior_module", moduleName)));
                                        A0f2.A7v("is_organic_product_tagging", AbstractC31173DnH.A0e(A0f2, "usage", "feed_sharing", true));
                                        A0f2.AAP("prior_submodule", null);
                                        A0f2.Cht();
                                        this.A0Q = true;
                                    }
                                }
                            }
                        }
                        C14360o3.A0F("tagProductsTooltipController");
                        throw C00O.createAndThrow();
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        EnumC53319Nhv enumC53319Nhv = this.A0I;
        if (enumC53319Nhv == null) {
            str = "tagType";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        A0L(this, enumC53319Nhv, false);
    }

    private final boolean A0R() {
        if (A0U(this)) {
            if (BhN().isEmpty()) {
                return false;
            }
        } else {
            ArrayList Ab2 = Ab2();
            if (Ab2 == null || Ab2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC58306Psy
    public final ArrayList Ab2() {
        ArrayList arrayList = null;
        if (!A0U(this)) {
            arrayList = AbstractC166987dD.A1E();
            ArrayList arrayList2 = this.A0N;
            if (arrayList2 == null) {
                AbstractC50522MSa.A0t();
                throw C00O.createAndThrow();
            }
            Iterator A13 = AbstractC166997dE.A13(arrayList2);
            while (A13.hasNext()) {
                arrayList.addAll(((MediaTaggingInfo) AbstractC166997dE.A0l(A13)).A0C);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC30955DjC
    public final void DN3() {
        A09();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    @Override // X.InterfaceC58159PqO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ds0(com.instagram.model.people.PeopleTag r10) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.Ds0(com.instagram.model.people.PeopleTag):void");
    }

    @Override // X.GYN
    public final void Ds5() {
        A0C(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4.A05 != true) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 18
            if (r7 != r0) goto Lad
            X.C14360o3.A0A(r9)
            java.lang.String r0 = "tagging_info_id"
            java.lang.String r2 = r9.getStringExtra(r0)
            if (r2 == 0) goto Ldb
            r0 = -1
            if (r8 != r0) goto Ld7
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r4 = r6.A0E
            java.lang.String r0 = "selected_product"
            android.os.Parcelable r1 = r9.getParcelableExtra(r0)
            com.instagram.user.model.Product r1 = (com.instagram.user.model.Product) r1
            if (r1 == 0) goto Lca
            java.lang.String r0 = "tagged_product_collection"
            android.os.Parcelable r0 = r9.getParcelableExtra(r0)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = (com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta) r0
            r6.A0E = r0
            A0N(r6, r1, r2)
        L2e:
            boolean r0 = r6.A0R()
            if (r0 == 0) goto Lc6
            r3 = 1
            if (r4 == 0) goto L3c
            boolean r1 = r4.A05
            r0 = 1
            if (r1 == r3) goto L3d
        L3c:
            r0 = 0
        L3d:
            r2 = 0
            if (r0 == 0) goto Lb0
            java.lang.String r1 = r4.A01
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r6.A0E
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.A01
        L48:
            boolean r0 = X.AbstractC13670mt.A0G(r1, r0)
            if (r0 != 0) goto Lb0
            r6.A0E = r2
            r5 = 1
        L51:
            r3 = 1
            A0Q(r6, r3)
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r0 = r6.A0E
            if (r0 == 0) goto L85
            boolean r0 = r0.A05
            if (r0 != r3) goto L85
            if (r4 != 0) goto L85
            X.O8r r0 = r6.A0C
            java.lang.String r4 = "discountAutoTagTooltipController"
            if (r0 == 0) goto Lcf
            com.instagram.common.session.UserSession r0 = r0.A01
            X.0xq r1 = X.AbstractC166987dD.A0x(r0)
            java.lang.String r0 = "has_shown_discount_auto_tag_nux"
            boolean r0 = X.AbstractC31172DnG.A1a(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L85
            X.O8r r2 = r6.A0C
            if (r2 == 0) goto Lcf
            android.view.View r1 = r6.A01
            if (r1 == 0) goto L85
            X.PRa r0 = new X.PRa
            r0.<init>(r1, r2)
            r1.post(r0)
        L85:
            X.0do r0 = r6.A0o
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            X.Ip8 r2 = X.I6K.A00(r0)
            r1 = 0
            java.lang.String r0 = r6.getModuleName()
            r2.A01(r3, r1, r0)
            if (r5 == 0) goto Lad
            X.6i8 r2 = X.AbstractC31171DnF.A0K()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131960971(0x7f13248b, float:1.9558626E38)
            X.AbstractC31172DnG.A1H(r1, r2, r0)
            r2.A06()
            X.AbstractC25233BEq.A1F(r2)
        Lad:
            return
        Lae:
            r0 = r2
            goto L48
        Lb0:
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r1 = r6.A0E
            if (r1 == 0) goto Lc6
            boolean r0 = r1.A05
            if (r0 != r3) goto Lc6
            java.lang.String r1 = r1.A01
            if (r4 == 0) goto Lc8
            java.lang.String r0 = r4.A01
        Lbe:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lc6
            r6.A0E = r2
        Lc6:
            r5 = 0
            goto L51
        Lc8:
            r0 = r2
            goto Lbe
        Lca:
            A0P(r6, r2)
            goto L2e
        Lcf:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Ld7:
            A0P(r6, r2)
            return
        Ldb:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0467, code lost:
    
        if (r48.A0T != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02fd, code lost:
    
        if (r48.A0T != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b0  */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.ILh, X.NX6, java.lang.Object] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r49) {
        /*
            Method dump skipped, instructions count: 1478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.tagging.activity.TaggingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(-1208195512);
        super.onDestroy();
        this.A0J = null;
        this.A08 = null;
        NX7 nx7 = this.A0G;
        if (nx7 != null) {
            nx7.A02 = null;
            nx7.A00 = null;
            nx7.A01 = null;
        }
        InterfaceC41501vz interfaceC41501vz = this.A0Z;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0o)).A02(interfaceC41501vz, NYB.class);
        }
        InterfaceC41501vz interfaceC41501vz2 = this.A0a;
        if (interfaceC41501vz2 != null) {
            AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0o)).A02(interfaceC41501vz2, NYA.class);
        }
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0o)).A02(this.A03, C8PB.class);
        InterfaceC41501vz interfaceC41501vz3 = this.A04;
        if (interfaceC41501vz3 != null) {
            C41451vu.A01.A03(interfaceC41501vz3, C3KD.class);
        }
        C0f9.A07(1055104380, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-607699552);
        super.onResume();
        C55772hI.A00(AbstractC166987dD.A0r(this.A0o)).A0D("ig_activity", this);
        A0D(this);
        C0f9.A07(-1055938191, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0o);
    }
}
