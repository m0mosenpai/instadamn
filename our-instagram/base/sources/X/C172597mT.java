package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172597mT extends AbstractC65632xz {
    public final UserSession A00;
    public final InterfaceC186078Nb A01;
    public final List A02;
    public final boolean A03;

    public C172597mT(UserSession userSession, InterfaceC186078Nb interfaceC186078Nb, boolean z) {
        this.A00 = userSession;
        this.A01 = interfaceC186078Nb;
        this.A03 = z;
        float[] fArr = new float[10];
        int i = 0;
        do {
            fArr[i] = C17s.A04(AbstractC50712Us.A00, new C17u(-2, 2));
            i++;
        } while (i < 10);
        this.A02 = new C024409s(fArr);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0175, code lost:
    
        if (r0 != false) goto L8;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r25, android.view.View r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172597mT.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1681877595);
        C14360o3.A0B(viewGroup, 1);
        UserSession userSession = this.A00;
        ABE abe = A3U.A00;
        C14360o3.A0B(userSession, 1);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_horizontal_container, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4));
        LinearLayout linearLayout = (LinearLayout) inflate;
        C14360o3.A0A(context);
        C14360o3.A0B(context, 0);
        int dimensionPixelSize = (int) (context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin) * AbstractC172687md.A00(userSession));
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        linearLayout.setGravity(1);
        C22873A6t c22873A6t = new C22873A6t(linearLayout);
        int i2 = 0;
        while (true) {
            boolean z = true;
            do {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.layout_sticker_sheet_redesign_item, viewGroup, false);
                if (z) {
                    layoutParams.setMarginEnd((int) (context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material) * AbstractC172687md.A00(userSession)));
                }
                inflate2.setLayoutParams(layoutParams);
                inflate2.setFocusable(true);
                inflate2.setTag(new C210979Uu(inflate2));
                c22873A6t.A01.add(inflate2);
                linearLayout.addView(inflate2);
                i2++;
                if (i2 < 8) {
                    z = false;
                } else {
                    linearLayout.setTag(c22873A6t);
                    C0f9.A0A(1129249570, A03);
                    return linearLayout;
                }
            } while (i2 >= 7);
        }
    }
}
