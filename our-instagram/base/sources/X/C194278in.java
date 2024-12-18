package X;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194278in implements InterfaceC189068Yw, InterfaceC195528ks, InterfaceC195548ku, InterfaceC195558kv {
    public static final List A0H = new ArrayList(0);
    public InterfaceC66382zF A00;
    public String A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final C193528hX A04;
    public final C8SF A05;
    public final C66362zD A06;
    public final UserSession A07;
    public final C193958iG A08;
    public final InterfaceC195388ke A09;
    public final String A0A;
    public final InterfaceC16820sZ A0B;
    public final InterfaceC16820sZ A0C;
    public final InterfaceC193868i7 A0D;
    public final C5JK A0E;
    public final boolean A0F;
    public volatile boolean A0G;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [X.2zJ, java.lang.Object] */
    public C194278in(Activity activity, InterfaceC11380iw interfaceC11380iw, C193528hX c193528hX, C8SF c8sf, UserSession userSession, InterfaceC193868i7 interfaceC193868i7, C193958iG c193958iG, C5JK c5jk, InterfaceC195388ke interfaceC195388ke, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        Integer num;
        C14360o3.A0B(c193958iG, 5);
        this.A07 = userSession;
        this.A0D = interfaceC193868i7;
        this.A09 = interfaceC195388ke;
        this.A08 = c193958iG;
        this.A0C = interfaceC16820sZ;
        this.A0B = interfaceC16820sZ2;
        this.A05 = c8sf;
        this.A03 = interfaceC11380iw;
        this.A04 = c193528hX;
        this.A0E = c5jk;
        this.A0A = str;
        this.A0F = z;
        Context applicationContext = activity.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A02 = applicationContext;
        final C9ET c9et = new C9ET(this, 36);
        Integer num2 = C05F.A01;
        UserSession userSession2 = this.A07;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36321022299874368L)) {
            num = num2;
        } else {
            num = C05F.A00;
        }
        C9BW c9bw = new C9BW(4, new C206279Bk(num2, num2, num2, num, 8), new C206259Bi(C05F.A0C, num2, C05F.A00, Integer.valueOf(((int) C18U.A01(c06090Tz, userSession2, 36602046304162350L)) != 24 ? 16 : 24)));
        C66392zG A00 = C66362zD.A00(activity);
        final InterfaceC195388ke interfaceC195388ke2 = this.A09;
        A00.A01(new C195568kw(c9bw, this.A04, this.A05, userSession2, interfaceC195388ke2, this.A0A, c9et));
        final C206279Bk c206279Bk = (C206279Bk) c9bw.A01;
        final InterfaceC16820sZ interfaceC16820sZ3 = this.A0C;
        A00.A01(new AbstractC66412zI(c206279Bk, interfaceC16820sZ3, c9et) { // from class: X.8ip
            public final C206279Bk A00;
            public final InterfaceC16820sZ A01;
            public final InterfaceC16820sZ A02;

            {
                C14360o3.A0B(c206279Bk, 1);
                this.A00 = c206279Bk;
                this.A02 = interfaceC16820sZ3;
                this.A01 = c9et;
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                InterfaceC16820sZ interfaceC16820sZ4 = this.A02;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate = layoutInflater.inflate(R.layout.gallery_grid_camera_item, viewGroup, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                return new AnonymousClass801((ConstraintLayout) inflate, interfaceC16820sZ4);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                C194348iu c194348iu = (C194348iu) interfaceC66482zP;
                AnonymousClass801 anonymousClass801 = (AnonymousClass801) c3oo;
                C14360o3.A0B(anonymousClass801, 1);
                C206279Bk c206279Bk2 = this.A00;
                C14360o3.A0B(c206279Bk2, 2);
                C110964z8 c110964z8 = new C110964z8();
                ConstraintLayout constraintLayout = anonymousClass801.A01;
                c110964z8.A0I(constraintLayout);
                c110964z8.A0F(R.id.gallery_grid_camera_item_spacer, AbstractC188868Yc.A04((Integer) c206279Bk2.A05));
                c110964z8.A0G(constraintLayout);
                boolean z2 = true;
                int i = 0;
                if (c194348iu == null || (c194348iu.A01 && !c194348iu.A00)) {
                    z2 = false;
                }
                anonymousClass801.A02.A01 = !z2;
                View view = anonymousClass801.A00;
                if (z2) {
                    i = 8;
                }
                view.setVisibility(i);
                List singletonList = Collections.singletonList(constraintLayout);
                C14360o3.A07(singletonList);
                AnonymousClass805.A00(anonymousClass801, (AnonymousClass804) this.A01.invoke(), singletonList);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C194348iu.class;
            }
        });
        final InterfaceC11380iw interfaceC11380iw2 = this.A03;
        A00.A01(new C195588ky(c9bw, interfaceC11380iw2, userSession2, interfaceC195388ke2, new C9ET(this, 35)));
        A00.A01(new AbstractC66412zI(c206279Bk) { // from class: X.8iq
            public final C206279Bk A00;

            {
                C14360o3.A0B(c206279Bk, 1);
                this.A00 = c206279Bk;
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate = layoutInflater.inflate(R.layout.gallery_grid_empty_cell, viewGroup, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                return new AnonymousClass806((ConstraintLayout) inflate);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                AnonymousClass806 anonymousClass806 = (AnonymousClass806) c3oo;
                C14360o3.A0B(anonymousClass806, 1);
                C206279Bk c206279Bk2 = this.A00;
                C14360o3.A0B(c206279Bk2, 1);
                C110964z8 c110964z8 = new C110964z8();
                ConstraintLayout constraintLayout = anonymousClass806.A00;
                c110964z8.A0I(constraintLayout);
                c110964z8.A0F(R.id.gallery_grid_empty_item_spacer, AbstractC188868Yc.A04((Integer) c206279Bk2.A05));
                c110964z8.A0G(constraintLayout);
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C194358iv.class;
            }
        });
        A00.A01(new Object());
        A00.A01(new Object());
        A00.A01(new AbstractC66422zJ(interfaceC11380iw2, interfaceC195388ke2) { // from class: X.8it
            public final InterfaceC11380iw A00;
            public final InterfaceC195388ke A01;

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
                C14360o3.A0B(viewGroup, 0);
                C14360o3.A0B(layoutInflater, 1);
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View inflate = layoutInflater.inflate(R.layout.gallery_memory_item, viewGroup, false);
                C14360o3.A07(inflate);
                return new C9V6(inflate);
            }

            @Override // X.AbstractC66422zJ
            public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
                C194388iy c194388iy = (C194388iy) interfaceC66482zP;
                C9V6 c9v6 = (C9V6) c3oo;
                C14360o3.A0B(c194388iy, 0);
                C14360o3.A0B(c9v6, 1);
                InterfaceC11380iw interfaceC11380iw3 = this.A00;
                InterfaceC195388ke interfaceC195388ke3 = this.A01;
                C14360o3.A0B(interfaceC11380iw3, 2);
                C14360o3.A0B(interfaceC195388ke3, 3);
                C57Z.A02(c9v6.A02);
                View view = c9v6.A00;
                view.setEnabled(true);
                view.setVisibility(0);
                c9v6.A01.post(new RunnableC24764Axm(interfaceC11380iw3, c9v6, c194388iy));
                view.setClickable(true);
                C3P9 c3p9 = new C3P9(view);
                c3p9.A0D = true;
                c3p9.A07 = true;
                c3p9.A02 = 0.92f;
                c3p9.A04 = new C23687AeM(c9v6, c194388iy, interfaceC195388ke3);
                c3p9.A00();
            }

            @Override // X.AbstractC66422zJ
            public final Class modelClass() {
                return C194388iy.class;
            }

            {
                this.A00 = interfaceC11380iw2;
                this.A01 = interfaceC195388ke2;
            }
        });
        A00.A08 = true;
        A00.A06 = "GalleryGridAdapter";
        this.A06 = A00.A00();
        C13920nI c13920nI = C13920nI.A00;
        InterfaceC14020nS A002 = C14120nc.A00();
        C14360o3.A07(A002);
        C14360o3.A0B(c13920nI, 1);
        new C18220v9(c13920nI, A002).ATO(new AbstractRunnableC14200nk() { // from class: X.8iz
            {
                super(426, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C194278in c194278in = C194278in.this;
                List list = C194278in.A0H;
                UserSession userSession3 = c194278in.A07;
                c194278in.A0G = ((C195618l1) userSession3.A01(C195618l1.class, new C50152MDf(userSession3, 29))).A00.getBoolean("debug_key", false);
            }
        });
    }

    public final void A01(GalleryItem galleryItem, Bitmap bitmap) {
        Boolean bool;
        C193958iG c193958iG = this.A08;
        C9EB c9eb = new C9EB(this, 45);
        InterfaceC195388ke interfaceC195388ke = this.A09;
        C9EB c9eb2 = new C9EB(this, 46);
        C7Db c7Db = c193958iG.A0H;
        if (c7Db.Ccf(galleryItem)) {
            c7Db.EFS(galleryItem);
            if ((c7Db instanceof C159407Da) && (c193958iG.A02 instanceof C81V)) {
                return;
            }
            C193958iG.A00(galleryItem, c193958iG);
            c193958iG.A01(c9eb2);
            bool = false;
        } else if (c7Db.A8r(new C9NH(galleryItem, bitmap))) {
            c193958iG.A01(c9eb2);
            bool = true;
        } else {
            c9eb.invoke(Integer.valueOf(c7Db.BPr()));
            return;
        }
        boolean booleanValue = bool.booleanValue();
        C14360o3.A0B(galleryItem, 0);
        interfaceC195388ke.DNr(galleryItem, booleanValue);
    }

    @Override // X.InterfaceC195528ks
    public final void DoX(List list) {
    }

    @Override // X.InterfaceC189068Yw
    public final void EYj(List list, String str) {
        C14360o3.A0B(list, 0);
        if (list.isEmpty() || !C14360o3.A0K(this.A01, str)) {
            C193958iG c193958iG = this.A08;
            C16920sk A0E = AbstractC06930Yk.A0E();
            C14360o3.A0B(A0E, 0);
            c193958iG.A06 = A0E;
        }
        this.A01 = str;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str2 = ((Medium) obj).A0X;
            C14360o3.A0B(str2, 0);
            C11L c11l = AbstractC195768lH.A00;
            C14360o3.A07(new File(str2).getName());
            if (!c11l.A08(r0)) {
                arrayList.add(obj);
            }
        }
        C193958iG c193958iG2 = this.A08;
        LinkedHashMap A03 = AbstractC06930Yk.A03(c193958iG2.A06);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            Medium medium = (Medium) next;
            int CNS = c193958iG2.A0H.CNS(medium);
            Integer valueOf = Integer.valueOf(medium.A05);
            String A00 = C195778lI.A00.A00(medium, this.A07);
            GalleryItem.LocalGalleryMedium localGalleryMedium = new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05));
            boolean z = false;
            if (CNS != -1) {
                z = true;
            }
            C9BB c9bb = new C9BB(null, CNS, 0, 12, 3, z, false);
            boolean z2 = c193958iG2.A0A;
            boolean z3 = c193958iG2.A0E;
            Integer valueOf2 = Integer.valueOf(this.A0D.getColumnCount());
            Context context = this.A02;
            A03.put(valueOf, new C195598kz(c9bb, localGalleryMedium, new C195788lL(valueOf2, Integer.valueOf(C1H4.A01(((AbstractC188878Yd.A01(context) - (context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) * (r12 - 1))) / r12) / 0.5625f)), z2, false, z3, false, this.A0G, c193958iG2.A02 instanceof C208509Kk, this.A0F), A00));
            i = i2;
        }
        c193958iG2.A06 = AbstractC06930Yk.A0B(A03);
        A02(this.A00);
        C5JK c5jk = this.A0E;
        if (c5jk != null && str != null && str.length() != 0 && list.size() > 50) {
            InterfaceC193868i7 interfaceC193868i7 = this.A0D;
            if (interfaceC193868i7.AtC() != null) {
                interfaceC193868i7.EST(null);
                AnonymousClass229.A01(this.A07).A0J.A03(c5jk, "set_media");
            }
        }
    }

    @Override // X.InterfaceC189068Yw
    public final void EdU(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    public final int A00() {
        C193958iG c193958iG = this.A08;
        return c193958iG.A06.size() + c193958iG.A07.size();
    }

    public final void A02(InterfaceC66382zF interfaceC66382zF) {
        boolean z;
        ArrayList arrayList;
        long j;
        long millis;
        Long l;
        C193958iG c193958iG = this.A08;
        final Context context = this.A02;
        InterfaceC16820sZ interfaceC16820sZ = this.A0B;
        if (interfaceC16820sZ != null) {
            z = ((Boolean) interfaceC16820sZ.invoke()).booleanValue();
        } else {
            z = false;
        }
        boolean A03 = AbstractC93174Ft.A03(context);
        InterfaceC193868i7 interfaceC193868i7 = this.A0D;
        boolean CYh = interfaceC193868i7.CYh();
        boolean CLK = interfaceC193868i7.CLK();
        int columnCount = interfaceC193868i7.getColumnCount();
        C8l2 c8l2 = new C8l2(context);
        C207189Ex c207189Ex = new C207189Ex(0, this, interfaceC66382zF);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        int i = 0;
        if (z) {
            C194348iu c194348iu = new C194348iu(c193958iG.A0A, c193958iG.A0B);
            linkedHashMap2.put(Integer.valueOf(arrayList2.size()), 0);
            arrayList2.add(c194348iu);
        }
        C194388iy c194388iy = c193958iG.A03;
        if (c194388iy != null) {
            linkedHashMap2.put(Integer.valueOf(arrayList2.size()), 0);
            arrayList2.add(c194388iy);
        }
        final UserSession userSession = c193958iG.A0G;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321022300202053L) && !C18U.A06(c06090Tz, userSession, 36316645727670848L)) {
            arrayList = AbstractC001800i.A0S(AbstractC001800i.A0g(c193958iG.A06.values(), new Comparator() { // from class: X.8j5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C2BS.A00(Long.valueOf(-(((C195598kz) obj).A01.A00.A0C * 1000)), Long.valueOf(-(((C195598kz) obj2).A01.A00.A0C * 1000)));
                }
            }), AbstractC001800i.A0g(c193958iG.A07.values(), new Comparator() { // from class: X.8j4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    long j2;
                    Long l2;
                    Long l3;
                    RemoteMedia remoteMedia = ((C195608l0) obj).A03.A04;
                    long j3 = 0;
                    if (remoteMedia != null && (l3 = remoteMedia.A05) != null) {
                        j2 = l3.longValue();
                    } else {
                        j2 = 0;
                    }
                    Long valueOf = Long.valueOf((-j2) * 1000);
                    RemoteMedia remoteMedia2 = ((C195608l0) obj2).A03.A04;
                    if (remoteMedia2 != null && (l2 = remoteMedia2.A05) != null) {
                        j3 = l2.longValue();
                    }
                    return C2BS.A00(valueOf, Long.valueOf((-j3) * 1000));
                }
            }));
        } else {
            arrayList = new ArrayList();
            arrayList.addAll(c193958iG.A07.values());
            arrayList.addAll(c193958iG.A06.values());
            if (arrayList.size() > 1) {
                C01T.A1D(arrayList, new B0K());
            }
            AbstractC002900t.A10(arrayList);
        }
        if (A03 && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) next;
                linkedHashMap2.put(Integer.valueOf(arrayList2.size()), Integer.valueOf(i));
                arrayList2.add(interfaceC66482zP);
                if (i2 % columnCount == 0) {
                    if (interfaceC66482zP instanceof C195598kz) {
                        millis = ((C195598kz) interfaceC66482zP).A01.A00.A0C * 1000;
                    } else if (interfaceC66482zP instanceof C195608l0) {
                        RemoteMedia remoteMedia = ((C195608l0) interfaceC66482zP).A03.A04;
                        if (remoteMedia != null && (l = remoteMedia.A05) != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        millis = TimeUnit.SECONDS.toMillis(j);
                    } else {
                        throw new IllegalArgumentException("Unsupported Media View Model");
                    }
                    arrayList3.add(c8l2.A00(new Date(millis)));
                    Integer valueOf = Integer.valueOf(i);
                    linkedHashMap.put(valueOf, Integer.valueOf(arrayList3.size() - 1));
                    linkedHashMap3.put(valueOf, Integer.valueOf(i2));
                    i++;
                }
                i2 = i3;
            }
        } else {
            Object obj = new Object();
            int size = arrayList2.size();
            if (size != 0 || !CYh) {
                int i4 = 9 - size;
                for (int i5 = 0; i5 < i4; i5++) {
                    linkedHashMap2.put(Integer.valueOf(arrayList2.size()), 0);
                    arrayList2.add(obj);
                }
            }
        }
        if (CLK) {
            Object obj2 = new Object();
            Integer valueOf2 = Integer.valueOf(i);
            linkedHashMap3.put(valueOf2, Integer.valueOf(arrayList2.size()));
            linkedHashMap2.put(Integer.valueOf(arrayList2.size()), valueOf2);
            arrayList2.add(obj2);
            i++;
        }
        if (CYh && !c193958iG.A07.values().isEmpty()) {
            String A01 = AbstractC47184KtJ.A00.A01(context, userSession);
            String string = context.getString(2131963088);
            C14360o3.A07(string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A01);
            final int color = context.getColor(AbstractC53242c7.A06(context));
            AnonymousClass773.A05(spannableStringBuilder, new AnonymousClass522(context, userSession, color) { // from class: X.9q6
                public final /* synthetic */ Context A00;
                public final /* synthetic */ UserSession A01;

                @Override // X.AnonymousClass522, android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C14360o3.A0B(view, 0);
                    WGT.A06(this.A00, this.A01);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(Integer.valueOf(color));
                }
            }, string);
            C194368iw c194368iw = new C194368iw(spannableStringBuilder);
            Integer valueOf3 = Integer.valueOf(i);
            linkedHashMap3.put(valueOf3, Integer.valueOf(arrayList2.size()));
            linkedHashMap2.put(Integer.valueOf(arrayList2.size()), valueOf3);
            arrayList2.add(c194368iw);
            i++;
        }
        c193958iG.A00 = i;
        c193958iG.A04 = arrayList3;
        c193958iG.A09 = linkedHashMap;
        c193958iG.A05 = linkedHashMap2;
        c193958iG.A08 = linkedHashMap3;
        if (!arrayList.isEmpty()) {
            Iterator it2 = c193958iG.A0I.values().iterator();
            while (it2.hasNext()) {
                ((AbstractC65392xb) it2.next()).onChanged();
            }
        }
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(arrayList2);
        c207189Ex.invoke(viewModelListUpdate);
        c193958iG.A0C = false;
    }

    public final void A03(boolean z, boolean z2, boolean z3) {
        C193958iG c193958iG = this.A08;
        InterfaceC195388ke interfaceC195388ke = this.A09;
        C9ET c9et = new C9ET(this, 37);
        c193958iG.A0B = z3;
        if (c193958iG.A0A != z || c193958iG.A0E != z2) {
            c193958iG.A0A = z;
            c193958iG.A0E = z2;
            interfaceC195388ke.DU5();
            Map map = c193958iG.A06;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                C195598kz c195598kz = (C195598kz) entry.getValue();
                C195788lL c195788lL = c195598kz.A02;
                C195788lL c195788lL2 = new C195788lL(c195788lL.A00, c195788lL.A01, z, c195788lL.A03, z2, c195788lL.A02, c195788lL.A05, c195788lL.A07, c195788lL.A04);
                C195778lI c195778lI = C195778lI.A00;
                GalleryItem.LocalGalleryMedium localGalleryMedium = c195598kz.A01;
                linkedHashMap.put(key, new C195598kz(c195598kz.A00, localGalleryMedium, c195788lL2, c195778lI.A00(localGalleryMedium.A00, c193958iG.A0G)));
            }
            c193958iG.A06 = linkedHashMap;
            Map map2 = c193958iG.A07;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(map2.size()));
            for (Map.Entry entry2 : map2.entrySet()) {
                Object key2 = entry2.getKey();
                entry2.getKey();
                C195608l0 c195608l0 = (C195608l0) entry2.getValue();
                String str = c195608l0.A05;
                ImageUrl imageUrl = c195608l0.A04;
                String str2 = c195608l0.A06;
                int i = c195608l0.A01;
                int i2 = c195608l0.A00;
                GalleryItem galleryItem = c195608l0.A03;
                linkedHashMap2.put(key2, new C195608l0(galleryItem, imageUrl, str, str2, c195608l0.A07, i, i2, c193958iG.A0H.CNK(galleryItem), z, c195608l0.A09));
            }
            c193958iG.A07 = linkedHashMap2;
            c9et.invoke();
        }
    }

    @Override // X.InterfaceC195538kt
    public final int AK4(int i) {
        Number number = (Number) this.A08.A05.get(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC195538kt
    public final int AK8(int i) {
        Number number = (Number) this.A08.A08.get(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC189068Yw
    public final List ANA() {
        return A0H;
    }

    @Override // X.InterfaceC195558kv
    public final int BDU(int i) {
        return this.A08.A01;
    }

    @Override // X.InterfaceC195538kt
    public final int Bph() {
        return this.A08.A00;
    }

    @Override // X.InterfaceC195548ku
    public final int Brg(int i) {
        Number number = (Number) this.A08.A09.get(Integer.valueOf(i));
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC195548ku
    public final List Brl() {
        return this.A08.A04;
    }

    @Override // X.InterfaceC195538kt
    public final void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        AbstractC65392xb abstractC65392xb = new AbstractC65392xb() { // from class: X.8jH
            @Override // X.AbstractC65392xb
            public final void onChanged() {
                dataSetObserver.onChanged();
            }
        };
        this.A06.registerAdapterDataObserver(abstractC65392xb);
        this.A08.A0I.put(dataSetObserver, abstractC65392xb);
    }

    @Override // X.InterfaceC195528ks
    public final int getItemCount() {
        return A00();
    }
}
