package X;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.DxR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31770DxR extends BaseAdapter implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
    public User A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final ENI A03;
    public final InterfaceC37258GbB A04;
    public final List A05;
    public final Map A06 = AbstractC166987dD.A1G();
    public final boolean A07;
    public final boolean A08;
    public final Integer A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 5;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return AbstractC31172DnG.A02(this.A0C, AbstractC31172DnG.A02(this.A0B, AbstractC31172DnG.A02(this.A0A, this.A05.size()))) + (AbstractC25229BEm.A1a(this.A09, C05F.A00) ? 1 : 0);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        int size = this.A05.size();
        int size2 = this.A0A.size();
        int size3 = this.A0B.size();
        int size4 = this.A0C.size();
        if (i < size) {
            return 0;
        }
        int i2 = size + size2;
        if (i < i2) {
            return 1;
        }
        int i3 = i2 + size3;
        if (i < i3) {
            return 2;
        }
        if (i < i3 + size4) {
            return 3;
        }
        if (1 - this.A09.intValue() != 0) {
            throw new UnsupportedOperationException("The add account button is hidden.");
        }
        return 4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C54432ex c54432ex;
        FOD fod;
        boolean equals;
        String str;
        String A02;
        List<C54432ex> list;
        Integer num;
        int i2;
        Object[] objArr;
        Object valueOf;
        EnumC54222eY enumC54222eY;
        C54552fC c54552fC;
        View view2;
        FOD fod2;
        InterfaceC11380iw interfaceC11380iw;
        boolean z;
        CircularImageView circularImageView;
        User user;
        if (view == null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0 && itemViewType != 1 && itemViewType != 2 && itemViewType == 3) {
                view = F9D.A00(viewGroup);
            } else {
                C14360o3.A0B(viewGroup, 0);
                view = F9D.A00(viewGroup);
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.multipleaccounts.adapter.UserAccountsRowViewHolder");
                ((FOD) tag).A08.setVisibility(8);
            }
        }
        int itemViewType2 = getItemViewType(i);
        if (itemViewType2 != 0) {
            if (itemViewType2 != 1) {
                if (itemViewType2 != 2) {
                    if (itemViewType2 != 3) {
                        FOD fod3 = (FOD) AbstractC31172DnG.A0x(view);
                        C14360o3.A0B(fod3, 0);
                        view2 = fod3.A02;
                        Context context = view2.getContext();
                        fod3.A06.setText(2131952267);
                        CircularImageView circularImageView2 = fod3.A07;
                        AbstractC166997dE.A19(context, circularImageView2, R.drawable.plus_small);
                        circularImageView2.setStrokeAlpha(0);
                        AbstractC31177DnL.A0p(context, circularImageView2, AbstractC53242c7.A08(context));
                        AbstractC31173DnH.A0z(context, circularImageView2, AbstractC53242c7.A0H(context, R.attr.profileSwitchAvatarCircle));
                        fod3.A03.setVisibility(8);
                        circularImageView2.setVisibility(0);
                        view2.setBackgroundResource(AbstractC53242c7.A0H(view2.getContext(), android.R.attr.selectableItemBackground));
                        return view;
                    }
                    C51757Mtg c51757Mtg = (C51757Mtg) getItem(i);
                    fod = (FOD) view.getTag();
                    ENI eni = this.A03;
                    InterfaceC11380iw interfaceC11380iw2 = this.A01;
                    if (c51757Mtg != null && fod != null) {
                        String str2 = c51757Mtg.A02;
                        ImageUrl imageUrl = (ImageUrl) c51757Mtg.A01;
                        fod.A06.setText(str2);
                        CircularImageView circularImageView3 = fod.A07;
                        circularImageView3.setStrokeAlpha(51);
                        if (imageUrl != null) {
                            circularImageView3.setUrl(imageUrl, interfaceC11380iw2);
                        } else {
                            AbstractC166997dE.A19(circularImageView3.getContext(), circularImageView3, R.drawable.profile_anonymous_user);
                        }
                        equals = false;
                        circularImageView3.setVisibility(0);
                        fod.A04.setVisibility(8);
                        fod.A05.setVisibility(8);
                        fod.A03.setVisibility(8);
                        IgdsButton igdsButton = fod.A08;
                        AbstractC05810Sj.A00(igdsButton);
                        igdsButton.setVisibility(0);
                        ViewOnClickListenerC31591DuJ.A00(igdsButton, 56, eni, c51757Mtg);
                    }
                    return view;
                }
                Object item = getItem(i);
                item.getClass();
                C34561FKv c34561FKv = (C34561FKv) item;
                fod2 = (FOD) AbstractC31172DnG.A0x(view);
                interfaceC11380iw = this.A01;
                z = this.A07;
                AbstractC31173DnH.A1F(fod2.A06, c34561FKv.A00);
                circularImageView = fod2.A07;
                circularImageView.setStrokeAlpha(51);
                user = c34561FKv.A00;
            } else {
                Object item2 = getItem(i);
                item2.getClass();
                FK7 fk7 = (FK7) item2;
                fod2 = (FOD) AbstractC31172DnG.A0x(view);
                interfaceC11380iw = this.A01;
                z = this.A07;
                AbstractC31173DnH.A1F(fod2.A06, fk7.A00.A01);
                circularImageView = fod2.A07;
                circularImageView.setStrokeAlpha(51);
                user = fk7.A00.A01;
            }
            AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, user);
            circularImageView.setVisibility(0);
            if (z) {
                fod2.A03.setVisibility(8);
                return view;
            }
            fod2.A04.setVisibility(8);
            ImageView imageView = fod2.A03;
            imageView.setVisibility(0);
            imageView.setImageDrawable(fod2.A01);
            return view;
        }
        Object item3 = getItem(i);
        item3.getClass();
        User user2 = (User) item3;
        if (user2 != null) {
            c54432ex = (C54432ex) this.A06.get(user2.getId());
        } else {
            c54432ex = null;
        }
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw3 = this.A01;
        fod = (FOD) AbstractC31172DnG.A0x(view);
        boolean z2 = this.A07;
        boolean z3 = this.A08;
        InterfaceC37258GbB interfaceC37258GbB = this.A04;
        TextView textView = fod.A06;
        Context context2 = textView.getContext();
        String username = user2.getUsername();
        ImageUrl Bhu = user2.Bhu();
        textView.setText(username);
        CircularImageView circularImageView4 = fod.A07;
        circularImageView4.setStrokeAlpha(51);
        circularImageView4.setUrl(Bhu, interfaceC11380iw3);
        circularImageView4.setVisibility(0);
        fod.A04.setVisibility(8);
        equals = user2.equals(AbstractC166987dD.A10(userSession));
        if (!z2 && equals) {
            AbstractC010103p.A0B(fod.A02, new UEG(0));
            ImageView imageView2 = fod.A03;
            imageView2.setImageDrawable(fod.A00);
            imageView2.setVisibility(0);
        } else {
            fod.A03.setVisibility(8);
        }
        if (z2 || equals) {
            str = "";
        } else if (!z3) {
            str = "";
            if (user2.A02() > 0) {
                ImmutableMap copyOf = ImmutableMap.copyOf(user2.A05);
                C14360o3.A07(copyOf);
                if (!copyOf.isEmpty() && (A02 = AnonymousClass537.A02(context2, AnonymousClass537.A01(copyOf), copyOf, user2.A02())) != null) {
                    str = A02.toString();
                }
            }
        } else {
            Resources resources = context2.getResources();
            GAP gap = (GAP) interfaceC37258GbB;
            C14360o3.A0B(resources, 0);
            str = "";
            if (c54432ex != null && (list = c54432ex.A04) != null) {
                LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(list, 10)));
                for (C54432ex c54432ex2 : list) {
                    InterfaceC54232eZ interfaceC54232eZ = c54432ex2.A03;
                    if (!(interfaceC54232eZ instanceof C54552fC) || (c54552fC = (C54552fC) interfaceC54232eZ) == null || (enumC54222eY = c54552fC.A01) == null) {
                        enumC54222eY = EnumC54222eY.A0Y;
                    }
                    A18.put(enumC54222eY, Integer.valueOf(c54432ex2.A01 + c54432ex2.A00));
                }
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                Iterator A14 = AbstractC166997dE.A14(A18);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    if (gap.A02.containsKey(A1K.getKey()) && AbstractC166987dD.A0H(A1K.getValue()) > 0) {
                        AbstractC31177DnL.A1S(A1K, A1I);
                    }
                }
                if (!A1I.isEmpty()) {
                    Iterator it = gap.A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (A1I.containsKey(next)) {
                            if (next != null && (num = (Integer) A1I.get(next)) != null) {
                                int intValue = num.intValue();
                                Number number = (Number) gap.A02.get(next);
                                if (number != null) {
                                    int intValue2 = number.intValue();
                                    int i3 = -intValue;
                                    Iterator it2 = A1I.values().iterator();
                                    while (it2.hasNext()) {
                                        i3 += AbstractC167007dF.A0B(it2);
                                    }
                                    str = AbstractC25231BEo.A0r(resources, num, intValue2, intValue);
                                    if (i3 > 0) {
                                        if (gap.A00.intValue() != 0) {
                                            valueOf = AbstractC167017dG.A0k(resources, i3, R.plurals.other_badges);
                                            C14360o3.A07(valueOf);
                                            i2 = 2131952966;
                                            objArr = new Object[2];
                                            objArr[0] = str;
                                        } else {
                                            i2 = 2131952965;
                                            objArr = new Object[2];
                                            objArr[0] = str;
                                            valueOf = Integer.valueOf(i3);
                                        }
                                        objArr[1] = valueOf;
                                        str = resources.getString(i2, objArr);
                                        C14360o3.A07(str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean A0B = AbstractC13670mt.A0B(str);
        TextView textView2 = fod.A05;
        if (A0B) {
            textView2.setText("");
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
            textView2.setVisibility(0);
        }
        view2 = fod.A02;
        if (equals) {
            view2.setBackground(null);
            return view;
        }
        view2.setBackgroundResource(AbstractC53242c7.A0H(view2.getContext(), android.R.attr.selectableItemBackground));
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C07270a1 A03;
        Eg0 eg0;
        Context context;
        String str;
        User user;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType != 3) {
                        ENI eni = this.A03;
                        FragmentActivity activity = eni.getActivity();
                        if (activity != null) {
                            C0BO AEY = C0BQ.A00(eni.A02).AEY(activity, null, eni.A02, eni.A04, false);
                            if (AEY.A01) {
                                if (AbstractC35090Fd1.A02(eni.A02)) {
                                    C3DN A0r = AbstractC31172DnG.A0r(activity);
                                    if (A0r != null) {
                                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(eni.A02), "account_switch_add_account_tapped");
                                        if (A0f.isSampled()) {
                                            AbstractC31175DnJ.A17(A0f, eni.A04);
                                        }
                                        A0r.A0R(new NXP(1, eni, activity, AbstractC166997dE.A0N(eni)));
                                    }
                                } else {
                                    AbstractC35178FfV.A00().A01(activity, AEY.A00, eni.A02, false);
                                }
                            } else if (!AbstractC35181FfY.A02(eni.A02)) {
                                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(eni.A02), AbstractC111324zv.A00(1879));
                                if (A0f2.isSampled()) {
                                    AbstractC31171DnF.A1G(A0f2, eni.A04);
                                    AbstractC25225BEi.A1O(A0f2, "account_switch_fragment");
                                    A0f2.Cht();
                                }
                            }
                        }
                        ENI.A01(eni);
                        return;
                    }
                    return;
                }
                C34561FKv c34561FKv = (C34561FKv) getItem(i);
                if (c34561FKv == null) {
                    return;
                }
                ENI eni2 = this.A03;
                ENI.A01(eni2);
                A03 = C023409i.A0A.A03(eni2);
                eg0 = new Eg0(eni2, eni2, A03, new G9Q((FragmentActivity) eni2.getRootActivity()), EnumC31713DwI.A0Z, c34561FKv, eni2, c34561FKv.A00.getUsername(), c34561FKv.A00.getId(), 1);
                context = eni2.A00;
                str = c34561FKv.A01;
                user = c34561FKv.A00;
            } else {
                FK7 fk7 = (FK7) getItem(i);
                if (fk7 == null) {
                    return;
                }
                ENI eni3 = this.A03;
                ENI.A02(eni3, fk7.A00.A01.getUsername(), true, false);
                ENI.A01(eni3);
                A03 = C023409i.A0A.A03(eni3);
                eg0 = new Eg0(eni3, eni3, A03, new G9Q((FragmentActivity) eni3.getRootActivity()), EnumC31713DwI.A0Z, fk7, eni3, fk7.A00.A01.getUsername(), fk7.A00.A01.getId(), 0);
                UserSession userSession = eni3.A02;
                String id = fk7.A00.A01.getId();
                C14360o3.A0B(userSession, 0);
                InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_one_login_deferred_login_initiated");
                AbstractC25225BEi.A1O(A0f3, "account_switch_fragment");
                A0f3.A9K("account_id", AbstractC166997dE.A0j(id));
                A0f3.Cht();
                context = eni3.A00;
                str = fk7.A02;
                user = fk7.A00.A01;
            }
            C1ON A04 = AbstractC35276FhB.A04(context, A03, str, user.getId(), null);
            A04.A00 = eg0;
            C1GJ.A03(A04);
            return;
        }
        Object item = getItem(i);
        item.getClass();
        User user2 = (User) item;
        if (user2.equals(this.A00)) {
            ENI.A02(this.A03, user2.getUsername(), true, true);
            return;
        }
        UserSession userSession2 = this.A02;
        C54392et A0b = AbstractC31173DnH.A0b(userSession2);
        C54432ex c54432ex = new C54432ex(EnumC54222eY.A07, user2.A02());
        EnumC58162lY enumC58162lY = EnumC58162lY.A03;
        EnumC58122lU enumC58122lU = EnumC58122lU.A05;
        A0b.A05(enumC58122lU, enumC58162lY, c54432ex, Collections.singletonMap("badge_user_id", user2.getId()));
        C54412ev A0c = AbstractC31174DnI.A0c(userSession2);
        EnumC54222eY enumC54222eY = EnumC54222eY.A0p;
        C54432ex c54432ex2 = new C54432ex(enumC54222eY, user2.A02());
        EnumC58162lY enumC58162lY2 = EnumC58162lY.A07;
        C14360o3.A0B(enumC58162lY2, 0);
        A0c.A03(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), c54432ex2, false);
        ENI eni4 = this.A03;
        ENI.A02(eni4, user2.getUsername(), false, true);
        UserSession userSession3 = eni4.A02;
        boolean z = C31514Dsy.A04;
        C14360o3.A0B(userSession3, 0);
        AbstractC31173DnH.A0b(userSession3).A00.AHj();
        int A02 = user2.A02();
        C54392et.A00(AbstractC31173DnH.A0b(userSession3), enumC58122lU, EnumC58162lY.A09, new C54432ex(EnumC54222eY.A06, null, A02, A02), C05F.A0C, "click", null, 0, 0, 0, 0);
        AbstractC31174DnI.A0c(userSession3).A03(new C72053Ld(enumC58122lU, enumC58162lY2, null, null), new C54432ex(enumC54222eY, null, A02, A02), false);
        InterfaceC02900Bo A00 = C0BQ.A00(eni4.A02);
        Context context2 = eni4.A00;
        if (context2 == null || !A00.AGB(context2, eni4.A02, user2)) {
            return;
        }
        A00.E45(context2, eni4.A01, eni4.A02, user2, eni4.A04);
        this.A00 = user2;
        C14360o3.A0B(userSession2, 1);
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = XFBFXIGPCEntryPoint.A0A;
        try {
            C1GJ.A03(AbstractC33657Eu7.A00(new C51756Mtf(xFBFXIGPCEntryPoint), userSession2));
        } catch (Exception e) {
            String obj = xFBFXIGPCEntryPoint.toString();
            String A0z = AbstractC166997dE.A0z("Failed to check user eligibility for IGPC to AC Upsell! \n%s", AbstractC166997dE.A1b(e.getMessage(), 1));
            AbstractC167017dG.A1N(userSession2, obj);
            C35191Ffj.A01(userSession2, "generic_error", obj, A0z);
        }
    }

    public C31770DxR(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ENI eni, Integer num, List list, List list2, List list3, List list4, boolean z, boolean z2, boolean z3) {
        Integer num2;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = eni;
        this.A05 = list;
        this.A09 = num;
        this.A0A = list2;
        this.A0B = list3;
        this.A0C = list4;
        this.A00 = AbstractC166987dD.A10(userSession);
        this.A07 = z;
        this.A08 = z2;
        if (z3) {
            num2 = C05F.A01;
        } else {
            num2 = C05F.A00;
        }
        this.A04 = new GAP(num2);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List list;
        int size;
        int size2;
        List list2;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType != 3) {
                        return null;
                    }
                    list = this.A0C;
                    size2 = AbstractC31172DnG.A02(this.A0A, this.A05.size());
                    list2 = this.A0B;
                } else {
                    list = this.A0B;
                    size2 = this.A05.size();
                    list2 = this.A0A;
                }
                size = AbstractC31172DnG.A02(list2, size2);
            } else {
                list = this.A0A;
                size = this.A05.size();
            }
            i -= size;
        } else {
            list = this.A05;
        }
        return list.get(i);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        Bitmap createBitmap;
        Icon createWithResource;
        if (getItem(i) != null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1 && itemViewType != 2) {
                    return false;
                }
                ENI eni = this.A03;
                C9GR.A09(eni.A00, AbstractC166997dE.A0N(eni).getText(2131956983));
                return true;
            }
            ENI eni2 = this.A03;
            User user = (User) getItem(i);
            View requireViewById = view.requireViewById(R.id.row_user_imageview);
            requireViewById.setDrawingCacheEnabled(true);
            if (requireViewById.getDrawingCache() == null) {
                createBitmap = null;
            } else {
                Bitmap drawingCache = requireViewById.getDrawingCache();
                C0fK.A03(drawingCache);
                createBitmap = Bitmap.createBitmap(drawingCache);
            }
            requireViewById.setDrawingCacheEnabled(false);
            Context context = eni2.A00;
            String id = user.getId();
            String username = user.getUsername();
            C14360o3.A0B(context, 0);
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager != null) {
                ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, AnonymousClass001.A0S(AbstractC111324zv.A00(1390), id, '\''));
                if (createBitmap != null) {
                    createWithResource = Icon.createWithAdaptiveBitmap(createBitmap);
                } else {
                    createWithResource = Icon.createWithResource(context, R.drawable.profile_anonymous_user);
                }
                ShortcutInfo build = builder.setIcon(createWithResource).setIntent(C93J.A00(id, username)).setShortLabel(username).setLongLabel(username).build();
                C14360o3.A07(build);
                try {
                    shortcutManager.requestPinShortcut(build, null);
                } catch (IllegalStateException unused) {
                    C0w9.A04("DedicatedPinnedShortcut", "IllegalStateException when requestPinShortcut", 1);
                }
            }
            C19740y2 A0Q = AbstractC31171DnF.A0Q();
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A0Q);
            A0P.E7G("long_press_account_switcher_row_to_create_shortcut_last_timestamp", currentTimeMillis);
            A0P.apply();
            return true;
        }
        return false;
    }
}
