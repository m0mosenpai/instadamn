package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.8FO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FO implements C8FP {
    public final Context A00;
    public final C88M A01;
    public final C8FL A02;
    public final C8FI A03;
    public final UserSession A04;
    public final C8FV A06;
    public final C8FW A07;
    public final InterfaceC08830cm A09;
    public final C8FR A08 = new C8FR() { // from class: X.8FQ
        @Override // X.C8FR
        public final Integer B0Z(String str) {
            C14360o3.A0B(str, 0);
            C8FO c8fo = C8FO.this;
            int A00 = c8fo.A01.A00(str);
            if (A00 < 0) {
                return null;
            }
            return Integer.valueOf(A00 - c8fo.A02.A01.BMv());
        }
    };
    public final C88H A05 = new C88H() { // from class: X.8FS
        @Override // X.C88H
        public final void CkA() {
            C8FO.this.A02.A01();
        }

        @Override // X.C88H
        public final void DDA(C88X c88x) {
            C88Z c88z = c88x.A04;
            if (c88z != C88Z.A0G && c88z != C88Z.A0E) {
                C8FO.this.A03.DDA(c88x);
            }
        }

        @Override // X.C88H
        public final boolean Ejm(C88X c88x) {
            if (c88x.A00() != null && c88x.A04 != C88Z.A0E) {
                return true;
            }
            return false;
        }
    };

    public C8FO(final Context context, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, final C1810981l c1810981l, C8FL c8fl, C8FI c8fi, String str, InterfaceC08830cm interfaceC08830cm) {
        C8FV c8fv;
        this.A04 = userSession;
        this.A00 = context;
        this.A03 = c8fi;
        this.A02 = c8fl;
        this.A09 = interfaceC08830cm;
        this.A01 = new C88M(context, interfaceC11380iw, userSession, new C88K() { // from class: X.8FT
            @Override // X.AnonymousClass887
            public final void DDD(C88X c88x, int i, boolean z) {
            }

            @Override // X.AnonymousClass887
            public final void DNi(C88X c88x, int i) {
                C14360o3.A0B(c88x, 0);
                C8FO.this.A03.DNh(c88x, i);
            }

            @Override // X.C88L
            public final void DA8(int i) {
                C8FO c8fo = C8FO.this;
                C88M c88m = c8fo.A01;
                if (c88m.A01 >= 0 && i < c88m.getCount()) {
                    c8fo.A02.A02(i);
                }
            }

            @Override // X.AnonymousClass887
            public final void DDB(C88X c88x, String str2, int i, boolean z) {
                CameraAREffect A00;
                String str3;
                if (c88x == null) {
                    AbstractC12120kG.A07("DialArEffectPickerViewManager::onElementSelected", "DialElement is null", null);
                    return;
                }
                if (z && (A00 = c88x.A00()) != null && (str3 = A00.A0S) != null) {
                    Context context2 = C8FO.this.A00;
                    Object systemService = context2.getSystemService("accessibility");
                    C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                    AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
                    if (AbstractC56862jK.A02(accessibilityManager, true)) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                        obtain.getText().add(context2.getResources().getString(2131961692, str3));
                        accessibilityManager.sendAccessibilityEvent(obtain);
                    }
                }
                C8FO.this.A03.DDC(c88x, str2, i, z);
            }
        });
        if ("post_capture".equals(str)) {
            c8fv = new C8FV(context) { // from class: X.8qh
                public final C8FY A00;
                public final String A01;

                @Override // X.C8FV
                public final boolean EiV() {
                    return false;
                }

                @Override // X.C8FV
                public final boolean Eiu() {
                    return false;
                }

                @Override // X.C8FV
                public final int B1J() {
                    return 0;
                }

                @Override // X.C8FV
                public final String B1K() {
                    return this.A01;
                }

                @Override // X.C8FV
                public final /* bridge */ /* synthetic */ Drawable B1L() {
                    return this.A00;
                }

                @Override // X.C8FV
                public final /* synthetic */ String Bsb() {
                    return null;
                }

                {
                    String string = context.getString(2131953001);
                    C14360o3.A07(string);
                    this.A01 = string;
                    Drawable drawable = context.getDrawable(R.drawable.effect_no_selection);
                    if (drawable != null) {
                        this.A00 = new C8FY(context.getResources(), ((BitmapDrawable) drawable).getBitmap());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            };
        } else if (c1810981l != null) {
            c8fv = new C8FV(context, userSession, c1810981l) { // from class: X.8FU
                public final Context A00;
                public final UserSession A01;
                public final C1810981l A02;

                @Override // X.C8FV
                public final boolean Eiu() {
                    return false;
                }

                @Override // X.C8FV
                public final int B1J() {
                    return this.A00.getColor(R.color.design_dark_default_color_on_background);
                }

                @Override // X.C8FV
                public final String B1K() {
                    String string = this.A00.getString(2131974081);
                    C14360o3.A07(string);
                    return string;
                }

                @Override // X.C8FV
                public final /* bridge */ /* synthetic */ Drawable B1L() {
                    BitmapDrawable bitmapDrawable;
                    Context context2 = this.A00;
                    int A00 = AbstractC191348dl.A00(this.A02.A08());
                    if (A00 == -1) {
                        A00 = R.drawable.camera_dial_empty_icon;
                    }
                    Map map = AbstractC191348dl.A00;
                    Integer valueOf = Integer.valueOf(A00);
                    Drawable drawable = (Drawable) map.get(valueOf);
                    if (drawable == null) {
                        Drawable drawable2 = context2.getDrawable(A00);
                        Bitmap bitmap = null;
                        if (drawable2 instanceof BitmapDrawable) {
                            bitmapDrawable = (BitmapDrawable) drawable2;
                        } else {
                            bitmapDrawable = null;
                        }
                        Resources resources = context2.getResources();
                        if (bitmapDrawable != null) {
                            bitmap = bitmapDrawable.getBitmap();
                        }
                        C8FY c8fy = new C8FY(resources, bitmap);
                        map.put(valueOf, c8fy);
                        return c8fy;
                    }
                    return drawable;
                }

                @Override // X.C8FV
                public final /* synthetic */ String Bsb() {
                    return null;
                }

                @Override // X.C8FV
                public final boolean EiV() {
                    boolean z = false;
                    if (AbstractC191348dl.A00(this.A02.A08()) != -1) {
                        z = true;
                    }
                    return !z;
                }

                {
                    this.A00 = context;
                    this.A02 = c1810981l;
                    this.A01 = userSession;
                }
            };
        } else {
            throw new IllegalStateException("Required value was null.");
        }
        C8FV c8fv2 = c8fv;
        this.A06 = c8fv2;
        this.A07 = new C8FW(context, userSession, c8fv2, str, false);
    }

    @Override // X.C8FP
    public final int B0w(C88X c88x) {
        C14360o3.A0B(c88x, 0);
        int indexOf = this.A01.A08.indexOf(c88x);
        if (indexOf < 0) {
            return Integer.MIN_VALUE;
        }
        return indexOf;
    }

    @Override // X.C8FP
    public final int B0x(String str) {
        C14360o3.A0B(str, 0);
        return this.A01.A00(str);
    }

    @Override // X.C8FP
    public final void CoD() {
    }

    @Override // X.C8FP
    public final void ECy() {
    }

    @Override // X.C8FP
    public final void EJg() {
    }

    @Override // X.C8FP
    public final void EPh(boolean z) {
    }

    @Override // X.C8FP
    public final void ETI(boolean z) {
    }

    @Override // X.C8FP
    public final void ETl(List list) {
        C14360o3.A0B(list, 0);
        this.A01.A06(list);
        A00();
        ((AnonymousClass884) this.A09.get()).FC1();
    }

    @Override // X.C8FP
    public final void Ea0(OyE oyE) {
    }

    @Override // X.C8FP
    public final void EgC(C8TN c8tn) {
    }

    @Override // X.C8FP
    public final void EmZ(C88X c88x) {
    }

    private final void A00() {
        C88M c88m = this.A01;
        C8FW c8fw = this.A07;
        c88m.A04 = c8fw;
        C174437pd c174437pd = c88m.A02;
        if (c174437pd != null) {
            c174437pd.A00 = c8fw;
        }
        ((AnonymousClass884) this.A09.get()).AJ8(c88m, this.A05);
    }

    @Override // X.C8FP
    public final boolean AFk() {
        return ((AnonymousClass884) this.A09.get()).AFk();
    }

    @Override // X.C8FP
    public final void APS() {
        C88M c88m = this.A01;
        c88m.A05 = true;
        C0fA.A00(c88m, 1232124614);
    }

    @Override // X.C8FP
    public final void ARe() {
        C88M c88m = this.A01;
        c88m.A05 = false;
        C0fA.A00(c88m, 525522009);
    }

    @Override // X.C8FP
    public final C8FR AcW() {
        return this.A08;
    }

    @Override // X.C8FP
    public final String Aqw(C88X c88x) {
        String string;
        C88Z c88z = c88x.A04;
        if (c88z == null) {
            c88z = C88Z.A0G;
        }
        int ordinal = c88z.ordinal();
        if (ordinal != 22) {
            if (ordinal != 33) {
                string = c88x.A0G;
            } else {
                return this.A06.B1K();
            }
        } else {
            string = this.A00.getString(2131960993);
        }
        C14360o3.A07(string);
        return string;
    }

    @Override // X.C8FP
    public final C88X AuN() {
        return this.A01.A01();
    }

    @Override // X.C8FP
    public final C88X B0q(int i) {
        return this.A01.A02(i);
    }

    @Override // X.C8FP
    public final int B10() {
        return this.A01.getCount();
    }

    @Override // X.C8FP
    public final int B6m() {
        return ((AnonymousClass884) this.A09.get()).B6q();
    }

    @Override // X.C8FP
    public final int BM1() {
        return ((AnonymousClass884) this.A09.get()).BM3();
    }

    @Override // X.C8FP
    public final C88X Bb7() {
        C88M c88m = this.A01;
        return c88m.A02(c88m.A00);
    }

    @Override // X.C8FP
    public final int Bd6() {
        return ((AnonymousClass884) this.A09.get()).Bd6();
    }

    @Override // X.C8FP
    public final InterfaceC55932he Bp9() {
        return ((AnonymousClass884) this.A09.get()).Bp9();
    }

    @Override // X.C8FP
    public final C88X Bsa() {
        C88M c88m = this.A01;
        return c88m.A02(c88m.A01);
    }

    @Override // X.C8FP
    public final int Bsl() {
        return this.A01.A01;
    }

    @Override // X.C8FP
    public final float CAj() {
        View view = ((AnonymousClass884) this.A09.get()).getView();
        if (view != null) {
            return view.getTranslationY();
        }
        return 0.0f;
    }

    @Override // X.C8FP
    public final void CML() {
        this.A01.A07 = true;
    }

    @Override // X.C8FP
    public final void CMn() {
        C88M c88m = this.A01;
        c88m.A06 = true;
        C0fA.A00(c88m, -975016333);
    }

    @Override // X.C8FP
    public final boolean CaF() {
        return ((AnonymousClass884) this.A09.get()).CaF();
    }

    @Override // X.C8FP
    public final boolean CaY(int i) {
        return this.A01.A07(i);
    }

    @Override // X.C8FP
    public final void CtF(int i) {
        C0fA.A00(this.A01, -577041618);
    }

    @Override // X.C8FP
    public final void Cw3(java.util.Set set) {
        C88X A01;
        if (!set.contains(C81W.A0C) && (A01 = this.A01.A01()) != null) {
            ((AnonymousClass884) this.A09.get()).ESj(A01.A0G);
        }
    }

    @Override // X.C8FP
    public final void DEo() {
        ((AnonymousClass884) this.A09.get()).E5s();
    }

    @Override // X.C8FP
    public final void DmC() {
        ((AnonymousClass884) this.A09.get()).DmC();
    }

    @Override // X.C8FP
    public final boolean EFG(C88X c88x) {
        C88M c88m = this.A01;
        List list = c88m.A08;
        if (!list.contains(c88x)) {
            return false;
        }
        list.remove(c88x);
        C0fA.A00(c88m, -1287938786);
        return true;
    }

    @Override // X.C8FP
    public final boolean EFH(int i) {
        C88M c88m = this.A01;
        if (!c88m.A07(i)) {
            return false;
        }
        c88m.A08.remove(i);
        C0fA.A00(c88m, 791222157);
        return true;
    }

    @Override // X.C8FP
    public final void EGG() {
        C88M c88m = this.A01;
        c88m.A01 = -1;
        c88m.A00 = -1;
    }

    @Override // X.C8FP
    public final void EMP(int i, boolean z) {
        ((AnonymousClass884) this.A09.get()).EMP(i, z);
    }

    @Override // X.C8FP
    public final void ETk(String str) {
        ((AnonymousClass884) this.A09.get()).ESj(str);
    }

    @Override // X.C8FP
    public final void EVD(boolean z) {
        ((AnonymousClass884) this.A09.get()).EVD(z);
    }

    @Override // X.C8FP
    public final void Eba(Product product) {
        ((AnonymousClass884) this.A09.get()).Eba(product);
    }

    @Override // X.C8FP
    public final void Ebe(boolean z) {
        ((AnonymousClass884) this.A09.get()).Ebe(z);
    }

    @Override // X.C8FP
    public final void EgG(float f) {
        View view = ((AnonymousClass884) this.A09.get()).getView();
        if (view != null) {
            view.setTranslationY(f);
        }
    }

    @Override // X.C8FP
    public final void EkO() {
        this.A01.A07 = false;
    }

    @Override // X.C8FP
    public final void ElN() {
        C88M c88m = this.A01;
        c88m.A06 = false;
        C0fA.A00(c88m, -1121325918);
    }

    @Override // X.C8FP
    public final void FBj(float f) {
        ((AnonymousClass884) this.A09.get()).FBj(1.0f);
    }

    @Override // X.C8FP
    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // X.C8FP
    public final void notifyDataSetChanged() {
        C0fA.A00(this.A01, -1949594038);
    }

    @Override // X.C8FP
    public final void onPause() {
        ((AnonymousClass884) this.A09.get()).onPause();
    }

    @Override // X.C8FP
    public final void onResume() {
        ((AnonymousClass884) this.A09.get()).onResume();
    }

    @Override // X.C8FP
    public final void setVisibility(int i) {
        View view = ((AnonymousClass884) this.A09.get()).getView();
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Override // X.C8FP
    public final void A8M(C88X c88x, int i) {
        List asList = Arrays.asList(c88x);
        C14360o3.A07(asList);
        C88M c88m = this.A01;
        if (!asList.isEmpty()) {
            List list = c88m.A08;
            if (!list.isEmpty()) {
                i = Math.min(i, list.size() - 1);
            }
            list.addAll(i, asList);
            int i2 = c88m.A01;
            if (i2 >= i) {
                c88m.A01 = i2 + asList.size();
            }
            C0fA.A00(c88m, -1176982571);
        }
    }

    @Override // X.C8FP
    public final void DDl() {
        A00();
        ((AnonymousClass884) this.A09.get()).E5t();
    }

    @Override // X.C8FP
    public final void EMq(String str) {
        A00();
        ((AnonymousClass884) this.A09.get()).EMq(str);
    }

    @Override // X.C8FP
    public final void EMs(String str, int i, boolean z) {
        A00();
        InterfaceC08830cm interfaceC08830cm = this.A09;
        ((AnonymousClass884) interfaceC08830cm.get()).E5t();
        ((AnonymousClass884) interfaceC08830cm.get()).EMs(str, i, z);
    }
}
