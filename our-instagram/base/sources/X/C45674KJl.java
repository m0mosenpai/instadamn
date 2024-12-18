package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;

/* renamed from: X.KJl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45674KJl extends AbstractC66422zJ {
    public final C47927LEw A00;

    public C45674KJl(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgSimpleImageView igSimpleImageView, C45510KCz c45510KCz, QuickSnapReactionEmitterView quickSnapReactionEmitterView, C19L c19l, int i) {
        AbstractC25233BEq.A0w(2, userSession, igSimpleImageView, quickSnapReactionEmitterView);
        this.A00 = new C47927LEw(interfaceC11380iw, userSession, igSimpleImageView, c45510KCz, quickSnapReactionEmitterView, c19l, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r4 >= 0) goto L11;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r8, X.C3OO r9) {
        /*
            r7 = this;
            X.LZV r8 = (X.LZV) r8
            X.Jri r9 = (X.C44761Jri) r9
            X.AbstractC167017dG.A1N(r8, r9)
            X.LEw r3 = r7.A00
            X.KKz r0 = r9.A00()
            if (r0 == 0) goto L12
            r0.A0I()
        L12:
            android.widget.FrameLayout r0 = r9.A01
            r0.removeAllViews()
            java.util.List r5 = r8.A01
            java.util.Iterator r6 = r5.iterator()
            r4 = 0
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r6.next()
            X.BgF r0 = (X.C26086BgF) r0
            X.KCz r2 = r3.A02
            java.lang.String r1 = r0.A04
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.3CY r0 = X.C45510KCz.A03(r2)
            X.O8R r0 = r0.A04
            java.util.Set r0 = r0.A01
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L58
            if (r4 < 0) goto L5b
        L44:
            r1 = 0
        L45:
            int r0 = r1 + r4
            X.C47927LEw.A00(r8, r9, r3, r0)
            int r1 = r1 + 1
            r0 = 3
            if (r1 < r0) goto L45
            android.view.View r0 = r9.itemView
            r0.setTag(r9)
            r9.A01()
            return
        L58:
            int r4 = r4 + 1
            goto L1e
        L5b:
            int r4 = r5.size()
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45674KJl.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZV.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44761Jri c44761Jri = (C44761Jri) c3oo;
        C14360o3.A0B(c44761Jri, 0);
        C47927LEw c47927LEw = this.A00;
        C45696KKz A00 = c44761Jri.A00();
        if (A00 != null) {
            A00.A04 = false;
            A00.A0I();
        }
        c47927LEw.A01.clearAnimation();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        C47927LEw c47927LEw = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.quick_snap_consumption_viewer_item_container, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(1));
        return new C44761Jri((FrameLayout) inflate, c47927LEw.A02);
    }
}
