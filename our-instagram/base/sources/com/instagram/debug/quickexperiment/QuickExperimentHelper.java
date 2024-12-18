package com.instagram.debug.quickexperiment;

import X.AbstractC03240Dh;
import X.AbstractC12990ll;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC20080yf;
import X.AbstractC25231BEo;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC53242c7;
import X.AbstractC55160OdO;
import X.AbstractC58319PtB;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C0K8;
import X.C0UI;
import X.C0fJ;
import X.C0tH;
import X.C140966Yy;
import X.C14360o3;
import X.C17280tP;
import X.C18U;
import X.C18V;
import X.C199928sw;
import X.C1AD;
import X.C229419w;
import X.C2I7;
import X.C2US;
import X.C31335Dq0;
import X.C35119FeM;
import X.C36731GHa;
import X.C5F7;
import X.C5NW;
import X.C8QJ;
import X.C9GR;
import X.EnumC124875ks;
import X.EnumC20090yg;
import X.EnumC72396Xcj;
import X.GHX;
import X.GHY;
import X.InterfaceC13300mG;
import X.InterfaceC199918sv;
import X.XkT;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.refresh.AppRestartUtil;
import com.instagram.debug.devoptions.refresh.DevOptionsRefreshEvent;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes11.dex */
public class QuickExperimentHelper {
    public static final double ALMOST_LOADED_NAMES_RATIO = 0.5d;
    public static final Object PARAMS_MAP_CACHE_LOCK = new Object();
    public static final String TAG = "QuickExperimentHelper";
    public static List mCachedExperimentParameters;
    public static C5F7 mCachedParamsMap;

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$1 */
    /* loaded from: classes11.dex */
    public class AnonymousClass1 implements InterfaceC199918sv {
        public final /* synthetic */ AbstractC20080yf val$experimentParameter;
        public final /* synthetic */ View val$v;

        public void onTouch(MotionEvent motionEvent) {
        }

        public AnonymousClass1(View view, AbstractC20080yf abstractC20080yf) {
            r1 = view;
            r2 = abstractC20080yf;
        }

        @Override // X.InterfaceC199918sv
        public void onClick() {
            ClipboardManager clipboardManager = (ClipboardManager) r1.getContext().getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("QE Universe Name", r2.universeName));
                C9GR.A09(r1.getContext(), AnonymousClass001.A0R("Copied to clipboard: ", r2.universeName));
            }
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$2 */
    /* loaded from: classes11.dex */
    public class AnonymousClass2 implements InterfaceC199918sv {
        public final /* synthetic */ AbstractC20080yf val$experimentParameter;
        public final /* synthetic */ View val$v;

        public void onTouch(MotionEvent motionEvent) {
        }

        public AnonymousClass2(View view, AbstractC20080yf abstractC20080yf) {
            r1 = view;
            r2 = abstractC20080yf;
        }

        @Override // X.InterfaceC199918sv
        public void onClick() {
            ClipboardManager clipboardManager = (ClipboardManager) r1.getContext().getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("QE Universe Name", r2.name));
                C9GR.A09(r1.getContext(), AnonymousClass001.A0R("Copied to clipboard: ", r2.name));
            }
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$3 */
    /* loaded from: classes11.dex */
    public class AnonymousClass3 implements InterfaceC199918sv {
        public final /* synthetic */ Set val$launcherTestRigDefaultParams;
        public final /* synthetic */ String val$paramName;
        public final /* synthetic */ View val$v;

        public void onTouch(MotionEvent motionEvent) {
        }

        public AnonymousClass3(Set set, String str, View view) {
            r1 = set;
            r2 = str;
            r3 = view;
        }

