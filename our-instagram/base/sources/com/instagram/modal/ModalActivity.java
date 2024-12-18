package com.instagram.modal;

import X.AbstractC09440dt;
import X.AbstractC09800fd;
import X.AbstractC10360h2;
import X.AbstractC12960li;
import X.AbstractC12990ll;
import X.AbstractC13110lx;
import X.AbstractC18680vv;
import X.AbstractC62582sx;
import X.AnonymousClass001;
import X.C0SG;
import X.C0f9;
import X.C140966Yy;
import X.C172077lc;
import X.C18720vz;
import X.C226218q;
import X.C226418s;
import X.C2U7;
import X.C3K8;
import X.C3KL;
import X.C50683MZb;
import X.C6XL;
import X.C71313Hs;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC16820sZ;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class ModalActivity extends BaseFragmentActivity {
    public static final int[] A06;
    public static final int[] A07;
    public static final int[] A08;
    public View A00;
    public AbstractC18680vv A01;
    public String A03;
    public final Set A04 = new HashSet();
    public final InterfaceC09390do A05 = AbstractC09440dt.A00(EnumC09460dv.A02, new InterfaceC16820sZ() { // from class: X.6XK
        @Override // X.InterfaceC16820sZ
        public final Object invoke() {
            return Boolean.valueOf(C18U.A06(C06090Tz.A05, ModalActivity.this.A01, 36324007301623569L));
        }
    });
    public Boolean A02 = true;

    static {
        int[] iArr;
        int[] iArr2 = {0, 0, 0, 0};
        A08 = iArr2;
        boolean z = C2U7.A00;
        if (z) {
            iArr = new int[]{R.anim.fade_in, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.fade_out};
        } else {
            iArr = iArr2;
        }
        A06 = iArr;
        if (z) {
            iArr2 = new int[]{R.anim.fade_in, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_empty_animation};
        }
        A07 = iArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:3:0x001b, B:5:0x002f, B:7:0x0033, B:9:0x0041, B:13:0x0050, B:16:0x0075, B:18:0x007b, B:19:0x008a, B:21:0x00cf, B:22:0x00d2, B:24:0x00da, B:25:0x00e8, B:27:0x00ee, B:28:0x0100, B:32:0x0150, B:34:0x0159, B:35:0x0160, B:39:0x016f, B:41:0x0174, B:46:0x016a, B:48:0x010a, B:50:0x0110, B:52:0x011b, B:53:0x0124, B:55:0x012c, B:56:0x0134, B:59:0x0140, B:62:0x005e, B:63:0x0069), top: B:2:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:3:0x001b, B:5:0x002f, B:7:0x0033, B:9:0x0041, B:13:0x0050, B:16:0x0075, B:18:0x007b, B:19:0x008a, B:21:0x00cf, B:22:0x00d2, B:24:0x00da, B:25:0x00e8, B:27:0x00ee, B:28:0x0100, B:32:0x0150, B:34:0x0159, B:35:0x0160, B:39:0x016f, B:41:0x0174, B:46:0x016a, B:48:0x010a, B:50:0x0110, B:52:0x011b, B:53:0x0124, B:55:0x012c, B:56:0x0134, B:59:0x0140, B:62:0x005e, B:63:0x0069), top: B:2:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:3:0x001b, B:5:0x002f, B:7:0x0033, B:9:0x0041, B:13:0x0050, B:16:0x0075, B:18:0x007b, B:19:0x008a, B:21:0x00cf, B:22:0x00d2, B:24:0x00da, B:25:0x00e8, B:27:0x00ee, B:28:0x0100, B:32:0x0150, B:34:0x0159, B:35:0x0160, B:39:0x016f, B:41:0x0174, B:46:0x016a, B:48:0x010a, B:50:0x0110, B:52:0x011b, B:53:0x0124, B:55:0x012c, B:56:0x0134, B:59:0x0140, B:62:0x005e, B:63:0x0069), top: B:2:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0159 A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:3:0x001b, B:5:0x002f, B:7:0x0033, B:9:0x0041, B:13:0x0050, B:16:0x0075, B:18:0x007b, B:19:0x008a, B:21:0x00cf, B:22:0x00d2, B:24:0x00da, B:25:0x00e8, B:27:0x00ee, B:28:0x0100, B:32:0x0150, B:34:0x0159, B:35:0x0160, B:39:0x016f, B:41:0x0174, B:46:0x016a, B:48:0x010a, B:50:0x0110, B:52:0x011b, B:53:0x0124, B:55:0x012c, B:56:0x0134, B:59:0x0140, B:62:0x005e, B:63:0x0069), top: B:2:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0174 A[Catch: all -> 0x0197, TRY_LEAVE, TryCatch #0 {all -> 0x0197, blocks: (B:3:0x001b, B:5:0x002f, B:7:0x0033, B:9:0x0041, B:13:0x0050, B:16:0x0075, B:18:0x007b, B:19:0x008a, B:21:0x00cf, B:22:0x00d2, B:24:0x00da, B:25:0x00e8, B:27:0x00ee, B:28:0x0100, B:32:0x0150, B:34:0x0159, B:35:0x0160, B:39:0x016f, B:41:0x0174, B:46:0x016a, B:48:0x010a, B:50:0x0110, B:52:0x011b, B:53:0x0124, B:55:0x012c, B:56:0x0134, B:59:0x0140, B:62:0x005e, B:63:0x0069), top: B:2:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a A[Catch: all -> 0x0197, TryCatch #0 {all -> 0x0197, blocks: (B:3:0x001b, B:5:0x002f, B:7:0x0033, B:9:0x0041, B:13:0x0050, B:16:0x0075, B:18:0x007b, B:19:0x008a, B:21:0x00cf, B:22:0x00d2, B:24:0x00da, B:25:0x00e8, B:27:0x00ee, B:28:0x0100, B:32:0x0150, B:34:0x0159, B:35:0x0160, B:39:0x016f, B:41:0x0174, B:46:0x016a, B:48:0x010a, B:50:0x0110, B:52:0x011b, B:53:0x0124, B:55:0x012c, B:56:0x0134, B:59:0x0140, B:62:0x005e, B:63:0x0069), top: B:2:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.modal.ModalActivity.onCreate(android.os.Bundle):void");
    }

    private void A00(Bundle bundle, Fragment fragment, String str) {
        if (fragment != null) {
            C140966Yy c140966Yy = new C140966Yy(this, this.A01);
            c140966Yy.A0B(bundle, fragment);
            if (str != null) {
                c140966Yy.A0A = str;
                AbstractC10360h2 A00 = AbstractC62582sx.A00(this);
                A00.A0r(new C50683MZb(A00, this));
            } else {
                c140966Yy.A0D = false;
            }
            c140966Yy.A04();
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final C3KL A0Y() {
        AbstractC18680vv abstractC18680vv = this.A01;
        if (abstractC18680vv != null) {
            return C3KL.A00(abstractC18680vv);
        }
        return null;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public void A0j(Bundle bundle) {
        int i;
        AbstractC09800fd.A01("ModalActivity.initializeStartingFragment", 569513663);
        try {
            if (getSupportFragmentManager().A0O(R.id.layout_container_main) == null) {
                if (getIntent().getStringExtra("fragment_name") == null) {
                    finish();
                    i = 1021902938;
                } else {
                    String stringExtra = getIntent().getStringExtra("fragment_name");
                    String stringExtra2 = getIntent().getStringExtra("initial_fragment_backstack_name");
                    if ("bottom_sheet".equals(stringExtra)) {
                        this.A03 = stringExtra;
                        i = 2043545048;
                    } else {
                        Bundle bundleExtra = getIntent().getBundleExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
                        bundleExtra.getClass();
                        bundleExtra.putAll(new Bundle());
                        Fragment A00 = C6XL.A00(bundleExtra, this, this.A01, stringExtra);
                        if (A00 != null) {
                            if ((A00 instanceof C0SG) && !"cds_bloks".equals(stringExtra)) {
                                ((C0SG) A00).A0B(getSupportFragmentManager(), "dialog_fragment");
                            } else {
                                A00(bundleExtra, A00, stringExtra2);
                            }
                        }
                    }
                }
                AbstractC09800fd.A00(i);
            }
            i = 1173634858;
            AbstractC09800fd.A00(i);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-904135582);
            throw th;
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity
    public final void configureWindowInsetsAndroid15() {
        if (this.A02.booleanValue()) {
            super.configureWindowInsetsAndroid15();
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity
    public final C172077lc getGnvGestureHandler() {
        if (C3K8.A02(this.A01)) {
            C172077lc A00 = C172077lc.A00(this.A01);
            C71313Hs A002 = C71313Hs.A00(this.A01);
            A00.A03(A002);
            A00.A02(A002);
            return A00;
        }
        return null;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public AbstractC18680vv getSession() {
        return this.A01;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x006c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v42, types: [X.V1K, androidx.fragment.app.Fragment, X.51D] */
    /* JADX WARN: Type inference failed for: r6v46, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r6v48, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r6v52, types: [X.NVl] */
    /* JADX WARN: Type inference failed for: r6v54, types: [X.NVm, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r6v84, types: [androidx.fragment.app.Fragment, X.2oe, X.51D] */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPostCreate(android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 3546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.modal.ModalActivity.onPostCreate(android.os.Bundle):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.A04.add(Integer.valueOf(i));
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.A04.add(Integer.valueOf(i));
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void A0n(Intent intent) {
        if ((intent.getFlags() & 268435456) == 268435456) {
            String stringExtra = intent.getStringExtra("fragment_name");
            stringExtra.getClass();
            Bundle bundleExtra = intent.getBundleExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS);
            bundleExtra.getClass();
            A00(bundleExtra, C6XL.A00(bundleExtra, this, this.A01, stringExtra), intent.getStringExtra("initial_fragment_backstack_name"));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        int[] intArrayExtra = getIntent().getIntArrayExtra("fragment_animation");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    @Override // android.app.Activity
    public final void finishAndRemoveTask() {
        super.finishAndRemoveTask();
        int[] intArrayExtra = getIntent().getIntArrayExtra("fragment_animation");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Fragment A0O;
        super.onActivityResult(i, i2, intent);
        if (this.A04.remove(Integer.valueOf(i)) && (A0O = getSupportFragmentManager().A0O(R.id.layout_container_main)) != null) {
            A0O.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC13110lx.A01(this, configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-85305697);
        C18720vz c18720vz = AbstractC12960li.A00;
        C226418s A01 = C226218q.A01(c18720vz);
        A01.A0P(A01.A02, AnonymousClass001.A0R("ModalActivity.onResume", "_begin"));
        try {
            super.onResume();
            C226418s A012 = C226218q.A01(c18720vz);
            A012.A0P(A012.A02, AnonymousClass001.A0R("ModalActivity.onResume", "_end"));
            C0f9.A07(648655408, A00);
        } catch (Throwable th) {
            try {
                C226418s A013 = C226218q.A01(c18720vz);
                A013.A0P(A013.A02, AnonymousClass001.A0R("ModalActivity.onResume", "_end"));
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            C0f9.A07(-852538925, A00);
            throw th;
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        int A00 = C0f9.A00(1336886252);
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            C226218q.A01(AbstractC12960li.A00).A0J(this, getIntent(), this.A01);
        }
        C18720vz c18720vz = AbstractC12960li.A00;
        C226418s A01 = C226218q.A01(c18720vz);
        A01.A0P(A01.A02, AnonymousClass001.A0R("ModalActivity.onStart", "_begin"));
        try {
            super.onStart();
            C226418s A012 = C226218q.A01(c18720vz);
            A012.A0P(A012.A02, AnonymousClass001.A0R("ModalActivity.onStart", "_end"));
            C0f9.A07(-1587677028, A00);
        } catch (Throwable th) {
            try {
                C226418s A013 = C226218q.A01(c18720vz);
                A013.A0P(A013.A02, AnonymousClass001.A0R("ModalActivity.onStart", "_end"));
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            C0f9.A07(2007328404, A00);
            throw th;
        }
    }

    @Override // X.InterfaceC12980lk
    public /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
