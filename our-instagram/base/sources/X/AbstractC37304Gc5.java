package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gc5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37304Gc5 {
    public static int A00(Parcel parcel) {
        C14360o3.A0B(parcel, 0);
        return parcel.readInt();
    }

    public static View A05(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent");
        return inflate;
    }

    public static C71353Hw A08(Object obj) {
        return new C71353Hw(null, obj, null, null);
    }

    public static C1DY A09(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return new C1DY(c1dv, 6, false);
    }

    public static C38683GzO A0M(C41702IdW c41702IdW, Product product) {
        if (product != null) {
            return C128205qp.A03(c41702IdW.A03, product);
        }
        return null;
    }

    public static Float A0S(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return Float.valueOf(parcel.readFloat());
        }
        return null;
    }

    public static Float A0T(Parcel parcel, int i) {
        if (i != 0) {
            return Float.valueOf(parcel.readFloat());
        }
        return null;
    }

    public static Integer A0W(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return Integer.valueOf(parcel.readInt());
        }
        return null;
    }

    public static Integer A0X(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return Integer.valueOf(parcel.readInt());
        }
        return null;
    }

    public static Integer A0Y(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return Integer.valueOf(parcel.readInt());
        }
        return null;
    }

    public static Long A0b(InterfaceC02580Ag interfaceC02580Ag, InterfaceC02590Ai interfaceC02590Ai, C38683GzO c38683GzO) {
        interfaceC02590Ai.AAK(interfaceC02580Ag, "advertiser_id");
        interfaceC02590Ai.A9K("catalog_id", null);
        if (c38683GzO != null) {
            return Long.valueOf(c38683GzO.A00);
        }
        return null;
    }

    public static Object A0c(C16L c16l) {
        if (c16l.A11() != C16R.A0G) {
            return c16l.A1P();
        }
        return null;
    }

    public static String A0d(Parcel parcel) {
        C14360o3.A0B(parcel, 0);
        return parcel.readString();
    }

    public static Iterator A0l(Parcel parcel, List list) {
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static java.util.Set A0n(C22P c22p) {
        if (LD7.A01(c22p)) {
            return AbstractC16830sb.A06(C1811381p.A00);
        }
        return null;
    }

    public static void A0v(View view, Object obj, Object obj2, boolean z) {
        View[] viewArr = {view};
        if (obj == obj2) {
            C150956qv.A08(viewArr, z);
        } else {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le.A04(null, viewArr, false);
        }
    }

    public static void A0w(Fragment fragment) {
        C9GR.A01(fragment.getActivity(), "shopping_feed_failed", 2131956848, 0);
    }

    public static void A0y(AbstractC70663Fe abstractC70663Fe, RecyclerView recyclerView, InterfaceC62612t0 interfaceC62612t0, C153146ui c153146ui) {
        recyclerView.A14(new C153156uj(abstractC70663Fe, interfaceC62612t0, c153146ui, false, false));
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, int i) {
        interfaceC02590Ai.A9K("item_count", Long.valueOf(i));
    }

    public static void A1R(RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        refreshableNestedScrollingParent.A08 = new C70523Eo(refreshableNestedScrollingParent, false);
    }

    public static boolean A1W(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static long A02(Object obj) {
        C14360o3.A0B(obj, 0);
        return 0L;
    }

    public static Intent A03(C120985dq c120985dq) {
        Intent intent = new Intent();
        intent.putExtra("media_id", c120985dq.getId());
        intent.putExtra("media_type", "REEL");
        return intent;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.38B] */
    public static C38B A06(Fragment fragment) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("prior_module", fragment.requireArguments().getString("prior_module_name"));
        return c0Zx;
    }

    public static IGTVAccountLevelMonetizationToggleSetting A0A(Object obj) {
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = (IGTVAccountLevelMonetizationToggleSetting) IGTVAccountLevelMonetizationToggleSetting.A01.get(obj);
        if (iGTVAccountLevelMonetizationToggleSetting == null) {
            return IGTVAccountLevelMonetizationToggleSetting.A06;
        }
        return iGTVAccountLevelMonetizationToggleSetting;
    }

    public static SubscriptionStickerDict A0B(C1DY c1dy, SubscriptionStickerDictIntf subscriptionStickerDictIntf) {
        if (subscriptionStickerDictIntf != null) {
            return subscriptionStickerDictIntf.F2W(c1dy);
        }
        return null;
    }

    public static C38321qM A0D(C1DY c1dy, C17T c17t, int i) {
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) c17t.A05(i, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            C38801rC c38801rC = C38321qM.A0h;
            return C38801rC.A00(c1dy, immutablePandoMediaDict);
        }
        return null;
    }

    public static C38321qM A0E(C1DY c1dy, C17T c17t, int i) {
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) c17t.A04(i, ImmutablePandoMediaDict.class);
        C38801rC c38801rC = C38321qM.A0h;
        return C38801rC.A00(c1dy, immutablePandoMediaDict);
    }

    public static C146106i8 A0H() {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A01 = 5000;
        return c146106i8;
    }

    public static CurrencyAmountInfoImpl A0I(C2JS c2js, String str, String str2) {
        return new CurrencyAmountInfoImpl(Integer.valueOf(c2js.getCoercedIntField(3, "offset")), str, str2, c2js.A09("currency"));
    }

    public static C41741IeF A0K(HCI hci) {
        return (C41741IeF) hci.A0B.getValue();
    }

    public static C41728Idz A0L(HCB hcb) {
        return (C41728Idz) hcb.A0C.getValue();
    }

    public static C1571273r A0O() {
        C1571273r c1571273r = new C1571273r();
        c1571273r.A02 = R.drawable.loadmore_icon_refresh_compound;
        return c1571273r;
    }

    public static ProductDetailsProductItemDictIntf A0Q(C1DY c1dy, ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        if (productDetailsProductItemDictIntf != null) {
            productDetailsProductItemDictIntf.ECE(c1dy);
            return productDetailsProductItemDictIntf;
        }
        return null;
    }

    public static String A0e(InterfaceC02590Ai interfaceC02590Ai, UserSession userSession, C38321qM c38321qM) {
        interfaceC02590Ai.AAP("m_pk", c38321qM.getId());
        User A2E = c38321qM.A2E(userSession);
        return A2E != null ? A2E.getId() : "";
    }

    public static String A0j(Product product) {
        User user = product.A0B;
        if (user == null) {
            return null;
        }
        return AbstractC76433bn.A00(user);
    }

    public static String A0k(Object obj) {
        C17T c17t = (C17T) obj;
        C14360o3.A0B(c17t, 0);
        return c17t.A0j(356255459);
    }

    public static List A0m(C17T c17t, List list) {
        if (list == null) {
            return c17t.A0o(1367927716, C37982GnP.class);
        }
        return list;
    }

    public static void A0o(int i) {
        C006802i.A0p.markerPoint(i, "NETWORK_FAILED");
        C006802i.A0p.markerEnd(i, (short) 3);
    }

    public static void A0t(View view, C3OO c3oo, int i, int i2) {
        view.setPadding(i, i2, c3oo.itemView.getPaddingRight(), c3oo.itemView.getPaddingBottom());
    }

    public static void A0z(RecyclerView recyclerView, int i, int i2) {
        recyclerView.A10(new C3YB(i, i2));
    }

    public static void A13(InterfaceC02590Ai interfaceC02590Ai, RankingInfo rankingInfo) {
        if (rankingInfo != null) {
            interfaceC02590Ai.AAQ(AbstractC40745I3z.A00(rankingInfo), "ranking_logging_info");
        }
    }

    public static void A14(InterfaceC02590Ai interfaceC02590Ai, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments) {
        interfaceC02590Ai.A7v("is_organic_product_tagging", Boolean.valueOf(shoppingTaggingFeedArguments.A00));
        interfaceC02590Ai.Cht();
    }

    public static void A15(InterfaceC02590Ai interfaceC02590Ai, Long l, int i) {
        if (i != 0) {
            interfaceC02590Ai.AAK(new C4SX(l), "shop_linked_creator_id");
        }
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("action", str);
        interfaceC02590Ai.AAP("nudge_name", "multi_hide_explore_controls");
        interfaceC02590Ai.Cht();
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, String str, String str2, int i) {
        interfaceC02590Ai.AAP("item_id", str);
        interfaceC02590Ai.AAP("item_type", str2);
        interfaceC02590Ai.A9K("item_index", Long.valueOf(i));
    }

    public static void A1N(C7E1 c7e1, InterfaceC65642y0 interfaceC65642y0, InterfaceC65642y0 interfaceC65642y02, C65662y2 c65662y2, int i) {
        c65662y2.A03 = i;
        c7e1.A0B(interfaceC65642y0, interfaceC65642y02, c65662y2);
    }

    public static void A1O(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        C6FX c6fx = new C6FX();
        c6fx.A01(c102884kP);
        c6fx.A02(c6fg);
        C6FP.A03(c6fg, c102884kP, c6fx.A00(), interfaceC103384lE);
    }

    public static void A1Q(C34725FRo c34725FRo, C41181vS c41181vS, User user, boolean z) {
        c34725FRo.A03(c41181vS.A0k);
        c34725FRo.A04(c41181vS.A0j);
        c34725FRo.A01.putBoolean("DirectReplyModalFragment.is_archive_reel", z);
        c34725FRo.A06(user.getId());
    }

    public static boolean A1Y(Parcel parcel, Boolean bool) {
        if (bool == null) {
            return false;
        }
        parcel.writeInt(1);
        return bool.booleanValue();
    }

    public static int A01(Parcel parcel, Parcelable.Creator creator, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(creator.createFromParcel(parcel));
        return i + 1;
    }

    public static Parcelable A04(Parcel parcel, Class cls) {
        return parcel.readParcelable(cls.getClassLoader());
    }

    public static TreeUpdaterJNI A07(TreeJNI treeJNI, Map map) {
        return new TreeUpdaterJNI(AbstractC06930Yk.A0B(map), treeJNI);
    }

    public static C140966Yy A0C(ReelDashboardFragment reelDashboardFragment) {
        return new C140966Yy(reelDashboardFragment.requireActivity(), reelDashboardFragment.A06);
    }

    public static C38321qM A0F(String str, InterfaceC09390do interfaceC09390do) {
        return C1DW.A00((UserSession) interfaceC09390do.getValue()).A02(str);
    }

    public static C153336v2 A0G(Object obj, Map map) {
        C153336v2 c153336v2 = (C153336v2) map.get(obj);
        if (c153336v2 == null) {
            C153336v2 c153336v22 = new C153336v2();
            map.put(obj, c153336v22);
            return c153336v22;
        }
        return c153336v2;
    }

    public static C31368DqX A0J(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        return AbstractC31402Dr6.A01(userSession, str, str2, interfaceC11380iw.getModuleName());
    }

    public static NXU A0N(View view, int i) {
        return new NXU(view.requireViewById(i));
    }

    public static EmptyStateView A0P(AbstractC05560Rg abstractC05560Rg) {
        AbstractC05560Rg.A00(abstractC05560Rg);
        View emptyView = abstractC05560Rg.A04.getEmptyView();
        emptyView.getClass();
        return (EmptyStateView) emptyView;
    }

    public static Boolean A0R(TreeJNI treeJNI, int i) {
        treeJNI.getBooleanValueByHashCode(i);
        return Boolean.valueOf(treeJNI.getBooleanValueByHashCode(i));
    }

    public static Integer A0U(Parcel parcel) {
        return Integer.valueOf(parcel.readInt());
    }

    public static Integer A0V(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return Integer.valueOf(parcel.readInt());
    }

    public static Integer A0Z(C2JS c2js, String str, int i) {
        return Integer.valueOf(c2js.getCoercedIntField(i, str));
    }

    public static Long A0a(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return Long.valueOf(parcel.readLong());
    }

    public static String A0f(C17T c17t) {
        return c17t.A0i(-1938614671);
    }

    public static String A0g(C17T c17t) {
        return c17t.A0i(-1759410662);
    }

    public static String A0h(C17T c17t) {
        return c17t.A0i(-815905284);
    }

    public static String A0i(C17T c17t) {
        return c17t.A0i(3226745);
    }

    public static void A0p(Context context, Drawable drawable, C146106i8 c146106i8) {
        c146106i8.A08(drawable, context.getColor(AbstractC53242c7.A05(context)));
    }

    public static void A0q(Context context, C1571273r c1571273r) {
        c1571273r.A00 = context.getColor(AbstractC53242c7.A0D(context));
    }

    public static void A0r(Parcel parcel, Class cls, AbstractCollection abstractCollection) {
        abstractCollection.add(parcel.readParcelable(cls.getClassLoader()));
    }

    public static void A0s(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append(" • ");
    }

    public static void A0u(View view, C57112jm c57112jm, C63622uj c63622uj, String str) {
        c57112jm.A05(view, c63622uj.A00(str));
    }

    public static void A0x(C2GT c2gt, C2GT c2gt2, InterfaceC16660sJ interfaceC16660sJ) {
        Object A02 = c2gt.A02();
        C14360o3.A0A(A02);
        c2gt2.A0B(interfaceC16660sJ.invoke(A02));
    }

    public static void A10(RecyclerView recyclerView, InterfaceC09390do interfaceC09390do) {
        recyclerView.setAdapter((C2UU) interfaceC09390do.getValue());
    }

    public static void A12(InterfaceC02590Ai interfaceC02590Ai, long j, long j2) {
        interfaceC02590Ai.A9K("total_dwell_time", Long.valueOf(j));
        interfaceC02590Ai.A9K("page_id", Long.valueOf(j2));
    }

    public static void A18(AbstractC02600Aj abstractC02600Aj) {
        abstractC02600Aj.A0P("timestamp_in_ms", Double.valueOf(System.currentTimeMillis()));
    }

    public static void A19(AbstractC02600Aj abstractC02600Aj, C9C7 c9c7, String str, String str2) {
        abstractC02600Aj.A0R(str, str2);
        abstractC02600Aj.A0R("item_type", c9c7.A01.toString());
        abstractC02600Aj.A0R("signal_surface", c9c7.A05.toString());
    }

    public static void A1A(C25621Ms c25621Ms, Class cls, Class cls2, String str) {
        c25621Ms.A0R(cls, cls2);
        c25621Ms.A0H("max_id", str);
    }

    public static void A1B(AbstractC23721Ec abstractC23721Ec, String str, String str2, String str3) {
        abstractC23721Ec.A9s(str, str2);
        abstractC23721Ec.A0H("max_id", str3);
    }

    public static void A1C(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((InterfaceC111044zG) it.next()).Erx(c1dy));
    }

    public static void A1D(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((ProductDetailsProductItemDictIntf) it.next()).F7S(c1dy));
    }

    public static void A1E(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) it.next();
        C38801rC c38801rC = C38321qM.A0h;
        abstractCollection.add(C38801rC.A00(c1dy, immutablePandoMediaDict));
    }

    public static void A1F(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) it.next();
        C38801rC c38801rC = C38321qM.A0h;
        C14360o3.A0A(immutablePandoMediaDict);
        abstractCollection.add(C38801rC.A00(c1dy, immutablePandoMediaDict));
    }

    public static void A1G(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        InterfaceC111044zG interfaceC111044zG = (InterfaceC111044zG) it.next();
        interfaceC111044zG.E8p(c1dy);
        abstractCollection.add(interfaceC111044zG);
    }

    public static void A1H(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(c1dy.A00((C38321qM) it.next()));
    }

    public static void A1I(C1DY c1dy, AbstractCollection abstractCollection, Iterator it) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
        Parcelable.Creator creator = User.CREATOR;
        abstractCollection.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
    }

    public static void A1J(AbstractC59962oe abstractC59962oe, InterfaceC09390do interfaceC09390do) {
        abstractC59962oe.registerLifecycleListener((AbstractC60592pi) interfaceC09390do.getValue());
    }

    public static void A1K(AbstractC59962oe abstractC59962oe, InterfaceC09390do interfaceC09390do) {
        abstractC59962oe.registerLifecycleListener((C675132q) interfaceC09390do.getValue());
    }

    public static void A1L(AbstractC59962oe abstractC59962oe, InterfaceC09390do interfaceC09390do) {
        abstractC59962oe.unregisterLifecycleListener((AbstractC60592pi) interfaceC09390do.getValue());
    }

    public static void A1M(AbstractC59962oe abstractC59962oe, InterfaceC09390do interfaceC09390do) {
        abstractC59962oe.unregisterLifecycleListener((C675132q) interfaceC09390do.getValue());
    }

    public static void A1P(AbstractC12990ll abstractC12990ll, C82713mZ c82713mZ) {
        AbstractC11060iN.A00(abstractC12990ll).EIu(c82713mZ.A00());
    }

    public static void A1S(AbstractCollection abstractCollection, Iterator it) {
        C38321qM A02 = C3XH.A02(((C3XG) it.next()).A05);
        if (A02 != null) {
            abstractCollection.add(A02);
        }
    }

    public static void A1T(java.util.Set set, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            C006802i.A0p.markerEnd(i, (short) 2);
            set.remove(valueOf);
        }
    }

    public static void A1U(InterfaceC09390do interfaceC09390do) {
        ((C3CO) interfaceC09390do.getValue()).A00();
    }

    public static boolean A1V(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return false;
        }
        return true;
    }

    public static boolean A1X(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return false;
        }
        return true;
    }

    public static boolean A1Z(C16L c16l, Object obj) {
        c16l.A1J();
        return DialogModule.KEY_TITLE.equals(obj);
    }

    public static boolean A1a(C52678NSa c52678NSa, String str, boolean z) {
        return ((Boolean) c52678NSa.A03(str, z).getValue()).booleanValue();
    }

    public static boolean A1b(InterfaceC09390do interfaceC09390do) {
        return C33L.A01((UserSession) interfaceC09390do.getValue());
    }
}