        @Override // X.InterfaceC199918sv
        public void onClick() {
            boolean contains = r1.contains(r2);
            Set set = r1;
            String str = r2;
            if (contains) {
                set.remove(str);
            } else {
                set.add(str);
            }
            C17280tP A00 = C17280tP.A00();
            Set set2 = r1;
            C14360o3.A0B(set2, 0);
            AbstractC31171DnF.A1S(A00, set2, A00.A25, C17280tP.A4G, 253);
            C9GR.A09(r3.getContext(), "Launcher Test Rig Defaults updated");
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$4 */
    /* loaded from: classes11.dex */
    public class AnonymousClass4 implements DialogInterface.OnClickListener {
        public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
        public final /* synthetic */ C2US val$listAdapter;
        public final /* synthetic */ GHY val$menuItem;
        public final /* synthetic */ AbstractC12990ll val$session;

        public AnonymousClass4(QuickExperimentDebugStore quickExperimentDebugStore, GHY ghy, AbstractC12990ll abstractC12990ll, C2US c2us) {
            r2 = quickExperimentDebugStore;
            r3 = ghy;
            r4 = abstractC12990ll;
            r5 = c2us;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            RecentQuickExperimentManager.markRecentExperimentParameter(AbstractC20080yf.this);
            r2.removeOverriddenParameter(AbstractC20080yf.this);
            r3.A08 = QuickExperimentHelper.getLabel(r4, AbstractC20080yf.this, r2);
            r5.notifyDataSetChanged();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$5 */
    /* loaded from: classes11.dex */
    public class AnonymousClass5 implements DialogInterface.OnClickListener {
        public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
        public final /* synthetic */ C2US val$listAdapter;
        public final /* synthetic */ GHY val$menuItem;
        public final /* synthetic */ AbstractC12990ll val$session;

        public AnonymousClass5(QuickExperimentDebugStore quickExperimentDebugStore, GHY ghy, AbstractC12990ll abstractC12990ll, C2US c2us) {
            r2 = quickExperimentDebugStore;
            r3 = ghy;
            r4 = abstractC12990ll;
            r5 = c2us;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            RecentQuickExperimentManager.markRecentExperimentParameter(AbstractC20080yf.this);
            QuickExperimentDebugStore quickExperimentDebugStore = r2;
            AbstractC20080yf abstractC20080yf = AbstractC20080yf.this;
            quickExperimentDebugStore.putOverriddenParameter(abstractC20080yf, String.valueOf(abstractC20080yf.getDefaultValue()));
            r3.A08 = QuickExperimentHelper.getLabel(r4, AbstractC20080yf.this, r2);
            r5.notifyDataSetChanged();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$6 */
    /* loaded from: classes11.dex */
    public class AnonymousClass6 implements DialogInterface.OnClickListener {
        public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
        public final /* synthetic */ EditText val$editText;
        public final /* synthetic */ C2US val$listAdapter;
        public final /* synthetic */ GHY val$menuItem;
        public final /* synthetic */ AbstractC12990ll val$session;

        public AnonymousClass6(EditText editText, QuickExperimentDebugStore quickExperimentDebugStore, GHY ghy, AbstractC12990ll abstractC12990ll, C2US c2us) {
            r2 = editText;
            r3 = quickExperimentDebugStore;
            r4 = ghy;
            r5 = abstractC12990ll;
            r6 = c2us;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            RecentQuickExperimentManager.markRecentExperimentParameter(AbstractC20080yf.this);
            if (!TextUtils.isEmpty(AbstractC167007dF.A0g(r2))) {
                r3.putOverriddenParameter(AbstractC20080yf.this, AbstractC167007dF.A0g(r2));
                r4.A08 = QuickExperimentHelper.getLabel(r5, AbstractC20080yf.this, r3);
                r6.notifyDataSetChanged();
            }
            dialogInterface.dismiss();
        }
    }

    public static GHY createSimpleMenuItem(final Context context, final AbstractC12990ll abstractC12990ll, final AbstractC20080yf abstractC20080yf, final QuickExperimentDebugStore quickExperimentDebugStore, final C2US c2us) {
        final GHY ghy = new GHY(context, (View.OnClickListener) null, getLabel(abstractC12990ll, abstractC20080yf, quickExperimentDebugStore));
        final String str = abstractC20080yf.universeName;
        final String str2 = abstractC20080yf.name;
        ghy.A05 = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0fJ.A00(QuickExperimentHelper.getSimpleDialog(context, abstractC12990ll, abstractC20080yf, str, str2, ghy, quickExperimentDebugStore, c2us));
            }
        };
        return ghy;
    }

    public static C36731GHa createSwitchItem(final AbstractC12990ll abstractC12990ll, final AbstractC20080yf abstractC20080yf, final QuickExperimentDebugStore quickExperimentDebugStore, final C2US c2us) {
        final C36731GHa c36731GHa = new C36731GHa((CompoundButton.OnCheckedChangeListener) null, getLabel(abstractC12990ll, abstractC20080yf, quickExperimentDebugStore), ((Boolean) peek(abstractC12990ll, abstractC20080yf).value).booleanValue());
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                QuickExperimentHelper.lambda$createSwitchItem$2(AbstractC20080yf.this, quickExperimentDebugStore, c36731GHa, abstractC12990ll, c2us, compoundButton, z);
            }
        };
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda3
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return QuickExperimentHelper.lambda$createSwitchItem$3(AbstractC12990ll.this, abstractC20080yf, view);
            }
        };
        c36731GHa.A08 = onCheckedChangeListener;
        c36731GHa.A07 = onLongClickListener;
        return c36731GHa;
    }

