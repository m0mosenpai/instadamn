package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class GV0 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC1119353f A03;
    public final /* synthetic */ C6WQ A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GV0(Context context, Fragment fragment, UserSession userSession, InterfaceC1119353f interfaceC1119353f, C6WQ c6wq, String str, String str2) {
        super(1);
        this.A01 = fragment;
        this.A04 = c6wq;
        this.A02 = userSession;
        this.A00 = context;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = interfaceC1119353f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        ?? A0Z = AbstractC166997dE.A0Z(obj);
        Fragment fragment = this.A01;
        if (!AbstractC34290FAk.A00(fragment)) {
            AbstractC31176DnK.A10(this.A04);
            UserSession userSession = this.A02;
            FragmentActivity requireActivity = fragment.requireActivity();
            Context context = this.A00;
            String str2 = this.A05;
            String str3 = this.A06;
            try {
                A0Z = A0Z.getCanonicalPath();
                str = A0Z;
            } catch (IOException e) {
                C0w9.A06(AnonymousClass001.A0R(str3, "_reshareToStory"), AbstractC111324zv.A00(1606), e);
                str = A0Z.getAbsolutePath();
            }
            C14360o3.A0A(str);
            InterfaceC1119353f interfaceC1119353f = this.A03;
            Bundle A00 = AbstractC61636Rr0.A00(AbstractC167007dF.A1b(AbstractC111324zv.A00(1759), str, AbstractC166987dD.A1L(AbstractC111324zv.A00(1758), C22P.A2V), AbstractC166987dD.A1L(AbstractC111324zv.A00(1760), str2)));
            if (AbstractC25351Lp.A03(userSession)) {
                C38321qM A0h = AbstractC25229BEm.A0h(userSession, str2);
                if (A0h != null) {
                    AbstractC70197WGf.A05(requireActivity, A0h.A1q(requireActivity), new G0J(3, requireActivity, context, A00, userSession, interfaceC1119353f), C50472Tr.A01(), AbstractC167007dF.A09(context, R.attr.igds_color_media_background), true);
                }
            } else {
                C6XJ A02 = C6XJ.A02(requireActivity, A00, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(1215));
                A02.A0E(interfaceC1119353f);
                A02.A0C(context);
            }
        }
        return C0eB.A00;
    }
}
