package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Lf8 implements InterfaceC195388ke, InterfaceC193848i5, InterfaceC195648l5, InterfaceC193868i7, InterfaceC188988Yo, InterfaceC23471Cj, MO7, AdapterView.OnItemSelectedListener {
    public int A00;
    public Medium A01;
    public C195838lR A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public float A08;
    public Integer A09;
    public final int A0A;
    public final int A0B;
    public final Activity A0C;
    public final Drawable A0D;
    public final View A0E;
    public final ViewGroup A0F;
    public final ImageView A0G;
    public final GridLayoutManager A0H;
    public final RecyclerView A0I;
    public final C8SF A0J;
    public final C194278in A0K;
    public final C159407Da A0L;
    public final C189058Yv A0M;
    public final TriangleSpinner A0N;
    public final Runnable A0O;
    public final View A0P;
    public final ViewGroup A0Q;
    public final KFD A0R;
    public final C44417JkC A0S;

    public Lf8(Activity activity, ViewGroup viewGroup, ImageView imageView, AbstractC018607g abstractC018607g, KFD kfd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, TriangleSpinner triangleSpinner) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(viewGroup, 4);
        AbstractC167017dG.A1T(imageView, triangleSpinner);
        C14360o3.A0B(interfaceC11380iw, 8);
        this.A0C = activity;
        this.A0F = viewGroup;
        this.A0G = imageView;
        ViewGroup viewGroup2 = (ViewGroup) AbstractC166997dE.A0S(viewGroup, R.id.gallery_container);
        this.A0Q = viewGroup2;
        this.A0O = new RunnableC49836Lzh(this);
        C159407Da c159407Da = new C159407Da(userSession);
        this.A0L = c159407Da;
        Integer num = C05F.A00;
        this.A09 = num;
        this.A00 = -1;
        Resources resources = activity.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C14360o3.A07(displayMetrics);
        float A05 = AbstractC13880nE.A05(displayMetrics);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0A = dimensionPixelSize;
        int A0A = (AbstractC13880nE.A0A(activity) - (dimensionPixelSize * 2)) / 3;
        int round = Math.round(A0A / A05);
        this.A0R = kfd;
        C8SF c8sf = new C8SF(activity, userSession, num, A0A, round, false);
        this.A0J = c8sf;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(activity, 3);
        this.A0H = gridLayoutManager;
        List list = C194278in.A0H;
        C194278in c194278in = new C194278in(activity, interfaceC11380iw, null, c8sf, userSession, this, new C193958iG(userSession, c159407Da, round), null, this, null, null, null, false);
        this.A0K = c194278in;
        int round2 = Math.round(((float) System.currentTimeMillis()) / 1000.0f) - Integer.MAX_VALUE;
        C188958Yl c188958Yl = new C188958Yl(abstractC018607g, c8sf);
        c188958Yl.A03 = EnumC188968Ym.A04;
        c188958Yl.A00 = round2;
        c188958Yl.A0A = true;
        c188958Yl.A07 = this;
        this.A0M = new C189058Yv(activity, null, c194278in, new C189028Ys(c188958Yl));
        this.A0P = viewGroup.requireViewById(R.id.gallery_empty);
        this.A0E = viewGroup.requireViewById(R.id.gallery_loading_spinner);
        RecyclerView A0G = AbstractC31172DnG.A0G(viewGroup2, R.id.gallery_recycler_view);
        this.A0I = A0G;
        this.A0B = AbstractC43594JPz.A05(activity);
        this.A0D = activity.getDrawable(R.drawable.nav_gallery);
        A0G.setAdapter(c194278in.A06);
        A0G.setLayoutManager(gridLayoutManager);
        A0G.setOverScrollMode(2);
        C44286Jhc.A00(A0G, this, 2);
        this.A0N = triangleSpinner;
        C44417JkC c44417JkC = new C44417JkC(this);
        this.A0S = c44417JkC;
        triangleSpinner.setAdapter((SpinnerAdapter) c44417JkC);
        triangleSpinner.setOnItemSelectedListener(this);
        imageView.setVisibility(0);
        C3P9 A0s = AbstractC166987dD.A0s(imageView);
        A0s.A07 = true;
        KKp.A01(A0s, kfd, 3);
    }

    @Override // X.InterfaceC193848i5
    public final void CMT(boolean z) {
    }

    @Override // X.InterfaceC193848i5
    public final boolean CWE() {
        return false;
    }

    @Override // X.InterfaceC193848i5
    public final boolean CWF() {
        return false;
    }

    @Override // X.InterfaceC188988Yo
    public final void DEP(Exception exc) {
    }

    @Override // X.InterfaceC193848i5
    public final void DEt() {
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void DHW(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DNQ(GalleryItem galleryItem, BBC bbc, int i) {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DNa(View view, GalleryItem galleryItem, BBC bbc, int i) {
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DNr(GalleryItem galleryItem, boolean z) {
    }

    @Override // X.InterfaceC195388ke
    public final void DNu(GalleryItem galleryItem, BBC bbc, int i, boolean z) {
        boolean A1R = AbstractC167007dF.A1R(0, galleryItem, bbc);
        if (bbc instanceof C9NP) {
            if (z) {
                this.A0K.A01(galleryItem, ((C9NP) bbc).A00);
                return;
            }
            Medium medium = galleryItem.A00;
            if (medium == null) {
                return;
            }
            if (!medium.isValid() && !medium.A05()) {
                return;
            }
            this.A09 = C05F.A01;
            KFD kfd = this.A0R;
            if (kfd.A0B) {
                return;
            }
            kfd.A0B = A1R;
            AbstractC63248Sg4.A02(kfd.A0R.getParentFragmentManager());
            C47957LGt c47957LGt = kfd.A02;
            if (c47957LGt != null) {
                String str = medium.A0X;
                C14360o3.A0B(str, 0);
                Handler handler = c47957LGt.A02;
                if (handler != null) {
                    handler.removeMessages(A1R ? 1 : 0);
                    handler.removeMessages(2);
                    handler.removeMessages(3);
                    Message obtainMessage = handler.obtainMessage(3, str);
                    C14360o3.A07(obtainMessage);
                    handler.sendMessage(obtainMessage);
                    return;
                }
                c47957LGt.A07.DLZ();
                return;
            }
            KFD.A01(kfd);
        }
    }

    @Override // X.InterfaceC188988Yo
    public final void DS1(C189058Yv c189058Yv, List list, List list2, int i) {
        C14360o3.A0B(list2, 2);
        if (!this.A03) {
            this.A0M.A09.A09.AHe();
            this.A0K.EYj(AbstractC166987dD.A1E(), "");
            return;
        }
        if (list2.isEmpty()) {
            this.A0G.setImageDrawable(this.A0D);
            this.A01 = null;
        } else {
            Medium medium = (Medium) list2.get(0);
            this.A01 = medium;
            C8SF c8sf = this.A0J;
            if (medium != null) {
                c8sf.A04(medium, new C48282LYf(this, 0));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C0fA.A00(this.A0S, 1389459069);
        if (!this.A04) {
            return;
        }
        if (this.A00 >= 0) {
            int i2 = 0;
            int size = list2.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (((Medium) list2.get(i2)).A05 == this.A00) {
                    this.A0H.A1p(i2, 0);
                    break;
                }
                i2++;
            }
            this.A00 = -1;
        }
        this.A0E.postDelayed(this.A0O, 300L);
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void DU5() {
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        this.A07 = false;
        if (AbstractC93174Ft.A03(this.A0C)) {
            C195838lR c195838lR = this.A02;
            if (c195838lR != null) {
                c195838lR.A00();
            }
            this.A02 = null;
            A00(this);
            return;
        }
        this.A06 = true;
        A01(this);
    }

    @Override // X.InterfaceC195388ke
    public final /* synthetic */ void Dem(String str) {
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void Dir(float f, float f2, float f3, float f4, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC193848i5
    public final void EW5(boolean z) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
    }

    public static final void A00(Lf8 lf8) {
        Activity activity = lf8.A0C;
        if (AbstractC93174Ft.A03(activity)) {
            lf8.A05 = true;
            A01(lf8);
            lf8.A0N.setVisibility(0);
            lf8.A0M.A07();
            return;
        }
        A01(lf8);
        if (lf8.A07) {
            return;
        }
        lf8.A07 = true;
        AbstractC93174Ft.A01(activity, lf8);
    }

    public static final void A01(Lf8 lf8) {
        if (lf8.A05) {
            lf8.A0E.setVisibility(0);
            lf8.A0I.setVisibility(4);
        } else {
            if (!AbstractC93174Ft.A03(lf8.A0C)) {
                lf8.A0E.setVisibility(8);
                lf8.A0I.setVisibility(8);
                lf8.A0P.setVisibility(8);
                if (lf8.A02 != null) {
                    return;
                }
                ViewGroup viewGroup = lf8.A0F;
                Context context = viewGroup.getContext();
                C195838lR A0j = AbstractC43593JPy.A0j(viewGroup);
                A0j.A05(context.getString(2131968167));
                A0j.A04(context.getString(2131971207));
                A0j.A02(2131968166);
                A0j.A01();
                lf8.A02 = A0j;
                A0j.A03(LQ0.A01(lf8, 51));
                return;
            }
            int A00 = lf8.A0K.A00();
            lf8.A0E.setVisibility(8);
            RecyclerView recyclerView = lf8.A0I;
            if (A00 == 0) {
                recyclerView.setVisibility(4);
                lf8.A0P.setVisibility(0);
                return;
            }
            recyclerView.setVisibility(0);
        }
        lf8.A0P.setVisibility(4);
    }

    @Override // X.InterfaceC193868i7
    public final Integer AtC() {
        return null;
    }

    @Override // X.InterfaceC193868i7
    public final /* synthetic */ boolean CLK() {
        return false;
    }

    @Override // X.InterfaceC193858i6
    public final boolean CVK() {
        return AbstractC25229BEm.A1a(this.A09, C05F.A0C);
    }

    @Override // X.InterfaceC193868i7
    public final /* synthetic */ boolean CYh() {
        return false;
    }

    @Override // X.InterfaceC193848i5
    public final void DDr(boolean z) {
        this.A0M.A07();
    }

    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        this.A08 = f;
        TriangleSpinner triangleSpinner = this.A0N;
        triangleSpinner.setAlpha(f);
        if (f2 > 0.0f) {
            if (!this.A04) {
                this.A04 = true;
                if (AbstractC93174Ft.A03(this.A0C)) {
                    C195838lR c195838lR = this.A02;
                    if (c195838lR != null) {
                        c195838lR.A00();
                    }
                    this.A02 = null;
                }
                A00(this);
                return;
            }
            return;
        }
        this.A04 = false;
        this.A0I.removeCallbacks(this.A0O);
        this.A0M.A08();
        this.A00 = -1;
        this.A0K.EYj(AbstractC166987dD.A1E(), "");
        triangleSpinner.setVisibility(8);
        A01(this);
    }

    @Override // X.InterfaceC1829689r
    public final void Du2(float f, float f2) {
        this.A09 = C05F.A00;
    }

    @Override // X.InterfaceC193868i7
    public final void EST(Integer num) {
    }

    @Override // X.InterfaceC193858i6
    public final boolean FAE(float f, float f2, float f3) {
        Integer num = this.A09;
        if (num == C05F.A00) {
            if (this.A08 < 0.5f || f2 < this.A0Q.getTop() || (this.A0H.A1c() == 0 && f3 > 0.0f)) {
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
            this.A09 = num;
        }
        if (num == C05F.A01) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC193868i7
    public final int getColumnCount() {
        return this.A0H.A00;
    }

    @Override // X.InterfaceC195648l5
    public final Folder getCurrentFolder() {
        return this.A0M.A01;
    }

    @Override // X.InterfaceC195648l5
    public final List getFolders() {
        C189058Yv c189058Yv = this.A0M;
        C14360o3.A0B(c189058Yv, 0);
        Comparator comparator = AbstractC47899LDt.A01;
        C14360o3.A0B(comparator, 2);
        ArrayList A04 = c189058Yv.A04();
        ArrayList A05 = c189058Yv.A05();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Folder folder = (Folder) next;
            if (folder != null && folder.A02 != -5 && !folder.A05.isEmpty()) {
                A1E.add(next);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = A05.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Folder folder2 = (Folder) next2;
            if (folder2 != null && folder2.A02 != -5 && !folder2.A05.isEmpty()) {
                A1E2.add(next2);
            }
        }
        return AbstractC001800i.A0g(AbstractC001800i.A0S(A1E2, A1E), comparator);
    }

    @Override // X.InterfaceC1821886c
    public final void onPause() {
        this.A0M.A08();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.A0M.A0C(((Folder) getFolders().get(i)).A02);
        this.A0I.A0n(0);
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ boolean DJG(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        return false;
    }
}
