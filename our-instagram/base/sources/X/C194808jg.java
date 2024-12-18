package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.google.common.collect.ImmutableCollection;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C194808jg extends Drawable implements C5RP, C74Q, Drawable.Callback, C5RS, C5RT {
    public int A00;
    public ACE A01;
    public C6RL A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public BBJ A07;
    public final List A08;
    public final CopyOnWriteArraySet A09;
    public final Context A0A;
    public final Rect A0B;
    public final UserSession A0C;
    public final String A0D;
    public final List A0E;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.9kH] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.8xc] */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.9k7] */
    /* JADX WARN: Type inference failed for: r11v18, types: [X.74P] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.74P, X.8OT] */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    public static C194808jg A00(Context context, Resources.Theme theme, C9QC c9qc, UserSession userSession, C148276lx c148276lx, C75B c75b) {
        ?? c202588xc;
        C9QC c9qc2;
        String str;
        int round;
        String str2;
        C148286ly c148286ly;
        ArrayList arrayList = new ArrayList();
        List list = c148276lx.A0O;
        for (int i = 0; i < list.size(); i++) {
            C148286ly c148286ly2 = (C148286ly) list.get(i);
            EnumC150226pU A00 = c148276lx.A00();
            EnumC150226pU enumC150226pU = EnumC150226pU.A0f;
            if (A00 == enumC150226pU) {
                C14360o3.A0B(context, 0);
                C14360o3.A0B(userSession, 1);
                C14360o3.A0B(c148286ly2, 2);
                C148286ly c148286ly3 = c148286ly2.A0I;
                int round2 = Math.round(c148286ly2.A00 * c148286ly2.A01);
                if (c148286ly3 == null) {
                    round = -1;
                } else {
                    round = Math.round(c148286ly3.A01 * c148286ly3.A00);
                }
                int A01 = AbstractC188878Yd.A01(context) * AbstractC188878Yd.A00(context);
                ImageUrl imageUrl = null;
                if (round > round2 && round <= A01 && (c148286ly = c148286ly2.A0I) != null) {
                    imageUrl = c148286ly.A0H;
                }
                Resources resources = context.getResources();
                ImageUrl imageUrl2 = c148286ly2.A0H;
                C14360o3.A07(imageUrl2);
                String str3 = c148286ly2.A0S;
                C14360o3.A07(str3);
                Integer valueOf = Integer.valueOf(c148286ly2.A09);
                String str4 = c148286ly2.A0Z;
                String str5 = c148286ly2.A0c;
                float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
                C74V A012 = C74U.A01(context, c148286ly2.A01(), c148286ly2.A01 / c148286ly2.A00, resources.getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large));
                int color = context.getColor(R.color.cds_white_a20);
                int color2 = context.getColor(R.color.fds_white_alpha60);
                Integer num = C05F.A01;
                String url = AbstractC59522nv.A00(imageUrl2).getUrl();
                C14360o3.A07(url);
                if (imageUrl != null) {
                    str2 = AbstractC59522nv.A00(imageUrl).getUrl();
                } else {
                    str2 = null;
                }
                c202588xc = new C74P(context, null, userSession, null, enumC150226pU, null, A012, null, valueOf, num, url, str3, str4, str5, str2, dimensionPixelSize, color, color2, false, true, false);
            } else if (c148276lx.A00() == EnumC150226pU.A0A) {
                C14360o3.A0B(context, 0);
                C14360o3.A0B(userSession, 1);
                C14360o3.A0B(c148286ly2, 2);
                c202588xc = C74N.A00(context, userSession, c148286ly2, false, false);
                C74P c74p = (C74P) c202588xc;
                c74p.A0C = c148286ly2.A0S;
                c74p.A0G = c148286ly2.A0i;
                c74p.A09 = c148286ly2.A0G;
            } else if (c148276lx.A00() == EnumC150226pU.A0M) {
                c202588xc = new C8OT(context, theme, userSession, c148286ly2, c75b);
                c202588xc.A0C = c148286ly2.A0S;
            } else if (c148276lx.A00() == EnumC150226pU.A0Y) {
                if (c9qc != null) {
                    long j = c9qc.A01;
                    String str6 = c9qc.A02;
                    if (c148286ly2.A0U != null) {
                        str = c148286ly2.A0U;
                    } else {
                        str = "UNKNOWN";
                    }
                    c9qc2 = new C9QC(str6, str, j);
                } else {
                    c9qc2 = null;
                }
                c202588xc = new C217749k7(context, c9qc2, userSession, c148276lx, c148286ly2);
            } else {
                c202588xc = new C202588xc(context, c148276lx.A00, userSession, c148286ly2, c148276lx.A00(), c148276lx.A06, c148276lx.A0Z);
            }
            arrayList.add(c202588xc);
        }
        C194808jg c194808jg = new C194808jg(context, userSession, c148276lx.A0I, arrayList);
        ?? obj = new Object();
        obj.A00 = c148276lx;
        c194808jg.A03 = obj;
        return c194808jg;
    }

    public static C194808jg A01(Context context, UserSession userSession, C148276lx c148276lx) {
        return A00(context, null, null, userSession, c148276lx, null);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A02(Drawable drawable) {
        if (drawable instanceof C74R) {
            ((C74R) drawable).D2h(false);
        }
        Object A04 = A04();
        if (A04 instanceof C74R) {
            ((C74R) A04).D2h(true);
        }
        if (A04 instanceof C202588xc) {
            ((C202588xc) A04).A04();
        }
        BBJ bbj = this.A07;
        if (bbj != null) {
            C9LJ c9lj = (C9LJ) bbj;
            Drawable drawable2 = c9lj.A0B;
            int centerX = drawable2.getBounds().centerX();
            int centerY = drawable2.getBounds().centerY();
            Rect rect = new Rect(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            rect.offset(centerX - rect.centerX(), centerY - rect.centerY());
            drawable2.setBounds(rect);
            c9lj.Cp4(true);
        }
    }

    public final Drawable A04() {
        return (Drawable) this.A08.get(this.A00);
    }

    public final Iterable A05() {
        List list = this.A08;
        list.getClass();
        if (!(list instanceof C60757RQj) && !(list instanceof ImmutableCollection)) {
            return new C60757RQj(list);
        }
        return list;
    }

    public final ArrayList A06(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.A08) {
            if (cls.isInstance(obj)) {
                arrayList.add(cls.cast(obj));
            }
        }
        return arrayList;
    }

    public final void A07() {
        this.A01.A00 = true;
        A09();
        int i = 0;
        while (true) {
            List list = this.A08;
            if (i < list.size()) {
                Object obj = (Drawable) list.get(i);
                if (obj instanceof C74R) {
                    ((C74R) obj).DhX();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void A08() {
        List list = this.A0E;
        if (list.isEmpty()) {
            InterfaceC133135zf interfaceC133135zf = (InterfaceC133135zf) A04();
            Drawable AKx = interfaceC133135zf.AKx("sticker_color_customizable_default");
            Drawable AKx2 = interfaceC133135zf.AKx("sticker_color_customizable_inverted");
            Drawable AKx3 = interfaceC133135zf.AKx("sticker_color_customizable_transparent_background");
            list.add(AKx);
            list.add(AKx2);
            list.add(AKx3);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Drawable) it.next()).setCallback(this);
            }
            List list2 = this.A08;
            this.A06 = list2.size();
            list2.addAll(list);
        }
        Drawable A04 = A04();
        A03(this, this.A06);
        if (A04 != A04()) {
            A02(A04);
        }
    }

    public final void A09() {
        boolean A01 = this.A01.A01();
        C6RL c6rl = this.A02;
        if (A01) {
            String A00 = this.A01.A00();
            C6RB c6rb = c6rl.A05;
            if (A00 == null) {
                A00 = "";
            }
            c6rb.A0M(A00);
            c6rl.invalidateSelf();
            this.A02.A01();
            ACE ace = this.A01;
            if (ace instanceof C217709k3) {
                ((C217709k3) ace).A00 = true;
            } else if (ace instanceof C9PD) {
                ((C9PD) ace).A00 = true;
            }
        } else {
            c6rl.A00();
        }
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        r6.AGx(r1, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(int r9) {
        /*
            r8 = this;
            java.util.List r0 = r8.A0E
            java.util.Iterator r7 = r0.iterator()
        L6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r6 = r7.next()
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r0 = r6
            X.5ze r0 = (X.InterfaceC133125ze) r0
            X.5zf r6 = (X.InterfaceC133135zf) r6
            java.lang.String r5 = r0.C5K()
            kotlin.enums.EnumEntries r0 = X.EnumC222529rt.A01
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.9rt[] r4 = X.EnumC222529rt.values()
            int r3 = r4.length
            r2 = 0
        L27:
            if (r2 >= r3) goto L3a
            r1 = r4[r2]
            java.lang.String r0 = r1.A00
            boolean r0 = X.C14360o3.A0K(r0, r5)
            if (r0 == 0) goto L37
            r6.AGx(r1, r9)
            goto L6
        L37:
            int r2 = r2 + 1
            goto L27
        L3a:
            r0 = 6
            java.lang.String r1 = X.MSV.A00(r0)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194808jg.A0A(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        if (r3 >= r2.A08.size()) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto Lb
            java.util.List r0 = r2.A08
            int r1 = r0.size()
            r0 = 1
            if (r3 < r1) goto Lc
        Lb:
            r0 = 0
        Lc:
            X.C18C.A0E(r0)
            int r0 = r2.A00
            if (r3 == r0) goto L23
            android.graphics.drawable.Drawable r1 = r2.A04()
            A03(r2, r3)
            android.graphics.drawable.Drawable r0 = r2.A04()
            if (r1 == r0) goto L23
            r2.A02(r1)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194808jg.A0B(int):void");
    }

    public final void A0C(ACE ace) {
        int A01;
        Integer num;
        int i;
        long j;
        this.A01 = ace;
        Context context = this.A0A;
        C14360o3.A0B(context, 1);
        C6RK c6rk = new C6RK(context, this, -1);
        boolean z = ace instanceof C217719k4;
        if (z) {
            A01 = ace.A02.getIntrinsicWidth();
        } else {
            Context context2 = ace.A01;
            A01 = AbstractC188878Yd.A01(context2) - (context2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material) * 2);
        }
        c6rk.A00 = A01;
        if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        C14360o3.A0B(num, 0);
        c6rk.A06 = num;
        c6rk.A07 = ace.A00();
        if (z) {
            i = R.dimen.action_bar_item_spacing_right;
        } else {
            i = R.dimen.achievements_only_you_bottom_margin;
        }
        c6rk.A02(i);
        if (z) {
            j = 4000;
        } else {
            j = 2000;
        }
        c6rk.A03 = j;
        this.A02 = c6rk.A00();
        A09();
    }

    public final boolean A0E(Class cls) {
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            if (cls.isInstance(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        this.A09.add(interfaceC25177BCa);
        Object A04 = A04();
        if (A04 instanceof C5RP) {
            C5RP c5rp = (C5RP) A04;
            if (c5rp.isLoading()) {
                c5rp.A9I(interfaceC25177BCa);
                return;
            }
        }
        interfaceC25177BCa.DQ0();
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A09.clear();
        Object A04 = A04();
        if (A04 instanceof C5RP) {
            ((C5RP) A04).AHq();
        }
    }

    @Override // X.C74Q
    public final C6RL C5E() {
        return AbstractC1572274c.A00(this.A0A, this);
    }

    @Override // X.C74Q
    public final /* synthetic */ boolean Cf3() {
        return false;
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        this.A09.remove(interfaceC25177BCa);
        Object A04 = A04();
        if (A04 instanceof C5RP) {
            ((C5RP) A04).EFh(interfaceC25177BCa);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.A04) {
            this.A02.draw(canvas);
            A04().draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.A02 || this.A08.indexOf(drawable) == this.A00) {
            invalidateSelf();
        }
    }

    public C194808jg(Context context, UserSession userSession, String str, List list) {
        this.A09 = new CopyOnWriteArraySet();
        this.A0B = new Rect();
        this.A00 = 0;
        this.A05 = false;
        this.A06 = -1;
        this.A04 = false;
        this.A0C = userSession;
        this.A0A = context;
        this.A0D = str;
        this.A0E = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        arrayList.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            ((Drawable) list.get(i)).setCallback(this);
        }
        A0C(new C9PD(context, userSession, this, this.A0D));
        A02(null);
    }

    public static void A03(C194808jg c194808jg, int i) {
        Object A04 = c194808jg.A04();
        if (A04 instanceof C5RP) {
            ((C5RP) A04).AHq();
        }
        int intrinsicWidth = c194808jg.A04().getIntrinsicWidth();
        int intrinsicHeight = c194808jg.A04().getIntrinsicHeight();
        Rect rect = c194808jg.A0B;
        c194808jg.copyBounds(rect);
        c194808jg.A00 = i;
        c194808jg.A00 = i % c194808jg.A08.size();
        int intrinsicWidth2 = c194808jg.A04().getIntrinsicWidth();
        int intrinsicHeight2 = c194808jg.A04().getIntrinsicHeight();
        int round = rect.left + Math.round((intrinsicWidth - intrinsicWidth2) / 2.0f);
        int round2 = rect.top + Math.round((intrinsicHeight - intrinsicHeight2) / 2.0f);
        c194808jg.setBounds(round, round2, intrinsicWidth2 + round, intrinsicHeight2 + round2);
        if (rect.equals(c194808jg.getBounds())) {
            c194808jg.onBoundsChange(c194808jg.getBounds());
        }
        Object A042 = c194808jg.A04();
        if (A042 instanceof C5RP) {
            C5RP c5rp = (C5RP) A042;
            Iterator it = c194808jg.A09.iterator();
            while (it.hasNext()) {
                c5rp.A9I((InterfaceC25177BCa) it.next());
            }
        }
        c194808jg.A09();
        c194808jg.invalidateSelf();
    }

    public final boolean A0D() {
        Drawable A04 = A04();
        A03(this, this.A00 + 1);
        if (A04 != A04()) {
            A02(A04);
            return true;
        }
        return false;
    }

    @Override // X.C5RS
    public final void AQg(Canvas canvas) {
        A04().draw(canvas);
    }

    @Override // X.C74Q
    public final void CN0() {
        if (A04() instanceof C74Q) {
            ((C74Q) A04()).CN0();
        }
    }

    @Override // X.C74Q
    public final boolean CaH(UserSession userSession) {
        if ((A04() instanceof C74Q) && ((C74Q) A04()).CaH(userSession)) {
            return true;
        }
        return false;
    }

    @Override // X.C5RT
    public final void EYL(BBJ bbj) {
        this.A07 = bbj;
    }

    @Override // X.C74Q
    public final void FBl(boolean z, boolean z2) {
        if (A04() instanceof C74Q) {
            ((C74Q) A04()).FBl(z, z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return A04().getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return A04().getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return A04().getOpacity();
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        Object A04 = A04();
        if (A04 instanceof C5RP) {
            return ((C5RP) A04).isLoading();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        A04().setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        A04().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        A04().setColorFilter(colorFilter);
    }

    public C194808jg(Context context, UserSession userSession, List list) {
        this(context, userSession, null, list);
    }
}
