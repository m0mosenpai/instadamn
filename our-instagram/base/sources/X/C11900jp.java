package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11900jp {
    public ArrayList A00;
    public boolean A01;
    public final Context A02;
    public final SharedPreferences A03;
    public final InterfaceC11360iu A04;
    public static final java.util.Set A06 = new HashSet(AbstractC16960so.A1N("com.facebook.orca", "com.facebook.katana", "com.instagram.barcelona"));
    public static final java.util.Set A05 = new HashSet(AbstractC16960so.A1N("com.facebook.orca", "com.facebook.katana", "com.instagram.android"));

    public static final void A02(C11900jp c11900jp) {
        ArrayList arrayList;
        synchronized (c11900jp) {
            arrayList = c11900jp.A00;
            c11900jp.A00 = new ArrayList();
            c11900jp.A01 = false;
        }
        Iterator it = arrayList.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            c11900jp.A01((SP6) next);
        }
    }

    public final synchronized void A03(SP6 sp6) {
        java.util.Set set;
        if (sp6 instanceof R29) {
            SharedPreferences sharedPreferences = this.A03;
            if (sharedPreferences.getBoolean("analytics_is_phoneid_fully_synced", true)) {
                R29 r29 = (R29) sp6;
                if (!r29.A06()) {
                    if (AbstractC14490oL.A09(this.A02)) {
                        set = A05;
                    } else {
                        set = A06;
                    }
                    if (set.contains(r29.A01())) {
                        sharedPreferences.edit().putBoolean("analytics_is_phoneid_fully_synced", false).apply();
                    }
                }
            }
            this.A00.add(sp6);
            if (!this.A01) {
                C14270nr.A00().A01(new AbstractRunnableC14200nk() { // from class: X.0x7
                    {
                        super(246, 3, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C11900jp.A02(C11900jp.this);
                    }
                }, 10000L);
                this.A01 = true;
            }
        }
    }

    private final void A01(SP6 sp6) {
        if (sp6 instanceof R29) {
            A00((R29) sp6);
        }
    }

    public C11900jp(Context context, InterfaceC11360iu interfaceC11360iu) {
        this.A02 = context;
        this.A04 = interfaceC11360iu;
        SharedPreferences sharedPreferences = context.getSharedPreferences("analyticsprefs", 0);
        C14360o3.A07(sharedPreferences);
        this.A03 = sharedPreferences;
        this.A00 = new ArrayList();
    }

    private final void A00(R29 r29) {
        String str = null;
        "phoneid_sync_stats".getClass();
        C19280xC A01 = C19280xC.A01("phoneid_sync_stats", null);
        A01.A0C("src_pkg", r29.A01());
        A01.A0C(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, r29.A02());
        A01.A08(Integer.valueOf(r29.A00()), "duration");
        A01.A0C("sync_medium", r29.A05());
        C19U A04 = r29.A04();
        if (A04 != null) {
            str = A04.toString();
        }
        A01.A0C("prev_phone_id", str);
        C19U A03 = r29.A03();
        if (A03 != null) {
            A01.A0C("phone_id", String.valueOf(A03));
        }
        r29.toString();
        this.A04.EHW(A01);
    }
}
