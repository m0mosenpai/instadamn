package com.instagram.debug.devoptions.helper;

import X.AbstractC111324zv;
import X.AbstractC12960li;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC16960so;
import X.AbstractC19730y1;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC46222Ag;
import X.AnonymousClass001;
import X.C11L;
import X.C140966Yy;
import X.C14360o3;
import X.C193328hC;
import X.C36731GHa;
import X.C9GR;
import X.GHY;
import X.InterfaceC13000lm;
import X.InterfaceC19630xq;
import X.MSV;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class DevOptionsHelper implements InterfaceC13000lm {
    public static final Companion Companion = new Object();
    public final Map _optionNameToMenuItems = new HashMap();
    public final Map _optionNameToSwitchItems = new HashMap();

    /* loaded from: classes11.dex */
    public final class Companion {
        public final DevOptionsHelper getInstance(UserSession userSession) {
            C14360o3.A0B(userSession, 0);
            return (DevOptionsHelper) userSession.A01(DevOptionsHelper.class, DevOptionsHelper$Companion$getInstance$1.INSTANCE);
        }

        public final void launchFragment(UserSession userSession, Activity activity, String str) {
            AbstractC167007dF.A1K(userSession, activity);
            try {
                Object newInstance = Class.forName(str).newInstance();
                C14360o3.A0C(newInstance, AbstractC111324zv.A00(29));
                launchFragment(userSession, activity, (Fragment) newInstance, false);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public final void removePinnedItemInPrefs(String str) {
            C14360o3.A0B(str, 0);
            InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
            List convertToArray = convertToArray(interfaceC19630xq.getString("rageshake_pinned_items_as_json", null));
            convertToArray.remove(str);
            AbstractC31176DnK.A1X(interfaceC19630xq, "rageshake_pinned_items_as_json", AbstractC31175DnJ.A0a(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, convertToArray));
        }

        private final List convertToArray(String str) {
            if (str == null) {
                return new ArrayList();
            }
            String[] A1b = AbstractC31173DnH.A1b(new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(str), 0);
            return AbstractC16960so.A1N(Arrays.copyOf(A1b, A1b.length));
        }

        private final String convertToString(List list) {
            return AbstractC31175DnJ.A0a(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPinnedItem(String str) {
            return convertToArray(AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("rageshake_pinned_items_as_json", null)).contains(str);
        }

        public static /* synthetic */ void launchFragment$default(Companion companion, UserSession userSession, Activity activity, Fragment fragment, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            companion.launchFragment(userSession, activity, fragment, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void storePinnedItemInPrefs(String str) {
            InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
            List convertToArray = convertToArray(interfaceC19630xq.getString("rageshake_pinned_items_as_json", null));
            convertToArray.add(str);
            AbstractC31176DnK.A1X(interfaceC19630xq, "rageshake_pinned_items_as_json", AbstractC31175DnJ.A0a(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, convertToArray));
        }

        public final List getPinnedItems() {
            return convertToArray(AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("rageshake_pinned_items_as_json", null));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final GHY addLongPressToPin(final GHY ghy, final OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AbstractC167017dG.A1N(ghy, onPinnedDevOptionItemAdded);
            if (!AbstractC46222Ag.A00()) {
                ghy.A06 = new View.OnLongClickListener() { // from class: com.instagram.debug.devoptions.helper.DevOptionsHelper$Companion$addLongPressToPin$1$1
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean isPinnedItem;
                        final Context context = view.getContext();
                        GHY ghy2 = GHY.this;
                        C14360o3.A0A(context);
                        C14360o3.A0B(context, 0);
                        Object obj = ghy2.A08;
                        if (obj == null) {
                            obj = context.getString(ghy2.A04);
                        }
                        final String obj2 = obj.toString();
                        isPinnedItem = DevOptionsHelper.Companion.isPinnedItem(obj2);
                        if (isPinnedItem) {
                            return false;
                        }
                        C193328hC c193328hC = new C193328hC(context);
                        c193328hC.A0A(2131952265);
                        c193328hC.A0r(AbstractC167007dF.A0f(context, obj2, 2131971448));
                        final DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded2 = onPinnedDevOptionItemAdded;
                        c193328hC.A0F(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.helper.DevOptionsHelper$Companion$addLongPressToPin$1$1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                DevOptionsHelper.Companion.storePinnedItemInPrefs(obj2);
                                onPinnedDevOptionItemAdded2.onMenuItemAdded();
                                C9GR.A09(context, AnonymousClass001.A0R("Added ", obj2));
                            }
                        });
                        c193328hC.A0t(true);
                        c193328hC.A06();
                        AbstractC166987dD.A1W(c193328hC);
                        return true;
                    }
                };
            }
            return ghy;
        }

        public final void addMenuItem(UserSession userSession, List list, GHY ghy, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AbstractC167027dH.A13(list, ghy, onPinnedDevOptionItemAdded);
            addLongPressToPin(ghy, onPinnedDevOptionItemAdded);
            list.add(ghy);
        }

        public final void addSwitchItem(UserSession userSession, List list, C36731GHa c36731GHa, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AbstractC167027dH.A13(list, c36731GHa, onPinnedDevOptionItemAdded);
            addLongPressToPin(c36731GHa, onPinnedDevOptionItemAdded);
            list.add(c36731GHa);
        }

        public Companion() {
        }

        private final void launchFragment(UserSession userSession, Activity activity, Fragment fragment, boolean z) {
            C14360o3.A0C(activity, MSV.A00(0));
            C140966Yy A0N = AbstractC31174DnI.A0N(fragment, (FragmentActivity) activity, userSession);
            if (z) {
                A0N.A08();
            }
            A0N.A04();
        }

        public final C36731GHa addLongPressToPin(final C36731GHa c36731GHa, final OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AbstractC167017dG.A1N(c36731GHa, onPinnedDevOptionItemAdded);
            if (!AbstractC46222Ag.A00()) {
                c36731GHa.A07 = new View.OnLongClickListener() { // from class: com.instagram.debug.devoptions.helper.DevOptionsHelper$Companion$addLongPressToPin$2$1
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean isPinnedItem;
                        final Context context = view.getContext();
                        C36731GHa c36731GHa2 = C36731GHa.this;
                        C14360o3.A0A(context);
                        C14360o3.A0B(context, 0);
                        Object obj = c36731GHa2.A0B;
                        if (obj == null) {
                            obj = context.getString(c36731GHa2.A04);
                        }
                        final String obj2 = obj.toString();
                        isPinnedItem = DevOptionsHelper.Companion.isPinnedItem(obj2);
                        if (isPinnedItem) {
                            return false;
                        }
                        C193328hC c193328hC = new C193328hC(context);
                        c193328hC.A0A(2131952265);
                        c193328hC.A0r(AbstractC167007dF.A0f(context, obj2, 2131971448));
                        final DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded2 = onPinnedDevOptionItemAdded;
                        c193328hC.A0F(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.helper.DevOptionsHelper$Companion$addLongPressToPin$2$1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                DevOptionsHelper.Companion.storePinnedItemInPrefs(obj2);
                                onPinnedDevOptionItemAdded2.onMenuItemAdded();
                                C9GR.A09(context, AnonymousClass001.A0R("Added ", obj2));
                            }
                        });
                        c193328hC.A0t(true);
                        c193328hC.A06();
                        AbstractC166987dD.A1W(c193328hC);
                        return true;
                    }
                };
            }
            return c36731GHa;
        }
    }

    /* loaded from: classes11.dex */
    public interface OnPinnedDevOptionItemAdded {
        void onMenuItemAdded();
    }

    public static final DevOptionsHelper getInstance(UserSession userSession) {
        return Companion.getInstance(userSession);
    }

    public static final List getPinnedItems() {
        return Companion.getPinnedItems();
    }

    public static final void launchFragment(UserSession userSession, Activity activity, String str) {
        Companion.launchFragment(userSession, activity, str);
    }

    public static final void removePinnedItemInPrefs(String str) {
        Companion.removePinnedItemInPrefs(str);
    }

    public static final void addMenuItem(UserSession userSession, List list, GHY ghy, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        Companion companion = Companion;
        AbstractC167027dH.A13(list, ghy, onPinnedDevOptionItemAdded);
        companion.addLongPressToPin(ghy, onPinnedDevOptionItemAdded);
        list.add(ghy);
    }

    public static final void addSwitchItem(UserSession userSession, List list, C36731GHa c36731GHa, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        Companion companion = Companion;
        AbstractC167027dH.A13(list, c36731GHa, onPinnedDevOptionItemAdded);
        companion.addLongPressToPin(c36731GHa, onPinnedDevOptionItemAdded);
        list.add(c36731GHa);
    }

    public final Map getMenuItemMap() {
        return this._optionNameToMenuItems;
    }

    public final Map getSwitchItemMap() {
        return this._optionNameToSwitchItems;
    }

    @Override // X.InterfaceC13000lm
    public void onSessionWillEnd() {
        this._optionNameToMenuItems.clear();
    }

    public final void storeItems(Context context, List list) {
        AbstractC167017dG.A1N(context, list);
        if (this._optionNameToMenuItems.isEmpty() && list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof GHY) {
                    GHY ghy = (GHY) obj;
                    Object obj2 = ghy.A08;
                    if (obj2 == null) {
                        obj2 = context.getString(ghy.A04);
                    }
                    if (obj2.toString().length() > 0) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList<GHY> A0i = AbstractC167007dF.A0i(arrayList);
            for (Object obj3 : arrayList) {
                C14360o3.A0C(obj3, AbstractC111324zv.A00(2799));
                A0i.add(obj3);
            }
            for (GHY ghy2 : A0i) {
                Map map = this._optionNameToMenuItems;
                Object obj4 = ghy2.A08;
                if (obj4 == null) {
                    obj4 = context.getString(ghy2.A04);
                }
                map.put(obj4.toString(), ghy2);
            }
        }
        if (this._optionNameToSwitchItems.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj5 : list) {
                if (obj5 instanceof C36731GHa) {
                    C36731GHa c36731GHa = (C36731GHa) obj5;
                    Object obj6 = c36731GHa.A0B;
                    if (obj6 == null) {
                        obj6 = context.getString(c36731GHa.A04);
                    }
                    if (obj6.toString().length() > 0) {
                        arrayList2.add(obj5);
                    }
                }
            }
            ArrayList<C36731GHa> A0i2 = AbstractC167007dF.A0i(arrayList2);
            for (Object obj7 : arrayList2) {
                C14360o3.A0C(obj7, AbstractC111324zv.A00(1146));
                A0i2.add(obj7);
            }
            for (C36731GHa c36731GHa2 : A0i2) {
                Map map2 = this._optionNameToSwitchItems;
                Object obj8 = c36731GHa2.A0B;
                if (obj8 == null) {
                    obj8 = context.getString(c36731GHa2.A04);
                }
                map2.put(obj8.toString(), c36731GHa2);
            }
        }
    }
}
