package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gtr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38355Gtr extends C2UU {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final ILY A02;
    public final List A03;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r2 != com.instagram.api.schemas.UnlockableStickerStatus.A05) goto L16;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r6, int r7) {
        /*
            r5 = this;
            X.Gvp r6 = (X.C38468Gvp) r6
            java.util.List r0 = r5.A03
            if (r0 == 0) goto L5e
            java.lang.Object r4 = r0.get(r7)
            com.instagram.api.schemas.StoryUnlockableStickerData r4 = (com.instagram.api.schemas.StoryUnlockableStickerData) r4
            if (r4 == 0) goto L5e
            com.instagram.api.schemas.ImageURIDict r0 = r4.C83()
            if (r0 == 0) goto L27
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r6.A02
            com.instagram.api.schemas.ImageURIDict r0 = r4.C83()
            java.lang.String r0 = r0.getUri()
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.AbstractC25225BEi.A0t(r0)
            X.0iw r0 = r5.A00
            r2.setUrl(r1, r0)
        L27:
            android.widget.TextView r1 = r6.A01
            java.lang.String r0 = r4.getName()
            r1.setText(r0)
            com.instagram.igds.components.button.IgdsButton r3 = r6.A03
            java.lang.String r0 = r4.getId()
            if (r0 == 0) goto L53
            com.instagram.common.session.UserSession r0 = r5.A01
            X.WhP r0 = X.C70809WhP.A00(r0)
            java.lang.String r1 = r4.getId()
            java.util.Map r0 = r0.A00
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto L4c
            com.instagram.api.schemas.UnlockableStickerStatus r2 = com.instagram.api.schemas.UnlockableStickerStatus.A04
        L4c:
            com.instagram.api.schemas.UnlockableStickerStatus r1 = com.instagram.api.schemas.UnlockableStickerStatus.A05
            r0 = 2131976169(0x7f135fe9, float:1.958945E38)
            if (r2 == r1) goto L56
        L53:
            r0 = 2131976168(0x7f135fe8, float:1.9589449E38)
        L56:
            r3.setText(r0)
            r0 = 39
            X.ViewOnClickListenerC42034Ik3.A00(r3, r0, r5, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38355Gtr.onBindViewHolder(X.3OO, int):void");
    }

    public C38355Gtr(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ILY ily, List list) {
        this.A02 = ily;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = list;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int A03 = C0f9.A03(315510208);
        List list = this.A03;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        C0f9.A0A(-2024288590, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C38468Gvp(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.unlockable_sticker_attribution_sheet_row));
    }
}
