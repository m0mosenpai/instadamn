package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.8C0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8C0 extends C668630d implements C8C1, C8C2, C8C3 {
    public C65988Txh A00;
    public C9V2 A01;
    public C8JE A02;
    public C8J9 A03;
    public Runnable A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public C48214LVo A0F;
    public AnonymousClass860 A0G;
    public C83E A0H;
    public final int A0I;
    public final View A0J;
    public final LinearLayoutManager A0K;
    public final UserSession A0L;
    public final C1810981l A0M;
    public final C8C6 A0N;
    public final C8C8 A0O;
    public final NestableSnapPickerRecyclerView A0P;
    public final C8CD A0Q;
    public final Runnable A0R;
    public final Runnable A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final Context A0W;
    public final AnonymousClass822 A0X;
    public final InterfaceC183518Bz A0Y;
    public final C8C5 A0Z;
    public final boolean A0a;

    @Override // X.C8C3
    public final void Cwb(float f) {
        if (f == 0.0f) {
            A04();
        }
    }

    private int A00() {
        int left;
        int i;
        int i2;
        int A1a = this.A0K.A1a();
        if (A1a == -1) {
            return 0;
        }
        C8C5 c8c5 = this.A0Z;
        int i3 = c8c5.A00;
        if (i3 == 0) {
            TargetViewSizeProvider targetViewSizeProvider = c8c5.A03;
            if (targetViewSizeProvider != null) {
                i2 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K.getWidth();
            } else {
                i2 = c8c5.A01;
            }
            i3 = (i2 - c8c5.A02) / 2;
            c8c5.A00 = i3;
        }
        int i4 = i3 + (A1a * this.A0I);
        View childAt = this.A0P.getChildAt(0);
        if (this.A0U) {
            TargetViewSizeProvider targetViewSizeProvider2 = c8c5.A03;
            if (targetViewSizeProvider2 != null) {
                i = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K.getWidth();
            } else {
                i = c8c5.A01;
            }
            left = i - childAt.getRight();
        } else {
            left = childAt.getLeft();
        }
        return i4 - left;
    }

    private int A01() {
        boolean z = this.A0D;
        C8CD c8cd = this.A0Q;
        if (c8cd != null) {
            List list = c8cd.A02;
            if (list.size() >= (z ? 1 : 0) + 1 && !(list.get(z ? 1 : 0) instanceof C8C8)) {
                return ((C2UU) list.get(z ? 1 : 0)).getItemCount();
            }
            return 0;
        }
        return 0;
    }

    public static ArrayList A03(C8C0 c8c0) {
        ArrayList arrayList = new ArrayList();
        LinearLayoutManager linearLayoutManager = c8c0.A0K;
        int A1b = linearLayoutManager.A1b();
        for (int A1a = linearLayoutManager.A1a(); A1a <= A1b; A1a++) {
            C3OO A0W = c8c0.A0P.A0W(A1a, false);
            if (A0W instanceof C9V2) {
                arrayList.add(A0W);
            }
        }
        return arrayList;
    }

    private void A04() {
        C8CD c8cd = this.A0Q;
        C8JE c8je = this.A02;
        if (c8je != null && c8cd != null) {
            c8cd.A02(c8je);
            if (!this.A0B) {
                this.A0P.A15(this.A0N);
            }
            this.A0P.setAdapter(c8cd);
            this.A02 = null;
        }
    }

    public static void A07(C8C0 c8c0, boolean z) {
        C8C8 c8c8 = c8c0.A0O;
        if (!c8c8.A01 && z) {
            c8c8.A08.A03();
        }
        c8c8.A01 = z;
        c8c8.notifyItemChanged(0);
        C8J9 c8j9 = c8c0.A03;
        if (c8j9 != null) {
            C8JE c8je = c8j9.A00;
            c8je.A02 = !z;
            c8je.notifyItemChanged(((C8JF) c8je).A00);
        }
    }

    public final void A08(int i) {
        if (this.A0a && this.A04 == null && i > 0) {
            this.A04 = new RunnableC24632AvS(this, i);
            return;
        }
        int max = Math.max(i * this.A0I, 0) - A00();
        this.A07 = true;
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = this.A0P;
        if (this.A0U) {
            max = -max;
        }
        nestableSnapPickerRecyclerView.scrollBy(max, 0);
        this.A07 = false;
    }

    public final void A09(C8J9 c8j9, boolean z) {
        C8J9 c8j92 = this.A03;
        if (c8j92 == c8j9) {
            boolean z2 = this.A0a;
            if (z2) {
                c8j92.getClass();
                this.A02 = c8j92.A00;
                EMO(0, A02(this));
                ArrayList A03 = A03(this);
                if (!A03.isEmpty()) {
                    C48214LVo c48214LVo = this.A0F;
                    if (c48214LVo != null) {
                        Iterator it = c48214LVo.A01.iterator();
                        while (it.hasNext()) {
                            C55982hj c55982hj = (C55982hj) it.next();
                            c55982hj.A06(c55982hj.A09.A00);
                        }
                    }
                    C48214LVo c48214LVo2 = new C48214LVo(C55942hf.A03(5.0d, 45.0d), C55942hf.A03(5.0d, 65.0d));
                    for (int size = A03.size() - 1; size >= 0; size--) {
                        C9V2 c9v2 = (C9V2) A03.get(size);
                        if (size == 0) {
                            c9v2.A02 = this;
                        }
                        c48214LVo2.A01(c9v2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = c48214LVo2.A01;
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        C55982hj c55982hj2 = (C55982hj) it2.next();
                        c55982hj2.A06 = true;
                        c55982hj2.A08(1.0d, true);
                    }
                    c48214LVo2.A00();
                    ((C55982hj) copyOnWriteArrayList.get(c48214LVo2.A00)).A06(0.0d);
                } else {
                    A04();
                }
            }
            this.A0C = false;
            if (!z2) {
                A0B(z);
            }
        }
    }

    public final void A0A(C8J9 c8j9, boolean z) {
        CameraAREffect cameraAREffect;
        Runnable runnable;
        if (this.A0C) {
            A09(this.A03, false);
        }
        this.A03 = c8j9;
        C8JE c8je = c8j9.A00;
        boolean z2 = this.A0a;
        if (z2) {
            this.A05 = false;
            if (this.A02 != null) {
                A04();
            }
            c8je.A01 = false;
            C8CD c8cd = this.A0Q;
            c8cd.getClass();
            c8cd.A03(c8je, c8cd.A02.size());
            NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = this.A0P;
            nestableSnapPickerRecyclerView.A14(this.A0N);
            if (this.A0D) {
                runnable = this.A0S;
            } else {
                runnable = this.A0R;
            }
            AbstractC13880nE.A0r(nestableSnapPickerRecyclerView, runnable);
        } else {
            NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView2 = this.A0P;
            if (nestableSnapPickerRecyclerView2.A0A != c8je) {
                nestableSnapPickerRecyclerView2.setAdapter(c8je);
            }
        }
        InterfaceC183518Bz interfaceC183518Bz = this.A0Y;
        if (interfaceC183518Bz != null) {
            cameraAREffect = interfaceC183518Bz.AuF();
        } else {
            cameraAREffect = null;
        }
        A0D(cameraAREffect);
        this.A0C = true;
        if (!z2) {
            A0C(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r5.A08 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(boolean r6) {
        /*
            r5 = this;
            X.Txh r4 = r5.A00
            boolean r0 = r5.A0V
            r3 = 0
            if (r0 == 0) goto L53
            if (r4 == 0) goto L53
            boolean r0 = r5.A09
            if (r0 != 0) goto L53
            X.81l r0 = r5.A0M
            r0.getClass()
            X.81v r0 = r0.A09
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            X.81W r0 = X.C81W.A0C
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L53
            java.lang.Integer r2 = X.C05F.A01
            com.instagram.common.session.UserSession r0 = r5.A0L
            X.1Ai r0 = X.AbstractC23021Ah.A00(r0)
            X.0xq r1 = r0.A01
            java.lang.String r0 = "mini_gallery_has_opened_mini_gallery_count_v2"
            int r1 = r1.getInt(r0, r3)
            r0 = 3
            if (r1 >= r0) goto L38
            boolean r0 = r5.A08
            r1 = 1
            if (r0 == 0) goto L39
        L38:
            r1 = 0
        L39:
            java.lang.Integer r0 = r4.A01
            if (r0 != r2) goto L41
            boolean r0 = r4.A02
            if (r1 == r0) goto L48
        L41:
            r4.A01 = r2
            r4.A02 = r1
            r4.notifyItemChanged(r3)
        L48:
            android.view.View r0 = r5.A0J
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.AbstractC125325le.A04(r0, r1, r6)
            return
        L53:
            X.860 r0 = r5.A0G
            if (r0 == 0) goto L66
            X.05A r0 = r0.A0Z
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L66
            goto L48
        L66:
            android.view.View r0 = r5.A0J
            android.view.View[] r0 = new android.view.View[]{r0}
            X.AbstractC125325le.A05(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8C0.A0B(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r5.A08 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.A09
            if (r0 != 0) goto L3f
            X.Txh r4 = r5.A00
            boolean r0 = r5.A0V
            if (r0 == 0) goto L35
            if (r4 == 0) goto L35
            java.lang.Integer r3 = X.C05F.A01
            com.instagram.common.session.UserSession r0 = r5.A0L
            X.1Ai r0 = X.AbstractC23021Ah.A00(r0)
            X.0xq r1 = r0.A01
            java.lang.String r0 = "mini_gallery_has_opened_mini_gallery_count_v2"
            r2 = 0
            int r1 = r1.getInt(r0, r2)
            r0 = 3
            if (r1 >= r0) goto L25
            boolean r0 = r5.A08
            r1 = 1
            if (r0 == 0) goto L26
        L25:
            r1 = 0
        L26:
            java.lang.Integer r0 = r4.A01
            if (r0 != r3) goto L2e
            boolean r0 = r4.A02
            if (r1 == r0) goto L35
        L2e:
            r4.A01 = r3
            r4.A02 = r1
            r4.notifyItemChanged(r2)
        L35:
            android.view.View r0 = r5.A0J
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.AbstractC125325le.A04(r0, r1, r6)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8C0.A0C(boolean):void");
    }

    public final boolean A0D(CameraAREffect cameraAREffect) {
        String canonicalPath;
        C8CD c8cd = this.A0Q;
        if (this.A0T && this.A0M != null && !this.A0B && cameraAREffect != null && cameraAREffect.A0Z.get("galleryPicker") != null && c8cd != null) {
            c8cd.A03(this.A0O, c8cd.A02.size());
            this.A0B = true;
            C83E c83e = this.A0H;
            if (c83e != null) {
                Context context = this.A0W;
                Resources resources = context.getResources();
                String str = cameraAREffect.A0K;
                C14360o3.A0B(resources, 0);
                C14360o3.A0B(str, 3);
                if (str.equals("389287015265096") && c83e.A03) {
                    File file = c83e.A00;
                    if (file != null && (canonicalPath = file.getCanonicalPath()) != null) {
                        c83e.A05.A01(0, canonicalPath, true);
                    } else {
                        Drawable A00 = AbstractC56412ia.A00(resources, R.drawable.nature);
                        C14360o3.A0C(A00, AbstractC111324zv.A00(1139));
                        ((C3PR) A00).A01(new C23698AeX(context, c83e));
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.C8C1
    public final void AD6(int i) {
        if (this.A0a && !this.A05) {
            this.A04 = new RunnableC24632AvS(this, i);
            return;
        }
        if (this.A0D) {
            i++;
        }
        int A02 = A02(this);
        if (A02 == i) {
            return;
        }
        this.A07 = true;
        EMO(i, A02);
        this.A07 = false;
    }

    @Override // X.C8C1
    public final boolean CcW() {
        if (this.A0P.getScrollState() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C9V2 c9v2 = this.A01;
        if (c9v2 != null) {
            c9v2.Dnm(c55982hj);
        }
    }

    public static int A02(C8C0 c8c0) {
        int i;
        int A00 = c8c0.A00();
        if (c8c0.A0B) {
            int A01 = c8c0.A01() - (!c8c0.A0D ? 1 : 0);
            if (A01 > 0) {
                int i2 = c8c0.A0I;
                i = (i2 / 2) + (A01 * i2);
            } else {
                i = 0;
            }
            if (A00 >= i) {
                return c8c0.A01() + (c8c0.A0D ? 1 : 0);
            }
        }
        int i3 = c8c0.A0I;
        return (A00 + (i3 / 2)) / i3;
    }

    public static void A05(C8C0 c8c0) {
        ArrayList A03 = A03(c8c0);
        if (!A03.isEmpty()) {
            C8J9 c8j9 = c8c0.A03;
            if (c8j9 != null) {
                c8j9.A00.A00 = A03.size() - 1;
            }
            c8c0.A0F = new C48214LVo(C55942hf.A03(5.0d, 45.0d), C55942hf.A03(5.0d, 65.0d));
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                c8c0.A0F.A01((C9V2) it.next());
            }
            Iterator it2 = c8c0.A0F.A01.iterator();
            while (it2.hasNext()) {
                C55982hj c55982hj = (C55982hj) it2.next();
                c55982hj.A06 = true;
                c55982hj.A08(0.0d, true);
            }
            c8c0.A0F.A01(c8c0);
            c8c0.A0F.A00();
            C48214LVo c48214LVo = c8c0.A0F;
            ((C55982hj) c48214LVo.A01.get(c48214LVo.A00)).A06(1.0d);
            C8J9 c8j92 = c8c0.A03;
            if (!c8c0.A0D && c8j92 != null) {
                c8j92.A00.A01 = true;
                Runnable runnable = c8c0.A04;
                if (runnable != null) {
                    runnable.run();
                    c8c0.A04 = null;
                }
                c8c0.A05 = true;
            }
            c8c0.A0A = false;
            c8c0.A06 = true;
        }
    }

    public static void A06(C8C0 c8c0) {
        int i;
        int A00 = c8c0.A00();
        if (c8c0.A0B) {
            int A01 = c8c0.A01() - (!c8c0.A0D ? 1 : 0);
            if (A01 > 0) {
                int i2 = c8c0.A0I;
                i = (i2 / 2) + (A01 * i2);
            } else {
                i = 0;
            }
            if (A00 >= i) {
                int A002 = c8c0.A00();
                A07(c8c0, true);
                int A012 = c8c0.A01() - (!c8c0.A0D ? 1 : 0);
                int i3 = c8c0.A0I;
                int max = (A012 * i3) + (i3 / 2) + (Math.max(c8c0.A0O.A00, 0) / 2);
                if (A002 != max) {
                    int i4 = max - A002;
                    NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = c8c0.A0P;
                    if (c8c0.A0U) {
                        i4 = -i4;
                    }
                    nestableSnapPickerRecyclerView.A0t(i4, 0);
                    return;
                }
                return;
            }
        }
        A07(c8c0, false);
        int i5 = c8c0.A0I;
        int i6 = A00 % i5;
        if (i6 == 0) {
            return;
        }
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView2 = c8c0.A0P;
        if (nestableSnapPickerRecyclerView2.getChildCount() < 2) {
            return;
        }
        int i7 = i5 / 2;
        int i8 = i5 - i6;
        if (i6 < i7) {
            i8 = -i6;
        }
        if (c8c0.A0U) {
            i8 = -i8;
        }
        nestableSnapPickerRecyclerView2.A0t(i8, 0);
    }

    @Override // X.C8C2
    public final void DCw(View view) {
        A06(this);
    }

    @Override // X.C8C1
    public final void EMO(int i, int i2) {
        int i3;
        int A02 = A02(this);
        if (this.A0B && A02 >= A01()) {
            int max = Math.max(this.A0O.A00, 0) / 2;
            int i4 = this.A0I;
            i3 = (-(max + (i4 / 2))) + (i4 * ((i + (this.A0D ? 1 : 0)) - (A02 - 1)));
        } else {
            if (i2 == i) {
                return;
            }
            i3 = this.A0I * (i - i2);
        }
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = this.A0P;
        if (this.A0U) {
            i3 = -i3;
        }
        nestableSnapPickerRecyclerView.A0t(i3, 0);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.8C6] */
    public C8C0(Context context, View view, C07X c07x, GalleryPickerServiceDataSource galleryPickerServiceDataSource, UserSession userSession, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, C183498Bw c183498Bw, XAM xam, InterfaceC183518Bz interfaceC183518Bz, AnonymousClass860 anonymousClass860, C83E c83e, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        View view2 = view;
        AnonymousClass822 anonymousClass822 = new AnonymousClass822() { // from class: X.8C4
            /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
            @Override // X.AnonymousClass822
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r7) {
                /*
                    r6 = this;
                    com.instagram.creation.cameraconfiguration.CameraConfiguration r7 = (com.instagram.creation.cameraconfiguration.CameraConfiguration) r7
                    X.55U r1 = r7.A03
                    r5 = 0
                    X.81T r0 = X.C81T.A00
                    boolean r1 = r1.equals(r0)
                    java.util.Set r4 = r7.A04
                    X.81W r0 = X.C81W.A0M
                    boolean r0 = r4.contains(r0)
                    r2 = 1
                    if (r0 != 0) goto L2e
                    X.81W r0 = X.C81W.A0D
                    boolean r0 = r4.contains(r0)
                    if (r0 != 0) goto L2e
                    X.81W r0 = X.C81W.A0o
                    boolean r0 = r4.contains(r0)
                    if (r0 != 0) goto L2e
                    X.8C0 r3 = X.C8C0.this
                    boolean r0 = r3.A0V
                    if (r0 == 0) goto L67
                    if (r1 != 0) goto L67
                L2e:
                    X.8C0 r3 = X.C8C0.this
                    r3.A0D = r5
                    X.8CD r1 = r3.A0Q
                    r1.getClass()
                    X.Txh r0 = r3.A00
                    r1.A02(r0)
                    android.os.Looper r0 = android.os.Looper.getMainLooper()
                    android.os.Handler r1 = new android.os.Handler
                    r1.<init>(r0)
                    java.lang.Runnable r0 = r3.A0R
                    r1.post(r0)
                L4a:
                    X.81W r0 = X.C81W.A0o
                    boolean r0 = r4.contains(r0)
                    if (r0 == 0) goto L66
                    com.instagram.common.session.UserSession r0 = r3.A0L
                    X.1Ai r0 = X.AbstractC23021Ah.A00(r0)
                    X.0xq r0 = r0.A01
                    X.0xo r1 = r0.ARD()
                    java.lang.String r0 = "preference_has_clicked_roll_call_direct_camera_tool"
                    r1.E77(r0, r2)
                    r1.apply()
                L66:
                    return
                L67:
                    X.Txh r1 = r3.A00
                    if (r1 == 0) goto L4a
                    r3.A0D = r2
                    X.8CD r0 = r3.A0Q
                    r0.getClass()
                    r0.A03(r1, r5)
                    goto L4a
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8C4.onChanged(java.lang.Object):void");
            }
        };
        this.A0X = anonymousClass822;
        this.A0W = context;
        this.A0L = userSession;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
        this.A0I = dimensionPixelSize;
        C8C5 c8c5 = new C8C5(targetViewSizeProvider, AbstractC13880nE.A0A(context), dimensionPixelSize);
        this.A0Z = c8c5;
        this.A0a = z;
        this.A0E = i;
        this.A0D = xam != null;
        this.A0U = AbstractC13620mo.A02(context);
        this.A0Y = interfaceC183518Bz;
        this.A0M = c1810981l;
        view2 = view2 instanceof ViewStub ? ((ViewStub) view2).inflate() : view2;
        this.A0J = view2;
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = (NestableSnapPickerRecyclerView) view2.requireViewById(R.id.recyclerview);
        this.A0P = nestableSnapPickerRecyclerView;
        this.A0N = new C1I4() { // from class: X.8C6
            public long A00;

            @Override // X.C1I4
            public final void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                int A02;
                C9V2 c9v2;
                int A03 = C0f9.A03(-1986743335);
                if (i3 == 1) {
                    C8C0 c8c0 = C8C0.this;
                    C8J9 c8j9 = c8c0.A03;
                    if (c8j9 != null) {
                        Iterator it = C8C0.A03(c8c0).iterator();
                        while (it.hasNext()) {
                            C9V2.A00((C9V2) it.next(), true, true);
                        }
                        c8j9.A00.A03 = false;
                    }
                } else if (i3 == 2) {
                    C8C0 c8c02 = C8C0.this;
                    if (c8c02.A03 != null) {
                        Iterator it2 = C8C0.A03(c8c02).iterator();
                        while (it2.hasNext()) {
                            C9V2 c9v22 = (C9V2) it2.next();
                            C9V2.A00(c9v22, c9v22.A07.isSelected(), true);
                        }
                    }
                } else if (i3 == 0) {
                    final C8C0 c8c03 = C8C0.this;
                    C8J9 c8j92 = c8c03.A03;
                    if (c8c03.A06 && c8c03.A0D && c8j92 != null) {
                        c8c03.A06 = false;
                        C8JE c8je = c8j92.A00;
                        c8je.A01 = true;
                        int itemCount = c8je.getItemCount();
                        LinearLayoutManager linearLayoutManager = c8c03.A0K;
                        if (itemCount > linearLayoutManager.A1b()) {
                            int A1b = linearLayoutManager.A1b();
                            while (true) {
                                if (A1b >= linearLayoutManager.A1a()) {
                                    C3OO A0W = c8c03.A0P.A0W(A1b, false);
                                    if (A0W instanceof C9V2) {
                                        c9v2 = (C9V2) A0W;
                                        break;
                                    }
                                    A1b--;
                                } else {
                                    c9v2 = null;
                                    break;
                                }
                            }
                            c8c03.A01 = c9v2;
                            if (c9v2 != null) {
                                c9v2.A02 = new C8C3() { // from class: X.Afm
                                    @Override // X.C8C3
                                    public final void Cwb(float f) {
                                        C8C0 c8c04 = C8C0.this;
                                        if (f == 1.0f) {
                                            c8c04.A01 = null;
                                        }
                                    }
                                };
                            }
                        }
                        Runnable runnable = c8c03.A04;
                        if (runnable != null) {
                            runnable.run();
                            c8c03.A04 = null;
                        }
                        c8c03.A05 = true;
                    }
                    if (c8c03.A02 == null) {
                        C8C0.A06(c8c03);
                        C8J9 c8j93 = c8c03.A03;
                        if (c8j93 != null) {
                            c8j93.A01(C8C0.A03(c8c03));
                        }
                        if (c8c03.A0D) {
                            C8CD c8cd = c8c03.A0Q;
                            c8cd.getClass();
                            if (c8cd.A02.size() > 1 && (A02 = C8C0.A02(c8c03)) == 0) {
                                c8c03.EMO(1, A02);
                            }
                        }
                    }
                }
                C0f9.A0A(1925274712, A03);
            }

            @Override // X.C1I4
            public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                float f;
                int A03 = C0f9.A03(137571095);
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.A00;
                if (j > 0) {
                    f = i3 / ((float) (currentTimeMillis - j));
                } else {
                    f = 0.0f;
                }
                C8C0 c8c0 = C8C0.this;
                if (c8c0.A0P.getScrollState() != 0) {
                    this.A00 = currentTimeMillis;
                }
                if (c8c0.A02 == null && c8c0.A03 != null) {
                    if (c8c0.A0A) {
                        C8C0.A05(c8c0);
                    }
                    int A02 = C8C0.A02(c8c0);
                    if (c8c0.A0D) {
                        if (A02 != 0) {
                            A02--;
                        }
                    }
                    C8J9 c8j9 = c8c0.A03;
                    ArrayList A032 = C8C0.A03(c8c0);
                    boolean z4 = c8c0.A07;
                    C8JE c8je = c8j9.A00;
                    if (((C8JF) c8je).A00 != A02 && !c8je.A03) {
                        c8je.A02(A02);
                    }
                    if (!z4) {
                        float f2 = f * 3.0f;
                        Iterator it = A032.iterator();
                        while (it.hasNext()) {
                            ((C9V2) it.next()).A01(f2);
                        }
                    }
                }
                C0f9.A0A(-635106984, A03);
            }
        };
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.A0K = linearLayoutManager;
        linearLayoutManager.A12(true);
        final int i3 = c8c5.A00;
        if (i3 == 0) {
            TargetViewSizeProvider targetViewSizeProvider2 = c8c5.A03;
            if (targetViewSizeProvider2 != null) {
                i2 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K.getWidth();
            } else {
                i2 = c8c5.A01;
            }
            i3 = (i2 - c8c5.A02) / 2;
            c8c5.A00 = i3;
        }
        nestableSnapPickerRecyclerView.A10(new AbstractC70653Fc(i3) { // from class: X.8C7
            public final int A00;

            {
                this.A00 = i3;
            }

            /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
            
                if (r1 != false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
            
                r7.right = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0075, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x008a, code lost:
            
                r7.left = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x008c, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0088, code lost:
            
                if (r1 != false) goto L49;
             */
            @Override // X.AbstractC70653Fc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void getItemOffsets(android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, X.C3F5 r10) {
                /*
                    r6 = this;
                    X.8C0 r3 = X.C8C0.this
                    boolean r0 = r3.A0D
                    r2 = 1
                    if (r0 == 0) goto L13
                    X.8CD r0 = r3.A0Q
                    if (r0 == 0) goto L13
                    java.util.List r0 = r0.A02
                    int r0 = r0.size()
                    if (r0 == r2) goto L66
                L13:
                    boolean r0 = r3.A0D
                    r5 = 0
                    if (r0 != 0) goto L2c
                    X.8CD r0 = r3.A0Q
                    if (r0 == 0) goto L2c
                    java.util.List r1 = r0.A02
                    java.lang.Object r0 = r1.get(r5)
                    if (r0 == 0) goto L2c
                    java.lang.Object r0 = r1.get(r5)
                    boolean r0 = r0 instanceof X.C8C8
                    if (r0 != 0) goto L66
                L2c:
                    boolean r0 = r3.A0D
                    if (r0 != 0) goto L50
                    X.8CD r4 = r3.A0Q
                    if (r4 == 0) goto L50
                    java.util.List r1 = r4.A02
                    int r0 = r1.size()
                    if (r0 != r2) goto L50
                    java.lang.Object r0 = r1.get(r5)
                    if (r0 == 0) goto L50
                    java.lang.Object r0 = r1.get(r5)
                    boolean r0 = r0 instanceof X.C8JC
                    if (r0 == 0) goto L50
                    int[] r0 = r4.A00
                    r0 = r0[r5]
                    if (r0 == r2) goto L66
                L50:
                    boolean r0 = r3.A0D
                    if (r0 != 0) goto L67
                    X.8J9 r0 = r3.A03
                    if (r0 == 0) goto L67
                    X.8JE r1 = r0.A00
                    if (r1 == 0) goto L67
                    boolean r0 = r1 instanceof X.C218209ks
                    if (r0 == 0) goto L67
                    int r0 = r1.getItemCount()
                    if (r0 != r2) goto L67
                L66:
                    return
                L67:
                    int r1 = androidx.recyclerview.widget.RecyclerView.A02(r8)
                    if (r1 != 0) goto L76
                    boolean r1 = r3.A0U
                    int r0 = r6.A00
                    if (r1 == 0) goto L8a
                L73:
                    r7.right = r0
                    return
                L76:
                    X.2UU r0 = r9.A0A
                    r0.getClass()
                    int r0 = r0.getItemCount()
                    int r0 = r0 - r2
                    if (r1 != r0) goto L66
                    boolean r1 = r3.A0U
                    int r0 = r6.A00
                    int r0 = r0 + 1
                    if (r1 == 0) goto L73
                L8a:
                    r7.left = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8C7.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3F5):void");
            }
        });
        nestableSnapPickerRecyclerView.setLayoutManager(linearLayoutManager);
        this.A0H = c83e;
        this.A0O = new C8C8(galleryPickerServiceDataSource, userSession, c183498Bw, this, c83e);
        this.A0T = z2;
        this.A0G = anonymousClass860;
        nestableSnapPickerRecyclerView.setItemAnimator(null);
        if (z) {
            C8CD c8cd = new C8CD();
            this.A0Q = c8cd;
            if (this.A0D) {
                xam.getClass();
                C65988Txh c65988Txh = new C65988Txh(userSession, xam);
                this.A00 = c65988Txh;
                c65988Txh.A00 = this.A0E;
                c8cd.A03(c65988Txh, c8cd.A02.size());
            }
            nestableSnapPickerRecyclerView.setAdapter(c8cd);
        } else {
            AbstractC13880nE.A0q(nestableSnapPickerRecyclerView, new Runnable() { // from class: X.8C9
                @Override // java.lang.Runnable
                public final void run() {
                    C8C0 c8c0 = C8C0.this;
                    c8c0.A0P.A14(c8c0.A0N);
                }
            });
        }
        this.A0S = new Runnable() { // from class: X.8CA
            @Override // java.lang.Runnable
            public final void run() {
                C2UU c2uu;
                C8C0 c8c0 = C8C0.this;
                if (c8c0.A0D && C8C0.A02(c8c0) == 0 && (c2uu = c8c0.A0P.A0A) != null && c2uu.getItemCount() > 1) {
                    c8c0.A0A = true;
                    c8c0.EMO(1, 0);
                }
            }
        };
        this.A0R = new Runnable() { // from class: X.8CB
            @Override // java.lang.Runnable
            public final void run() {
                C8C0.A05(C8C0.this);
            }
        };
        if (c1810981l != null) {
            c1810981l.A0G(anonymousClass822);
        }
        this.A0V = z3;
        if (anonymousClass860 != null) {
            AbstractC58232lf.A00(AnonymousClass191.A00, anonymousClass860.A0c).A06(c07x, new InterfaceC58362lv() { // from class: X.8CF
                @Override // X.InterfaceC58362lv
                public final void onChanged(Object obj) {
                    C8C0 c8c0 = C8C0.this;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    c8c0.A09 = booleanValue;
                    if (booleanValue) {
                        c8c0.A0B(false);
                    } else {
                        c8c0.A0C(false);
                    }
                }
            });
        }
    }
}
