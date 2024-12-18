package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.IfI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41802IfI implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;

    public DialogInterfaceOnClickListenerC41802IfI(Context context, UserSession userSession, C38321qM c38321qM) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c38321qM;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        C38321qM c38321qM = this.A02;
        C6WQ A0i = AbstractC31174DnI.A0i(context);
        Activity activity = (Activity) AbstractC167197dY.A00(context, Activity.class);
        if (activity != null) {
            A0i.setOwnerActivity(activity);
        }
        String A0p = AbstractC166997dE.A0p(context, 2131965077);
        int i2 = 2131965078;
        if (ProductType.CLIPS == c38321qM.A1z()) {
            i2 = 2131965079;
        }
        C76833cV.A04(userSession, c38321qM, A0i, C38839H8n.class, C41273IOo.class, "remove_coauthor_attribution/", A0p, new ME8(c38321qM, userSession, A0i, AbstractC166997dE.A0p(context, i2), 16));
    }
}
