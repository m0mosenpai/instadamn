package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KIA extends AbstractC66412zI {
    public final float A00;
    public final MOC A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44711Jqu(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_grid_item_layout, false), this.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r14, X.C3OO r15) {
        /*
            r13 = this;
            X.Wh6 r14 = (X.C70793Wh6) r14
            X.Jqu r15 = (X.C44711Jqu) r15
            X.AbstractC167017dG.A1N(r14, r15)
            com.instagram.common.session.UserSession r7 = r13.A03
            java.lang.String r10 = r14.A03
            com.instagram.common.typedurl.ImageUrl r9 = r14.A02
            X.VDG r12 = r14.A01
            boolean r11 = r14.A05
            X.0iw r0 = r13.A02
            X.MOC r8 = r13.A01
            boolean r6 = r14.A04
            int r5 = r14.A00
            r4 = 0
            X.C14360o3.A0B(r7, r4)
            r3 = 3
            r2 = 9
            X.AbstractC167017dG.A1T(r0, r8)
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r15.A03
            r1.setUrl(r9, r0)
            int r0 = r12.ordinal()
            if (r0 == r3) goto L7c
            if (r0 == r2) goto L79
            r1.A0H()
        L33:
            if (r11 == 0) goto L77
            X.6vH r0 = X.EnumC153476vH.A06
        L37:
            r1.setMediaOverlay(r0)
            X.ViewOnClickListenerC48069LPu.A00(r1, r8, r9, r10, r3)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321310061634875(0x810a0a0000253b, double:3.0330809649297807E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L64
            androidx.cardview.widget.CardView r0 = r15.A01
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r15.A02
            if (r6 == 0) goto L71
            r1.setVisibility(r4)
        L56:
            android.widget.TextView r2 = r15.A00
            r2.setVisibility(r4)
            if (r5 < r3) goto L65
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L61:
            r2.setText(r0)
        L64:
            return
        L65:
            android.content.Context r1 = X.AbstractC31172DnG.A05(r15)
            r0 = 2131966119(0x7f1338a7, float:1.9569067E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r1, r0)
            goto L61
        L71:
            r0 = 8
            r1.setVisibility(r0)
            goto L56
        L77:
            r0 = 0
            goto L37
        L79:
            X.6vG r0 = X.EnumC153466vG.A08
            goto L7e
        L7c:
            X.6vG r0 = X.EnumC153466vG.A0N
        L7e:
            r1.setIcon(r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIA.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70793Wh6.class;
    }

    public KIA(MOC moc, InterfaceC11380iw interfaceC11380iw, UserSession userSession, float f) {
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = moc;
        this.A00 = f;
    }
}
