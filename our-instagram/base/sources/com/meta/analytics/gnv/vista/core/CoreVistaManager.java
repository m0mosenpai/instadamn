package com.meta.analytics.gnv.vista.core;

import X.AbstractC001800i;
import X.AbstractC06950Ym;
import X.C09530e4;
import X.C14360o3;
import X.C206409Bx;
import X.C27904CRp;
import X.C28187Cba;
import X.C4EH;
import X.C4EK;
import X.C4EM;
import X.C4EN;
import X.C50526MSf;
import X.InterfaceC09390do;
import X.InterfaceC16570sA;
import X.InterfaceC58009Pnt;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.analytics.dsp.point.IgPointContextProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class CoreVistaManager implements C4EH {
    public static final C4EM A07 = new Object();
    public C09530e4 A00;
    public final IgPointContextProvider A01;
    public final C4EK A02;
    public final HashMap A03;
    public final WeakHashMap A04;
    public final InterfaceC16570sA A05;
    public volatile boolean A06;

    public final void A02(View view, InterfaceC58009Pnt interfaceC58009Pnt, Object obj, String str) {
        boolean z;
        boolean z2;
        C28187Cba c28187Cba;
        C14360o3.A0B(view, 0);
        C4EK c4ek = this.A02;
        if (c4ek.A03 && (((Number) this.A00.A00).intValue() == 0 || ((Number) this.A00.A01).intValue() == 0)) {
            Context context = view.getContext();
            C14360o3.A07(context);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            C14360o3.A07(displayMetrics);
            this.A00 = new C09530e4(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        }
        WeakHashMap weakHashMap = this.A04;
        synchronized (weakHashMap) {
            C28187Cba c28187Cba2 = (C28187Cba) weakHashMap.get(view);
            if (c28187Cba2 == null || !C14360o3.A0K(c28187Cba2.A03, str) || !C14360o3.A0K(c28187Cba2.A02, obj)) {
                C206409Bx c206409Bx = new C206409Bx(str, obj);
                HashMap hashMap = this.A03;
                WeakReference weakReference = (WeakReference) hashMap.get(c206409Bx);
                if (weakReference != null && (c28187Cba = (C28187Cba) weakReference.get()) != null) {
                    View view2 = (View) c28187Cba.A05.get();
                    if (view2 != null) {
                        weakHashMap.remove(view2);
                    }
                } else if (c28187Cba2 != null) {
                    InterfaceC09390do interfaceC09390do = c28187Cba2.A06;
                    List<VistaViewPoint> list = (List) interfaceC09390do.getValue();
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    for (VistaViewPoint vistaViewPoint : list) {
                        synchronized (vistaViewPoint) {
                            z2 = vistaViewPoint.A01;
                        }
                        arrayList.add(Boolean.valueOf(z2));
                    }
                    if (AbstractC001800i.A0t(arrayList)) {
                        List<VistaViewPoint> list2 = (List) interfaceC09390do.getValue();
                        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                        for (VistaViewPoint vistaViewPoint2 : list2) {
                            synchronized (vistaViewPoint2) {
                                z = vistaViewPoint2.A01;
                            }
                            arrayList2.add(new C50526MSf(false, z, 22));
                        }
                        c28187Cba2.A01.E1G(c28187Cba2.A05.get(), c28187Cba2.A02, c28187Cba2.A03, arrayList2);
                    }
                }
                C28187Cba c28187Cba3 = (C28187Cba) this.A05.invoke(view, str, obj, interfaceC58009Pnt, new C27904CRp(this.A01, c4ek, this.A00), null);
                weakHashMap.put(view, c28187Cba3);
                hashMap.put(c206409Bx, new WeakReference(c28187Cba3));
            }
        }
    }

    public /* synthetic */ CoreVistaManager(IgPointContextProvider igPointContextProvider, C4EK c4ek) {
        C4EN c4en = new C4EN(A07);
        this.A01 = igPointContextProvider;
        this.A02 = c4ek;
        this.A05 = c4en;
        this.A04 = new WeakHashMap();
        this.A03 = new HashMap();
        this.A00 = new C09530e4(0, 0);
        this.A06 = true;
    }

    public static final void A00(View view, CoreVistaManager coreVistaManager) {
        C28187Cba c28187Cba = (C28187Cba) coreVistaManager.A04.remove(view);
        if (c28187Cba != null) {
            coreVistaManager.A03.remove(new C206409Bx(c28187Cba.A03, c28187Cba.A02));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f1 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C19L r13, X.InterfaceC23621Ds r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.gnv.vista.core.CoreVistaManager.A01(X.19L, X.1Ds):java.lang.Object");
    }

    @Override // X.C4EH
    public final /* bridge */ /* synthetic */ void AAU(InterfaceC58009Pnt interfaceC58009Pnt, Object obj, Object obj2, String str, boolean z) {
        A02((View) obj, interfaceC58009Pnt, obj2, str);
    }

    @Override // X.C4EH
    public final /* bridge */ /* synthetic */ void EGO(Object obj) {
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        synchronized (this.A04) {
            A00(view, this);
        }
    }
}
