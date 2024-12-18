package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NEq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52352NEq extends AbstractC66412zI {
    public final Context A00;
    public final FragmentActivity A01;
    public final AbstractC59962oe A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final String A06;

    public C52352NEq(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = abstractC59962oe;
        this.A03 = interfaceC11380iw;
        this.A05 = interfaceC60442pS;
        this.A06 = str;
        this.A00 = abstractC59962oe.requireContext();
        this.A01 = abstractC59962oe.requireActivity();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C51346Mm7(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.pa_ad_code_row, false));
    }

    private final Drawable A00(List list) {
        Context context = this.A00;
        String moduleName = this.A03.getModuleName();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding);
        Integer num = C05F.A0C;
        UserSession userSession = this.A04;
        return AbstractC89513yr.A00(context, null, Float.valueOf(0.7f), num, null, null, null, null, moduleName, list, dimensionPixelSize, C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36325428935275586L), true, true, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        if (r8 != null) goto L26;
     */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r11, X.C3OO r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52352NEq.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56098OvI.class;
    }
}
