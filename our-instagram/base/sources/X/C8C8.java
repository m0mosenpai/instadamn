package X;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.8C8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8C8 extends C2UU implements C8C2 {
    public boolean A01;
    public final GalleryPickerServiceDataSource A03;
    public final UserSession A04;
    public final C183498Bw A05;
    public final C8C2 A06;
    public final C83E A07;
    public final C2UY A08 = C2UY.A01;
    public int A00 = -1;
    public final Handler A02 = new Handler(Looper.getMainLooper());

    @Override // X.C8C2
    public final void DCw(View view) {
        AbstractC13880nE.A0r(view, new RunnableC24634AvU(view, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r9 != 0) goto L6;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r8, int r9) {
        /*
            r7 = this;
            X.9UW r8 = (X.C9UW) r8
            boolean r0 = r7.A01
            if (r0 == 0) goto La
            r0 = 0
            r6 = 1
            if (r9 == r0) goto Lb
        La:
            r6 = 0
        Lb:
            r5 = 2131099780(0x7f060084, float:1.7811923E38)
            r4 = 2131237438(0x7f081a3e, float:1.8091126E38)
            com.instagram.common.session.UserSession r3 = r8.A01
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327533469383327(0x810fb300023a9f, double:3.037016673049553E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L2a
            r5 = 2131100036(0x7f060184, float:1.7812442E38)
            r4 = 2131237439(0x7f081a3f, float:1.8091128E38)
        L2a:
            com.instagram.common.ui.base.IgTextView r2 = r8.A02
            android.view.View r0 = r8.A00
            android.content.Context r1 = r0.getContext()
            if (r6 != 0) goto L37
            r4 = 2131237440(0x7f081a40, float:1.809113E38)
        L37:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r4)
            r2.setBackground(r0)
            if (r6 != 0) goto L43
            r5 = 2131100036(0x7f060184, float:1.7812442E38)
        L43:
            int r0 = r1.getColor(r5)
            r2.setTextColor(r0)
            android.view.View r2 = r8.A00
            int r1 = r2.getWidth()
            int r0 = r7.A00
            if (r1 == r0) goto L5d
            int r0 = r2.getWidth()
            r7.A00 = r0
            r7.DCw(r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8C8.onBindViewHolder(X.3OO, int):void");
    }

    public C8C8(GalleryPickerServiceDataSource galleryPickerServiceDataSource, UserSession userSession, C183498Bw c183498Bw, C8C2 c8c2, C83E c83e) {
        this.A07 = c83e;
        this.A05 = c183498Bw;
        this.A06 = c8c2;
        this.A03 = galleryPickerServiceDataSource;
        this.A04 = userSession;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        C0f9.A0A(888802640, C0f9.A03(-835443584));
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.3OO, X.9UW] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.generic_effect_picker_text_tile, viewGroup, false);
        if (this.A00 == -1 && inflate != null) {
            AbstractC13880nE.A0q(inflate, new RunnableC24633AvT(inflate, this));
        }
        C83E c83e = this.A07;
        C183498Bw c183498Bw = this.A05;
        UserSession userSession = this.A04;
        ?? c3oo = new C3OO(inflate);
        c3oo.A01 = userSession;
        c3oo.A00 = inflate;
        IgTextView igTextView = (IgTextView) inflate.requireViewById(R.id.effect_picker_button_text_view);
        c3oo.A02 = igTextView;
        c3oo.A04 = c83e;
        c3oo.A03 = this;
        View view = c3oo.A00;
        if (view != null && igTextView != null && c183498Bw != null) {
            C0fQ.A00(new ARO(c183498Bw, c3oo), view);
        }
        GalleryPickerServiceDataSource galleryPickerServiceDataSource = this.A03;
        if (galleryPickerServiceDataSource != 0) {
            galleryPickerServiceDataSource.setGalleryPickerServiceListener(c3oo);
        }
        return c3oo;
    }
}