    public static /* synthetic */ boolean lambda$createSwitchItem$3(AbstractC12990ll abstractC12990ll, AbstractC20080yf abstractC20080yf, View view) {
        if (view != null) {
            Context context = view.getContext();
            UserSession userSession = (UserSession) abstractC12990ll;
            AbstractC167007dF.A1D(context, 1, userSession);
            C8QJ c8qj = new C8QJ(context, userSession, null, false);
            c8qj.A02(getContextMenuItems(view, abstractC20080yf));
            c8qj.showAsDropDown(view, 0, 0);
        }
        return true;
    }

    public static List setupMenuItems(Fragment fragment, UserSession userSession, List list, C2US c2us, boolean z) {
        return setupMenuItems(fragment, userSession, null, null, list, c2us, z, false);
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$7 */
    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$mobileconfig$factory$MobileConfigValueSource;
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$configuration$intf$SynchronizationResult;

        static {
            int[] iArr = new int[EnumC124875ks.values().length];
            $SwitchMap$com$instagram$configuration$intf$SynchronizationResult = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[MobileConfigValueSource.values().length];
            $SwitchMap$com$facebook$mobileconfig$factory$MobileConfigValueSource = iArr2;
            try {
                iArr2[MobileConfigValueSource.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MobileConfigValueSource.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MobileConfigValueSource.OVERRIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MobileConfigValueSource.DEFAULT__ACCESSED_BEFORE_MC_INIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MobileConfigValueSource.DEFAULT__ACCESSED_AFTER_MC_DISPOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MobileConfigValueSource.DEFAULT__NO_DATA_ON_DISK.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MobileConfigValueSource.DEFAULT__MISSING_SERVER_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes11.dex */
    public class ValueAndSource {
        public final Object defaultValue;
        public final Object latestValue;
        public final Object value;
        public final MobileConfigValueSource valueSource;

        public ValueAndSource(Object obj, Object obj2, Object obj3, MobileConfigValueSource mobileConfigValueSource) {
            this.value = obj;
            this.latestValue = obj2;
            this.defaultValue = obj3;
            this.valueSource = mobileConfigValueSource;
        }
    }

    public static List getAllExperiments() {
        List list;
        synchronized (PARAMS_MAP_CACHE_LOCK) {
            List list2 = mCachedExperimentParameters;
            list = list2;
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                C5F7 paramsMap = getParamsMap();
                list = arrayList;
                if (paramsMap != null) {
                    Iterator it = paramsMap.A03.iterator();
                    while (it.hasNext()) {
                        arrayList.add(createExperimentParameterFromParamsMapEntry((C5NW) it.next()));
                    }
                    list = arrayList;
                    if (mCachedParamsMap != null) {
                        mCachedExperimentParameters = arrayList;
                        list = arrayList;
                    }
                }
            }
        }
        return list;
    }

    public static EnumC72396Xcj getCategory(AbstractC20080yf abstractC20080yf) {
        long j = abstractC20080yf.mobileConfigSpecifier;
        int i = (int) ((j >>> 32) & 65535);
        int i2 = (int) ((j >>> 54) & 63);
        if (i2 < 3) {
            i2 = 1;
        }
        try {
            try {
                int i3 = XkT.A01[i2][i];
                if (i3 >= 0 && i3 < EnumC72396Xcj.values().length) {
                    return EnumC72396Xcj.values()[i3];
                }
                return EnumC72396Xcj.A0d;
            } catch (IndexOutOfBoundsException unused) {
                throw new Exception(String.format("Unknown unitType(%d) or configIndex(%d) from specifier (%d)", Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(j)));
            }
        } catch (C0UI e) {
            C0K8.A0M(TAG, "Failed to get category with specifier:%d", e, AbstractC58319PtB.A1Y(j));
            return EnumC72396Xcj.A0d;
        }
    }

    public static List getContextMenuItems(View view, AbstractC20080yf abstractC20080yf) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C199928sw(null, new InterfaceC199918sv() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper.1
            public final /* synthetic */ AbstractC20080yf val$experimentParameter;
            public final /* synthetic */ View val$v;

            public void onTouch(MotionEvent motionEvent) {
            }

            public AnonymousClass1(View view2, AbstractC20080yf abstractC20080yf2) {
                r1 = view2;
                r2 = abstractC20080yf2;
            }

            @Override // X.InterfaceC199918sv
            public void onClick() {
                ClipboardManager clipboardManager = (ClipboardManager) r1.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("QE Universe Name", r2.universeName));
                    C9GR.A09(r1.getContext(), AnonymousClass001.A0R("Copied to clipboard: ", r2.universeName));
                }
            }
        }, "Copy Universe Name"));
        arrayList.add(new C199928sw(null, new InterfaceC199918sv() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper.2
            public final /* synthetic */ AbstractC20080yf val$experimentParameter;
            public final /* synthetic */ View val$v;

            public void onTouch(MotionEvent motionEvent) {
            }

            public AnonymousClass2(View view2, AbstractC20080yf abstractC20080yf2) {
                r1 = view2;
                r2 = abstractC20080yf2;
            }

            @Override // X.InterfaceC199918sv
            public void onClick() {
                ClipboardManager clipboardManager = (ClipboardManager) r1.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("QE Universe Name", r2.name));
                    C9GR.A09(r1.getContext(), AnonymousClass001.A0R("Copied to clipboard: ", r2.name));
                }
            }
        }, "Copy Param Name"));
        C17280tP A00 = C17280tP.A00();
        HashSet hashSet = new HashSet((Collection) A00.A25.CES(A00, C17280tP.A4G[253]));
        String A0g = AnonymousClass001.A0g(abstractC20080yf2.universeName, ".", abstractC20080yf2.name);
        if (hashSet.contains(A0g)) {
            str = "Remove from Launcher Test Rig";
        } else {
            str = "Add to Launcher Test Rig";
        }
        arrayList.add(new C199928sw(null, new InterfaceC199918sv() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper.3
            public final /* synthetic */ Set val$launcherTestRigDefaultParams;
            public final /* synthetic */ String val$paramName;
            public final /* synthetic */ View val$v;

            public void onTouch(MotionEvent motionEvent) {
            }

            public AnonymousClass3(Set hashSet2, String A0g2, View view2) {
                r1 = hashSet2;
                r2 = A0g2;
                r3 = view2;
            }

            @Override // X.InterfaceC199918sv
            public void onClick() {
                boolean contains = r1.contains(r2);
                Set set = r1;
                String str2 = r2;
                if (contains) {
                    set.remove(str2);
                } else {
                    set.add(str2);
                }
                C17280tP A002 = C17280tP.A00();
                Set set2 = r1;
                C14360o3.A0B(set2, 0);
                AbstractC31171DnF.A1S(A002, set2, A002.A25, C17280tP.A4G, 253);
                C9GR.A09(r3.getContext(), "Launcher Test Rig Defaults updated");
            }
        }, str));
        return arrayList;
    }

    public static C229419w getDeviceSessionMobileConfig() {
        C18V c18v = C18V.A01;
        if (c18v == null) {
            return null;
        }
        return c18v.A01().A01.A00;
    }

    public static InterfaceC13300mG getForceQESyncCallback(Context context, Boolean bool) {
        return new QuickExperimentHelper$$ExternalSyntheticLambda5(context, bool);
    }

    public static InterfaceC13300mG getForceQESyncCallbackWithResult(final Context context, final Function function) {
        return new InterfaceC13300mG() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda7
            @Override // X.InterfaceC13300mG
            public final void run(Object obj) {
                QuickExperimentHelper.lambda$getForceQESyncCallbackWithResult$6(context, function, (EnumC124875ks) obj);
            }
        };
    }

    public static int getInputType(AbstractC20080yf abstractC20080yf) {
        int i = (int) ((abstractC20080yf.mobileConfigSpecifier >>> 48) & 63);
        if (i == 2) {
            return 4098;
        }
        if (i != 4) {
            return 1;
        }
        return ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED;
    }

    public static double getNamedParamsRatio(C5F7 c5f7) {
        int i = 0;
        for (C5NW c5nw : c5f7.A03) {
            if (AbstractC55160OdO.A03(c5nw.A00) && AbstractC55160OdO.A03(c5nw.A01)) {
                i++;
            }
        }
        return i / r4.size();
    }

    public static String getNiceUniverseName(String str) {
        return str.replaceAll("^(ig_|android_|launcher_)+", "").replaceAll("(_launcher|_universe)$", "").replace("_", " ");
    }

    public static List getOverriddenExperimentParameters(QuickExperimentDebugStore quickExperimentDebugStore) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC20080yf abstractC20080yf : getAllExperiments()) {
            if (quickExperimentDebugStore.isParameterOverridden(abstractC20080yf)) {
                arrayList.add(abstractC20080yf);
            }
        }
        return arrayList;
    }

    public static C5F7 getParamsMap(C229419w c229419w, boolean z) {
        if (z) {
            c229419w.A0D();
        }
        return c229419w.A0B();
    }

    public static Dialog getSimpleDialog(Context context, AbstractC12990ll abstractC12990ll, AbstractC20080yf abstractC20080yf, String str, String str2, GHY ghy, QuickExperimentDebugStore quickExperimentDebugStore, C2US c2us) {
        EditText editText = new EditText(context);
        editText.setInputType(getInputType(abstractC20080yf));
        editText.setText(String.valueOf(peek(abstractC12990ll, abstractC20080yf).value));
        return new AlertDialog.Builder(context).setTitle(abstractC20080yf.universeName).setMessage(AnonymousClass001.A0g("Override ", abstractC20080yf.name, ":")).setView(editText).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper.6
            public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
            public final /* synthetic */ EditText val$editText;
            public final /* synthetic */ C2US val$listAdapter;
            public final /* synthetic */ GHY val$menuItem;
            public final /* synthetic */ AbstractC12990ll val$session;

            public AnonymousClass6(EditText editText2, QuickExperimentDebugStore quickExperimentDebugStore2, GHY ghy2, AbstractC12990ll abstractC12990ll2, C2US c2us2) {
                r2 = editText2;
                r3 = quickExperimentDebugStore2;
                r4 = ghy2;
                r5 = abstractC12990ll2;
                r6 = c2us2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(AbstractC20080yf.this);
                if (!TextUtils.isEmpty(AbstractC167007dF.A0g(r2))) {
                    r3.putOverriddenParameter(AbstractC20080yf.this, AbstractC167007dF.A0g(r2));
                    r4.A08 = QuickExperimentHelper.getLabel(r5, AbstractC20080yf.this, r3);
                    r6.notifyDataSetChanged();
                }
                dialogInterface.dismiss();
            }
        }).setNeutralButton("Client Default", new DialogInterface.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper.5
            public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
            public final /* synthetic */ C2US val$listAdapter;
            public final /* synthetic */ GHY val$menuItem;
            public final /* synthetic */ AbstractC12990ll val$session;

            public AnonymousClass5(QuickExperimentDebugStore quickExperimentDebugStore2, GHY ghy2, AbstractC12990ll abstractC12990ll2, C2US c2us2) {
                r2 = quickExperimentDebugStore2;
                r3 = ghy2;
                r4 = abstractC12990ll2;
                r5 = c2us2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(AbstractC20080yf.this);
                QuickExperimentDebugStore quickExperimentDebugStore2 = r2;
                AbstractC20080yf abstractC20080yf2 = AbstractC20080yf.this;
                quickExperimentDebugStore2.putOverriddenParameter(abstractC20080yf2, String.valueOf(abstractC20080yf2.getDefaultValue()));
                r3.A08 = QuickExperimentHelper.getLabel(r4, AbstractC20080yf.this, r2);
                r5.notifyDataSetChanged();
                dialogInterface.dismiss();
            }
        }).setNegativeButton("No Override", new DialogInterface.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper.4
            public final /* synthetic */ QuickExperimentDebugStore val$debugStore;
            public final /* synthetic */ C2US val$listAdapter;
            public final /* synthetic */ GHY val$menuItem;
            public final /* synthetic */ AbstractC12990ll val$session;

            public AnonymousClass4(QuickExperimentDebugStore quickExperimentDebugStore2, GHY ghy2, AbstractC12990ll abstractC12990ll2, C2US c2us2) {
                r2 = quickExperimentDebugStore2;
                r3 = ghy2;
                r4 = abstractC12990ll2;
                r5 = c2us2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(AbstractC20080yf.this);
                r2.removeOverriddenParameter(AbstractC20080yf.this);
                r3.A08 = QuickExperimentHelper.getLabel(r4, AbstractC20080yf.this, r2);
                r5.notifyDataSetChanged();
                dialogInterface.dismiss();
            }
        }).create();
    }

    public static /* synthetic */ void lambda$setupMenuItems$0(UserSession userSession, Fragment fragment, AbstractC20080yf abstractC20080yf, View view) {
        AbstractC03240Dh.A00(new Bundle(), userSession);
        C140966Yy c140966Yy = new C140966Yy(fragment.requireActivity(), userSession);
        c140966Yy.A0E(QuickExperimentEditFragment.createWithUniverse(abstractC20080yf.universeName));
        c140966Yy.A08();
        c140966Yy.A04();
    }

    public static /* synthetic */ void lambda$setupMenuItems$1(UniverseCollapseTracker universeCollapseTracker, AbstractC20080yf abstractC20080yf, Runnable runnable, View view) {
        universeCollapseTracker.toggleCollapsedState(abstractC20080yf.universeName);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static AbstractC20080yf createExperimentParameterFromParamsMapEntry(C5NW c5nw) {
        long A00 = c5nw.A00();
        int i = c5nw.A08;
        String str = c5nw.A01;
        if (str.isEmpty()) {
            str = AnonymousClass001.A0R("_", String.valueOf(c5nw.A04));
        }
        String str2 = c5nw.A00;
        if (str2.isEmpty()) {
            str2 = AnonymousClass001.A0R("_", String.valueOf(c5nw.A03));
        }
        if (i == 2) {
            AbstractC167017dG.A1N(str, str2);
            return new AbstractC20080yf(str, str2, EnumC20090yg.A03, A00);
        }
        AbstractC167017dG.A1N(str, str2);
        return new AbstractC20080yf(str, str2, EnumC20090yg.A02, A00);
    }

    public static void forceUserQESync(Context context, C18V c18v, UserSession userSession, InterfaceC13300mG interfaceC13300mG) {
        int i;
        if (!C17280tP.A00().A0O() && !C17280tP.A00().A0P()) {
            if (C17280tP.A00().A0Q()) {
                i = 2131957838;
            }
            c18v.A07(userSession, true);
            c18v.A00(userSession, EnumC20090yg.A03).A00(interfaceC13300mG);
            AbstractC25651Mw.A00(userSession).E4s(DevOptionsRefreshEvent.INSTANCE);
        }
        i = 2131958447;
        C9GR.A08(context, i, 1);
        c18v.A07(userSession, true);
        c18v.A00(userSession, EnumC20090yg.A03).A00(interfaceC13300mG);
        AbstractC25651Mw.A00(userSession).E4s(DevOptionsRefreshEvent.INSTANCE);
    }

    public static String getLabel(AbstractC12990ll abstractC12990ll, AbstractC20080yf abstractC20080yf, QuickExperimentDebugStore quickExperimentDebugStore) {
        String str;
        ValueAndSource peek = peek(abstractC12990ll, abstractC20080yf);
        MobileConfigValueSource mobileConfigValueSource = peek.valueSource;
        switch (mobileConfigValueSource) {
            case UNKNOWN:
                str = "unknown";
                break;
            case SERVER:
                str = "server";
                break;
            case OVERRIDE:
                str = QuickExperimentDumperPlugin.OVERRIDE_CMD;
                break;
            case DEFAULT__SERVER_RETURNED_NULL:
                str = "default[null server value]";
                break;
            case DEFAULT__ACCESSED_BEFORE_MC_INIT:
                str = "default[before mc init]";
                break;
            case DEFAULT__NO_DATA_ON_DISK:
                str = "default[no data]";
                break;
            case DEFAULT__ACCESSED_AFTER_MC_DISPOSE:
                str = "default[after mc dispose]";
                break;
            case DEFAULT__MISSING_SERVER_VALUE:
                str = "default[missing server value]";
                break;
            default:
                str = AnonymousClass001.A0c("ValueSource[", "]", mobileConfigValueSource.getSource());
                break;
        }
        if ((mobileConfigValueSource == MobileConfigValueSource.SERVER || mobileConfigValueSource == MobileConfigValueSource.OVERRIDE) && C2I7.A00(peek.value, peek.defaultValue)) {
            str = AnonymousClass001.A0R(str, ",default");
        }
        if (C2I7.A00(peek.value, peek.latestValue)) {
            str = AnonymousClass001.A0R(str, ",latest");
        }
        return AnonymousClass001.A13(abstractC20080yf.name.replace("_", " "), " = ", peek.value.toString(), "\n(", str, ")");
    }

    public static /* synthetic */ void lambda$createSwitchItem$2(AbstractC20080yf abstractC20080yf, QuickExperimentDebugStore quickExperimentDebugStore, C36731GHa c36731GHa, AbstractC12990ll abstractC12990ll, C2US c2us, CompoundButton compoundButton, boolean z) {
        RecentQuickExperimentManager.markRecentExperimentParameter(abstractC20080yf);
        quickExperimentDebugStore.putOverriddenParameter(abstractC20080yf, String.valueOf(z));
        c36731GHa.A0B = getLabel(abstractC12990ll, abstractC20080yf, quickExperimentDebugStore);
        c2us.notifyDataSetChanged();
    }

    public static /* synthetic */ void lambda$getForceQESyncCallback$7(EnumC124875ks enumC124875ks, Context context, Boolean bool) {
        String str;
        int ordinal = enumC124875ks.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal != 3) {
                    if (ordinal == 2) {
                        if (bool.booleanValue()) {
                            AppRestartUtil.restartAppHard(context);
                            return;
                        }
                        str = "launcher values will take effect at next cold start";
                    } else {
                        return;
                    }
                } else {
                    str = "Fetched latest launcher values; nothing updated";
                }
            } else {
                str = "Did not sync";
            }
        } else {
            str = "Network Error";
        }
        C9GR.A09(context, str);
    }

    public static /* synthetic */ void lambda$getForceQESyncCallback$8(final Context context, final Boolean bool, final EnumC124875ks enumC124875ks) {
        enumC124875ks.getClass();
        new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                QuickExperimentHelper.lambda$getForceQESyncCallback$7(EnumC124875ks.this, context, bool);
            }
        });
    }

    public static /* synthetic */ void lambda$getForceQESyncCallbackWithResult$5(EnumC124875ks enumC124875ks, Context context, Function function) {
        String str;
        int ordinal = enumC124875ks.ordinal();
        boolean z = true;
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal != 3) {
                    if (ordinal == 2) {
                        str = "launcher values will take effect at next cold start";
                    }
                    if (enumC124875ks != EnumC124875ks.A05 && enumC124875ks != EnumC124875ks.A04) {
                        z = false;
                    }
                    function.apply(Boolean.valueOf(z));
                }
                str = "Fetched latest launcher values; nothing updated";
            } else {
                str = "Did not sync";
            }
        } else {
            str = "Network Error";
        }
        C9GR.A09(context, str);
        if (enumC124875ks != EnumC124875ks.A05) {
            z = false;
        }
        function.apply(Boolean.valueOf(z));
    }

    public static /* synthetic */ void lambda$getForceQESyncCallbackWithResult$6(final Context context, final Function function, final EnumC124875ks enumC124875ks) {
        enumC124875ks.getClass();
        new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                QuickExperimentHelper.lambda$getForceQESyncCallbackWithResult$5(EnumC124875ks.this, context, function);
            }
        });
    }

    public static ValueAndSource peek(AbstractC12990ll abstractC12990ll, AbstractC20080yf abstractC20080yf) {
        C229419w A02;
        Object valueOf;
        Object defaultValue = abstractC20080yf.getDefaultValue();
        long j = abstractC20080yf.mobileConfigSpecifier;
        if (abstractC20080yf instanceof C0tH) {
            A02 = C18U.A02(abstractC12990ll, j);
        } else {
            A02 = C1AD.A02(j);
        }
        Object obj = null;
        if (A02 == null) {
            return new ValueAndSource(null, null, defaultValue, MobileConfigValueSource.UNKNOWN);
        }
        C06090Tz A00 = C06090Tz.A00(new C06090Tz());
        A00.A03 = true;
        C06090Tz A002 = C06090Tz.A00(A00);
        A002.A02 = true;
        C06090Tz A003 = C06090Tz.A00(new C06090Tz());
        A003.A03 = true;
        C06090Tz A004 = C06090Tz.A00(A003);
        A004.A01 = true;
        int i = (int) ((j >>> 48) & 63);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        valueOf = null;
                    } else {
                        obj = Double.valueOf(A02.AzB(A002, j));
                        valueOf = Double.valueOf(A02.AzB(A004, j));
                    }
                } else {
                    obj = A02.C2x(A002, j);
                    valueOf = A02.C2x(A004, j);
                }
            } else {
                obj = Long.valueOf(A02.BPF(A002, j));
                valueOf = Long.valueOf(A02.BPF(A004, j));
            }
        } else {
            obj = Boolean.valueOf(A02.AhE(A002, j));
            valueOf = Boolean.valueOf(A02.AhE(A004, j));
        }
        return new ValueAndSource(obj, valueOf, defaultValue, A002.A00.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (getNamedParamsRatio(r3) > 0.5d) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C5F7 getParamsMap() {
        /*
            java.lang.Object r8 = com.instagram.debug.quickexperiment.QuickExperimentHelper.PARAMS_MAP_CACHE_LOCK
            monitor-enter(r8)
            X.5F7 r3 = com.instagram.debug.quickexperiment.QuickExperimentHelper.mCachedParamsMap     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L31
            X.19w r7 = getDeviceSessionMobileConfig()     // Catch: java.lang.Throwable -> L35
            r6 = 0
            if (r7 == 0) goto L33
            X.5F7 r3 = r7.A0B()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L33
            double r1 = getNamedParamsRatio(r3)     // Catch: java.lang.Throwable -> L35
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L2f
            r7.A0D()     // Catch: java.lang.Throwable -> L35
            X.5F7 r3 = r7.A0B()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L33
            double r1 = getNamedParamsRatio(r3)     // Catch: java.lang.Throwable -> L35
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L31
        L2f:
            com.instagram.debug.quickexperiment.QuickExperimentHelper.mCachedParamsMap = r3     // Catch: java.lang.Throwable -> L35
        L31:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L35
            return r3
        L33:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L35
            return r6
        L35:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L35
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.QuickExperimentHelper.getParamsMap():X.5F7");
    }

    public static List setupMenuItems(final Fragment fragment, final UserSession userSession, final UniverseCollapseTracker universeCollapseTracker, final Runnable runnable, List list, C2US c2us, boolean z, boolean z2) {
        Object createSimpleMenuItem;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (userSession == null) {
            str2 = "getMenuItems yield with unexpected null user session.";
        } else {
            Context context = fragment.getContext();
            if (context != null) {
                QuickExperimentDebugStore overrideStore = QuickExperimentDebugStoreManager.getOverrideStore(userSession);
                HashSet hashSet = new HashSet();
                EnumC72396Xcj enumC72396Xcj = null;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final AbstractC20080yf abstractC20080yf = (AbstractC20080yf) it.next();
                    EnumC72396Xcj category = getCategory(abstractC20080yf);
                    if (category != enumC72396Xcj && z) {
                        if (enumC72396Xcj != null) {
                            C35119FeM.A00(arrayList, true);
                        }
                        arrayList.add(new C31335Dq0(category.A01));
                        enumC72396Xcj = category;
                    }
                    String niceUniverseName = getNiceUniverseName(abstractC20080yf.universeName);
                    if (!hashSet.contains(abstractC20080yf.universeName)) {
                        if (z2) {
                            str = fragment.getString(2131963265);
                        } else {
                            str = "";
                        }
                        GHX ghx = new GHX(niceUniverseName, str);
                        if (z2) {
                            ghx.A03 = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    QuickExperimentHelper.lambda$setupMenuItems$0(UserSession.this, fragment, abstractC20080yf, view);
                                }
                            };
                        }
                        if (universeCollapseTracker != null) {
                            boolean isCollapsed = universeCollapseTracker.isCollapsed(abstractC20080yf.universeName);
                            int i = R.drawable.instagram_chevron_down_pano_filled_24;
                            if (isCollapsed) {
                                i = R.drawable.instagram_chevron_right_pano_filled_24;
                            }
                            Drawable drawable = context.getDrawable(i);
                            AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon));
                            ghx.A02 = drawable;
                            ghx.A04 = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentHelper$$ExternalSyntheticLambda1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    QuickExperimentHelper.lambda$setupMenuItems$1(UniverseCollapseTracker.this, abstractC20080yf, runnable, view);
                                }
                            };
                        }
                        arrayList.add(ghx);
                        hashSet.add(abstractC20080yf.universeName);
                    }
                    if (universeCollapseTracker == null || !universeCollapseTracker.isCollapsed(abstractC20080yf.universeName)) {
                        if (((int) ((abstractC20080yf.mobileConfigSpecifier >>> 48) & 63)) == 1) {
                            createSimpleMenuItem = createSwitchItem(userSession, abstractC20080yf, overrideStore, c2us);
                        } else {
                            createSimpleMenuItem = createSimpleMenuItem(context, userSession, abstractC20080yf, overrideStore, c2us);
                        }
                        arrayList.add(createSimpleMenuItem);
                    }
                }
                return arrayList;
            }
            str2 = "Returning empty menu items due to null parent context, probably the research result returned after user left the search UI";
        }
        C0K8.A0D(TAG, str2);
        return arrayList;
    }
}
