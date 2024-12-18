package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V3Q extends AbstractC168697g3 {
    public final Context A00;
    public final LayoutInflater A01;
    public final UserSession A02;
    public final C68107VBl A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V3Q(Context context, UserSession userSession, C68107VBl c68107VBl) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = c68107VBl;
        this.A01 = LayoutInflater.from(context);
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        String str;
        int A03 = C0f9.A03(190855775);
        if (view == null) {
            view = this.A01.inflate(R.layout.self_remediation_report_row, (ViewGroup) null);
            view.setTag(new C69032VgR(view));
        }
        Context context = this.A00;
        C69032VgR c69032VgR = (C69032VgR) AbstractC31172DnG.A0x(view);
        VDQ vdq = (VDQ) obj;
        C68107VBl c68107VBl = this.A03;
        if (c68107VBl.A05 == null) {
            str = "reportingLogger";
        } else if (c68107VBl.A03 == null) {
            str = "commenterUser";
        } else {
            WNS.A00(c69032VgR.A00, 44, c68107VBl);
            AbstractC31173DnH.A19(context.getResources(), c69032VgR.A01, vdq.A00);
            C0f9.A0A(662967318, A03);
            return view;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
