package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.NLs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52523NLs extends AbstractC85543rj {
    public final /* synthetic */ C42520Irz A00;
    public final /* synthetic */ C63922vD A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52523NLs(C42520Irz c42520Irz, C63922vD c63922vD, int i) {
        super("", i, false);
        this.A01 = c63922vD;
        this.A00 = c42520Irz;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63922vD c63922vD = this.A01;
        C42520Irz c42520Irz = this.A00;
        C140966Yy A0r = AbstractC25225BEi.A0r(c63922vD.A02.requireActivity(), c63922vD.A03);
        IgFragmentFactoryImpl.A00();
        String str = c42520Irz.A01.A07;
        if (str == null) {
            str = "";
        }
        String string = c63922vD.A01.getResources().getString(2131963475);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, string, str));
        AbstractC31175DnJ.A0v(A0b, new AbstractC59962oe(), A0r);
    }
}
