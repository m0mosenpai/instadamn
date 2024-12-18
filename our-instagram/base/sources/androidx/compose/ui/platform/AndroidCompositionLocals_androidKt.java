package androidx.compose.ui.platform;

import X.AbstractC117695Ue;
import X.AbstractC74873Yc;
import X.AbstractC74903Yf;
import X.AnonymousClass001;
import X.C08T;
import X.C08U;
import X.C0eB;
import X.C0fH;
import X.C117505Tk;
import X.C117685Ud;
import X.C117735Uj;
import X.C117745Uk;
import X.C117755Ul;
import X.C117765Um;
import X.C117775Un;
import X.C117785Uo;
import X.C117795Up;
import X.C117805Uq;
import X.C117825Us;
import X.C117835Ut;
import X.C117865Uw;
import X.C117885Uy;
import X.C14360o3;
import X.C206999Ee;
import X.C207469Fz;
import X.C5Tl;
import X.C5U5;
import X.C5UA;
import X.C5UI;
import X.C5UP;
import X.C5UQ;
import X.C5UT;
import X.C5UU;
import X.C5UX;
import X.C5V0;
import X.C5V2;
import X.C5VN;
import X.C5VP;
import X.C74883Yd;
import X.C9F3;
import X.C9FD;
import X.C9FN;
import X.InterfaceC08430c6;
import X.InterfaceC09390do;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC74953Yl;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class AndroidCompositionLocals_androidKt {
    public static final C5UP A00 = new C117745Uk(AbstractC74873Yc.A00(), C117735Uj.A00);
    public static final C5UP A01 = new C5UQ(C117755Ul.A00);
    public static final C5UP A04 = new C5UQ(C117765Um.A00);
    public static final C5UP A05 = new C5UQ(C117775Un.A00);
    public static final C5UP A02 = new C5UQ(C117785Uo.A00);
    public static final C5UP A03 = new C5UQ(C117795Up.A00);

    public static final /* synthetic */ void A01(String str) {
        throw new IllegalStateException(AnonymousClass001.A0g("CompositionLocal ", str, " not present"));
    }

    public static final C5UP getLocalLifecycleOwner() {
        return C5VN.A00;
    }

    public static final void A00(C5Tl c5Tl, AndroidComposeView androidComposeView, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        String valueOf;
        LinkedHashMap linkedHashMap;
        boolean z;
        c5Tl.Enr(1396852028);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(androidComposeView)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = 16;
            if (c5Tl.AH6(interfaceC16620sF)) {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1609010939, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context = androidComposeView.getContext();
            Object EEc = c5Tl.EEc();
            Object obj = C5UI.A00;
            if (EEc == obj) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                C74883Yd A002 = AbstractC74873Yc.A00();
                InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
                EEc = new ParcelableSnapshotMutableState(A002, configuration);
                ((C117505Tk) c5Tl).A0Q(EEc);
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) EEc;
            Object EEc2 = c5Tl.EEc();
            if (EEc2 == obj) {
                EEc2 = new C206999Ee(interfaceC74953Yl, 7);
                c5Tl.FBy(EEc2);
            }
            androidComposeView.A06 = (InterfaceC16660sJ) EEc2;
            Object EEc3 = c5Tl.EEc();
            if (EEc3 == obj) {
                EEc3 = new C117805Uq(context);
                ((C117505Tk) c5Tl).A0Q(EEc3);
            }
            C5U5 viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners != null) {
                Object EEc4 = c5Tl.EEc();
                if (EEc4 == obj) {
                    InterfaceC08430c6 interfaceC08430c6 = viewTreeOwners.A01;
                    Object parent = androidComposeView.getParent();
                    C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.View");
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    if (!(tag instanceof String) || (valueOf = (String) tag) == null) {
                        valueOf = String.valueOf(view.getId());
                    }
                    String A0T = AnonymousClass001.A0T("SaveableStateRegistry", valueOf, ':');
                    C08U savedStateRegistry = interfaceC08430c6.getSavedStateRegistry();
                    Bundle A003 = savedStateRegistry.A00(A0T);
                    if (A003 != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (String str : A003.keySet()) {
                            ArrayList parcelableArrayList = A003.getParcelableArrayList(str);
                            C14360o3.A0C(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                            linkedHashMap.put(str, parcelableArrayList);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    final C117835Ut c117835Ut = new C117835Ut(linkedHashMap, C117825Us.A00);
                    try {
                        savedStateRegistry.A03(new C08T() { // from class: X.5Uv
                            @Override // X.C08T
                            public final Bundle ELr() {
                                ArrayList<? extends Parcelable> arrayList;
                                Map E4F = InterfaceC117845Uu.this.E4F();
                                Bundle bundle = new Bundle();
                                for (Map.Entry entry : E4F.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    List list = (List) entry.getValue();
                                    if (list instanceof ArrayList) {
                                        arrayList = (ArrayList) list;
                                    } else {
                                        arrayList = new ArrayList<>(list);
                                    }
                                    bundle.putParcelableArrayList(str2, arrayList);
                                }
                                return bundle;
                            }
                        }, A0T);
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                    EEc4 = new C117865Uw(c117835Ut, new C207469Fz(savedStateRegistry, A0T, 0, z));
                    ((C117505Tk) c5Tl).A0Q(EEc4);
                }
                C0eB c0eB = C0eB.A00;
                boolean AH6 = c5Tl.AH6(EEc4);
                Object EEc5 = c5Tl.EEc();
                if (AH6 || EEc5 == obj) {
                    EEc5 = new C206999Ee(EEc4, 8);
                    c5Tl.FBy(EEc5);
                }
                C5UX.A03(c5Tl, c0eB, (InterfaceC16660sJ) EEc5);
                Configuration configuration2 = (Configuration) interfaceC74953Yl.getValue();
                if (C0fH.A02()) {
                    C0fH.A01(-1298978053, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
                }
                Object EEc6 = c5Tl.EEc();
                if (EEc6 == obj) {
                    EEc6 = new C117885Uy();
                    ((C117505Tk) c5Tl).A0Q(EEc6);
                }
                final C117885Uy c117885Uy = (C117885Uy) EEc6;
                Object EEc7 = c5Tl.EEc();
                Object obj2 = EEc7;
                if (EEc7 == obj) {
                    Configuration configuration3 = new Configuration();
                    if (configuration2 != null) {
                        configuration3.setTo(configuration2);
                    }
                    c5Tl.FBy(configuration3);
                    obj2 = configuration3;
                }
                final Configuration configuration4 = (Configuration) obj2;
                Object EEc8 = c5Tl.EEc();
                if (EEc8 == obj) {
                    EEc8 = new ComponentCallbacks2() { // from class: X.5Uz
                        @Override // android.content.ComponentCallbacks
                        public final void onConfigurationChanged(Configuration configuration5) {
                            Configuration configuration6 = configuration4;
                            configuration6.updateFrom(configuration5);
                            Iterator it = c117885Uy.A00.entrySet().iterator();
                            while (it.hasNext()) {
                                ((Reference) ((Map.Entry) it.next()).getValue()).get();
                                it.remove();
                            }
                            configuration6.setTo(configuration5);
                        }

                        @Override // android.content.ComponentCallbacks
                        public final void onLowMemory() {
                            c117885Uy.A00.clear();
                        }

                        @Override // android.content.ComponentCallbacks2
                        public final void onTrimMemory(int i5) {
                            c117885Uy.A00.clear();
                        }
                    };
                    ((C117505Tk) c5Tl).A0Q(EEc8);
                }
                boolean AH62 = c5Tl.AH6(context);
                Object EEc9 = c5Tl.EEc();
                if (AH62 || EEc9 == obj) {
                    EEc9 = new C9F3(13, context, EEc8);
                    c5Tl.FBy(EEc9);
                }
                C5UX.A03(c5Tl, c117885Uy, (InterfaceC16660sJ) EEc9);
                if (C0fH.A02()) {
                    C0fH.A00(1903363574);
                }
                if (C0fH.A02()) {
                    C0fH.A01(1984987453, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
                }
                Object EEc10 = c5Tl.EEc();
                if (EEc10 == obj) {
                    EEc10 = new C5V0();
                    ((C117505Tk) c5Tl).A0Q(EEc10);
                }
                final C5V0 c5v0 = (C5V0) EEc10;
                Object EEc11 = c5Tl.EEc();
                if (EEc11 == obj) {
                    EEc11 = new ComponentCallbacks2() { // from class: X.5V1
                        @Override // android.content.ComponentCallbacks
                        public final void onConfigurationChanged(Configuration configuration5) {
                            C5V0.this.A00();
                        }

                        @Override // android.content.ComponentCallbacks
                        public final void onLowMemory() {
                            C5V0.this.A00();
                        }

                        @Override // android.content.ComponentCallbacks2
                        public final void onTrimMemory(int i5) {
                            C5V0.this.A00();
                        }
                    };
                    ((C117505Tk) c5Tl).A0Q(EEc11);
                }
                boolean AH63 = c5Tl.AH6(context);
                Object EEc12 = c5Tl.EEc();
                if (AH63 || EEc12 == obj) {
                    EEc12 = new C9F3(14, context, EEc11);
                    c5Tl.FBy(EEc12);
                }
                C5UX.A03(c5Tl, c5v0, (InterfaceC16660sJ) EEc12);
                if (C0fH.A02()) {
                    C0fH.A00(-1020397719);
                }
                C5UP c5up = C5V2.A09;
                AbstractC117695Ue.A01(c5Tl, C5UA.A01(c5Tl, new C9FN(0, androidComposeView, EEc3, interfaceC16620sF), 1471621628), new C117685Ud[]{A00.A02(interfaceC74953Yl.getValue()), A01.A02(context), C5VN.A00.A02(viewTreeOwners.A00), A02.A02(viewTreeOwners.A01), C5VP.A00.A02(EEc4), A03.A02(androidComposeView), A04.A02(c117885Uy), A05.A02(c5v0), c5up.A02(Boolean.valueOf(((Boolean) C5UT.A01(c5up, C117505Tk.A04((C117505Tk) c5Tl))).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release()))}, 56);
                if (C0fH.A02()) {
                    C0fH.A00(195263100);
                }
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C9FD(i, 2, interfaceC16620sF, androidComposeView);
        }
    }
}
