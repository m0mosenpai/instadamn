package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.LeX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48595LeX implements MSD, MOO {
    public static final String __redex_internal_original_name = "GalleryStickerGridController";
    public C189058Yv A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final View A04;
    public final AbstractC018607g A05;
    public final GridLayoutManager A06;
    public final C8SF A07;
    public final UserSession A08;
    public final Jo5 A09;
    public final InterfaceC186138Nh A0A;
    public final MQR A0B;
    public final String A0C;
    public final java.util.Set A0D;

    public C48595LeX(Context context, ViewGroup viewGroup, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC186138Nh interfaceC186138Nh, MQR mqr, int i) {
        C14360o3.A0B(userSession, 2);
        AbstractC167007dF.A1F(abstractC018607g, 3, viewGroup);
        this.A03 = context;
        this.A08 = userSession;
        this.A05 = abstractC018607g;
        this.A0A = interfaceC186138Nh;
        this.A0B = mqr;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3);
        this.A06 = gridLayoutManager;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        this.A0D = A0l;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.afi_margin_top);
        this.A02 = dimensionPixelSize;
        View requireViewById = viewGroup.requireViewById(R.id.gallery_sticker_grid_container);
        this.A04 = requireViewById;
        int i2 = (i - (dimensionPixelSize * 2)) / 3;
        int A01 = C1H4.A01(i2 / 0.5625f);
        C8SF c8sf = new C8SF(context, userSession, C05F.A00, i2, A01, false);
        this.A07 = c8sf;
        Jo5 jo5 = new Jo5(c8sf, this, null, A01, true);
        jo5.setHasStableIds(true);
        this.A09 = jo5;
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(requireViewById, R.id.gallery_sticker_grid_recycler_view);
        recyclerView.setAdapter(jo5);
        recyclerView.setLayoutManager(gridLayoutManager);
        C44286Jhc.A00(recyclerView, this, 5);
        recyclerView.setOverScrollMode(2);
        A0l.add(requireViewById);
        this.A0C = "story-sticker-gallery";
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void close() {
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A0D;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.MOO
    public final void DNt(Medium medium) {
        this.A0A.DIz(medium, this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A08, 36323556329532772L) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A08, 36323556329598309L) == false) goto L9;
     */
    @Override // X.MSD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E2K() {
        /*
            r7 = this;
            X.8Yv r0 = r7.A00
            r5 = 1
            if (r0 != 0) goto L21
            X.07g r2 = r7.A05
            X.8SF r1 = r7.A07
            X.8Yl r0 = new X.8Yl
            r0.<init>(r2, r1)
            r0.A09 = r5
            X.8Ys r4 = new X.8Ys
            r4.<init>(r0)
            X.Jo5 r3 = r7.A09
            android.content.Context r2 = r7.A03
            r1 = 0
            X.8Yv r0 = new X.8Yv
            r0.<init>(r2, r1, r3, r4)
            r7.A00 = r0
        L21:
            X.MQR r6 = r7.A0B
            boolean r0 = r6.CWS()
            if (r0 == 0) goto L39
            com.instagram.common.session.UserSession r3 = r7.A08
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323556329598309(0x810c1500012d65, double:3.0345015138348514E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L3a
        L39:
            r4 = 0
        L3a:
            boolean r0 = r6.CWM()
            if (r0 == 0) goto L50
            com.instagram.common.session.UserSession r3 = r7.A08
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323556329532772(0x810c1500002d64, double:3.0345015137934056E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L51
        L50:
            r1 = 0
        L51:
            boolean r0 = r6.CTa()
            if (r0 == 0) goto L5b
            if (r4 != 0) goto L5c
            if (r1 != 0) goto L5c
        L5b:
            r5 = 0
        L5c:
            r7.A01 = r5
            X.8Yv r3 = r7.A00
            java.lang.String r0 = "mediaLoaderController"
            if (r3 != 0) goto L6c
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L6c:
            if (r5 == 0) goto L7c
            X.8Ym r2 = X.EnumC188968Ym.A02
        L70:
            X.8Yy r1 = r3.A07
            X.8Ym r0 = r1.A02
            if (r0 == r2) goto L78
            r1.A02 = r2
        L78:
            r3.A07()
            return
        L7c:
            X.8Ym r2 = X.EnumC188968Ym.A04
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48595LeX.E2K():void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0C;
    }

    @Override // X.MSD
    public final boolean isScrolledToBottom() {
        return AbstractC110854yx.A02(this.A06);
    }

    @Override // X.MSD
    public final boolean isScrolledToTop() {
        return AbstractC110854yx.A03(this.A06);
    }
}
